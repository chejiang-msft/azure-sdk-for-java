// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Operation status.
 */
public final class OperationStatus extends ExpandableStringEnum<OperationStatus> {
    /**
     * Background operation created but not started yet.
     */
    @Generated
    public static final OperationStatus NOT_STARTED = fromString("NotStarted");

    /**
     * Background operation is currently running.
     */
    @Generated
    public static final OperationStatus RUNNING = fromString("Running");

    /**
     * Background operation finished with success.
     */
    @Generated
    public static final OperationStatus SUCCEEDED = fromString("Succeeded");

    /**
     * Background operation finished with failure.
     */
    @Generated
    public static final OperationStatus FAILED = fromString("Failed");

    /**
     * Creates a new instance of OperationStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public OperationStatus() {
    }

    /**
     * Creates or finds a OperationStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding OperationStatus.
     */
    @Generated
    @JsonCreator
    public static OperationStatus fromString(String name) {
        return fromString(name, OperationStatus.class);
    }

    /**
     * Gets known OperationStatus values.
     * 
     * @return known OperationStatus values.
     */
    @Generated
    public static Collection<OperationStatus> values() {
        return values(OperationStatus.class);
    }
}
