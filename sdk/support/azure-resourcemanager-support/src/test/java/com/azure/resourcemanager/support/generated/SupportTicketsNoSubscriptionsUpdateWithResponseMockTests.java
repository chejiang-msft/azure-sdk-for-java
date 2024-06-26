// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.support.SupportManager;
import com.azure.resourcemanager.support.models.Consent;
import com.azure.resourcemanager.support.models.PreferredContactMethod;
import com.azure.resourcemanager.support.models.SecondaryConsent;
import com.azure.resourcemanager.support.models.SeverityLevel;
import com.azure.resourcemanager.support.models.Status;
import com.azure.resourcemanager.support.models.SupportTicketDetails;
import com.azure.resourcemanager.support.models.UpdateContactProfile;
import com.azure.resourcemanager.support.models.UpdateSupportTicket;
import com.azure.resourcemanager.support.models.UserConsent;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SupportTicketsNoSubscriptionsUpdateWithResponseMockTests {
    @Test
    public void testUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"supportTicketId\":\"dscwxqupevzhf\",\"description\":\"totxhojujb\",\"problemClassificationId\":\"pelmcuvhixbjxyf\",\"problemClassificationDisplayName\":\"yl\",\"severity\":\"highestcriticalimpact\",\"enrollmentId\":\"o\",\"require24X7Response\":true,\"advancedDiagnosticConsent\":\"No\",\"problemScopingQuestions\":\"kiwkkbnujr\",\"supportPlanId\":\"vtylbfpncu\",\"contactDetails\":{\"firstName\":\"doiwi\",\"lastName\":\"thtywub\",\"preferredContactMethod\":\"email\",\"primaryEmailAddress\":\"bihwqknfdnt\",\"additionalEmailAddresses\":[\"hrdgoihxumwcto\",\"dzjlu\",\"dfdlwggyts\",\"wtovvtgsein\"],\"phoneNumber\":\"iufxqknpir\",\"preferredTimeZone\":\"nepttwqmsni\",\"country\":\"fcdmqnrojlpijn\",\"preferredSupportLanguage\":\"rxfrddhc\"},\"serviceLevelAgreement\":{\"startTime\":\"2021-10-24T17:40:19Z\",\"expirationTime\":\"2021-08-13T20:41:57Z\",\"slaMinutes\":99900434},\"supportEngineer\":{\"emailAddress\":\"sxiftozq\"},\"supportPlanType\":\"hftwesgog\",\"supportPlanDisplayName\":\"honnxkrlgnyhmos\",\"title\":\"xkk\",\"problemStartTime\":\"2021-10-30T19:25:09Z\",\"serviceId\":\"rrghxjbdhqxvcxgf\",\"serviceDisplayName\":\"dsofbshrns\",\"status\":\"uswdv\",\"createdDate\":\"2021-07-28T13:53:22Z\",\"modifiedDate\":\"2021-02-22T05:56:13Z\",\"fileWorkspaceName\":\"nu\",\"isTemporaryTicket\":\"Yes\",\"technicalTicketDetails\":{\"resourceId\":\"tkfa\"},\"quotaTicketDetails\":{\"quotaChangeRequestSubType\":\"pqgik\",\"quotaChangeRequestVersion\":\"irtx\",\"quotaChangeRequests\":[{\"region\":\"zejntps\",\"payload\":\"gioilqu\"},{\"region\":\"ydxtqm\",\"payload\":\"ox\"},{\"region\":\"ggufhyaomtb\",\"payload\":\"havgrvk\"}]},\"secondaryConsent\":[{\"userConsent\":\"No\",\"type\":\"hpjbib\"},{\"userConsent\":\"No\",\"type\":\"xumvfcluyovw\"},{\"userConsent\":\"No\",\"type\":\"fezzxscyhwzdg\"},{\"userConsent\":\"Yes\",\"type\":\"bzbomvzzbtdcqvpn\"}]},\"id\":\"yujviylwdshfssn\",\"name\":\"bgye\",\"type\":\"rymsgaojfmw\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SupportManager manager = SupportManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        SupportTicketDetails response = manager.supportTicketsNoSubscriptions()
            .updateWithResponse("brnjwmw",
                new UpdateSupportTicket().withSeverity(SeverityLevel.HIGHESTCRITICALIMPACT)
                    .withStatus(Status.OPEN)
                    .withContactDetails(new UpdateContactProfile().withFirstName("ejjoqkagfhsxtta")
                        .withLastName("zxnfaaz")
                        .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                        .withPrimaryEmailAddress("n")
                        .withAdditionalEmailAddresses(Arrays.asList("kqjjlwuenvrkp", "ou"))
                        .withPhoneNumber("bre")
                        .withPreferredTimeZone("aays")
                        .withCountry("ixqtn")
                        .withPreferredSupportLanguage("tezlwff"))
                    .withAdvancedDiagnosticConsent(Consent.NO)
                    .withSecondaryConsent(
                        Arrays.asList(new SecondaryConsent().withUserConsent(UserConsent.YES).withType("qmt"),
                            new SecondaryConsent().withUserConsent(UserConsent.YES).withType("mmji"),
                            new SecondaryConsent().withUserConsent(UserConsent.YES).withType("zphv"),
                            new SecondaryConsent().withUserConsent(UserConsent.NO).withType("qncygupkvi"))),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("dscwxqupevzhf", response.supportTicketId());
        Assertions.assertEquals("totxhojujb", response.description());
        Assertions.assertEquals("pelmcuvhixbjxyf", response.problemClassificationId());
        Assertions.assertEquals(SeverityLevel.HIGHESTCRITICALIMPACT, response.severity());
        Assertions.assertEquals("o", response.enrollmentId());
        Assertions.assertEquals(true, response.require24X7Response());
        Assertions.assertEquals(Consent.NO, response.advancedDiagnosticConsent());
        Assertions.assertEquals("kiwkkbnujr", response.problemScopingQuestions());
        Assertions.assertEquals("vtylbfpncu", response.supportPlanId());
        Assertions.assertEquals("doiwi", response.contactDetails().firstName());
        Assertions.assertEquals("thtywub", response.contactDetails().lastName());
        Assertions.assertEquals(PreferredContactMethod.EMAIL, response.contactDetails().preferredContactMethod());
        Assertions.assertEquals("bihwqknfdnt", response.contactDetails().primaryEmailAddress());
        Assertions.assertEquals("hrdgoihxumwcto", response.contactDetails().additionalEmailAddresses().get(0));
        Assertions.assertEquals("iufxqknpir", response.contactDetails().phoneNumber());
        Assertions.assertEquals("nepttwqmsni", response.contactDetails().preferredTimeZone());
        Assertions.assertEquals("fcdmqnrojlpijn", response.contactDetails().country());
        Assertions.assertEquals("rxfrddhc", response.contactDetails().preferredSupportLanguage());
        Assertions.assertEquals("xkk", response.title());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-30T19:25:09Z"), response.problemStartTime());
        Assertions.assertEquals("rrghxjbdhqxvcxgf", response.serviceId());
        Assertions.assertEquals("nu", response.fileWorkspaceName());
        Assertions.assertEquals("tkfa", response.technicalTicketDetails().resourceId());
        Assertions.assertEquals("pqgik", response.quotaTicketDetails().quotaChangeRequestSubType());
        Assertions.assertEquals("irtx", response.quotaTicketDetails().quotaChangeRequestVersion());
        Assertions.assertEquals("zejntps", response.quotaTicketDetails().quotaChangeRequests().get(0).region());
        Assertions.assertEquals("gioilqu", response.quotaTicketDetails().quotaChangeRequests().get(0).payload());
        Assertions.assertEquals(UserConsent.NO, response.secondaryConsent().get(0).userConsent());
        Assertions.assertEquals("hpjbib", response.secondaryConsent().get(0).type());
    }
}
