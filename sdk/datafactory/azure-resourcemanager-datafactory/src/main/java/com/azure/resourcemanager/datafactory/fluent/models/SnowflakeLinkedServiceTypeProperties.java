// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.AzureKeyVaultSecretReference;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Snowflake linked service properties. */
@Fluent
public final class SnowflakeLinkedServiceTypeProperties {
    /*
     * The connection string of snowflake. Type: string, SecureString.
     */
    @JsonProperty(value = "connectionString", required = true)
    private Object connectionString;

    /*
     * The Azure key vault secret reference of password in connection string.
     */
    @JsonProperty(value = "password")
    private AzureKeyVaultSecretReference password;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /** Creates an instance of SnowflakeLinkedServiceTypeProperties class. */
    public SnowflakeLinkedServiceTypeProperties() {
    }

    /**
     * Get the connectionString property: The connection string of snowflake. Type: string, SecureString.
     *
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string of snowflake. Type: string, SecureString.
     *
     * @param connectionString the connectionString value to set.
     * @return the SnowflakeLinkedServiceTypeProperties object itself.
     */
    public SnowflakeLinkedServiceTypeProperties withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the password property: The Azure key vault secret reference of password in connection string.
     *
     * @return the password value.
     */
    public AzureKeyVaultSecretReference password() {
        return this.password;
    }

    /**
     * Set the password property: The Azure key vault secret reference of password in connection string.
     *
     * @param password the password value to set.
     * @return the SnowflakeLinkedServiceTypeProperties object itself.
     */
    public SnowflakeLinkedServiceTypeProperties withPassword(AzureKeyVaultSecretReference password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     *
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SnowflakeLinkedServiceTypeProperties object itself.
     */
    public SnowflakeLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (connectionString() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property connectionString in model SnowflakeLinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SnowflakeLinkedServiceTypeProperties.class);
}
