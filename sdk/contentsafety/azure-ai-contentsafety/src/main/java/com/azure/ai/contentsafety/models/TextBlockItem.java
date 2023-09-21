// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.contentsafety.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Item in TextBlocklist. */
@Immutable
public final class TextBlockItem {
    /*
     * Block Item Id. It will be uuid.
     */
    @Generated
    @JsonProperty(value = "blockItemId", access = JsonProperty.Access.WRITE_ONLY)
    private String blockItemId;

    /*
     * Block item description.
     */
    @Generated
    @JsonProperty(value = "description")
    private String description;

    /*
     * Block item content.
     */
    @Generated
    @JsonProperty(value = "text")
    private String text;

    /**
     * Creates an instance of TextBlockItem class.
     *
     * @param text the text value to set.
     */
    @Generated
    @JsonCreator
    private TextBlockItem(@JsonProperty(value = "text") String text) {
        this.text = text;
    }

    /**
     * Get the blockItemId property: Block Item Id. It will be uuid.
     *
     * @return the blockItemId value.
     */
    @Generated
    public String getBlockItemId() {
        return this.blockItemId;
    }

    /**
     * Get the description property: Block item description.
     *
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Get the text property: Block item content.
     *
     * @return the text value.
     */
    @Generated
    public String getText() {
        return this.text;
    }
}
