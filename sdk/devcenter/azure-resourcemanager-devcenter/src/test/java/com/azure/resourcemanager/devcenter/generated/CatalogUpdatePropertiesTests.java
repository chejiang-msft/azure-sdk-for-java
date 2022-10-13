// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.CatalogUpdateProperties;
import com.azure.resourcemanager.devcenter.models.GitCatalog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CatalogUpdatePropertiesTests {
    @Test
    public void testDeserialize() {
        CatalogUpdateProperties model =
            BinaryData
                .fromString(
                    "{\"gitHub\":{\"uri\":\"wankixzbi\",\"branch\":\"eputtmrywnuzoqf\",\"secretIdentifier\":\"yqzrnkcqvyxlw\",\"path\":\"lsicohoqqnwv\"},\"adoGit\":{\"uri\":\"avwhheunm\",\"branch\":\"hgyxzkonoc\",\"secretIdentifier\":\"oklyaxuconuq\",\"path\":\"fkbey\"}}")
                .toObject(CatalogUpdateProperties.class);
        Assertions.assertEquals("wankixzbi", model.gitHub().uri());
        Assertions.assertEquals("eputtmrywnuzoqf", model.gitHub().branch());
        Assertions.assertEquals("yqzrnkcqvyxlw", model.gitHub().secretIdentifier());
        Assertions.assertEquals("lsicohoqqnwv", model.gitHub().path());
        Assertions.assertEquals("avwhheunm", model.adoGit().uri());
        Assertions.assertEquals("hgyxzkonoc", model.adoGit().branch());
        Assertions.assertEquals("oklyaxuconuq", model.adoGit().secretIdentifier());
        Assertions.assertEquals("fkbey", model.adoGit().path());
    }

    @Test
    public void testSerialize() {
        CatalogUpdateProperties model =
            new CatalogUpdateProperties()
                .withGitHub(
                    new GitCatalog()
                        .withUri("wankixzbi")
                        .withBranch("eputtmrywnuzoqf")
                        .withSecretIdentifier("yqzrnkcqvyxlw")
                        .withPath("lsicohoqqnwv"))
                .withAdoGit(
                    new GitCatalog()
                        .withUri("avwhheunm")
                        .withBranch("hgyxzkonoc")
                        .withSecretIdentifier("oklyaxuconuq")
                        .withPath("fkbey"));
        model = BinaryData.fromObject(model).toObject(CatalogUpdateProperties.class);
        Assertions.assertEquals("wankixzbi", model.gitHub().uri());
        Assertions.assertEquals("eputtmrywnuzoqf", model.gitHub().branch());
        Assertions.assertEquals("yqzrnkcqvyxlw", model.gitHub().secretIdentifier());
        Assertions.assertEquals("lsicohoqqnwv", model.gitHub().path());
        Assertions.assertEquals("avwhheunm", model.adoGit().uri());
        Assertions.assertEquals("hgyxzkonoc", model.adoGit().branch());
        Assertions.assertEquals("oklyaxuconuq", model.adoGit().secretIdentifier());
        Assertions.assertEquals("fkbey", model.adoGit().path());
    }
}