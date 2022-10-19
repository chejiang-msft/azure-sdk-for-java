// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Flag to indicate whether the private cloud has the quota for provisioned NSX Public IP count raised from 64 to 1024.
 */
public final class NsxPublicIpQuotaRaisedEnum extends ExpandableStringEnum<NsxPublicIpQuotaRaisedEnum> {
    /** Static value Enabled for NsxPublicIpQuotaRaisedEnum. */
    public static final NsxPublicIpQuotaRaisedEnum ENABLED = fromString("Enabled");

    /** Static value Disabled for NsxPublicIpQuotaRaisedEnum. */
    public static final NsxPublicIpQuotaRaisedEnum DISABLED = fromString("Disabled");

    /**
     * Creates or finds a NsxPublicIpQuotaRaisedEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NsxPublicIpQuotaRaisedEnum.
     */
    @JsonCreator
    public static NsxPublicIpQuotaRaisedEnum fromString(String name) {
        return fromString(name, NsxPublicIpQuotaRaisedEnum.class);
    }

    /**
     * Gets known NsxPublicIpQuotaRaisedEnum values.
     *
     * @return known NsxPublicIpQuotaRaisedEnum values.
     */
    public static Collection<NsxPublicIpQuotaRaisedEnum> values() {
        return values(NsxPublicIpQuotaRaisedEnum.class);
    }
}