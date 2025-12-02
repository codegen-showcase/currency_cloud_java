
package com.currencycloud.sdk.resources.transfers.params;

import java.util.Objects;
import java.util.Optional;

import com.currencycloud.sdk.model.TransfersFindOrderAscDescEnum;
import com.currencycloud.sdk.model.TransfersFindOrderEnum;
import com.currencycloud.sdk.model.TransfersFindStatusEnum;
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
     * Minimum amount
     */
    private final Optional<Double> amountFrom;

    /**
     * Maximum amount
     */
    private final Optional<Double> amountTo;

    /**
     * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
     */
    private final Optional<String> completedAtFrom;

    /**
     * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
     */
    private final Optional<String> completedAtTo;

    /**
     * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
     */
    private final Optional<String> createdAtFrom;

    /**
     * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
     */
    private final Optional<String> createdAtTo;

    /**
     * Account UUID of transfer instructor.
     */
    private final Optional<String> creatorAccountId;

    /**
     * Contact UUID of transfer instructor.
     */
    private final Optional<String> creatorContactId;

    /**
     * Three-letter ISO currency code.
     */
    private final Optional<String> currency;

    /**
     * Account UUID of the receiving account.
     */
    private final Optional<String> destinationAccountId;

    /**
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    private final Optional<String> onBehalfOf;

    /**
     * The field name to sort by - "created_at", "updated_at" or "completed_at". Defaults to "created_at" if not specified..<br>
     */
    private final Optional<TransfersFindOrderEnum> order;

    /**
     * Sort records in ascending or descending order.
     */
    private final Optional<TransfersFindOrderAscDescEnum> orderAscDesc;

    /**
     * Page number
     */
    private final Optional<Long> page;

    /**
     * Number of results per page.
     */
    private final Optional<Long> perPage;

    /**
     * Short reference code.
     */
    private final Optional<String> shortReference;

    /**
     * Account UUID of the paying account.
     */
    private final Optional<String> sourceAccountId;

    /**
     * Transfer status
     */
    private final Optional<TransfersFindStatusEnum> status;

    /**
     * User-generated idempotency key.
     */
    private final Optional<String> uniqueRequestId;

    /**
     * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
     */
    private final Optional<String> updatedAtFrom;

    /**
     * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
     */
    private final Optional<String> updatedAtTo;


    private FindRequest(Builder builder) {
        this.amountFrom = builder.amountFrom;
        this.amountTo = builder.amountTo;
        this.completedAtFrom = builder.completedAtFrom;
        this.completedAtTo = builder.completedAtTo;
        this.createdAtFrom = builder.createdAtFrom;
        this.createdAtTo = builder.createdAtTo;
        this.creatorAccountId = builder.creatorAccountId;
        this.creatorContactId = builder.creatorContactId;
        this.currency = builder.currency;
        this.destinationAccountId = builder.destinationAccountId;
        this.onBehalfOf = builder.onBehalfOf;
        this.order = builder.order;
        this.orderAscDesc = builder.orderAscDesc;
        this.page = builder.page;
        this.perPage = builder.perPage;
        this.shortReference = builder.shortReference;
        this.sourceAccountId = builder.sourceAccountId;
        this.status = builder.status;
        this.uniqueRequestId = builder.uniqueRequestId;
        this.updatedAtFrom = builder.updatedAtFrom;
        this.updatedAtTo = builder.updatedAtTo;
    }

    /**
     * Retrieves value for `amountFrom`
     * Minimum amount
     */
    @JsonProperty("amount_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Double> getAmountFrom() {
        return amountFrom;
    }
    /**
     * Retrieves value for `amountTo`
     * Maximum amount
     */
    @JsonProperty("amount_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Double> getAmountTo() {
        return amountTo;
    }
    /**
     * Retrieves value for `completedAtFrom`
     * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
     */
    @JsonProperty("completed_at_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCompletedAtFrom() {
        return completedAtFrom;
    }
    /**
     * Retrieves value for `completedAtTo`
     * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
     */
    @JsonProperty("completed_at_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCompletedAtTo() {
        return completedAtTo;
    }
    /**
     * Retrieves value for `createdAtFrom`
     * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
     */
    @JsonProperty("created_at_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAtFrom() {
        return createdAtFrom;
    }
    /**
     * Retrieves value for `createdAtTo`
     * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
     */
    @JsonProperty("created_at_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAtTo() {
        return createdAtTo;
    }
    /**
     * Retrieves value for `creatorAccountId`
     * Account UUID of transfer instructor.
     */
    @JsonProperty("creator_account_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatorAccountId() {
        return creatorAccountId;
    }
    /**
     * Retrieves value for `creatorContactId`
     * Contact UUID of transfer instructor.
     */
    @JsonProperty("creator_contact_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatorContactId() {
        return creatorContactId;
    }
    /**
     * Retrieves value for `currency`
     * Three-letter ISO currency code.
     */
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `destinationAccountId`
     * Account UUID of the receiving account.
     */
    @JsonProperty("destination_account_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getDestinationAccountId() {
        return destinationAccountId;
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
     * The field name to sort by - "created_at", "updated_at" or "completed_at". Defaults to "created_at" if not specified..<br>
     */
    @JsonProperty("order")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<TransfersFindOrderEnum> getOrder() {
        return order;
    }
    /**
     * Retrieves value for `orderAscDesc`
     * Sort records in ascending or descending order.
     */
    @JsonProperty("order_asc_desc")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<TransfersFindOrderAscDescEnum> getOrderAscDesc() {
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
     * Retrieves value for `perPage`
     * Number of results per page.
     */
    @JsonProperty("per_page")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Long> getPerPage() {
        return perPage;
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
     * Retrieves value for `sourceAccountId`
     * Account UUID of the paying account.
     */
    @JsonProperty("source_account_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSourceAccountId() {
        return sourceAccountId;
    }
    /**
     * Retrieves value for `status`
     * Transfer status
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<TransfersFindStatusEnum> getStatus() {
        return status;
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
     * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
     */
    @JsonProperty("updated_at_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAtFrom() {
        return updatedAtFrom;
    }
    /**
     * Retrieves value for `updatedAtTo`
     * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
     */
    @JsonProperty("updated_at_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAtTo() {
        return updatedAtTo;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof FindRequest && equalTo((FindRequest) other);
    }

    private boolean equalTo(FindRequest other) {
        return
            amountFrom.equals(other.amountFrom) &&

            amountTo.equals(other.amountTo) &&

            completedAtFrom.equals(other.completedAtFrom) &&

            completedAtTo.equals(other.completedAtTo) &&

            createdAtFrom.equals(other.createdAtFrom) &&

            createdAtTo.equals(other.createdAtTo) &&

            creatorAccountId.equals(other.creatorAccountId) &&

            creatorContactId.equals(other.creatorContactId) &&

            currency.equals(other.currency) &&

            destinationAccountId.equals(other.destinationAccountId) &&

            onBehalfOf.equals(other.onBehalfOf) &&

            order.equals(other.order) &&

            orderAscDesc.equals(other.orderAscDesc) &&

            page.equals(other.page) &&

            perPage.equals(other.perPage) &&

            shortReference.equals(other.shortReference) &&

            sourceAccountId.equals(other.sourceAccountId) &&

            status.equals(other.status) &&

            uniqueRequestId.equals(other.uniqueRequestId) &&

            updatedAtFrom.equals(other.updatedAtFrom) &&

            updatedAtTo.equals(other.updatedAtTo)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.amountFrom,
                   this.amountTo,
                   this.completedAtFrom,
                   this.completedAtTo,
                   this.createdAtFrom,
                   this.createdAtTo,
                   this.creatorAccountId,
                   this.creatorContactId,
                   this.currency,
                   this.destinationAccountId,
                   this.onBehalfOf,
                   this.order,
                   this.orderAscDesc,
                   this.page,
                   this.perPage,
                   this.shortReference,
                   this.sourceAccountId,
                   this.status,
                   this.uniqueRequestId,
                   this.updatedAtFrom,
                   this.updatedAtTo
               );
    }

    @Override
    public String toString() {
        return "FindRequest{" +
               "amountFrom=" + amountFrom + ", " +
               "amountTo=" + amountTo + ", " +
               "completedAtFrom=" + completedAtFrom + ", " +
               "completedAtTo=" + completedAtTo + ", " +
               "createdAtFrom=" + createdAtFrom + ", " +
               "createdAtTo=" + createdAtTo + ", " +
               "creatorAccountId=" + creatorAccountId + ", " +
               "creatorContactId=" + creatorContactId + ", " +
               "currency=" + currency + ", " +
               "destinationAccountId=" + destinationAccountId + ", " +
               "onBehalfOf=" + onBehalfOf + ", " +
               "order=" + order + ", " +
               "orderAscDesc=" + orderAscDesc + ", " +
               "page=" + page + ", " +
               "perPage=" + perPage + ", " +
               "shortReference=" + shortReference + ", " +
               "sourceAccountId=" + sourceAccountId + ", " +
               "status=" + status + ", " +
               "uniqueRequestId=" + uniqueRequestId + ", " +
               "updatedAtFrom=" + updatedAtFrom + ", " +
               "updatedAtTo=" + updatedAtTo +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Minimum amount
         */
        private Optional<Double> amountFrom = Optional.empty();

        /**
         * Maximum amount
         */
        private Optional<Double> amountTo = Optional.empty();

        /**
         * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
         */
        private Optional<String> completedAtFrom = Optional.empty();

        /**
         * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
         */
        private Optional<String> completedAtTo = Optional.empty();

        /**
         * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
         */
        private Optional<String> createdAtFrom = Optional.empty();

        /**
         * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
         */
        private Optional<String> createdAtTo = Optional.empty();

        /**
         * Account UUID of transfer instructor.
         */
        private Optional<String> creatorAccountId = Optional.empty();

        /**
         * Contact UUID of transfer instructor.
         */
        private Optional<String> creatorContactId = Optional.empty();

        /**
         * Three-letter ISO currency code.
         */
        private Optional<String> currency = Optional.empty();

        /**
         * Account UUID of the receiving account.
         */
        private Optional<String> destinationAccountId = Optional.empty();

        /**
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        private Optional<String> onBehalfOf = Optional.empty();

        /**
         * The field name to sort by - "created_at", "updated_at" or "completed_at". Defaults to "created_at" if not specified..<br>
         */
        private Optional<TransfersFindOrderEnum> order = Optional.empty();

        /**
         * Sort records in ascending or descending order.
         */
        private Optional<TransfersFindOrderAscDescEnum> orderAscDesc = Optional.empty();

        /**
         * Page number
         */
        private Optional<Long> page = Optional.empty();

        /**
         * Number of results per page.
         */
        private Optional<Long> perPage = Optional.empty();

        /**
         * Short reference code.
         */
        private Optional<String> shortReference = Optional.empty();

        /**
         * Account UUID of the paying account.
         */
        private Optional<String> sourceAccountId = Optional.empty();

        /**
         * Transfer status
         */
        private Optional<TransfersFindStatusEnum> status = Optional.empty();

        /**
         * User-generated idempotency key.
         */
        private Optional<String> uniqueRequestId = Optional.empty();

        /**
         * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
         */
        private Optional<String> updatedAtFrom = Optional.empty();

        /**
         * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
         */
        private Optional<String> updatedAtTo = Optional.empty();


        private Builder() {}

        public Builder from(FindRequest other) {
            amountFrom(other.getAmountFrom());
            amountTo(other.getAmountTo());
            completedAtFrom(other.getCompletedAtFrom());
            completedAtTo(other.getCompletedAtTo());
            createdAtFrom(other.getCreatedAtFrom());
            createdAtTo(other.getCreatedAtTo());
            creatorAccountId(other.getCreatorAccountId());
            creatorContactId(other.getCreatorContactId());
            currency(other.getCurrency());
            destinationAccountId(other.getDestinationAccountId());
            onBehalfOf(other.getOnBehalfOf());
            order(other.getOrder());
            orderAscDesc(other.getOrderAscDesc());
            page(other.getPage());
            perPage(other.getPerPage());
            shortReference(other.getShortReference());
            sourceAccountId(other.getSourceAccountId());
            status(other.getStatus());
            uniqueRequestId(other.getUniqueRequestId());
            updatedAtFrom(other.getUpdatedAtFrom());
            updatedAtTo(other.getUpdatedAtTo());
            return this;
        }

        /**
         * Sets value for `amountFrom`
         * Minimum amount
         */
        @JsonSetter("amount_from")
        public Builder amountFrom(Optional<Double> amountFrom) {
            this.amountFrom = amountFrom;
            return this;
        }

        /**
         * Sets value for `amountFrom`
         * Minimum amount
         */
        public Builder amountFrom(Double amountFrom) {
            return this.amountFrom(Optional.ofNullable(amountFrom));
        }
        /**
         * Sets value for `amountTo`
         * Maximum amount
         */
        @JsonSetter("amount_to")
        public Builder amountTo(Optional<Double> amountTo) {
            this.amountTo = amountTo;
            return this;
        }

        /**
         * Sets value for `amountTo`
         * Maximum amount
         */
        public Builder amountTo(Double amountTo) {
            return this.amountTo(Optional.ofNullable(amountTo));
        }
        /**
         * Sets value for `completedAtFrom`
         * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
         */
        @JsonSetter("completed_at_from")
        public Builder completedAtFrom(Optional<String> completedAtFrom) {
            this.completedAtFrom = completedAtFrom;
            return this;
        }

        /**
         * Sets value for `completedAtFrom`
         * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
         */
        public Builder completedAtFrom(String completedAtFrom) {
            return this.completedAtFrom(Optional.ofNullable(completedAtFrom));
        }
        /**
         * Sets value for `completedAtTo`
         * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
         */
        @JsonSetter("completed_at_to")
        public Builder completedAtTo(Optional<String> completedAtTo) {
            this.completedAtTo = completedAtTo;
            return this;
        }

        /**
         * Sets value for `completedAtTo`
         * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
         */
        public Builder completedAtTo(String completedAtTo) {
            return this.completedAtTo(Optional.ofNullable(completedAtTo));
        }
        /**
         * Sets value for `createdAtFrom`
         * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
         */
        @JsonSetter("created_at_from")
        public Builder createdAtFrom(Optional<String> createdAtFrom) {
            this.createdAtFrom = createdAtFrom;
            return this;
        }

        /**
         * Sets value for `createdAtFrom`
         * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
         */
        public Builder createdAtFrom(String createdAtFrom) {
            return this.createdAtFrom(Optional.ofNullable(createdAtFrom));
        }
        /**
         * Sets value for `createdAtTo`
         * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
         */
        @JsonSetter("created_at_to")
        public Builder createdAtTo(Optional<String> createdAtTo) {
            this.createdAtTo = createdAtTo;
            return this;
        }

        /**
         * Sets value for `createdAtTo`
         * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
         */
        public Builder createdAtTo(String createdAtTo) {
            return this.createdAtTo(Optional.ofNullable(createdAtTo));
        }
        /**
         * Sets value for `creatorAccountId`
         * Account UUID of transfer instructor.
         */
        @JsonSetter("creator_account_id")
        public Builder creatorAccountId(Optional<String> creatorAccountId) {
            this.creatorAccountId = creatorAccountId;
            return this;
        }

        /**
         * Sets value for `creatorAccountId`
         * Account UUID of transfer instructor.
         */
        public Builder creatorAccountId(String creatorAccountId) {
            return this.creatorAccountId(Optional.ofNullable(creatorAccountId));
        }
        /**
         * Sets value for `creatorContactId`
         * Contact UUID of transfer instructor.
         */
        @JsonSetter("creator_contact_id")
        public Builder creatorContactId(Optional<String> creatorContactId) {
            this.creatorContactId = creatorContactId;
            return this;
        }

        /**
         * Sets value for `creatorContactId`
         * Contact UUID of transfer instructor.
         */
        public Builder creatorContactId(String creatorContactId) {
            return this.creatorContactId(Optional.ofNullable(creatorContactId));
        }
        /**
         * Sets value for `currency`
         * Three-letter ISO currency code.
         */
        @JsonSetter("currency")
        public Builder currency(Optional<String> currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Sets value for `currency`
         * Three-letter ISO currency code.
         */
        public Builder currency(String currency) {
            return this.currency(Optional.ofNullable(currency));
        }
        /**
         * Sets value for `destinationAccountId`
         * Account UUID of the receiving account.
         */
        @JsonSetter("destination_account_id")
        public Builder destinationAccountId(Optional<String> destinationAccountId) {
            this.destinationAccountId = destinationAccountId;
            return this;
        }

        /**
         * Sets value for `destinationAccountId`
         * Account UUID of the receiving account.
         */
        public Builder destinationAccountId(String destinationAccountId) {
            return this.destinationAccountId(Optional.ofNullable(destinationAccountId));
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
         * The field name to sort by - "created_at", "updated_at" or "completed_at". Defaults to "created_at" if not specified..<br>
         */
        @JsonSetter("order")
        public Builder order(Optional<TransfersFindOrderEnum> order) {
            this.order = order;
            return this;
        }

        /**
         * Sets value for `order`
         * The field name to sort by - "created_at", "updated_at" or "completed_at". Defaults to "created_at" if not specified..<br>
         */
        public Builder order(TransfersFindOrderEnum order) {
            return this.order(Optional.ofNullable(order));
        }
        /**
         * Sets value for `orderAscDesc`
         * Sort records in ascending or descending order.
         */
        @JsonSetter("order_asc_desc")
        public Builder orderAscDesc(Optional<TransfersFindOrderAscDescEnum> orderAscDesc) {
            this.orderAscDesc = orderAscDesc;
            return this;
        }

        /**
         * Sets value for `orderAscDesc`
         * Sort records in ascending or descending order.
         */
        public Builder orderAscDesc(TransfersFindOrderAscDescEnum orderAscDesc) {
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
         * Sets value for `sourceAccountId`
         * Account UUID of the paying account.
         */
        @JsonSetter("source_account_id")
        public Builder sourceAccountId(Optional<String> sourceAccountId) {
            this.sourceAccountId = sourceAccountId;
            return this;
        }

        /**
         * Sets value for `sourceAccountId`
         * Account UUID of the paying account.
         */
        public Builder sourceAccountId(String sourceAccountId) {
            return this.sourceAccountId(Optional.ofNullable(sourceAccountId));
        }
        /**
         * Sets value for `status`
         * Transfer status
         */
        @JsonSetter("status")
        public Builder status(Optional<TransfersFindStatusEnum> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets value for `status`
         * Transfer status
         */
        public Builder status(TransfersFindStatusEnum status) {
            return this.status(Optional.ofNullable(status));
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
         * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
         */
        @JsonSetter("updated_at_from")
        public Builder updatedAtFrom(Optional<String> updatedAtFrom) {
            this.updatedAtFrom = updatedAtFrom;
            return this;
        }

        /**
         * Sets value for `updatedAtFrom`
         * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
         */
        public Builder updatedAtFrom(String updatedAtFrom) {
            return this.updatedAtFrom(Optional.ofNullable(updatedAtFrom));
        }
        /**
         * Sets value for `updatedAtTo`
         * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
         */
        @JsonSetter("updated_at_to")
        public Builder updatedAtTo(Optional<String> updatedAtTo) {
            this.updatedAtTo = updatedAtTo;
            return this;
        }

        /**
         * Sets value for `updatedAtTo`
         * Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z".
         */
        public Builder updatedAtTo(String updatedAtTo) {
            return this.updatedAtTo(Optional.ofNullable(updatedAtTo));
        }



        public FindRequest build() {
            return new FindRequest(this);
        }
    }

}



