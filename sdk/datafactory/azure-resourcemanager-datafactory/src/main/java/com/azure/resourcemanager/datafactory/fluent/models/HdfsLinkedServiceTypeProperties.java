// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/** HDFS linked service properties. */
@Fluent
public final class HdfsLinkedServiceTypeProperties {
    /*
     * The URL of the HDFS service endpoint, e.g. http://myhostname:50070/webhdfs/v1 . Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "url", required = true)
    private Object url;

    /*
     * Type of authentication used to connect to the HDFS. Possible values are: Anonymous and Windows. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "authenticationType")
    private Object authenticationType;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /*
     * User name for Windows authentication. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "userName")
    private Object username;

    /*
     * Password for Windows authentication.
     */
    @JsonProperty(value = "password")
    private SecretBase password;

    /** Creates an instance of HdfsLinkedServiceTypeProperties class. */
    public HdfsLinkedServiceTypeProperties() {
    }

    /**
     * Get the url property: The URL of the HDFS service endpoint, e.g. http://myhostname:50070/webhdfs/v1 . Type:
     * string (or Expression with resultType string).
     *
     * @return the url value.
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set the url property: The URL of the HDFS service endpoint, e.g. http://myhostname:50070/webhdfs/v1 . Type:
     * string (or Expression with resultType string).
     *
     * @param url the url value to set.
     * @return the HdfsLinkedServiceTypeProperties object itself.
     */
    public HdfsLinkedServiceTypeProperties withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the authenticationType property: Type of authentication used to connect to the HDFS. Possible values are:
     * Anonymous and Windows. Type: string (or Expression with resultType string).
     *
     * @return the authenticationType value.
     */
    public Object authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: Type of authentication used to connect to the HDFS. Possible values are:
     * Anonymous and Windows. Type: string (or Expression with resultType string).
     *
     * @param authenticationType the authenticationType value to set.
     * @return the HdfsLinkedServiceTypeProperties object itself.
     */
    public HdfsLinkedServiceTypeProperties withAuthenticationType(Object authenticationType) {
        this.authenticationType = authenticationType;
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
     * @return the HdfsLinkedServiceTypeProperties object itself.
     */
    public HdfsLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the username property: User name for Windows authentication. Type: string (or Expression with resultType
     * string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: User name for Windows authentication. Type: string (or Expression with resultType
     * string).
     *
     * @param username the username value to set.
     * @return the HdfsLinkedServiceTypeProperties object itself.
     */
    public HdfsLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password for Windows authentication.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: Password for Windows authentication.
     *
     * @param password the password value to set.
     * @return the HdfsLinkedServiceTypeProperties object itself.
     */
    public HdfsLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (url() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property url in model HdfsLinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HdfsLinkedServiceTypeProperties.class);
}
