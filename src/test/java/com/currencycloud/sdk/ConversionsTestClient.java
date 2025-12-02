
package com.currencycloud.sdk;

import java.util.List;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.model.ConversionsCreateBodyConversionDatePreferenceEnum;
import com.currencycloud.sdk.model.ConversionsCreateBodyFixedSideEnum;
import com.currencycloud.sdk.model.ConversionsFindOrderAscDescEnum;
import com.currencycloud.sdk.model.ConversionsFindScopeEnum;
import com.currencycloud.sdk.model.ConversionsFindStatusEnum;
import com.currencycloud.sdk.model.ConversionsProfitAndLossOrderAscDescEnum;
import com.currencycloud.sdk.model.ConversionsProfitAndLossScopeEnum;
import com.currencycloud.sdk.resources.conversions.params.CancelRequest;
import com.currencycloud.sdk.resources.conversions.params.CancellationQuoteRequest;
import com.currencycloud.sdk.resources.conversions.params.CreateRequest;
import com.currencycloud.sdk.resources.conversions.params.DateChangeQuoteRequest;
import com.currencycloud.sdk.resources.conversions.params.DateChangeRequest;
import com.currencycloud.sdk.resources.conversions.params.FindRequest;
import com.currencycloud.sdk.resources.conversions.params.GetRequest;
import com.currencycloud.sdk.resources.conversions.params.ProfitAndLossRequest;
import com.currencycloud.sdk.resources.conversions.params.SplitHistoryRequest;
import com.currencycloud.sdk.resources.conversions.params.SplitPreviewRequest;
import com.currencycloud.sdk.resources.conversions.params.SplitRequest;
import org.junit.jupiter.api.Test;


public final class ConversionsTestClient {
    @Test
    void testFind200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.conversions().find(FindRequest
                                      .builder()
                                      .buyAmountFrom("string")
                                      .buyAmountTo("string")
                                      .buyCurrency("string")
                                      .conversionDateFrom("string")
                                      .conversionDateTo("string")
                                      .conversionIds(List.of(
                                                  "string"
                                              ))
                                      .createdAtFrom("string")
                                      .createdAtTo("string")
                                      .currencyPair("string")
                                      .onBehalfOf("string")
                                      .order("string")
                                      .orderAscDesc(ConversionsFindOrderAscDescEnum.ASC)
                                      .page(123L)
                                      .partnerBuyAmountFrom("string")
                                      .partnerBuyAmountTo("string")
                                      .partnerSellAmountFrom("string")
                                      .partnerSellAmountTo("string")
                                      .perPage(123L)
                                      .scope(ConversionsFindScopeEnum.ALL)
                                      .sellAmountFrom("string")
                                      .sellAmountTo("string")
                                      .sellCurrency("string")
                                      .settlementDateFrom("string")
                                      .settlementDateTo("string")
                                      .shortReference("string")
                                      .status(ConversionsFindStatusEnum.AWAITING_FUNDS)
                                      .uniqueRequestId("string")
                                      .updatedAtFrom("string")
                                      .updatedAtTo("string")
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
            client.conversions().find(FindRequest
                                      .builder()
                                      .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testProfitAndLoss200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.conversions().profitAndLoss(ProfitAndLossRequest
                                               .builder()
                                               .accountId("string")
                                               .amountFrom("string")
                                               .amountTo("string")
                                               .contactId("string")
                                               .conversionId("string")
                                               .currency("string")
                                               .eventDateTimeFrom("string")
                                               .eventDateTimeTo("string")
                                               .eventType("string")
                                               .order("string")
                                               .orderAscDesc(ConversionsProfitAndLossOrderAscDescEnum.ASC)
                                               .page("string")
                                               .perPage("string")
                                               .scope(ConversionsProfitAndLossScopeEnum.ALL)
                                               .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testProfitAndLoss200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.conversions().profitAndLoss(ProfitAndLossRequest
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
            client.conversions().get(GetRequest
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
            client.conversions().get(GetRequest
                                     .builder()
                                     .id("string")
                                     .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testCancellationQuote200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.conversions().cancellationQuote(CancellationQuoteRequest
                                                   .builder()
                                                   .id("string")
                                                   .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testDateChangeQuote200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.conversions().dateChangeQuote(DateChangeQuoteRequest
                                                 .builder()
                                                 .id("string")
                                                 .newSettlementDate("string")
                                                 .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testSplitHistory200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.conversions().splitHistory(SplitHistoryRequest
                                              .builder()
                                              .id("string")
                                              .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testSplitPreview200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.conversions().splitPreview(SplitPreviewRequest
                                              .builder()
                                              .id("string")
                                              .amount("string")
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
            client.conversions().create(CreateRequest
                                        .builder()
                                        .amount("string")
                                        .buyCurrency("string")
                                        .clientBuyAmount("string")
                                        .clientSellAmount("string")
                                        .conversionDate("1970-01-01")
                                        .conversionDatePreference(ConversionsCreateBodyConversionDatePreferenceEnum.DEFAULT)
                                        .fixedSide(ConversionsCreateBodyFixedSideEnum.BUY)
                                        .onBehalfOf("string")
                                        .reason("string")
                                        .sellCurrency("string")
                                        .termAgreement(true)
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
            client.conversions().cancel(CancelRequest
                                        .builder()
                                        .notes("string")
                                        .id("string")
                                        .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testDateChange200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.conversions().dateChange(DateChangeRequest
                                            .builder()
                                            .newSettlementDate("string")
                                            .id("string")
                                            .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testSplit200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.conversions().split(SplitRequest
                                       .builder()
                                       .amount("string")
                                       .id("string")
                                       .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
}
