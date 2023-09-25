// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

/** Samples for ReplicationRecoveryServicesProviders ListByReplicationFabrics. */
public final class ReplicationRecoveryServicesProvidersListByRepli {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2023-06-01/examples/ReplicationRecoveryServicesProviders_ListByReplicationFabrics.json
     */
    /**
     * Sample code: Gets the list of registered recovery services providers for the fabric.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsTheListOfRegisteredRecoveryServicesProvidersForTheFabric(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationRecoveryServicesProviders()
            .listByReplicationFabrics("vault1", "resourceGroupPS1", "cloud1", com.azure.core.util.Context.NONE);
    }
}
