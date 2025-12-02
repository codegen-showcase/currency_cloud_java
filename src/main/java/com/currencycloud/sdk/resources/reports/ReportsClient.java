
package com.currencycloud.sdk.resources.reports;

import java.io.IOException;
import java.util.Map;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.core.BaseClient;
import com.currencycloud.sdk.core.HttpRequestBuilder;
import com.currencycloud.sdk.core.RequestOptions;
import com.currencycloud.sdk.core.ResponseHandler;
import com.currencycloud.sdk.model.ReportRequest;
import com.currencycloud.sdk.model.ReportsFindReportRequestsResponse;
import com.currencycloud.sdk.model.ReportsGenerateConversionReportBody;
import com.currencycloud.sdk.model.ReportsGeneratePaymentReportBody;
import com.currencycloud.sdk.resources.reports.params.FindReportRequestsRequest;
import com.currencycloud.sdk.resources.reports.params.GenerateConversionReportRequest;
import com.currencycloud.sdk.resources.reports.params.GeneratePaymentReportRequest;
import com.currencycloud.sdk.resources.reports.params.GetReportRequestsRequest;


public class ReportsClient {
    protected final BaseClient baseClient;

    public ReportsClient(BaseClient baseClient) {
        this.baseClient = baseClient;

    }

    /**
    * Find Report Requests
    *
    * Searches for report requests made. Returns a JSON structure with details of matching report requests.
    *
    * GET /reports/report_requests/find
    */
    public ReportsFindReportRequestsResponse findReportRequests() {
        return findReportRequests(FindReportRequestsRequest.builder().build(), null);
    }


    /**
    * Find Report Requests
    *
    * Searches for report requests made. Returns a JSON structure with details of matching report requests.
    *
    * GET /reports/report_requests/find
    */
    public ReportsFindReportRequestsResponse findReportRequests(FindReportRequestsRequest request) {
        return findReportRequests(request, null);
    }


    /**
    * Find Report Requests
    *
    * Searches for report requests made. Returns a JSON structure with details of matching report requests.
    *
    * GET /reports/report_requests/find
    */
    public ReportsFindReportRequestsResponse findReportRequests(FindReportRequestsRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/reports/report_requests/find")
            .addQueryParam("created_at_from", request.getCreatedAtFrom(), "form", true)
            .addQueryParam("created_at_to", request.getCreatedAtTo(), "form", true)
            .addQueryParam("description", request.getDescription(), "form", true)
            .addQueryParam("expiration_date_from", request.getExpirationDateFrom(), "form", true)
            .addQueryParam("expiration_date_to", request.getExpirationDateTo(), "form", true)
            .addQueryParam("order", request.getOrder(), "form", true)
            .addQueryParam("order_asc_desc", request.getOrderAscDesc(), "form", true)
            .addQueryParam("page", request.getPage(), "form", true)
            .addQueryParam("per_page", request.getPerPage(), "form", true)
            .addQueryParam("report_type", request.getReportType(), "form", true)
            .addQueryParam("scope", request.getScope(), "form", true)
            .addQueryParam("short_reference", request.getShortReference(), "form", true)
            .addQueryParam("status", request.getStatus(), "form", true)
            .addQueryParam("updated_at_from", request.getUpdatedAtFrom(), "form", true)
            .addQueryParam("updated_at_to", request.getUpdatedAtTo(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, ReportsFindReportRequestsResponse.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Retrieves a Report Request with the given ID
    *
    * Searches for a report by ID. Returns a JSON structure with details of the specified report request.
    *
    * GET /reports/report_requests/{id}
    */
    public ReportRequest getReportRequests(GetReportRequestsRequest request) {
        return getReportRequests(request, null);
    }


    /**
    * Retrieves a Report Request with the given ID
    *
    * Searches for a report by ID. Returns a JSON structure with details of the specified report request.
    *
    * GET /reports/report_requests/{id}
    */
    public ReportRequest getReportRequests(GetReportRequestsRequest request,
                                           RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/reports/report_requests/{id}")
            .addPathParam("id", request.getId())
            .addQueryParam("on_behalf_of", request.getOnBehalfOf(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, ReportRequest.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Generate Conversion Report
    *
    * Returns a JSON structure with details of the conversion report requested.
    *
    * POST /reports/conversions/create
    */
    public ReportRequest generateConversionReport(GenerateConversionReportRequest request) {
        return generateConversionReport(request, null);
    }


    /**
    * Generate Conversion Report
    *
    * Returns a JSON structure with details of the conversion report requested.
    *
    * POST /reports/conversions/create
    */
    public ReportRequest generateConversionReport(GenerateConversionReportRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/reports/conversions/create")
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(ReportsGenerateConversionReportBody.builder().buyCurrency(
                                       request.getBuyCurrency()).clientBuyAmountFrom(request.getClientBuyAmountFrom()).clientBuyAmountTo(
                                       request.getClientBuyAmountTo()).clientSellAmountFrom(
                                       request.getClientSellAmountFrom()).clientSellAmountTo(request.getClientSellAmountTo()).clientStatus(
                                       request.getClientStatus()).conversionDateFrom(request.getConversionDateFrom()).conversionDateTo(
                                       request.getConversionDateTo()).createdAtFrom(request.getCreatedAtFrom()).createdAtTo(
                                       request.getCreatedAtTo()).description(request.getDescription()).onBehalfOf(
                                       request.getOnBehalfOf()).partnerBuyAmountFrom(request.getPartnerBuyAmountFrom()).partnerBuyAmountTo(
                                       request.getPartnerBuyAmountTo()).partnerSellAmountFrom(
                                       request.getPartnerSellAmountFrom()).partnerSellAmountTo(request.getPartnerSellAmountTo()).scope(
                                       request.getScope()).sellCurrency(request.getSellCurrency()).settlementDateFrom(
                                       request.getSettlementDateFrom()).settlementDateTo(request.getSettlementDateTo()).uniqueRequestId(
                                       request.getUniqueRequestId()).updatedAtFrom(request.getUpdatedAtFrom()).updatedAtTo(
                                       request.getUpdatedAtTo()).build(), Map.ofEntries(Map.entry("buy_currency", "form"),
                                               Map.entry("client_buy_amount_from", "form"), Map.entry("client_buy_amount_to", "form"),
                                               Map.entry("client_sell_amount_from", "form"), Map.entry("client_sell_amount_to", "form"),
                                               Map.entry("client_status", "form"), Map.entry("conversion_date_from", "form"),
                                               Map.entry("conversion_date_to", "form"), Map.entry("created_at_from", "form"),
                                               Map.entry("created_at_to", "form"), Map.entry("description", "form"), Map.entry("on_behalf_of",
                                                       "form"), Map.entry("partner_buy_amount_from", "form"), Map.entry("partner_buy_amount_to", "form"),
                                               Map.entry("partner_sell_amount_from", "form"), Map.entry("partner_sell_amount_to", "form"),
                                               Map.entry("scope", "form"), Map.entry("sell_currency", "form"), Map.entry("settlement_date_from",
                                                       "form"), Map.entry("settlement_date_to", "form"), Map.entry("unique_request_id", "form"),
                                               Map.entry("updated_at_from", "form"), Map.entry("updated_at_to", "form")),
                                   Map.ofEntries(Map.entry("buy_currency", true), Map.entry("client_buy_amount_from", true),
                                                 Map.entry("client_buy_amount_to", true), Map.entry("client_sell_amount_from", true),
                                                 Map.entry("client_sell_amount_to", true), Map.entry("client_status", true),
                                                 Map.entry("conversion_date_from", true), Map.entry("conversion_date_to", true),
                                                 Map.entry("created_at_from", true), Map.entry("created_at_to", true), Map.entry("description",
                                                         true), Map.entry("on_behalf_of", true), Map.entry("partner_buy_amount_from", true),
                                                 Map.entry("partner_buy_amount_to", true), Map.entry("partner_sell_amount_from", true),
                                                 Map.entry("partner_sell_amount_to", true), Map.entry("scope", true), Map.entry("sell_currency",
                                                         true), Map.entry("settlement_date_from", true), Map.entry("settlement_date_to", true),
                                                 Map.entry("unique_request_id", true), Map.entry("updated_at_from", true), Map.entry("updated_at_to",
                                                         true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, ReportRequest.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Generate Payment Report
    *
    * Returns a JSON structure with details of the payments report requested.
    *
    * POST /reports/payments/create
    */
    public ReportRequest generatePaymentReport(GeneratePaymentReportRequest request) {
        return generatePaymentReport(request, null);
    }


    /**
    * Generate Payment Report
    *
    * Returns a JSON structure with details of the payments report requested.
    *
    * POST /reports/payments/create
    */
    public ReportRequest generatePaymentReport(GeneratePaymentReportRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/reports/payments/create")
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(ReportsGeneratePaymentReportBody.builder().amountFrom(
                                       request.getAmountFrom()).amountTo(request.getAmountTo()).beneficiaryId(
                                       request.getBeneficiaryId()).bulkUploadReference(request.getBulkUploadReference()).conversionId(
                                       request.getConversionId()).createdAtFrom(request.getCreatedAtFrom()).createdAtTo(
                                       request.getCreatedAtTo()).currency(request.getCurrency()).description(
                                       request.getDescription()).onBehalfOf(request.getOnBehalfOf()).paymentDateFrom(
                                       request.getPaymentDateFrom()).paymentDateTo(request.getPaymentDateTo()).paymentGroupId(
                                       request.getPaymentGroupId()).scope(request.getScope()).status(
                                       request.getStatus()).transferredAtFrom(request.getTransferredAtFrom()).transferredAtTo(
                                       request.getTransferredAtTo()).uniqueRequestId(request.getUniqueRequestId()).updatedAtFrom(
                                       request.getUpdatedAtFrom()).updatedAtTo(request.getUpdatedAtTo()).withDeleted(
                                       request.getWithDeleted()).build(), Map.ofEntries(Map.entry("amount_from", "form"),
                                               Map.entry("amount_to", "form"), Map.entry("beneficiary_id", "form"),
                                               Map.entry("bulk_upload_reference", "form"), Map.entry("conversion_id", "form"),
                                               Map.entry("created_at_from", "form"), Map.entry("created_at_to", "form"), Map.entry("currency",
                                                       "form"), Map.entry("description", "form"), Map.entry("on_behalf_of", "form"),
                                               Map.entry("payment_date_from", "form"), Map.entry("payment_date_to", "form"),
                                               Map.entry("payment_group_id", "form"), Map.entry("scope", "form"), Map.entry("status", "form"),
                                               Map.entry("transferred_at_from", "form"), Map.entry("transferred_at_to", "form"),
                                               Map.entry("unique_request_id", "form"), Map.entry("updated_at_from", "form"),
                                               Map.entry("updated_at_to", "form"), Map.entry("with_deleted", "form")),
                                   Map.ofEntries(Map.entry("amount_from", true), Map.entry("amount_to", true),
                                                 Map.entry("beneficiary_id", true), Map.entry("bulk_upload_reference", true),
                                                 Map.entry("conversion_id", true), Map.entry("created_at_from", true), Map.entry("created_at_to",
                                                         true), Map.entry("currency", true), Map.entry("description", true), Map.entry("on_behalf_of", true),
                                                 Map.entry("payment_date_from", true), Map.entry("payment_date_to", true),
                                                 Map.entry("payment_group_id", true), Map.entry("scope", true), Map.entry("status", true),
                                                 Map.entry("transferred_at_from", true), Map.entry("transferred_at_to", true),
                                                 Map.entry("unique_request_id", true), Map.entry("updated_at_from", true), Map.entry("updated_at_to",
                                                         true), Map.entry("with_deleted", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, ReportRequest.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }





}
