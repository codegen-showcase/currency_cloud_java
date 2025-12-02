
package com.currencycloud.sdk.resources.funding.params;

import java.util.Objects;
import java.util.Optional;

import com.currencycloud.sdk.model.FundingFindAccountsOrderAscDescEnum;
import com.currencycloud.sdk.model.FundingFindAccountsPaymentTypeEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * FindAccountsRequest
 */
@JsonDeserialize(builder = FindAccountsRequest.Builder.class)
public final class FindAccountsRequest {
    /**
     * The currency of the account details required, ISO 4217 standard.
     */
    private final String currency;

    /**
     * UUID of a specific sub-account you want to see the SSIs for.
     */
    private final Optional<String> accountId;

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
    private final Optional<FundingFindAccountsOrderAscDescEnum> orderAscDesc;

    /**
     * Page number
     */
    private final Optional<Long> page;

    /**
     * The type of SSI to be returned, priority (Swift) or regular (local). A null value returns all payment types.
     */
    private final Optional<FundingFindAccountsPaymentTypeEnum> paymentType;

    /**
     * Number of results per page.
     */
    private final Optional<Long> perPage;


    private FindAccountsRequest(Builder builder) {
        this.currency = builder.currency;
        this.accountId = builder.accountId;
        this.onBehalfOf = builder.onBehalfOf;
        this.order = builder.order;
        this.orderAscDesc = builder.orderAscDesc;
        this.page = builder.page;
        this.paymentType = builder.paymentType;
        this.perPage = builder.perPage;
    }

    /**
     * Retrieves value for `currency`
     * The currency of the account details required, ISO 4217 standard.
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `accountId`
     * UUID of a specific sub-account you want to see the SSIs for.
     */
    @JsonProperty("account_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAccountId() {
        return accountId;
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
    public Optional<FundingFindAccountsOrderAscDescEnum> getOrderAscDesc() {
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
     * Retrieves value for `paymentType`
     * The type of SSI to be returned, priority (Swift) or regular (local). A null value returns all payment types.
     */
    @JsonProperty("payment_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<FundingFindAccountsPaymentTypeEnum> getPaymentType() {
        return paymentType;
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

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof FindAccountsRequest && equalTo((FindAccountsRequest) other);
    }

    private boolean equalTo(FindAccountsRequest other) {
        return
            currency.equals(other.currency) &&

            accountId.equals(other.accountId) &&

            onBehalfOf.equals(other.onBehalfOf) &&

            order.equals(other.order) &&

            orderAscDesc.equals(other.orderAscDesc) &&

            page.equals(other.page) &&

            paymentType.equals(other.paymentType) &&

            perPage.equals(other.perPage)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.currency,
                   this.accountId,
                   this.onBehalfOf,
                   this.order,
                   this.orderAscDesc,
                   this.page,
                   this.paymentType,
                   this.perPage
               );
    }

    @Override
    public String toString() {
        return "FindAccountsRequest{" +
               "currency=" + currency + ", " +
               "accountId=" + accountId + ", " +
               "onBehalfOf=" + onBehalfOf + ", " +
               "order=" + order + ", " +
               "orderAscDesc=" + orderAscDesc + ", " +
               "page=" + page + ", " +
               "paymentType=" + paymentType + ", " +
               "perPage=" + perPage +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The currency of the account details required, ISO 4217 standard.
         */
        private String currency = null;

        /**
         * UUID of a specific sub-account you want to see the SSIs for.
         */
        private Optional<String> accountId = Optional.empty();

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
        private Optional<FundingFindAccountsOrderAscDescEnum> orderAscDesc = Optional.empty();

        /**
         * Page number
         */
        private Optional<Long> page = Optional.empty();

        /**
         * The type of SSI to be returned, priority (Swift) or regular (local). A null value returns all payment types.
         */
        private Optional<FundingFindAccountsPaymentTypeEnum> paymentType = Optional.empty();

        /**
         * Number of results per page.
         */
        private Optional<Long> perPage = Optional.empty();


        private Builder() {}

        public Builder from(FindAccountsRequest other) {
            currency(other.getCurrency());
            accountId(other.getAccountId());
            onBehalfOf(other.getOnBehalfOf());
            order(other.getOrder());
            orderAscDesc(other.getOrderAscDesc());
            page(other.getPage());
            paymentType(other.getPaymentType());
            perPage(other.getPerPage());
            return this;
        }

        /**
         * Sets value for `currency`
         * The currency of the account details required, ISO 4217 standard.
         */
        @JsonSetter("currency")
        public Builder currency(String currency) {
            if (currency == null) {
                throw new IllegalArgumentException("currency cannot be null");
            }

            this.currency = currency;
            return this;
        }
        /**
         * Sets value for `accountId`
         * UUID of a specific sub-account you want to see the SSIs for.
         */
        @JsonSetter("account_id")
        public Builder accountId(Optional<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Sets value for `accountId`
         * UUID of a specific sub-account you want to see the SSIs for.
         */
        public Builder accountId(String accountId) {
            return this.accountId(Optional.ofNullable(accountId));
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
        public Builder orderAscDesc(Optional<FundingFindAccountsOrderAscDescEnum> orderAscDesc) {
            this.orderAscDesc = orderAscDesc;
            return this;
        }

        /**
         * Sets value for `orderAscDesc`
         * Sort records in ascending or descending order.
         */
        public Builder orderAscDesc(FundingFindAccountsOrderAscDescEnum orderAscDesc) {
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
         * Sets value for `paymentType`
         * The type of SSI to be returned, priority (Swift) or regular (local). A null value returns all payment types.
         */
        @JsonSetter("payment_type")
        public Builder paymentType(Optional<FundingFindAccountsPaymentTypeEnum> paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Sets value for `paymentType`
         * The type of SSI to be returned, priority (Swift) or regular (local). A null value returns all payment types.
         */
        public Builder paymentType(FundingFindAccountsPaymentTypeEnum paymentType) {
            return this.paymentType(Optional.ofNullable(paymentType));
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



        public FindAccountsRequest build() {
            if (currency == null) {
                throw new IllegalStateException("currency is required");
            }

            return new FindAccountsRequest(this);
        }
    }

}



