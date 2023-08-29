// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.models.ApiVersionSetEntityBase;
import com.azure.resourcemanager.apimanagement.models.VersioningScheme;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties used to create or update an API Version Set. */
@Fluent
public final class ApiVersionSetUpdateParametersProperties extends ApiVersionSetEntityBase {
    /*
     * Name of API Version Set
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * An value that determines where the API Version identifier will be located in a HTTP request.
     */
    @JsonProperty(value = "versioningScheme")
    private VersioningScheme versioningScheme;

    /** Creates an instance of ApiVersionSetUpdateParametersProperties class. */
    public ApiVersionSetUpdateParametersProperties() {
    }

    /**
     * Get the displayName property: Name of API Version Set.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Name of API Version Set.
     *
     * @param displayName the displayName value to set.
     * @return the ApiVersionSetUpdateParametersProperties object itself.
     */
    public ApiVersionSetUpdateParametersProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the versioningScheme property: An value that determines where the API Version identifier will be located in a
     * HTTP request.
     *
     * @return the versioningScheme value.
     */
    public VersioningScheme versioningScheme() {
        return this.versioningScheme;
    }

    /**
     * Set the versioningScheme property: An value that determines where the API Version identifier will be located in a
     * HTTP request.
     *
     * @param versioningScheme the versioningScheme value to set.
     * @return the ApiVersionSetUpdateParametersProperties object itself.
     */
    public ApiVersionSetUpdateParametersProperties withVersioningScheme(VersioningScheme versioningScheme) {
        this.versioningScheme = versioningScheme;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiVersionSetUpdateParametersProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiVersionSetUpdateParametersProperties withVersionQueryName(String versionQueryName) {
        super.withVersionQueryName(versionQueryName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiVersionSetUpdateParametersProperties withVersionHeaderName(String versionHeaderName) {
        super.withVersionHeaderName(versionHeaderName);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
