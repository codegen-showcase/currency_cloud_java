
package com.currencycloud.sdk;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.model.TransfersFindOrderAscDescEnum;
import com.currencycloud.sdk.model.TransfersFindOrderEnum;
import com.currencycloud.sdk.model.TransfersFindStatusEnum;
import com.currencycloud.sdk.resources.transfers.params.CancelRequest;
import com.currencycloud.sdk.resources.transfers.params.CreateRequest;
import com.currencycloud.sdk.resources.transfers.params.FindRequest;
import com.currencycloud.sdk.resources.transfers.params.GetRequest;
import org.junit.jupiter.api.Test;


public final class TransfersTestClient {
    @Test
    void testFind200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.transfers().find(FindRequest
                                    .builder()
                                    .amountFrom(123.45)
                                    .amountTo(123.45)
                                    .completedAtFrom("1970-01-01T00:00:00")
                                    .completedAtTo("1970-01-01T00:00:00")
                                    .createdAtFrom("1970-01-01T00:00:00")
                                    .createdAtTo("1970-01-01T00:00:00")
                                    .creatorAccountId("string")
                                    .creatorContactId("string")
                                    .currency("string")
                                    .destinationAccountId("string")
                                    .onBehalfOf("string")
                                    .order(TransfersFindOrderEnum.COMPLETED_AT)
                                    .orderAscDesc(TransfersFindOrderAscDescEnum.ASC)
                                    .page(123L)
                                    .perPage(123L)
                                    .shortReference("string")
                                    .sourceAccountId("string")
                                    .status(TransfersFindStatusEnum.CANCELLED)
                                    .uniqueRequestId("string")
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
            client.transfers().find(FindRequest
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
            client.transfers().get(GetRequest
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
            client.transfers().get(GetRequest
                                   .builder()
                                   .id("string")
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
            client.transfers().create(CreateRequest
                                      .builder()
                                      .amount(123.45)
                                      .currency("string")
                                      .destinationAccountId("string")
                                      .reason("string")
                                      .sourceAccountId("string")
                                      .uniqueRequestId("string")
                                      .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testCancel200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.transfers().cancel(CancelRequest
                                      .builder()
                                      .id("string")
                                      .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
}
