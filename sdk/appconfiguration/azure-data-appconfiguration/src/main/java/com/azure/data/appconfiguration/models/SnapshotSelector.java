// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.data.appconfiguration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.IterableStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Snapshot selector, the optional bag
 */
@Fluent
public final class SnapshotSelector {
    private String name;
    private List<SnapshotStatus> status;

    private List<SnapshotFields> fields;

    /**
     * Creates an instance of {@link SnapshotSelector}.
     */
    public SnapshotSelector() { }

    /**
     * Gets the snapshot name
     *
     * @return The snapshot name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the snapshot name.
     *
     * @param name the snapshot name.
     * @return The updated SnapshotSelector object
     */
    public SnapshotSelector setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Gets the snapshot status
     *
     * @return The snapshot status.
     */
    public List<SnapshotStatus> getSnapshotStatus() {
        return status;
    }

    /**
     * Sets the snapshot status. Used to filter returned snapshots by their status properties.
     *
     * @param status the snapshot status.
     * @return The updated SnapshotSelector object
     */
    public SnapshotSelector setSnapshotStatus(SnapshotStatus... status) {
        this.status = status == null ? null : Arrays.asList(status);
        return this;
    }

    /**
     * Gets the fields on {@link ConfigurationSettingsSnapshot} to return from the GET request. If none are set, the
     * service returns the snapshot with all of their fields populated.
     *
     * @return The set of {@link ConfigurationSettingsSnapshot} fields to return for a GET request.
     */
    public List<SnapshotFields> getFields() {
        return fields;
    }

    /**
     * Sets fields that will be returned in the response corresponding to properties in
     * {@link ConfigurationSettingsSnapshot}. If none are set, the service returns snapshot with all of their fields
     * populated.
     *
     * @param fields The fields to select for the query response. If none are set, the service will return the
     * snapshot with a default set of properties.
     *
     * @return The updated SnapshotSelector object.
     */
    public SnapshotSelector setFields(SnapshotFields... fields) {
        this.fields = fields == null ? null : Arrays.asList(fields);
        return this;
    }

    @Override
    public String toString() {
        String fields;
        if (CoreUtils.isNullOrEmpty(this.fields)) {
            fields = "ALL_FIELDS";
        } else {
            // join a list of enum values into a comma-separated string
            fields = this.fields == null ? null : IterableStream.of(this.fields)
                .stream()
                .map(fieldsEnumValue -> fieldsEnumValue.toString())
                .collect(Collectors.joining(","));
        }

        String status;
        if (CoreUtils.isNullOrEmpty(this.status)) {
            status = "ALL_STATUS";
        } else {
            // join a list of enum values into a comma-separated string
            status = this.status == null ? null : IterableStream.of(this.status)
                .stream()
                .map(statusEnumValue -> statusEnumValue.toString())
                .collect(Collectors.joining(","));
        }
        return "SnapshotSelector(name=" + name + ", status=" + status + ", fields=" + fields + ")";
    }
}
