
package com.currencycloud.sdk.resources.accounts;

import java.io.IOException;
import java.util.Map;
import java.util.function.Supplier;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.core.BaseClient;
import com.currencycloud.sdk.core.HttpRequestBuilder;
import com.currencycloud.sdk.core.RequestOptions;
import com.currencycloud.sdk.core.ResponseHandler;
import com.currencycloud.sdk.core.Suppliers;
import com.currencycloud.sdk.model.Account;
import com.currencycloud.sdk.model.AccountsCreateBody;
import com.currencycloud.sdk.model.AccountsFindBody;
import com.currencycloud.sdk.model.AccountsFindResponse;
import com.currencycloud.sdk.model.AccountsUpdateBody;
import com.currencycloud.sdk.resources.accounts.params.CreateRequest;
import com.currencycloud.sdk.resources.accounts.params.FindRequest;
import com.currencycloud.sdk.resources.accounts.params.GetRequest;
import com.currencycloud.sdk.resources.accounts.params.UpdateRequest;
import com.currencycloud.sdk.resources.accounts.paymentchargessettings.PaymentChargesSettingsClient;


public class AccountsClient {
    protected final BaseClient baseClient;
    protected final Supplier<PaymentChargesSettingsClient> paymentChargesSettings;
    public AccountsClient(BaseClient baseClient) {
        this.baseClient = baseClient;
        this.paymentChargesSettings = Suppliers.memoize(() -> new PaymentChargesSettingsClient(baseClient));
    }

    public PaymentChargesSettingsClient paymentChargesSettings() {
        return this.paymentChargesSettings.get();
    }

    /**
    * Get Authenticating Account
    *
    * Gets the authenticated user's main account.
    *
    * GET /accounts/current
    */
    public Account getMain() {
        return getMain(null);
    }


    /**
    * Get Authenticating Account
    *
    * Gets the authenticated user's main account.
    *
    * GET /accounts/current
    */
    public Account getMain(RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/accounts/current")
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, Account.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Account
    *
    * Gets an account or sub-account owned by the authenticated user.
    *
    * GET /accounts/{id}
    */
    public Account get(GetRequest request) {
        return get(request, null);
    }


    /**
    * Get Account
    *
    * Gets an account or sub-account owned by the authenticated user.
    *
    * GET /accounts/{id}
    */
    public Account get(GetRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/accounts/{id}")
            .addPathParam("id", request.getId())
            .addQueryParam("on_behalf_of", request.getOnBehalfOf(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, Account.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Create Account
    *
    * Creates a new sub-account. Returns the new account entity on success.
    *
    * POST /accounts/create
    */
    public Account create(CreateRequest request) {
        return create(request, null);
    }


    /**
    * Create Account
    *
    * Creates a new sub-account. Returns the new account entity on success.
    *
    * POST /accounts/create
    */
    public Account create(CreateRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/accounts/create")
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(AccountsCreateBody.builder().apiTrading(request.getApiTrading()).brand(
                                       request.getBrand()).identificationType(request.getIdentificationType()).identificationValue(
                                       request.getIdentificationValue()).onlineTrading(request.getOnlineTrading()).phoneTrading(
                                       request.getPhoneTrading()).postalCode(request.getPostalCode()).spreadTable(
                                       request.getSpreadTable()).stateOrProvince(request.getStateOrProvince()).status(
                                       request.getStatus()).termsAndConditionsAccepted(
                                       request.getTermsAndConditionsAccepted()).yourReference(request.getYourReference()).accountName(
                                       request.getAccountName()).city(request.getCity()).country(request.getCountry()).legalEntityType(
                                       request.getLegalEntityType()).street(request.getStreet()).build(),
                                   Map.ofEntries(Map.entry("account_name", "form"), Map.entry("api_trading", "form"),
                                                 Map.entry("brand", "form"), Map.entry("city", "form"), Map.entry("country", "form"),
                                                 Map.entry("identification_type", "form"), Map.entry("identification_value", "form"),
                                                 Map.entry("legal_entity_type", "form"), Map.entry("online_trading", "form"),
                                                 Map.entry("phone_trading", "form"), Map.entry("postal_code", "form"), Map.entry("spread_table",
                                                         "form"), Map.entry("state_or_province", "form"), Map.entry("status", "form"), Map.entry("street",
                                                                 "form"), Map.entry("terms_and_conditions_accepted", "form"), Map.entry("your_reference", "form")),
                                   Map.ofEntries(Map.entry("account_name", true), Map.entry("api_trading", true), Map.entry("brand",
                                                 true), Map.entry("city", true), Map.entry("country", true), Map.entry("identification_type", true),
                                                 Map.entry("identification_value", true), Map.entry("legal_entity_type", true),
                                                 Map.entry("online_trading", true), Map.entry("phone_trading", true), Map.entry("postal_code", true),
                                                 Map.entry("spread_table", true), Map.entry("state_or_province", true), Map.entry("status", true),
                                                 Map.entry("street", true), Map.entry("terms_and_conditions_accepted", true),
                                                 Map.entry("your_reference", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, Account.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Find Accounts
    *
    * Returns account and any sub-accounts owned by the authenticated user. Optionally filter by account status and other criteria.
    *
    * POST /accounts/find
    */
    public AccountsFindResponse find(FindRequest request) {
        return find(request, null);
    }


    /**
    * Find Accounts
    *
    * Returns account and any sub-accounts owned by the authenticated user. Optionally filter by account status and other criteria.
    *
    * POST /accounts/find
    */
    public AccountsFindResponse find(FindRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/accounts/find")
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(AccountsFindBody.builder().accountName(
                                       request.getAccountName()).bankAccountVerified(request.getBankAccountVerified()).brand(
                                       request.getBrand()).city(request.getCity()).country(request.getCountry()).order(
                                       request.getOrder()).orderAscDesc(request.getOrderAscDesc()).page(request.getPage()).perPage(
                                       request.getPerPage()).postalCode(request.getPostalCode()).spreadTable(
                                       request.getSpreadTable()).stateOrProvince(request.getStateOrProvince()).status(
                                       request.getStatus()).street(request.getStreet()).yourReference(request.getYourReference()).build(),
                                   Map.ofEntries(Map.entry("account_name", "form"), Map.entry("bank_account_verified", "form"),
                                                 Map.entry("brand", "form"), Map.entry("city", "form"), Map.entry("country", "form"),
                                                 Map.entry("order", "form"), Map.entry("order_asc_desc", "form"), Map.entry("page", "form"),
                                                 Map.entry("per_page", "form"), Map.entry("postal_code", "form"), Map.entry("spread_table", "form"),
                                                 Map.entry("state_or_province", "form"), Map.entry("status", "form"), Map.entry("street", "form"),
                                                 Map.entry("your_reference", "form")), Map.ofEntries(Map.entry("account_name", true),
                                                         Map.entry("bank_account_verified", true), Map.entry("brand", true), Map.entry("city", true),
                                                         Map.entry("country", true), Map.entry("order", true), Map.entry("order_asc_desc", true),
                                                         Map.entry("page", true), Map.entry("per_page", true), Map.entry("postal_code", true),
                                                         Map.entry("spread_table", true), Map.entry("state_or_province", true), Map.entry("status", true),
                                                         Map.entry("street", true), Map.entry("your_reference", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, AccountsFindResponse.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Update Account
    *
    * Updates a sub-account owned by the authenticated user. The updated account entity is returned on success.
    *
    * POST /accounts/{id}
    */
    public Account update(UpdateRequest request) {
        return update(request, null);
    }


    /**
    * Update Account
    *
    * Updates a sub-account owned by the authenticated user. The updated account entity is returned on success.
    *
    * POST /accounts/{id}
    */
    public Account update(UpdateRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/accounts/{id}")
            .addPathParam("id", request.getId())
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(AccountsUpdateBody.builder().accountName(
                                       request.getAccountName()).apiTrading(request.getApiTrading()).brand(request.getBrand()).city(
                                       request.getCity()).country(request.getCountry()).identificationType(
                                       request.getIdentificationType()).identificationValue(
                                       request.getIdentificationValue()).legalEntityType(request.getLegalEntityType()).onlineTrading(
                                       request.getOnlineTrading()).phoneTrading(request.getPhoneTrading()).postalCode(
                                       request.getPostalCode()).spreadTable(request.getSpreadTable()).stateOrProvince(
                                       request.getStateOrProvince()).status(request.getStatus()).street(
                                       request.getStreet()).termsAndConditionsAccepted(
                                       request.getTermsAndConditionsAccepted()).yourReference(request.getYourReference()).build(),
                                   Map.ofEntries(Map.entry("account_name", "form"), Map.entry("api_trading", "form"),
                                                 Map.entry("brand", "form"), Map.entry("city", "form"), Map.entry("country", "form"),
                                                 Map.entry("identification_type", "form"), Map.entry("identification_value", "form"),
                                                 Map.entry("legal_entity_type", "form"), Map.entry("online_trading", "form"),
                                                 Map.entry("phone_trading", "form"), Map.entry("postal_code", "form"), Map.entry("spread_table",
                                                         "form"), Map.entry("state_or_province", "form"), Map.entry("status", "form"), Map.entry("street",
                                                                 "form"), Map.entry("terms_and_conditions_accepted", "form"), Map.entry("your_reference", "form")),
                                   Map.ofEntries(Map.entry("account_name", true), Map.entry("api_trading", true), Map.entry("brand",
                                                 true), Map.entry("city", true), Map.entry("country", true), Map.entry("identification_type", true),
                                                 Map.entry("identification_value", true), Map.entry("legal_entity_type", true),
                                                 Map.entry("online_trading", true), Map.entry("phone_trading", true), Map.entry("postal_code", true),
                                                 Map.entry("spread_table", true), Map.entry("state_or_province", true), Map.entry("status", true),
                                                 Map.entry("street", true), Map.entry("terms_and_conditions_accepted", true),
                                                 Map.entry("your_reference", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, Account.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }





}
