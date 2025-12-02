
package com.currencycloud.sdk;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.model.BalancesFindOrderAscDescEnum;
import com.currencycloud.sdk.model.BalancesFindOrderEnum;
import com.currencycloud.sdk.model.BalancesFindScopeEnum;
import com.currencycloud.sdk.resources.balances.params.FindRequest;
import com.currencycloud.sdk.resources.balances.params.GetRequest;
import com.currencycloud.sdk.resources.balances.params.TopUpMarginRequest;
import org.junit.jupiter.api.Test;


public final class BalancesTestClient {
    @Test
    void testFind200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.balances().find(FindRequest
                                   .builder()
                                   .amountFrom(123.45)
                                   .amountTo(123.45)
                                   .asAtDate("1970-01-01T00:00:00")
                                   .onBehalfOf("3e4666bf-d5e5-4aa7-b8ce-cefe41c7568a")
                                   .order(BalancesFindOrderEnum.AMOUNT)
                                   .orderAscDesc(BalancesFindOrderAscDescEnum.ASC)
                                   .page(123L)
                                   .perPage(123L)
                                   .scope(BalancesFindScopeEnum.ALL)
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
            client.balances().find(FindRequest
                                   .builder()
                                   .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGet200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.balances().get(GetRequest
                                  .builder()
                                  .currency("string")
                                  .onBehalfOf("3e4666bf-d5e5-4aa7-b8ce-cefe41c7568a")
                                  .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGet200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.balances().get(GetRequest
                                  .builder()
                                  .currency("string")
                                  .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testTopUpMargin200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.balances().topUpMargin(TopUpMarginRequest
                                          .builder()
                                          .amount("string")
                                          .currency("string")
                                          .onBehalfOf("string")
                                          .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
}
