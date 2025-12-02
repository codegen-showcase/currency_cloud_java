
package com.currencycloud.sdk.resources.accounts.paymentchargessettings;

import java.io.IOException;
import java.util.Map;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.core.BaseClient;
import com.currencycloud.sdk.core.HttpRequestBuilder;
import com.currencycloud.sdk.core.RequestOptions;
import com.currencycloud.sdk.core.ResponseHandler;
import com.currencycloud.sdk.model.AccountPaymentChargesSetting;
import com.currencycloud.sdk.model.AccountsPaymentChargesSettingsCreateBody;
import com.currencycloud.sdk.model.AccountsPaymentChargesSettingsListResponse;
import com.currencycloud.sdk.resources.accounts.paymentchargessettings.params.CreateRequest;
import com.currencycloud.sdk.resources.accounts.paymentchargessettings.params.ListRequest;


public class PaymentChargesSettingsClient {
    protected final BaseClient baseClient;

    public PaymentChargesSettingsClient(BaseClient baseClient) {
        this.baseClient = baseClient;

    }

    /**
    * Get Payment Charges Settings
    *
    * Retrieves the Payment Charges Settings for the given account.
    *
    * GET /accounts/{account_id}/payment_charges_settings
    */
    public AccountsPaymentChargesSettingsListResponse list(ListRequest request) {
        return list(request, null);
    }


    /**
    * Get Payment Charges Settings
    *
    * Retrieves the Payment Charges Settings for the given account.
    *
    * GET /accounts/{account_id}/payment_charges_settings
    */
    public AccountsPaymentChargesSettingsListResponse list(ListRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/accounts/{account_id}/payment_charges_settings")
            .addPathParam("account_id", request.getAccountId())
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response,
                    AccountsPaymentChargesSettingsListResponse.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Manage Account Payment Charges Settings
    *
    * Manage a given account's Payment Charge Settings (enable, disable, set as default).
    *
    * POST /accounts/{account_id}/payment_charges_settings/{charge_settings_id}
    */
    public AccountPaymentChargesSetting create(CreateRequest request) {
        return create(request, null);
    }


    /**
    * Manage Account Payment Charges Settings
    *
    * Manage a given account's Payment Charge Settings (enable, disable, set as default).
    *
    * POST /accounts/{account_id}/payment_charges_settings/{charge_settings_id}
    */
    public AccountPaymentChargesSetting create(CreateRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/accounts/{account_id}/payment_charges_settings/{charge_settings_id}")
            .addPathParam("account_id", request.getAccountId())
            .addPathParam("charge_settings_id", request.getChargeSettingsId())
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(AccountsPaymentChargesSettingsCreateBody.builder().default_
                                   (request.getDefault_()).enabled(request.getEnabled()).build(), Map.ofEntries(Map.entry("default",
                                           "form"), Map.entry("enabled", "form")), Map.ofEntries(Map.entry("default", true),
                                                   Map.entry("enabled", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, AccountPaymentChargesSetting.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }



}
