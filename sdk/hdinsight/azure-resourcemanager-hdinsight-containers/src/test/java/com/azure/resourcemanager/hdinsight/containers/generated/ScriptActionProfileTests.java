// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ScriptActionProfile;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ScriptActionProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScriptActionProfile model =
            BinaryData
                .fromString(
                    "{\"type\":\"cslyjpk\",\"name\":\"idzyexznelixhnr\",\"url\":\"tfolhbnx\",\"parameters\":\"alaulppggdtpnapn\",\"services\":[\"ropuhpigv\",\"gylgqgitxmedjvcs\",\"ynqwwncwzzhxgk\",\"rmgucnap\"],\"timeoutInMinutes\":1324416407,\"shouldPersist\":true}")
                .toObject(ScriptActionProfile.class);
        Assertions.assertEquals("cslyjpk", model.type());
        Assertions.assertEquals("idzyexznelixhnr", model.name());
        Assertions.assertEquals("tfolhbnx", model.url());
        Assertions.assertEquals("alaulppggdtpnapn", model.parameters());
        Assertions.assertEquals("ropuhpigv", model.services().get(0));
        Assertions.assertEquals(1324416407, model.timeoutInMinutes());
        Assertions.assertEquals(true, model.shouldPersist());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScriptActionProfile model =
            new ScriptActionProfile()
                .withType("cslyjpk")
                .withName("idzyexznelixhnr")
                .withUrl("tfolhbnx")
                .withParameters("alaulppggdtpnapn")
                .withServices(Arrays.asList("ropuhpigv", "gylgqgitxmedjvcs", "ynqwwncwzzhxgk", "rmgucnap"))
                .withTimeoutInMinutes(1324416407)
                .withShouldPersist(true);
        model = BinaryData.fromObject(model).toObject(ScriptActionProfile.class);
        Assertions.assertEquals("cslyjpk", model.type());
        Assertions.assertEquals("idzyexznelixhnr", model.name());
        Assertions.assertEquals("tfolhbnx", model.url());
        Assertions.assertEquals("alaulppggdtpnapn", model.parameters());
        Assertions.assertEquals("ropuhpigv", model.services().get(0));
        Assertions.assertEquals(1324416407, model.timeoutInMinutes());
        Assertions.assertEquals(true, model.shouldPersist());
    }
}
