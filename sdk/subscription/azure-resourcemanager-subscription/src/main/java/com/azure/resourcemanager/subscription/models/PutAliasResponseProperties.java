// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.subscription.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Put subscription creation result properties. */
@Fluent
public final class PutAliasResponseProperties {
    /*
     * Newly created subscription Id.
     */
    @JsonProperty(value = "subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionId;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState")
    private ProvisioningState provisioningState;

    /** Creates an instance of PutAliasResponseProperties class. */
    public PutAliasResponseProperties() {
    }

    /**
     * Get the subscriptionId property: Newly created subscription Id.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the resource.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the PutAliasResponseProperties object itself.
     */
    public PutAliasResponseProperties withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
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
