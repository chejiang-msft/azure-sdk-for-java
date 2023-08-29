// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DiagnosticsCreateOrUpdateHeaders model. */
@Fluent
public final class DiagnosticsCreateOrUpdateHeaders {
    /*
     * The Etag property.
     */
    @JsonProperty(value = "Etag")
    private String etag;

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of DiagnosticsCreateOrUpdateHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public DiagnosticsCreateOrUpdateHeaders(HttpHeaders rawHeaders) {
        this.etag = rawHeaders.getValue(HttpHeaderName.ETAG);
    }

    /**
     * Get the etag property: The Etag property.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The Etag property.
     *
     * @param etag the etag value to set.
     * @return the DiagnosticsCreateOrUpdateHeaders object itself.
     */
    public DiagnosticsCreateOrUpdateHeaders withEtag(String etag) {
        this.etag = etag;
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
