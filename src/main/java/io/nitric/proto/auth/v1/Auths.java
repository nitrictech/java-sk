// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth/v1/auth.proto

package io.nitric.proto.auth.v1;

public final class Auths {
  private Auths() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_auth_v1_UserCreateRequest_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_auth_v1_UserCreateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_auth_v1_UserCreateResponse_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_auth_v1_UserCreateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022auth/v1/auth.proto\022\016nitric.auth.v1\"P\n\021" +
      "UserCreateRequest\022\016\n\006tenant\030\001 \001(\t\022\n\n\002id\030" +
      "\002 \001(\t\022\r\n\005email\030\003 \001(\t\022\020\n\010password\030\004 \001(\t\"\024" +
      "\n\022UserCreateResponse2W\n\004User\022O\n\006Create\022!" +
      ".nitric.auth.v1.UserCreateRequest\032\".nitr" +
      "ic.auth.v1.UserCreateResponseB^\n\027io.nitr" +
      "ic.proto.auth.v1B\005AuthsP\001Z\014nitric/v1;v1\252" +
      "\002\024Nitric.Proto.Auth.v1\312\002\024Nitric\\Proto\\Au" +
      "th\\V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_nitric_auth_v1_UserCreateRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_nitric_auth_v1_UserCreateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_auth_v1_UserCreateRequest_descriptor,
        new java.lang.String[] { "Tenant", "Id", "Email", "Password", });
    internal_static_nitric_auth_v1_UserCreateResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_nitric_auth_v1_UserCreateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_auth_v1_UserCreateResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
