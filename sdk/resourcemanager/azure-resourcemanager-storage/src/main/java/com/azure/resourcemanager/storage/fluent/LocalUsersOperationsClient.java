// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.fluent.models.LocalUserInner;
import com.azure.resourcemanager.storage.fluent.models.LocalUserKeysInner;
import com.azure.resourcemanager.storage.fluent.models.LocalUserRegeneratePasswordResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in LocalUsersOperationsClient. */
public interface LocalUsersOperationsClient {
    /**
     * List the local users associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list storage account local users as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<LocalUserInner> listAsync(String resourceGroupName, String accountName);

    /**
     * List the local users associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list storage account local users as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LocalUserInner> list(String resourceGroupName, String accountName);

    /**
     * List the local users associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list storage account local users as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LocalUserInner> list(String resourceGroupName, String accountName, Context context);

    /**
     * Get the local user of the storage account by username.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param username The name of local user. The username must contain lowercase letters and numbers only. It must be
     *     unique only within the storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the local user of the storage account by username along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<LocalUserInner>> getWithResponseAsync(String resourceGroupName, String accountName, String username);

    /**
     * Get the local user of the storage account by username.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param username The name of local user. The username must contain lowercase letters and numbers only. It must be
     *     unique only within the storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the local user of the storage account by username on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<LocalUserInner> getAsync(String resourceGroupName, String accountName, String username);

    /**
     * Get the local user of the storage account by username.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param username The name of local user. The username must contain lowercase letters and numbers only. It must be
     *     unique only within the storage account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the local user of the storage account by username along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LocalUserInner> getWithResponse(
        String resourceGroupName, String accountName, String username, Context context);

    /**
     * Get the local user of the storage account by username.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param username The name of local user. The username must contain lowercase letters and numbers only. It must be
     *     unique only within the storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the local user of the storage account by username.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LocalUserInner get(String resourceGroupName, String accountName, String username);

    /**
     * Create or update the properties of a local user associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param username The name of local user. The username must contain lowercase letters and numbers only. It must be
     *     unique only within the storage account.
     * @param properties The local user associated with a storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the local user associated with the storage accounts along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<LocalUserInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String accountName, String username, LocalUserInner properties);

    /**
     * Create or update the properties of a local user associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param username The name of local user. The username must contain lowercase letters and numbers only. It must be
     *     unique only within the storage account.
     * @param properties The local user associated with a storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the local user associated with the storage accounts on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<LocalUserInner> createOrUpdateAsync(
        String resourceGroupName, String accountName, String username, LocalUserInner properties);

    /**
     * Create or update the properties of a local user associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param username The name of local user. The username must contain lowercase letters and numbers only. It must be
     *     unique only within the storage account.
     * @param properties The local user associated with a storage account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the local user associated with the storage accounts along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LocalUserInner> createOrUpdateWithResponse(
        String resourceGroupName, String accountName, String username, LocalUserInner properties, Context context);

    /**
     * Create or update the properties of a local user associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param username The name of local user. The username must contain lowercase letters and numbers only. It must be
     *     unique only within the storage account.
     * @param properties The local user associated with a storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the local user associated with the storage accounts.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LocalUserInner createOrUpdate(
        String resourceGroupName, String accountName, String username, LocalUserInner properties);

    /**
     * Deletes the local user associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param username The name of local user. The username must contain lowercase letters and numbers only. It must be
     *     unique only within the storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String accountName, String username);

    /**
     * Deletes the local user associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param username The name of local user. The username must contain lowercase letters and numbers only. It must be
     *     unique only within the storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String accountName, String username);

    /**
     * Deletes the local user associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param username The name of local user. The username must contain lowercase letters and numbers only. It must be
     *     unique only within the storage account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String accountName, String username, Context context);

    /**
     * Deletes the local user associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param username The name of local user. The username must contain lowercase letters and numbers only. It must be
     *     unique only within the storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String username);

    /**
     * List SSH authorized keys and shared key of the local user.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param username The name of local user. The username must contain lowercase letters and numbers only. It must be
     *     unique only within the storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Storage Account Local User keys along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<LocalUserKeysInner>> listKeysWithResponseAsync(
        String resourceGroupName, String accountName, String username);

    /**
     * List SSH authorized keys and shared key of the local user.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param username The name of local user. The username must contain lowercase letters and numbers only. It must be
     *     unique only within the storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Storage Account Local User keys on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<LocalUserKeysInner> listKeysAsync(String resourceGroupName, String accountName, String username);

    /**
     * List SSH authorized keys and shared key of the local user.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param username The name of local user. The username must contain lowercase letters and numbers only. It must be
     *     unique only within the storage account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Storage Account Local User keys along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LocalUserKeysInner> listKeysWithResponse(
        String resourceGroupName, String accountName, String username, Context context);

    /**
     * List SSH authorized keys and shared key of the local user.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param username The name of local user. The username must contain lowercase letters and numbers only. It must be
     *     unique only within the storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Storage Account Local User keys.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LocalUserKeysInner listKeys(String resourceGroupName, String accountName, String username);

    /**
     * Regenerate the local user SSH password.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param username The name of local user. The username must contain lowercase letters and numbers only. It must be
     *     unique only within the storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the secrets of Storage Account Local User along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<LocalUserRegeneratePasswordResultInner>> regeneratePasswordWithResponseAsync(
        String resourceGroupName, String accountName, String username);

    /**
     * Regenerate the local user SSH password.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param username The name of local user. The username must contain lowercase letters and numbers only. It must be
     *     unique only within the storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the secrets of Storage Account Local User on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<LocalUserRegeneratePasswordResultInner> regeneratePasswordAsync(
        String resourceGroupName, String accountName, String username);

    /**
     * Regenerate the local user SSH password.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param username The name of local user. The username must contain lowercase letters and numbers only. It must be
     *     unique only within the storage account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the secrets of Storage Account Local User along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LocalUserRegeneratePasswordResultInner> regeneratePasswordWithResponse(
        String resourceGroupName, String accountName, String username, Context context);

    /**
     * Regenerate the local user SSH password.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param username The name of local user. The username must contain lowercase letters and numbers only. It must be
     *     unique only within the storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the secrets of Storage Account Local User.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LocalUserRegeneratePasswordResultInner regeneratePassword(
        String resourceGroupName, String accountName, String username);
}
