
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Payment
 */
@JsonDeserialize(builder = Payment.Builder.class)
public final class Payment {
    /**
     * Payment amount
     */
    private final Optional<String> amount;

    /**
     * Number of approvals required for the payment.
     */
    private final Optional<String> authorisationStepsRequired;

    /**
     * Beneficiary UUID
     */
    private final Optional<String> beneficiaryId;

    /**
     * Conversion UUID
     */
    private final Optional<String> conversionId;

    /**
     * Date and time of when the payment was created.
     */
    private final Optional<String> createdAt;

    /**
     * Contact UUID of payment creator.
     */
    private final Optional<String> creatorContactId;

    /**
     * Payment currency
     */
    private final Optional<String> currency;

    /**
     * Estimated date of payment.
     */
    private final Optional<String> estimatedArrival;

    /**
     * A reason for why the payment failed.
     */
    private final Optional<String> failureReason;

    /**
     * The amount returned on failure.
     */
    private final Optional<String> failureReturnedAmount;

    /**
     * Fee amount
     */
    private final Optional<String> feeAmount;

    /**
     * Currency code for fee.
     */
    private final Optional<String> feeCurrency;

    /**
     * Payment UUID
     */
    private final Optional<String> id;

    /**
     * The date of the invoice related to the payment. ISO 8601 format YYYY-MM-DD.
     */
    private final Optional<String> invoiceDate;

    /**
     * The invoice number related to the payment. Can be up to 30 characters.
     */
    private final Optional<String> invoiceNumber;

    /**
     * Contact UUID of user who last updated the record.
     */
    private final Optional<String> lastUpdaterContactId;

    /**
     * If the payment is a 3rd party one, the value will be "account". If  it is a 4th party payment, the value will be "payer".
     */
    private final Optional<String> payerDetailsSource;

    /**
     * Payer UUID
     */
    private final Optional<String> payerId;

    /**
     * Payment date.
     */
    private final Optional<String> paymentDate;

    /**
     * Payment group ID.
     */
    private final Optional<String> paymentGroupId;

    /**
     * Type of payment - priority(Swift) or regular(local).
     */
    private final Optional<String> paymentType;

    /**
     * Payment purpose code.
     */
    private final Optional<String> purposeCode;

    /**
     * Reason for payment.
     */
    private final Optional<String> reason;

    /**
     * Payment reference
     */
    private final Optional<String> reference;

    /**
     * Compliance review status - 'passed', 'in_review' or 'rejected'.
     */
    private final Optional<PaymentReviewStatusEnum> reviewStatus;

    /**
     * Short reference code.
     */
    private final Optional<String> shortReference;

    /**
     * Payment status
     */
    private final Optional<String> status;

    /**
     * Date of payment processing.
     */
    private final Optional<String> transferredAt;

    /**
     * The name of the ultimate beneficiary.
     */
    private final Optional<String> ultimateBeneficiaryName;

    /**
     * The user-generated idempotency key provided for the payment.
     */
    private final Optional<String> uniqueRequestId;

    /**
     * Date and time of when the payment was last updated.
     */
    private final Optional<String> updatedAt;


    private Payment(Builder builder) {
        this.amount = builder.amount;
        this.authorisationStepsRequired = builder.authorisationStepsRequired;
        this.beneficiaryId = builder.beneficiaryId;
        this.conversionId = builder.conversionId;
        this.createdAt = builder.createdAt;
        this.creatorContactId = builder.creatorContactId;
        this.currency = builder.currency;
        this.estimatedArrival = builder.estimatedArrival;
        this.failureReason = builder.failureReason;
        this.failureReturnedAmount = builder.failureReturnedAmount;
        this.feeAmount = builder.feeAmount;
        this.feeCurrency = builder.feeCurrency;
        this.id = builder.id;
        this.invoiceDate = builder.invoiceDate;
        this.invoiceNumber = builder.invoiceNumber;
        this.lastUpdaterContactId = builder.lastUpdaterContactId;
        this.payerDetailsSource = builder.payerDetailsSource;
        this.payerId = builder.payerId;
        this.paymentDate = builder.paymentDate;
        this.paymentGroupId = builder.paymentGroupId;
        this.paymentType = builder.paymentType;
        this.purposeCode = builder.purposeCode;
        this.reason = builder.reason;
        this.reference = builder.reference;
        this.reviewStatus = builder.reviewStatus;
        this.shortReference = builder.shortReference;
        this.status = builder.status;
        this.transferredAt = builder.transferredAt;
        this.ultimateBeneficiaryName = builder.ultimateBeneficiaryName;
        this.uniqueRequestId = builder.uniqueRequestId;
        this.updatedAt = builder.updatedAt;
    }

    /**
     * Retrieves value for `amount`
     * Payment amount
     */
    @JsonProperty("amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAmount() {
        return amount;
    }
    /**
     * Retrieves value for `authorisationStepsRequired`
     * Number of approvals required for the payment.
     */
    @JsonProperty("authorisation_steps_required")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAuthorisationStepsRequired() {
        return authorisationStepsRequired;
    }
    /**
     * Retrieves value for `beneficiaryId`
     * Beneficiary UUID
     */
    @JsonProperty("beneficiary_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryId() {
        return beneficiaryId;
    }
    /**
     * Retrieves value for `conversionId`
     * Conversion UUID
     */
    @JsonProperty("conversion_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getConversionId() {
        return conversionId;
    }
    /**
     * Retrieves value for `createdAt`
     * Date and time of when the payment was created.
     */
    @JsonProperty("created_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAt() {
        return createdAt;
    }
    /**
     * Retrieves value for `creatorContactId`
     * Contact UUID of payment creator.
     */
    @JsonProperty("creator_contact_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatorContactId() {
        return creatorContactId;
    }
    /**
     * Retrieves value for `currency`
     * Payment currency
     */
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `estimatedArrival`
     * Estimated date of payment.
     */
    @JsonProperty("estimated_arrival")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getEstimatedArrival() {
        return estimatedArrival;
    }
    /**
     * Retrieves value for `failureReason`
     * A reason for why the payment failed.
     */
    @JsonProperty("failure_reason")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getFailureReason() {
        return failureReason;
    }
    /**
     * Retrieves value for `failureReturnedAmount`
     * The amount returned on failure.
     */
    @JsonProperty("failure_returned_amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getFailureReturnedAmount() {
        return failureReturnedAmount;
    }
    /**
     * Retrieves value for `feeAmount`
     * Fee amount
     */
    @JsonProperty("fee_amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getFeeAmount() {
        return feeAmount;
    }
    /**
     * Retrieves value for `feeCurrency`
     * Currency code for fee.
     */
    @JsonProperty("fee_currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getFeeCurrency() {
        return feeCurrency;
    }
    /**
     * Retrieves value for `id`
     * Payment UUID
     */
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getId() {
        return id;
    }
    /**
     * Retrieves value for `invoiceDate`
     * The date of the invoice related to the payment. ISO 8601 format YYYY-MM-DD.
     */
    @JsonProperty("invoice_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getInvoiceDate() {
        return invoiceDate;
    }
    /**
     * Retrieves value for `invoiceNumber`
     * The invoice number related to the payment. Can be up to 30 characters.
     */
    @JsonProperty("invoice_number")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getInvoiceNumber() {
        return invoiceNumber;
    }
    /**
     * Retrieves value for `lastUpdaterContactId`
     * Contact UUID of user who last updated the record.
     */
    @JsonProperty("last_updater_contact_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getLastUpdaterContactId() {
        return lastUpdaterContactId;
    }
    /**
     * Retrieves value for `payerDetailsSource`
     * If the payment is a 3rd party one, the value will be "account". If  it is a 4th party payment, the value will be "payer".
     */
    @JsonProperty("payer_details_source")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPayerDetailsSource() {
        return payerDetailsSource;
    }
    /**
     * Retrieves value for `payerId`
     * Payer UUID
     */
    @JsonProperty("payer_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPayerId() {
        return payerId;
    }
    /**
     * Retrieves value for `paymentDate`
     * Payment date.
     */
    @JsonProperty("payment_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPaymentDate() {
        return paymentDate;
    }
    /**
     * Retrieves value for `paymentGroupId`
     * Payment group ID.
     */
    @JsonProperty("payment_group_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPaymentGroupId() {
        return paymentGroupId;
    }
    /**
     * Retrieves value for `paymentType`
     * Type of payment - priority(Swift) or regular(local).
     */
    @JsonProperty("payment_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPaymentType() {
        return paymentType;
    }
    /**
     * Retrieves value for `purposeCode`
     * Payment purpose code.
     */
    @JsonProperty("purpose_code")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPurposeCode() {
        return purposeCode;
    }
    /**
     * Retrieves value for `reason`
     * Reason for payment.
     */
    @JsonProperty("reason")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getReason() {
        return reason;
    }
    /**
     * Retrieves value for `reference`
     * Payment reference
     */
    @JsonProperty("reference")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getReference() {
        return reference;
    }
    /**
     * Retrieves value for `reviewStatus`
     * Compliance review status - 'passed', 'in_review' or 'rejected'.
     */
    @JsonProperty("review_status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<PaymentReviewStatusEnum> getReviewStatus() {
        return reviewStatus;
    }
    /**
     * Retrieves value for `shortReference`
     * Short reference code.
     */
    @JsonProperty("short_reference")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getShortReference() {
        return shortReference;
    }
    /**
     * Retrieves value for `status`
     * Payment status
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getStatus() {
        return status;
    }
    /**
     * Retrieves value for `transferredAt`
     * Date of payment processing.
     */
    @JsonProperty("transferred_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getTransferredAt() {
        return transferredAt;
    }
    /**
     * Retrieves value for `ultimateBeneficiaryName`
     * The name of the ultimate beneficiary.
     */
    @JsonProperty("ultimate_beneficiary_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUltimateBeneficiaryName() {
        return ultimateBeneficiaryName;
    }
    /**
     * Retrieves value for `uniqueRequestId`
     * The user-generated idempotency key provided for the payment.
     */
    @JsonProperty("unique_request_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUniqueRequestId() {
        return uniqueRequestId;
    }
    /**
     * Retrieves value for `updatedAt`
     * Date and time of when the payment was last updated.
     */
    @JsonProperty("updated_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof Payment && equalTo((Payment) other);
    }

    private boolean equalTo(Payment other) {
        return
            amount.equals(other.amount) &&

            authorisationStepsRequired.equals(other.authorisationStepsRequired) &&

            beneficiaryId.equals(other.beneficiaryId) &&

            conversionId.equals(other.conversionId) &&

            createdAt.equals(other.createdAt) &&

            creatorContactId.equals(other.creatorContactId) &&

            currency.equals(other.currency) &&

            estimatedArrival.equals(other.estimatedArrival) &&

            failureReason.equals(other.failureReason) &&

            failureReturnedAmount.equals(other.failureReturnedAmount) &&

            feeAmount.equals(other.feeAmount) &&

            feeCurrency.equals(other.feeCurrency) &&

            id.equals(other.id) &&

            invoiceDate.equals(other.invoiceDate) &&

            invoiceNumber.equals(other.invoiceNumber) &&

            lastUpdaterContactId.equals(other.lastUpdaterContactId) &&

            payerDetailsSource.equals(other.payerDetailsSource) &&

            payerId.equals(other.payerId) &&

            paymentDate.equals(other.paymentDate) &&

            paymentGroupId.equals(other.paymentGroupId) &&

            paymentType.equals(other.paymentType) &&

            purposeCode.equals(other.purposeCode) &&

            reason.equals(other.reason) &&

            reference.equals(other.reference) &&

            reviewStatus.equals(other.reviewStatus) &&

            shortReference.equals(other.shortReference) &&

            status.equals(other.status) &&

            transferredAt.equals(other.transferredAt) &&

            ultimateBeneficiaryName.equals(other.ultimateBeneficiaryName) &&

            uniqueRequestId.equals(other.uniqueRequestId) &&

            updatedAt.equals(other.updatedAt)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.amount,
                   this.authorisationStepsRequired,
                   this.beneficiaryId,
                   this.conversionId,
                   this.createdAt,
                   this.creatorContactId,
                   this.currency,
                   this.estimatedArrival,
                   this.failureReason,
                   this.failureReturnedAmount,
                   this.feeAmount,
                   this.feeCurrency,
                   this.id,
                   this.invoiceDate,
                   this.invoiceNumber,
                   this.lastUpdaterContactId,
                   this.payerDetailsSource,
                   this.payerId,
                   this.paymentDate,
                   this.paymentGroupId,
                   this.paymentType,
                   this.purposeCode,
                   this.reason,
                   this.reference,
                   this.reviewStatus,
                   this.shortReference,
                   this.status,
                   this.transferredAt,
                   this.ultimateBeneficiaryName,
                   this.uniqueRequestId,
                   this.updatedAt
               );
    }

    @Override
    public String toString() {
        return "Payment{" +
               "amount=" + amount + ", " +
               "authorisationStepsRequired=" + authorisationStepsRequired + ", " +
               "beneficiaryId=" + beneficiaryId + ", " +
               "conversionId=" + conversionId + ", " +
               "createdAt=" + createdAt + ", " +
               "creatorContactId=" + creatorContactId + ", " +
               "currency=" + currency + ", " +
               "estimatedArrival=" + estimatedArrival + ", " +
               "failureReason=" + failureReason + ", " +
               "failureReturnedAmount=" + failureReturnedAmount + ", " +
               "feeAmount=" + feeAmount + ", " +
               "feeCurrency=" + feeCurrency + ", " +
               "id=" + id + ", " +
               "invoiceDate=" + invoiceDate + ", " +
               "invoiceNumber=" + invoiceNumber + ", " +
               "lastUpdaterContactId=" + lastUpdaterContactId + ", " +
               "payerDetailsSource=" + payerDetailsSource + ", " +
               "payerId=" + payerId + ", " +
               "paymentDate=" + paymentDate + ", " +
               "paymentGroupId=" + paymentGroupId + ", " +
               "paymentType=" + paymentType + ", " +
               "purposeCode=" + purposeCode + ", " +
               "reason=" + reason + ", " +
               "reference=" + reference + ", " +
               "reviewStatus=" + reviewStatus + ", " +
               "shortReference=" + shortReference + ", " +
               "status=" + status + ", " +
               "transferredAt=" + transferredAt + ", " +
               "ultimateBeneficiaryName=" + ultimateBeneficiaryName + ", " +
               "uniqueRequestId=" + uniqueRequestId + ", " +
               "updatedAt=" + updatedAt +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Payment amount
         */
        private Optional<String> amount = Optional.empty();

        /**
         * Number of approvals required for the payment.
         */
        private Optional<String> authorisationStepsRequired = Optional.empty();

        /**
         * Beneficiary UUID
         */
        private Optional<String> beneficiaryId = Optional.empty();

        /**
         * Conversion UUID
         */
        private Optional<String> conversionId = Optional.empty();

        /**
         * Date and time of when the payment was created.
         */
        private Optional<String> createdAt = Optional.empty();

        /**
         * Contact UUID of payment creator.
         */
        private Optional<String> creatorContactId = Optional.empty();

        /**
         * Payment currency
         */
        private Optional<String> currency = Optional.empty();

        /**
         * Estimated date of payment.
         */
        private Optional<String> estimatedArrival = Optional.empty();

        /**
         * A reason for why the payment failed.
         */
        private Optional<String> failureReason = Optional.empty();

        /**
         * The amount returned on failure.
         */
        private Optional<String> failureReturnedAmount = Optional.empty();

        /**
         * Fee amount
         */
        private Optional<String> feeAmount = Optional.empty();

        /**
         * Currency code for fee.
         */
        private Optional<String> feeCurrency = Optional.empty();

        /**
         * Payment UUID
         */
        private Optional<String> id = Optional.empty();

        /**
         * The date of the invoice related to the payment. ISO 8601 format YYYY-MM-DD.
         */
        private Optional<String> invoiceDate = Optional.empty();

        /**
         * The invoice number related to the payment. Can be up to 30 characters.
         */
        private Optional<String> invoiceNumber = Optional.empty();

        /**
         * Contact UUID of user who last updated the record.
         */
        private Optional<String> lastUpdaterContactId = Optional.empty();

        /**
         * If the payment is a 3rd party one, the value will be "account". If  it is a 4th party payment, the value will be "payer".
         */
        private Optional<String> payerDetailsSource = Optional.empty();

        /**
         * Payer UUID
         */
        private Optional<String> payerId = Optional.empty();

        /**
         * Payment date.
         */
        private Optional<String> paymentDate = Optional.empty();

        /**
         * Payment group ID.
         */
        private Optional<String> paymentGroupId = Optional.empty();

        /**
         * Type of payment - priority(Swift) or regular(local).
         */
        private Optional<String> paymentType = Optional.empty();

        /**
         * Payment purpose code.
         */
        private Optional<String> purposeCode = Optional.empty();

        /**
         * Reason for payment.
         */
        private Optional<String> reason = Optional.empty();

        /**
         * Payment reference
         */
        private Optional<String> reference = Optional.empty();

        /**
         * Compliance review status - 'passed', 'in_review' or 'rejected'.
         */
        private Optional<PaymentReviewStatusEnum> reviewStatus = Optional.empty();

        /**
         * Short reference code.
         */
        private Optional<String> shortReference = Optional.empty();

        /**
         * Payment status
         */
        private Optional<String> status = Optional.empty();

        /**
         * Date of payment processing.
         */
        private Optional<String> transferredAt = Optional.empty();

        /**
         * The name of the ultimate beneficiary.
         */
        private Optional<String> ultimateBeneficiaryName = Optional.empty();

        /**
         * The user-generated idempotency key provided for the payment.
         */
        private Optional<String> uniqueRequestId = Optional.empty();

        /**
         * Date and time of when the payment was last updated.
         */
        private Optional<String> updatedAt = Optional.empty();


        private Builder() {}

        public Builder from(Payment other) {
            amount(other.getAmount());
            authorisationStepsRequired(other.getAuthorisationStepsRequired());
            beneficiaryId(other.getBeneficiaryId());
            conversionId(other.getConversionId());
            createdAt(other.getCreatedAt());
            creatorContactId(other.getCreatorContactId());
            currency(other.getCurrency());
            estimatedArrival(other.getEstimatedArrival());
            failureReason(other.getFailureReason());
            failureReturnedAmount(other.getFailureReturnedAmount());
            feeAmount(other.getFeeAmount());
            feeCurrency(other.getFeeCurrency());
            id(other.getId());
            invoiceDate(other.getInvoiceDate());
            invoiceNumber(other.getInvoiceNumber());
            lastUpdaterContactId(other.getLastUpdaterContactId());
            payerDetailsSource(other.getPayerDetailsSource());
            payerId(other.getPayerId());
            paymentDate(other.getPaymentDate());
            paymentGroupId(other.getPaymentGroupId());
            paymentType(other.getPaymentType());
            purposeCode(other.getPurposeCode());
            reason(other.getReason());
            reference(other.getReference());
            reviewStatus(other.getReviewStatus());
            shortReference(other.getShortReference());
            status(other.getStatus());
            transferredAt(other.getTransferredAt());
            ultimateBeneficiaryName(other.getUltimateBeneficiaryName());
            uniqueRequestId(other.getUniqueRequestId());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        /**
         * Sets value for `amount`
         * Payment amount
         */
        @JsonSetter("amount")
        public Builder amount(Optional<String> amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Sets value for `amount`
         * Payment amount
         */
        public Builder amount(String amount) {
            return this.amount(Optional.ofNullable(amount));
        }
        /**
         * Sets value for `authorisationStepsRequired`
         * Number of approvals required for the payment.
         */
        @JsonSetter("authorisation_steps_required")
        public Builder authorisationStepsRequired(Optional<String> authorisationStepsRequired) {
            this.authorisationStepsRequired = authorisationStepsRequired;
            return this;
        }

        /**
         * Sets value for `authorisationStepsRequired`
         * Number of approvals required for the payment.
         */
        public Builder authorisationStepsRequired(String authorisationStepsRequired) {
            return this.authorisationStepsRequired(Optional.ofNullable(authorisationStepsRequired));
        }
        /**
         * Sets value for `beneficiaryId`
         * Beneficiary UUID
         */
        @JsonSetter("beneficiary_id")
        public Builder beneficiaryId(Optional<String> beneficiaryId) {
            this.beneficiaryId = beneficiaryId;
            return this;
        }

        /**
         * Sets value for `beneficiaryId`
         * Beneficiary UUID
         */
        public Builder beneficiaryId(String beneficiaryId) {
            return this.beneficiaryId(Optional.ofNullable(beneficiaryId));
        }
        /**
         * Sets value for `conversionId`
         * Conversion UUID
         */
        @JsonSetter("conversion_id")
        public Builder conversionId(Optional<String> conversionId) {
            this.conversionId = conversionId;
            return this;
        }

        /**
         * Sets value for `conversionId`
         * Conversion UUID
         */
        public Builder conversionId(String conversionId) {
            return this.conversionId(Optional.ofNullable(conversionId));
        }
        /**
         * Sets value for `createdAt`
         * Date and time of when the payment was created.
         */
        @JsonSetter("created_at")
        public Builder createdAt(Optional<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Sets value for `createdAt`
         * Date and time of when the payment was created.
         */
        public Builder createdAt(String createdAt) {
            return this.createdAt(Optional.ofNullable(createdAt));
        }
        /**
         * Sets value for `creatorContactId`
         * Contact UUID of payment creator.
         */
        @JsonSetter("creator_contact_id")
        public Builder creatorContactId(Optional<String> creatorContactId) {
            this.creatorContactId = creatorContactId;
            return this;
        }

        /**
         * Sets value for `creatorContactId`
         * Contact UUID of payment creator.
         */
        public Builder creatorContactId(String creatorContactId) {
            return this.creatorContactId(Optional.ofNullable(creatorContactId));
        }
        /**
         * Sets value for `currency`
         * Payment currency
         */
        @JsonSetter("currency")
        public Builder currency(Optional<String> currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Sets value for `currency`
         * Payment currency
         */
        public Builder currency(String currency) {
            return this.currency(Optional.ofNullable(currency));
        }
        /**
         * Sets value for `estimatedArrival`
         * Estimated date of payment.
         */
        @JsonSetter("estimated_arrival")
        public Builder estimatedArrival(Optional<String> estimatedArrival) {
            this.estimatedArrival = estimatedArrival;
            return this;
        }

        /**
         * Sets value for `estimatedArrival`
         * Estimated date of payment.
         */
        public Builder estimatedArrival(String estimatedArrival) {
            return this.estimatedArrival(Optional.ofNullable(estimatedArrival));
        }
        /**
         * Sets value for `failureReason`
         * A reason for why the payment failed.
         */
        @JsonSetter("failure_reason")
        public Builder failureReason(Optional<String> failureReason) {
            this.failureReason = failureReason;
            return this;
        }

        /**
         * Sets value for `failureReason`
         * A reason for why the payment failed.
         */
        public Builder failureReason(String failureReason) {
            return this.failureReason(Optional.ofNullable(failureReason));
        }
        /**
         * Sets value for `failureReturnedAmount`
         * The amount returned on failure.
         */
        @JsonSetter("failure_returned_amount")
        public Builder failureReturnedAmount(Optional<String> failureReturnedAmount) {
            this.failureReturnedAmount = failureReturnedAmount;
            return this;
        }

        /**
         * Sets value for `failureReturnedAmount`
         * The amount returned on failure.
         */
        public Builder failureReturnedAmount(String failureReturnedAmount) {
            return this.failureReturnedAmount(Optional.ofNullable(failureReturnedAmount));
        }
        /**
         * Sets value for `feeAmount`
         * Fee amount
         */
        @JsonSetter("fee_amount")
        public Builder feeAmount(Optional<String> feeAmount) {
            this.feeAmount = feeAmount;
            return this;
        }

        /**
         * Sets value for `feeAmount`
         * Fee amount
         */
        public Builder feeAmount(String feeAmount) {
            return this.feeAmount(Optional.ofNullable(feeAmount));
        }
        /**
         * Sets value for `feeCurrency`
         * Currency code for fee.
         */
        @JsonSetter("fee_currency")
        public Builder feeCurrency(Optional<String> feeCurrency) {
            this.feeCurrency = feeCurrency;
            return this;
        }

        /**
         * Sets value for `feeCurrency`
         * Currency code for fee.
         */
        public Builder feeCurrency(String feeCurrency) {
            return this.feeCurrency(Optional.ofNullable(feeCurrency));
        }
        /**
         * Sets value for `id`
         * Payment UUID
         */
        @JsonSetter("id")
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        /**
         * Sets value for `id`
         * Payment UUID
         */
        public Builder id(String id) {
            return this.id(Optional.ofNullable(id));
        }
        /**
         * Sets value for `invoiceDate`
         * The date of the invoice related to the payment. ISO 8601 format YYYY-MM-DD.
         */
        @JsonSetter("invoice_date")
        public Builder invoiceDate(Optional<String> invoiceDate) {
            this.invoiceDate = invoiceDate;
            return this;
        }

        /**
         * Sets value for `invoiceDate`
         * The date of the invoice related to the payment. ISO 8601 format YYYY-MM-DD.
         */
        public Builder invoiceDate(String invoiceDate) {
            return this.invoiceDate(Optional.ofNullable(invoiceDate));
        }
        /**
         * Sets value for `invoiceNumber`
         * The invoice number related to the payment. Can be up to 30 characters.
         */
        @JsonSetter("invoice_number")
        public Builder invoiceNumber(Optional<String> invoiceNumber) {
            this.invoiceNumber = invoiceNumber;
            return this;
        }

        /**
         * Sets value for `invoiceNumber`
         * The invoice number related to the payment. Can be up to 30 characters.
         */
        public Builder invoiceNumber(String invoiceNumber) {
            return this.invoiceNumber(Optional.ofNullable(invoiceNumber));
        }
        /**
         * Sets value for `lastUpdaterContactId`
         * Contact UUID of user who last updated the record.
         */
        @JsonSetter("last_updater_contact_id")
        public Builder lastUpdaterContactId(Optional<String> lastUpdaterContactId) {
            this.lastUpdaterContactId = lastUpdaterContactId;
            return this;
        }

        /**
         * Sets value for `lastUpdaterContactId`
         * Contact UUID of user who last updated the record.
         */
        public Builder lastUpdaterContactId(String lastUpdaterContactId) {
            return this.lastUpdaterContactId(Optional.ofNullable(lastUpdaterContactId));
        }
        /**
         * Sets value for `payerDetailsSource`
         * If the payment is a 3rd party one, the value will be "account". If  it is a 4th party payment, the value will be "payer".
         */
        @JsonSetter("payer_details_source")
        public Builder payerDetailsSource(Optional<String> payerDetailsSource) {
            this.payerDetailsSource = payerDetailsSource;
            return this;
        }

        /**
         * Sets value for `payerDetailsSource`
         * If the payment is a 3rd party one, the value will be "account". If  it is a 4th party payment, the value will be "payer".
         */
        public Builder payerDetailsSource(String payerDetailsSource) {
            return this.payerDetailsSource(Optional.ofNullable(payerDetailsSource));
        }
        /**
         * Sets value for `payerId`
         * Payer UUID
         */
        @JsonSetter("payer_id")
        public Builder payerId(Optional<String> payerId) {
            this.payerId = payerId;
            return this;
        }

        /**
         * Sets value for `payerId`
         * Payer UUID
         */
        public Builder payerId(String payerId) {
            return this.payerId(Optional.ofNullable(payerId));
        }
        /**
         * Sets value for `paymentDate`
         * Payment date.
         */
        @JsonSetter("payment_date")
        public Builder paymentDate(Optional<String> paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }

        /**
         * Sets value for `paymentDate`
         * Payment date.
         */
        public Builder paymentDate(String paymentDate) {
            return this.paymentDate(Optional.ofNullable(paymentDate));
        }
        /**
         * Sets value for `paymentGroupId`
         * Payment group ID.
         */
        @JsonSetter("payment_group_id")
        public Builder paymentGroupId(Optional<String> paymentGroupId) {
            this.paymentGroupId = paymentGroupId;
            return this;
        }

        /**
         * Sets value for `paymentGroupId`
         * Payment group ID.
         */
        public Builder paymentGroupId(String paymentGroupId) {
            return this.paymentGroupId(Optional.ofNullable(paymentGroupId));
        }
        /**
         * Sets value for `paymentType`
         * Type of payment - priority(Swift) or regular(local).
         */
        @JsonSetter("payment_type")
        public Builder paymentType(Optional<String> paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Sets value for `paymentType`
         * Type of payment - priority(Swift) or regular(local).
         */
        public Builder paymentType(String paymentType) {
            return this.paymentType(Optional.ofNullable(paymentType));
        }
        /**
         * Sets value for `purposeCode`
         * Payment purpose code.
         */
        @JsonSetter("purpose_code")
        public Builder purposeCode(Optional<String> purposeCode) {
            this.purposeCode = purposeCode;
            return this;
        }

        /**
         * Sets value for `purposeCode`
         * Payment purpose code.
         */
        public Builder purposeCode(String purposeCode) {
            return this.purposeCode(Optional.ofNullable(purposeCode));
        }
        /**
         * Sets value for `reason`
         * Reason for payment.
         */
        @JsonSetter("reason")
        public Builder reason(Optional<String> reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Sets value for `reason`
         * Reason for payment.
         */
        public Builder reason(String reason) {
            return this.reason(Optional.ofNullable(reason));
        }
        /**
         * Sets value for `reference`
         * Payment reference
         */
        @JsonSetter("reference")
        public Builder reference(Optional<String> reference) {
            this.reference = reference;
            return this;
        }

        /**
         * Sets value for `reference`
         * Payment reference
         */
        public Builder reference(String reference) {
            return this.reference(Optional.ofNullable(reference));
        }
        /**
         * Sets value for `reviewStatus`
         * Compliance review status - 'passed', 'in_review' or 'rejected'.
         */
        @JsonSetter("review_status")
        public Builder reviewStatus(Optional<PaymentReviewStatusEnum> reviewStatus) {
            this.reviewStatus = reviewStatus;
            return this;
        }

        /**
         * Sets value for `reviewStatus`
         * Compliance review status - 'passed', 'in_review' or 'rejected'.
         */
        public Builder reviewStatus(PaymentReviewStatusEnum reviewStatus) {
            return this.reviewStatus(Optional.ofNullable(reviewStatus));
        }
        /**
         * Sets value for `shortReference`
         * Short reference code.
         */
        @JsonSetter("short_reference")
        public Builder shortReference(Optional<String> shortReference) {
            this.shortReference = shortReference;
            return this;
        }

        /**
         * Sets value for `shortReference`
         * Short reference code.
         */
        public Builder shortReference(String shortReference) {
            return this.shortReference(Optional.ofNullable(shortReference));
        }
        /**
         * Sets value for `status`
         * Payment status
         */
        @JsonSetter("status")
        public Builder status(Optional<String> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets value for `status`
         * Payment status
         */
        public Builder status(String status) {
            return this.status(Optional.ofNullable(status));
        }
        /**
         * Sets value for `transferredAt`
         * Date of payment processing.
         */
        @JsonSetter("transferred_at")
        public Builder transferredAt(Optional<String> transferredAt) {
            this.transferredAt = transferredAt;
            return this;
        }

        /**
         * Sets value for `transferredAt`
         * Date of payment processing.
         */
        public Builder transferredAt(String transferredAt) {
            return this.transferredAt(Optional.ofNullable(transferredAt));
        }
        /**
         * Sets value for `ultimateBeneficiaryName`
         * The name of the ultimate beneficiary.
         */
        @JsonSetter("ultimate_beneficiary_name")
        public Builder ultimateBeneficiaryName(Optional<String> ultimateBeneficiaryName) {
            this.ultimateBeneficiaryName = ultimateBeneficiaryName;
            return this;
        }

        /**
         * Sets value for `ultimateBeneficiaryName`
         * The name of the ultimate beneficiary.
         */
        public Builder ultimateBeneficiaryName(String ultimateBeneficiaryName) {
            return this.ultimateBeneficiaryName(Optional.ofNullable(ultimateBeneficiaryName));
        }
        /**
         * Sets value for `uniqueRequestId`
         * The user-generated idempotency key provided for the payment.
         */
        @JsonSetter("unique_request_id")
        public Builder uniqueRequestId(Optional<String> uniqueRequestId) {
            this.uniqueRequestId = uniqueRequestId;
            return this;
        }

        /**
         * Sets value for `uniqueRequestId`
         * The user-generated idempotency key provided for the payment.
         */
        public Builder uniqueRequestId(String uniqueRequestId) {
            return this.uniqueRequestId(Optional.ofNullable(uniqueRequestId));
        }
        /**
         * Sets value for `updatedAt`
         * Date and time of when the payment was last updated.
         */
        @JsonSetter("updated_at")
        public Builder updatedAt(Optional<String> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Sets value for `updatedAt`
         * Date and time of when the payment was last updated.
         */
        public Builder updatedAt(String updatedAt) {
            return this.updatedAt(Optional.ofNullable(updatedAt));
        }



        public Payment build() {
            return new Payment(this);
        }
    }

}



