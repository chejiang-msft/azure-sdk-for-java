// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object to define the base blob action conditions. Properties daysAfterModificationGreaterThan,
 * daysAfterLastAccessTimeGreaterThan and daysAfterCreationGreaterThan are mutually exclusive. The
 * daysAfterLastTierChangeGreaterThan property is only applicable for tierToArchive actions which requires
 * daysAfterModificationGreaterThan to be set, also it cannot be used in conjunction with
 * daysAfterLastAccessTimeGreaterThan or daysAfterCreationGreaterThan.
 */
@Fluent
public final class DateAfterModification {
    /*
     * Value indicating the age in days after last modification
     */
    @JsonProperty(value = "daysAfterModificationGreaterThan")
    private Float daysAfterModificationGreaterThan;

    /*
     * Value indicating the age in days after last blob access. This property can only be used in conjunction with last
     * access time tracking policy
     */
    @JsonProperty(value = "daysAfterLastAccessTimeGreaterThan")
    private Float daysAfterLastAccessTimeGreaterThan;

    /*
     * Value indicating the age in days after last blob tier change time. This property is only applicable for
     * tierToArchive actions and requires daysAfterModificationGreaterThan to be set for baseBlobs based actions. The
     * blob will be archived if both the conditions are satisfied.
     */
    @JsonProperty(value = "daysAfterLastTierChangeGreaterThan")
    private Float daysAfterLastTierChangeGreaterThan;

    /*
     * Value indicating the age in days after blob creation.
     */
    @JsonProperty(value = "daysAfterCreationGreaterThan")
    private Float daysAfterCreationGreaterThan;

    /** Creates an instance of DateAfterModification class. */
    public DateAfterModification() {
    }

    /**
     * Get the daysAfterModificationGreaterThan property: Value indicating the age in days after last modification.
     *
     * @return the daysAfterModificationGreaterThan value.
     */
    public Float daysAfterModificationGreaterThan() {
        return this.daysAfterModificationGreaterThan;
    }

    /**
     * Set the daysAfterModificationGreaterThan property: Value indicating the age in days after last modification.
     *
     * @param daysAfterModificationGreaterThan the daysAfterModificationGreaterThan value to set.
     * @return the DateAfterModification object itself.
     */
    public DateAfterModification withDaysAfterModificationGreaterThan(Float daysAfterModificationGreaterThan) {
        this.daysAfterModificationGreaterThan = daysAfterModificationGreaterThan;
        return this;
    }

    /**
     * Get the daysAfterLastAccessTimeGreaterThan property: Value indicating the age in days after last blob access.
     * This property can only be used in conjunction with last access time tracking policy.
     *
     * @return the daysAfterLastAccessTimeGreaterThan value.
     */
    public Float daysAfterLastAccessTimeGreaterThan() {
        return this.daysAfterLastAccessTimeGreaterThan;
    }

    /**
     * Set the daysAfterLastAccessTimeGreaterThan property: Value indicating the age in days after last blob access.
     * This property can only be used in conjunction with last access time tracking policy.
     *
     * @param daysAfterLastAccessTimeGreaterThan the daysAfterLastAccessTimeGreaterThan value to set.
     * @return the DateAfterModification object itself.
     */
    public DateAfterModification withDaysAfterLastAccessTimeGreaterThan(Float daysAfterLastAccessTimeGreaterThan) {
        this.daysAfterLastAccessTimeGreaterThan = daysAfterLastAccessTimeGreaterThan;
        return this;
    }

    /**
     * Get the daysAfterLastTierChangeGreaterThan property: Value indicating the age in days after last blob tier change
     * time. This property is only applicable for tierToArchive actions and requires daysAfterModificationGreaterThan to
     * be set for baseBlobs based actions. The blob will be archived if both the conditions are satisfied.
     *
     * @return the daysAfterLastTierChangeGreaterThan value.
     */
    public Float daysAfterLastTierChangeGreaterThan() {
        return this.daysAfterLastTierChangeGreaterThan;
    }

    /**
     * Set the daysAfterLastTierChangeGreaterThan property: Value indicating the age in days after last blob tier change
     * time. This property is only applicable for tierToArchive actions and requires daysAfterModificationGreaterThan to
     * be set for baseBlobs based actions. The blob will be archived if both the conditions are satisfied.
     *
     * @param daysAfterLastTierChangeGreaterThan the daysAfterLastTierChangeGreaterThan value to set.
     * @return the DateAfterModification object itself.
     */
    public DateAfterModification withDaysAfterLastTierChangeGreaterThan(Float daysAfterLastTierChangeGreaterThan) {
        this.daysAfterLastTierChangeGreaterThan = daysAfterLastTierChangeGreaterThan;
        return this;
    }

    /**
     * Get the daysAfterCreationGreaterThan property: Value indicating the age in days after blob creation.
     *
     * @return the daysAfterCreationGreaterThan value.
     */
    public Float daysAfterCreationGreaterThan() {
        return this.daysAfterCreationGreaterThan;
    }

    /**
     * Set the daysAfterCreationGreaterThan property: Value indicating the age in days after blob creation.
     *
     * @param daysAfterCreationGreaterThan the daysAfterCreationGreaterThan value to set.
     * @return the DateAfterModification object itself.
     */
    public DateAfterModification withDaysAfterCreationGreaterThan(Float daysAfterCreationGreaterThan) {
        this.daysAfterCreationGreaterThan = daysAfterCreationGreaterThan;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
