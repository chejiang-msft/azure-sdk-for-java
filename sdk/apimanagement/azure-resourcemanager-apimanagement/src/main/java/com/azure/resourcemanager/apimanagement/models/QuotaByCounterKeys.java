// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of QuotaByCounterKeys. */
public interface QuotaByCounterKeys {
    /**
     * Lists a collection of current quota counter periods associated with the counter-key configured in the policy on
     * the specified service instance. The api does not support paging yet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Quota Counter list representation along with {@link Response}.
     */
    Response<QuotaCounterCollection> listByServiceWithResponse(
        String resourceGroupName, String serviceName, String quotaCounterKey, Context context);

    /**
     * Lists a collection of current quota counter periods associated with the counter-key configured in the policy on
     * the specified service instance. The api does not support paging yet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Quota Counter list representation.
     */
    QuotaCounterCollection listByService(String resourceGroupName, String serviceName, String quotaCounterKey);

    /**
     * Updates all the quota counter values specified with the existing quota counter key to a value in the specified
     * service instance. This should be used for reset of the quota counter values.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param parameters The value of the quota counter to be applied to all quota counter periods.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Quota Counter list representation along with {@link Response}.
     */
    Response<QuotaCounterCollection> updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String quotaCounterKey,
        QuotaCounterValueUpdateContract parameters,
        Context context);

    /**
     * Updates all the quota counter values specified with the existing quota counter key to a value in the specified
     * service instance. This should be used for reset of the quota counter values.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param parameters The value of the quota counter to be applied to all quota counter periods.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Quota Counter list representation.
     */
    QuotaCounterCollection update(
        String resourceGroupName,
        String serviceName,
        String quotaCounterKey,
        QuotaCounterValueUpdateContract parameters);
}
