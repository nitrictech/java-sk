// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: queue/v1/queue.proto

package io.nitric.proto.queue.v1;

/*-
 * #%L
 * Nitric Java SDK
 * %%
 * Copyright (C) 2021 Nitric Pty Ltd
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/**
 * Protobuf type {@code nitric.queue.v1.QueueCompleteRequest}
 */
public final class QueueCompleteRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.queue.v1.QueueCompleteRequest)
    QueueCompleteRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueueCompleteRequest.newBuilder() to construct.
  private QueueCompleteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueueCompleteRequest() {
    queue_ = "";
    leaseId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueueCompleteRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueueCompleteRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            queue_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            leaseId_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.queue.v1.Queues.internal_static_nitric_queue_v1_QueueCompleteRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.queue.v1.Queues.internal_static_nitric_queue_v1_QueueCompleteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.queue.v1.QueueCompleteRequest.class, io.nitric.proto.queue.v1.QueueCompleteRequest.Builder.class);
  }

  public static final int QUEUE_FIELD_NUMBER = 1;
  private volatile java.lang.Object queue_;
  /**
   * <pre>
   * The nitric name for the queue
   *  this will automatically be resolved to the provider specific queue identifier.
   * </pre>
   *
   * <code>string queue = 1;</code>
   * @return The queue.
   */
  @java.lang.Override
  public java.lang.String getQueue() {
    java.lang.Object ref = queue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      queue_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The nitric name for the queue
   *  this will automatically be resolved to the provider specific queue identifier.
   * </pre>
   *
   * <code>string queue = 1;</code>
   * @return The bytes for queue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQueueBytes() {
    java.lang.Object ref = queue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      queue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LEASEID_FIELD_NUMBER = 2;
  private volatile java.lang.Object leaseId_;
  /**
   * <pre>
   * Lease id of the task to be completed
   * </pre>
   *
   * <code>string leaseId = 2;</code>
   * @return The leaseId.
   */
  @java.lang.Override
  public java.lang.String getLeaseId() {
    java.lang.Object ref = leaseId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      leaseId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Lease id of the task to be completed
   * </pre>
   *
   * <code>string leaseId = 2;</code>
   * @return The bytes for leaseId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLeaseIdBytes() {
    java.lang.Object ref = leaseId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      leaseId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getQueueBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, queue_);
    }
    if (!getLeaseIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, leaseId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getQueueBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, queue_);
    }
    if (!getLeaseIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, leaseId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.nitric.proto.queue.v1.QueueCompleteRequest)) {
      return super.equals(obj);
    }
    io.nitric.proto.queue.v1.QueueCompleteRequest other = (io.nitric.proto.queue.v1.QueueCompleteRequest) obj;

    if (!getQueue()
        .equals(other.getQueue())) return false;
    if (!getLeaseId()
        .equals(other.getLeaseId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + QUEUE_FIELD_NUMBER;
    hash = (53 * hash) + getQueue().hashCode();
    hash = (37 * hash) + LEASEID_FIELD_NUMBER;
    hash = (53 * hash) + getLeaseId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.queue.v1.QueueCompleteRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.queue.v1.QueueCompleteRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.queue.v1.QueueCompleteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.queue.v1.QueueCompleteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.queue.v1.QueueCompleteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.queue.v1.QueueCompleteRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.queue.v1.QueueCompleteRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.queue.v1.QueueCompleteRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.queue.v1.QueueCompleteRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.queue.v1.QueueCompleteRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.queue.v1.QueueCompleteRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.queue.v1.QueueCompleteRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.nitric.proto.queue.v1.QueueCompleteRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code nitric.queue.v1.QueueCompleteRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.queue.v1.QueueCompleteRequest)
      io.nitric.proto.queue.v1.QueueCompleteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.queue.v1.Queues.internal_static_nitric_queue_v1_QueueCompleteRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.queue.v1.Queues.internal_static_nitric_queue_v1_QueueCompleteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.queue.v1.QueueCompleteRequest.class, io.nitric.proto.queue.v1.QueueCompleteRequest.Builder.class);
    }

    // Construct using io.nitric.proto.queue.v1.QueueCompleteRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      queue_ = "";

      leaseId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.queue.v1.Queues.internal_static_nitric_queue_v1_QueueCompleteRequest_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.queue.v1.QueueCompleteRequest getDefaultInstanceForType() {
      return io.nitric.proto.queue.v1.QueueCompleteRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.queue.v1.QueueCompleteRequest build() {
      io.nitric.proto.queue.v1.QueueCompleteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.queue.v1.QueueCompleteRequest buildPartial() {
      io.nitric.proto.queue.v1.QueueCompleteRequest result = new io.nitric.proto.queue.v1.QueueCompleteRequest(this);
      result.queue_ = queue_;
      result.leaseId_ = leaseId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.nitric.proto.queue.v1.QueueCompleteRequest) {
        return mergeFrom((io.nitric.proto.queue.v1.QueueCompleteRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.queue.v1.QueueCompleteRequest other) {
      if (other == io.nitric.proto.queue.v1.QueueCompleteRequest.getDefaultInstance()) return this;
      if (!other.getQueue().isEmpty()) {
        queue_ = other.queue_;
        onChanged();
      }
      if (!other.getLeaseId().isEmpty()) {
        leaseId_ = other.leaseId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.nitric.proto.queue.v1.QueueCompleteRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.nitric.proto.queue.v1.QueueCompleteRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object queue_ = "";
    /**
     * <pre>
     * The nitric name for the queue
     *  this will automatically be resolved to the provider specific queue identifier.
     * </pre>
     *
     * <code>string queue = 1;</code>
     * @return The queue.
     */
    public java.lang.String getQueue() {
      java.lang.Object ref = queue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        queue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The nitric name for the queue
     *  this will automatically be resolved to the provider specific queue identifier.
     * </pre>
     *
     * <code>string queue = 1;</code>
     * @return The bytes for queue.
     */
    public com.google.protobuf.ByteString
        getQueueBytes() {
      java.lang.Object ref = queue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        queue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The nitric name for the queue
     *  this will automatically be resolved to the provider specific queue identifier.
     * </pre>
     *
     * <code>string queue = 1;</code>
     * @param value The queue to set.
     * @return This builder for chaining.
     */
    public Builder setQueue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      queue_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The nitric name for the queue
     *  this will automatically be resolved to the provider specific queue identifier.
     * </pre>
     *
     * <code>string queue = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearQueue() {

      queue_ = getDefaultInstance().getQueue();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The nitric name for the queue
     *  this will automatically be resolved to the provider specific queue identifier.
     * </pre>
     *
     * <code>string queue = 1;</code>
     * @param value The bytes for queue to set.
     * @return This builder for chaining.
     */
    public Builder setQueueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      queue_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object leaseId_ = "";
    /**
     * <pre>
     * Lease id of the task to be completed
     * </pre>
     *
     * <code>string leaseId = 2;</code>
     * @return The leaseId.
     */
    public java.lang.String getLeaseId() {
      java.lang.Object ref = leaseId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        leaseId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Lease id of the task to be completed
     * </pre>
     *
     * <code>string leaseId = 2;</code>
     * @return The bytes for leaseId.
     */
    public com.google.protobuf.ByteString
        getLeaseIdBytes() {
      java.lang.Object ref = leaseId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        leaseId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Lease id of the task to be completed
     * </pre>
     *
     * <code>string leaseId = 2;</code>
     * @param value The leaseId to set.
     * @return This builder for chaining.
     */
    public Builder setLeaseId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      leaseId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Lease id of the task to be completed
     * </pre>
     *
     * <code>string leaseId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLeaseId() {

      leaseId_ = getDefaultInstance().getLeaseId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Lease id of the task to be completed
     * </pre>
     *
     * <code>string leaseId = 2;</code>
     * @param value The bytes for leaseId to set.
     * @return This builder for chaining.
     */
    public Builder setLeaseIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      leaseId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:nitric.queue.v1.QueueCompleteRequest)
  }

  // @@protoc_insertion_point(class_scope:nitric.queue.v1.QueueCompleteRequest)
  private static final io.nitric.proto.queue.v1.QueueCompleteRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.queue.v1.QueueCompleteRequest();
  }

  public static io.nitric.proto.queue.v1.QueueCompleteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueueCompleteRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueueCompleteRequest>() {
    @java.lang.Override
    public QueueCompleteRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueueCompleteRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueueCompleteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueueCompleteRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.queue.v1.QueueCompleteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

