/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.events.firebase.testlab.v1;

import java.util.Map;

/**
 * Information provided by the client that created the test matrix.
 *
 * Information about the client which invoked the test.
 */
public class ClientInfo {
    private String client;
    private Map<String, String> details;

    /**
     * Client name, such as "gcloud".
     */
    public String getClient() { return client; }
    public void setClient(String value) { this.client = value; }

    /**
     * Map of detailed information about the client.
     */
    public Map<String, String> getDetails() { return details; }
    public void setDetails(Map<String, String> value) { this.details = value; }
}
