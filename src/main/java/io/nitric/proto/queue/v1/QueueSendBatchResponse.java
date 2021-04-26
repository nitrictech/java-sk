// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: queue/v1/queue.proto

package io.nitric.proto.queue.v1;

/**
 * <pre>
 * An ordered array of booleans
 * matching the same order as the events given
 * in the original request, each one will mark if the
 * Event was successful pushed
 * </pre>
 *
 * Protobuf type {@code nitric.queue.v1.QueueSendBatchResponse}
 */
public final class QueueSendBatchResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.queue.v1.QueueSendBatchResponse)
    QueueSendBatchResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueueSendBatchResponse.newBuilder() to construct.
  private QueueSendBatchResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueueSendBatchResponse() {
    failedTasks_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueueSendBatchResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueueSendBatchResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              failedTasks_ = new java.util.ArrayList<io.nitric.proto.queue.v1.FailedTask>();
              mutable_bitField0_ |= 0x00000001;
            }
            failedTasks_.add(
                input.readMessage(io.nitric.proto.queue.v1.FailedTask.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        failedTasks_ = java.util.Collections.unmodifiableList(failedTasks_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.queue.v1.Queues.internal_static_nitric_queue_v1_QueueSendBatchResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.queue.v1.Queues.internal_static_nitric_queue_v1_QueueSendBatchResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.queue.v1.QueueSendBatchResponse.class, io.nitric.proto.queue.v1.QueueSendBatchResponse.Builder.class);
  }

  public static final int FAILEDTASKS_FIELD_NUMBER = 1;
  private java.util.List<io.nitric.proto.queue.v1.FailedTask> failedTasks_;
  /**
   * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
   */
  @java.lang.Override
  public java.util.List<io.nitric.proto.queue.v1.FailedTask> getFailedTasksList() {
    return failedTasks_;
  }
  /**
   * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.nitric.proto.queue.v1.FailedTaskOrBuilder>
      getFailedTasksOrBuilderList() {
    return failedTasks_;
  }
  /**
   * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
   */
  @java.lang.Override
  public int getFailedTasksCount() {
    return failedTasks_.size();
  }
  /**
   * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
   */
  @java.lang.Override
  public io.nitric.proto.queue.v1.FailedTask getFailedTasks(int index) {
    return failedTasks_.get(index);
  }
  /**
   * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
   */
  @java.lang.Override
  public io.nitric.proto.queue.v1.FailedTaskOrBuilder getFailedTasksOrBuilder(
      int index) {
    return failedTasks_.get(index);
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
    for (int i = 0; i < failedTasks_.size(); i++) {
      output.writeMessage(1, failedTasks_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < failedTasks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, failedTasks_.get(i));
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
    if (!(obj instanceof io.nitric.proto.queue.v1.QueueSendBatchResponse)) {
      return super.equals(obj);
    }
    io.nitric.proto.queue.v1.QueueSendBatchResponse other = (io.nitric.proto.queue.v1.QueueSendBatchResponse) obj;

    if (!getFailedTasksList()
        .equals(other.getFailedTasksList())) return false;
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
    if (getFailedTasksCount() > 0) {
      hash = (37 * hash) + FAILEDTASKS_FIELD_NUMBER;
      hash = (53 * hash) + getFailedTasksList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.queue.v1.QueueSendBatchResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.queue.v1.QueueSendBatchResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.queue.v1.QueueSendBatchResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.queue.v1.QueueSendBatchResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.queue.v1.QueueSendBatchResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.queue.v1.QueueSendBatchResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.queue.v1.QueueSendBatchResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.queue.v1.QueueSendBatchResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.queue.v1.QueueSendBatchResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.queue.v1.QueueSendBatchResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.queue.v1.QueueSendBatchResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.queue.v1.QueueSendBatchResponse parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.queue.v1.QueueSendBatchResponse prototype) {
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
   * <pre>
   * An ordered array of booleans
   * matching the same order as the events given
   * in the original request, each one will mark if the
   * Event was successful pushed
   * </pre>
   *
   * Protobuf type {@code nitric.queue.v1.QueueSendBatchResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.queue.v1.QueueSendBatchResponse)
      io.nitric.proto.queue.v1.QueueSendBatchResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.queue.v1.Queues.internal_static_nitric_queue_v1_QueueSendBatchResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.queue.v1.Queues.internal_static_nitric_queue_v1_QueueSendBatchResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.queue.v1.QueueSendBatchResponse.class, io.nitric.proto.queue.v1.QueueSendBatchResponse.Builder.class);
    }

    // Construct using io.nitric.proto.queue.v1.QueueSendBatchResponse.newBuilder()
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
        getFailedTasksFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (failedTasksBuilder_ == null) {
        failedTasks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        failedTasksBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.queue.v1.Queues.internal_static_nitric_queue_v1_QueueSendBatchResponse_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.queue.v1.QueueSendBatchResponse getDefaultInstanceForType() {
      return io.nitric.proto.queue.v1.QueueSendBatchResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.queue.v1.QueueSendBatchResponse build() {
      io.nitric.proto.queue.v1.QueueSendBatchResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.queue.v1.QueueSendBatchResponse buildPartial() {
      io.nitric.proto.queue.v1.QueueSendBatchResponse result = new io.nitric.proto.queue.v1.QueueSendBatchResponse(this);
      int from_bitField0_ = bitField0_;
      if (failedTasksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          failedTasks_ = java.util.Collections.unmodifiableList(failedTasks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.failedTasks_ = failedTasks_;
      } else {
        result.failedTasks_ = failedTasksBuilder_.build();
      }
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
      if (other instanceof io.nitric.proto.queue.v1.QueueSendBatchResponse) {
        return mergeFrom((io.nitric.proto.queue.v1.QueueSendBatchResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.queue.v1.QueueSendBatchResponse other) {
      if (other == io.nitric.proto.queue.v1.QueueSendBatchResponse.getDefaultInstance()) return this;
      if (failedTasksBuilder_ == null) {
        if (!other.failedTasks_.isEmpty()) {
          if (failedTasks_.isEmpty()) {
            failedTasks_ = other.failedTasks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFailedTasksIsMutable();
            failedTasks_.addAll(other.failedTasks_);
          }
          onChanged();
        }
      } else {
        if (!other.failedTasks_.isEmpty()) {
          if (failedTasksBuilder_.isEmpty()) {
            failedTasksBuilder_.dispose();
            failedTasksBuilder_ = null;
            failedTasks_ = other.failedTasks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            failedTasksBuilder_ =
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFailedTasksFieldBuilder() : null;
          } else {
            failedTasksBuilder_.addAllMessages(other.failedTasks_);
          }
        }
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
      io.nitric.proto.queue.v1.QueueSendBatchResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.nitric.proto.queue.v1.QueueSendBatchResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.nitric.proto.queue.v1.FailedTask> failedTasks_ =
      java.util.Collections.emptyList();
    private void ensureFailedTasksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        failedTasks_ = new java.util.ArrayList<io.nitric.proto.queue.v1.FailedTask>(failedTasks_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.nitric.proto.queue.v1.FailedTask, io.nitric.proto.queue.v1.FailedTask.Builder, io.nitric.proto.queue.v1.FailedTaskOrBuilder> failedTasksBuilder_;

    /**
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     */
    public java.util.List<io.nitric.proto.queue.v1.FailedTask> getFailedTasksList() {
      if (failedTasksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(failedTasks_);
      } else {
        return failedTasksBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     */
    public int getFailedTasksCount() {
      if (failedTasksBuilder_ == null) {
        return failedTasks_.size();
      } else {
        return failedTasksBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     */
    public io.nitric.proto.queue.v1.FailedTask getFailedTasks(int index) {
      if (failedTasksBuilder_ == null) {
        return failedTasks_.get(index);
      } else {
        return failedTasksBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     */
    public Builder setFailedTasks(
        int index, io.nitric.proto.queue.v1.FailedTask value) {
      if (failedTasksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFailedTasksIsMutable();
        failedTasks_.set(index, value);
        onChanged();
      } else {
        failedTasksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     */
    public Builder setFailedTasks(
        int index, io.nitric.proto.queue.v1.FailedTask.Builder builderForValue) {
      if (failedTasksBuilder_ == null) {
        ensureFailedTasksIsMutable();
        failedTasks_.set(index, builderForValue.build());
        onChanged();
      } else {
        failedTasksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     */
    public Builder addFailedTasks(io.nitric.proto.queue.v1.FailedTask value) {
      if (failedTasksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFailedTasksIsMutable();
        failedTasks_.add(value);
        onChanged();
      } else {
        failedTasksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     */
    public Builder addFailedTasks(
        int index, io.nitric.proto.queue.v1.FailedTask value) {
      if (failedTasksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFailedTasksIsMutable();
        failedTasks_.add(index, value);
        onChanged();
      } else {
        failedTasksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     */
    public Builder addFailedTasks(
        io.nitric.proto.queue.v1.FailedTask.Builder builderForValue) {
      if (failedTasksBuilder_ == null) {
        ensureFailedTasksIsMutable();
        failedTasks_.add(builderForValue.build());
        onChanged();
      } else {
        failedTasksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     */
    public Builder addFailedTasks(
        int index, io.nitric.proto.queue.v1.FailedTask.Builder builderForValue) {
      if (failedTasksBuilder_ == null) {
        ensureFailedTasksIsMutable();
        failedTasks_.add(index, builderForValue.build());
        onChanged();
      } else {
        failedTasksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     */
    public Builder addAllFailedTasks(
        java.lang.Iterable<? extends io.nitric.proto.queue.v1.FailedTask> values) {
      if (failedTasksBuilder_ == null) {
        ensureFailedTasksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, failedTasks_);
        onChanged();
      } else {
        failedTasksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     */
    public Builder clearFailedTasks() {
      if (failedTasksBuilder_ == null) {
        failedTasks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        failedTasksBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     */
    public Builder removeFailedTasks(int index) {
      if (failedTasksBuilder_ == null) {
        ensureFailedTasksIsMutable();
        failedTasks_.remove(index);
        onChanged();
      } else {
        failedTasksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     */
    public io.nitric.proto.queue.v1.FailedTask.Builder getFailedTasksBuilder(
        int index) {
      return getFailedTasksFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     */
    public io.nitric.proto.queue.v1.FailedTaskOrBuilder getFailedTasksOrBuilder(
        int index) {
      if (failedTasksBuilder_ == null) {
        return failedTasks_.get(index);  } else {
        return failedTasksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     */
    public java.util.List<? extends io.nitric.proto.queue.v1.FailedTaskOrBuilder>
         getFailedTasksOrBuilderList() {
      if (failedTasksBuilder_ != null) {
        return failedTasksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(failedTasks_);
      }
    }
    /**
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     */
    public io.nitric.proto.queue.v1.FailedTask.Builder addFailedTasksBuilder() {
      return getFailedTasksFieldBuilder().addBuilder(
          io.nitric.proto.queue.v1.FailedTask.getDefaultInstance());
    }
    /**
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     */
    public io.nitric.proto.queue.v1.FailedTask.Builder addFailedTasksBuilder(
        int index) {
      return getFailedTasksFieldBuilder().addBuilder(
          index, io.nitric.proto.queue.v1.FailedTask.getDefaultInstance());
    }
    /**
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     */
    public java.util.List<io.nitric.proto.queue.v1.FailedTask.Builder>
         getFailedTasksBuilderList() {
      return getFailedTasksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.nitric.proto.queue.v1.FailedTask, io.nitric.proto.queue.v1.FailedTask.Builder, io.nitric.proto.queue.v1.FailedTaskOrBuilder>
        getFailedTasksFieldBuilder() {
      if (failedTasksBuilder_ == null) {
        failedTasksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.nitric.proto.queue.v1.FailedTask, io.nitric.proto.queue.v1.FailedTask.Builder, io.nitric.proto.queue.v1.FailedTaskOrBuilder>(
                failedTasks_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        failedTasks_ = null;
      }
      return failedTasksBuilder_;
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


    // @@protoc_insertion_point(builder_scope:nitric.queue.v1.QueueSendBatchResponse)
  }

  // @@protoc_insertion_point(class_scope:nitric.queue.v1.QueueSendBatchResponse)
  private static final io.nitric.proto.queue.v1.QueueSendBatchResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.queue.v1.QueueSendBatchResponse();
  }

  public static io.nitric.proto.queue.v1.QueueSendBatchResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueueSendBatchResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueueSendBatchResponse>() {
    @java.lang.Override
    public QueueSendBatchResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueueSendBatchResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueueSendBatchResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueueSendBatchResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.queue.v1.QueueSendBatchResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

