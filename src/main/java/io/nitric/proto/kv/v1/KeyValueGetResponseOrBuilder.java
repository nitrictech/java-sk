// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kv/v1/kv.proto

package io.nitric.proto.kv.v1;

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

public interface KeyValueGetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.kv.v1.KeyValueGetResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The retrieved value
   * </pre>
   *
   * <code>.google.protobuf.Struct value = 1;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * The retrieved value
   * </pre>
   *
   * <code>.google.protobuf.Struct value = 1;</code>
   * @return The value.
   */
  com.google.protobuf.Struct getValue();
  /**
   * <pre>
   * The retrieved value
   * </pre>
   *
   * <code>.google.protobuf.Struct value = 1;</code>
   */
  com.google.protobuf.StructOrBuilder getValueOrBuilder();
}
