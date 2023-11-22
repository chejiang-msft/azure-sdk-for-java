// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The list of counts of each limited resource with both current usage and overall quota.
 */
@Immutable
public final class Counters {
    /*
     * The current usage and quota of devices.
     */
    @Generated
    @JsonProperty(value = "deviceCount")
    private UsageQuotaCounter deviceCount;

    /*
     * The current usage and quota of device classes.
     */
    @Generated
    @JsonProperty(value = "deviceClassCount")
    private UsageQuotaCounter deviceClassCount;

    /*
     * The current usage and quota of device groups.
     */
    @Generated
    @JsonProperty(value = "deviceGroupCount")
    private UsageQuotaCounter deviceGroupCount;

    /*
     * The current usage and quota of active deployments.
     */
    @Generated
    @JsonProperty(value = "activeDeploymentCount")
    private UsageQuotaCounter activeDeploymentCount;

    /*
     * The current usage and quota of deployments.
     */
    @Generated
    @JsonProperty(value = "deploymentCount")
    private UsageQuotaCounter deploymentCount;

    /**
     * Creates an instance of Counters class.
     * 
     * @param deviceCount the deviceCount value to set.
     * @param deviceClassCount the deviceClassCount value to set.
     * @param deviceGroupCount the deviceGroupCount value to set.
     * @param activeDeploymentCount the activeDeploymentCount value to set.
     * @param deploymentCount the deploymentCount value to set.
     */
    @Generated
    @JsonCreator
    private Counters(@JsonProperty(value = "deviceCount") UsageQuotaCounter deviceCount,
        @JsonProperty(value = "deviceClassCount") UsageQuotaCounter deviceClassCount,
        @JsonProperty(value = "deviceGroupCount") UsageQuotaCounter deviceGroupCount,
        @JsonProperty(value = "activeDeploymentCount") UsageQuotaCounter activeDeploymentCount,
        @JsonProperty(value = "deploymentCount") UsageQuotaCounter deploymentCount) {
        this.deviceCount = deviceCount;
        this.deviceClassCount = deviceClassCount;
        this.deviceGroupCount = deviceGroupCount;
        this.activeDeploymentCount = activeDeploymentCount;
        this.deploymentCount = deploymentCount;
    }

    /**
     * Get the deviceCount property: The current usage and quota of devices.
     * 
     * @return the deviceCount value.
     */
    @Generated
    public UsageQuotaCounter getDeviceCount() {
        return this.deviceCount;
    }

    /**
     * Get the deviceClassCount property: The current usage and quota of device classes.
     * 
     * @return the deviceClassCount value.
     */
    @Generated
    public UsageQuotaCounter getDeviceClassCount() {
        return this.deviceClassCount;
    }

    /**
     * Get the deviceGroupCount property: The current usage and quota of device groups.
     * 
     * @return the deviceGroupCount value.
     */
    @Generated
    public UsageQuotaCounter getDeviceGroupCount() {
        return this.deviceGroupCount;
    }

    /**
     * Get the activeDeploymentCount property: The current usage and quota of active deployments.
     * 
     * @return the activeDeploymentCount value.
     */
    @Generated
    public UsageQuotaCounter getActiveDeploymentCount() {
        return this.activeDeploymentCount;
    }

    /**
     * Get the deploymentCount property: The current usage and quota of deployments.
     * 
     * @return the deploymentCount value.
     */
    @Generated
    public UsageQuotaCounter getDeploymentCount() {
        return this.deploymentCount;
    }
}
