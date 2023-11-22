// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Health check result.
 */
public final class HealthCheckResult extends ExpandableStringEnum<HealthCheckResult> {
    /**
     * Health check succeeded.
     */
    @Generated
    public static final HealthCheckResult SUCCESS = fromString("success");

    /**
     * Health check failed due to user error.
     */
    @Generated
    public static final HealthCheckResult USER_ERROR = fromString("userError");

    /**
     * Creates a new instance of HealthCheckResult value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public HealthCheckResult() {
    }

    /**
     * Creates or finds a HealthCheckResult from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding HealthCheckResult.
     */
    @Generated
    @JsonCreator
    public static HealthCheckResult fromString(String name) {
        return fromString(name, HealthCheckResult.class);
    }

    /**
     * Gets known HealthCheckResult values.
     * 
     * @return known HealthCheckResult values.
     */
    @Generated
    public static Collection<HealthCheckResult> values() {
        return values(HealthCheckResult.class);
    }
}
