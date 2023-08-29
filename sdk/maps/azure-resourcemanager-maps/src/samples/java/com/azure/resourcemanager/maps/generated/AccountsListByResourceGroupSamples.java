// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.generated;

/** Samples for Accounts ListByResourceGroup. */
public final class AccountsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/maps/resource-manager/Microsoft.Maps/stable/2023-06-01/examples/ListAccountsByResourceGroup.json
     */
    /**
     * Sample code: List Accounts By Resource Group.
     *
     * @param manager Entry point to AzureMapsManager.
     */
    public static void listAccountsByResourceGroup(com.azure.resourcemanager.maps.AzureMapsManager manager) {
        manager.accounts().listByResourceGroup("myResourceGroup", com.azure.core.util.Context.NONE);
    }
}
