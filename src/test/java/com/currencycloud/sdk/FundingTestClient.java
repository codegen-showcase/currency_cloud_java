
package com.currencycloud.sdk;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.model.FundingFindAccountsOrderAscDescEnum;
import com.currencycloud.sdk.model.FundingFindAccountsPaymentTypeEnum;
import com.currencycloud.sdk.resources.funding.params.FindAccountsRequest;
import com.currencycloud.sdk.resources.funding.params.GetTransactionRequest;
import org.junit.jupiter.api.Test;


public final class FundingTestClient {
    @Test
    void testFindAccounts200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.funding().findAccounts(FindAccountsRequest
                                          .builder()
                                          .currency("string")
                                          .accountId("string")
                                          .onBehalfOf("string")
                                          .order("string")
                                          .orderAscDesc(FundingFindAccountsOrderAscDescEnum.ASC)
                                          .page(123L)
                                          .paymentType(FundingFindAccountsPaymentTypeEnum.PRIORITY)
                                          .perPage(123L)
                                          .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testFindAccounts200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.funding().findAccounts(FindAccountsRequest
                                          .builder()
                                          .currency("string")
                                          .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetTransaction200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.funding().getTransaction(GetTransactionRequest
                                            .builder()
                                            .id("string")
                                            .onBehalfOf("string")
                                            .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetTransaction200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.funding().getTransaction(GetTransactionRequest
                                            .builder()
                                            .id("string")
                                            .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
}
