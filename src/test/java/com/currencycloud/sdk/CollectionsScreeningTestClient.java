
package com.currencycloud.sdk;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.model.CollectionsScreeningCompleteBodyReasonEnum;
import com.currencycloud.sdk.resources.collectionsscreening.params.CompleteRequest;
import org.junit.jupiter.api.Test;


public final class CollectionsScreeningTestClient {
    @Test
    void testComplete200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.collectionsScreening().complete(CompleteRequest
                                                   .builder()
                                                   .accepted(true)
                                                   .reason(CollectionsScreeningCompleteBodyReasonEnum.ACCEPTED)
                                                   .transactionId("string")
                                                   .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
}
