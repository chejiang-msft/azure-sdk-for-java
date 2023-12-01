// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The CustomCallingContext model.
 */
@Fluent
public final class CustomCallingContext {
    /*
     * Dictionary of <string>
     */
    @JsonProperty(value = "voipHeaders")
    private Map<String, String> voipHeaders;

    /*
     * Dictionary of <string>
     */
    @JsonProperty(value = "sipHeaders")
    private Map<String, String> sipHeaders;

    /**
     * Creates an instance of CustomCallingContext class.
     */
    public CustomCallingContext() {
    }

    /**
     * Get the voipHeaders property: Dictionary of &lt;string&gt;.
     * 
     * @return the voipHeaders value.
     */
    public Map<String, String> getVoipHeaders() {
        return this.voipHeaders;
    }

    /**
     * Set the voipHeaders property: Dictionary of &lt;string&gt;.
     * 
     * @param voipHeaders the voipHeaders value to set.
     * @return the CustomCallingContext object itself.
     */
    public CustomCallingContext setVoipHeaders(Map<String, String> voipHeaders) {
        this.voipHeaders = voipHeaders;
        return this;
    }

    /**
     * Get the sipHeaders property: Dictionary of &lt;string&gt;.
     * 
     * @return the sipHeaders value.
     */
    public Map<String, String> getSipHeaders() {
        return this.sipHeaders;
    }

    /**
     * Set the sipHeaders property: Dictionary of &lt;string&gt;.
     * 
     * @param sipHeaders the sipHeaders value to set.
     * @return the CustomCallingContext object itself.
     */
    public CustomCallingContext setSipHeaders(Map<String, String> sipHeaders) {
        this.sipHeaders = sipHeaders;
        return this;
    }
}
