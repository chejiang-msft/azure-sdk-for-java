// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.dynatrace.fluent.models.TagRuleInner;

/** An instance of this class provides access to all the operations defined in TagRulesClient. */
public interface TagRulesClient {
    /**
     * Get a TagRule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param ruleSetName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a TagRule along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TagRuleInner> getWithResponse(
        String resourceGroupName, String monitorName, String ruleSetName, Context context);

    /**
     * Get a TagRule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param ruleSetName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a TagRule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TagRuleInner get(String resourceGroupName, String monitorName, String ruleSetName);

    /**
     * Create a TagRule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param ruleSetName Monitor resource name.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of tag rules for a monitor resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<TagRuleInner>, TagRuleInner> beginCreateOrUpdate(
        String resourceGroupName, String monitorName, String ruleSetName, TagRuleInner resource);

    /**
     * Create a TagRule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param ruleSetName Monitor resource name.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of tag rules for a monitor resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<TagRuleInner>, TagRuleInner> beginCreateOrUpdate(
        String resourceGroupName, String monitorName, String ruleSetName, TagRuleInner resource, Context context);

    /**
     * Create a TagRule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param ruleSetName Monitor resource name.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tag rules for a monitor resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TagRuleInner createOrUpdate(
        String resourceGroupName, String monitorName, String ruleSetName, TagRuleInner resource);

    /**
     * Create a TagRule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param ruleSetName Monitor resource name.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tag rules for a monitor resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TagRuleInner createOrUpdate(
        String resourceGroupName, String monitorName, String ruleSetName, TagRuleInner resource, Context context);

    /**
     * Delete a TagRule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param ruleSetName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String monitorName, String ruleSetName);

    /**
     * Delete a TagRule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param ruleSetName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String monitorName, String ruleSetName, Context context);

    /**
     * Delete a TagRule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param ruleSetName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String monitorName, String ruleSetName);

    /**
     * Delete a TagRule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param ruleSetName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String monitorName, String ruleSetName, Context context);

    /**
     * List all TagRule by monitorName.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a TagRule list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TagRuleInner> list(String resourceGroupName, String monitorName);

    /**
     * List all TagRule by monitorName.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a TagRule list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TagRuleInner> list(String resourceGroupName, String monitorName, Context context);
}
