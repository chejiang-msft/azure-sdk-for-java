// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The CollectTonesResult model. */
@Immutable
public final class CollectTonesResult {
    /*
     * The tones property.
     */
    @JsonProperty(value = "tones", access = JsonProperty.Access.WRITE_ONLY)
    private List<DtmfTone> tones;

    /**
     * Get the tones property: The tones property.
     *
     * @return the tones value.
     */
    public List<DtmfTone> getTones() {
        return this.tones;
    }
}
