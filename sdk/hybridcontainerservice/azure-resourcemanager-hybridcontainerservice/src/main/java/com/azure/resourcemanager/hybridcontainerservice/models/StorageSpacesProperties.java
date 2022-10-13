// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** HybridAKSStorageSpec defines the desired state of HybridAKSStorage. */
@Fluent
public final class StorageSpacesProperties {
    /*
     * The hciStorageProfile property.
     */
    @JsonProperty(value = "hciStorageProfile")
    private StorageSpacesPropertiesHciStorageProfile hciStorageProfile;

    /*
     * The vmwareStorageProfile property.
     */
    @JsonProperty(value = "vmwareStorageProfile")
    private StorageSpacesPropertiesVmwareStorageProfile vmwareStorageProfile;

    /*
     * The provisioningState property.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * HybridAKSStorageStatus defines the observed state of HybridAKSStorage
     */
    @JsonProperty(value = "status")
    private StorageSpacesPropertiesStatus status;

    /** Creates an instance of StorageSpacesProperties class. */
    public StorageSpacesProperties() {
    }

    /**
     * Get the hciStorageProfile property: The hciStorageProfile property.
     *
     * @return the hciStorageProfile value.
     */
    public StorageSpacesPropertiesHciStorageProfile hciStorageProfile() {
        return this.hciStorageProfile;
    }

    /**
     * Set the hciStorageProfile property: The hciStorageProfile property.
     *
     * @param hciStorageProfile the hciStorageProfile value to set.
     * @return the StorageSpacesProperties object itself.
     */
    public StorageSpacesProperties withHciStorageProfile(StorageSpacesPropertiesHciStorageProfile hciStorageProfile) {
        this.hciStorageProfile = hciStorageProfile;
        return this;
    }

    /**
     * Get the vmwareStorageProfile property: The vmwareStorageProfile property.
     *
     * @return the vmwareStorageProfile value.
     */
    public StorageSpacesPropertiesVmwareStorageProfile vmwareStorageProfile() {
        return this.vmwareStorageProfile;
    }

    /**
     * Set the vmwareStorageProfile property: The vmwareStorageProfile property.
     *
     * @param vmwareStorageProfile the vmwareStorageProfile value to set.
     * @return the StorageSpacesProperties object itself.
     */
    public StorageSpacesProperties withVmwareStorageProfile(
        StorageSpacesPropertiesVmwareStorageProfile vmwareStorageProfile) {
        this.vmwareStorageProfile = vmwareStorageProfile;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status property: HybridAKSStorageStatus defines the observed state of HybridAKSStorage.
     *
     * @return the status value.
     */
    public StorageSpacesPropertiesStatus status() {
        return this.status;
    }

    /**
     * Set the status property: HybridAKSStorageStatus defines the observed state of HybridAKSStorage.
     *
     * @param status the status value to set.
     * @return the StorageSpacesProperties object itself.
     */
    public StorageSpacesProperties withStatus(StorageSpacesPropertiesStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hciStorageProfile() != null) {
            hciStorageProfile().validate();
        }
        if (vmwareStorageProfile() != null) {
            vmwareStorageProfile().validate();
        }
        if (status() != null) {
            status().validate();
        }
    }
}