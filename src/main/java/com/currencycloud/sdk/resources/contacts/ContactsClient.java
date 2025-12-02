
package com.currencycloud.sdk.resources.contacts;

import java.io.IOException;
import java.util.Map;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.core.BaseClient;
import com.currencycloud.sdk.core.HttpRequestBuilder;
import com.currencycloud.sdk.core.RequestOptions;
import com.currencycloud.sdk.core.ResponseHandler;
import com.currencycloud.sdk.model.Contact;
import com.currencycloud.sdk.model.ContactsCreateBody;
import com.currencycloud.sdk.model.ContactsFindBody;
import com.currencycloud.sdk.model.ContactsFindResponse;
import com.currencycloud.sdk.model.HmacKey;
import com.currencycloud.sdk.resources.contacts.params.CreateRequest;
import com.currencycloud.sdk.resources.contacts.params.FindRequest;
import com.currencycloud.sdk.resources.contacts.params.GetRequest;
import com.currencycloud.sdk.resources.contacts.params.UpdateRequest;


public class ContactsClient {
    protected final BaseClient baseClient;

    public ContactsClient(BaseClient baseClient) {
        this.baseClient = baseClient;

    }

    /**
    * Get Authenticating Contact
    *
    * Gets the contact record for the authenticated user.
    *
    * GET /contacts/current
    */
    public Contact getCurrent() {
        return getCurrent(null);
    }


    /**
    * Get Authenticating Contact
    *
    * Gets the contact record for the authenticated user.
    *
    * GET /contacts/current
    */
    public Contact getCurrent(RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/contacts/current")
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, Contact.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Contact
    *
    * Gets the contact for the given ID.
    *
    * GET /contacts/{id}
    */
    public Contact get(GetRequest request) {
        return get(request, null);
    }


    /**
    * Get Contact
    *
    * Gets the contact for the given ID.
    *
    * GET /contacts/{id}
    */
    public Contact get(GetRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/contacts/{id}")
            .addPathParam("id", request.getId())
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, Contact.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Create Contact
    *
    * Creates a new contact and attaches it to a sub-account. Returns the new contact entity on success.
    *
    * POST /contacts/create
    */
    public Contact create(CreateRequest request) {
        return create(request, null);
    }


    /**
    * Create Contact
    *
    * Creates a new contact and attaches it to a sub-account. Returns the new contact entity on success.
    *
    * POST /contacts/create
    */
    public Contact create(CreateRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/contacts/create")
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(ContactsCreateBody.builder().dateOfBirth(request.getDateOfBirth()).locale(
                                       request.getLocale()).loginId(request.getLoginId()).mobilePhoneNumber(
                                       request.getMobilePhoneNumber()).status(request.getStatus()).timezone(
                                       request.getTimezone()).yourReference(request.getYourReference()).accountId(
                                       request.getAccountId()).emailAddress(request.getEmailAddress()).firstName(
                                       request.getFirstName()).lastName(request.getLastName()).phoneNumber(
                                       request.getPhoneNumber()).build(), Map.ofEntries(Map.entry("account_id", "form"),
                                               Map.entry("date_of_birth", "form"), Map.entry("email_address", "form"), Map.entry("first_name",
                                                       "form"), Map.entry("last_name", "form"), Map.entry("locale", "form"), Map.entry("login_id", "form"),
                                               Map.entry("mobile_phone_number", "form"), Map.entry("phone_number", "form"), Map.entry("status",
                                                       "form"), Map.entry("timezone", "form"), Map.entry("your_reference", "form")),
                                   Map.ofEntries(Map.entry("account_id", true), Map.entry("date_of_birth", true),
                                                 Map.entry("email_address", true), Map.entry("first_name", true), Map.entry("last_name", true),
                                                 Map.entry("locale", true), Map.entry("login_id", true), Map.entry("mobile_phone_number", true),
                                                 Map.entry("phone_number", true), Map.entry("status", true), Map.entry("timezone", true),
                                                 Map.entry("your_reference", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, Contact.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Find Contacts
    *
    * Returns contacts that match the parameters.
    *
    * POST /contacts/find
    */
    public ContactsFindResponse find(FindRequest request) {
        return find(request, null);
    }


    /**
    * Find Contacts
    *
    * Returns contacts that match the parameters.
    *
    * POST /contacts/find
    */
    public ContactsFindResponse find(FindRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/contacts/find")
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(ContactsFindBody.builder().accountId(request.getAccountId()).accountName(
                                       request.getAccountName()).emailAddress(request.getEmailAddress()).firstName(
                                       request.getFirstName()).lastName(request.getLastName()).locale(request.getLocale()).loginId(
                                       request.getLoginId()).order(request.getOrder()).orderAscDesc(request.getOrderAscDesc()).page(
                                       request.getPage()).perPage(request.getPerPage()).phoneNumber(request.getPhoneNumber()).status(
                                       request.getStatus()).timezone(request.getTimezone()).yourReference(
                                       request.getYourReference()).build(), Map.ofEntries(Map.entry("account_id", "form"),
                                               Map.entry("account_name", "form"), Map.entry("email_address", "form"), Map.entry("first_name",
                                                       "form"), Map.entry("last_name", "form"), Map.entry("locale", "form"), Map.entry("login_id", "form"),
                                               Map.entry("order", "form"), Map.entry("order_asc_desc", "form"), Map.entry("page", "form"),
                                               Map.entry("per_page", "form"), Map.entry("phone_number", "form"), Map.entry("status", "form"),
                                               Map.entry("timezone", "form"), Map.entry("your_reference", "form")),
                                   Map.ofEntries(Map.entry("account_id", true), Map.entry("account_name", true),
                                                 Map.entry("email_address", true), Map.entry("first_name", true), Map.entry("last_name", true),
                                                 Map.entry("locale", true), Map.entry("login_id", true), Map.entry("order", true),
                                                 Map.entry("order_asc_desc", true), Map.entry("page", true), Map.entry("per_page", true),
                                                 Map.entry("phone_number", true), Map.entry("status", true), Map.entry("timezone", true),
                                                 Map.entry("your_reference", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, ContactsFindResponse.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Generate HMAC Key for Contact
    *
    * Generates a new account HMAC key for the current contact.
    *
    * POST /contacts/generate_hmac_key
    */
    public HmacKey generateHmacKey() {
        return generateHmacKey(null);
    }


    /**
    * Generate HMAC Key for Contact
    *
    * Generates a new account HMAC key for the current contact.
    *
    * POST /contacts/generate_hmac_key
    */
    public HmacKey generateHmacKey(RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/contacts/generate_hmac_key")
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, HmacKey.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Update Contact
    *
    * Updates an existing contact. Returns the updated contact entity on success.
    *
    * POST /contacts/{id}
    */
    public Contact update(UpdateRequest request) {
        return update(request, null);
    }


    /**
    * Update Contact
    *
    * Updates an existing contact. Returns the updated contact entity on success.
    *
    * POST /contacts/{id}
    */
    public Contact update(UpdateRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/contacts/{id}")
            .addPathParam("id", request.getId())
            .addQueryParam("date_of_birth", request.getDateOfBirth(), "form", true)
            .addQueryParam("email_address", request.getEmailAddress(), "form", true)
            .addQueryParam("first_name", request.getFirstName(), "form", true)
            .addQueryParam("last_name", request.getLastName(), "form", true)
            .addQueryParam("locale", request.getLocale(), "form", true)
            .addQueryParam("login_id", request.getLoginId(), "form", true)
            .addQueryParam("mobile_phone_number", request.getMobilePhoneNumber(), "form", true)
            .addQueryParam("phone_number", request.getPhoneNumber(), "form", true)
            .addQueryParam("status", request.getStatus(), "form", true)
            .addQueryParam("timezone", request.getTimezone(), "form", true)
            .addQueryParam("your_reference", request.getYourReference(), "form", true)
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, Contact.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }







}
