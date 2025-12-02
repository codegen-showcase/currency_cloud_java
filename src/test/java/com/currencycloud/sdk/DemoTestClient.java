
package com.currencycloud.sdk;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.model.DemoSimulateFundingBodyActionEnum;
import com.currencycloud.sdk.resources.demo.params.SimulateFundingRequest;
import org.junit.jupiter.api.Test;


public final class DemoTestClient {
    @Test
    void testSimulateFunding200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.demo().simulateFunding(SimulateFundingRequest
                                          .builder()
                                          .action(DemoSimulateFundingBodyActionEnum.APPROVE)
                                          .amount(123.45)
                                          .currency("string")
                                          .id("string")
                                          .onBehalfOf("string")
                                          .receiverAccountNumber("string")
                                          .receiverRoutingCode("string")
                                          .senderAccountNumber("string")
                                          .senderAddress("string")
                                          .senderCountry("string")
                                          .senderName("string")
                                          .senderReference("string")
                                          .senderRoutingCode("string")
                                          .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
}
