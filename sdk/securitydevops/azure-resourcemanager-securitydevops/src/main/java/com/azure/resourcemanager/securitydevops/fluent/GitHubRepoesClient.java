// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.securitydevops.fluent.models.GitHubRepoInner;

/** An instance of this class provides access to all the operations defined in GitHubRepoesClient. */
public interface GitHubRepoesClient {
    /**
     * Returns a list of monitored GitHub repositories.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param gitHubConnectorName Name of the GitHub Connector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GitHubRepoInner> listByConnector(String resourceGroupName, String gitHubConnectorName);

    /**
     * Returns a list of monitored GitHub repositories.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param gitHubConnectorName Name of the GitHub Connector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GitHubRepoInner> listByConnector(
        String resourceGroupName, String gitHubConnectorName, Context context);

    /**
     * Returns a list of monitored GitHub repositories.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param gitHubConnectorName Name of the GitHub Connector.
     * @param gitHubOwnerName Name of the GitHub Owner.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GitHubRepoInner> list(String resourceGroupName, String gitHubConnectorName, String gitHubOwnerName);

    /**
     * Returns a list of monitored GitHub repositories.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param gitHubConnectorName Name of the GitHub Connector.
     * @param gitHubOwnerName Name of the GitHub Owner.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GitHubRepoInner> list(
        String resourceGroupName, String gitHubConnectorName, String gitHubOwnerName, Context context);

    /**
     * Returns a monitored GitHub repository.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param gitHubConnectorName Name of the GitHub Connector.
     * @param gitHubOwnerName Name of the GitHub Owner.
     * @param gitHubRepoName Name of the GitHub Repo.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitHub repo Proxy Resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GitHubRepoInner> getWithResponse(
        String resourceGroupName,
        String gitHubConnectorName,
        String gitHubOwnerName,
        String gitHubRepoName,
        Context context);

    /**
     * Returns a monitored GitHub repository.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param gitHubConnectorName Name of the GitHub Connector.
     * @param gitHubOwnerName Name of the GitHub Owner.
     * @param gitHubRepoName Name of the GitHub Repo.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitHub repo Proxy Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GitHubRepoInner get(
        String resourceGroupName, String gitHubConnectorName, String gitHubOwnerName, String gitHubRepoName);

    /**
     * Create or update a monitored GitHub repository.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param gitHubConnectorName Name of the GitHub Connector.
     * @param gitHubOwnerName Name of the GitHub Owner.
     * @param gitHubRepoName Name of the GitHub Repo.
     * @param gitHubRepo Github repo.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of gitHub repo Proxy Resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<GitHubRepoInner>, GitHubRepoInner> beginCreateOrUpdate(
        String resourceGroupName,
        String gitHubConnectorName,
        String gitHubOwnerName,
        String gitHubRepoName,
        GitHubRepoInner gitHubRepo);

    /**
     * Create or update a monitored GitHub repository.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param gitHubConnectorName Name of the GitHub Connector.
     * @param gitHubOwnerName Name of the GitHub Owner.
     * @param gitHubRepoName Name of the GitHub Repo.
     * @param gitHubRepo Github repo.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of gitHub repo Proxy Resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<GitHubRepoInner>, GitHubRepoInner> beginCreateOrUpdate(
        String resourceGroupName,
        String gitHubConnectorName,
        String gitHubOwnerName,
        String gitHubRepoName,
        GitHubRepoInner gitHubRepo,
        Context context);

    /**
     * Create or update a monitored GitHub repository.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param gitHubConnectorName Name of the GitHub Connector.
     * @param gitHubOwnerName Name of the GitHub Owner.
     * @param gitHubRepoName Name of the GitHub Repo.
     * @param gitHubRepo Github repo.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitHub repo Proxy Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GitHubRepoInner createOrUpdate(
        String resourceGroupName,
        String gitHubConnectorName,
        String gitHubOwnerName,
        String gitHubRepoName,
        GitHubRepoInner gitHubRepo);

    /**
     * Create or update a monitored GitHub repository.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param gitHubConnectorName Name of the GitHub Connector.
     * @param gitHubOwnerName Name of the GitHub Owner.
     * @param gitHubRepoName Name of the GitHub Repo.
     * @param gitHubRepo Github repo.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitHub repo Proxy Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GitHubRepoInner createOrUpdate(
        String resourceGroupName,
        String gitHubConnectorName,
        String gitHubOwnerName,
        String gitHubRepoName,
        GitHubRepoInner gitHubRepo,
        Context context);

    /**
     * Patch a monitored GitHub repository.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param gitHubConnectorName Name of the GitHub Connector.
     * @param gitHubOwnerName Name of the GitHub Owner.
     * @param gitHubRepoName Name of the GitHub Repo.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of gitHub repo Proxy Resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<GitHubRepoInner>, GitHubRepoInner> beginUpdate(
        String resourceGroupName, String gitHubConnectorName, String gitHubOwnerName, String gitHubRepoName);

    /**
     * Patch a monitored GitHub repository.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param gitHubConnectorName Name of the GitHub Connector.
     * @param gitHubOwnerName Name of the GitHub Owner.
     * @param gitHubRepoName Name of the GitHub Repo.
     * @param gitHubRepo Github repo.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of gitHub repo Proxy Resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<GitHubRepoInner>, GitHubRepoInner> beginUpdate(
        String resourceGroupName,
        String gitHubConnectorName,
        String gitHubOwnerName,
        String gitHubRepoName,
        GitHubRepoInner gitHubRepo,
        Context context);

    /**
     * Patch a monitored GitHub repository.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param gitHubConnectorName Name of the GitHub Connector.
     * @param gitHubOwnerName Name of the GitHub Owner.
     * @param gitHubRepoName Name of the GitHub Repo.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitHub repo Proxy Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GitHubRepoInner update(
        String resourceGroupName, String gitHubConnectorName, String gitHubOwnerName, String gitHubRepoName);

    /**
     * Patch a monitored GitHub repository.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param gitHubConnectorName Name of the GitHub Connector.
     * @param gitHubOwnerName Name of the GitHub Owner.
     * @param gitHubRepoName Name of the GitHub Repo.
     * @param gitHubRepo Github repo.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitHub repo Proxy Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GitHubRepoInner update(
        String resourceGroupName,
        String gitHubConnectorName,
        String gitHubOwnerName,
        String gitHubRepoName,
        GitHubRepoInner gitHubRepo,
        Context context);
}