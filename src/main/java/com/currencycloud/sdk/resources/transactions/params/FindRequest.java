
package com.currencycloud.sdk.resources.transactions.params;

import java.util.Objects;
import java.util.Optional;

import com.currencycloud.sdk.model.TransactionsFindActionEnum;
import com.currencycloud.sdk.model.TransactionsFindOrderAscDescEnum;
import com.currencycloud.sdk.model.TransactionsFindRelatedEntityTypeEnum;
import com.currencycloud.sdk.model.TransactionsFindScopeEnum;
import com.currencycloud.sdk.model.TransactionsFindStatusEnum;
import com.currencycloud.sdk.model.TransactionsFindTypeEnum;
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
     * The action that triggered the transaction.
     */
    private final Optional<TransactionsFindActionEnum> action;

    /**
     * Amount the transaction is for.
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
     * Beneficiary UUID. Required if "related_entity_type" is "payment".
     */
    private final Optional<String> beneficiaryId;

    /**
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
     */
    private final Optional<String> completedAtFrom;

    /**
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
     */
    private final Optional<String> completedAtTo;

    /**
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
     */
    private final Optional<String> createdAtFrom;

    /**
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
     */
    private final Optional<String> createdAtTo;

    /**
     * Three-letter ISO currency code.
     */
    private final Optional<String> currency;

    /**
     * Concatenated string of the two currencies traded, e.g. "USDEUR". Required if "related_entity_type" is "conversion".
     */
    private final Optional<String> currencyPair;

    /**
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    private final Optional<String> onBehalfOf;

    /**
     * The field to sort by. Defaults to 'created_at' if not specified.<br><br> Please note that if you choose to order by 'completed_at', it's important to populate the query parameter 'status' with the value 'completed' in order to ensure that transactions are sequenced in the order they were processed. Without this, transactions that completed within the same second may not be ordered correctly.
     */
    private final Optional<String> order;

    /**
     * Sort results in ascending or descending order.
     */
    private final Optional<TransactionsFindOrderAscDescEnum> orderAscDesc;

    /**
     * Page number
     */
    private final Optional<Long> page;

    /**
     * Number of results per page.
     */
    private final Optional<Long> perPage;

    /**
     * UUID of the related entity.
     */
    private final Optional<String> relatedEntityId;

    /**
     * Short reference code.
     */
    private final Optional<String> relatedEntityShortReference;

    /**
     * The related entity that created the transaction.<br> For information, the related_entity_type for margin transactions is <b>'margin_transaction'</b>. While it isn't possible to search directly by this value, margin transactions can be filtered using the ‘action’ field and may be included in the response.
     */
    private final Optional<TransactionsFindRelatedEntityTypeEnum> relatedEntityType;

    /**
     * "Own" account, "clients" sub-accounts, or "all" accounts.
     */
    private final Optional<TransactionsFindScopeEnum> scope;

    /**
     * Earliest processing date. Any valid ISO 8601 format, e.g. "e.g. "2023-12-31T23:59:59Z".
     */
    private final Optional<String> settlesAtFrom;

    /**
     * Latest processing date. Any valid ISO 8601 format, e.g. "e.g. "2023-12-31T23:59:59Z".
     */
    private final Optional<String> settlesAtTo;

    /**
     * Transaction status.
     */
    private final Optional<TransactionsFindStatusEnum> status;

    /**
     * Whether the transaction debits or credits the account balance.
     */
    private final Optional<TransactionsFindTypeEnum> type;

    /**
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
     */
    private final Optional<String> updatedAtFrom;

    /**
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
     */
    private final Optional<String> updatedAtTo;


    private FindRequest(Builder builder) {
        this.action = builder.action;
        this.amount = builder.amount;
        this.amountFrom = builder.amountFrom;
        this.amountTo = builder.amountTo;
        this.beneficiaryId = builder.beneficiaryId;
        this.completedAtFrom = builder.completedAtFrom;
        this.completedAtTo = builder.completedAtTo;
        this.createdAtFrom = builder.createdAtFrom;
        this.createdAtTo = builder.createdAtTo;
        this.currency = builder.currency;
        this.currencyPair = builder.currencyPair;
        this.onBehalfOf = builder.onBehalfOf;
        this.order = builder.order;
        this.orderAscDesc = builder.orderAscDesc;
        this.page = builder.page;
        this.perPage = builder.perPage;
        this.relatedEntityId = builder.relatedEntityId;
        this.relatedEntityShortReference = builder.relatedEntityShortReference;
        this.relatedEntityType = builder.relatedEntityType;
        this.scope = builder.scope;
        this.settlesAtFrom = builder.settlesAtFrom;
        this.settlesAtTo = builder.settlesAtTo;
        this.status = builder.status;
        this.type = builder.type;
        this.updatedAtFrom = builder.updatedAtFrom;
        this.updatedAtTo = builder.updatedAtTo;
    }

    /**
     * Retrieves value for `action`
     * The action that triggered the transaction.
     */
    @JsonProperty("action")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<TransactionsFindActionEnum> getAction() {
        return action;
    }
    /**
     * Retrieves value for `amount`
     * Amount the transaction is for.
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
     * Beneficiary UUID. Required if "related_entity_type" is "payment".
     */
    @JsonProperty("beneficiary_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryId() {
        return beneficiaryId;
    }
    /**
     * Retrieves value for `completedAtFrom`
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
     */
    @JsonProperty("completed_at_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCompletedAtFrom() {
        return completedAtFrom;
    }
    /**
     * Retrieves value for `completedAtTo`
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
     */
    @JsonProperty("completed_at_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCompletedAtTo() {
        return completedAtTo;
    }
    /**
     * Retrieves value for `createdAtFrom`
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
     */
    @JsonProperty("created_at_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAtFrom() {
        return createdAtFrom;
    }
    /**
     * Retrieves value for `createdAtTo`
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
     */
    @JsonProperty("created_at_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAtTo() {
        return createdAtTo;
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
     * Retrieves value for `currencyPair`
     * Concatenated string of the two currencies traded, e.g. "USDEUR". Required if "related_entity_type" is "conversion".
     */
    @JsonProperty("currency_pair")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCurrencyPair() {
        return currencyPair;
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
     * The field to sort by. Defaults to 'created_at' if not specified.<br><br> Please note that if you choose to order by 'completed_at', it's important to populate the query parameter 'status' with the value 'completed' in order to ensure that transactions are sequenced in the order they were processed. Without this, transactions that completed within the same second may not be ordered correctly.
     */
    @JsonProperty("order")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getOrder() {
        return order;
    }
    /**
     * Retrieves value for `orderAscDesc`
     * Sort results in ascending or descending order.
     */
    @JsonProperty("order_asc_desc")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<TransactionsFindOrderAscDescEnum> getOrderAscDesc() {
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
     * Retrieves value for `relatedEntityId`
     * UUID of the related entity.
     */
    @JsonProperty("related_entity_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getRelatedEntityId() {
        return relatedEntityId;
    }
    /**
     * Retrieves value for `relatedEntityShortReference`
     * Short reference code.
     */
    @JsonProperty("related_entity_short_reference")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getRelatedEntityShortReference() {
        return relatedEntityShortReference;
    }
    /**
     * Retrieves value for `relatedEntityType`
     * The related entity that created the transaction.<br> For information, the related_entity_type for margin transactions is <b>'margin_transaction'</b>. While it isn't possible to search directly by this value, margin transactions can be filtered using the ‘action’ field and may be included in the response.
     */
    @JsonProperty("related_entity_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<TransactionsFindRelatedEntityTypeEnum> getRelatedEntityType() {
        return relatedEntityType;
    }
    /**
     * Retrieves value for `scope`
     * "Own" account, "clients" sub-accounts, or "all" accounts.
     */
    @JsonProperty("scope")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<TransactionsFindScopeEnum> getScope() {
        return scope;
    }
    /**
     * Retrieves value for `settlesAtFrom`
     * Earliest processing date. Any valid ISO 8601 format, e.g. "e.g. "2023-12-31T23:59:59Z".
     */
    @JsonProperty("settles_at_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSettlesAtFrom() {
        return settlesAtFrom;
    }
    /**
     * Retrieves value for `settlesAtTo`
     * Latest processing date. Any valid ISO 8601 format, e.g. "e.g. "2023-12-31T23:59:59Z".
     */
    @JsonProperty("settles_at_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSettlesAtTo() {
        return settlesAtTo;
    }
    /**
     * Retrieves value for `status`
     * Transaction status.
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<TransactionsFindStatusEnum> getStatus() {
        return status;
    }
    /**
     * Retrieves value for `type`
     * Whether the transaction debits or credits the account balance.
     */
    @JsonProperty("type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<TransactionsFindTypeEnum> getType() {
        return type;
    }
    /**
     * Retrieves value for `updatedAtFrom`
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
     */
    @JsonProperty("updated_at_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAtFrom() {
        return updatedAtFrom;
    }
    /**
     * Retrieves value for `updatedAtTo`
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
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
            action.equals(other.action) &&

            amount.equals(other.amount) &&

            amountFrom.equals(other.amountFrom) &&

            amountTo.equals(other.amountTo) &&

            beneficiaryId.equals(other.beneficiaryId) &&

            completedAtFrom.equals(other.completedAtFrom) &&

            completedAtTo.equals(other.completedAtTo) &&

            createdAtFrom.equals(other.createdAtFrom) &&

            createdAtTo.equals(other.createdAtTo) &&

            currency.equals(other.currency) &&

            currencyPair.equals(other.currencyPair) &&

            onBehalfOf.equals(other.onBehalfOf) &&

            order.equals(other.order) &&

            orderAscDesc.equals(other.orderAscDesc) &&

            page.equals(other.page) &&

            perPage.equals(other.perPage) &&

            relatedEntityId.equals(other.relatedEntityId) &&

            relatedEntityShortReference.equals(other.relatedEntityShortReference) &&

            relatedEntityType.equals(other.relatedEntityType) &&

            scope.equals(other.scope) &&

            settlesAtFrom.equals(other.settlesAtFrom) &&

            settlesAtTo.equals(other.settlesAtTo) &&

            status.equals(other.status) &&

            type.equals(other.type) &&

            updatedAtFrom.equals(other.updatedAtFrom) &&

            updatedAtTo.equals(other.updatedAtTo)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.action,
                   this.amount,
                   this.amountFrom,
                   this.amountTo,
                   this.beneficiaryId,
                   this.completedAtFrom,
                   this.completedAtTo,
                   this.createdAtFrom,
                   this.createdAtTo,
                   this.currency,
                   this.currencyPair,
                   this.onBehalfOf,
                   this.order,
                   this.orderAscDesc,
                   this.page,
                   this.perPage,
                   this.relatedEntityId,
                   this.relatedEntityShortReference,
                   this.relatedEntityType,
                   this.scope,
                   this.settlesAtFrom,
                   this.settlesAtTo,
                   this.status,
                   this.type,
                   this.updatedAtFrom,
                   this.updatedAtTo
               );
    }

    @Override
    public String toString() {
        return "FindRequest{" +
               "action=" + action + ", " +
               "amount=" + amount + ", " +
               "amountFrom=" + amountFrom + ", " +
               "amountTo=" + amountTo + ", " +
               "beneficiaryId=" + beneficiaryId + ", " +
               "completedAtFrom=" + completedAtFrom + ", " +
               "completedAtTo=" + completedAtTo + ", " +
               "createdAtFrom=" + createdAtFrom + ", " +
               "createdAtTo=" + createdAtTo + ", " +
               "currency=" + currency + ", " +
               "currencyPair=" + currencyPair + ", " +
               "onBehalfOf=" + onBehalfOf + ", " +
               "order=" + order + ", " +
               "orderAscDesc=" + orderAscDesc + ", " +
               "page=" + page + ", " +
               "perPage=" + perPage + ", " +
               "relatedEntityId=" + relatedEntityId + ", " +
               "relatedEntityShortReference=" + relatedEntityShortReference + ", " +
               "relatedEntityType=" + relatedEntityType + ", " +
               "scope=" + scope + ", " +
               "settlesAtFrom=" + settlesAtFrom + ", " +
               "settlesAtTo=" + settlesAtTo + ", " +
               "status=" + status + ", " +
               "type=" + type + ", " +
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
         * The action that triggered the transaction.
         */
        private Optional<TransactionsFindActionEnum> action = Optional.empty();

        /**
         * Amount the transaction is for.
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
         * Beneficiary UUID. Required if "related_entity_type" is "payment".
         */
        private Optional<String> beneficiaryId = Optional.empty();

        /**
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
         */
        private Optional<String> completedAtFrom = Optional.empty();

        /**
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
         */
        private Optional<String> completedAtTo = Optional.empty();

        /**
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
         */
        private Optional<String> createdAtFrom = Optional.empty();

        /**
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
         */
        private Optional<String> createdAtTo = Optional.empty();

        /**
         * Three-letter ISO currency code.
         */
        private Optional<String> currency = Optional.empty();

        /**
         * Concatenated string of the two currencies traded, e.g. "USDEUR". Required if "related_entity_type" is "conversion".
         */
        private Optional<String> currencyPair = Optional.empty();

        /**
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        private Optional<String> onBehalfOf = Optional.empty();

        /**
         * The field to sort by. Defaults to 'created_at' if not specified.<br><br> Please note that if you choose to order by 'completed_at', it's important to populate the query parameter 'status' with the value 'completed' in order to ensure that transactions are sequenced in the order they were processed. Without this, transactions that completed within the same second may not be ordered correctly.
         */
        private Optional<String> order = Optional.empty();

        /**
         * Sort results in ascending or descending order.
         */
        private Optional<TransactionsFindOrderAscDescEnum> orderAscDesc = Optional.empty();

        /**
         * Page number
         */
        private Optional<Long> page = Optional.empty();

        /**
         * Number of results per page.
         */
        private Optional<Long> perPage = Optional.empty();

        /**
         * UUID of the related entity.
         */
        private Optional<String> relatedEntityId = Optional.empty();

        /**
         * Short reference code.
         */
        private Optional<String> relatedEntityShortReference = Optional.empty();

        /**
         * The related entity that created the transaction.<br> For information, the related_entity_type for margin transactions is <b>'margin_transaction'</b>. While it isn't possible to search directly by this value, margin transactions can be filtered using the ‘action’ field and may be included in the response.
         */
        private Optional<TransactionsFindRelatedEntityTypeEnum> relatedEntityType = Optional.empty();

        /**
         * "Own" account, "clients" sub-accounts, or "all" accounts.
         */
        private Optional<TransactionsFindScopeEnum> scope = Optional.empty();

        /**
         * Earliest processing date. Any valid ISO 8601 format, e.g. "e.g. "2023-12-31T23:59:59Z".
         */
        private Optional<String> settlesAtFrom = Optional.empty();

        /**
         * Latest processing date. Any valid ISO 8601 format, e.g. "e.g. "2023-12-31T23:59:59Z".
         */
        private Optional<String> settlesAtTo = Optional.empty();

        /**
         * Transaction status.
         */
        private Optional<TransactionsFindStatusEnum> status = Optional.empty();

        /**
         * Whether the transaction debits or credits the account balance.
         */
        private Optional<TransactionsFindTypeEnum> type = Optional.empty();

        /**
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
         */
        private Optional<String> updatedAtFrom = Optional.empty();

        /**
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
         */
        private Optional<String> updatedAtTo = Optional.empty();


        private Builder() {}

        public Builder from(FindRequest other) {
            action(other.getAction());
            amount(other.getAmount());
            amountFrom(other.getAmountFrom());
            amountTo(other.getAmountTo());
            beneficiaryId(other.getBeneficiaryId());
            completedAtFrom(other.getCompletedAtFrom());
            completedAtTo(other.getCompletedAtTo());
            createdAtFrom(other.getCreatedAtFrom());
            createdAtTo(other.getCreatedAtTo());
            currency(other.getCurrency());
            currencyPair(other.getCurrencyPair());
            onBehalfOf(other.getOnBehalfOf());
            order(other.getOrder());
            orderAscDesc(other.getOrderAscDesc());
            page(other.getPage());
            perPage(other.getPerPage());
            relatedEntityId(other.getRelatedEntityId());
            relatedEntityShortReference(other.getRelatedEntityShortReference());
            relatedEntityType(other.getRelatedEntityType());
            scope(other.getScope());
            settlesAtFrom(other.getSettlesAtFrom());
            settlesAtTo(other.getSettlesAtTo());
            status(other.getStatus());
            type(other.getType());
            updatedAtFrom(other.getUpdatedAtFrom());
            updatedAtTo(other.getUpdatedAtTo());
            return this;
        }

        /**
         * Sets value for `action`
         * The action that triggered the transaction.
         */
        @JsonSetter("action")
        public Builder action(Optional<TransactionsFindActionEnum> action) {
            this.action = action;
            return this;
        }

        /**
         * Sets value for `action`
         * The action that triggered the transaction.
         */
        public Builder action(TransactionsFindActionEnum action) {
            return this.action(Optional.ofNullable(action));
        }
        /**
         * Sets value for `amount`
         * Amount the transaction is for.
         */
        @JsonSetter("amount")
        public Builder amount(Optional<String> amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Sets value for `amount`
         * Amount the transaction is for.
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
         * Beneficiary UUID. Required if "related_entity_type" is "payment".
         */
        @JsonSetter("beneficiary_id")
        public Builder beneficiaryId(Optional<String> beneficiaryId) {
            this.beneficiaryId = beneficiaryId;
            return this;
        }

        /**
         * Sets value for `beneficiaryId`
         * Beneficiary UUID. Required if "related_entity_type" is "payment".
         */
        public Builder beneficiaryId(String beneficiaryId) {
            return this.beneficiaryId(Optional.ofNullable(beneficiaryId));
        }
        /**
         * Sets value for `completedAtFrom`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
         */
        @JsonSetter("completed_at_from")
        public Builder completedAtFrom(Optional<String> completedAtFrom) {
            this.completedAtFrom = completedAtFrom;
            return this;
        }

        /**
         * Sets value for `completedAtFrom`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
         */
        public Builder completedAtFrom(String completedAtFrom) {
            return this.completedAtFrom(Optional.ofNullable(completedAtFrom));
        }
        /**
         * Sets value for `completedAtTo`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
         */
        @JsonSetter("completed_at_to")
        public Builder completedAtTo(Optional<String> completedAtTo) {
            this.completedAtTo = completedAtTo;
            return this;
        }

        /**
         * Sets value for `completedAtTo`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
         */
        public Builder completedAtTo(String completedAtTo) {
            return this.completedAtTo(Optional.ofNullable(completedAtTo));
        }
        /**
         * Sets value for `createdAtFrom`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
         */
        @JsonSetter("created_at_from")
        public Builder createdAtFrom(Optional<String> createdAtFrom) {
            this.createdAtFrom = createdAtFrom;
            return this;
        }

        /**
         * Sets value for `createdAtFrom`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
         */
        public Builder createdAtFrom(String createdAtFrom) {
            return this.createdAtFrom(Optional.ofNullable(createdAtFrom));
        }
        /**
         * Sets value for `createdAtTo`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
         */
        @JsonSetter("created_at_to")
        public Builder createdAtTo(Optional<String> createdAtTo) {
            this.createdAtTo = createdAtTo;
            return this;
        }

        /**
         * Sets value for `createdAtTo`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
         */
        public Builder createdAtTo(String createdAtTo) {
            return this.createdAtTo(Optional.ofNullable(createdAtTo));
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
         * Sets value for `currencyPair`
         * Concatenated string of the two currencies traded, e.g. "USDEUR". Required if "related_entity_type" is "conversion".
         */
        @JsonSetter("currency_pair")
        public Builder currencyPair(Optional<String> currencyPair) {
            this.currencyPair = currencyPair;
            return this;
        }

        /**
         * Sets value for `currencyPair`
         * Concatenated string of the two currencies traded, e.g. "USDEUR". Required if "related_entity_type" is "conversion".
         */
        public Builder currencyPair(String currencyPair) {
            return this.currencyPair(Optional.ofNullable(currencyPair));
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
         * The field to sort by. Defaults to 'created_at' if not specified.<br><br> Please note that if you choose to order by 'completed_at', it's important to populate the query parameter 'status' with the value 'completed' in order to ensure that transactions are sequenced in the order they were processed. Without this, transactions that completed within the same second may not be ordered correctly.
         */
        @JsonSetter("order")
        public Builder order(Optional<String> order) {
            this.order = order;
            return this;
        }

        /**
         * Sets value for `order`
         * The field to sort by. Defaults to 'created_at' if not specified.<br><br> Please note that if you choose to order by 'completed_at', it's important to populate the query parameter 'status' with the value 'completed' in order to ensure that transactions are sequenced in the order they were processed. Without this, transactions that completed within the same second may not be ordered correctly.
         */
        public Builder order(String order) {
            return this.order(Optional.ofNullable(order));
        }
        /**
         * Sets value for `orderAscDesc`
         * Sort results in ascending or descending order.
         */
        @JsonSetter("order_asc_desc")
        public Builder orderAscDesc(Optional<TransactionsFindOrderAscDescEnum> orderAscDesc) {
            this.orderAscDesc = orderAscDesc;
            return this;
        }

        /**
         * Sets value for `orderAscDesc`
         * Sort results in ascending or descending order.
         */
        public Builder orderAscDesc(TransactionsFindOrderAscDescEnum orderAscDesc) {
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
         * Sets value for `relatedEntityId`
         * UUID of the related entity.
         */
        @JsonSetter("related_entity_id")
        public Builder relatedEntityId(Optional<String> relatedEntityId) {
            this.relatedEntityId = relatedEntityId;
            return this;
        }

        /**
         * Sets value for `relatedEntityId`
         * UUID of the related entity.
         */
        public Builder relatedEntityId(String relatedEntityId) {
            return this.relatedEntityId(Optional.ofNullable(relatedEntityId));
        }
        /**
         * Sets value for `relatedEntityShortReference`
         * Short reference code.
         */
        @JsonSetter("related_entity_short_reference")
        public Builder relatedEntityShortReference(Optional<String> relatedEntityShortReference) {
            this.relatedEntityShortReference = relatedEntityShortReference;
            return this;
        }

        /**
         * Sets value for `relatedEntityShortReference`
         * Short reference code.
         */
        public Builder relatedEntityShortReference(String relatedEntityShortReference) {
            return this.relatedEntityShortReference(Optional.ofNullable(relatedEntityShortReference));
        }
        /**
         * Sets value for `relatedEntityType`
         * The related entity that created the transaction.<br> For information, the related_entity_type for margin transactions is <b>'margin_transaction'</b>. While it isn't possible to search directly by this value, margin transactions can be filtered using the ‘action’ field and may be included in the response.
         */
        @JsonSetter("related_entity_type")
        public Builder relatedEntityType(Optional<TransactionsFindRelatedEntityTypeEnum>
                                         relatedEntityType) {
            this.relatedEntityType = relatedEntityType;
            return this;
        }

        /**
         * Sets value for `relatedEntityType`
         * The related entity that created the transaction.<br> For information, the related_entity_type for margin transactions is <b>'margin_transaction'</b>. While it isn't possible to search directly by this value, margin transactions can be filtered using the ‘action’ field and may be included in the response.
         */
        public Builder relatedEntityType(TransactionsFindRelatedEntityTypeEnum relatedEntityType) {
            return this.relatedEntityType(Optional.ofNullable(relatedEntityType));
        }
        /**
         * Sets value for `scope`
         * "Own" account, "clients" sub-accounts, or "all" accounts.
         */
        @JsonSetter("scope")
        public Builder scope(Optional<TransactionsFindScopeEnum> scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Sets value for `scope`
         * "Own" account, "clients" sub-accounts, or "all" accounts.
         */
        public Builder scope(TransactionsFindScopeEnum scope) {
            return this.scope(Optional.ofNullable(scope));
        }
        /**
         * Sets value for `settlesAtFrom`
         * Earliest processing date. Any valid ISO 8601 format, e.g. "e.g. "2023-12-31T23:59:59Z".
         */
        @JsonSetter("settles_at_from")
        public Builder settlesAtFrom(Optional<String> settlesAtFrom) {
            this.settlesAtFrom = settlesAtFrom;
            return this;
        }

        /**
         * Sets value for `settlesAtFrom`
         * Earliest processing date. Any valid ISO 8601 format, e.g. "e.g. "2023-12-31T23:59:59Z".
         */
        public Builder settlesAtFrom(String settlesAtFrom) {
            return this.settlesAtFrom(Optional.ofNullable(settlesAtFrom));
        }
        /**
         * Sets value for `settlesAtTo`
         * Latest processing date. Any valid ISO 8601 format, e.g. "e.g. "2023-12-31T23:59:59Z".
         */
        @JsonSetter("settles_at_to")
        public Builder settlesAtTo(Optional<String> settlesAtTo) {
            this.settlesAtTo = settlesAtTo;
            return this;
        }

        /**
         * Sets value for `settlesAtTo`
         * Latest processing date. Any valid ISO 8601 format, e.g. "e.g. "2023-12-31T23:59:59Z".
         */
        public Builder settlesAtTo(String settlesAtTo) {
            return this.settlesAtTo(Optional.ofNullable(settlesAtTo));
        }
        /**
         * Sets value for `status`
         * Transaction status.
         */
        @JsonSetter("status")
        public Builder status(Optional<TransactionsFindStatusEnum> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets value for `status`
         * Transaction status.
         */
        public Builder status(TransactionsFindStatusEnum status) {
            return this.status(Optional.ofNullable(status));
        }
        /**
         * Sets value for `type`
         * Whether the transaction debits or credits the account balance.
         */
        @JsonSetter("type")
        public Builder type(Optional<TransactionsFindTypeEnum> type) {
            this.type = type;
            return this;
        }

        /**
         * Sets value for `type`
         * Whether the transaction debits or credits the account balance.
         */
        public Builder type(TransactionsFindTypeEnum type) {
            return this.type(Optional.ofNullable(type));
        }
        /**
         * Sets value for `updatedAtFrom`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
         */
        @JsonSetter("updated_at_from")
        public Builder updatedAtFrom(Optional<String> updatedAtFrom) {
            this.updatedAtFrom = updatedAtFrom;
            return this;
        }

        /**
         * Sets value for `updatedAtFrom`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
         */
        public Builder updatedAtFrom(String updatedAtFrom) {
            return this.updatedAtFrom(Optional.ofNullable(updatedAtFrom));
        }
        /**
         * Sets value for `updatedAtTo`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
         */
        @JsonSetter("updated_at_to")
        public Builder updatedAtTo(Optional<String> updatedAtTo) {
            this.updatedAtTo = updatedAtTo;
            return this;
        }

        /**
         * Sets value for `updatedAtTo`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z".
         */
        public Builder updatedAtTo(String updatedAtTo) {
            return this.updatedAtTo(Optional.ofNullable(updatedAtTo));
        }



        public FindRequest build() {
            return new FindRequest(this);
        }
    }

}



