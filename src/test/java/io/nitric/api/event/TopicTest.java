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


import org.junit.Test;

import static org.junit.Assert.*;

public class TopicTest {

    @Test
    public void test_build() {
        var topic = Topic.newBuilder().name("topic").build();

        assertNotNull(topic);
        assertEquals("topic", topic.getName());
        assertEquals("Topic[name=topic]", topic.toString());

        topic = Topic.build("topic2");
        assertEquals("topic2", topic.getName());
        assertEquals("Topic[name=topic2]", topic.toString());

        try {
            Topic.newBuilder().build();
            assertTrue(false);

        } catch (NullPointerException npe) {
            assertEquals("name parameter is required", npe.getMessage());
        }

        try {
            Topic.build(null);
            assertTrue(false);

        } catch (NullPointerException npe) {
            assertEquals("name parameter is required", npe.getMessage());
        }
    }

}
