// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.ProductGroupsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.GroupContractInner;
import com.azure.resourcemanager.apimanagement.models.GroupContract;
import com.azure.resourcemanager.apimanagement.models.ProductGroups;

public final class ProductGroupsImpl implements ProductGroups {
    private static final ClientLogger LOGGER = new ClientLogger(ProductGroupsImpl.class);

    private final ProductGroupsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public ProductGroupsImpl(
        ProductGroupsClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<GroupContract> listByProduct(String resourceGroupName, String serviceName, String productId) {
        PagedIterable<GroupContractInner> inner =
            this.serviceClient().listByProduct(resourceGroupName, serviceName, productId);
        return Utils.mapPage(inner, inner1 -> new GroupContractImpl(inner1, this.manager()));
    }

    public PagedIterable<GroupContract> listByProduct(
        String resourceGroupName,
        String serviceName,
        String productId,
        String filter,
        Integer top,
        Integer skip,
        Context context) {
        PagedIterable<GroupContractInner> inner =
            this.serviceClient().listByProduct(resourceGroupName, serviceName, productId, filter, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new GroupContractImpl(inner1, this.manager()));
    }

    public Response<Void> checkEntityExistsWithResponse(
        String resourceGroupName, String serviceName, String productId, String groupId, Context context) {
        return this
            .serviceClient()
            .checkEntityExistsWithResponse(resourceGroupName, serviceName, productId, groupId, context);
    }

    public void checkEntityExists(String resourceGroupName, String serviceName, String productId, String groupId) {
        this.serviceClient().checkEntityExists(resourceGroupName, serviceName, productId, groupId);
    }

    public Response<GroupContract> createOrUpdateWithResponse(
        String resourceGroupName, String serviceName, String productId, String groupId, Context context) {
        Response<GroupContractInner> inner =
            this
                .serviceClient()
                .createOrUpdateWithResponse(resourceGroupName, serviceName, productId, groupId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GroupContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public GroupContract createOrUpdate(
        String resourceGroupName, String serviceName, String productId, String groupId) {
        GroupContractInner inner =
            this.serviceClient().createOrUpdate(resourceGroupName, serviceName, productId, groupId);
        if (inner != null) {
            return new GroupContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String productId, String groupId, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, serviceName, productId, groupId, context);
    }

    public void delete(String resourceGroupName, String serviceName, String productId, String groupId) {
        this.serviceClient().delete(resourceGroupName, serviceName, productId, groupId);
    }

    private ProductGroupsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
