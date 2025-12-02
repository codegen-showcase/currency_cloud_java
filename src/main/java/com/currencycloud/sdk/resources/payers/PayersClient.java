
package com.currencycloud.sdk.resources.payers;

import java.io.IOException;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.core.BaseClient;
import com.currencycloud.sdk.core.HttpRequestBuilder;
import com.currencycloud.sdk.core.RequestOptions;
import com.currencycloud.sdk.core.ResponseHandler;
import com.currencycloud.sdk.model.Payer;
import com.currencycloud.sdk.resources.payers.params.GetRequest;


public class PayersClient {
    protected final BaseClient baseClient;

    public PayersClient(BaseClient baseClient) {
        this.baseClient = baseClient;

    }

    /**
    * Get Payer
    *
    * Get a payer record.
    *
    * GET /payers/{id}
    */
    public Payer get(GetRequest request) {
        return get(request, null);
    }


    /**
    * Get Payer
    *
    * Get a payer record.
    *
    * GET /payers/{id}
    */
    public Payer get(GetRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/payers/{id}")
            .addPathParam("id", request.getId())
            .addQueryParam("on_behalf_of", request.getOnBehalfOf(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, Payer.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }


}
