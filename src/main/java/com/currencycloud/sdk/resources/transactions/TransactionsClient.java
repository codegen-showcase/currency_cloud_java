
package com.currencycloud.sdk.resources.transactions;

import java.io.IOException;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.core.BaseClient;
import com.currencycloud.sdk.core.HttpRequestBuilder;
import com.currencycloud.sdk.core.RequestOptions;
import com.currencycloud.sdk.core.ResponseHandler;
import com.currencycloud.sdk.model.Sender;
import com.currencycloud.sdk.model.Transaction;
import com.currencycloud.sdk.model.TransactionsFindResponse;
import com.currencycloud.sdk.resources.transactions.params.FindRequest;
import com.currencycloud.sdk.resources.transactions.params.GetRequest;
import com.currencycloud.sdk.resources.transactions.params.GetSenderDetailsRequest;


public class TransactionsClient {
    protected final BaseClient baseClient;

    public TransactionsClient(BaseClient baseClient) {
        this.baseClient = baseClient;

    }

    /**
    * Find Transactions
    *
    * Search for transactions.
    *
    * GET /transactions/find
    */
    public TransactionsFindResponse find() {
        return find(FindRequest.builder().build(), null);
    }


    /**
    * Find Transactions
    *
    * Search for transactions.
    *
    * GET /transactions/find
    */
    public TransactionsFindResponse find(FindRequest request) {
        return find(request, null);
    }


    /**
    * Find Transactions
    *
    * Search for transactions.
    *
    * GET /transactions/find
    */
    public TransactionsFindResponse find(FindRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/transactions/find")
            .addQueryParam("action", request.getAction(), "form", true)
            .addQueryParam("amount", request.getAmount(), "form", true)
            .addQueryParam("amount_from", request.getAmountFrom(), "form", true)
            .addQueryParam("amount_to", request.getAmountTo(), "form", true)
            .addQueryParam("beneficiary_id", request.getBeneficiaryId(), "form", true)
            .addQueryParam("completed_at_from", request.getCompletedAtFrom(), "form", true)
            .addQueryParam("completed_at_to", request.getCompletedAtTo(), "form", true)
            .addQueryParam("created_at_from", request.getCreatedAtFrom(), "form", true)
            .addQueryParam("created_at_to", request.getCreatedAtTo(), "form", true)
            .addQueryParam("currency", request.getCurrency(), "form", true)
            .addQueryParam("currency_pair", request.getCurrencyPair(), "form", true)
            .addQueryParam("on_behalf_of", request.getOnBehalfOf(), "form", true)
            .addQueryParam("order", request.getOrder(), "form", true)
            .addQueryParam("order_asc_desc", request.getOrderAscDesc(), "form", true)
            .addQueryParam("page", request.getPage(), "form", true)
            .addQueryParam("per_page", request.getPerPage(), "form", true)
            .addQueryParam("related_entity_id", request.getRelatedEntityId(), "form", true)
            .addQueryParam("related_entity_short_reference", request.getRelatedEntityShortReference(), "form",
                           true)
            .addQueryParam("related_entity_type", request.getRelatedEntityType(), "form", true)
            .addQueryParam("scope", request.getScope(), "form", true)
            .addQueryParam("settles_at_from", request.getSettlesAtFrom(), "form", true)
            .addQueryParam("settles_at_to", request.getSettlesAtTo(), "form", true)
            .addQueryParam("status", request.getStatus(), "form", true)
            .addQueryParam("type", request.getType(), "form", true)
            .addQueryParam("updated_at_from", request.getUpdatedAtFrom(), "form", true)
            .addQueryParam("updated_at_to", request.getUpdatedAtTo(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, TransactionsFindResponse.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Sender Details
    *
    * Returns a JSON structure with details of the sender of funds.
    *
    * GET /transactions/sender/{id}
    */
    public Sender getSenderDetails(GetSenderDetailsRequest request) {
        return getSenderDetails(request, null);
    }


    /**
    * Get Sender Details
    *
    * Returns a JSON structure with details of the sender of funds.
    *
    * GET /transactions/sender/{id}
    */
    public Sender getSenderDetails(GetSenderDetailsRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/transactions/sender/{id}")
            .addPathParam("id", request.getId())
            .addQueryParam("on_behalf_of", request.getOnBehalfOf(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, Sender.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Transaction
    *
    * Gets a transaction record.
    *
    * GET /transactions/{id}
    */
    public Transaction get(GetRequest request) {
        return get(request, null);
    }


    /**
    * Get Transaction
    *
    * Gets a transaction record.
    *
    * GET /transactions/{id}
    */
    public Transaction get(GetRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/transactions/{id}")
            .addPathParam("id", request.getId())
            .addQueryParam("on_behalf_of", request.getOnBehalfOf(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, Transaction.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }




}
