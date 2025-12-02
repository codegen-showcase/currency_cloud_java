
package com.currencycloud.sdk.resources.payments;

import java.io.IOException;
import java.util.Map;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.core.BaseClient;
import com.currencycloud.sdk.core.HttpRequestBuilder;
import com.currencycloud.sdk.core.RequestOptions;
import com.currencycloud.sdk.core.ResponseHandler;
import com.currencycloud.sdk.model.Payment;
import com.currencycloud.sdk.model.PaymentAuthorisations;
import com.currencycloud.sdk.model.PaymentConfirmation;
import com.currencycloud.sdk.model.PaymentDeliveryDate;
import com.currencycloud.sdk.model.PaymentFeeAssignment;
import com.currencycloud.sdk.model.PaymentFeeUnassignment;
import com.currencycloud.sdk.model.PaymentSubmissionInformation;
import com.currencycloud.sdk.model.PaymentTrackingInfo;
import com.currencycloud.sdk.model.PaymentsAssignPaymentFeeBody;
import com.currencycloud.sdk.model.PaymentsCreateBody;
import com.currencycloud.sdk.model.PaymentsDeleteBody;
import com.currencycloud.sdk.model.PaymentsFindResponse;
import com.currencycloud.sdk.model.PaymentsGetPaymentFeesResponse;
import com.currencycloud.sdk.model.PaymentsUnassignPaymentFeeBody;
import com.currencycloud.sdk.model.PaymentsUpdateBody;
import com.currencycloud.sdk.model.PaymentsValidateBody;
import com.currencycloud.sdk.model.PaymentsValidateResponse;
import com.currencycloud.sdk.model.QuotePaymentFee;
import com.currencycloud.sdk.resources.payments.params.AssignPaymentFeeRequest;
import com.currencycloud.sdk.resources.payments.params.AuthoriseRequest;
import com.currencycloud.sdk.resources.payments.params.ConfirmationRequest;
import com.currencycloud.sdk.resources.payments.params.CreateRequest;
import com.currencycloud.sdk.resources.payments.params.DeleteRequest;
import com.currencycloud.sdk.resources.payments.params.FindRequest;
import com.currencycloud.sdk.resources.payments.params.GetDeliveryDateRequest;
import com.currencycloud.sdk.resources.payments.params.GetPaymentFeesRequest;
import com.currencycloud.sdk.resources.payments.params.GetRequest;
import com.currencycloud.sdk.resources.payments.params.GetSubmissionInfoRequest;
import com.currencycloud.sdk.resources.payments.params.GetTrackingInfoRequest;
import com.currencycloud.sdk.resources.payments.params.QuotePaymentFeeRequest;
import com.currencycloud.sdk.resources.payments.params.RetryNotificationsRequest;
import com.currencycloud.sdk.resources.payments.params.UnassignPaymentFeeRequest;
import com.currencycloud.sdk.resources.payments.params.UpdateRequest;
import com.currencycloud.sdk.resources.payments.params.ValidateRequest;
import com.fasterxml.jackson.core.type.TypeReference;


public class PaymentsClient {
    protected final BaseClient baseClient;

    public PaymentsClient(BaseClient baseClient) {
        this.baseClient = baseClient;

    }

    /**
    * Find Payments
    *
    * Searches for payment records.
    *
    * GET /payments/find
    */
    public PaymentsFindResponse find() {
        return find(FindRequest.builder().build(), null);
    }


    /**
    * Find Payments
    *
    * Searches for payment records.
    *
    * GET /payments/find
    */
    public PaymentsFindResponse find(FindRequest request) {
        return find(request, null);
    }


    /**
    * Find Payments
    *
    * Searches for payment records.
    *
    * GET /payments/find
    */
    public PaymentsFindResponse find(FindRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/payments/find")
            .addQueryParam("amount", request.getAmount(), "form", true)
            .addQueryParam("amount_from", request.getAmountFrom(), "form", true)
            .addQueryParam("amount_to", request.getAmountTo(), "form", true)
            .addQueryParam("beneficiary_id", request.getBeneficiaryId(), "form", true)
            .addQueryParam("bulk_upload_id", request.getBulkUploadId(), "form", true)
            .addQueryParam("charge_type", request.getChargeType(), "form", true)
            .addQueryParam("conversion_id", request.getConversionId(), "form", true)
            .addQueryParam("created_at_from", request.getCreatedAtFrom(), "form", true)
            .addQueryParam("created_at_to", request.getCreatedAtTo(), "form", true)
            .addQueryParam("currency", request.getCurrency(), "form", true)
            .addQueryParam("on_behalf_of", request.getOnBehalfOf(), "form", true)
            .addQueryParam("order", request.getOrder(), "form", true)
            .addQueryParam("order_asc_desc", request.getOrderAscDesc(), "form", true)
            .addQueryParam("page", request.getPage(), "form", true)
            .addQueryParam("payment_date_from", request.getPaymentDateFrom(), "form", true)
            .addQueryParam("payment_date_to", request.getPaymentDateTo(), "form", true)
            .addQueryParam("payment_group_id", request.getPaymentGroupId(), "form", true)
            .addQueryParam("per_page", request.getPerPage(), "form", true)
            .addQueryParam("reason", request.getReason(), "form", true)
            .addQueryParam("review_status", request.getReviewStatus(), "form", true)
            .addQueryParam("scope", request.getScope(), "form", true)
            .addQueryParam("short_reference", request.getShortReference(), "form", true)
            .addQueryParam("status", request.getStatus(), "form", true)
            .addQueryParam("transferred_at_from", request.getTransferredAtFrom(), "form", true)
            .addQueryParam("transferred_at_to", request.getTransferredAtTo(), "form", true)
            .addQueryParam("unique_request_id", request.getUniqueRequestId(), "form", true)
            .addQueryParam("updated_at_from", request.getUpdatedAtFrom(), "form", true)
            .addQueryParam("updated_at_to", request.getUpdatedAtTo(), "form", true)
            .addQueryParam("with_deleted", request.getWithDeleted(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, PaymentsFindResponse.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Payment Delivery Date
    *
    * Gets payment delivery date.
    *
    * GET /payments/payment_delivery_date
    */
    public PaymentDeliveryDate getDeliveryDate(GetDeliveryDateRequest request) {
        return getDeliveryDate(request, null);
    }


    /**
    * Get Payment Delivery Date
    *
    * Gets payment delivery date.
    *
    * GET /payments/payment_delivery_date
    */
    public PaymentDeliveryDate getDeliveryDate(GetDeliveryDateRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/payments/payment_delivery_date")
            .addQueryParam("bank_country", request.getBankCountry(), "form", true)
            .addQueryParam("currency", request.getCurrency(), "form", true)
            .addQueryParam("payment_date", request.getPaymentDate(), "form", true)
            .addQueryParam("payment_type", request.getPaymentType(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, PaymentDeliveryDate.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Payment Fees
    *
    * Gets the <a href="https://support.currencycloud.com/hc/en-gb/articles/360017471459-Applying-fees-to-individual-payments-FAQ">payment fee</a> tables for the current authenticated account.
    *
    * GET /payments/payment_fees
    */
    public PaymentsGetPaymentFeesResponse getPaymentFees() {
        return getPaymentFees(GetPaymentFeesRequest.builder().build(), null);
    }


    /**
    * Get Payment Fees
    *
    * Gets the <a href="https://support.currencycloud.com/hc/en-gb/articles/360017471459-Applying-fees-to-individual-payments-FAQ">payment fee</a> tables for the current authenticated account.
    *
    * GET /payments/payment_fees
    */
    public PaymentsGetPaymentFeesResponse getPaymentFees(GetPaymentFeesRequest request) {
        return getPaymentFees(request, null);
    }


    /**
    * Get Payment Fees
    *
    * Gets the <a href="https://support.currencycloud.com/hc/en-gb/articles/360017471459-Applying-fees-to-individual-payments-FAQ">payment fee</a> tables for the current authenticated account.
    *
    * GET /payments/payment_fees
    */
    public PaymentsGetPaymentFeesResponse getPaymentFees(GetPaymentFeesRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/payments/payment_fees")
            .addQueryParam("order", request.getOrder(), "form", true)
            .addQueryParam("order_asc_desc", request.getOrderAscDesc(), "form", true)
            .addQueryParam("page", request.getPage(), "form", true)
            .addQueryParam("per_page", request.getPerPage(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, PaymentsGetPaymentFeesResponse.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Quote Payment Fee
    *
    * Gets the calculated quote for the fee that will be applied against a payment.
    *
    * GET /payments/quote_payment_fee
    */
    public QuotePaymentFee quotePaymentFee(QuotePaymentFeeRequest request) {
        return quotePaymentFee(request, null);
    }


    /**
    * Get Quote Payment Fee
    *
    * Gets the calculated quote for the fee that will be applied against a payment.
    *
    * GET /payments/quote_payment_fee
    */
    public QuotePaymentFee quotePaymentFee(QuotePaymentFeeRequest request,
                                           RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/payments/quote_payment_fee")
            .addQueryParam("payment_currency", request.getPaymentCurrency(), "form", true)
            .addQueryParam("payment_destination_country", request.getPaymentDestinationCountry(), "form", true)
            .addQueryParam("payment_type", request.getPaymentType(), "form", true)
            .addQueryParam("account_id", request.getAccountId(), "form", true)
            .addQueryParam("charge_type", request.getChargeType(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, QuotePaymentFee.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Payment
    *
    * Gets a payment record.
    *
    * GET /payments/{id}
    */
    public Payment get(GetRequest request) {
        return get(request, null);
    }


    /**
    * Get Payment
    *
    * Gets a payment record.
    *
    * GET /payments/{id}
    */
    public Payment get(GetRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/payments/{id}")
            .addPathParam("id", request.getId())
            .addQueryParam("on_behalf_of", request.getOnBehalfOf(), "form", true)
            .addQueryParam("review_status", request.getReviewStatus(), "form", true)
            .addQueryParam("with_deleted", request.getWithDeleted(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, Payment.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Payment Confirmation
    *
    * Gets confirmation for a given payment.
    *
    * GET /payments/{id}/confirmation
    */
    public PaymentConfirmation confirmation(ConfirmationRequest request) {
        return confirmation(request, null);
    }


    /**
    * Get Payment Confirmation
    *
    * Gets confirmation for a given payment.
    *
    * GET /payments/{id}/confirmation
    */
    public PaymentConfirmation confirmation(ConfirmationRequest request,
                                            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/payments/{id}/confirmation")
            .addPathParam("id", request.getId())
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, PaymentConfirmation.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Payment Submission Information
    *
    * Gets the pacs.008 or MT103 information for a Swift payment.
    *
    * GET /payments/{id}/submission_info
    */
    public PaymentSubmissionInformation getSubmissionInfo(GetSubmissionInfoRequest request) {
        return getSubmissionInfo(request, null);
    }


    /**
    * Get Payment Submission Information
    *
    * Gets the pacs.008 or MT103 information for a Swift payment.
    *
    * GET /payments/{id}/submission_info
    */
    public PaymentSubmissionInformation getSubmissionInfo(GetSubmissionInfoRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/payments/{id}/submission_info")
            .addPathParam("id", request.getId())
            .addQueryParam("on_behalf_of", request.getOnBehalfOf(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, PaymentSubmissionInformation.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Get Payment Tracking Information
    *
    * Gets the tracking information for a payment.
    *
    * GET /payments/{id}/tracking_info
    */
    public PaymentTrackingInfo getTrackingInfo(GetTrackingInfoRequest request) {
        return getTrackingInfo(request, null);
    }


    /**
    * Get Payment Tracking Information
    *
    * Gets the tracking information for a payment.
    *
    * GET /payments/{id}/tracking_info
    */
    public PaymentTrackingInfo getTrackingInfo(GetTrackingInfoRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/payments/{id}/tracking_info")
            .addPathParam("id", request.getId())
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, PaymentTrackingInfo.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Assign Payment Fee
    *
    * Assigns a <a href="https://support.currencycloud.com/hc/en-gb/articles/360017471459-Applying-fees-to-individual-payments-FAQ">payment fee</a> table to a specific sub-account.
    *
    * POST /payments/assign_payment_fee
    */
    public PaymentFeeAssignment assignPaymentFee(AssignPaymentFeeRequest request) {
        return assignPaymentFee(request, null);
    }


    /**
    * Assign Payment Fee
    *
    * Assigns a <a href="https://support.currencycloud.com/hc/en-gb/articles/360017471459-Applying-fees-to-individual-payments-FAQ">payment fee</a> table to a specific sub-account.
    *
    * POST /payments/assign_payment_fee
    */
    public PaymentFeeAssignment assignPaymentFee(AssignPaymentFeeRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/payments/assign_payment_fee")
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(PaymentsAssignPaymentFeeBody.builder().accountId(
                                       request.getAccountId()).paymentFeeId(request.getPaymentFeeId()).build(),
                                   Map.ofEntries(Map.entry("account_id", "form"), Map.entry("payment_fee_id", "form")),
                                   Map.ofEntries(Map.entry("account_id", true), Map.entry("payment_fee_id", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, PaymentFeeAssignment.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Authorise Payment
    *
    * Authorises a payment pending authorisation.
    *
    * POST /payments/authorise
    */
    public PaymentAuthorisations authorise(AuthoriseRequest request) {
        return authorise(request, null);
    }


    /**
    * Authorise Payment
    *
    * Authorises a payment pending authorisation.
    *
    * POST /payments/authorise
    */
    public PaymentAuthorisations authorise(AuthoriseRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/payments/authorise")
            .addQueryParam("payment_ids[]", request.getPaymentIds(), "form", false)
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, PaymentAuthorisations.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Create Payment
    *
    * Submits a payment. On success, returns the new payment record. Use the <a href="/api-reference/#get-payer-requirements">Get Payer Requirements</a> endpoint to find out what payer information needs to be provided.<br><br> Clients who are implementing Strong Customer Authentication (SCA) for payments should refer to our <a href="../guides/integration-guides/sca_sponsored_api_payments">integration guide</a>.
    *
    * POST /payments/create
    */
    public Payment create(CreateRequest request) {
        return create(request, null);
    }


    /**
    * Create Payment
    *
    * Submits a payment. On success, returns the new payment record. Use the <a href="/api-reference/#get-payer-requirements">Get Payer Requirements</a> endpoint to find out what payer information needs to be provided.<br><br> Clients who are implementing Strong Customer Authentication (SCA) for payments should refer to our <a href="../guides/integration-guides/sca_sponsored_api_payments">integration guide</a>.
    *
    * POST /payments/create
    */
    public Payment create(CreateRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/payments/create")
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(PaymentsCreateBody.builder().chargeType(
                                       request.getChargeType()).conversionId(request.getConversionId()).feeAmount(
                                       request.getFeeAmount()).feeCurrency(request.getFeeCurrency()).invoiceDate(
                                       request.getInvoiceDate()).invoiceNumber(request.getInvoiceNumber()).onBehalfOf(
                                       request.getOnBehalfOf()).payerAddress(request.getPayerAddress()).payerCity(
                                       request.getPayerCity()).payerCompanyName(request.getPayerCompanyName()).payerCountry(
                                       request.getPayerCountry()).payerDateOfBirth(request.getPayerDateOfBirth()).payerEntityType(
                                       request.getPayerEntityType()).payerFirstName(request.getPayerFirstName()).payerIdentificationType(
                                       request.getPayerIdentificationType()).payerIdentificationValue(
                                       request.getPayerIdentificationValue()).payerLastName(request.getPayerLastName()).payerPostcode(
                                       request.getPayerPostcode()).payerStateOrProvince(request.getPayerStateOrProvince()).paymentDate(
                                       request.getPaymentDate()).paymentType(request.getPaymentType()).purposeCode(
                                       request.getPurposeCode()).ultimateBeneficiaryName(request.getUltimateBeneficiaryName()).amount(
                                       request.getAmount()).beneficiaryId(request.getBeneficiaryId()).currency(
                                       request.getCurrency()).reason(request.getReason()).reference(
                                       request.getReference()).uniqueRequestId(request.getUniqueRequestId()).build(),
                                   Map.ofEntries(Map.entry("amount", "form"), Map.entry("beneficiary_id", "form"),
                                                 Map.entry("charge_type", "form"), Map.entry("conversion_id", "form"), Map.entry("currency", "form"),
                                                 Map.entry("fee_amount", "form"), Map.entry("fee_currency", "form"), Map.entry("invoice_date",
                                                         "form"), Map.entry("invoice_number", "form"), Map.entry("on_behalf_of", "form"),
                                                 Map.entry("payer_address", "form"), Map.entry("payer_city", "form"), Map.entry("payer_company_name",
                                                         "form"), Map.entry("payer_country", "form"), Map.entry("payer_date_of_birth", "form"),
                                                 Map.entry("payer_entity_type", "form"), Map.entry("payer_first_name", "form"),
                                                 Map.entry("payer_identification_type", "form"), Map.entry("payer_identification_value", "form"),
                                                 Map.entry("payer_last_name", "form"), Map.entry("payer_postcode", "form"),
                                                 Map.entry("payer_state_or_province", "form"), Map.entry("payment_date", "form"),
                                                 Map.entry("payment_type", "form"), Map.entry("purpose_code", "form"), Map.entry("reason", "form"),
                                                 Map.entry("reference", "form"), Map.entry("ultimate_beneficiary_name", "form"),
                                                 Map.entry("unique_request_id", "form")), Map.ofEntries(Map.entry("amount", true),
                                                         Map.entry("beneficiary_id", true), Map.entry("charge_type", true), Map.entry("conversion_id", true),
                                                         Map.entry("currency", true), Map.entry("fee_amount", true), Map.entry("fee_currency", true),
                                                         Map.entry("invoice_date", true), Map.entry("invoice_number", true), Map.entry("on_behalf_of", true),
                                                         Map.entry("payer_address", true), Map.entry("payer_city", true), Map.entry("payer_company_name",
                                                                 true), Map.entry("payer_country", true), Map.entry("payer_date_of_birth", true),
                                                         Map.entry("payer_entity_type", true), Map.entry("payer_first_name", true),
                                                         Map.entry("payer_identification_type", true), Map.entry("payer_identification_value", true),
                                                         Map.entry("payer_last_name", true), Map.entry("payer_postcode", true),
                                                         Map.entry("payer_state_or_province", true), Map.entry("payment_date", true),
                                                         Map.entry("payment_type", true), Map.entry("purpose_code", true), Map.entry("reason", true),
                                                         Map.entry("reference", true), Map.entry("ultimate_beneficiary_name", true),
                                                         Map.entry("unique_request_id", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, Payment.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Unassign Payment Fee
    *
    * Unassigns the <a href="https://support.currencycloud.com/hc/en-gb/articles/360017471459-Applying-fees-to-individual-payments-FAQ">payment fee</a> tables for a specific sub-account.
    *
    * POST /payments/unassign_payment_fee
    */
    public PaymentFeeUnassignment unassignPaymentFee(UnassignPaymentFeeRequest request) {
        return unassignPaymentFee(request, null);
    }


    /**
    * Unassign Payment Fee
    *
    * Unassigns the <a href="https://support.currencycloud.com/hc/en-gb/articles/360017471459-Applying-fees-to-individual-payments-FAQ">payment fee</a> tables for a specific sub-account.
    *
    * POST /payments/unassign_payment_fee
    */
    public PaymentFeeUnassignment unassignPaymentFee(UnassignPaymentFeeRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/payments/unassign_payment_fee")
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(PaymentsUnassignPaymentFeeBody.builder().accountId(
                                       request.getAccountId()).build(), Map.ofEntries(Map.entry("account_id", "form")),
                                   Map.ofEntries(Map.entry("account_id", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, PaymentFeeUnassignment.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Validate Payment
    *
    * Validates the details of a new payment without creating a record of the payment. On success, returns an object containing a string validation_result with value "success".<br><br>
    * Clients who are implementing Strong Customer Authentication (SCA) for payments should refer to our <strong><a href="../guides/integration-guides/sca_sponsored_api_payments">SCA for payments integration guide</a></strong>.
    *
    * POST /payments/validate
    */
    public PaymentsValidateResponse validate(ValidateRequest request) {
        return validate(request, null);
    }


    /**
    * Validate Payment
    *
    * Validates the details of a new payment without creating a record of the payment. On success, returns an object containing a string validation_result with value "success".<br><br>
    * Clients who are implementing Strong Customer Authentication (SCA) for payments should refer to our <strong><a href="../guides/integration-guides/sca_sponsored_api_payments">SCA for payments integration guide</a></strong>.
    *
    * POST /payments/validate
    */
    public PaymentsValidateResponse validate(ValidateRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/payments/validate")
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(PaymentsValidateBody.builder().chargeType(
                                       request.getChargeType()).conversionId(request.getConversionId()).feeAmount(
                                       request.getFeeAmount()).feeCurrency(request.getFeeCurrency()).id(request.getId()).onBehalfOf(
                                       request.getOnBehalfOf()).payerAddress(request.getPayerAddress()).payerCity(
                                       request.getPayerCity()).payerCompanyName(request.getPayerCompanyName()).payerCountry(
                                       request.getPayerCountry()).payerDateOfBirth(request.getPayerDateOfBirth()).payerEntityType(
                                       request.getPayerEntityType()).payerFirstName(request.getPayerFirstName()).payerIdentificationType(
                                       request.getPayerIdentificationType()).payerIdentificationValue(
                                       request.getPayerIdentificationValue()).payerLastName(request.getPayerLastName()).payerPostcode(
                                       request.getPayerPostcode()).payerStateOrProvince(request.getPayerStateOrProvince()).paymentDate(
                                       request.getPaymentDate()).paymentType(request.getPaymentType()).purposeCode(
                                       request.getPurposeCode()).ultimateBeneficiaryName(
                                       request.getUltimateBeneficiaryName()).uniqueRequestId(request.getUniqueRequestId()).amount(
                                       request.getAmount()).beneficiaryId(request.getBeneficiaryId()).currency(
                                       request.getCurrency()).reason(request.getReason()).reference(request.getReference()).build(),
                                   Map.ofEntries(Map.entry("amount", "form"), Map.entry("beneficiary_id", "form"),
                                                 Map.entry("charge_type", "form"), Map.entry("conversion_id", "form"), Map.entry("currency", "form"),
                                                 Map.entry("fee_amount", "form"), Map.entry("fee_currency", "form"), Map.entry("id", "form"),
                                                 Map.entry("on_behalf_of", "form"), Map.entry("payer_address", "form"), Map.entry("payer_city",
                                                         "form"), Map.entry("payer_company_name", "form"), Map.entry("payer_country", "form"),
                                                 Map.entry("payer_date_of_birth", "form"), Map.entry("payer_entity_type", "form"),
                                                 Map.entry("payer_first_name", "form"), Map.entry("payer_identification_type", "form"),
                                                 Map.entry("payer_identification_value", "form"), Map.entry("payer_last_name", "form"),
                                                 Map.entry("payer_postcode", "form"), Map.entry("payer_state_or_province", "form"),
                                                 Map.entry("payment_date", "form"), Map.entry("payment_type", "form"), Map.entry("purpose_code",
                                                         "form"), Map.entry("reason", "form"), Map.entry("reference", "form"),
                                                 Map.entry("ultimate_beneficiary_name", "form"), Map.entry("unique_request_id", "form")),
                                   Map.ofEntries(Map.entry("amount", true), Map.entry("beneficiary_id", true), Map.entry("charge_type",
                                                 true), Map.entry("conversion_id", true), Map.entry("currency", true), Map.entry("fee_amount", true),
                                                 Map.entry("fee_currency", true), Map.entry("id", true), Map.entry("on_behalf_of", true),
                                                 Map.entry("payer_address", true), Map.entry("payer_city", true), Map.entry("payer_company_name",
                                                         true), Map.entry("payer_country", true), Map.entry("payer_date_of_birth", true),
                                                 Map.entry("payer_entity_type", true), Map.entry("payer_first_name", true),
                                                 Map.entry("payer_identification_type", true), Map.entry("payer_identification_value", true),
                                                 Map.entry("payer_last_name", true), Map.entry("payer_postcode", true),
                                                 Map.entry("payer_state_or_province", true), Map.entry("payment_date", true),
                                                 Map.entry("payment_type", true), Map.entry("purpose_code", true), Map.entry("reason", true),
                                                 Map.entry("reference", true), Map.entry("ultimate_beneficiary_name", true),
                                                 Map.entry("unique_request_id", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, PaymentsValidateResponse.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Update Payment
    *
    * Updates a payment. On success, returns the updated payment entity.
    *
    * POST /payments/{id}
    */
    public Payment update(UpdateRequest request) {
        return update(request, null);
    }


    /**
    * Update Payment
    *
    * Updates a payment. On success, returns the updated payment entity.
    *
    * POST /payments/{id}
    */
    public Payment update(UpdateRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/payments/{id}")
            .addPathParam("id", request.getId())
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(PaymentsUpdateBody.builder().amount(request.getAmount()).beneficiaryId(
                                       request.getBeneficiaryId()).chargeType(request.getChargeType()).conversionId(
                                       request.getConversionId()).currency(request.getCurrency()).feeAmount(
                                       request.getFeeAmount()).feeCurrency(request.getFeeCurrency()).invoiceDate(
                                       request.getInvoiceDate()).invoiceNumber(request.getInvoiceNumber()).onBehalfOf(
                                       request.getOnBehalfOf()).payerAddress(request.getPayerAddress()).payerCity(
                                       request.getPayerCity()).payerCompanyName(request.getPayerCompanyName()).payerCountry(
                                       request.getPayerCountry()).payerDateOfBirth(request.getPayerDateOfBirth()).payerEntityType(
                                       request.getPayerEntityType()).payerFirstName(request.getPayerFirstName()).payerIdentificationType(
                                       request.getPayerIdentificationType()).payerIdentificationValue(
                                       request.getPayerIdentificationValue()).payerLastName(request.getPayerLastName()).payerPostcode(
                                       request.getPayerPostcode()).payerStateOrProvince(request.getPayerStateOrProvince()).paymentDate(
                                       request.getPaymentDate()).paymentType(request.getPaymentType()).purposeCode(
                                       request.getPurposeCode()).reason(request.getReason()).reference(
                                       request.getReference()).ultimateBeneficiaryName(request.getUltimateBeneficiaryName()).build(),
                                   Map.ofEntries(Map.entry("amount", "form"), Map.entry("beneficiary_id", "form"),
                                                 Map.entry("charge_type", "form"), Map.entry("conversion_id", "form"), Map.entry("currency", "form"),
                                                 Map.entry("fee_amount", "form"), Map.entry("fee_currency", "form"), Map.entry("invoice_date",
                                                         "form"), Map.entry("invoice_number", "form"), Map.entry("on_behalf_of", "form"),
                                                 Map.entry("payer_address", "form"), Map.entry("payer_city", "form"), Map.entry("payer_company_name",
                                                         "form"), Map.entry("payer_country", "form"), Map.entry("payer_date_of_birth", "form"),
                                                 Map.entry("payer_entity_type", "form"), Map.entry("payer_first_name", "form"),
                                                 Map.entry("payer_identification_type", "form"), Map.entry("payer_identification_value", "form"),
                                                 Map.entry("payer_last_name", "form"), Map.entry("payer_postcode", "form"),
                                                 Map.entry("payer_state_or_province", "form"), Map.entry("payment_date", "form"),
                                                 Map.entry("payment_type", "form"), Map.entry("purpose_code", "form"), Map.entry("reason", "form"),
                                                 Map.entry("reference", "form"), Map.entry("ultimate_beneficiary_name", "form")),
                                   Map.ofEntries(Map.entry("amount", true), Map.entry("beneficiary_id", true), Map.entry("charge_type",
                                                 true), Map.entry("conversion_id", true), Map.entry("currency", true), Map.entry("fee_amount", true),
                                                 Map.entry("fee_currency", true), Map.entry("invoice_date", true), Map.entry("invoice_number", true),
                                                 Map.entry("on_behalf_of", true), Map.entry("payer_address", true), Map.entry("payer_city", true),
                                                 Map.entry("payer_company_name", true), Map.entry("payer_country", true),
                                                 Map.entry("payer_date_of_birth", true), Map.entry("payer_entity_type", true),
                                                 Map.entry("payer_first_name", true), Map.entry("payer_identification_type", true),
                                                 Map.entry("payer_identification_value", true), Map.entry("payer_last_name", true),
                                                 Map.entry("payer_postcode", true), Map.entry("payer_state_or_province", true),
                                                 Map.entry("payment_date", true), Map.entry("payment_type", true), Map.entry("purpose_code", true),
                                                 Map.entry("reason", true), Map.entry("reference", true), Map.entry("ultimate_beneficiary_name",
                                                         true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, Payment.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Delete Payment
    *
    * Delete a payment. On success, returns the final payment record state.
    *
    * POST /payments/{id}/delete
    */
    public Payment delete (DeleteRequest request) {
        return delete (request, null);
    }


    /**
    * Delete Payment
    *
    * Delete a payment. On success, returns the final payment record state.
    *
    * POST /payments/{id}/delete
    */
    public Payment delete (DeleteRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/payments/{id}/delete")
            .addPathParam("id", request.getId())
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(PaymentsDeleteBody.builder().onBehalfOf(request.getOnBehalfOf()).build(),
                                   Map.ofEntries(Map.entry("on_behalf_of", "form")), Map.ofEntries(Map.entry("on_behalf_of", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, Payment.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Resend Payment Notification
    *
    * Resends a payment notification for the specified payment ID.
    *
    * POST /payments/{id}/notifications/retry
    */
    public Map<String, Object> retryNotifications(RetryNotificationsRequest request) {
        return retryNotifications(request, null);
    }


    /**
    * Resend Payment Notification
    *
    * Resends a payment notification for the specified payment ID.
    *
    * POST /payments/{id}/notifications/retry
    */
    public Map<String, Object> retryNotifications(RetryNotificationsRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/payments/{id}/notifications/retry")
            .addPathParam("id", request.getId())
            .addQueryParam("notification_type", request.getNotificationType(), "form", true)
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, new TypeReference<Map<String, Object>>() {});
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

















}
