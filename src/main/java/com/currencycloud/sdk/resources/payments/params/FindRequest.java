
package com.currencycloud.sdk.resources.payments.params;

import java.util.Objects;
import java.util.Optional;

import com.currencycloud.sdk.model.PaymentsFindChargeTypeEnum;
import com.currencycloud.sdk.model.PaymentsFindOrderAscDescEnum;
import com.currencycloud.sdk.model.PaymentsFindReviewStatusEnum;
import com.currencycloud.sdk.model.PaymentsFindScopeEnum;
import com.currencycloud.sdk.model.PaymentsFindStatusEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * FindRequest
 */
@JsonDeserialize(builder = FindRequest.Builder.class)
public final class FindRequest {
    /**
     * Exact amount
     */
    private final Optional<String> amount;

    /**
     * Minimum amount
     */
    private final Optional<String> amountFrom;

    /**
     * Maximum amount
     */
    private final Optional<String> amountTo;

    /**
     * Beneficiary UUID
     */
    private final Optional<String> beneficiaryId;

    /**
     * Bulk upload reference code.
     */
    private final Optional<String> bulkUploadId;

    /**
     * Payment Charges Setting value (only applicable to Swift payments). Limits the search results to payments of the specified <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430820-Selecting-payment-charges-for-SWIFT-payments-FAQ">charge type</a>.
     */
    private final Optional<PaymentsFindChargeTypeEnum> chargeType;

    /**
     * Conversion UUID
     */
    private final Optional<String> conversionId;

    /**
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    private final Optional<String> createdAtFrom;

    /**
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    private final Optional<String> createdAtTo;

    /**
     * Currency in which payment was made. Three-letter ISO currency code.
     */
    private final Optional<String> currency;

    /**
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    private final Optional<String> onBehalfOf;

    /**
     * Any field name to change the sort order.
     */
    private final Optional<String> order;

    /**
     * Sort records in ascending or descending order.
     */
    private final Optional<PaymentsFindOrderAscDescEnum> orderAscDesc;

    /**
     * Page number
     */
    private final Optional<Long> page;

    /**
     * Earliest instructed payment date. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    private final Optional<String> paymentDateFrom;

    /**
     * Latest instructed payment date. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    private final Optional<String> paymentDateTo;

    /**
     * Payment group.
     */
    private final Optional<String> paymentGroupId;

    /**
     * Number of results per page.
     */
    private final Optional<Long> perPage;

    /**
     * User-generated reason for payment. Freeform text.
     */
    private final Optional<String> reason;

    /**
     * Compliance review status.
     */
    private final Optional<PaymentsFindReviewStatusEnum> reviewStatus;

    /**
     * "Own" account, "clients" sub-accounts, or "all" accounts.
     */
    private final Optional<PaymentsFindScopeEnum> scope;

    /**
     * Short reference code.
     */
    private final Optional<String> shortReference;

    /**
     * Payment status
     */
    private final Optional<PaymentsFindStatusEnum> status;

    /**
     * Earliest date of payment processing. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    private final Optional<String> transferredAtFrom;

    /**
     * Latest date of payment processing. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    private final Optional<String> transferredAtTo;

    /**
     * User-generated idempotency key.
     */
    private final Optional<String> uniqueRequestId;

    /**
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    private final Optional<String> updatedAtFrom;

    /**
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    private final Optional<String> updatedAtTo;

    /**
     * Include deleted payments.
     */
    private final Optional<Boolean> withDeleted;


    private FindRequest(Builder builder) {
        this.amount = builder.amount;
        this.amountFrom = builder.amountFrom;
        this.amountTo = builder.amountTo;
        this.beneficiaryId = builder.beneficiaryId;
        this.bulkUploadId = builder.bulkUploadId;
        this.chargeType = builder.chargeType;
        this.conversionId = builder.conversionId;
        this.createdAtFrom = builder.createdAtFrom;
        this.createdAtTo = builder.createdAtTo;
        this.currency = builder.currency;
        this.onBehalfOf = builder.onBehalfOf;
        this.order = builder.order;
        this.orderAscDesc = builder.orderAscDesc;
        this.page = builder.page;
        this.paymentDateFrom = builder.paymentDateFrom;
        this.paymentDateTo = builder.paymentDateTo;
        this.paymentGroupId = builder.paymentGroupId;
        this.perPage = builder.perPage;
        this.reason = builder.reason;
        this.reviewStatus = builder.reviewStatus;
        this.scope = builder.scope;
        this.shortReference = builder.shortReference;
        this.status = builder.status;
        this.transferredAtFrom = builder.transferredAtFrom;
        this.transferredAtTo = builder.transferredAtTo;
        this.uniqueRequestId = builder.uniqueRequestId;
        this.updatedAtFrom = builder.updatedAtFrom;
        this.updatedAtTo = builder.updatedAtTo;
        this.withDeleted = builder.withDeleted;
    }

    /**
     * Retrieves value for `amount`
     * Exact amount
     */
    @JsonProperty("amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAmount() {
        return amount;
    }
    /**
     * Retrieves value for `amountFrom`
     * Minimum amount
     */
    @JsonProperty("amount_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAmountFrom() {
        return amountFrom;
    }
    /**
     * Retrieves value for `amountTo`
     * Maximum amount
     */
    @JsonProperty("amount_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAmountTo() {
        return amountTo;
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
     * Retrieves value for `bulkUploadId`
     * Bulk upload reference code.
     */
    @JsonProperty("bulk_upload_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBulkUploadId() {
        return bulkUploadId;
    }
    /**
     * Retrieves value for `chargeType`
     * Payment Charges Setting value (only applicable to Swift payments). Limits the search results to payments of the specified <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430820-Selecting-payment-charges-for-SWIFT-payments-FAQ">charge type</a>.
     */
    @JsonProperty("charge_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<PaymentsFindChargeTypeEnum> getChargeType() {
        return chargeType;
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
     * Retrieves value for `createdAtFrom`
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    @JsonProperty("created_at_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAtFrom() {
        return createdAtFrom;
    }
    /**
     * Retrieves value for `createdAtTo`
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    @JsonProperty("created_at_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAtTo() {
        return createdAtTo;
    }
    /**
     * Retrieves value for `currency`
     * Currency in which payment was made. Three-letter ISO currency code.
     */
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCurrency() {
        return currency;
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
     * Retrieves value for `order`
     * Any field name to change the sort order.
     */
    @JsonProperty("order")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getOrder() {
        return order;
    }
    /**
     * Retrieves value for `orderAscDesc`
     * Sort records in ascending or descending order.
     */
    @JsonProperty("order_asc_desc")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<PaymentsFindOrderAscDescEnum> getOrderAscDesc() {
        return orderAscDesc;
    }
    /**
     * Retrieves value for `page`
     * Page number
     */
    @JsonProperty("page")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Long> getPage() {
        return page;
    }
    /**
     * Retrieves value for `paymentDateFrom`
     * Earliest instructed payment date. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    @JsonProperty("payment_date_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPaymentDateFrom() {
        return paymentDateFrom;
    }
    /**
     * Retrieves value for `paymentDateTo`
     * Latest instructed payment date. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    @JsonProperty("payment_date_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPaymentDateTo() {
        return paymentDateTo;
    }
    /**
     * Retrieves value for `paymentGroupId`
     * Payment group.
     */
    @JsonProperty("payment_group_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPaymentGroupId() {
        return paymentGroupId;
    }
    /**
     * Retrieves value for `perPage`
     * Number of results per page.
     */
    @JsonProperty("per_page")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Long> getPerPage() {
        return perPage;
    }
    /**
     * Retrieves value for `reason`
     * User-generated reason for payment. Freeform text.
     */
    @JsonProperty("reason")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getReason() {
        return reason;
    }
    /**
     * Retrieves value for `reviewStatus`
     * Compliance review status.
     */
    @JsonProperty("review_status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<PaymentsFindReviewStatusEnum> getReviewStatus() {
        return reviewStatus;
    }
    /**
     * Retrieves value for `scope`
     * "Own" account, "clients" sub-accounts, or "all" accounts.
     */
    @JsonProperty("scope")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<PaymentsFindScopeEnum> getScope() {
        return scope;
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
    public Optional<PaymentsFindStatusEnum> getStatus() {
        return status;
    }
    /**
     * Retrieves value for `transferredAtFrom`
     * Earliest date of payment processing. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    @JsonProperty("transferred_at_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getTransferredAtFrom() {
        return transferredAtFrom;
    }
    /**
     * Retrieves value for `transferredAtTo`
     * Latest date of payment processing. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    @JsonProperty("transferred_at_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getTransferredAtTo() {
        return transferredAtTo;
    }
    /**
     * Retrieves value for `uniqueRequestId`
     * User-generated idempotency key.
     */
    @JsonProperty("unique_request_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUniqueRequestId() {
        return uniqueRequestId;
    }
    /**
     * Retrieves value for `updatedAtFrom`
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    @JsonProperty("updated_at_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAtFrom() {
        return updatedAtFrom;
    }
    /**
     * Retrieves value for `updatedAtTo`
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    @JsonProperty("updated_at_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAtTo() {
        return updatedAtTo;
    }
    /**
     * Retrieves value for `withDeleted`
     * Include deleted payments.
     */
    @JsonProperty("with_deleted")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getWithDeleted() {
        return withDeleted;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof FindRequest && equalTo((FindRequest) other);
    }

    private boolean equalTo(FindRequest other) {
        return
            amount.equals(other.amount) &&

            amountFrom.equals(other.amountFrom) &&

            amountTo.equals(other.amountTo) &&

            beneficiaryId.equals(other.beneficiaryId) &&

            bulkUploadId.equals(other.bulkUploadId) &&

            chargeType.equals(other.chargeType) &&

            conversionId.equals(other.conversionId) &&

            createdAtFrom.equals(other.createdAtFrom) &&

            createdAtTo.equals(other.createdAtTo) &&

            currency.equals(other.currency) &&

            onBehalfOf.equals(other.onBehalfOf) &&

            order.equals(other.order) &&

            orderAscDesc.equals(other.orderAscDesc) &&

            page.equals(other.page) &&

            paymentDateFrom.equals(other.paymentDateFrom) &&

            paymentDateTo.equals(other.paymentDateTo) &&

            paymentGroupId.equals(other.paymentGroupId) &&

            perPage.equals(other.perPage) &&

            reason.equals(other.reason) &&

            reviewStatus.equals(other.reviewStatus) &&

            scope.equals(other.scope) &&

            shortReference.equals(other.shortReference) &&

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
                   this.amount,
                   this.amountFrom,
                   this.amountTo,
                   this.beneficiaryId,
                   this.bulkUploadId,
                   this.chargeType,
                   this.conversionId,
                   this.createdAtFrom,
                   this.createdAtTo,
                   this.currency,
                   this.onBehalfOf,
                   this.order,
                   this.orderAscDesc,
                   this.page,
                   this.paymentDateFrom,
                   this.paymentDateTo,
                   this.paymentGroupId,
                   this.perPage,
                   this.reason,
                   this.reviewStatus,
                   this.scope,
                   this.shortReference,
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
        return "FindRequest{" +
               "amount=" + amount + ", " +
               "amountFrom=" + amountFrom + ", " +
               "amountTo=" + amountTo + ", " +
               "beneficiaryId=" + beneficiaryId + ", " +
               "bulkUploadId=" + bulkUploadId + ", " +
               "chargeType=" + chargeType + ", " +
               "conversionId=" + conversionId + ", " +
               "createdAtFrom=" + createdAtFrom + ", " +
               "createdAtTo=" + createdAtTo + ", " +
               "currency=" + currency + ", " +
               "onBehalfOf=" + onBehalfOf + ", " +
               "order=" + order + ", " +
               "orderAscDesc=" + orderAscDesc + ", " +
               "page=" + page + ", " +
               "paymentDateFrom=" + paymentDateFrom + ", " +
               "paymentDateTo=" + paymentDateTo + ", " +
               "paymentGroupId=" + paymentGroupId + ", " +
               "perPage=" + perPage + ", " +
               "reason=" + reason + ", " +
               "reviewStatus=" + reviewStatus + ", " +
               "scope=" + scope + ", " +
               "shortReference=" + shortReference + ", " +
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
         * Exact amount
         */
        private Optional<String> amount = Optional.empty();

        /**
         * Minimum amount
         */
        private Optional<String> amountFrom = Optional.empty();

        /**
         * Maximum amount
         */
        private Optional<String> amountTo = Optional.empty();

        /**
         * Beneficiary UUID
         */
        private Optional<String> beneficiaryId = Optional.empty();

        /**
         * Bulk upload reference code.
         */
        private Optional<String> bulkUploadId = Optional.empty();

        /**
         * Payment Charges Setting value (only applicable to Swift payments). Limits the search results to payments of the specified <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430820-Selecting-payment-charges-for-SWIFT-payments-FAQ">charge type</a>.
         */
        private Optional<PaymentsFindChargeTypeEnum> chargeType = Optional.empty();

        /**
         * Conversion UUID
         */
        private Optional<String> conversionId = Optional.empty();

        /**
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        private Optional<String> createdAtFrom = Optional.empty();

        /**
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        private Optional<String> createdAtTo = Optional.empty();

        /**
         * Currency in which payment was made. Three-letter ISO currency code.
         */
        private Optional<String> currency = Optional.empty();

        /**
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        private Optional<String> onBehalfOf = Optional.empty();

        /**
         * Any field name to change the sort order.
         */
        private Optional<String> order = Optional.empty();

        /**
         * Sort records in ascending or descending order.
         */
        private Optional<PaymentsFindOrderAscDescEnum> orderAscDesc = Optional.empty();

        /**
         * Page number
         */
        private Optional<Long> page = Optional.empty();

        /**
         * Earliest instructed payment date. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        private Optional<String> paymentDateFrom = Optional.empty();

        /**
         * Latest instructed payment date. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        private Optional<String> paymentDateTo = Optional.empty();

        /**
         * Payment group.
         */
        private Optional<String> paymentGroupId = Optional.empty();

        /**
         * Number of results per page.
         */
        private Optional<Long> perPage = Optional.empty();

        /**
         * User-generated reason for payment. Freeform text.
         */
        private Optional<String> reason = Optional.empty();

        /**
         * Compliance review status.
         */
        private Optional<PaymentsFindReviewStatusEnum> reviewStatus = Optional.empty();

        /**
         * "Own" account, "clients" sub-accounts, or "all" accounts.
         */
        private Optional<PaymentsFindScopeEnum> scope = Optional.empty();

        /**
         * Short reference code.
         */
        private Optional<String> shortReference = Optional.empty();

        /**
         * Payment status
         */
        private Optional<PaymentsFindStatusEnum> status = Optional.empty();

        /**
         * Earliest date of payment processing. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        private Optional<String> transferredAtFrom = Optional.empty();

        /**
         * Latest date of payment processing. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        private Optional<String> transferredAtTo = Optional.empty();

        /**
         * User-generated idempotency key.
         */
        private Optional<String> uniqueRequestId = Optional.empty();

        /**
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        private Optional<String> updatedAtFrom = Optional.empty();

        /**
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        private Optional<String> updatedAtTo = Optional.empty();

        /**
         * Include deleted payments.
         */
        private Optional<Boolean> withDeleted = Optional.empty();


        private Builder() {}

        public Builder from(FindRequest other) {
            amount(other.getAmount());
            amountFrom(other.getAmountFrom());
            amountTo(other.getAmountTo());
            beneficiaryId(other.getBeneficiaryId());
            bulkUploadId(other.getBulkUploadId());
            chargeType(other.getChargeType());
            conversionId(other.getConversionId());
            createdAtFrom(other.getCreatedAtFrom());
            createdAtTo(other.getCreatedAtTo());
            currency(other.getCurrency());
            onBehalfOf(other.getOnBehalfOf());
            order(other.getOrder());
            orderAscDesc(other.getOrderAscDesc());
            page(other.getPage());
            paymentDateFrom(other.getPaymentDateFrom());
            paymentDateTo(other.getPaymentDateTo());
            paymentGroupId(other.getPaymentGroupId());
            perPage(other.getPerPage());
            reason(other.getReason());
            reviewStatus(other.getReviewStatus());
            scope(other.getScope());
            shortReference(other.getShortReference());
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
         * Sets value for `amount`
         * Exact amount
         */
        @JsonSetter("amount")
        public Builder amount(Optional<String> amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Sets value for `amount`
         * Exact amount
         */
        public Builder amount(String amount) {
            return this.amount(Optional.ofNullable(amount));
        }
        /**
         * Sets value for `amountFrom`
         * Minimum amount
         */
        @JsonSetter("amount_from")
        public Builder amountFrom(Optional<String> amountFrom) {
            this.amountFrom = amountFrom;
            return this;
        }

        /**
         * Sets value for `amountFrom`
         * Minimum amount
         */
        public Builder amountFrom(String amountFrom) {
            return this.amountFrom(Optional.ofNullable(amountFrom));
        }
        /**
         * Sets value for `amountTo`
         * Maximum amount
         */
        @JsonSetter("amount_to")
        public Builder amountTo(Optional<String> amountTo) {
            this.amountTo = amountTo;
            return this;
        }

        /**
         * Sets value for `amountTo`
         * Maximum amount
         */
        public Builder amountTo(String amountTo) {
            return this.amountTo(Optional.ofNullable(amountTo));
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
         * Sets value for `bulkUploadId`
         * Bulk upload reference code.
         */
        @JsonSetter("bulk_upload_id")
        public Builder bulkUploadId(Optional<String> bulkUploadId) {
            this.bulkUploadId = bulkUploadId;
            return this;
        }

        /**
         * Sets value for `bulkUploadId`
         * Bulk upload reference code.
         */
        public Builder bulkUploadId(String bulkUploadId) {
            return this.bulkUploadId(Optional.ofNullable(bulkUploadId));
        }
        /**
         * Sets value for `chargeType`
         * Payment Charges Setting value (only applicable to Swift payments). Limits the search results to payments of the specified <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430820-Selecting-payment-charges-for-SWIFT-payments-FAQ">charge type</a>.
         */
        @JsonSetter("charge_type")
        public Builder chargeType(Optional<PaymentsFindChargeTypeEnum> chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * Sets value for `chargeType`
         * Payment Charges Setting value (only applicable to Swift payments). Limits the search results to payments of the specified <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430820-Selecting-payment-charges-for-SWIFT-payments-FAQ">charge type</a>.
         */
        public Builder chargeType(PaymentsFindChargeTypeEnum chargeType) {
            return this.chargeType(Optional.ofNullable(chargeType));
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
         * Sets value for `createdAtFrom`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        @JsonSetter("created_at_from")
        public Builder createdAtFrom(Optional<String> createdAtFrom) {
            this.createdAtFrom = createdAtFrom;
            return this;
        }

        /**
         * Sets value for `createdAtFrom`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        public Builder createdAtFrom(String createdAtFrom) {
            return this.createdAtFrom(Optional.ofNullable(createdAtFrom));
        }
        /**
         * Sets value for `createdAtTo`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        @JsonSetter("created_at_to")
        public Builder createdAtTo(Optional<String> createdAtTo) {
            this.createdAtTo = createdAtTo;
            return this;
        }

        /**
         * Sets value for `createdAtTo`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        public Builder createdAtTo(String createdAtTo) {
            return this.createdAtTo(Optional.ofNullable(createdAtTo));
        }
        /**
         * Sets value for `currency`
         * Currency in which payment was made. Three-letter ISO currency code.
         */
        @JsonSetter("currency")
        public Builder currency(Optional<String> currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Sets value for `currency`
         * Currency in which payment was made. Three-letter ISO currency code.
         */
        public Builder currency(String currency) {
            return this.currency(Optional.ofNullable(currency));
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
         * Sets value for `order`
         * Any field name to change the sort order.
         */
        @JsonSetter("order")
        public Builder order(Optional<String> order) {
            this.order = order;
            return this;
        }

        /**
         * Sets value for `order`
         * Any field name to change the sort order.
         */
        public Builder order(String order) {
            return this.order(Optional.ofNullable(order));
        }
        /**
         * Sets value for `orderAscDesc`
         * Sort records in ascending or descending order.
         */
        @JsonSetter("order_asc_desc")
        public Builder orderAscDesc(Optional<PaymentsFindOrderAscDescEnum> orderAscDesc) {
            this.orderAscDesc = orderAscDesc;
            return this;
        }

        /**
         * Sets value for `orderAscDesc`
         * Sort records in ascending or descending order.
         */
        public Builder orderAscDesc(PaymentsFindOrderAscDescEnum orderAscDesc) {
            return this.orderAscDesc(Optional.ofNullable(orderAscDesc));
        }
        /**
         * Sets value for `page`
         * Page number
         */
        @JsonSetter("page")
        public Builder page(Optional<Long> page) {
            this.page = page;
            return this;
        }

        /**
         * Sets value for `page`
         * Page number
         */
        public Builder page(Long page) {
            return this.page(Optional.ofNullable(page));
        }
        /**
         * Sets value for `paymentDateFrom`
         * Earliest instructed payment date. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        @JsonSetter("payment_date_from")
        public Builder paymentDateFrom(Optional<String> paymentDateFrom) {
            this.paymentDateFrom = paymentDateFrom;
            return this;
        }

        /**
         * Sets value for `paymentDateFrom`
         * Earliest instructed payment date. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        public Builder paymentDateFrom(String paymentDateFrom) {
            return this.paymentDateFrom(Optional.ofNullable(paymentDateFrom));
        }
        /**
         * Sets value for `paymentDateTo`
         * Latest instructed payment date. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        @JsonSetter("payment_date_to")
        public Builder paymentDateTo(Optional<String> paymentDateTo) {
            this.paymentDateTo = paymentDateTo;
            return this;
        }

        /**
         * Sets value for `paymentDateTo`
         * Latest instructed payment date. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        public Builder paymentDateTo(String paymentDateTo) {
            return this.paymentDateTo(Optional.ofNullable(paymentDateTo));
        }
        /**
         * Sets value for `paymentGroupId`
         * Payment group.
         */
        @JsonSetter("payment_group_id")
        public Builder paymentGroupId(Optional<String> paymentGroupId) {
            this.paymentGroupId = paymentGroupId;
            return this;
        }

        /**
         * Sets value for `paymentGroupId`
         * Payment group.
         */
        public Builder paymentGroupId(String paymentGroupId) {
            return this.paymentGroupId(Optional.ofNullable(paymentGroupId));
        }
        /**
         * Sets value for `perPage`
         * Number of results per page.
         */
        @JsonSetter("per_page")
        public Builder perPage(Optional<Long> perPage) {
            this.perPage = perPage;
            return this;
        }

        /**
         * Sets value for `perPage`
         * Number of results per page.
         */
        public Builder perPage(Long perPage) {
            return this.perPage(Optional.ofNullable(perPage));
        }
        /**
         * Sets value for `reason`
         * User-generated reason for payment. Freeform text.
         */
        @JsonSetter("reason")
        public Builder reason(Optional<String> reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Sets value for `reason`
         * User-generated reason for payment. Freeform text.
         */
        public Builder reason(String reason) {
            return this.reason(Optional.ofNullable(reason));
        }
        /**
         * Sets value for `reviewStatus`
         * Compliance review status.
         */
        @JsonSetter("review_status")
        public Builder reviewStatus(Optional<PaymentsFindReviewStatusEnum> reviewStatus) {
            this.reviewStatus = reviewStatus;
            return this;
        }

        /**
         * Sets value for `reviewStatus`
         * Compliance review status.
         */
        public Builder reviewStatus(PaymentsFindReviewStatusEnum reviewStatus) {
            return this.reviewStatus(Optional.ofNullable(reviewStatus));
        }
        /**
         * Sets value for `scope`
         * "Own" account, "clients" sub-accounts, or "all" accounts.
         */
        @JsonSetter("scope")
        public Builder scope(Optional<PaymentsFindScopeEnum> scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Sets value for `scope`
         * "Own" account, "clients" sub-accounts, or "all" accounts.
         */
        public Builder scope(PaymentsFindScopeEnum scope) {
            return this.scope(Optional.ofNullable(scope));
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
        public Builder status(Optional<PaymentsFindStatusEnum> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets value for `status`
         * Payment status
         */
        public Builder status(PaymentsFindStatusEnum status) {
            return this.status(Optional.ofNullable(status));
        }
        /**
         * Sets value for `transferredAtFrom`
         * Earliest date of payment processing. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        @JsonSetter("transferred_at_from")
        public Builder transferredAtFrom(Optional<String> transferredAtFrom) {
            this.transferredAtFrom = transferredAtFrom;
            return this;
        }

        /**
         * Sets value for `transferredAtFrom`
         * Earliest date of payment processing. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        public Builder transferredAtFrom(String transferredAtFrom) {
            return this.transferredAtFrom(Optional.ofNullable(transferredAtFrom));
        }
        /**
         * Sets value for `transferredAtTo`
         * Latest date of payment processing. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        @JsonSetter("transferred_at_to")
        public Builder transferredAtTo(Optional<String> transferredAtTo) {
            this.transferredAtTo = transferredAtTo;
            return this;
        }

        /**
         * Sets value for `transferredAtTo`
         * Latest date of payment processing. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        public Builder transferredAtTo(String transferredAtTo) {
            return this.transferredAtTo(Optional.ofNullable(transferredAtTo));
        }
        /**
         * Sets value for `uniqueRequestId`
         * User-generated idempotency key.
         */
        @JsonSetter("unique_request_id")
        public Builder uniqueRequestId(Optional<String> uniqueRequestId) {
            this.uniqueRequestId = uniqueRequestId;
            return this;
        }

        /**
         * Sets value for `uniqueRequestId`
         * User-generated idempotency key.
         */
        public Builder uniqueRequestId(String uniqueRequestId) {
            return this.uniqueRequestId(Optional.ofNullable(uniqueRequestId));
        }
        /**
         * Sets value for `updatedAtFrom`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        @JsonSetter("updated_at_from")
        public Builder updatedAtFrom(Optional<String> updatedAtFrom) {
            this.updatedAtFrom = updatedAtFrom;
            return this;
        }

        /**
         * Sets value for `updatedAtFrom`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        public Builder updatedAtFrom(String updatedAtFrom) {
            return this.updatedAtFrom(Optional.ofNullable(updatedAtFrom));
        }
        /**
         * Sets value for `updatedAtTo`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        @JsonSetter("updated_at_to")
        public Builder updatedAtTo(Optional<String> updatedAtTo) {
            this.updatedAtTo = updatedAtTo;
            return this;
        }

        /**
         * Sets value for `updatedAtTo`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        public Builder updatedAtTo(String updatedAtTo) {
            return this.updatedAtTo(Optional.ofNullable(updatedAtTo));
        }
        /**
         * Sets value for `withDeleted`
         * Include deleted payments.
         */
        @JsonSetter("with_deleted")
        public Builder withDeleted(Optional<Boolean> withDeleted) {
            this.withDeleted = withDeleted;
            return this;
        }

        /**
         * Sets value for `withDeleted`
         * Include deleted payments.
         */
        public Builder withDeleted(Boolean withDeleted) {
            return this.withDeleted(Optional.ofNullable(withDeleted));
        }



        public FindRequest build() {
            return new FindRequest(this);
        }
    }

}



