
package com.currencycloud.sdk.resources.termsandconditions;

import java.io.IOException;
import java.util.Map;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.core.BaseClient;
import com.currencycloud.sdk.core.HttpRequestBuilder;
import com.currencycloud.sdk.core.RequestOptions;
import com.currencycloud.sdk.core.ResponseHandler;
import com.currencycloud.sdk.model.AcceptTermsResponse;
import com.currencycloud.sdk.model.TermsAndConditionsAcceptBody;
import com.currencycloud.sdk.resources.termsandconditions.params.AcceptRequest;


public class TermsAndConditionsClient {
    protected final BaseClient baseClient;

    public TermsAndConditionsClient(BaseClient baseClient) {
        this.baseClient = baseClient;

    }

    /**
    * Accept Terms of Use
    *
    * Endpoint for accounts using our Outsourced KYC model to accept Terms of Use.
    *
    * POST /terms_and_conditions/accept
    */
    public AcceptTermsResponse accept(AcceptRequest request) {
        return accept(request, null);
    }


    /**
    * Accept Terms of Use
    *
    * Endpoint for accounts using our Outsourced KYC model to accept Terms of Use.
    *
    * POST /terms_and_conditions/accept
    */
    public AcceptTermsResponse accept(AcceptRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/terms_and_conditions/accept")
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(TermsAndConditionsAcceptBody.builder().email(request.getEmail()).firstName(
                                       request.getFirstName()).lastName(request.getLastName()).referenceId(
                                       request.getReferenceId()).referenceType(request.getReferenceType()).type(request.getType()).version(
                                       request.getVersion()).build(), Map.ofEntries(Map.entry("email", "form"), Map.entry("first_name",
                                               "form"), Map.entry("last_name", "form"), Map.entry("reference_id", "form"),
                                               Map.entry("reference_type", "form"), Map.entry("type", "form"), Map.entry("version", "form")),
                                   Map.ofEntries(Map.entry("email", true), Map.entry("first_name", true), Map.entry("last_name", true),
                                                 Map.entry("reference_id", true), Map.entry("reference_type", true), Map.entry("type", true),
                                                 Map.entry("version", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, AcceptTermsResponse.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }


}
