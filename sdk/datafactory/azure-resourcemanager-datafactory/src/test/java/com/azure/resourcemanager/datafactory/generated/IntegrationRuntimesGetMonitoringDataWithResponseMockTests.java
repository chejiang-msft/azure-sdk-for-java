// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeMonitoringData;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class IntegrationRuntimesGetMonitoringDataWithResponseMockTests {
    @Test
    public void testGetMonitoringDataWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"name\":\"ygimohrllxj\",\"nodes\":[{\"nodeName\":\"vnyupszchqwnuddl\",\"availableMemoryInMB\":1536231346,\"cpuUtilization\":369062496,\"concurrentJobsLimit\":1868818718,\"concurrentJobsRunning\":679866047,\"maxConcurrentJobs\":119858132,\"sentBytes\":67.79936,\"receivedBytes\":63.317204,\"\":{\"meoxehynurbwv\":\"datawdxu\",\"rymklztorvwgpjxd\":\"dataiiuqmdaqoqjnvmf\",\"uavotfmgtxz\":\"dataiiutdzhkbc\"}},{\"nodeName\":\"dzqmlkrx\",\"availableMemoryInMB\":1365369416,\"cpuUtilization\":1361138327,\"concurrentJobsLimit\":1201070487,\"concurrentJobsRunning\":55729362,\"maxConcurrentJobs\":1590635251,\"sentBytes\":42.207695,\"receivedBytes\":31.539654,\"\":{\"kjirti\":\"datamy\",\"gonrrarznlrr\":\"databvyud\",\"udfhclssedxiigw\":\"datasexaejbmtoun\"}}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        DataFactoryManager manager =
            DataFactoryManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        IntegrationRuntimeMonitoringData response =
            manager
                .integrationRuntimes()
                .getMonitoringDataWithResponse(
                    "pnsbbhdjeegllcy", "ihy", "dgukfmkqokzvx", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("ygimohrllxj", response.name());
    }
}
