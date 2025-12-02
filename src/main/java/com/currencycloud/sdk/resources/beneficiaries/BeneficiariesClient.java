
package com.currencycloud.sdk.resources.beneficiaries;

import java.io.IOException;
import java.util.Map;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.core.BaseClient;
import com.currencycloud.sdk.core.HttpRequestBuilder;
import com.currencycloud.sdk.core.RequestOptions;
import com.currencycloud.sdk.core.ResponseHandler;
import com.currencycloud.sdk.model.BeneficiariesAccountVerificationBody;
import com.currencycloud.sdk.model.BeneficiariesCreateBody;
import com.currencycloud.sdk.model.BeneficiariesDeleteBody;
import com.currencycloud.sdk.model.BeneficiariesFindBody;
import com.currencycloud.sdk.model.BeneficiariesFindResponse;
import com.currencycloud.sdk.model.BeneficiariesUpdateBody;
import com.currencycloud.sdk.model.BeneficiariesValidateBody;
import com.currencycloud.sdk.model.Beneficiary;
import com.currencycloud.sdk.model.BeneficiaryAccountVerificationResult;
import com.currencycloud.sdk.resources.beneficiaries.params.AccountVerificationRequest;
import com.currencycloud.sdk.resources.beneficiaries.params.CreateRequest;
import com.currencycloud.sdk.resources.beneficiaries.params.DeleteRequest;
import com.currencycloud.sdk.resources.beneficiaries.params.FindRequest;
import com.currencycloud.sdk.resources.beneficiaries.params.GetRequest;
import com.currencycloud.sdk.resources.beneficiaries.params.UpdateRequest;
import com.currencycloud.sdk.resources.beneficiaries.params.ValidateRequest;


public class BeneficiariesClient {
    protected final BaseClient baseClient;

    public BeneficiariesClient(BaseClient baseClient) {
        this.baseClient = baseClient;

    }

    /**
    * Get Beneficiary
    *
    * Gets a beneficiary with the given ID.
    *
    * GET /beneficiaries/{id}
    */
    public Beneficiary get(GetRequest request) {
        return get(request, null);
    }


    /**
    * Get Beneficiary
    *
    * Gets a beneficiary with the given ID.
    *
    * GET /beneficiaries/{id}
    */
    public Beneficiary get(GetRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/beneficiaries/{id}")
            .addPathParam("id", request.getId())
            .addQueryParam("on_behalf_of", request.getOnBehalfOf(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, Beneficiary.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Verify Beneficiary Account
    *
    * This service is currently only available to in-scope clients who must provide Confirmation of Payee services to their end-users making local GBP payments in the UK.<br><br> In the UK, Confirmation of Payee is a peer-to-peer name-checking service designed to help reduce misdirected payments and provide greater assurance that payments are being sent, and collected from, the intended account holder for UK domestic payments. <br><br> Currently, access is restricted to UK institutions and in-scope clients.<br><br> We plan to add more market coverage to this API in the future, thereby extending access to additional clients.<br><br> If you're interested in learning more or have received notification that you're in-scope, please contact your Customer Success Manager.
    *
    * POST /beneficiaries/account_verification
    */
    public BeneficiaryAccountVerificationResult accountVerification(AccountVerificationRequest
            request) {
        return accountVerification(request, null);
    }


    /**
    * Verify Beneficiary Account
    *
    * This service is currently only available to in-scope clients who must provide Confirmation of Payee services to their end-users making local GBP payments in the UK.<br><br> In the UK, Confirmation of Payee is a peer-to-peer name-checking service designed to help reduce misdirected payments and provide greater assurance that payments are being sent, and collected from, the intended account holder for UK domestic payments. <br><br> Currently, access is restricted to UK institutions and in-scope clients.<br><br> We plan to add more market coverage to this API in the future, thereby extending access to additional clients.<br><br> If you're interested in learning more or have received notification that you're in-scope, please contact your Customer Success Manager.
    *
    * POST /beneficiaries/account_verification
    */
    public BeneficiaryAccountVerificationResult accountVerification(AccountVerificationRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/beneficiaries/account_verification")
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(BeneficiariesAccountVerificationBody.builder().beneficiaryCompanyName(
                                       request.getBeneficiaryCompanyName()).beneficiaryFirstName(
                                       request.getBeneficiaryFirstName()).beneficiaryLastName(request.getBeneficiaryLastName()).bicSwift(
                                       request.getBicSwift()).currency(request.getCurrency()).iban(request.getIban()).paymentType(
                                       request.getPaymentType()).routingCodeType1(request.getRoutingCodeType1()).routingCodeType2(
                                       request.getRoutingCodeType2()).routingCodeValue2(
                                       request.getRoutingCodeValue2()).secondaryReferenceData(
                                       request.getSecondaryReferenceData()).accountNumber(request.getAccountNumber()).bankCountry(
                                       request.getBankCountry()).beneficiaryEntityType(
                                       request.getBeneficiaryEntityType()).routingCodeValue1(request.getRoutingCodeValue1()).build(),
                                   Map.ofEntries(Map.entry("account_number", "form"), Map.entry("bank_country", "form"),
                                                 Map.entry("beneficiary_company_name", "form"), Map.entry("beneficiary_entity_type", "form"),
                                                 Map.entry("beneficiary_first_name", "form"), Map.entry("beneficiary_last_name", "form"),
                                                 Map.entry("bic_swift", "form"), Map.entry("currency", "form"), Map.entry("iban", "form"),
                                                 Map.entry("payment_type", "form"), Map.entry("routing_code_type_1", "form"),
                                                 Map.entry("routing_code_type_2", "form"), Map.entry("routing_code_value_1", "form"),
                                                 Map.entry("routing_code_value_2", "form"), Map.entry("secondary_reference_data", "form")),
                                   Map.ofEntries(Map.entry("account_number", true), Map.entry("bank_country", true),
                                                 Map.entry("beneficiary_company_name", true), Map.entry("beneficiary_entity_type", true),
                                                 Map.entry("beneficiary_first_name", true), Map.entry("beneficiary_last_name", true),
                                                 Map.entry("bic_swift", true), Map.entry("currency", true), Map.entry("iban", true),
                                                 Map.entry("payment_type", true), Map.entry("routing_code_type_1", true),
                                                 Map.entry("routing_code_type_2", true), Map.entry("routing_code_value_1", true),
                                                 Map.entry("routing_code_value_2", true), Map.entry("secondary_reference_data", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, BeneficiaryAccountVerificationResult.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Create Beneficiary
    *
    * Creates a new beneficiary. Returns the new beneficiary entity on success.
    *
    * POST /beneficiaries/create
    */
    public Beneficiary create(CreateRequest request) {
        return create(request, null);
    }


    /**
    * Create Beneficiary
    *
    * Creates a new beneficiary. Returns the new beneficiary entity on success.
    *
    * POST /beneficiaries/create
    */
    public Beneficiary create(CreateRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/beneficiaries/create")
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(BeneficiariesCreateBody.builder().accountNumber(
                                       request.getAccountNumber()).bankAccountType(request.getBankAccountType()).bankAddress(
                                       request.getBankAddress()).bankName(request.getBankName()).beneficiaryAddress(
                                       request.getBeneficiaryAddress()).beneficiaryCity(
                                       request.getBeneficiaryCity()).beneficiaryCompanyName(
                                       request.getBeneficiaryCompanyName()).beneficiaryCountry(
                                       request.getBeneficiaryCountry()).beneficiaryDateOfBirth(
                                       request.getBeneficiaryDateOfBirth()).beneficiaryEntityType(
                                       request.getBeneficiaryEntityType()).beneficiaryExternalReference(
                                       request.getBeneficiaryExternalReference()).beneficiaryFirstName(
                                       request.getBeneficiaryFirstName()).beneficiaryIdentificationType(
                                       request.getBeneficiaryIdentificationType()).beneficiaryIdentificationValue(
                                       request.getBeneficiaryIdentificationValue()).beneficiaryLastName(
                                       request.getBeneficiaryLastName()).beneficiaryPostcode(
                                       request.getBeneficiaryPostcode()).beneficiaryStateOrProvince(
                                       request.getBeneficiaryStateOrProvince()).bicSwift(request.getBicSwift()).businessNature(
                                       request.getBusinessNature()).companyWebsite(request.getCompanyWebsite()).defaultBeneficiary(
                                       request.getDefaultBeneficiary()).email(request.getEmail()).iban(request.getIban()).onBehalfOf(
                                       request.getOnBehalfOf()).paymentTypes(request.getPaymentTypes()).routingCodeType1(
                                       request.getRoutingCodeType1()).routingCodeType2(request.getRoutingCodeType2()).routingCodeValue1(
                                       request.getRoutingCodeValue1()).routingCodeValue2(
                                       request.getRoutingCodeValue2()).bankAccountHolderName(
                                       request.getBankAccountHolderName()).bankCountry(request.getBankCountry()).currency(
                                       request.getCurrency()).name(request.getName()).build(), Map.ofEntries(Map.entry("account_number",
                                               "form"), Map.entry("bank_account_holder_name", "form"), Map.entry("bank_account_type", "form"),
                                               Map.entry("bank_address", "form"), Map.entry("bank_country", "form"), Map.entry("bank_name",
                                                       "form"), Map.entry("beneficiary_address", "form"), Map.entry("beneficiary_city", "form"),
                                               Map.entry("beneficiary_company_name", "form"), Map.entry("beneficiary_country", "form"),
                                               Map.entry("beneficiary_date_of_birth", "form"), Map.entry("beneficiary_entity_type", "form"),
                                               Map.entry("beneficiary_external_reference", "form"), Map.entry("beneficiary_first_name", "form"),
                                               Map.entry("beneficiary_identification_type", "form"), Map.entry("beneficiary_identification_value",
                                                       "form"), Map.entry("beneficiary_last_name", "form"), Map.entry("beneficiary_postcode", "form"),
                                               Map.entry("beneficiary_state_or_province", "form"), Map.entry("bic_swift", "form"),
                                               Map.entry("business_nature", "form"), Map.entry("company_website", "form"), Map.entry("currency",
                                                       "form"), Map.entry("default_beneficiary", "form"), Map.entry("email", "form"), Map.entry("iban",
                                                               "form"), Map.entry("name", "form"), Map.entry("on_behalf_of", "form"), Map.entry("payment_types[]",
                                                                       "form"), Map.entry("routing_code_type_1", "form"), Map.entry("routing_code_type_2", "form"),
                                               Map.entry("routing_code_value_1", "form"), Map.entry("routing_code_value_2", "form")),
                                   Map.ofEntries(Map.entry("account_number", true), Map.entry("bank_account_holder_name", true),
                                                 Map.entry("bank_account_type", true), Map.entry("bank_address", true), Map.entry("bank_country",
                                                         true), Map.entry("bank_name", true), Map.entry("beneficiary_address", true),
                                                 Map.entry("beneficiary_city", true), Map.entry("beneficiary_company_name", true),
                                                 Map.entry("beneficiary_country", true), Map.entry("beneficiary_date_of_birth", true),
                                                 Map.entry("beneficiary_entity_type", true), Map.entry("beneficiary_external_reference", true),
                                                 Map.entry("beneficiary_first_name", true), Map.entry("beneficiary_identification_type", true),
                                                 Map.entry("beneficiary_identification_value", true), Map.entry("beneficiary_last_name", true),
                                                 Map.entry("beneficiary_postcode", true), Map.entry("beneficiary_state_or_province", true),
                                                 Map.entry("bic_swift", true), Map.entry("business_nature", true), Map.entry("company_website",
                                                         true), Map.entry("currency", true), Map.entry("default_beneficiary", true), Map.entry("email",
                                                                 true), Map.entry("iban", true), Map.entry("name", true), Map.entry("on_behalf_of", true),
                                                 Map.entry("payment_types[]", true), Map.entry("routing_code_type_1", true),
                                                 Map.entry("routing_code_type_2", true), Map.entry("routing_code_value_1", true),
                                                 Map.entry("routing_code_value_2", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, Beneficiary.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Find Beneficiaries
    *
    * Returns beneficiaries attached to the account or any sub-account owned by the authenticated user.
    *
    * POST /beneficiaries/find
    */
    public BeneficiariesFindResponse find(FindRequest request) {
        return find(request, null);
    }


    /**
    * Find Beneficiaries
    *
    * Returns beneficiaries attached to the account or any sub-account owned by the authenticated user.
    *
    * POST /beneficiaries/find
    */
    public BeneficiariesFindResponse find(FindRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/beneficiaries/find")
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(BeneficiariesFindBody.builder().accountNumber(
                                       request.getAccountNumber()).bankAccountHolderName(
                                       request.getBankAccountHolderName()).bankAccountType(request.getBankAccountType()).bankName(
                                       request.getBankName()).beneficiaryCity(request.getBeneficiaryCity()).beneficiaryCompanyName(
                                       request.getBeneficiaryCompanyName()).beneficiaryCountry(
                                       request.getBeneficiaryCountry()).beneficiaryDateOfBirth(
                                       request.getBeneficiaryDateOfBirth()).beneficiaryEntityType(
                                       request.getBeneficiaryEntityType()).beneficiaryExternalReference(
                                       request.getBeneficiaryExternalReference()).beneficiaryFirstName(
                                       request.getBeneficiaryFirstName()).beneficiaryLastName(
                                       request.getBeneficiaryLastName()).beneficiaryPostcode(
                                       request.getBeneficiaryPostcode()).beneficiaryStateOrProvince(
                                       request.getBeneficiaryStateOrProvince()).bicSwift(request.getBicSwift()).currency(
                                       request.getCurrency()).defaultBeneficiary(request.getDefaultBeneficiary()).iban(
                                       request.getIban()).name(request.getName()).onBehalfOf(request.getOnBehalfOf()).order(
                                       request.getOrder()).orderAscDesc(request.getOrderAscDesc()).page(request.getPage()).perPage(
                                       request.getPerPage()).routingCodeType0(request.getRoutingCodeType0()).routingCodeValue0(
                                       request.getRoutingCodeValue0()).scope(request.getScope()).build(),
                                   Map.ofEntries(Map.entry("account_number", "form"), Map.entry("bank_account_holder_name", "form"),
                                                 Map.entry("bank_account_type", "form"), Map.entry("bank_name", "form"),
                                                 Map.entry("beneficiary_city", "form"), Map.entry("beneficiary_company_name", "form"),
                                                 Map.entry("beneficiary_country", "form"), Map.entry("beneficiary_date_of_birth", "form"),
                                                 Map.entry("beneficiary_entity_type", "form"), Map.entry("beneficiary_external_reference", "form"),
                                                 Map.entry("beneficiary_first_name", "form"), Map.entry("beneficiary_last_name", "form"),
                                                 Map.entry("beneficiary_postcode", "form"), Map.entry("beneficiary_state_or_province", "form"),
                                                 Map.entry("bic_swift", "form"), Map.entry("currency", "form"), Map.entry("default_beneficiary",
                                                         "form"), Map.entry("iban", "form"), Map.entry("name", "form"), Map.entry("on_behalf_of", "form"),
                                                 Map.entry("order", "form"), Map.entry("order_asc_desc", "form"), Map.entry("page", "form"),
                                                 Map.entry("per_page", "form"), Map.entry("routing_code_type[0]", "form"),
                                                 Map.entry("routing_code_value[0]", "form"), Map.entry("scope", "form")),
                                   Map.ofEntries(Map.entry("account_number", true), Map.entry("bank_account_holder_name", true),
                                                 Map.entry("bank_account_type", true), Map.entry("bank_name", true), Map.entry("beneficiary_city",
                                                         true), Map.entry("beneficiary_company_name", true), Map.entry("beneficiary_country", true),
                                                 Map.entry("beneficiary_date_of_birth", true), Map.entry("beneficiary_entity_type", true),
                                                 Map.entry("beneficiary_external_reference", true), Map.entry("beneficiary_first_name", true),
                                                 Map.entry("beneficiary_last_name", true), Map.entry("beneficiary_postcode", true),
                                                 Map.entry("beneficiary_state_or_province", true), Map.entry("bic_swift", true),
                                                 Map.entry("currency", true), Map.entry("default_beneficiary", true), Map.entry("iban", true),
                                                 Map.entry("name", true), Map.entry("on_behalf_of", true), Map.entry("order", true),
                                                 Map.entry("order_asc_desc", true), Map.entry("page", true), Map.entry("per_page", true),
                                                 Map.entry("routing_code_type[0]", true), Map.entry("routing_code_value[0]", true),
                                                 Map.entry("scope", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, BeneficiariesFindResponse.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Validate Beneficiary
    *
    * Validates a new beneficiary's bank details, without actually creating a record of the beneficiary. On success, returns an object that represents the entity that would be created if the beneficiary was saved.
    *
    * POST /beneficiaries/validate
    */
    public Beneficiary validate(ValidateRequest request) {
        return validate(request, null);
    }


    /**
    * Validate Beneficiary
    *
    * Validates a new beneficiary's bank details, without actually creating a record of the beneficiary. On success, returns an object that represents the entity that would be created if the beneficiary was saved.
    *
    * POST /beneficiaries/validate
    */
    public Beneficiary validate(ValidateRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/beneficiaries/validate")
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(BeneficiariesValidateBody.builder().accountNumber(
                                       request.getAccountNumber()).bankAccountType(request.getBankAccountType()).bankAddress(
                                       request.getBankAddress()).bankName(request.getBankName()).beneficiaryAddress(
                                       request.getBeneficiaryAddress()).beneficiaryCity(
                                       request.getBeneficiaryCity()).beneficiaryCompanyName(
                                       request.getBeneficiaryCompanyName()).beneficiaryCountry(
                                       request.getBeneficiaryCountry()).beneficiaryDateOfBirth(
                                       request.getBeneficiaryDateOfBirth()).beneficiaryEntityType(
                                       request.getBeneficiaryEntityType()).beneficiaryFirstName(
                                       request.getBeneficiaryFirstName()).beneficiaryIdentificationType(
                                       request.getBeneficiaryIdentificationType()).beneficiaryIdentificationValue(
                                       request.getBeneficiaryIdentificationValue()).beneficiaryLastName(
                                       request.getBeneficiaryLastName()).beneficiaryPostcode(
                                       request.getBeneficiaryPostcode()).beneficiaryStateOrProvince(
                                       request.getBeneficiaryStateOrProvince()).bicSwift(request.getBicSwift()).iban(
                                       request.getIban()).onBehalfOf(request.getOnBehalfOf()).paymentTypes(
                                       request.getPaymentTypes()).routingCodeType1(request.getRoutingCodeType1()).routingCodeType2(
                                       request.getRoutingCodeType2()).routingCodeValue1(request.getRoutingCodeValue1()).routingCodeValue2(
                                       request.getRoutingCodeValue2()).bankCountry(request.getBankCountry()).currency(
                                       request.getCurrency()).build(), Map.ofEntries(Map.entry("account_number", "form"),
                                               Map.entry("bank_account_type", "form"), Map.entry("bank_address", "form"), Map.entry("bank_country",
                                                       "form"), Map.entry("bank_name", "form"), Map.entry("beneficiary_address", "form"),
                                               Map.entry("beneficiary_city", "form"), Map.entry("beneficiary_company_name", "form"),
                                               Map.entry("beneficiary_country", "form"), Map.entry("beneficiary_date_of_birth", "form"),
                                               Map.entry("beneficiary_entity_type", "form"), Map.entry("beneficiary_first_name", "form"),
                                               Map.entry("beneficiary_identification_type", "form"), Map.entry("beneficiary_identification_value",
                                                       "form"), Map.entry("beneficiary_last_name", "form"), Map.entry("beneficiary_postcode", "form"),
                                               Map.entry("beneficiary_state_or_province", "form"), Map.entry("bic_swift", "form"),
                                               Map.entry("currency", "form"), Map.entry("iban", "form"), Map.entry("on_behalf_of", "form"),
                                               Map.entry("payment_types[]", "form"), Map.entry("routing_code_type_1", "form"),
                                               Map.entry("routing_code_type_2", "form"), Map.entry("routing_code_value_1", "form"),
                                               Map.entry("routing_code_value_2", "form")), Map.ofEntries(Map.entry("account_number", true),
                                                       Map.entry("bank_account_type", true), Map.entry("bank_address", true), Map.entry("bank_country",
                                                               true), Map.entry("bank_name", true), Map.entry("beneficiary_address", true),
                                                       Map.entry("beneficiary_city", true), Map.entry("beneficiary_company_name", true),
                                                       Map.entry("beneficiary_country", true), Map.entry("beneficiary_date_of_birth", true),
                                                       Map.entry("beneficiary_entity_type", true), Map.entry("beneficiary_first_name", true),
                                                       Map.entry("beneficiary_identification_type", true), Map.entry("beneficiary_identification_value",
                                                               true), Map.entry("beneficiary_last_name", true), Map.entry("beneficiary_postcode", true),
                                                       Map.entry("beneficiary_state_or_province", true), Map.entry("bic_swift", true),
                                                       Map.entry("currency", true), Map.entry("iban", true), Map.entry("on_behalf_of", true),
                                                       Map.entry("payment_types[]", true), Map.entry("routing_code_type_1", true),
                                                       Map.entry("routing_code_type_2", true), Map.entry("routing_code_value_1", true),
                                                       Map.entry("routing_code_value_2", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, Beneficiary.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Update Beneficiary
    *
    * Updates an existing beneficiary. Returns the updated beneficiary entity on success. <br> Please note that it's not possible to change a beneficiary's entity type (company or individual) by an update. To achieve this, you should create a new beneficiary.
    *
    * POST /beneficiaries/{id}
    */
    public Beneficiary update(UpdateRequest request) {
        return update(request, null);
    }


    /**
    * Update Beneficiary
    *
    * Updates an existing beneficiary. Returns the updated beneficiary entity on success. <br> Please note that it's not possible to change a beneficiary's entity type (company or individual) by an update. To achieve this, you should create a new beneficiary.
    *
    * POST /beneficiaries/{id}
    */
    public Beneficiary update(UpdateRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/beneficiaries/{id}")
            .addPathParam("id", request.getId())
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(BeneficiariesUpdateBody.builder().accountNumber(
                                       request.getAccountNumber()).bankAccountHolderName(
                                       request.getBankAccountHolderName()).bankAccountType(request.getBankAccountType()).bankAddress(
                                       request.getBankAddress()).bankCountry(request.getBankCountry()).bankName(
                                       request.getBankName()).beneficiaryAddress(request.getBeneficiaryAddress()).beneficiaryCity(
                                       request.getBeneficiaryCity()).beneficiaryCompanyName(
                                       request.getBeneficiaryCompanyName()).beneficiaryCountry(
                                       request.getBeneficiaryCountry()).beneficiaryDateOfBirth(
                                       request.getBeneficiaryDateOfBirth()).beneficiaryEntityType(
                                       request.getBeneficiaryEntityType()).beneficiaryExternalReference(
                                       request.getBeneficiaryExternalReference()).beneficiaryFirstName(
                                       request.getBeneficiaryFirstName()).beneficiaryIdentificationType(
                                       request.getBeneficiaryIdentificationType()).beneficiaryIdentificationValue(
                                       request.getBeneficiaryIdentificationValue()).beneficiaryLastName(
                                       request.getBeneficiaryLastName()).beneficiaryPostcode(
                                       request.getBeneficiaryPostcode()).beneficiaryStateOrProvince(
                                       request.getBeneficiaryStateOrProvince()).bicSwift(request.getBicSwift()).businessNature(
                                       request.getBusinessNature()).companyWebsite(request.getCompanyWebsite()).currency(
                                       request.getCurrency()).defaultBeneficiary(request.getDefaultBeneficiary()).email(
                                       request.getEmail()).iban(request.getIban()).name(request.getName()).onBehalfOf(
                                       request.getOnBehalfOf()).paymentTypes(request.getPaymentTypes()).routingCodeType1(
                                       request.getRoutingCodeType1()).routingCodeType2(request.getRoutingCodeType2()).routingCodeValue1(
                                       request.getRoutingCodeValue1()).routingCodeValue2(request.getRoutingCodeValue2()).build(),
                                   Map.ofEntries(Map.entry("account_number", "form"), Map.entry("bank_account_holder_name", "form"),
                                                 Map.entry("bank_account_type", "form"), Map.entry("bank_address", "form"), Map.entry("bank_country",
                                                         "form"), Map.entry("bank_name", "form"), Map.entry("beneficiary_address", "form"),
                                                 Map.entry("beneficiary_city", "form"), Map.entry("beneficiary_company_name", "form"),
                                                 Map.entry("beneficiary_country", "form"), Map.entry("beneficiary_date_of_birth", "form"),
                                                 Map.entry("beneficiary_entity_type", "form"), Map.entry("beneficiary_external_reference", "form"),
                                                 Map.entry("beneficiary_first_name", "form"), Map.entry("beneficiary_identification_type", "form"),
                                                 Map.entry("beneficiary_identification_value", "form"), Map.entry("beneficiary_last_name", "form"),
                                                 Map.entry("beneficiary_postcode", "form"), Map.entry("beneficiary_state_or_province", "form"),
                                                 Map.entry("bic_swift", "form"), Map.entry("business_nature", "form"), Map.entry("company_website",
                                                         "form"), Map.entry("currency", "form"), Map.entry("default_beneficiary", "form"), Map.entry("email",
                                                                 "form"), Map.entry("iban", "form"), Map.entry("name", "form"), Map.entry("on_behalf_of", "form"),
                                                 Map.entry("payment_types[]", "form"), Map.entry("routing_code_type_1", "form"),
                                                 Map.entry("routing_code_type_2", "form"), Map.entry("routing_code_value_1", "form"),
                                                 Map.entry("routing_code_value_2", "form")), Map.ofEntries(Map.entry("account_number", true),
                                                         Map.entry("bank_account_holder_name", true), Map.entry("bank_account_type", true),
                                                         Map.entry("bank_address", true), Map.entry("bank_country", true), Map.entry("bank_name", true),
                                                         Map.entry("beneficiary_address", true), Map.entry("beneficiary_city", true),
                                                         Map.entry("beneficiary_company_name", true), Map.entry("beneficiary_country", true),
                                                         Map.entry("beneficiary_date_of_birth", true), Map.entry("beneficiary_entity_type", true),
                                                         Map.entry("beneficiary_external_reference", true), Map.entry("beneficiary_first_name", true),
                                                         Map.entry("beneficiary_identification_type", true), Map.entry("beneficiary_identification_value",
                                                                 true), Map.entry("beneficiary_last_name", true), Map.entry("beneficiary_postcode", true),
                                                         Map.entry("beneficiary_state_or_province", true), Map.entry("bic_swift", true),
                                                         Map.entry("business_nature", true), Map.entry("company_website", true), Map.entry("currency", true),
                                                         Map.entry("default_beneficiary", true), Map.entry("email", true), Map.entry("iban", true),
                                                         Map.entry("name", true), Map.entry("on_behalf_of", true), Map.entry("payment_types[]", true),
                                                         Map.entry("routing_code_type_1", true), Map.entry("routing_code_type_2", true),
                                                         Map.entry("routing_code_value_1", true), Map.entry("routing_code_value_2", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, Beneficiary.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Delete Beneficiary
    *
    * Delete a beneficiary associated with a sub-account. If the deletion is successful, the beneficiary's final state is returned.
    *
    * POST /beneficiaries/{id}/delete
    */
    public Beneficiary delete (DeleteRequest request) {
        return delete (request, null);
    }


    /**
    * Delete Beneficiary
    *
    * Delete a beneficiary associated with a sub-account. If the deletion is successful, the beneficiary's final state is returned.
    *
    * POST /beneficiaries/{id}/delete
    */
    public Beneficiary delete (DeleteRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/beneficiaries/{id}/delete")
            .addPathParam("id", request.getId())
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(BeneficiariesDeleteBody.builder().onBehalfOf(
                                       request.getOnBehalfOf()).build(), Map.ofEntries(Map.entry("on_behalf_of", "form")),
                                   Map.ofEntries(Map.entry("on_behalf_of", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, Beneficiary.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }








}
