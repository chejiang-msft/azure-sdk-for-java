// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The participant profile property reference. */
@Fluent
public final class ParticipantProfilePropertyReference {
    /*
     * The source interaction property that maps to the target profile property.
     */
    @JsonProperty(value = "interactionPropertyName", required = true)
    private String interactionPropertyName;

    /*
     * The target profile property that maps to the source interaction property.
     */
    @JsonProperty(value = "profilePropertyName", required = true)
    private String profilePropertyName;

    /** Creates an instance of ParticipantProfilePropertyReference class. */
    public ParticipantProfilePropertyReference() {
    }

    /**
     * Get the interactionPropertyName property: The source interaction property that maps to the target profile
     * property.
     *
     * @return the interactionPropertyName value.
     */
    public String interactionPropertyName() {
        return this.interactionPropertyName;
    }

    /**
     * Set the interactionPropertyName property: The source interaction property that maps to the target profile
     * property.
     *
     * @param interactionPropertyName the interactionPropertyName value to set.
     * @return the ParticipantProfilePropertyReference object itself.
     */
    public ParticipantProfilePropertyReference withInteractionPropertyName(String interactionPropertyName) {
        this.interactionPropertyName = interactionPropertyName;
        return this;
    }

    /**
     * Get the profilePropertyName property: The target profile property that maps to the source interaction property.
     *
     * @return the profilePropertyName value.
     */
    public String profilePropertyName() {
        return this.profilePropertyName;
    }

    /**
     * Set the profilePropertyName property: The target profile property that maps to the source interaction property.
     *
     * @param profilePropertyName the profilePropertyName value to set.
     * @return the ParticipantProfilePropertyReference object itself.
     */
    public ParticipantProfilePropertyReference withProfilePropertyName(String profilePropertyName) {
        this.profilePropertyName = profilePropertyName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (interactionPropertyName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property interactionPropertyName in model"
                            + " ParticipantProfilePropertyReference"));
        }
        if (profilePropertyName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property profilePropertyName in model ParticipantProfilePropertyReference"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ParticipantProfilePropertyReference.class);
}
