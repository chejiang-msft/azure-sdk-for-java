// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The secrets related to customer disk job. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobSecretsType")
@JsonTypeName("DataBoxCustomerDisk")
@Immutable
public final class CustomerDiskJobSecrets extends JobSecrets {
    /*
     * Contains the list of secrets object for that device.
     */
    @JsonProperty(value = "diskSecrets", access = JsonProperty.Access.WRITE_ONLY)
    private List<DiskSecret> diskSecrets;

    /*
     * Carrier Account Number of the customer
     */
    @JsonProperty(value = "carrierAccountNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String carrierAccountNumber;

    /** Creates an instance of CustomerDiskJobSecrets class. */
    public CustomerDiskJobSecrets() {
    }

    /**
     * Get the diskSecrets property: Contains the list of secrets object for that device.
     *
     * @return the diskSecrets value.
     */
    public List<DiskSecret> diskSecrets() {
        return this.diskSecrets;
    }

    /**
     * Get the carrierAccountNumber property: Carrier Account Number of the customer.
     *
     * @return the carrierAccountNumber value.
     */
    public String carrierAccountNumber() {
        return this.carrierAccountNumber;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (diskSecrets() != null) {
            diskSecrets().forEach(e -> e.validate());
        }
    }
}
