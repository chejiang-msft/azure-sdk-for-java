// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Encryption identity for the storage account. */
@Fluent
public final class EncryptionIdentity {
    /*
     * Resource identifier of the UserAssigned identity to be associated with server-side encryption on the storage
     * account.
     */
    @JsonProperty(value = "userAssignedIdentity")
    private String encryptionUserAssignedIdentity;

    /*
     * ClientId of the multi-tenant application to be used in conjunction with the user-assigned identity for
     * cross-tenant customer-managed-keys server-side encryption on the storage account.
     */
    @JsonProperty(value = "federatedIdentityClientId")
    private String encryptionFederatedIdentityClientId;

    /** Creates an instance of EncryptionIdentity class. */
    public EncryptionIdentity() {
    }

    /**
     * Get the encryptionUserAssignedIdentity property: Resource identifier of the UserAssigned identity to be
     * associated with server-side encryption on the storage account.
     *
     * @return the encryptionUserAssignedIdentity value.
     */
    public String encryptionUserAssignedIdentity() {
        return this.encryptionUserAssignedIdentity;
    }

    /**
     * Set the encryptionUserAssignedIdentity property: Resource identifier of the UserAssigned identity to be
     * associated with server-side encryption on the storage account.
     *
     * @param encryptionUserAssignedIdentity the encryptionUserAssignedIdentity value to set.
     * @return the EncryptionIdentity object itself.
     */
    public EncryptionIdentity withEncryptionUserAssignedIdentity(String encryptionUserAssignedIdentity) {
        this.encryptionUserAssignedIdentity = encryptionUserAssignedIdentity;
        return this;
    }

    /**
     * Get the encryptionFederatedIdentityClientId property: ClientId of the multi-tenant application to be used in
     * conjunction with the user-assigned identity for cross-tenant customer-managed-keys server-side encryption on the
     * storage account.
     *
     * @return the encryptionFederatedIdentityClientId value.
     */
    public String encryptionFederatedIdentityClientId() {
        return this.encryptionFederatedIdentityClientId;
    }

    /**
     * Set the encryptionFederatedIdentityClientId property: ClientId of the multi-tenant application to be used in
     * conjunction with the user-assigned identity for cross-tenant customer-managed-keys server-side encryption on the
     * storage account.
     *
     * @param encryptionFederatedIdentityClientId the encryptionFederatedIdentityClientId value to set.
     * @return the EncryptionIdentity object itself.
     */
    public EncryptionIdentity withEncryptionFederatedIdentityClientId(String encryptionFederatedIdentityClientId) {
        this.encryptionFederatedIdentityClientId = encryptionFederatedIdentityClientId;
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
