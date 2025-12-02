
package com.currencycloud.sdk.resources.collectionsscreening;

import java.io.IOException;
import java.util.Map;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.core.BaseClient;
import com.currencycloud.sdk.core.HttpRequestBuilder;
import com.currencycloud.sdk.core.RequestOptions;
import com.currencycloud.sdk.core.ResponseHandler;
import com.currencycloud.sdk.model.CollectionsScreeningCompleteBody;
import com.currencycloud.sdk.model.CollectionsScreeningCompleteResponse;
import com.currencycloud.sdk.resources.collectionsscreening.params.CompleteRequest;


public class CollectionsScreeningClient {
    protected final BaseClient baseClient;

    public CollectionsScreeningClient(BaseClient baseClient) {
        this.baseClient = baseClient;

    }

    /**
    * Accept or Reject Inbound Transaction
    *
    *
    * Allows you to accept or reject an inbound transaction before the funds are credited to the beneficiary’s account.
    *
    * PUT /collections_screening/{transactionId}/complete
    */
    public CollectionsScreeningCompleteResponse complete(CompleteRequest request) {
        return complete(request, null);
    }


    /**
    * Accept or Reject Inbound Transaction
    *
    *
    * Allows you to accept or reject an inbound transaction before the funds are credited to the beneficiary’s account.
    *
    * PUT /collections_screening/{transactionId}/complete
    */
    public CollectionsScreeningCompleteResponse complete(CompleteRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/collections_screening/{transactionId}/complete")
            .addPathParam("transactionId", request.getTransactionId())
            .method("PUT")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(CollectionsScreeningCompleteBody.builder().accepted(
                                       request.getAccepted()).reason(request.getReason()).build(), Map.ofEntries(Map.entry("accepted",
                                               "form"), Map.entry("reason", "form")), Map.ofEntries(Map.entry("accepted", true),
                                                       Map.entry("reason", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, CollectionsScreeningCompleteResponse.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }


}
