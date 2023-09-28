// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Dynamics CRM linked service properties. */
@Fluent
public final class DynamicsCrmLinkedServiceTypeProperties {
    /*
     * The deployment type of the Dynamics CRM instance. 'Online' for Dynamics CRM Online and 'OnPremisesWithIfd' for
     * Dynamics CRM on-premises with Ifd. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "deploymentType", required = true)
    private Object deploymentType;

    /*
     * The host name of the on-premises Dynamics CRM server. The property is required for on-prem and not allowed for
     * online. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "hostName")
    private Object hostname;

    /*
     * The port of on-premises Dynamics CRM server. The property is required for on-prem and not allowed for online.
     * Default is 443. Type: integer (or Expression with resultType integer), minimum: 0.
     */
    @JsonProperty(value = "port")
    private Object port;

    /*
     * The URL to the Microsoft Dynamics CRM server. The property is required for on-line and not allowed for on-prem.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "serviceUri")
    private Object serviceUri;

    /*
     * The organization name of the Dynamics CRM instance. The property is required for on-prem and required for online
     * when there are more than one Dynamics CRM instances associated with the user. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "organizationName")
    private Object organizationName;

    /*
     * The authentication type to connect to Dynamics CRM server. 'Office365' for online scenario, 'Ifd' for
     * on-premises with Ifd scenario, 'AADServicePrincipal' for Server-To-Server authentication in online scenario.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "authenticationType", required = true)
    private Object authenticationType;

    /*
     * User name to access the Dynamics CRM instance. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "username")
    private Object username;

    /*
     * Password to access the Dynamics CRM instance.
     */
    @JsonProperty(value = "password")
    private SecretBase password;

    /*
     * The client ID of the application in Azure Active Directory used for Server-To-Server authentication. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "servicePrincipalId")
    private Object servicePrincipalId;

    /*
     * The service principal credential type to use in Server-To-Server authentication. 'ServicePrincipalKey' for
     * key/secret, 'ServicePrincipalCert' for certificate. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "servicePrincipalCredentialType")
    private Object servicePrincipalCredentialType;

    /*
     * The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is
     * 'ServicePrincipalKey', servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If
     * servicePrincipalCredentialType is 'ServicePrincipalCert', servicePrincipalCredential can only be
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "servicePrincipalCredential")
    private SecretBase servicePrincipalCredential;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /** Creates an instance of DynamicsCrmLinkedServiceTypeProperties class. */
    public DynamicsCrmLinkedServiceTypeProperties() {
    }

    /**
     * Get the deploymentType property: The deployment type of the Dynamics CRM instance. 'Online' for Dynamics CRM
     * Online and 'OnPremisesWithIfd' for Dynamics CRM on-premises with Ifd. Type: string (or Expression with resultType
     * string).
     *
     * @return the deploymentType value.
     */
    public Object deploymentType() {
        return this.deploymentType;
    }

    /**
     * Set the deploymentType property: The deployment type of the Dynamics CRM instance. 'Online' for Dynamics CRM
     * Online and 'OnPremisesWithIfd' for Dynamics CRM on-premises with Ifd. Type: string (or Expression with resultType
     * string).
     *
     * @param deploymentType the deploymentType value to set.
     * @return the DynamicsCrmLinkedServiceTypeProperties object itself.
     */
    public DynamicsCrmLinkedServiceTypeProperties withDeploymentType(Object deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }

    /**
     * Get the hostname property: The host name of the on-premises Dynamics CRM server. The property is required for
     * on-prem and not allowed for online. Type: string (or Expression with resultType string).
     *
     * @return the hostname value.
     */
    public Object hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The host name of the on-premises Dynamics CRM server. The property is required for
     * on-prem and not allowed for online. Type: string (or Expression with resultType string).
     *
     * @param hostname the hostname value to set.
     * @return the DynamicsCrmLinkedServiceTypeProperties object itself.
     */
    public DynamicsCrmLinkedServiceTypeProperties withHostname(Object hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the port property: The port of on-premises Dynamics CRM server. The property is required for on-prem and not
     * allowed for online. Default is 443. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @return the port value.
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the port property: The port of on-premises Dynamics CRM server. The property is required for on-prem and not
     * allowed for online. Default is 443. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @param port the port value to set.
     * @return the DynamicsCrmLinkedServiceTypeProperties object itself.
     */
    public DynamicsCrmLinkedServiceTypeProperties withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the serviceUri property: The URL to the Microsoft Dynamics CRM server. The property is required for on-line
     * and not allowed for on-prem. Type: string (or Expression with resultType string).
     *
     * @return the serviceUri value.
     */
    public Object serviceUri() {
        return this.serviceUri;
    }

    /**
     * Set the serviceUri property: The URL to the Microsoft Dynamics CRM server. The property is required for on-line
     * and not allowed for on-prem. Type: string (or Expression with resultType string).
     *
     * @param serviceUri the serviceUri value to set.
     * @return the DynamicsCrmLinkedServiceTypeProperties object itself.
     */
    public DynamicsCrmLinkedServiceTypeProperties withServiceUri(Object serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

    /**
     * Get the organizationName property: The organization name of the Dynamics CRM instance. The property is required
     * for on-prem and required for online when there are more than one Dynamics CRM instances associated with the user.
     * Type: string (or Expression with resultType string).
     *
     * @return the organizationName value.
     */
    public Object organizationName() {
        return this.organizationName;
    }

    /**
     * Set the organizationName property: The organization name of the Dynamics CRM instance. The property is required
     * for on-prem and required for online when there are more than one Dynamics CRM instances associated with the user.
     * Type: string (or Expression with resultType string).
     *
     * @param organizationName the organizationName value to set.
     * @return the DynamicsCrmLinkedServiceTypeProperties object itself.
     */
    public DynamicsCrmLinkedServiceTypeProperties withOrganizationName(Object organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to connect to Dynamics CRM server. 'Office365' for
     * online scenario, 'Ifd' for on-premises with Ifd scenario, 'AADServicePrincipal' for Server-To-Server
     * authentication in online scenario. Type: string (or Expression with resultType string).
     *
     * @return the authenticationType value.
     */
    public Object authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication type to connect to Dynamics CRM server. 'Office365' for
     * online scenario, 'Ifd' for on-premises with Ifd scenario, 'AADServicePrincipal' for Server-To-Server
     * authentication in online scenario. Type: string (or Expression with resultType string).
     *
     * @param authenticationType the authenticationType value to set.
     * @return the DynamicsCrmLinkedServiceTypeProperties object itself.
     */
    public DynamicsCrmLinkedServiceTypeProperties withAuthenticationType(Object authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username property: User name to access the Dynamics CRM instance. Type: string (or Expression with
     * resultType string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: User name to access the Dynamics CRM instance. Type: string (or Expression with
     * resultType string).
     *
     * @param username the username value to set.
     * @return the DynamicsCrmLinkedServiceTypeProperties object itself.
     */
    public DynamicsCrmLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password to access the Dynamics CRM instance.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: Password to access the Dynamics CRM instance.
     *
     * @param password the password value to set.
     * @return the DynamicsCrmLinkedServiceTypeProperties object itself.
     */
    public DynamicsCrmLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The client ID of the application in Azure Active Directory used for
     * Server-To-Server authentication. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The client ID of the application in Azure Active Directory used for
     * Server-To-Server authentication. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the DynamicsCrmLinkedServiceTypeProperties object itself.
     */
    public DynamicsCrmLinkedServiceTypeProperties withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or
     * Expression with resultType string).
     *
     * @return the servicePrincipalCredentialType value.
     */
    public Object servicePrincipalCredentialType() {
        return this.servicePrincipalCredentialType;
    }

    /**
     * Set the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or
     * Expression with resultType string).
     *
     * @param servicePrincipalCredentialType the servicePrincipalCredentialType value to set.
     * @return the DynamicsCrmLinkedServiceTypeProperties object itself.
     */
    public DynamicsCrmLinkedServiceTypeProperties withServicePrincipalCredentialType(
        Object servicePrincipalCredentialType) {
        this.servicePrincipalCredentialType = servicePrincipalCredentialType;
        return this;
    }

    /**
     * Get the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     *
     * @return the servicePrincipalCredential value.
     */
    public SecretBase servicePrincipalCredential() {
        return this.servicePrincipalCredential;
    }

    /**
     * Set the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     *
     * @param servicePrincipalCredential the servicePrincipalCredential value to set.
     * @return the DynamicsCrmLinkedServiceTypeProperties object itself.
     */
    public DynamicsCrmLinkedServiceTypeProperties withServicePrincipalCredential(
        SecretBase servicePrincipalCredential) {
        this.servicePrincipalCredential = servicePrincipalCredential;
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
     * @return the DynamicsCrmLinkedServiceTypeProperties object itself.
     */
    public DynamicsCrmLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deploymentType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property deploymentType in model DynamicsCrmLinkedServiceTypeProperties"));
        }
        if (authenticationType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property authenticationType in model"
                            + " DynamicsCrmLinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
        if (servicePrincipalCredential() != null) {
            servicePrincipalCredential().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DynamicsCrmLinkedServiceTypeProperties.class);
}
