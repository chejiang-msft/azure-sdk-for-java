// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The action that should be triggered.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "actionType", defaultImpl = AutomationAction.class, visible = true)
@JsonTypeName("AutomationAction")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "LogicApp", value = AutomationActionLogicApp.class),
    @JsonSubTypes.Type(name = "EventHub", value = AutomationActionEventHub.class),
    @JsonSubTypes.Type(name = "Workspace", value = AutomationActionWorkspace.class) })
@Immutable
public class AutomationAction {
    /*
     * The type of the action that will be triggered by the Automation
     */
    @JsonTypeId
    @JsonProperty(value = "actionType", required = true)
    private ActionType actionType;

    /**
     * Creates an instance of AutomationAction class.
     */
    public AutomationAction() {
        this.actionType = ActionType.fromString("AutomationAction");
    }

    /**
     * Get the actionType property: The type of the action that will be triggered by the Automation.
     * 
     * @return the actionType value.
     */
    public ActionType actionType() {
        return this.actionType;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
