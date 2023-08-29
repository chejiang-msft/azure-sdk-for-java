// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Protocol. */
public final class Protocol extends ExpandableStringEnum<Protocol> {
    /** Static value http for Protocol. */
    public static final Protocol HTTP = fromString("http");

    /** Static value https for Protocol. */
    public static final Protocol HTTPS = fromString("https");

    /** Static value ws for Protocol. */
    public static final Protocol WS = fromString("ws");

    /** Static value wss for Protocol. */
    public static final Protocol WSS = fromString("wss");

    /**
     * Creates a new instance of Protocol value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Protocol() {
    }

    /**
     * Creates or finds a Protocol from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Protocol.
     */
    @JsonCreator
    public static Protocol fromString(String name) {
        return fromString(name, Protocol.class);
    }

    /**
     * Gets known Protocol values.
     *
     * @return known Protocol values.
     */
    public static Collection<Protocol> values() {
        return values(Protocol.class);
    }
}
