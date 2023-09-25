// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** VMwareCbt provider specific container mapping details. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("VMwareCbt")
@Fluent
public final class VMwareCbtProtectionContainerMappingDetails
    extends ProtectionContainerMappingProviderSpecificDetails {
    /*
     * The target key vault ARM Id.
     */
    @JsonProperty(value = "keyVaultId", access = JsonProperty.Access.WRITE_ONLY)
    private String keyVaultId;

    /*
     * The target key vault URI.
     */
    @JsonProperty(value = "keyVaultUri", access = JsonProperty.Access.WRITE_ONLY)
    private String keyVaultUri;

    /*
     * The storage account ARM Id.
     */
    @JsonProperty(value = "storageAccountId", access = JsonProperty.Access.WRITE_ONLY)
    private String storageAccountId;

    /*
     * The secret name of the storage account.
     */
    @JsonProperty(value = "storageAccountSasSecretName", access = JsonProperty.Access.WRITE_ONLY)
    private String storageAccountSasSecretName;

    /*
     * The secret name of the service bus connection string.
     */
    @JsonProperty(value = "serviceBusConnectionStringSecretName", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceBusConnectionStringSecretName;

    /*
     * The target location.
     */
    @JsonProperty(value = "targetLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String targetLocation;

    /*
     * The role size to NIC count map.
     */
    @JsonProperty(value = "roleSizeToNicCountMap", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Integer> roleSizeToNicCountMap;

    /*
     * The SKUs to be excluded.
     */
    @JsonProperty(value = "excludedSkus")
    private List<String> excludedSkus;

    /** Creates an instance of VMwareCbtProtectionContainerMappingDetails class. */
    public VMwareCbtProtectionContainerMappingDetails() {
    }

    /**
     * Get the keyVaultId property: The target key vault ARM Id.
     *
     * @return the keyVaultId value.
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }

    /**
     * Get the keyVaultUri property: The target key vault URI.
     *
     * @return the keyVaultUri value.
     */
    public String keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * Get the storageAccountId property: The storage account ARM Id.
     *
     * @return the storageAccountId value.
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * Get the storageAccountSasSecretName property: The secret name of the storage account.
     *
     * @return the storageAccountSasSecretName value.
     */
    public String storageAccountSasSecretName() {
        return this.storageAccountSasSecretName;
    }

    /**
     * Get the serviceBusConnectionStringSecretName property: The secret name of the service bus connection string.
     *
     * @return the serviceBusConnectionStringSecretName value.
     */
    public String serviceBusConnectionStringSecretName() {
        return this.serviceBusConnectionStringSecretName;
    }

    /**
     * Get the targetLocation property: The target location.
     *
     * @return the targetLocation value.
     */
    public String targetLocation() {
        return this.targetLocation;
    }

    /**
     * Get the roleSizeToNicCountMap property: The role size to NIC count map.
     *
     * @return the roleSizeToNicCountMap value.
     */
    public Map<String, Integer> roleSizeToNicCountMap() {
        return this.roleSizeToNicCountMap;
    }

    /**
     * Get the excludedSkus property: The SKUs to be excluded.
     *
     * @return the excludedSkus value.
     */
    public List<String> excludedSkus() {
        return this.excludedSkus;
    }

    /**
     * Set the excludedSkus property: The SKUs to be excluded.
     *
     * @param excludedSkus the excludedSkus value to set.
     * @return the VMwareCbtProtectionContainerMappingDetails object itself.
     */
    public VMwareCbtProtectionContainerMappingDetails withExcludedSkus(List<String> excludedSkus) {
        this.excludedSkus = excludedSkus;
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
