
package com.currencycloud.sdk.resources.funding;

import java.io.IOException;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.core.BaseClient;
import com.currencycloud.sdk.core.HttpRequestBuilder;
import com.currencycloud.sdk.core.RequestOptions;
import com.currencycloud.sdk.core.ResponseHandler;
import com.currencycloud.sdk.model.FundingFindAccountsResponse;
import com.currencycloud.sdk.model.FundingTransaction;
import com.currencycloud.sdk.resources.funding.params.FindAccountsRequest;
import com.currencycloud.sdk.resources.funding.params.GetTransactionRequest;


public class FundingClient {
    protected final BaseClient baseClient;

    public FundingClient(BaseClient baseClient) {
        this.baseClient = baseClient;

    }

    /**
    * Find Funding Accounts
    *
    * Gets details of the Standard Settlement Instructions (SSIs) that can be used to settle and collect funds in each available currency.
    *
    * GET /funding_accounts/find
    */
    public FundingFindAccountsResponse findAccounts(FindAccountsRequest request) {
        return findAccounts(request, null);
    }


    /**
    * Find Funding Accounts
    *
    * Gets details of the Standard Settlement Instructions (SSIs) that can be used to settle and collect funds in each available currency.
    *
    * GET /funding_accounts/find
    */
    public FundingFindAccountsResponse findAccounts(FindAccountsRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/funding_accounts/find")
            .addQueryParam("currency", request.getCurrency(), "form", true)
            .addQueryParam("account_id", request.getAccountId(), "form", true)
            .addQueryParam("on_behalf_of", request.getOnBehalfOf(), "form", true)
            .addQueryParam("order", request.getOrder(), "form", true)
            .addQueryParam("order_asc_desc", request.getOrderAscDesc(), "form", true)
            .addQueryParam("page", request.getPage(), "form", true)
            .addQueryParam("payment_type", request.getPaymentType(), "form", true)
            .addQueryParam("per_page", request.getPerPage(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, FundingFindAccountsResponse.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Funding Transaction
    *
    *
    * Gets the details of an approved funding transaction with the given ID.
    *
    * GET /funding_transactions/{id}
    */
    public FundingTransaction getTransaction(GetTransactionRequest request) {
        return getTransaction(request, null);
    }


    /**
    * Get Funding Transaction
    *
    *
    * Gets the details of an approved funding transaction with the given ID.
    *
    * GET /funding_transactions/{id}
    */
    public FundingTransaction getTransaction(GetTransactionRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/funding_transactions/{id}")
            .addPathParam("id", request.getId())
            .addQueryParam("on_behalf_of", request.getOnBehalfOf(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, FundingTransaction.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }



}
