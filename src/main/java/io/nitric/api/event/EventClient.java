package io.nitric.api.event;

/*-
 * #%L
 * Nitric Java SDK
 * %%
 * Copyright (C) 2021 Nitric Technologies Pty Ltd
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

import io.nitric.proto.event.v1.EventGrpc;
import io.nitric.proto.event.v1.EventPublishRequest;
import io.nitric.util.GrpcChannelProvider;
import io.nitric.util.ProtoUtils;

import java.util.Objects;

/**
 * <p>
 *  Provides a Event API client.
 * </p>
 *
 * <p>
 *  The example below illustrates the Event API.
 * </p>
 *
 * <pre><code class="code">
 *  import io.nitric.api.Event;
 *  import io.nitric.api.EventClient;
 *
 *  // Create an order completed event
 *  var payload = Map.of("id", id, "status", "completed");
 *  var event = Event.build(payload);
 *
 *  // Publish the event to the orders topic
 *  var client = EventClient.newBuilder().build();
 *  client.publish("orders", event);
 *  </code></pre>
 *
 * @see Event
 * @see Topic
 * @see TopicClient
 *
 * @since 1.0
 */
public class EventClient {

    final EventGrpc.EventBlockingStub serviceStub;

    /*
     * Enforce builder pattern.
     */
    protected EventClient(EventClient.Builder builder) {
        this.serviceStub = builder.serviceStub;
    }

    // Public Methods ---------------------------------------------------------

    /**
     * Publish the Event to the given topic.
     *
     * @param topic the topic to pubish the event to (required)
     * @param event the even to publish (required)
     */
    public void publish(String topic, Event event) {
        Objects.requireNonNull(topic, "topic parameter is required");
        Objects.requireNonNull(event, "event parameter is required");

        var struct = ProtoUtils.toStruct(event.payload);

        var eventBuilder = io.nitric.proto.event.v1.NitricEvent.newBuilder().setPayload(struct);
        if (event.getId() != null) {
            eventBuilder.setId(event.getId());
        }
        if (event.getPayloadType() != null) {
            eventBuilder.setPayloadType(event.getPayloadType());
        }
        var protoEvent = eventBuilder.build();

        var request = EventPublishRequest.newBuilder()
                .setTopic(topic)
                .setEvent(protoEvent)
                .build();

        serviceStub.publish(request);
    }

    /**
     * Create an new EventClient builder.
     *
     * @return new EventClient builder
     */
    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * @return the string representation of this object
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + "[serviceStub=" + serviceStub + "]";
    }

    // Inner Classes ----------------------------------------------------------

    /**
     * Provides a EventClient Builder.
     */
    public static class Builder {

        EventGrpc.EventBlockingStub serviceStub;

        /*
         * Enforce builder pattern.
         */
        Builder() {
        }

        /**
         * Set  the GRPC service stub.
         *
         * @param serviceStub the GRPC service stub to inject
         * @return the EventClient builder
         */
        public EventClient.Builder serviceStub(EventGrpc.EventBlockingStub serviceStub) {
            this.serviceStub = serviceStub;
            return this;
        }

        /**
         * @return build a new EventClient
         */
        public EventClient build() {
            if (serviceStub == null) {
                var channel = GrpcChannelProvider.getChannel();
                this.serviceStub = EventGrpc.newBlockingStub(channel);
            }

            return new EventClient(this);
        }
    }
}
