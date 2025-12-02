
package com.currencycloud.sdk;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.resources.withdrawalaccounts.find.params.FindRequest;
import com.currencycloud.sdk.resources.withdrawalaccounts.find.params.PullFundsRequest;
import org.junit.jupiter.api.Test;


public final class WithdrawalAccountsFindTestClient {
    @Test
    void testFind200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.withdrawalAccounts().find().find(FindRequest
                                                    .builder()
                                                    .accountId("string")
                                                    .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testFind200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.withdrawalAccounts().find().find(FindRequest
                                                    .builder()
                                                    .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testPullFunds200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.withdrawalAccounts().find().pullFunds(PullFundsRequest
                    .builder()
                    .amount(123.45)
                    .reference("string")
                    .withdrawalAccountId("string")
                    .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
}
