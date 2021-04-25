// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: queue/v1/queue.proto

package io.nitric.proto.queue.v1;

public interface QueueSendBatchRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.queue.v1.QueueSendBatchRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Nitric name for the queue
   *  this will automatically be resolved to the provider specific queue identifier.
   * </pre>
   *
   * <code>string queue = 1;</code>
   * @return The queue.
   */
  java.lang.String getQueue();
  /**
   * <pre>
   * The Nitric name for the queue
   *  this will automatically be resolved to the provider specific queue identifier.
   * </pre>
   *
   * <code>string queue = 1;</code>
   * @return The bytes for queue.
   */
  com.google.protobuf.ByteString
      getQueueBytes();

  /**
   * <pre>
   * Array of tasks to push to the queue
   * </pre>
   *
   * <code>repeated .nitric.queue.v1.NitricTask tasks = 2;</code>
   */
  java.util.List<io.nitric.proto.queue.v1.NitricTask>
      getTasksList();
  /**
   * <pre>
   * Array of tasks to push to the queue
   * </pre>
   *
   * <code>repeated .nitric.queue.v1.NitricTask tasks = 2;</code>
   */
  io.nitric.proto.queue.v1.NitricTask getTasks(int index);
  /**
   * <pre>
   * Array of tasks to push to the queue
   * </pre>
   *
   * <code>repeated .nitric.queue.v1.NitricTask tasks = 2;</code>
   */
  int getTasksCount();
  /**
   * <pre>
   * Array of tasks to push to the queue
   * </pre>
   *
   * <code>repeated .nitric.queue.v1.NitricTask tasks = 2;</code>
   */
  java.util.List<? extends io.nitric.proto.queue.v1.NitricTaskOrBuilder>
      getTasksOrBuilderList();
  /**
   * <pre>
   * Array of tasks to push to the queue
   * </pre>
   *
   * <code>repeated .nitric.queue.v1.NitricTask tasks = 2;</code>
   */
  io.nitric.proto.queue.v1.NitricTaskOrBuilder getTasksOrBuilder(
      int index);
}
