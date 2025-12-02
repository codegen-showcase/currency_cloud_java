
package com.currencycloud.sdk.resources.balances.params;

import java.util.Objects;
import java.util.Optional;

import com.currencycloud.sdk.model.BalancesFindOrderAscDescEnum;
import com.currencycloud.sdk.model.BalancesFindOrderEnum;
import com.currencycloud.sdk.model.BalancesFindScopeEnum;
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
     * Minimum balance amount.
     */
    private final Optional<Double> amountFrom;

    /**
     * Maximum balance amount.
     */
    private final Optional<Double> amountTo;

    /**
     * A valid ISO 8601 format, e.g. "2019-12-31T23:59:59".
     */
    private final Optional<String> asAtDate;

    /**
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    private final Optional<String> onBehalfOf;

    /**
     * A field name to change the sort order - "created_at", "amount", "updated_at" or "currency".
     */
    private final Optional<BalancesFindOrderEnum> order;

    /**
     * Sort records in ascending or descending order.
     */
    private final Optional<BalancesFindOrderAscDescEnum> orderAscDesc;

    /**
     * Page number
     */
    private final Optional<Long> page;

    /**
     * Number of results per page.
     */
    private final Optional<Long> perPage;

    /**
     * "Own" account, "clients" sub-accounts, or "all" accounts.
     */
    private final Optional<BalancesFindScopeEnum> scope;


    private FindRequest(Builder builder) {
        this.amountFrom = builder.amountFrom;
        this.amountTo = builder.amountTo;
        this.asAtDate = builder.asAtDate;
        this.onBehalfOf = builder.onBehalfOf;
        this.order = builder.order;
        this.orderAscDesc = builder.orderAscDesc;
        this.page = builder.page;
        this.perPage = builder.perPage;
        this.scope = builder.scope;
    }

    /**
     * Retrieves value for `amountFrom`
     * Minimum balance amount.
     */
    @JsonProperty("amount_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Double> getAmountFrom() {
        return amountFrom;
    }
    /**
     * Retrieves value for `amountTo`
     * Maximum balance amount.
     */
    @JsonProperty("amount_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Double> getAmountTo() {
        return amountTo;
    }
    /**
     * Retrieves value for `asAtDate`
     * A valid ISO 8601 format, e.g. "2019-12-31T23:59:59".
     */
    @JsonProperty("as_at_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAsAtDate() {
        return asAtDate;
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
     * A field name to change the sort order - "created_at", "amount", "updated_at" or "currency".
     */
    @JsonProperty("order")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<BalancesFindOrderEnum> getOrder() {
        return order;
    }
    /**
     * Retrieves value for `orderAscDesc`
     * Sort records in ascending or descending order.
     */
    @JsonProperty("order_asc_desc")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<BalancesFindOrderAscDescEnum> getOrderAscDesc() {
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
     * Retrieves value for `scope`
     * "Own" account, "clients" sub-accounts, or "all" accounts.
     */
    @JsonProperty("scope")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<BalancesFindScopeEnum> getScope() {
        return scope;
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

            asAtDate.equals(other.asAtDate) &&

            onBehalfOf.equals(other.onBehalfOf) &&

            order.equals(other.order) &&

            orderAscDesc.equals(other.orderAscDesc) &&

            page.equals(other.page) &&

            perPage.equals(other.perPage) &&

            scope.equals(other.scope)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.amountFrom,
                   this.amountTo,
                   this.asAtDate,
                   this.onBehalfOf,
                   this.order,
                   this.orderAscDesc,
                   this.page,
                   this.perPage,
                   this.scope
               );
    }

    @Override
    public String toString() {
        return "FindRequest{" +
               "amountFrom=" + amountFrom + ", " +
               "amountTo=" + amountTo + ", " +
               "asAtDate=" + asAtDate + ", " +
               "onBehalfOf=" + onBehalfOf + ", " +
               "order=" + order + ", " +
               "orderAscDesc=" + orderAscDesc + ", " +
               "page=" + page + ", " +
               "perPage=" + perPage + ", " +
               "scope=" + scope +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Minimum balance amount.
         */
        private Optional<Double> amountFrom = Optional.empty();

        /**
         * Maximum balance amount.
         */
        private Optional<Double> amountTo = Optional.empty();

        /**
         * A valid ISO 8601 format, e.g. "2019-12-31T23:59:59".
         */
        private Optional<String> asAtDate = Optional.empty();

        /**
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        private Optional<String> onBehalfOf = Optional.empty();

        /**
         * A field name to change the sort order - "created_at", "amount", "updated_at" or "currency".
         */
        private Optional<BalancesFindOrderEnum> order = Optional.empty();

        /**
         * Sort records in ascending or descending order.
         */
        private Optional<BalancesFindOrderAscDescEnum> orderAscDesc = Optional.empty();

        /**
         * Page number
         */
        private Optional<Long> page = Optional.empty();

        /**
         * Number of results per page.
         */
        private Optional<Long> perPage = Optional.empty();

        /**
         * "Own" account, "clients" sub-accounts, or "all" accounts.
         */
        private Optional<BalancesFindScopeEnum> scope = Optional.empty();


        private Builder() {}

        public Builder from(FindRequest other) {
            amountFrom(other.getAmountFrom());
            amountTo(other.getAmountTo());
            asAtDate(other.getAsAtDate());
            onBehalfOf(other.getOnBehalfOf());
            order(other.getOrder());
            orderAscDesc(other.getOrderAscDesc());
            page(other.getPage());
            perPage(other.getPerPage());
            scope(other.getScope());
            return this;
        }

        /**
         * Sets value for `amountFrom`
         * Minimum balance amount.
         */
        @JsonSetter("amount_from")
        public Builder amountFrom(Optional<Double> amountFrom) {
            this.amountFrom = amountFrom;
            return this;
        }

        /**
         * Sets value for `amountFrom`
         * Minimum balance amount.
         */
        public Builder amountFrom(Double amountFrom) {
            return this.amountFrom(Optional.ofNullable(amountFrom));
        }
        /**
         * Sets value for `amountTo`
         * Maximum balance amount.
         */
        @JsonSetter("amount_to")
        public Builder amountTo(Optional<Double> amountTo) {
            this.amountTo = amountTo;
            return this;
        }

        /**
         * Sets value for `amountTo`
         * Maximum balance amount.
         */
        public Builder amountTo(Double amountTo) {
            return this.amountTo(Optional.ofNullable(amountTo));
        }
        /**
         * Sets value for `asAtDate`
         * A valid ISO 8601 format, e.g. "2019-12-31T23:59:59".
         */
        @JsonSetter("as_at_date")
        public Builder asAtDate(Optional<String> asAtDate) {
            this.asAtDate = asAtDate;
            return this;
        }

        /**
         * Sets value for `asAtDate`
         * A valid ISO 8601 format, e.g. "2019-12-31T23:59:59".
         */
        public Builder asAtDate(String asAtDate) {
            return this.asAtDate(Optional.ofNullable(asAtDate));
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
         * A field name to change the sort order - "created_at", "amount", "updated_at" or "currency".
         */
        @JsonSetter("order")
        public Builder order(Optional<BalancesFindOrderEnum> order) {
            this.order = order;
            return this;
        }

        /**
         * Sets value for `order`
         * A field name to change the sort order - "created_at", "amount", "updated_at" or "currency".
         */
        public Builder order(BalancesFindOrderEnum order) {
            return this.order(Optional.ofNullable(order));
        }
        /**
         * Sets value for `orderAscDesc`
         * Sort records in ascending or descending order.
         */
        @JsonSetter("order_asc_desc")
        public Builder orderAscDesc(Optional<BalancesFindOrderAscDescEnum> orderAscDesc) {
            this.orderAscDesc = orderAscDesc;
            return this;
        }

        /**
         * Sets value for `orderAscDesc`
         * Sort records in ascending or descending order.
         */
        public Builder orderAscDesc(BalancesFindOrderAscDescEnum orderAscDesc) {
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
         * Sets value for `scope`
         * "Own" account, "clients" sub-accounts, or "all" accounts.
         */
        @JsonSetter("scope")
        public Builder scope(Optional<BalancesFindScopeEnum> scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Sets value for `scope`
         * "Own" account, "clients" sub-accounts, or "all" accounts.
         */
        public Builder scope(BalancesFindScopeEnum scope) {
            return this.scope(Optional.ofNullable(scope));
        }



        public FindRequest build() {
            return new FindRequest(this);
        }
    }

}



