
package com.currencycloud.sdk.resources.demo;

import java.io.IOException;
import java.util.Map;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.core.BaseClient;
import com.currencycloud.sdk.core.HttpRequestBuilder;
import com.currencycloud.sdk.core.RequestOptions;
import com.currencycloud.sdk.core.ResponseHandler;
import com.currencycloud.sdk.model.DemoSimulateFundingBody;
import com.currencycloud.sdk.model.SimulateFunding;
import com.currencycloud.sdk.resources.demo.params.SimulateFundingRequest;


public class DemoClient {
    protected final BaseClient baseClient;

    public DemoClient(BaseClient baseClient) {
        this.baseClient = baseClient;

    }

    /**
    * Emulate inbound funds
    *
    * Triggers a production-like flow for processing funds, topping up CM balance or rejecting the transaction without topping up CM balance. This resource is only available in the Currencycloud Demo environment; it is not implemented in the Production environment.
    *
    * POST /demo/funding/create
    */
    public SimulateFunding simulateFunding(SimulateFundingRequest request) {
        return simulateFunding(request, null);
    }


    /**
    * Emulate inbound funds
    *
    * Triggers a production-like flow for processing funds, topping up CM balance or rejecting the transaction without topping up CM balance. This resource is only available in the Currencycloud Demo environment; it is not implemented in the Production environment.
    *
    * POST /demo/funding/create
    */
    public SimulateFunding simulateFunding(SimulateFundingRequest request,
                                           RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/demo/funding/create")
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(DemoSimulateFundingBody.builder().action(request.getAction()).onBehalfOf(
                                       request.getOnBehalfOf()).receiverRoutingCode(request.getReceiverRoutingCode()).senderAccountNumber(
                                       request.getSenderAccountNumber()).senderAddress(request.getSenderAddress()).senderCountry(
                                       request.getSenderCountry()).senderName(request.getSenderName()).senderReference(
                                       request.getSenderReference()).senderRoutingCode(request.getSenderRoutingCode()).amount(
                                       request.getAmount()).currency(request.getCurrency()).id(request.getId()).receiverAccountNumber(
                                       request.getReceiverAccountNumber()).build(), Map.ofEntries(Map.entry("action", "form"),
                                               Map.entry("amount", "form"), Map.entry("currency", "form"), Map.entry("id", "form"),
                                               Map.entry("on_behalf_of", "form"), Map.entry("receiver_account_number", "form"),
                                               Map.entry("receiver_routing_code", "form"), Map.entry("sender_account_number", "form"),
                                               Map.entry("sender_address", "form"), Map.entry("sender_country", "form"), Map.entry("sender_name",
                                                       "form"), Map.entry("sender_reference", "form"), Map.entry("sender_routing_code", "form")),
                                   Map.ofEntries(Map.entry("action", true), Map.entry("amount", true), Map.entry("currency", true),
                                                 Map.entry("id", true), Map.entry("on_behalf_of", true), Map.entry("receiver_account_number", true),
                                                 Map.entry("receiver_routing_code", true), Map.entry("sender_account_number", true),
                                                 Map.entry("sender_address", true), Map.entry("sender_country", true), Map.entry("sender_name",
                                                         true), Map.entry("sender_reference", true), Map.entry("sender_routing_code", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, SimulateFunding.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }


}
