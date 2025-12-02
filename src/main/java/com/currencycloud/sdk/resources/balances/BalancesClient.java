
package com.currencycloud.sdk.resources.balances;

import java.io.IOException;
import java.util.Map;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.core.BaseClient;
import com.currencycloud.sdk.core.HttpRequestBuilder;
import com.currencycloud.sdk.core.RequestOptions;
import com.currencycloud.sdk.core.ResponseHandler;
import com.currencycloud.sdk.model.Balance;
import com.currencycloud.sdk.model.BalancesFindResponse;
import com.currencycloud.sdk.model.BalancesTopUpMarginBody;
import com.currencycloud.sdk.model.TopUpMarginBalance;
import com.currencycloud.sdk.resources.balances.params.FindRequest;
import com.currencycloud.sdk.resources.balances.params.GetRequest;
import com.currencycloud.sdk.resources.balances.params.TopUpMarginRequest;


public class BalancesClient {
    protected final BaseClient baseClient;

    public BalancesClient(BaseClient baseClient) {
        this.baseClient = baseClient;

    }

    /**
    * Find Balances
    *
    * Searches for currency balances in the main account or a sub-account owned by the authenticated user.
    *
    * GET /balances/find
    */
    public BalancesFindResponse find() {
        return find(FindRequest.builder().build(), null);
    }


    /**
    * Find Balances
    *
    * Searches for currency balances in the main account or a sub-account owned by the authenticated user.
    *
    * GET /balances/find
    */
    public BalancesFindResponse find(FindRequest request) {
        return find(request, null);
    }


    /**
    * Find Balances
    *
    * Searches for currency balances in the main account or a sub-account owned by the authenticated user.
    *
    * GET /balances/find
    */
    public BalancesFindResponse find(FindRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/balances/find")
            .addQueryParam("amount_from", request.getAmountFrom(), "form", true)
            .addQueryParam("amount_to", request.getAmountTo(), "form", true)
            .addQueryParam("as_at_date", request.getAsAtDate(), "form", true)
            .addQueryParam("on_behalf_of", request.getOnBehalfOf(), "form", true)
            .addQueryParam("order", request.getOrder(), "form", true)
            .addQueryParam("order_asc_desc", request.getOrderAscDesc(), "form", true)
            .addQueryParam("page", request.getPage(), "form", true)
            .addQueryParam("per_page", request.getPerPage(), "form", true)
            .addQueryParam("scope", request.getScope(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, BalancesFindResponse.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Balance
    *
    * Gets the balance for a currency from the account of the authenticated user.
    *
    * GET /balances/{currency}
    */
    public Balance get(GetRequest request) {
        return get(request, null);
    }


    /**
    * Get Balance
    *
    * Gets the balance for a currency from the account of the authenticated user.
    *
    * GET /balances/{currency}
    */
    public Balance get(GetRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/balances/{currency}")
            .addPathParam("currency", request.getCurrency())
            .addQueryParam("on_behalf_of", request.getOnBehalfOf(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, Balance.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Top Up Margin Balance
    *
    * Tops up the margin balance.
    *
    * POST /balances/top_up_margin
    */
    public TopUpMarginBalance topUpMargin(TopUpMarginRequest request) {
        return topUpMargin(request, null);
    }


    /**
    * Top Up Margin Balance
    *
    * Tops up the margin balance.
    *
    * POST /balances/top_up_margin
    */
    public TopUpMarginBalance topUpMargin(TopUpMarginRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/balances/top_up_margin")
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(BalancesTopUpMarginBody.builder().onBehalfOf(request.getOnBehalfOf()).amount(
                                       request.getAmount()).currency(request.getCurrency()).build(), Map.ofEntries(Map.entry("amount",
                                               "form"), Map.entry("currency", "form"), Map.entry("on_behalf_of", "form")),
                                   Map.ofEntries(Map.entry("amount", true), Map.entry("currency", true), Map.entry("on_behalf_of",
                                                 true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, TopUpMarginBalance.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }




}
