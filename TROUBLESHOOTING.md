# Troubleshooting

## ALPN is not configured properly

If you see exceptions related to `ALPN is not configured properly`, such as:

```
Caused by: java.lang.IllegalArgumentException: ALPN is not configured properly. See https://github.com/grpc/grpc-java/blob/master/SECURITY.md#troubleshooting for more information.
```

Please use the [compatibility checker](https://github.com/googleapis/google-cloud-java/tree/master/google-cloud-util/google-cloud-compat-checker) to see if your environment is compatible with grpc-based clients. The incompatibility can mean that:
- You are not on a [supported platform](https://github.com/googleapis/google-cloud-java/#supported-platforms).
- There are classpath conflicts with `netty`.
- Or, you are seeing any of the conflicts specified in [gRPC Troubleshooting guide](https://github.com/grpc/grpc-java/blob/master/SECURITY.md#troubleshooting).

If you are using `google-cloud-java` packages prior to version 0.35.0, then consider upgrading to gRPC 1.9.0 or newer and use `grpc-netty-shaded` dependency, for example:

```
<properties>
  <grpc.version>1.9.0</grpc.version>
</properties>

<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>io.grpc</groupId>
      <artifactId>grpc-core</artifactId>
      <version>${grpc.version}</version>
    </dependency>
    <!-- grpc-netty-shaded version must be the same as other gRPC dependencies, such as grpc-core -->
    <dependency>
      <groupId>io.grpc</groupId>
      <artifactId>grpc-netty-shaded</artifactId>
      <version>${grpc.version}</version>
    </dependency>
  </dependencies>
</dependencyManagement>
```

The `grpc-netty-shaded` dependency avoids conflicts with other `netty` dependencies that may also be in the classpath.

If you are using `google-cloud-java` version 0.35.0 or above, then it already uses `grpc-netty-shaded`.
If you are still running into `ALPN` related problems, please see
[gRPC Troubleshooting guide](https://github.com/grpc/grpc-java/blob/master/SECURITY.md#troubleshooting)
for other causes.

## ClassNotFoundException, NoSuchMethodError, NoClassDefFoundError

These errors are usually caused by having multiple versions or conflicting versions of the same dependency in the classpath.
Usually these dependency conflicts occur with `guava` or `protobuf-java`.

There may be multiple sources for classpath conflicts:
- Multiple versions of the same transitive dependency in the dependency tree
- Your runtime classpath has different versions of dependencies than what you specified in the build

For example, if you have a direct or a transitive dependency on Guava version 19.0, 
and `google-cloud-java` uses Guava version 28.1, 
then `google-cloud-java` could be using Guava methods that don't exist in Guava 19.0,
and cause `NoSuchMethodError`.

Similarily, if your classpath has an older version of `protobuf-java`, 
but `google-cloud-java` requires a newer version,
 then you may see `NoClassDefFoundError` that fails to initialize `google-cloud-java` classes, e.g.:

```
java.lang.NoClassDefFoundError: Could not initialize class com.google.pubsub.v1.PubsubMessage$AttributesDefaultEntryHolder
```

### Validate the conflict

Check the dependency tree to see if you have multiple versions of the same dependencies, e.g.:

```
$ mvn dependency:tree
```

Look for versions of potentially conflicting dependencies like `guava`, `protobuf-java`, etc.

If you experience the error only during runtime, then your runtime environment
might  be introducing conflicting JARs into your runtime classpath. A typical case
is that Hadoop, Spark, or other server software that your application runs on
has conflicting versions `netty`, `guava`, or `protobuf-java` JARs in the classpath.

### Detecting conflicts during build

To detect dependency linkage errors at compile time, add the 
[Linkage Checker Enforcer Rule](https://github.com/GoogleCloudPlatform/cloud-opensource-java/tree/master/enforcer-rules)
in your pom.xml:

```
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-enforcer-plugin</artifactId>
        <version>3.0.0-M2</version>
        <dependencies>
          <dependency>
            <groupId>com.google.cloud.tools</groupId>
            <artifactId>linkage-checker-enforcer-rules</artifactId>
            <version>1.0.0</version>
          </dependency>
        </dependencies>
        <executions>
          <execution>
            <id>enforce-linkage-checker</id>
            <!-- Important! Should run after compile -->
            <phase>verify</phase>
            <goals>
              <goal>enforce</goal>
            </goals>
            <configuration>
              <rules>
                <LinkageCheckerRule
                    implementation="com.google.cloud.tools.dependencies.enforcer.LinkageCheckerRule"/>
              </rules>
            </configuration>
          </execution>
        </executions>
      </plugin>
```

There is no way to detect runtime classpath conflicts though. You need to be fully
aware of which JARs/classes are included in the runtime classpath
as every server environment is different.

### Resolving the conflict

There are different strategies to resolve conflicts, but you must understand the root cause of the conflicts, e.g.:
- If you have control over the dependency tree and you have the option to upgrade
  offending dependencies (e.g., upgrading Guava version), then this is the easiest route.
- If you don't have control over the dependency tree 
  or changing dependency versions causes other failures, 
  consider [shading dependencies](https://maven.apache.org/plugins/maven-shade-plugin/)
  that conflict with `google-cloud-java`.

For example, to shade `guava` and `protobuf-java`:

```
<plugin>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-shade-plugin</artifactId>
  <version>...</version>
  <executions>
    <execution>
      <phase>package</phase>
      <goals>
        <goal>shade</goal>
      </goals>
      <configuration>
        <keepDependenciesWithProvidedScope>false</keepDependenciesWithProvidedScope>
        <relocations>
          <!-- move protobuf to a shaded package -->
          <relocation>
            <pattern>com.google.protobuf</pattern>
            <shadedPattern>myapp.shaded.com.google.protobuf</shadedPattern>
          </relocation>
          <!-- move Guava to a shaded package -->
          <relocation>
            <pattern>com.google.common</pattern>
            <shadedPattern>myapp.shaded.com.google.common</shadedPattern>
          </relocation>
        </relocations>
      </configuration>
    </execution>
  </executions>
</plugin>
```
