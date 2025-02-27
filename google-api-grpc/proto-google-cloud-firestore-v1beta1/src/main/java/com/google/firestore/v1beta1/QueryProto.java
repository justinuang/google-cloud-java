// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1beta1/query.proto

package com.google.firestore.v1beta1;

public final class QueryProto {
  private QueryProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_StructuredQuery_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_StructuredQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_StructuredQuery_CollectionSelector_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_StructuredQuery_CollectionSelector_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_StructuredQuery_Filter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_StructuredQuery_Filter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_StructuredQuery_CompositeFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_StructuredQuery_CompositeFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_StructuredQuery_FieldFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_StructuredQuery_FieldFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_StructuredQuery_UnaryFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_StructuredQuery_UnaryFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_StructuredQuery_Order_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_StructuredQuery_Order_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_StructuredQuery_FieldReference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_StructuredQuery_FieldReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_StructuredQuery_Projection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_StructuredQuery_Projection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_Cursor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_Cursor_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n$google/firestore/v1beta1/query.proto\022\030"
          + "google.firestore.v1beta1\032\'google/firesto"
          + "re/v1beta1/document.proto\032\036google/protob"
          + "uf/wrappers.proto\032\034google/api/annotation"
          + "s.proto\"\271\017\n\017StructuredQuery\022D\n\006select\030\001 "
          + "\001(\01324.google.firestore.v1beta1.Structure"
          + "dQuery.Projection\022J\n\004from\030\002 \003(\0132<.google"
          + ".firestore.v1beta1.StructuredQuery.Colle"
          + "ctionSelector\022?\n\005where\030\003 \001(\01320.google.fi"
          + "restore.v1beta1.StructuredQuery.Filter\022A"
          + "\n\010order_by\030\004 \003(\0132/.google.firestore.v1be"
          + "ta1.StructuredQuery.Order\0222\n\010start_at\030\007 "
          + "\001(\0132 .google.firestore.v1beta1.Cursor\0220\n"
          + "\006end_at\030\010 \001(\0132 .google.firestore.v1beta1"
          + ".Cursor\022\016\n\006offset\030\006 \001(\005\022*\n\005limit\030\005 \001(\0132\033"
          + ".google.protobuf.Int32Value\032D\n\022Collectio"
          + "nSelector\022\025\n\rcollection_id\030\002 \001(\t\022\027\n\017all_"
          + "descendants\030\003 \001(\010\032\214\002\n\006Filter\022U\n\020composit"
          + "e_filter\030\001 \001(\01329.google.firestore.v1beta"
          + "1.StructuredQuery.CompositeFilterH\000\022M\n\014f"
          + "ield_filter\030\002 \001(\01325.google.firestore.v1b"
          + "eta1.StructuredQuery.FieldFilterH\000\022M\n\014un"
          + "ary_filter\030\003 \001(\01325.google.firestore.v1be"
          + "ta1.StructuredQuery.UnaryFilterH\000B\r\n\013fil"
          + "ter_type\032\323\001\n\017CompositeFilter\022N\n\002op\030\001 \001(\016"
          + "2B.google.firestore.v1beta1.StructuredQu"
          + "ery.CompositeFilter.Operator\022A\n\007filters\030"
          + "\002 \003(\01320.google.firestore.v1beta1.Structu"
          + "redQuery.Filter\"-\n\010Operator\022\030\n\024OPERATOR_"
          + "UNSPECIFIED\020\000\022\007\n\003AND\020\001\032\354\002\n\013FieldFilter\022G"
          + "\n\005field\030\001 \001(\01328.google.firestore.v1beta1"
          + ".StructuredQuery.FieldReference\022J\n\002op\030\002 "
          + "\001(\0162>.google.firestore.v1beta1.Structure"
          + "dQuery.FieldFilter.Operator\022.\n\005value\030\003 \001"
          + "(\0132\037.google.firestore.v1beta1.Value\"\227\001\n\010"
          + "Operator\022\030\n\024OPERATOR_UNSPECIFIED\020\000\022\r\n\tLE"
          + "SS_THAN\020\001\022\026\n\022LESS_THAN_OR_EQUAL\020\002\022\020\n\014GRE"
          + "ATER_THAN\020\003\022\031\n\025GREATER_THAN_OR_EQUAL\020\004\022\t"
          + "\n\005EQUAL\020\005\022\022\n\016ARRAY_CONTAINS\020\007\032\363\001\n\013UnaryF"
          + "ilter\022J\n\002op\030\001 \001(\0162>.google.firestore.v1b"
          + "eta1.StructuredQuery.UnaryFilter.Operato"
          + "r\022I\n\005field\030\002 \001(\01328.google.firestore.v1be"
          + "ta1.StructuredQuery.FieldReferenceH\000\"=\n\010"
          + "Operator\022\030\n\024OPERATOR_UNSPECIFIED\020\000\022\n\n\006IS"
          + "_NAN\020\002\022\013\n\007IS_NULL\020\003B\016\n\014operand_type\032\230\001\n\005"
          + "Order\022G\n\005field\030\001 \001(\01328.google.firestore."
          + "v1beta1.StructuredQuery.FieldReference\022F"
          + "\n\tdirection\030\002 \001(\01623.google.firestore.v1b"
          + "eta1.StructuredQuery.Direction\032$\n\016FieldR"
          + "eference\022\022\n\nfield_path\030\002 \001(\t\032V\n\nProjecti"
          + "on\022H\n\006fields\030\002 \003(\01328.google.firestore.v1"
          + "beta1.StructuredQuery.FieldReference\"E\n\t"
          + "Direction\022\031\n\025DIRECTION_UNSPECIFIED\020\000\022\r\n\t"
          + "ASCENDING\020\001\022\016\n\nDESCENDING\020\002\"I\n\006Cursor\022/\n"
          + "\006values\030\001 \003(\0132\037.google.firestore.v1beta1"
          + ".Value\022\016\n\006before\030\002 \001(\010B\270\001\n\034com.google.fi"
          + "restore.v1beta1B\nQueryProtoP\001ZAgoogle.go"
          + "lang.org/genproto/googleapis/firestore/v"
          + "1beta1;firestore\242\002\004GCFS\252\002\036Google.Cloud.F"
          + "irestore.V1Beta1\312\002\036Google\\Cloud\\Firestor"
          + "e\\V1beta1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.firestore.v1beta1.DocumentProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        },
        assigner);
    internal_static_google_firestore_v1beta1_StructuredQuery_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_firestore_v1beta1_StructuredQuery_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_StructuredQuery_descriptor,
            new java.lang.String[] {
              "Select", "From", "Where", "OrderBy", "StartAt", "EndAt", "Offset", "Limit",
            });
    internal_static_google_firestore_v1beta1_StructuredQuery_CollectionSelector_descriptor =
        internal_static_google_firestore_v1beta1_StructuredQuery_descriptor.getNestedTypes().get(0);
    internal_static_google_firestore_v1beta1_StructuredQuery_CollectionSelector_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_StructuredQuery_CollectionSelector_descriptor,
            new java.lang.String[] {
              "CollectionId", "AllDescendants",
            });
    internal_static_google_firestore_v1beta1_StructuredQuery_Filter_descriptor =
        internal_static_google_firestore_v1beta1_StructuredQuery_descriptor.getNestedTypes().get(1);
    internal_static_google_firestore_v1beta1_StructuredQuery_Filter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_StructuredQuery_Filter_descriptor,
            new java.lang.String[] {
              "CompositeFilter", "FieldFilter", "UnaryFilter", "FilterType",
            });
    internal_static_google_firestore_v1beta1_StructuredQuery_CompositeFilter_descriptor =
        internal_static_google_firestore_v1beta1_StructuredQuery_descriptor.getNestedTypes().get(2);
    internal_static_google_firestore_v1beta1_StructuredQuery_CompositeFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_StructuredQuery_CompositeFilter_descriptor,
            new java.lang.String[] {
              "Op", "Filters",
            });
    internal_static_google_firestore_v1beta1_StructuredQuery_FieldFilter_descriptor =
        internal_static_google_firestore_v1beta1_StructuredQuery_descriptor.getNestedTypes().get(3);
    internal_static_google_firestore_v1beta1_StructuredQuery_FieldFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_StructuredQuery_FieldFilter_descriptor,
            new java.lang.String[] {
              "Field", "Op", "Value",
            });
    internal_static_google_firestore_v1beta1_StructuredQuery_UnaryFilter_descriptor =
        internal_static_google_firestore_v1beta1_StructuredQuery_descriptor.getNestedTypes().get(4);
    internal_static_google_firestore_v1beta1_StructuredQuery_UnaryFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_StructuredQuery_UnaryFilter_descriptor,
            new java.lang.String[] {
              "Op", "Field", "OperandType",
            });
    internal_static_google_firestore_v1beta1_StructuredQuery_Order_descriptor =
        internal_static_google_firestore_v1beta1_StructuredQuery_descriptor.getNestedTypes().get(5);
    internal_static_google_firestore_v1beta1_StructuredQuery_Order_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_StructuredQuery_Order_descriptor,
            new java.lang.String[] {
              "Field", "Direction",
            });
    internal_static_google_firestore_v1beta1_StructuredQuery_FieldReference_descriptor =
        internal_static_google_firestore_v1beta1_StructuredQuery_descriptor.getNestedTypes().get(6);
    internal_static_google_firestore_v1beta1_StructuredQuery_FieldReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_StructuredQuery_FieldReference_descriptor,
            new java.lang.String[] {
              "FieldPath",
            });
    internal_static_google_firestore_v1beta1_StructuredQuery_Projection_descriptor =
        internal_static_google_firestore_v1beta1_StructuredQuery_descriptor.getNestedTypes().get(7);
    internal_static_google_firestore_v1beta1_StructuredQuery_Projection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_StructuredQuery_Projection_descriptor,
            new java.lang.String[] {
              "Fields",
            });
    internal_static_google_firestore_v1beta1_Cursor_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_firestore_v1beta1_Cursor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_Cursor_descriptor,
            new java.lang.String[] {
              "Values", "Before",
            });
    com.google.firestore.v1beta1.DocumentProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
