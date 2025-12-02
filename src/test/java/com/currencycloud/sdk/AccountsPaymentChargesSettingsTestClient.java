
package com.currencycloud.sdk;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.resources.accounts.paymentchargessettings.params.CreateRequest;
import com.currencycloud.sdk.resources.accounts.paymentchargessettings.params.ListRequest;
import org.junit.jupiter.api.Test;


public final class AccountsPaymentChargesSettingsTestClient {
    @Test
    void testList200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.accounts().paymentChargesSettings().list(ListRequest
                    .builder()
                    .accountId("string")
                    .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testCreate200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.accounts().paymentChargesSettings().create(CreateRequest
                    .builder()
                    .default_(true)
                    .enabled(true)
                    .accountId("string")
                    .chargeSettingsId("string")
                    .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
}
