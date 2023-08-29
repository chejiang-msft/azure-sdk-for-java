// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.fluent.models.TagDescriptionBaseProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters supplied to the Create TagDescription operation. */
@Fluent
public final class TagDescriptionCreateParameters {
    /*
     * Properties supplied to Create TagDescription operation.
     */
    @JsonProperty(value = "properties")
    private TagDescriptionBaseProperties innerProperties;

    /** Creates an instance of TagDescriptionCreateParameters class. */
    public TagDescriptionCreateParameters() {
    }

    /**
     * Get the innerProperties property: Properties supplied to Create TagDescription operation.
     *
     * @return the innerProperties value.
     */
    private TagDescriptionBaseProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the description property: Description of the Tag.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description of the Tag.
     *
     * @param description the description value to set.
     * @return the TagDescriptionCreateParameters object itself.
     */
    public TagDescriptionCreateParameters withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TagDescriptionBaseProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the externalDocsUrl property: Absolute URL of external resources describing the tag.
     *
     * @return the externalDocsUrl value.
     */
    public String externalDocsUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().externalDocsUrl();
    }

    /**
     * Set the externalDocsUrl property: Absolute URL of external resources describing the tag.
     *
     * @param externalDocsUrl the externalDocsUrl value to set.
     * @return the TagDescriptionCreateParameters object itself.
     */
    public TagDescriptionCreateParameters withExternalDocsUrl(String externalDocsUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TagDescriptionBaseProperties();
        }
        this.innerProperties().withExternalDocsUrl(externalDocsUrl);
        return this;
    }

    /**
     * Get the externalDocsDescription property: Description of the external resources describing the tag.
     *
     * @return the externalDocsDescription value.
     */
    public String externalDocsDescription() {
        return this.innerProperties() == null ? null : this.innerProperties().externalDocsDescription();
    }

    /**
     * Set the externalDocsDescription property: Description of the external resources describing the tag.
     *
     * @param externalDocsDescription the externalDocsDescription value to set.
     * @return the TagDescriptionCreateParameters object itself.
     */
    public TagDescriptionCreateParameters withExternalDocsDescription(String externalDocsDescription) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TagDescriptionBaseProperties();
        }
        this.innerProperties().withExternalDocsDescription(externalDocsDescription);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
