// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: faas/v1/faas.proto

package io.nitric.proto.faas.v1;

public interface ServerMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.faas.v1.ServerMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Server message ID, used to pair requests/responses
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Server message ID, used to pair requests/responses
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Server responding
   * with client configuration details to an
   * InitRequest
   * </pre>
   *
   * <code>.nitric.faas.v1.InitResponse init_response = 2;</code>
   * @return Whether the initResponse field is set.
   */
  boolean hasInitResponse();
  /**
   * <pre>
   * Server responding
   * with client configuration details to an
   * InitRequest
   * </pre>
   *
   * <code>.nitric.faas.v1.InitResponse init_response = 2;</code>
   * @return The initResponse.
   */
  io.nitric.proto.faas.v1.InitResponse getInitResponse();
  /**
   * <pre>
   * Server responding
   * with client configuration details to an
   * InitRequest
   * </pre>
   *
   * <code>.nitric.faas.v1.InitResponse init_response = 2;</code>
   */
  io.nitric.proto.faas.v1.InitResponseOrBuilder getInitResponseOrBuilder();

  /**
   * <pre>
   * Server requesting client to
   * process a trigger
   * </pre>
   *
   * <code>.nitric.faas.v1.TriggerRequest trigger_request = 3;</code>
   * @return Whether the triggerRequest field is set.
   */
  boolean hasTriggerRequest();
  /**
   * <pre>
   * Server requesting client to
   * process a trigger
   * </pre>
   *
   * <code>.nitric.faas.v1.TriggerRequest trigger_request = 3;</code>
   * @return The triggerRequest.
   */
  io.nitric.proto.faas.v1.TriggerRequest getTriggerRequest();
  /**
   * <pre>
   * Server requesting client to
   * process a trigger
   * </pre>
   *
   * <code>.nitric.faas.v1.TriggerRequest trigger_request = 3;</code>
   */
  io.nitric.proto.faas.v1.TriggerRequestOrBuilder getTriggerRequestOrBuilder();

  public io.nitric.proto.faas.v1.ServerMessage.ContentCase getContentCase();
}
