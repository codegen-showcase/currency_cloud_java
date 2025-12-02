
package com.currencycloud.sdk.resources.reference;

import java.io.IOException;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.core.BaseClient;
import com.currencycloud.sdk.core.HttpRequestBuilder;
import com.currencycloud.sdk.core.RequestOptions;
import com.currencycloud.sdk.core.ResponseHandler;
import com.currencycloud.sdk.model.AvailableCurrencies;
import com.currencycloud.sdk.model.ConversionDates;
import com.currencycloud.sdk.model.PayerRequirements;
import com.currencycloud.sdk.model.PaymentDates;
import com.currencycloud.sdk.model.ReferenceGetBeneficiaryRequirementsResponse;
import com.currencycloud.sdk.model.ReferenceGetPaymentFeeRulesResponse;
import com.currencycloud.sdk.model.ReferenceGetPaymentPurposeCodesResponse;
import com.currencycloud.sdk.model.ReferenceGetSettlementAccountsResponse;
import com.currencycloud.sdk.resources.reference.params.GetBeneficiaryRequirementsRequest;
import com.currencycloud.sdk.resources.reference.params.GetConversionDatesRequest;
import com.currencycloud.sdk.resources.reference.params.GetPayerRequiredDetailsRequest;
import com.currencycloud.sdk.resources.reference.params.GetPaymentDatesRequest;
import com.currencycloud.sdk.resources.reference.params.GetPaymentFeeRulesRequest;
import com.currencycloud.sdk.resources.reference.params.GetPaymentPurposeCodesRequest;
import com.currencycloud.sdk.resources.reference.params.GetSettlementAccountsRequest;


public class ReferenceClient {
    protected final BaseClient baseClient;

    public ReferenceClient(BaseClient baseClient) {
        this.baseClient = baseClient;

    }

    /**
    * Get Beneficiary Requirements
    *
    * Returns the information that is required to make payments to beneficiaries in specified currencies and countries.
    *
    * GET /reference/beneficiary_required_details
    */
    public ReferenceGetBeneficiaryRequirementsResponse getBeneficiaryRequirements(
        GetBeneficiaryRequirementsRequest request) {
        return getBeneficiaryRequirements(request, null);
    }


    /**
    * Get Beneficiary Requirements
    *
    * Returns the information that is required to make payments to beneficiaries in specified currencies and countries.
    *
    * GET /reference/beneficiary_required_details
    */
    public ReferenceGetBeneficiaryRequirementsResponse getBeneficiaryRequirements(
        GetBeneficiaryRequirementsRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/reference/beneficiary_required_details")
            .addQueryParam("bank_account_country", request.getBankAccountCountry(), "form", true)
            .addQueryParam("beneficiary_country", request.getBeneficiaryCountry(), "form", true)
            .addQueryParam("currency", request.getCurrency(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response,
                    ReferenceGetBeneficiaryRequirementsResponse.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Conversion Dates
    *
    * Provides a list of upcoming non-trading dates, such as weekends or public holidays, for a specified currency pair. Common use cases include situations where this information needs to be provided, or for planning upcoming conversion bookings. <br><br> Many currencies are triangulated; this means that holidays affecting the intermediary currency, as well as the sale and purchase currencies, will impact transactions. Find out more at our <a href="https://support.currencycloud.com/hc/en-gb/articles/5223342659484-Currency-Triangulation">support article.</a>
    *
    * GET /reference/conversion_dates
    */
    public ConversionDates getConversionDates(GetConversionDatesRequest request) {
        return getConversionDates(request, null);
    }


    /**
    * Get Conversion Dates
    *
    * Provides a list of upcoming non-trading dates, such as weekends or public holidays, for a specified currency pair. Common use cases include situations where this information needs to be provided, or for planning upcoming conversion bookings. <br><br> Many currencies are triangulated; this means that holidays affecting the intermediary currency, as well as the sale and purchase currencies, will impact transactions. Find out more at our <a href="https://support.currencycloud.com/hc/en-gb/articles/5223342659484-Currency-Triangulation">support article.</a>
    *
    * GET /reference/conversion_dates
    */
    public ConversionDates getConversionDates(GetConversionDatesRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/reference/conversion_dates")
            .addQueryParam("conversion_pair", request.getConversionPair(), "form", true)
            .addQueryParam("on_behalf_of", request.getOnBehalfOf(), "form", true)
            .addQueryParam("start_date", request.getStartDate(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, ConversionDates.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Available Currencies
    *
    * Gets a list of all currencies that can be traded on the Currencycloud platform.
    *
    * GET /reference/currencies
    */
    public AvailableCurrencies getAvailableCurrencies() {
        return getAvailableCurrencies(null);
    }


    /**
    * Get Available Currencies
    *
    * Gets a list of all currencies that can be traded on the Currencycloud platform.
    *
    * GET /reference/currencies
    */
    public AvailableCurrencies getAvailableCurrencies(RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/reference/currencies")
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, AvailableCurrencies.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Payer Requirements
    *
    * Returns the payer information you need to provide to create a payment. Requirements vary depending on the location of the payer, the type of payment to be made (priority or regular), and other factors.
    *
    * GET /reference/payer_required_details
    */
    public PayerRequirements getPayerRequiredDetails(GetPayerRequiredDetailsRequest request) {
        return getPayerRequiredDetails(request, null);
    }


    /**
    * Get Payer Requirements
    *
    * Returns the payer information you need to provide to create a payment. Requirements vary depending on the location of the payer, the type of payment to be made (priority or regular), and other factors.
    *
    * GET /reference/payer_required_details
    */
    public PayerRequirements getPayerRequiredDetails(GetPayerRequiredDetailsRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/reference/payer_required_details")
            .addQueryParam("payer_country", request.getPayerCountry(), "form", true)
            .addQueryParam("currency", request.getCurrency(), "form", true)
            .addQueryParam("payer_entity_type", request.getPayerEntityType(), "form", true)
            .addQueryParam("payment_type", request.getPaymentType(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, PayerRequirements.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Payment Dates
    *
    * Gets a list of invalid payment dates for a given currency covering a two months period from the start_date specified. A payment date is when a payment will be executed by Currencycloud. Payments cannot be made on some days, for example when banks are closed.
    *
    * GET /reference/payment_dates
    */
    public PaymentDates getPaymentDates(GetPaymentDatesRequest request) {
        return getPaymentDates(request, null);
    }


    /**
    * Get Payment Dates
    *
    * Gets a list of invalid payment dates for a given currency covering a two months period from the start_date specified. A payment date is when a payment will be executed by Currencycloud. Payments cannot be made on some days, for example when banks are closed.
    *
    * GET /reference/payment_dates
    */
    public PaymentDates getPaymentDates(GetPaymentDatesRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/reference/payment_dates")
            .addQueryParam("currency", request.getCurrency(), "form", true)
            .addQueryParam("start_date", request.getStartDate(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, PaymentDates.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Payment Fee Rules
    *
    * Gets the <a href="https://support.currencycloud.com/hc/en-gb/articles/360017471459-Applying-fees-to-individual-payments-FAQ">payment fee</a> information set up for the account / payment type provided.
    *
    * GET /reference/payment_fee_rules
    */
    public ReferenceGetPaymentFeeRulesResponse getPaymentFeeRules() {
        return getPaymentFeeRules(GetPaymentFeeRulesRequest.builder().build(), null);
    }


    /**
    * Get Payment Fee Rules
    *
    * Gets the <a href="https://support.currencycloud.com/hc/en-gb/articles/360017471459-Applying-fees-to-individual-payments-FAQ">payment fee</a> information set up for the account / payment type provided.
    *
    * GET /reference/payment_fee_rules
    */
    public ReferenceGetPaymentFeeRulesResponse getPaymentFeeRules(GetPaymentFeeRulesRequest request) {
        return getPaymentFeeRules(request, null);
    }


    /**
    * Get Payment Fee Rules
    *
    * Gets the <a href="https://support.currencycloud.com/hc/en-gb/articles/360017471459-Applying-fees-to-individual-payments-FAQ">payment fee</a> information set up for the account / payment type provided.
    *
    * GET /reference/payment_fee_rules
    */
    public ReferenceGetPaymentFeeRulesResponse getPaymentFeeRules(GetPaymentFeeRulesRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/reference/payment_fee_rules")
            .addQueryParam("account_id", request.getAccountId(), "form", true)
            .addQueryParam("charge_type", request.getChargeType(), "form", true)
            .addQueryParam("payment_type", request.getPaymentType(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, ReferenceGetPaymentFeeRulesResponse.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Payment Purpose Codes
    *
    * Gets a list of payment purpose codes for a given currency and entity type. When initiating cross-border payments, the central bank of the country may require a purpose to be included with your transaction in order for your payment to be accepted and processed. If a payment purpose code is required but not provided, your payment may be delayed or rejected by the beneficiary bank.
    *
    * GET /reference/payment_purpose_codes
    */
    public ReferenceGetPaymentPurposeCodesResponse getPaymentPurposeCodes(
        GetPaymentPurposeCodesRequest request) {
        return getPaymentPurposeCodes(request, null);
    }


    /**
    * Get Payment Purpose Codes
    *
    * Gets a list of payment purpose codes for a given currency and entity type. When initiating cross-border payments, the central bank of the country may require a purpose to be included with your transaction in order for your payment to be accepted and processed. If a payment purpose code is required but not provided, your payment may be delayed or rejected by the beneficiary bank.
    *
    * GET /reference/payment_purpose_codes
    */
    public ReferenceGetPaymentPurposeCodesResponse getPaymentPurposeCodes(
        GetPaymentPurposeCodesRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/reference/payment_purpose_codes")
            .addQueryParam("bank_account_country", request.getBankAccountCountry(), "form", true)
            .addQueryParam("currency", request.getCurrency(), "form", true)
            .addQueryParam("entity_type", request.getEntityType(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, ReferenceGetPaymentPurposeCodesResponse.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Settlement Accounts
    *
    * Gets settlement account information - a list of accounts that require funding in order to allow for outstanding transactions to be processed.
    *
    * GET /reference/settlement_accounts
    */
    public ReferenceGetSettlementAccountsResponse getSettlementAccounts() {
        return getSettlementAccounts(GetSettlementAccountsRequest.builder().build(), null);
    }


    /**
    * Get Settlement Accounts
    *
    * Gets settlement account information - a list of accounts that require funding in order to allow for outstanding transactions to be processed.
    *
    * GET /reference/settlement_accounts
    */
    public ReferenceGetSettlementAccountsResponse getSettlementAccounts(GetSettlementAccountsRequest
            request) {
        return getSettlementAccounts(request, null);
    }


    /**
    * Get Settlement Accounts
    *
    * Gets settlement account information - a list of accounts that require funding in order to allow for outstanding transactions to be processed.
    *
    * GET /reference/settlement_accounts
    */
    public ReferenceGetSettlementAccountsResponse getSettlementAccounts(GetSettlementAccountsRequest
            request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/reference/settlement_accounts")
            .addQueryParam("account_id", request.getAccountId(), "form", true)
            .addQueryParam("currency", request.getCurrency(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, ReferenceGetSettlementAccountsResponse.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }









}
