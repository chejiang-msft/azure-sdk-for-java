// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hybridcompute.HybridComputeManager;
import com.azure.resourcemanager.hybridcompute.models.MachineAssessPatchesResult;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class MachinesAssessPatchesMockTests {
    @Test
    public void testAssessPatches() throws Exception {
        String responseStr
            = "{\"status\":\"InProgress\",\"assessmentActivityId\":\"f7ef0e4e-ba75-47a0-be99-9d10c1198bf4\",\"rebootPending\":false,\"availablePatchCountByClassification\":{\"security\":647520979,\"critical\":1866114755,\"definition\":1640419759,\"updateRollup\":1091324962,\"featurePack\":47208488,\"servicePack\":699852198,\"tools\":1290354736,\"updates\":1853467009,\"other\":1860324343},\"startDateTime\":\"2021-05-19T00:01:37Z\",\"lastModifiedDateTime\":\"2020-12-22T02:15:52Z\",\"startedBy\":\"User\",\"patchServiceUsed\":\"WU_WSUS\",\"osType\":\"Windows\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HybridComputeManager manager = HybridComputeManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        MachineAssessPatchesResult response
            = manager.machines().assessPatches("bdaxconfozauorsu", "okwbqplh", com.azure.core.util.Context.NONE);

    }
}
