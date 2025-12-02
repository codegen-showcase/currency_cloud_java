
package com.currencycloud.sdk.resources.transfers;

import java.io.IOException;
import java.util.Map;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.core.BaseClient;
import com.currencycloud.sdk.core.HttpRequestBuilder;
import com.currencycloud.sdk.core.RequestOptions;
import com.currencycloud.sdk.core.ResponseHandler;
import com.currencycloud.sdk.model.Transfer;
import com.currencycloud.sdk.model.TransfersCreateBody;
import com.currencycloud.sdk.model.TransfersFindResponse;
import com.currencycloud.sdk.resources.transfers.params.CancelRequest;
import com.currencycloud.sdk.resources.transfers.params.CreateRequest;
import com.currencycloud.sdk.resources.transfers.params.FindRequest;
import com.currencycloud.sdk.resources.transfers.params.GetRequest;


public class TransfersClient {
    protected final BaseClient baseClient;

    public TransfersClient(BaseClient baseClient) {
        this.baseClient = baseClient;

    }

    /**
    * Find Transfers
    *
    * Searches for transfer records that meet the given criteria.
    *
    * GET /transfers/find
    */
    public TransfersFindResponse find() {
        return find(FindRequest.builder().build(), null);
    }


    /**
    * Find Transfers
    *
    * Searches for transfer records that meet the given criteria.
    *
    * GET /transfers/find
    */
    public TransfersFindResponse find(FindRequest request) {
        return find(request, null);
    }


    /**
    * Find Transfers
    *
    * Searches for transfer records that meet the given criteria.
    *
    * GET /transfers/find
    */
    public TransfersFindResponse find(FindRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/transfers/find")
            .addQueryParam("amount_from", request.getAmountFrom(), "form", true)
            .addQueryParam("amount_to", request.getAmountTo(), "form", true)
            .addQueryParam("completed_at_from", request.getCompletedAtFrom(), "form", true)
            .addQueryParam("completed_at_to", request.getCompletedAtTo(), "form", true)
            .addQueryParam("created_at_from", request.getCreatedAtFrom(), "form", true)
            .addQueryParam("created_at_to", request.getCreatedAtTo(), "form", true)
            .addQueryParam("creator_account_id", request.getCreatorAccountId(), "form", true)
            .addQueryParam("creator_contact_id", request.getCreatorContactId(), "form", true)
            .addQueryParam("currency", request.getCurrency(), "form", true)
            .addQueryParam("destination_account_id", request.getDestinationAccountId(), "form", true)
            .addQueryParam("on_behalf_of", request.getOnBehalfOf(), "form", true)
            .addQueryParam("order", request.getOrder(), "form", true)
            .addQueryParam("order_asc_desc", request.getOrderAscDesc(), "form", true)
            .addQueryParam("page", request.getPage(), "form", true)
            .addQueryParam("per_page", request.getPerPage(), "form", true)
            .addQueryParam("short_reference", request.getShortReference(), "form", true)
            .addQueryParam("source_account_id", request.getSourceAccountId(), "form", true)
            .addQueryParam("status", request.getStatus(), "form", true)
            .addQueryParam("unique_request_id", request.getUniqueRequestId(), "form", true)
            .addQueryParam("updated_at_from", request.getUpdatedAtFrom(), "form", true)
            .addQueryParam("updated_at_to", request.getUpdatedAtTo(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, TransfersFindResponse.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Transfer
    *
    * Returns the money transfer record with the given ID.
    *
    * GET /transfers/{id}
    */
    public Transfer get(GetRequest request) {
        return get(request, null);
    }


    /**
    * Get Transfer
    *
    * Returns the money transfer record with the given ID.
    *
    * GET /transfers/{id}
    */
    public Transfer get(GetRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/transfers/{id}")
            .addPathParam("id", request.getId())
            .addQueryParam("on_behalf_of", request.getOnBehalfOf(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, Transfer.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Create Transfer
    *
    * Transfers funds from one account to another. No currency conversion is performed, so the sending and receiving accounts must hold money in the same currency.
    *
    * POST /transfers/create
    */
    public Transfer create(CreateRequest request) {
        return create(request, null);
    }


    /**
    * Create Transfer
    *
    * Transfers funds from one account to another. No currency conversion is performed, so the sending and receiving accounts must hold money in the same currency.
    *
    * POST /transfers/create
    */
    public Transfer create(CreateRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/transfers/create")
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(TransfersCreateBody.builder().reason(request.getReason()).uniqueRequestId(
                                       request.getUniqueRequestId()).amount(request.getAmount()).currency(
                                       request.getCurrency()).destinationAccountId(request.getDestinationAccountId()).sourceAccountId(
                                       request.getSourceAccountId()).build(), Map.ofEntries(Map.entry("amount", "form"),
                                               Map.entry("currency", "form"), Map.entry("destination_account_id", "form"), Map.entry("reason",
                                                       "form"), Map.entry("source_account_id", "form"), Map.entry("unique_request_id", "form")),
                                   Map.ofEntries(Map.entry("amount", true), Map.entry("currency", true),
                                                 Map.entry("destination_account_id", true), Map.entry("reason", true), Map.entry("source_account_id",
                                                         true), Map.entry("unique_request_id", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, Transfer.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Cancel Transfer
    *
    * Requests that a transfer be cancelled.
    *
    * POST /transfers/{id}/cancel
    */
    public Transfer cancel(CancelRequest request) {
        return cancel(request, null);
    }


    /**
    * Cancel Transfer
    *
    * Requests that a transfer be cancelled.
    *
    * POST /transfers/{id}/cancel
    */
    public Transfer cancel(CancelRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/transfers/{id}/cancel")
            .addPathParam("id", request.getId())
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, Transfer.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }





}
