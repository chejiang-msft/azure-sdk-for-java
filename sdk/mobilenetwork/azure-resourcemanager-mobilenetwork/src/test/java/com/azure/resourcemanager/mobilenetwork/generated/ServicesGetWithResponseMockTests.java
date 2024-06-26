// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mobilenetwork.MobileNetworkManager;
import com.azure.resourcemanager.mobilenetwork.models.PreemptionCapability;
import com.azure.resourcemanager.mobilenetwork.models.PreemptionVulnerability;
import com.azure.resourcemanager.mobilenetwork.models.SdfDirection;
import com.azure.resourcemanager.mobilenetwork.models.Service;
import com.azure.resourcemanager.mobilenetwork.models.TrafficControlPermission;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ServicesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Canceled\",\"servicePrecedence\":748558129,\"serviceQosPolicy\":{\"5qi\":1011670124,\"allocationAndRetentionPriorityLevel\":876103382,\"preemptionCapability\":\"NotPreempt\",\"preemptionVulnerability\":\"Preemptable\",\"maximumBitRate\":{\"uplink\":\"lanrupdwvnp\",\"downlink\":\"cnzqtpjhmqr\"}},\"pccRules\":[{\"ruleName\":\"thlaiwdcxs\",\"rulePrecedence\":457713777,\"ruleQosPolicy\":{\"guaranteedBitRate\":{\"uplink\":\"hzdtxetlgydlh\",\"downlink\":\"vlnnpx\"},\"5qi\":1628791507,\"allocationAndRetentionPriorityLevel\":821138198,\"preemptionCapability\":\"NotPreempt\",\"preemptionVulnerability\":\"Preemptable\",\"maximumBitRate\":{\"uplink\":\"arbgjekgl\",\"downlink\":\"lbyulidwcwvmze\"}},\"trafficControl\":\"Enabled\",\"serviceDataFlowTemplates\":[{\"templateName\":\"fhjirwgdnqzbrfk\",\"direction\":\"Uplink\",\"protocol\":[],\"remoteIpList\":[]},{\"templateName\":\"zhzmtksjci\",\"direction\":\"Downlink\",\"protocol\":[],\"remoteIpList\":[]},{\"templateName\":\"igsxcdgljplk\",\"direction\":\"Bidirectional\",\"protocol\":[],\"remoteIpList\":[]},{\"templateName\":\"acht\",\"direction\":\"Bidirectional\",\"protocol\":[],\"remoteIpList\":[]}]}]},\"location\":\"lryts\",\"tags\":{\"whqjjyslurlpshhk\":\"fmdgycxnms\",\"rhmpqvwwsk\":\"pedwqsl\"},\"id\":\"ndcbrwi\",\"name\":\"uvqejosovyrrle\",\"type\":\"esi\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        MobileNetworkManager manager = MobileNetworkManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        Service response = manager.services()
            .getWithResponse("rag", "gdphtvdula", "vl", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("lryts", response.location());
        Assertions.assertEquals("fmdgycxnms", response.tags().get("whqjjyslurlpshhk"));
        Assertions.assertEquals(748558129, response.servicePrecedence());
        Assertions.assertEquals(1011670124, response.serviceQosPolicy().fiveQi());
        Assertions.assertEquals(876103382, response.serviceQosPolicy().allocationAndRetentionPriorityLevel());
        Assertions.assertEquals(PreemptionCapability.NOT_PREEMPT, response.serviceQosPolicy().preemptionCapability());
        Assertions.assertEquals(PreemptionVulnerability.PREEMPTABLE,
            response.serviceQosPolicy().preemptionVulnerability());
        Assertions.assertEquals("lanrupdwvnp", response.serviceQosPolicy().maximumBitRate().uplink());
        Assertions.assertEquals("cnzqtpjhmqr", response.serviceQosPolicy().maximumBitRate().downlink());
        Assertions.assertEquals("thlaiwdcxs", response.pccRules().get(0).ruleName());
        Assertions.assertEquals(457713777, response.pccRules().get(0).rulePrecedence());
        Assertions.assertEquals(1628791507, response.pccRules().get(0).ruleQosPolicy().fiveQi());
        Assertions.assertEquals(821138198,
            response.pccRules().get(0).ruleQosPolicy().allocationAndRetentionPriorityLevel());
        Assertions.assertEquals(PreemptionCapability.NOT_PREEMPT,
            response.pccRules().get(0).ruleQosPolicy().preemptionCapability());
        Assertions.assertEquals(PreemptionVulnerability.PREEMPTABLE,
            response.pccRules().get(0).ruleQosPolicy().preemptionVulnerability());
        Assertions.assertEquals("arbgjekgl", response.pccRules().get(0).ruleQosPolicy().maximumBitRate().uplink());
        Assertions.assertEquals("lbyulidwcwvmze",
            response.pccRules().get(0).ruleQosPolicy().maximumBitRate().downlink());
        Assertions.assertEquals("hzdtxetlgydlh",
            response.pccRules().get(0).ruleQosPolicy().guaranteedBitRate().uplink());
        Assertions.assertEquals("vlnnpx", response.pccRules().get(0).ruleQosPolicy().guaranteedBitRate().downlink());
        Assertions.assertEquals(TrafficControlPermission.ENABLED, response.pccRules().get(0).trafficControl());
        Assertions.assertEquals("fhjirwgdnqzbrfk",
            response.pccRules().get(0).serviceDataFlowTemplates().get(0).templateName());
        Assertions.assertEquals(SdfDirection.UPLINK,
            response.pccRules().get(0).serviceDataFlowTemplates().get(0).direction());
    }
}
