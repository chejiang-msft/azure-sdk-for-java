// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The server AAD application secret. */
@Fluent
public class AadProfileSecret {
    /*
     * The server AAD application secret.
     */
    @JsonProperty(value = "serverAppSecret")
    private String serverAppSecret;

    /** Creates an instance of AadProfileSecret class. */
    public AadProfileSecret() {
    }

    /**
     * Get the serverAppSecret property: The server AAD application secret.
     *
     * @return the serverAppSecret value.
     */
    public String serverAppSecret() {
        return this.serverAppSecret;
    }

    /**
     * Set the serverAppSecret property: The server AAD application secret.
     *
     * @param serverAppSecret the serverAppSecret value to set.
     * @return the AadProfileSecret object itself.
     */
    public AadProfileSecret withServerAppSecret(String serverAppSecret) {
        this.serverAppSecret = serverAppSecret;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}