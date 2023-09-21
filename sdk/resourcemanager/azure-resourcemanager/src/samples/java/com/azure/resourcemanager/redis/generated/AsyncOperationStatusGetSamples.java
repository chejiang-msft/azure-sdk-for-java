// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated;

/** Samples for AsyncOperationStatus Get. */
public final class AsyncOperationStatusGetSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/stable/2023-08-01/examples/RedisCacheAsyncOperationStatus.json
     */
    /**
     * Sample code: RedisCacheAsyncOperationStatus.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void redisCacheAsyncOperationStatus(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .redisCaches()
            .manager()
            .serviceClient()
            .getAsyncOperationStatus()
            .getWithResponse("East US", "c7ba2bf5-5939-4d79-b037-2964ccf097da", com.azure.core.util.Context.NONE);
    }
}
