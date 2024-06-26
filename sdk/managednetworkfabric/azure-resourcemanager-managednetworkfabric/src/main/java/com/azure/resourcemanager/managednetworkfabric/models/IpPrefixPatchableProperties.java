// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** IP Prefix patchable properties. */
@Fluent
public class IpPrefixPatchableProperties {
    /*
     * The list of IP Prefix Rules.
     */
    @JsonProperty(value = "ipPrefixRules")
    private List<IpPrefixRule> ipPrefixRules;

    /** Creates an instance of IpPrefixPatchableProperties class. */
    public IpPrefixPatchableProperties() {
    }

    /**
     * Get the ipPrefixRules property: The list of IP Prefix Rules.
     *
     * @return the ipPrefixRules value.
     */
    public List<IpPrefixRule> ipPrefixRules() {
        return this.ipPrefixRules;
    }

    /**
     * Set the ipPrefixRules property: The list of IP Prefix Rules.
     *
     * @param ipPrefixRules the ipPrefixRules value to set.
     * @return the IpPrefixPatchableProperties object itself.
     */
    public IpPrefixPatchableProperties withIpPrefixRules(List<IpPrefixRule> ipPrefixRules) {
        this.ipPrefixRules = ipPrefixRules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipPrefixRules() != null) {
            ipPrefixRules().forEach(e -> e.validate());
        }
    }
}
