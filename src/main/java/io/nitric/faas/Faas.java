package io.nitric.faas;

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

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;

/**
 * <p>
 *  Provides a Nitric FaaS (Function as a Service) server.
 * </p>
 *
 * <p>
 *  The example below starts a new <code>Fass</code> server with the <code>HelloWorld</code> function.
 * </p>
 *
 * <pre><code class="code">
 * package com.example;
 *
 * import io.nitric.faas.Faas;
 * import io.nitric.faas.NitricEvent;
 * import io.nitric.faas.NitricFunction;
 * import io.nitric.faas.NitricResponse;
 *
 * public class HelloWorld implements NitricFunction {
 *
 *     public NitricResponse handle(NitricEvent request) {
 *         return NitricResponse.build("Hello World");
 *     }
 *
 *     public static void main(String... args) {
 *         new Faas().start(new HelloWorld());
 *     }
 * }
 * </code></pre>
 *
 * @see NitricFunction
 *
 * @since 1.0.0
 */
public class Faas {

    static final String DEFAULT_HOSTNAME = "127.0.0.1";

    String hostname = DEFAULT_HOSTNAME;
    int port = 8080;
    HttpServer httpServer;

    // Public Methods -------------------------------------------------------------------

    /**
     * Set the server hostname.
     *
     * @param hostname the server hostname
     * @return the Faas server instance
     */
    public Faas hostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Set the server port. The default port is 8080.
     *
     * @param port the server port
     * @return the Faas server instance
     */
    public Faas port(int port) {
        this.port = port;
        return this;
    }

    /**
     * Start the FaaS server after configuring the given function.
     *
     * @param function the function (required)
     */
    public void start(NitricFunction function) {
        Objects.requireNonNull(function, "null function parameter");

        if (httpServer != null) {
            throw new IllegalStateException("server already started");
        }

        long time = System.currentTimeMillis();

        var childAddress = System.getenv("CHILD_ADDRESS");
        if (childAddress != null && !childAddress.isBlank()) {
            hostname = childAddress;
        }

        try {
            httpServer = HttpServer.create(new InetSocketAddress(hostname, port), 0);

            httpServer.createContext("/", buildServerHandler(function));

            httpServer.setExecutor(null);

            // Start the server
            httpServer.start();

            var builder = new StringBuilder().append(getClass().getSimpleName());
            if (DEFAULT_HOSTNAME.equals(hostname)) {
                builder.append(" listening on port ").append(port);

            } else {
                builder.append(" listening on ").append(hostname).append(":").append(port);
            }
            builder.append(" with function: ");

            if (!function.getClass().getSimpleName().isEmpty()) {
                builder.append(function.getClass().getSimpleName());
            } else {
                builder.append(function.getClass().getName());
            }

            System.out.println(builder);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    // Package Private Methods ------------------------------------------------

    HttpHandler buildServerHandler(final NitricFunction function) {

        return new HttpHandler() {

            /**
             * Implements the JDK HTTP server handler.
             *
             * @param he the HTTP exchange object
             * @throws IOException if an I/O error occurs
             */
            @Override
            public void handle(HttpExchange he) throws IOException {

                long start = System.currentTimeMillis();

                try {
                    var eventBuilder = NitricEvent.newBuilder();

                    if (!he.getRequestHeaders().isEmpty()) {
                        var requestHeaders = new HashMap<String, List<String>>();
                        for (Entry<String, List<String>> header : he.getRequestHeaders().entrySet()) {
                            var key = header.getKey();
                            if (!key.equals("Connection") && !key.equals("Host") && !key.equals("Content-length")) {
                                var headerList = requestHeaders.get(key);
                                if (headerList == null) {
                                    headerList = new ArrayList<>(1);
                                    requestHeaders.put(key, headerList);
                                }
                                headerList.addAll(header.getValue());
                            }
                        }
                        eventBuilder.headers(requestHeaders);
                    }

                    if (he.getRequestBody() != null) {
                        eventBuilder.payload(he.getRequestBody().readAllBytes());
                    }

                    var event = eventBuilder.build();

                    var response = function.handle(event);

                    var responseHeaders = new HashMap<String, List<String>>();
                    response.getHeaders().forEach((key, value) -> {
                        responseHeaders.put(key, List.of(value));
                    });
                    he.getResponseHeaders().putAll(responseHeaders);

                    var statusCode = (response.getStatus() > 0) ? response.getStatus() : 200;

                    he.sendResponseHeaders(statusCode, response.getBodyLength());

                    if (response.getBody() != null) {
                        he.getResponseBody().write(response.getBody());
                        he.getResponseBody().close();
                    }

                } catch (Throwable t) {
                    // Log error
                    System.err.printf("Error occurred handling request %s %s with function: %s \n",
                            he.getRequestMethod(),
                            he.getRequestURI(),
                            function.getClass().getName());
                    t.printStackTrace();

                    // Write HTTP error response
                    var msg = "An error occurred, please see logs for details.\n";
                    he.sendResponseHeaders(500, msg.length());
                    he.getResponseBody().write(msg.getBytes(StandardCharsets.UTF_8));
                    he.getResponseBody().close();
                }
            }
        };
    }

}
