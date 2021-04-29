// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event/v1/event.proto

package io.nitric.proto.event.v1;

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

public interface EventPublishRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.event.v1.EventPublishRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the topic to publish the event to
   * </pre>
   *
   * <code>string topic = 1;</code>
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   * <pre>
   * The name of the topic to publish the event to
   * </pre>
   *
   * <code>string topic = 1;</code>
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <pre>
   * The event to be published
   * </pre>
   *
   * <code>.nitric.event.v1.NitricEvent event = 2;</code>
   * @return Whether the event field is set.
   */
  boolean hasEvent();
  /**
   * <pre>
   * The event to be published
   * </pre>
   *
   * <code>.nitric.event.v1.NitricEvent event = 2;</code>
   * @return The event.
   */
  io.nitric.proto.event.v1.NitricEvent getEvent();
  /**
   * <pre>
   * The event to be published
   * </pre>
   *
   * <code>.nitric.event.v1.NitricEvent event = 2;</code>
   */
  io.nitric.proto.event.v1.NitricEventOrBuilder getEventOrBuilder();
}
