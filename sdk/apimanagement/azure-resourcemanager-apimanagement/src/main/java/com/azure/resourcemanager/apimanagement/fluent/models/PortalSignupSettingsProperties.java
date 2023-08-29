// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.models.TermsOfServiceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Sign-up settings contract properties. */
@Fluent
public final class PortalSignupSettingsProperties {
    /*
     * Allow users to sign up on a developer portal.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Terms of service contract properties.
     */
    @JsonProperty(value = "termsOfService")
    private TermsOfServiceProperties termsOfService;

    /** Creates an instance of PortalSignupSettingsProperties class. */
    public PortalSignupSettingsProperties() {
    }

    /**
     * Get the enabled property: Allow users to sign up on a developer portal.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Allow users to sign up on a developer portal.
     *
     * @param enabled the enabled value to set.
     * @return the PortalSignupSettingsProperties object itself.
     */
    public PortalSignupSettingsProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the termsOfService property: Terms of service contract properties.
     *
     * @return the termsOfService value.
     */
    public TermsOfServiceProperties termsOfService() {
        return this.termsOfService;
    }

    /**
     * Set the termsOfService property: Terms of service contract properties.
     *
     * @param termsOfService the termsOfService value to set.
     * @return the PortalSignupSettingsProperties object itself.
     */
    public PortalSignupSettingsProperties withTermsOfService(TermsOfServiceProperties termsOfService) {
        this.termsOfService = termsOfService;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (termsOfService() != null) {
            termsOfService().validate();
        }
    }
}
