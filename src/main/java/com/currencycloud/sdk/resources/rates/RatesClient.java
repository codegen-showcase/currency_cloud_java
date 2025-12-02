
package com.currencycloud.sdk.resources.rates;

import java.io.IOException;
import java.util.Map;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.core.BaseClient;
import com.currencycloud.sdk.core.HttpRequestBuilder;
import com.currencycloud.sdk.core.RequestOptions;
import com.currencycloud.sdk.core.ResponseHandler;
import com.currencycloud.sdk.model.BankDetails;
import com.currencycloud.sdk.model.RateDetailed;
import com.currencycloud.sdk.model.RatesBasic;
import com.currencycloud.sdk.model.RatesFindBankDetailsBody;
import com.currencycloud.sdk.resources.rates.params.FindBankDetailsRequest;
import com.currencycloud.sdk.resources.rates.params.FindRequest;
import com.currencycloud.sdk.resources.rates.params.GetDetailedRequest;


public class RatesClient {
    protected final BaseClient baseClient;

    public RatesClient(BaseClient baseClient) {
        this.baseClient = baseClient;

    }

    /**
    * Get Detailed Rates
    *
    * Gets a detailed, tradeable rate quote to convert money from one currency to another. The quotation provided will be based on the spread table of the authenticated user. There is also the option to provide a specific date for the conversion to occur. <br><br> This endpoint provides a current tradeable rate for a single currency pair. It should be used as the start of the flow before a conversion is booked. This endpoint should be used where accuracy is the most important aspect, such as when a trade is about to be booked.
    *
    * GET /rates/detailed
    */
    public RateDetailed getDetailed(GetDetailedRequest request) {
        return getDetailed(request, null);
    }


    /**
    * Get Detailed Rates
    *
    * Gets a detailed, tradeable rate quote to convert money from one currency to another. The quotation provided will be based on the spread table of the authenticated user. There is also the option to provide a specific date for the conversion to occur. <br><br> This endpoint provides a current tradeable rate for a single currency pair. It should be used as the start of the flow before a conversion is booked. This endpoint should be used where accuracy is the most important aspect, such as when a trade is about to be booked.
    *
    * GET /rates/detailed
    */
    public RateDetailed getDetailed(GetDetailedRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/rates/detailed")
            .addQueryParam("amount", request.getAmount(), "form", true)
            .addQueryParam("buy_currency", request.getBuyCurrency(), "form", true)
            .addQueryParam("fixed_side", request.getFixedSide(), "form", true)
            .addQueryParam("sell_currency", request.getSellCurrency(), "form", true)
            .addQueryParam("conversion_date", request.getConversionDate(), "form", true)
            .addQueryParam("conversion_date_preference", request.getConversionDatePreference(), "form", true)
            .addQueryParam("on_behalf_of", request.getOnBehalfOf(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, RateDetailed.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Basic Rates
    *
    * Gets indicative foreign exchange rate information for one or more currency pairs in a single request. <br><br> This endpoint is intended to provide an indication of the rate available in the market and can support requests for multiple currency pairs, so is good for polling requirements such as live FX ticker widgets. This endpoint should be used where speed, availability and the ability to request multiple currency pairs is important.
    *
    * GET /rates/find
    */
    public RatesBasic find(FindRequest request) {
        return find(request, null);
    }


    /**
    * Get Basic Rates
    *
    * Gets indicative foreign exchange rate information for one or more currency pairs in a single request. <br><br> This endpoint is intended to provide an indication of the rate available in the market and can support requests for multiple currency pairs, so is good for polling requirements such as live FX ticker widgets. This endpoint should be used where speed, availability and the ability to request multiple currency pairs is important.
    *
    * GET /rates/find
    */
    public RatesBasic find(FindRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/rates/find")
            .addQueryParam("currency_pair", request.getCurrencyPair(), "form", true)
            .addQueryParam("ignore_invalid_pairs", request.getIgnoreInvalidPairs(), "form", true)
            .addQueryParam("on_behalf_of", request.getOnBehalfOf(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, RatesBasic.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Find Bank Details
    *
    * Returns the related bank details for the given account reference.
    *
    * POST /reference/bank_details/find
    */
    public BankDetails findBankDetails(FindBankDetailsRequest request) {
        return findBankDetails(request, null);
    }


    /**
    * Find Bank Details
    *
    * Returns the related bank details for the given account reference.
    *
    * POST /reference/bank_details/find
    */
    public BankDetails findBankDetails(FindBankDetailsRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/reference/bank_details/find")
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(RatesFindBankDetailsBody.builder().identifierType(
                                       request.getIdentifierType()).identifierValue(request.getIdentifierValue()).build(),
                                   Map.ofEntries(Map.entry("identifier_type", "form"), Map.entry("identifier_value", "form")),
                                   Map.ofEntries(Map.entry("identifier_type", true), Map.entry("identifier_value", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, BankDetails.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }




}
