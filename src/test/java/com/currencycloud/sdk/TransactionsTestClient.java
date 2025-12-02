
package com.currencycloud.sdk;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.model.TransactionsFindActionEnum;
import com.currencycloud.sdk.model.TransactionsFindOrderAscDescEnum;
import com.currencycloud.sdk.model.TransactionsFindRelatedEntityTypeEnum;
import com.currencycloud.sdk.model.TransactionsFindScopeEnum;
import com.currencycloud.sdk.model.TransactionsFindStatusEnum;
import com.currencycloud.sdk.model.TransactionsFindTypeEnum;
import com.currencycloud.sdk.resources.transactions.params.FindRequest;
import com.currencycloud.sdk.resources.transactions.params.GetRequest;
import com.currencycloud.sdk.resources.transactions.params.GetSenderDetailsRequest;
import org.junit.jupiter.api.Test;


public final class TransactionsTestClient {
    @Test
    void testFind200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.transactions().find(FindRequest
                                       .builder()
                                       .action(TransactionsFindActionEnum.CONVERSION)
                                       .amount("string")
                                       .amountFrom("string")
                                       .amountTo("string")
                                       .beneficiaryId("string")
                                       .completedAtFrom("1970-01-01T00:00:00")
                                       .completedAtTo("1970-01-01T00:00:00")
                                       .createdAtFrom("1970-01-01T00:00:00")
                                       .createdAtTo("1970-01-01T00:00:00")
                                       .currency("string")
                                       .currencyPair("string")
                                       .onBehalfOf("string")
                                       .order("string")
                                       .orderAscDesc(TransactionsFindOrderAscDescEnum.ASC)
                                       .page(123L)
                                       .perPage(123L)
                                       .relatedEntityId("string")
                                       .relatedEntityShortReference("string")
                                       .relatedEntityType(TransactionsFindRelatedEntityTypeEnum.CONVERSION)
                                       .scope(TransactionsFindScopeEnum.ALL)
                                       .settlesAtFrom("1970-01-01T00:00:00")
                                       .settlesAtTo("1970-01-01T00:00:00")
                                       .status(TransactionsFindStatusEnum.COMPLETED)
                                       .type(TransactionsFindTypeEnum.CREDIT)
                                       .updatedAtFrom("1970-01-01T00:00:00")
                                       .updatedAtTo("1970-01-01T00:00:00")
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
            client.transactions().find(FindRequest
                                       .builder()
                                       .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetSenderDetails200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.transactions().getSenderDetails(GetSenderDetailsRequest
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
    void testGetSenderDetails200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.transactions().getSenderDetails(GetSenderDetailsRequest
                                                   .builder()
                                                   .id("string")
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
            client.transactions().get(GetRequest
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
    void testGet200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.transactions().get(GetRequest
                                      .builder()
                                      .id("string")
                                      .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
}
