// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.test.TestMode;
import com.azure.core.test.TestProxyTestBase;
import com.azure.core.test.http.AssertingHttpClientBuilder;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Configuration;
import com.azure.identity.DefaultAzureCredentialBuilder;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public class DeviceUpdateClientSyncStackTests extends TestProxyTestBase {
    protected DeviceUpdateClient deviceUpdateClient;
    protected RequestOptions requestOptions;

    @Override
    protected void beforeTest() {
        DeviceUpdateClientBuilder deviceUpdateClientbuilder =
            new DeviceUpdateClientBuilder()
                .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", TestData.ACCOUNT_ENDPOINT))
                .instanceId(Configuration.getGlobalConfiguration().get("INSTANCEID", TestData.INSTANCE_ID))
                .httpClient(buildSyncAssertingClient(HttpClient.createDefault()))
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            deviceUpdateClientbuilder
                .httpClient(buildSyncAssertingClient(interceptorManager.getPlaybackClient()))
                .credential(request -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)));
        } else if (getTestMode() == TestMode.RECORD) {
            deviceUpdateClientbuilder
                .addPolicy(interceptorManager.getRecordPolicy())
                .credential(new DefaultAzureCredentialBuilder().build());
        } else if (getTestMode() == TestMode.LIVE) {
            deviceUpdateClientbuilder.credential(new DefaultAzureCredentialBuilder().build());
        }
        deviceUpdateClient = deviceUpdateClientbuilder.buildClient();

        requestOptions = new RequestOptions();
    }

    @Test
    public void testListProviders() {
        PagedIterable<BinaryData> response = deviceUpdateClient.listProviders(requestOptions);
        Assertions.assertEquals(200, response.iterableByPage().iterator().next().getStatusCode());
        Assertions.assertTrue(response.stream().findAny().isPresent());
    }

    @Test
    public void testListNames() {
        PagedIterable<BinaryData> response = deviceUpdateClient.listNames(TestData.PROVIDER, requestOptions);
        Assertions.assertEquals(200, response.iterableByPage().iterator().next().getStatusCode());
        Assertions.assertTrue(response.stream().findAny().isPresent());
    }

    @Test
    public void testListVersions() {
        PagedIterable<BinaryData> response = deviceUpdateClient.listVersions(TestData.PROVIDER, TestData.NAME, requestOptions);
        Assertions.assertEquals(200, response.iterableByPage().iterator().next().getStatusCode());
        Assertions.assertTrue(response.stream().findAny().isPresent());
    }

    @Test
    public void testListFiles() {
        PagedIterable<BinaryData> response =
            deviceUpdateClient.listFiles(TestData.PROVIDER, TestData.NAME, TestData.VERSION, requestOptions);
        Assertions.assertEquals(200, response.iterableByPage().iterator().next().getStatusCode());
        Assertions.assertTrue(response.stream().findAny().isPresent());
    }

    @Test
    public void testGetFile() {
        Response<BinaryData> response =
            deviceUpdateClient.getFileWithResponse(TestData.PROVIDER, TestData.NAME, TestData.VERSION, TestData.FILE_ID, requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertNotNull(response.getValue());
    }

    @Test
    public void testListUpdates() {
        PagedIterable<BinaryData> response = deviceUpdateClient.listUpdates(requestOptions);
        Assertions.assertEquals(200, response.iterableByPage().iterator().next().getStatusCode());
        Assertions.assertTrue(response.stream().findAny().isPresent());
    }

    @Test
    public void testGetUpdate() {
        Response<BinaryData> response =
            deviceUpdateClient.getUpdateWithResponse(TestData.PROVIDER, TestData.NAME, TestData.VERSION, requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertNotNull(response.getValue());
    }

    private HttpClient buildSyncAssertingClient(HttpClient httpClient) {
        return new AssertingHttpClientBuilder(httpClient)
            .skipRequest((ignored1, ignored2) -> false)
            .assertSync()
            .build();
    }
}
