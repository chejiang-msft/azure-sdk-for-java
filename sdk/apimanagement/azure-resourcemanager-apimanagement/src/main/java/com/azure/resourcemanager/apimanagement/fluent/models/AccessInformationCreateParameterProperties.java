// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Tenant access information update parameters of the API Management service. */
@Fluent
public final class AccessInformationCreateParameterProperties {
    /*
     * Principal (User) Identifier.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /*
     * Primary access key. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get
     * the value.
     */
    @JsonProperty(value = "primaryKey")
    private String primaryKey;

    /*
     * Secondary access key. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to
     * get the value.
     */
    @JsonProperty(value = "secondaryKey")
    private String secondaryKey;

    /*
     * Determines whether direct access is enabled.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /** Creates an instance of AccessInformationCreateParameterProperties class. */
    public AccessInformationCreateParameterProperties() {
    }

    /**
     * Get the principalId property: Principal (User) Identifier.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: Principal (User) Identifier.
     *
     * @param principalId the principalId value to set.
     * @return the AccessInformationCreateParameterProperties object itself.
     */
    public AccessInformationCreateParameterProperties withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the primaryKey property: Primary access key. This property will not be filled on 'GET' operations! Use
     * '/listSecrets' POST request to get the value.
     *
     * @return the primaryKey value.
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Set the primaryKey property: Primary access key. This property will not be filled on 'GET' operations! Use
     * '/listSecrets' POST request to get the value.
     *
     * @param primaryKey the primaryKey value to set.
     * @return the AccessInformationCreateParameterProperties object itself.
     */
    public AccessInformationCreateParameterProperties withPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * Get the secondaryKey property: Secondary access key. This property will not be filled on 'GET' operations! Use
     * '/listSecrets' POST request to get the value.
     *
     * @return the secondaryKey value.
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }

    /**
     * Set the secondaryKey property: Secondary access key. This property will not be filled on 'GET' operations! Use
     * '/listSecrets' POST request to get the value.
     *
     * @param secondaryKey the secondaryKey value to set.
     * @return the AccessInformationCreateParameterProperties object itself.
     */
    public AccessInformationCreateParameterProperties withSecondaryKey(String secondaryKey) {
        this.secondaryKey = secondaryKey;
        return this;
    }

    /**
     * Get the enabled property: Determines whether direct access is enabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Determines whether direct access is enabled.
     *
     * @param enabled the enabled value to set.
     * @return the AccessInformationCreateParameterProperties object itself.
     */
    public AccessInformationCreateParameterProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
