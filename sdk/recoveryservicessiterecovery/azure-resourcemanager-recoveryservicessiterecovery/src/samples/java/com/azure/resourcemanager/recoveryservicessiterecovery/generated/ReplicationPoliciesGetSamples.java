// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

/** Samples for ReplicationPolicies Get. */
public final class ReplicationPoliciesGetSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2023-06-01/examples/ReplicationPolicies_Get.json
     */
    /**
     * Sample code: Gets the requested policy.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsTheRequestedPolicy(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationPolicies()
            .getWithResponse("vault1", "resourceGroupPS1", "protectionprofile1", com.azure.core.util.Context.NONE);
    }
}
