
package com.currencycloud.sdk;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.model.ReportsFindReportRequestsOrderAscDescEnum;
import com.currencycloud.sdk.model.ReportsFindReportRequestsReportTypeEnum;
import com.currencycloud.sdk.model.ReportsFindReportRequestsScopeEnum;
import com.currencycloud.sdk.model.ReportsFindReportRequestsStatusEnum;
import com.currencycloud.sdk.model.ReportsGenerateConversionReportBodyClientStatusEnum;
import com.currencycloud.sdk.model.ReportsGenerateConversionReportBodyScopeEnum;
import com.currencycloud.sdk.resources.reports.params.FindReportRequestsRequest;
import com.currencycloud.sdk.resources.reports.params.GenerateConversionReportRequest;
import com.currencycloud.sdk.resources.reports.params.GeneratePaymentReportRequest;
import com.currencycloud.sdk.resources.reports.params.GetReportRequestsRequest;
import org.junit.jupiter.api.Test;


public final class ReportsTestClient {
    @Test
    void testFindReportRequests200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.reports().findReportRequests(FindReportRequestsRequest
                                                .builder()
                                                .createdAtFrom("1970-01-01")
                                                .createdAtTo("1970-01-01")
                                                .description("string")
                                                .expirationDateFrom("1970-01-01")
                                                .expirationDateTo("1970-01-01")
                                                .order("string")
                                                .orderAscDesc(ReportsFindReportRequestsOrderAscDescEnum.ASC)
                                                .page(123L)
                                                .perPage(123L)
                                                .reportType(ReportsFindReportRequestsReportTypeEnum.BENEFICIARY)
                                                .scope(ReportsFindReportRequestsScopeEnum.ALL)
                                                .shortReference("string")
                                                .status(ReportsFindReportRequestsStatusEnum.COMPLETED)
                                                .updatedAtFrom("1970-01-01")
                                                .updatedAtTo("1970-01-01")
                                                .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testFindReportRequests200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.reports().findReportRequests(FindReportRequestsRequest
                                                .builder()
                                                .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetReportRequests200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.reports().getReportRequests(GetReportRequestsRequest
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
    void testGetReportRequests200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.reports().getReportRequests(GetReportRequestsRequest
                                               .builder()
                                               .id("string")
                                               .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGenerateConversionReport200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.reports().generateConversionReport(GenerateConversionReportRequest
                    .builder()
                    .buyCurrency("string")
                    .clientBuyAmountFrom("string")
                    .clientBuyAmountTo("string")
                    .clientSellAmountFrom("string")
                    .clientSellAmountTo("string")
                    .clientStatus(ReportsGenerateConversionReportBodyClientStatusEnum.AWAITING_AUTHORISATION)
                    .conversionDateFrom("1970-01-01")
                    .conversionDateTo("1970-01-01")
                    .createdAtFrom("1970-01-01")
                    .createdAtTo("1970-01-01")
                    .description("string")
                    .onBehalfOf("string")
                    .partnerBuyAmountFrom("string")
                    .partnerBuyAmountTo("string")
                    .partnerSellAmountFrom("string")
                    .partnerSellAmountTo("string")
                    .scope(ReportsGenerateConversionReportBodyScopeEnum.ALL)
                    .sellCurrency("string")
                    .settlementDateFrom("1970-01-01")
                    .settlementDateTo("1970-01-01")
                    .uniqueRequestId("string")
                    .updatedAtFrom("1970-01-01")
                    .updatedAtTo("1970-01-01")
                    .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGeneratePaymentReport200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.reports().generatePaymentReport(GeneratePaymentReportRequest
                                                   .builder()
                                                   .amountFrom(123.45)
                                                   .amountTo(123.45)
                                                   .beneficiaryId("string")
                                                   .bulkUploadReference("string")
                                                   .conversionId("string")
                                                   .createdAtFrom("1970-01-01")
                                                   .createdAtTo("1970-01-01")
                                                   .currency("string")
                                                   .description("string")
                                                   .onBehalfOf("string")
                                                   .paymentDateFrom("1970-01-01")
                                                   .paymentDateTo("1970-01-01")
                                                   .paymentGroupId("string")
                                                   .scope("string")
                                                   .status("string")
                                                   .transferredAtFrom("1970-01-01")
                                                   .transferredAtTo("1970-01-01")
                                                   .uniqueRequestId("string")
                                                   .updatedAtFrom("1970-01-01")
                                                   .updatedAtTo("1970-01-01")
                                                   .withDeleted(true)
                                                   .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
}
