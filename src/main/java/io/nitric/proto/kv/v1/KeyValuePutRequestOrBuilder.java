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

public interface KeyValuePutRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.kv.v1.KeyValuePutRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The collection containing the existing keyValue to be inserted or updated.
   * </pre>
   *
   * <code>string collection = 1;</code>
   * @return The collection.
   */
  java.lang.String getCollection();
  /**
   * <pre>
   * The collection containing the existing keyValue to be inserted or updated.
   * </pre>
   *
   * <code>string collection = 1;</code>
   * @return The bytes for collection.
   */
  com.google.protobuf.ByteString
      getCollectionBytes();

  /**
   * <pre>
   * The unique key of the keyValue to put
   * </pre>
   *
   * <code>string key = 2;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <pre>
   * The unique key of the keyValue to put
   * </pre>
   *
   * <code>string key = 2;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * A simple JSON object
   * </pre>
   *
   * <code>.google.protobuf.Struct value = 3;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * A simple JSON object
   * </pre>
   *
   * <code>.google.protobuf.Struct value = 3;</code>
   * @return The value.
   */
  com.google.protobuf.Struct getValue();
  /**
   * <pre>
   * A simple JSON object
   * </pre>
   *
   * <code>.google.protobuf.Struct value = 3;</code>
   */
  com.google.protobuf.StructOrBuilder getValueOrBuilder();
}
