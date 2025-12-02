
package com.currencycloud.sdk.resources.conversions;

import java.io.IOException;
import java.util.Map;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.core.BaseClient;
import com.currencycloud.sdk.core.HttpRequestBuilder;
import com.currencycloud.sdk.core.RequestOptions;
import com.currencycloud.sdk.core.ResponseHandler;
import com.currencycloud.sdk.model.Conversion;
import com.currencycloud.sdk.model.ConversionCancellationQuote;
import com.currencycloud.sdk.model.ConversionDateChange;
import com.currencycloud.sdk.model.ConversionProfitAndLoss;
import com.currencycloud.sdk.model.ConversionSplit;
import com.currencycloud.sdk.model.ConversionSplitHistory;
import com.currencycloud.sdk.model.ConversionsCancelBody;
import com.currencycloud.sdk.model.ConversionsCreateBody;
import com.currencycloud.sdk.model.ConversionsDateChangeBody;
import com.currencycloud.sdk.model.ConversionsFindResponse;
import com.currencycloud.sdk.model.ConversionsProfitAndLossResponse;
import com.currencycloud.sdk.model.ConversionsSplitBody;
import com.currencycloud.sdk.resources.conversions.params.CancelRequest;
import com.currencycloud.sdk.resources.conversions.params.CancellationQuoteRequest;
import com.currencycloud.sdk.resources.conversions.params.CreateRequest;
import com.currencycloud.sdk.resources.conversions.params.DateChangeQuoteRequest;
import com.currencycloud.sdk.resources.conversions.params.DateChangeRequest;
import com.currencycloud.sdk.resources.conversions.params.FindRequest;
import com.currencycloud.sdk.resources.conversions.params.GetRequest;
import com.currencycloud.sdk.resources.conversions.params.ProfitAndLossRequest;
import com.currencycloud.sdk.resources.conversions.params.SplitHistoryRequest;
import com.currencycloud.sdk.resources.conversions.params.SplitPreviewRequest;
import com.currencycloud.sdk.resources.conversions.params.SplitRequest;


public class ConversionsClient {
    protected final BaseClient baseClient;

    public ConversionsClient(BaseClient baseClient) {
        this.baseClient = baseClient;

    }

    /**
    * Find Conversions
    *
    * Finds conversions based on search parameters. If no search parameters are provided, all conversions under the house account are returned.
    *
    * GET /conversions/find
    */
    public ConversionsFindResponse find() {
        return find(FindRequest.builder().build(), null);
    }


    /**
    * Find Conversions
    *
    * Finds conversions based on search parameters. If no search parameters are provided, all conversions under the house account are returned.
    *
    * GET /conversions/find
    */
    public ConversionsFindResponse find(FindRequest request) {
        return find(request, null);
    }


    /**
    * Find Conversions
    *
    * Finds conversions based on search parameters. If no search parameters are provided, all conversions under the house account are returned.
    *
    * GET /conversions/find
    */
    public ConversionsFindResponse find(FindRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/conversions/find")
            .addQueryParam("buy_amount_from", request.getBuyAmountFrom(), "form", true)
            .addQueryParam("buy_amount_to", request.getBuyAmountTo(), "form", true)
            .addQueryParam("buy_currency", request.getBuyCurrency(), "form", true)
            .addQueryParam("conversion_date_from", request.getConversionDateFrom(), "form", true)
            .addQueryParam("conversion_date_to", request.getConversionDateTo(), "form", true)
            .addQueryParam("conversion_ids[]", request.getConversionIds(), "form", false)
            .addQueryParam("created_at_from", request.getCreatedAtFrom(), "form", true)
            .addQueryParam("created_at_to", request.getCreatedAtTo(), "form", true)
            .addQueryParam("currency_pair", request.getCurrencyPair(), "form", true)
            .addQueryParam("on_behalf_of", request.getOnBehalfOf(), "form", true)
            .addQueryParam("order", request.getOrder(), "form", true)
            .addQueryParam("order_asc_desc", request.getOrderAscDesc(), "form", true)
            .addQueryParam("page", request.getPage(), "form", true)
            .addQueryParam("partner_buy_amount_from", request.getPartnerBuyAmountFrom(), "form", true)
            .addQueryParam("partner_buy_amount_to", request.getPartnerBuyAmountTo(), "form", true)
            .addQueryParam("partner_sell_amount_from", request.getPartnerSellAmountFrom(), "form", true)
            .addQueryParam("partner_sell_amount_to", request.getPartnerSellAmountTo(), "form", true)
            .addQueryParam("per_page", request.getPerPage(), "form", true)
            .addQueryParam("scope", request.getScope(), "form", true)
            .addQueryParam("sell_amount_from", request.getSellAmountFrom(), "form", true)
            .addQueryParam("sell_amount_to", request.getSellAmountTo(), "form", true)
            .addQueryParam("sell_currency", request.getSellCurrency(), "form", true)
            .addQueryParam("settlement_date_from", request.getSettlementDateFrom(), "form", true)
            .addQueryParam("settlement_date_to", request.getSettlementDateTo(), "form", true)
            .addQueryParam("short_reference", request.getShortReference(), "form", true)
            .addQueryParam("status", request.getStatus(), "form", true)
            .addQueryParam("unique_request_id", request.getUniqueRequestId(), "form", true)
            .addQueryParam("updated_at_from", request.getUpdatedAtFrom(), "form", true)
            .addQueryParam("updated_at_to", request.getUpdatedAtTo(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, ConversionsFindResponse.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Retrieve Profit / Loss
    *
    * Returns the information of any actions related to a conversion that have generated profit or loss, including the profit or loss amount.
    *
    * GET /conversions/profit_and_loss
    */
    public ConversionsProfitAndLossResponse profitAndLoss() {
        return profitAndLoss(ProfitAndLossRequest.builder().build(), null);
    }


    /**
    * Retrieve Profit / Loss
    *
    * Returns the information of any actions related to a conversion that have generated profit or loss, including the profit or loss amount.
    *
    * GET /conversions/profit_and_loss
    */
    public ConversionsProfitAndLossResponse profitAndLoss(ProfitAndLossRequest request) {
        return profitAndLoss(request, null);
    }


    /**
    * Retrieve Profit / Loss
    *
    * Returns the information of any actions related to a conversion that have generated profit or loss, including the profit or loss amount.
    *
    * GET /conversions/profit_and_loss
    */
    public ConversionsProfitAndLossResponse profitAndLoss(ProfitAndLossRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/conversions/profit_and_loss")
            .addQueryParam("account_id", request.getAccountId(), "form", true)
            .addQueryParam("amount_from", request.getAmountFrom(), "form", true)
            .addQueryParam("amount_to", request.getAmountTo(), "form", true)
            .addQueryParam("contact_id", request.getContactId(), "form", true)
            .addQueryParam("conversion_id", request.getConversionId(), "form", true)
            .addQueryParam("currency", request.getCurrency(), "form", true)
            .addQueryParam("event_date_time_from", request.getEventDateTimeFrom(), "form", true)
            .addQueryParam("event_date_time_to", request.getEventDateTimeTo(), "form", true)
            .addQueryParam("event_type", request.getEventType(), "form", true)
            .addQueryParam("order", request.getOrder(), "form", true)
            .addQueryParam("order_asc_desc", request.getOrderAscDesc(), "form", true)
            .addQueryParam("page", request.getPage(), "form", true)
            .addQueryParam("per_page", request.getPerPage(), "form", true)
            .addQueryParam("scope", request.getScope(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, ConversionsProfitAndLossResponse.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Conversion
    *
    * Gets a conversion record for the provided unique ID.
    *
    * GET /conversions/{id}
    */
    public Conversion get(GetRequest request) {
        return get(request, null);
    }


    /**
    * Get Conversion
    *
    * Gets a conversion record for the provided unique ID.
    *
    * GET /conversions/{id}
    */
    public Conversion get(GetRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/conversions/{id}")
            .addPathParam("id", request.getId())
            .addQueryParam("on_behalf_of", request.getOnBehalfOf(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, Conversion.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Quote Conversion Cancellation
    *
    * Gets a quote of the projected cost to cancel a conversion identified by a provided unique ID {id}.
    *
    * GET /conversions/{id}/cancellation_quote
    */
    public ConversionCancellationQuote cancellationQuote(CancellationQuoteRequest request) {
        return cancellationQuote(request, null);
    }


    /**
    * Quote Conversion Cancellation
    *
    * Gets a quote of the projected cost to cancel a conversion identified by a provided unique ID {id}.
    *
    * GET /conversions/{id}/cancellation_quote
    */
    public ConversionCancellationQuote cancellationQuote(CancellationQuoteRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/conversions/{id}/cancellation_quote")
            .addPathParam("id", request.getId())
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, ConversionCancellationQuote.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Quote Conversion Date Change
    *
    * Gets a quote of the projected cost to change the date of a conversion identified by a provided unique ID {id}.
    *
    * GET /conversions/{id}/date_change_quote
    */
    public ConversionDateChange dateChangeQuote(DateChangeQuoteRequest request) {
        return dateChangeQuote(request, null);
    }


    /**
    * Quote Conversion Date Change
    *
    * Gets a quote of the projected cost to change the date of a conversion identified by a provided unique ID {id}.
    *
    * GET /conversions/{id}/date_change_quote
    */
    public ConversionDateChange dateChangeQuote(DateChangeQuoteRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/conversions/{id}/date_change_quote")
            .addPathParam("id", request.getId())
            .addQueryParam("new_settlement_date", request.getNewSettlementDate(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, ConversionDateChange.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Conversion Split History
    *
    * Returns the history of executed conversion splits, specified by a unique conversion ID {id}.
    *
    * GET /conversions/{id}/split_history
    */
    public ConversionSplitHistory splitHistory(SplitHistoryRequest request) {
        return splitHistory(request, null);
    }


    /**
    * Conversion Split History
    *
    * Returns the history of executed conversion splits, specified by a unique conversion ID {id}.
    *
    * GET /conversions/{id}/split_history
    */
    public ConversionSplitHistory splitHistory(SplitHistoryRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/conversions/{id}/split_history")
            .addPathParam("id", request.getId())
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, ConversionSplitHistory.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Split Preview
    *
    * Gets a preview of the details of each part of a split conversion specified by the provided unique conversion ID {id}.
    *
    * GET /conversions/{id}/split_preview
    */
    public ConversionSplit splitPreview(SplitPreviewRequest request) {
        return splitPreview(request, null);
    }


    /**
    * Split Preview
    *
    * Gets a preview of the details of each part of a split conversion specified by the provided unique conversion ID {id}.
    *
    * GET /conversions/{id}/split_preview
    */
    public ConversionSplit splitPreview(SplitPreviewRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/conversions/{id}/split_preview")
            .addPathParam("id", request.getId())
            .addQueryParam("amount", request.getAmount(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, ConversionSplit.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Create Conversion
    *
    * Creates a new conversion. Returns the details of the created conversion on success.
    *
    * POST /conversions/create
    */
    public Conversion create(CreateRequest request) {
        return create(request, null);
    }


    /**
    * Create Conversion
    *
    * Creates a new conversion. Returns the details of the created conversion on success.
    *
    * POST /conversions/create
    */
    public Conversion create(CreateRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/conversions/create")
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(ConversionsCreateBody.builder().clientBuyAmount(
                                       request.getClientBuyAmount()).clientSellAmount(request.getClientSellAmount()).conversionDate(
                                       request.getConversionDate()).conversionDatePreference(
                                       request.getConversionDatePreference()).onBehalfOf(request.getOnBehalfOf()).reason(
                                       request.getReason()).uniqueRequestId(request.getUniqueRequestId()).amount(
                                       request.getAmount()).buyCurrency(request.getBuyCurrency()).fixedSide(
                                       request.getFixedSide()).sellCurrency(request.getSellCurrency()).termAgreement(
                                       request.getTermAgreement()).build(), Map.ofEntries(Map.entry("amount", "form"),
                                               Map.entry("buy_currency", "form"), Map.entry("client_buy_amount", "form"),
                                               Map.entry("client_sell_amount", "form"), Map.entry("conversion_date", "form"),
                                               Map.entry("conversion_date_preference", "form"), Map.entry("fixed_side", "form"),
                                               Map.entry("on_behalf_of", "form"), Map.entry("reason", "form"), Map.entry("sell_currency", "form"),
                                               Map.entry("term_agreement", "form"), Map.entry("unique_request_id", "form")),
                                   Map.ofEntries(Map.entry("amount", true), Map.entry("buy_currency", true),
                                                 Map.entry("client_buy_amount", true), Map.entry("client_sell_amount", true),
                                                 Map.entry("conversion_date", true), Map.entry("conversion_date_preference", true),
                                                 Map.entry("fixed_side", true), Map.entry("on_behalf_of", true), Map.entry("reason", true),
                                                 Map.entry("sell_currency", true), Map.entry("term_agreement", true), Map.entry("unique_request_id",
                                                         true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, Conversion.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Cancel a Conversion
    *
    * Cancels the conversion identified by the provided unique ID {id}.
    *
    * POST /conversions/{id}/cancel
    */
    public ConversionProfitAndLoss cancel(CancelRequest request) {
        return cancel(request, null);
    }


    /**
    * Cancel a Conversion
    *
    * Cancels the conversion identified by the provided unique ID {id}.
    *
    * POST /conversions/{id}/cancel
    */
    public ConversionProfitAndLoss cancel(CancelRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/conversions/{id}/cancel")
            .addPathParam("id", request.getId())
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(ConversionsCancelBody.builder().notes(request.getNotes()).build(),
                                   Map.ofEntries(Map.entry("notes", "form")), Map.ofEntries(Map.entry("notes", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, ConversionProfitAndLoss.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Conversion Date Change
    *
    * Changes the date of the conversion identified by the provided unique ID {id}.
    *
    * POST /conversions/{id}/date_change
    */
    public ConversionDateChange dateChange(DateChangeRequest request) {
        return dateChange(request, null);
    }


    /**
    * Conversion Date Change
    *
    * Changes the date of the conversion identified by the provided unique ID {id}.
    *
    * POST /conversions/{id}/date_change
    */
    public ConversionDateChange dateChange(DateChangeRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/conversions/{id}/date_change")
            .addPathParam("id", request.getId())
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(ConversionsDateChangeBody.builder().newSettlementDate(
                                       request.getNewSettlementDate()).build(), Map.ofEntries(Map.entry("new_settlement_date", "form")),
                                   Map.ofEntries(Map.entry("new_settlement_date", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, ConversionDateChange.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Conversion Split
    *
    * Splits the conversion specified by the unique ID {id}. Upon success, it returns the details of the parent and new child conversions.
    *
    * POST /conversions/{id}/split
    */
    public ConversionSplit split(SplitRequest request) {
        return split(request, null);
    }


    /**
    * Conversion Split
    *
    * Splits the conversion specified by the unique ID {id}. Upon success, it returns the details of the parent and new child conversions.
    *
    * POST /conversions/{id}/split
    */
    public ConversionSplit split(SplitRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/conversions/{id}/split")
            .addPathParam("id", request.getId())
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(ConversionsSplitBody.builder().amount(request.getAmount()).build(),
                                   Map.ofEntries(Map.entry("amount", "form")), Map.ofEntries(Map.entry("amount", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, ConversionSplit.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }












}
