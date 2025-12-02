
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * ReportsGeneratePaymentReportBody
 */
@JsonDeserialize(builder = ReportsGeneratePaymentReportBody.Builder.class)
public final class ReportsGeneratePaymentReportBody {
    /**
     * Minimum payment amount to 2 decimal places.
     */
    private final Optional<Double> amountFrom;

    /**
     * Maximum payment amount to 2 decimal places.
     */
    private final Optional<Double> amountTo;

    /**
     * ID of the beneficiary.
     */
    private final Optional<String> beneficiaryId;

    /**
     * Reference to Bulk Upload.
     */
    private final Optional<String> bulkUploadReference;

    /**
     * Conversion unique ID.
     */
    private final Optional<String> conversionId;

    /**
     * ISO 8601 format date/time for earliest payment creation to include.
     */
    private final Optional<String> createdAtFrom;

    /**
     * ISO 8601 format date/time for latest payment creation to include.
     */
    private final Optional<String> createdAtTo;

    /**
     * Three-letter ISO 4217 currency code.
     */
    private final Optional<String> currency;

    /**
     * Description that will be applied to report.
     */
    private final Optional<String> description;

    /**
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    private final Optional<String> onBehalfOf;

    /**
     * ISO 8601 format date for earliest payment date to include.
     */
    private final Optional<String> paymentDateFrom;

    /**
     * ISO 8601 format date for latest payment date to include.
     */
    private final Optional<String> paymentDateTo;

    /**
     * ID of the payment group.
     */
    private final Optional<String> paymentGroupId;

    /**
     * Specify which account level will be used - 'own' is the default value.
     */
    private final Optional<String> scope;

    /**
     * Status of the payment.
     */
    private final Optional<String> status;

    /**
     * ISO 8601 format date/time for earliest payment transfer date.
     */
    private final Optional<String> transferredAtFrom;

    /**
     * ISO 8601 format date/time for latest payment transfer date.
     */
    private final Optional<String> transferredAtTo;

    /**
     * Unique request ID of payment.
     */
    private final Optional<String> uniqueRequestId;

    /**
     * ISO 8601 format date/time for earliest payment updated to include.
     */
    private final Optional<String> updatedAtFrom;

    /**
     * ISO 8601 format date/time for latest payment updated to include.
     */
    private final Optional<String> updatedAtTo;

    /**
     * Include deleted payments?
     */
    private final Optional<Boolean> withDeleted;


    private ReportsGeneratePaymentReportBody(Builder builder) {
        this.amountFrom = builder.amountFrom;
        this.amountTo = builder.amountTo;
        this.beneficiaryId = builder.beneficiaryId;
        this.bulkUploadReference = builder.bulkUploadReference;
        this.conversionId = builder.conversionId;
        this.createdAtFrom = builder.createdAtFrom;
        this.createdAtTo = builder.createdAtTo;
        this.currency = builder.currency;
        this.description = builder.description;
        this.onBehalfOf = builder.onBehalfOf;
        this.paymentDateFrom = builder.paymentDateFrom;
        this.paymentDateTo = builder.paymentDateTo;
        this.paymentGroupId = builder.paymentGroupId;
        this.scope = builder.scope;
        this.status = builder.status;
        this.transferredAtFrom = builder.transferredAtFrom;
        this.transferredAtTo = builder.transferredAtTo;
        this.uniqueRequestId = builder.uniqueRequestId;
        this.updatedAtFrom = builder.updatedAtFrom;
        this.updatedAtTo = builder.updatedAtTo;
        this.withDeleted = builder.withDeleted;
    }

    /**
     * Retrieves value for `amountFrom`
     * Minimum payment amount to 2 decimal places.
     */
    @JsonProperty("amount_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Double> getAmountFrom() {
        return amountFrom;
    }
    /**
     * Retrieves value for `amountTo`
     * Maximum payment amount to 2 decimal places.
     */
    @JsonProperty("amount_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Double> getAmountTo() {
        return amountTo;
    }
    /**
     * Retrieves value for `beneficiaryId`
     * ID of the beneficiary.
     */
    @JsonProperty("beneficiary_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryId() {
        return beneficiaryId;
    }
    /**
     * Retrieves value for `bulkUploadReference`
     * Reference to Bulk Upload.
     */
    @JsonProperty("bulk_upload_reference")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBulkUploadReference() {
        return bulkUploadReference;
    }
    /**
     * Retrieves value for `conversionId`
     * Conversion unique ID.
     */
    @JsonProperty("conversion_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getConversionId() {
        return conversionId;
    }
    /**
     * Retrieves value for `createdAtFrom`
     * ISO 8601 format date/time for earliest payment creation to include.
     */
    @JsonProperty("created_at_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAtFrom() {
        return createdAtFrom;
    }
    /**
     * Retrieves value for `createdAtTo`
     * ISO 8601 format date/time for latest payment creation to include.
     */
    @JsonProperty("created_at_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAtTo() {
        return createdAtTo;
    }
    /**
     * Retrieves value for `currency`
     * Three-letter ISO 4217 currency code.
     */
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `description`
     * Description that will be applied to report.
     */
    @JsonProperty("description")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getDescription() {
        return description;
    }
    /**
     * Retrieves value for `onBehalfOf`
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    @JsonProperty("on_behalf_of")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getOnBehalfOf() {
        return onBehalfOf;
    }
    /**
     * Retrieves value for `paymentDateFrom`
     * ISO 8601 format date for earliest payment date to include.
     */
    @JsonProperty("payment_date_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPaymentDateFrom() {
        return paymentDateFrom;
    }
    /**
     * Retrieves value for `paymentDateTo`
     * ISO 8601 format date for latest payment date to include.
     */
    @JsonProperty("payment_date_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPaymentDateTo() {
        return paymentDateTo;
    }
    /**
     * Retrieves value for `paymentGroupId`
     * ID of the payment group.
     */
    @JsonProperty("payment_group_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPaymentGroupId() {
        return paymentGroupId;
    }
    /**
     * Retrieves value for `scope`
     * Specify which account level will be used - 'own' is the default value.
     */
    @JsonProperty("scope")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getScope() {
        return scope;
    }
    /**
     * Retrieves value for `status`
     * Status of the payment.
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getStatus() {
        return status;
    }
    /**
     * Retrieves value for `transferredAtFrom`
     * ISO 8601 format date/time for earliest payment transfer date.
     */
    @JsonProperty("transferred_at_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getTransferredAtFrom() {
        return transferredAtFrom;
    }
    /**
     * Retrieves value for `transferredAtTo`
     * ISO 8601 format date/time for latest payment transfer date.
     */
    @JsonProperty("transferred_at_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getTransferredAtTo() {
        return transferredAtTo;
    }
    /**
     * Retrieves value for `uniqueRequestId`
     * Unique request ID of payment.
     */
    @JsonProperty("unique_request_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUniqueRequestId() {
        return uniqueRequestId;
    }
    /**
     * Retrieves value for `updatedAtFrom`
     * ISO 8601 format date/time for earliest payment updated to include.
     */
    @JsonProperty("updated_at_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAtFrom() {
        return updatedAtFrom;
    }
    /**
     * Retrieves value for `updatedAtTo`
     * ISO 8601 format date/time for latest payment updated to include.
     */
    @JsonProperty("updated_at_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAtTo() {
        return updatedAtTo;
    }
    /**
     * Retrieves value for `withDeleted`
     * Include deleted payments?
     */
    @JsonProperty("with_deleted")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getWithDeleted() {
        return withDeleted;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof ReportsGeneratePaymentReportBody &&
               equalTo((ReportsGeneratePaymentReportBody) other);
    }

    private boolean equalTo(ReportsGeneratePaymentReportBody other) {
        return
            amountFrom.equals(other.amountFrom) &&

            amountTo.equals(other.amountTo) &&

            beneficiaryId.equals(other.beneficiaryId) &&

            bulkUploadReference.equals(other.bulkUploadReference) &&

            conversionId.equals(other.conversionId) &&

            createdAtFrom.equals(other.createdAtFrom) &&

            createdAtTo.equals(other.createdAtTo) &&

            currency.equals(other.currency) &&

            description.equals(other.description) &&

            onBehalfOf.equals(other.onBehalfOf) &&

            paymentDateFrom.equals(other.paymentDateFrom) &&

            paymentDateTo.equals(other.paymentDateTo) &&

            paymentGroupId.equals(other.paymentGroupId) &&

            scope.equals(other.scope) &&

            status.equals(other.status) &&

            transferredAtFrom.equals(other.transferredAtFrom) &&

            transferredAtTo.equals(other.transferredAtTo) &&

            uniqueRequestId.equals(other.uniqueRequestId) &&

            updatedAtFrom.equals(other.updatedAtFrom) &&

            updatedAtTo.equals(other.updatedAtTo) &&

            withDeleted.equals(other.withDeleted)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.amountFrom,
                   this.amountTo,
                   this.beneficiaryId,
                   this.bulkUploadReference,
                   this.conversionId,
                   this.createdAtFrom,
                   this.createdAtTo,
                   this.currency,
                   this.description,
                   this.onBehalfOf,
                   this.paymentDateFrom,
                   this.paymentDateTo,
                   this.paymentGroupId,
                   this.scope,
                   this.status,
                   this.transferredAtFrom,
                   this.transferredAtTo,
                   this.uniqueRequestId,
                   this.updatedAtFrom,
                   this.updatedAtTo,
                   this.withDeleted
               );
    }

    @Override
    public String toString() {
        return "ReportsGeneratePaymentReportBody{" +
               "amountFrom=" + amountFrom + ", " +
               "amountTo=" + amountTo + ", " +
               "beneficiaryId=" + beneficiaryId + ", " +
               "bulkUploadReference=" + bulkUploadReference + ", " +
               "conversionId=" + conversionId + ", " +
               "createdAtFrom=" + createdAtFrom + ", " +
               "createdAtTo=" + createdAtTo + ", " +
               "currency=" + currency + ", " +
               "description=" + description + ", " +
               "onBehalfOf=" + onBehalfOf + ", " +
               "paymentDateFrom=" + paymentDateFrom + ", " +
               "paymentDateTo=" + paymentDateTo + ", " +
               "paymentGroupId=" + paymentGroupId + ", " +
               "scope=" + scope + ", " +
               "status=" + status + ", " +
               "transferredAtFrom=" + transferredAtFrom + ", " +
               "transferredAtTo=" + transferredAtTo + ", " +
               "uniqueRequestId=" + uniqueRequestId + ", " +
               "updatedAtFrom=" + updatedAtFrom + ", " +
               "updatedAtTo=" + updatedAtTo + ", " +
               "withDeleted=" + withDeleted +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Minimum payment amount to 2 decimal places.
         */
        private Optional<Double> amountFrom = Optional.empty();

        /**
         * Maximum payment amount to 2 decimal places.
         */
        private Optional<Double> amountTo = Optional.empty();

        /**
         * ID of the beneficiary.
         */
        private Optional<String> beneficiaryId = Optional.empty();

        /**
         * Reference to Bulk Upload.
         */
        private Optional<String> bulkUploadReference = Optional.empty();

        /**
         * Conversion unique ID.
         */
        private Optional<String> conversionId = Optional.empty();

        /**
         * ISO 8601 format date/time for earliest payment creation to include.
         */
        private Optional<String> createdAtFrom = Optional.empty();

        /**
         * ISO 8601 format date/time for latest payment creation to include.
         */
        private Optional<String> createdAtTo = Optional.empty();

        /**
         * Three-letter ISO 4217 currency code.
         */
        private Optional<String> currency = Optional.empty();

        /**
         * Description that will be applied to report.
         */
        private Optional<String> description = Optional.empty();

        /**
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        private Optional<String> onBehalfOf = Optional.empty();

        /**
         * ISO 8601 format date for earliest payment date to include.
         */
        private Optional<String> paymentDateFrom = Optional.empty();

        /**
         * ISO 8601 format date for latest payment date to include.
         */
        private Optional<String> paymentDateTo = Optional.empty();

        /**
         * ID of the payment group.
         */
        private Optional<String> paymentGroupId = Optional.empty();

        /**
         * Specify which account level will be used - 'own' is the default value.
         */
        private Optional<String> scope = Optional.empty();

        /**
         * Status of the payment.
         */
        private Optional<String> status = Optional.empty();

        /**
         * ISO 8601 format date/time for earliest payment transfer date.
         */
        private Optional<String> transferredAtFrom = Optional.empty();

        /**
         * ISO 8601 format date/time for latest payment transfer date.
         */
        private Optional<String> transferredAtTo = Optional.empty();

        /**
         * Unique request ID of payment.
         */
        private Optional<String> uniqueRequestId = Optional.empty();

        /**
         * ISO 8601 format date/time for earliest payment updated to include.
         */
        private Optional<String> updatedAtFrom = Optional.empty();

        /**
         * ISO 8601 format date/time for latest payment updated to include.
         */
        private Optional<String> updatedAtTo = Optional.empty();

        /**
         * Include deleted payments?
         */
        private Optional<Boolean> withDeleted = Optional.empty();


        private Builder() {}

        public Builder from(ReportsGeneratePaymentReportBody other) {
            amountFrom(other.getAmountFrom());
            amountTo(other.getAmountTo());
            beneficiaryId(other.getBeneficiaryId());
            bulkUploadReference(other.getBulkUploadReference());
            conversionId(other.getConversionId());
            createdAtFrom(other.getCreatedAtFrom());
            createdAtTo(other.getCreatedAtTo());
            currency(other.getCurrency());
            description(other.getDescription());
            onBehalfOf(other.getOnBehalfOf());
            paymentDateFrom(other.getPaymentDateFrom());
            paymentDateTo(other.getPaymentDateTo());
            paymentGroupId(other.getPaymentGroupId());
            scope(other.getScope());
            status(other.getStatus());
            transferredAtFrom(other.getTransferredAtFrom());
            transferredAtTo(other.getTransferredAtTo());
            uniqueRequestId(other.getUniqueRequestId());
            updatedAtFrom(other.getUpdatedAtFrom());
            updatedAtTo(other.getUpdatedAtTo());
            withDeleted(other.getWithDeleted());
            return this;
        }

        /**
         * Sets value for `amountFrom`
         * Minimum payment amount to 2 decimal places.
         */
        @JsonSetter("amount_from")
        public Builder amountFrom(Optional<Double> amountFrom) {
            this.amountFrom = amountFrom;
            return this;
        }

        /**
         * Sets value for `amountFrom`
         * Minimum payment amount to 2 decimal places.
         */
        public Builder amountFrom(Double amountFrom) {
            return this.amountFrom(Optional.ofNullable(amountFrom));
        }
        /**
         * Sets value for `amountTo`
         * Maximum payment amount to 2 decimal places.
         */
        @JsonSetter("amount_to")
        public Builder amountTo(Optional<Double> amountTo) {
            this.amountTo = amountTo;
            return this;
        }

        /**
         * Sets value for `amountTo`
         * Maximum payment amount to 2 decimal places.
         */
        public Builder amountTo(Double amountTo) {
            return this.amountTo(Optional.ofNullable(amountTo));
        }
        /**
         * Sets value for `beneficiaryId`
         * ID of the beneficiary.
         */
        @JsonSetter("beneficiary_id")
        public Builder beneficiaryId(Optional<String> beneficiaryId) {
            this.beneficiaryId = beneficiaryId;
            return this;
        }

        /**
         * Sets value for `beneficiaryId`
         * ID of the beneficiary.
         */
        public Builder beneficiaryId(String beneficiaryId) {
            return this.beneficiaryId(Optional.ofNullable(beneficiaryId));
        }
        /**
         * Sets value for `bulkUploadReference`
         * Reference to Bulk Upload.
         */
        @JsonSetter("bulk_upload_reference")
        public Builder bulkUploadReference(Optional<String> bulkUploadReference) {
            this.bulkUploadReference = bulkUploadReference;
            return this;
        }

        /**
         * Sets value for `bulkUploadReference`
         * Reference to Bulk Upload.
         */
        public Builder bulkUploadReference(String bulkUploadReference) {
            return this.bulkUploadReference(Optional.ofNullable(bulkUploadReference));
        }
        /**
         * Sets value for `conversionId`
         * Conversion unique ID.
         */
        @JsonSetter("conversion_id")
        public Builder conversionId(Optional<String> conversionId) {
            this.conversionId = conversionId;
            return this;
        }

        /**
         * Sets value for `conversionId`
         * Conversion unique ID.
         */
        public Builder conversionId(String conversionId) {
            return this.conversionId(Optional.ofNullable(conversionId));
        }
        /**
         * Sets value for `createdAtFrom`
         * ISO 8601 format date/time for earliest payment creation to include.
         */
        @JsonSetter("created_at_from")
        public Builder createdAtFrom(Optional<String> createdAtFrom) {
            this.createdAtFrom = createdAtFrom;
            return this;
        }

        /**
         * Sets value for `createdAtFrom`
         * ISO 8601 format date/time for earliest payment creation to include.
         */
        public Builder createdAtFrom(String createdAtFrom) {
            return this.createdAtFrom(Optional.ofNullable(createdAtFrom));
        }
        /**
         * Sets value for `createdAtTo`
         * ISO 8601 format date/time for latest payment creation to include.
         */
        @JsonSetter("created_at_to")
        public Builder createdAtTo(Optional<String> createdAtTo) {
            this.createdAtTo = createdAtTo;
            return this;
        }

        /**
         * Sets value for `createdAtTo`
         * ISO 8601 format date/time for latest payment creation to include.
         */
        public Builder createdAtTo(String createdAtTo) {
            return this.createdAtTo(Optional.ofNullable(createdAtTo));
        }
        /**
         * Sets value for `currency`
         * Three-letter ISO 4217 currency code.
         */
        @JsonSetter("currency")
        public Builder currency(Optional<String> currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Sets value for `currency`
         * Three-letter ISO 4217 currency code.
         */
        public Builder currency(String currency) {
            return this.currency(Optional.ofNullable(currency));
        }
        /**
         * Sets value for `description`
         * Description that will be applied to report.
         */
        @JsonSetter("description")
        public Builder description(Optional<String> description) {
            this.description = description;
            return this;
        }

        /**
         * Sets value for `description`
         * Description that will be applied to report.
         */
        public Builder description(String description) {
            return this.description(Optional.ofNullable(description));
        }
        /**
         * Sets value for `onBehalfOf`
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        @JsonSetter("on_behalf_of")
        public Builder onBehalfOf(Optional<String> onBehalfOf) {
            this.onBehalfOf = onBehalfOf;
            return this;
        }

        /**
         * Sets value for `onBehalfOf`
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        public Builder onBehalfOf(String onBehalfOf) {
            return this.onBehalfOf(Optional.ofNullable(onBehalfOf));
        }
        /**
         * Sets value for `paymentDateFrom`
         * ISO 8601 format date for earliest payment date to include.
         */
        @JsonSetter("payment_date_from")
        public Builder paymentDateFrom(Optional<String> paymentDateFrom) {
            this.paymentDateFrom = paymentDateFrom;
            return this;
        }

        /**
         * Sets value for `paymentDateFrom`
         * ISO 8601 format date for earliest payment date to include.
         */
        public Builder paymentDateFrom(String paymentDateFrom) {
            return this.paymentDateFrom(Optional.ofNullable(paymentDateFrom));
        }
        /**
         * Sets value for `paymentDateTo`
         * ISO 8601 format date for latest payment date to include.
         */
        @JsonSetter("payment_date_to")
        public Builder paymentDateTo(Optional<String> paymentDateTo) {
            this.paymentDateTo = paymentDateTo;
            return this;
        }

        /**
         * Sets value for `paymentDateTo`
         * ISO 8601 format date for latest payment date to include.
         */
        public Builder paymentDateTo(String paymentDateTo) {
            return this.paymentDateTo(Optional.ofNullable(paymentDateTo));
        }
        /**
         * Sets value for `paymentGroupId`
         * ID of the payment group.
         */
        @JsonSetter("payment_group_id")
        public Builder paymentGroupId(Optional<String> paymentGroupId) {
            this.paymentGroupId = paymentGroupId;
            return this;
        }

        /**
         * Sets value for `paymentGroupId`
         * ID of the payment group.
         */
        public Builder paymentGroupId(String paymentGroupId) {
            return this.paymentGroupId(Optional.ofNullable(paymentGroupId));
        }
        /**
         * Sets value for `scope`
         * Specify which account level will be used - 'own' is the default value.
         */
        @JsonSetter("scope")
        public Builder scope(Optional<String> scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Sets value for `scope`
         * Specify which account level will be used - 'own' is the default value.
         */
        public Builder scope(String scope) {
            return this.scope(Optional.ofNullable(scope));
        }
        /**
         * Sets value for `status`
         * Status of the payment.
         */
        @JsonSetter("status")
        public Builder status(Optional<String> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets value for `status`
         * Status of the payment.
         */
        public Builder status(String status) {
            return this.status(Optional.ofNullable(status));
        }
        /**
         * Sets value for `transferredAtFrom`
         * ISO 8601 format date/time for earliest payment transfer date.
         */
        @JsonSetter("transferred_at_from")
        public Builder transferredAtFrom(Optional<String> transferredAtFrom) {
            this.transferredAtFrom = transferredAtFrom;
            return this;
        }

        /**
         * Sets value for `transferredAtFrom`
         * ISO 8601 format date/time for earliest payment transfer date.
         */
        public Builder transferredAtFrom(String transferredAtFrom) {
            return this.transferredAtFrom(Optional.ofNullable(transferredAtFrom));
        }
        /**
         * Sets value for `transferredAtTo`
         * ISO 8601 format date/time for latest payment transfer date.
         */
        @JsonSetter("transferred_at_to")
        public Builder transferredAtTo(Optional<String> transferredAtTo) {
            this.transferredAtTo = transferredAtTo;
            return this;
        }

        /**
         * Sets value for `transferredAtTo`
         * ISO 8601 format date/time for latest payment transfer date.
         */
        public Builder transferredAtTo(String transferredAtTo) {
            return this.transferredAtTo(Optional.ofNullable(transferredAtTo));
        }
        /**
         * Sets value for `uniqueRequestId`
         * Unique request ID of payment.
         */
        @JsonSetter("unique_request_id")
        public Builder uniqueRequestId(Optional<String> uniqueRequestId) {
            this.uniqueRequestId = uniqueRequestId;
            return this;
        }

        /**
         * Sets value for `uniqueRequestId`
         * Unique request ID of payment.
         */
        public Builder uniqueRequestId(String uniqueRequestId) {
            return this.uniqueRequestId(Optional.ofNullable(uniqueRequestId));
        }
        /**
         * Sets value for `updatedAtFrom`
         * ISO 8601 format date/time for earliest payment updated to include.
         */
        @JsonSetter("updated_at_from")
        public Builder updatedAtFrom(Optional<String> updatedAtFrom) {
            this.updatedAtFrom = updatedAtFrom;
            return this;
        }

        /**
         * Sets value for `updatedAtFrom`
         * ISO 8601 format date/time for earliest payment updated to include.
         */
        public Builder updatedAtFrom(String updatedAtFrom) {
            return this.updatedAtFrom(Optional.ofNullable(updatedAtFrom));
        }
        /**
         * Sets value for `updatedAtTo`
         * ISO 8601 format date/time for latest payment updated to include.
         */
        @JsonSetter("updated_at_to")
        public Builder updatedAtTo(Optional<String> updatedAtTo) {
            this.updatedAtTo = updatedAtTo;
            return this;
        }

        /**
         * Sets value for `updatedAtTo`
         * ISO 8601 format date/time for latest payment updated to include.
         */
        public Builder updatedAtTo(String updatedAtTo) {
            return this.updatedAtTo(Optional.ofNullable(updatedAtTo));
        }
        /**
         * Sets value for `withDeleted`
         * Include deleted payments?
         */
        @JsonSetter("with_deleted")
        public Builder withDeleted(Optional<Boolean> withDeleted) {
            this.withDeleted = withDeleted;
            return this;
        }

        /**
         * Sets value for `withDeleted`
         * Include deleted payments?
         */
        public Builder withDeleted(Boolean withDeleted) {
            return this.withDeleted(Optional.ofNullable(withDeleted));
        }



        public ReportsGeneratePaymentReportBody build() {
            return new ReportsGeneratePaymentReportBody(this);
        }
    }

}



