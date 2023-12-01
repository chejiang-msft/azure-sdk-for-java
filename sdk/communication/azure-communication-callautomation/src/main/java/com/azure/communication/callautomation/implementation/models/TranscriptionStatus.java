// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for TranscriptionStatus.
 */
public final class TranscriptionStatus extends ExpandableStringEnum<TranscriptionStatus> {
    /**
     * Static value transcriptionStarted for TranscriptionStatus.
     */
    public static final TranscriptionStatus TRANSCRIPTION_STARTED = fromString("transcriptionStarted");

    /**
     * Static value transcriptionFailed for TranscriptionStatus.
     */
    public static final TranscriptionStatus TRANSCRIPTION_FAILED = fromString("transcriptionFailed");

    /**
     * Static value transcriptionResumed for TranscriptionStatus.
     */
    public static final TranscriptionStatus TRANSCRIPTION_RESUMED = fromString("transcriptionResumed");

    /**
     * Static value transcriptionUpdated for TranscriptionStatus.
     */
    public static final TranscriptionStatus TRANSCRIPTION_UPDATED = fromString("transcriptionUpdated");

    /**
     * Static value transcriptionStopped for TranscriptionStatus.
     */
    public static final TranscriptionStatus TRANSCRIPTION_STOPPED = fromString("transcriptionStopped");

    /**
     * Static value unspecifiedError for TranscriptionStatus.
     */
    public static final TranscriptionStatus UNSPECIFIED_ERROR = fromString("unspecifiedError");

    /**
     * Creates a new instance of TranscriptionStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TranscriptionStatus() {
    }

    /**
     * Creates or finds a TranscriptionStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TranscriptionStatus.
     */
    @JsonCreator
    public static TranscriptionStatus fromString(String name) {
        return fromString(name, TranscriptionStatus.class);
    }

    /**
     * Gets known TranscriptionStatus values.
     * 
     * @return known TranscriptionStatus values.
     */
    public static Collection<TranscriptionStatus> values() {
        return values(TranscriptionStatus.class);
    }
}
