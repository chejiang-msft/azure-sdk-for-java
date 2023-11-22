// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * Installation instruction step that performs code execution.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Inline")
@Immutable
public final class InlineStep extends Step {
    /*
     * Identity of handler that will execute this step. Required if step type is inline.
     */
    @Generated
    @JsonProperty(value = "handler")
    private String handler;

    /*
     * Parameters to be passed to handler during execution.
     */
    @Generated
    @JsonProperty(value = "handlerProperties")
    private Map<String, Object> handlerProperties;

    /*
     * Collection of file names to be passed to handler during execution.
     */
    @Generated
    @JsonProperty(value = "files")
    private List<String> files;

    /**
     * Creates an instance of InlineStep class.
     * 
     * @param handler the handler value to set.
     * @param files the files value to set.
     */
    @Generated
    @JsonCreator
    private InlineStep(@JsonProperty(value = "handler") String handler,
        @JsonProperty(value = "files") List<String> files) {
        this.handler = handler;
        this.files = files;
    }

    /**
     * Get the handler property: Identity of handler that will execute this step. Required if step type is inline.
     * 
     * @return the handler value.
     */
    @Generated
    public String getHandler() {
        return this.handler;
    }

    /**
     * Get the handlerProperties property: Parameters to be passed to handler during execution.
     * 
     * @return the handlerProperties value.
     */
    @Generated
    public Map<String, Object> getHandlerProperties() {
        return this.handlerProperties;
    }

    /**
     * Get the files property: Collection of file names to be passed to handler during execution.
     * 
     * @return the files value.
     */
    @Generated
    public List<String> getFiles() {
        return this.files;
    }
}
