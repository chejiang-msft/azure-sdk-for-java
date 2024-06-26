// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.hybridcompute.fluent.models.HybridComputePrivateLinkScopeInner;
import com.azure.resourcemanager.hybridcompute.fluent.models.PrivateLinkScopeValidationDetailsInner;
import com.azure.resourcemanager.hybridcompute.models.TagsResource;

/**
 * An instance of this class provides access to all the operations defined in PrivateLinkScopesClient.
 */
public interface PrivateLinkScopesClient {
    /**
     * Gets a list of all Azure Arc PrivateLinkScopes within a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all Azure Arc PrivateLinkScopes within a subscription as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HybridComputePrivateLinkScopeInner> list();

    /**
     * Gets a list of all Azure Arc PrivateLinkScopes within a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all Azure Arc PrivateLinkScopes within a subscription as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HybridComputePrivateLinkScopeInner> list(Context context);

    /**
     * Gets a list of Azure Arc PrivateLinkScopes within a resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Azure Arc PrivateLinkScopes within a resource group as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HybridComputePrivateLinkScopeInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of Azure Arc PrivateLinkScopes within a resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Azure Arc PrivateLinkScopes within a resource group as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HybridComputePrivateLinkScopeInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Deletes a Azure Arc PrivateLinkScope.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Arc PrivateLinkScope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String scopeName);

    /**
     * Deletes a Azure Arc PrivateLinkScope.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Arc PrivateLinkScope resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String scopeName, Context context);

    /**
     * Deletes a Azure Arc PrivateLinkScope.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Arc PrivateLinkScope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String scopeName);

    /**
     * Deletes a Azure Arc PrivateLinkScope.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Arc PrivateLinkScope resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String scopeName, Context context);

    /**
     * Returns a Azure Arc PrivateLinkScope.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Arc PrivateLinkScope resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Arc PrivateLinkScope definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<HybridComputePrivateLinkScopeInner> getByResourceGroupWithResponse(String resourceGroupName,
        String scopeName, Context context);

    /**
     * Returns a Azure Arc PrivateLinkScope.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Arc PrivateLinkScope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Arc PrivateLinkScope definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HybridComputePrivateLinkScopeInner getByResourceGroup(String resourceGroupName, String scopeName);

    /**
     * Creates (or updates) a Azure Arc PrivateLinkScope. Note: You cannot specify a different value for
     * InstrumentationKey nor AppId in the Put operation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Arc PrivateLinkScope resource.
     * @param parameters Properties that need to be specified to create or update a Azure Arc for Servers and Clusters
     * PrivateLinkScope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Arc PrivateLinkScope definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<HybridComputePrivateLinkScopeInner> createOrUpdateWithResponse(String resourceGroupName, String scopeName,
        HybridComputePrivateLinkScopeInner parameters, Context context);

    /**
     * Creates (or updates) a Azure Arc PrivateLinkScope. Note: You cannot specify a different value for
     * InstrumentationKey nor AppId in the Put operation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Arc PrivateLinkScope resource.
     * @param parameters Properties that need to be specified to create or update a Azure Arc for Servers and Clusters
     * PrivateLinkScope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Arc PrivateLinkScope definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HybridComputePrivateLinkScopeInner createOrUpdate(String resourceGroupName, String scopeName,
        HybridComputePrivateLinkScopeInner parameters);

    /**
     * Updates an existing PrivateLinkScope's tags. To update other fields use the CreateOrUpdate method.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Arc PrivateLinkScope resource.
     * @param privateLinkScopeTags Updated tag information to set into the PrivateLinkScope instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Arc PrivateLinkScope definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<HybridComputePrivateLinkScopeInner> updateTagsWithResponse(String resourceGroupName, String scopeName,
        TagsResource privateLinkScopeTags, Context context);

    /**
     * Updates an existing PrivateLinkScope's tags. To update other fields use the CreateOrUpdate method.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Arc PrivateLinkScope resource.
     * @param privateLinkScopeTags Updated tag information to set into the PrivateLinkScope instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Arc PrivateLinkScope definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HybridComputePrivateLinkScopeInner updateTags(String resourceGroupName, String scopeName,
        TagsResource privateLinkScopeTags);

    /**
     * Returns a Azure Arc PrivateLinkScope's validation details.
     * 
     * @param location The location of the target resource.
     * @param privateLinkScopeId The id (Guid) of the Azure Arc PrivateLinkScope resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateLinkScopeValidationDetailsInner> getValidationDetailsWithResponse(String location,
        String privateLinkScopeId, Context context);

    /**
     * Returns a Azure Arc PrivateLinkScope's validation details.
     * 
     * @param location The location of the target resource.
     * @param privateLinkScopeId The id (Guid) of the Azure Arc PrivateLinkScope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkScopeValidationDetailsInner getValidationDetails(String location, String privateLinkScopeId);

    /**
     * Returns a Azure Arc PrivateLinkScope's validation details for a given machine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the target machine to get the private link scope validation details for.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateLinkScopeValidationDetailsInner>
        getValidationDetailsForMachineWithResponse(String resourceGroupName, String machineName, Context context);

    /**
     * Returns a Azure Arc PrivateLinkScope's validation details for a given machine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the target machine to get the private link scope validation details for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkScopeValidationDetailsInner getValidationDetailsForMachine(String resourceGroupName, String machineName);
}
