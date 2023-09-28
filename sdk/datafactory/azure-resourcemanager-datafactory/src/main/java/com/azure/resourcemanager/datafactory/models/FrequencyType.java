// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Frequency of period in terms of 'Hour', 'Minute' or 'Second'. */
public final class FrequencyType extends ExpandableStringEnum<FrequencyType> {
    /** Static value Hour for FrequencyType. */
    public static final FrequencyType HOUR = fromString("Hour");

    /** Static value Minute for FrequencyType. */
    public static final FrequencyType MINUTE = fromString("Minute");

    /** Static value Second for FrequencyType. */
    public static final FrequencyType SECOND = fromString("Second");

    /**
     * Creates a new instance of FrequencyType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FrequencyType() {
    }

    /**
     * Creates or finds a FrequencyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FrequencyType.
     */
    @JsonCreator
    public static FrequencyType fromString(String name) {
        return fromString(name, FrequencyType.class);
    }

    /**
     * Gets known FrequencyType values.
     *
     * @return known FrequencyType values.
     */
    public static Collection<FrequencyType> values() {
        return values(FrequencyType.class);
    }
}
