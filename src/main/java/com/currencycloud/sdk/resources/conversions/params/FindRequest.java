
package com.currencycloud.sdk.resources.conversions.params;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.currencycloud.sdk.model.ConversionsFindOrderAscDescEnum;
import com.currencycloud.sdk.model.ConversionsFindScopeEnum;
import com.currencycloud.sdk.model.ConversionsFindStatusEnum;
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
     * Minimum buy amount.
     */
    private final Optional<String> buyAmountFrom;

    /**
     * Maximum buy amount.
     */
    private final Optional<String> buyAmountTo;

    /**
     * The currency purchased- three character ISO code.
     */
    private final Optional<String> buyCurrency;

    /**
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    private final Optional<String> conversionDateFrom;

    /**
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    private final Optional<String> conversionDateTo;

    /**
     * One or more conversion UUIDs to filter out of results.
     */
    private final Optional<List<String>> conversionIds;

    /**
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    private final Optional<String> createdAtFrom;

    /**
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    private final Optional<String> createdAtTo;

    /**
     * Concatenated string of the two currencies traded, e.g. "USDEUR".
     */
    private final Optional<String> currencyPair;

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
    private final Optional<ConversionsFindOrderAscDescEnum> orderAscDesc;

    /**
     * Page number.
     */
    private final Optional<Long> page;

    /**
     * Minimum buy amount (sub-accounts).
     */
    private final Optional<String> partnerBuyAmountFrom;

    /**
     * Maximum buy amount (sub-accounts).
     */
    private final Optional<String> partnerBuyAmountTo;

    /**
     * Minimum sell amount (sub-accounts).
     */
    private final Optional<String> partnerSellAmountFrom;

    /**
     * Maximum sell amount (sub-accounts).
     */
    private final Optional<String> partnerSellAmountTo;

    /**
     * Number of results per page.
     */
    private final Optional<Long> perPage;

    /**
     * "Own" account, "clients" sub-accounts, or "all" accounts.
     */
    private final Optional<ConversionsFindScopeEnum> scope;

    /**
     * Minimum sell amount.
     */
    private final Optional<String> sellAmountFrom;

    /**
     * Maximum sell amount.
     */
    private final Optional<String> sellAmountTo;

    /**
     * The currency sold - three character ISO code.
     */
    private final Optional<String> sellCurrency;

    /**
     * Earliest date when sold currency debited. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    private final Optional<String> settlementDateFrom;

    /**
     * Latest date when sold currency debited. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    private final Optional<String> settlementDateTo;

    /**
     * Short reference code.
     */
    private final Optional<String> shortReference;

    /**
     * Conversion status.
     */
    private final Optional<ConversionsFindStatusEnum> status;

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


    private FindRequest(Builder builder) {
        this.buyAmountFrom = builder.buyAmountFrom;
        this.buyAmountTo = builder.buyAmountTo;
        this.buyCurrency = builder.buyCurrency;
        this.conversionDateFrom = builder.conversionDateFrom;
        this.conversionDateTo = builder.conversionDateTo;
        this.conversionIds = builder.conversionIds;
        this.createdAtFrom = builder.createdAtFrom;
        this.createdAtTo = builder.createdAtTo;
        this.currencyPair = builder.currencyPair;
        this.onBehalfOf = builder.onBehalfOf;
        this.order = builder.order;
        this.orderAscDesc = builder.orderAscDesc;
        this.page = builder.page;
        this.partnerBuyAmountFrom = builder.partnerBuyAmountFrom;
        this.partnerBuyAmountTo = builder.partnerBuyAmountTo;
        this.partnerSellAmountFrom = builder.partnerSellAmountFrom;
        this.partnerSellAmountTo = builder.partnerSellAmountTo;
        this.perPage = builder.perPage;
        this.scope = builder.scope;
        this.sellAmountFrom = builder.sellAmountFrom;
        this.sellAmountTo = builder.sellAmountTo;
        this.sellCurrency = builder.sellCurrency;
        this.settlementDateFrom = builder.settlementDateFrom;
        this.settlementDateTo = builder.settlementDateTo;
        this.shortReference = builder.shortReference;
        this.status = builder.status;
        this.uniqueRequestId = builder.uniqueRequestId;
        this.updatedAtFrom = builder.updatedAtFrom;
        this.updatedAtTo = builder.updatedAtTo;
    }

    /**
     * Retrieves value for `buyAmountFrom`
     * Minimum buy amount.
     */
    @JsonProperty("buy_amount_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBuyAmountFrom() {
        return buyAmountFrom;
    }
    /**
     * Retrieves value for `buyAmountTo`
     * Maximum buy amount.
     */
    @JsonProperty("buy_amount_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBuyAmountTo() {
        return buyAmountTo;
    }
    /**
     * Retrieves value for `buyCurrency`
     * The currency purchased- three character ISO code.
     */
    @JsonProperty("buy_currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBuyCurrency() {
        return buyCurrency;
    }
    /**
     * Retrieves value for `conversionDateFrom`
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    @JsonProperty("conversion_date_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getConversionDateFrom() {
        return conversionDateFrom;
    }
    /**
     * Retrieves value for `conversionDateTo`
     * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    @JsonProperty("conversion_date_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getConversionDateTo() {
        return conversionDateTo;
    }
    /**
     * Retrieves value for `conversionIds`
     * One or more conversion UUIDs to filter out of results.
     */
    @JsonProperty("conversion_ids[]")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<String>> getConversionIds() {
        return conversionIds;
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
     * Retrieves value for `currencyPair`
     * Concatenated string of the two currencies traded, e.g. "USDEUR".
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
    public Optional<ConversionsFindOrderAscDescEnum> getOrderAscDesc() {
        return orderAscDesc;
    }
    /**
     * Retrieves value for `page`
     * Page number.
     */
    @JsonProperty("page")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Long> getPage() {
        return page;
    }
    /**
     * Retrieves value for `partnerBuyAmountFrom`
     * Minimum buy amount (sub-accounts).
     */
    @JsonProperty("partner_buy_amount_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPartnerBuyAmountFrom() {
        return partnerBuyAmountFrom;
    }
    /**
     * Retrieves value for `partnerBuyAmountTo`
     * Maximum buy amount (sub-accounts).
     */
    @JsonProperty("partner_buy_amount_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPartnerBuyAmountTo() {
        return partnerBuyAmountTo;
    }
    /**
     * Retrieves value for `partnerSellAmountFrom`
     * Minimum sell amount (sub-accounts).
     */
    @JsonProperty("partner_sell_amount_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPartnerSellAmountFrom() {
        return partnerSellAmountFrom;
    }
    /**
     * Retrieves value for `partnerSellAmountTo`
     * Maximum sell amount (sub-accounts).
     */
    @JsonProperty("partner_sell_amount_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPartnerSellAmountTo() {
        return partnerSellAmountTo;
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
    public Optional<ConversionsFindScopeEnum> getScope() {
        return scope;
    }
    /**
     * Retrieves value for `sellAmountFrom`
     * Minimum sell amount.
     */
    @JsonProperty("sell_amount_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSellAmountFrom() {
        return sellAmountFrom;
    }
    /**
     * Retrieves value for `sellAmountTo`
     * Maximum sell amount.
     */
    @JsonProperty("sell_amount_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSellAmountTo() {
        return sellAmountTo;
    }
    /**
     * Retrieves value for `sellCurrency`
     * The currency sold - three character ISO code.
     */
    @JsonProperty("sell_currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSellCurrency() {
        return sellCurrency;
    }
    /**
     * Retrieves value for `settlementDateFrom`
     * Earliest date when sold currency debited. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    @JsonProperty("settlement_date_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSettlementDateFrom() {
        return settlementDateFrom;
    }
    /**
     * Retrieves value for `settlementDateTo`
     * Latest date when sold currency debited. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
     */
    @JsonProperty("settlement_date_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSettlementDateTo() {
        return settlementDateTo;
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
     * Conversion status.
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ConversionsFindStatusEnum> getStatus() {
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

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof FindRequest && equalTo((FindRequest) other);
    }

    private boolean equalTo(FindRequest other) {
        return
            buyAmountFrom.equals(other.buyAmountFrom) &&

            buyAmountTo.equals(other.buyAmountTo) &&

            buyCurrency.equals(other.buyCurrency) &&

            conversionDateFrom.equals(other.conversionDateFrom) &&

            conversionDateTo.equals(other.conversionDateTo) &&

            conversionIds.equals(other.conversionIds) &&

            createdAtFrom.equals(other.createdAtFrom) &&

            createdAtTo.equals(other.createdAtTo) &&

            currencyPair.equals(other.currencyPair) &&

            onBehalfOf.equals(other.onBehalfOf) &&

            order.equals(other.order) &&

            orderAscDesc.equals(other.orderAscDesc) &&

            page.equals(other.page) &&

            partnerBuyAmountFrom.equals(other.partnerBuyAmountFrom) &&

            partnerBuyAmountTo.equals(other.partnerBuyAmountTo) &&

            partnerSellAmountFrom.equals(other.partnerSellAmountFrom) &&

            partnerSellAmountTo.equals(other.partnerSellAmountTo) &&

            perPage.equals(other.perPage) &&

            scope.equals(other.scope) &&

            sellAmountFrom.equals(other.sellAmountFrom) &&

            sellAmountTo.equals(other.sellAmountTo) &&

            sellCurrency.equals(other.sellCurrency) &&

            settlementDateFrom.equals(other.settlementDateFrom) &&

            settlementDateTo.equals(other.settlementDateTo) &&

            shortReference.equals(other.shortReference) &&

            status.equals(other.status) &&

            uniqueRequestId.equals(other.uniqueRequestId) &&

            updatedAtFrom.equals(other.updatedAtFrom) &&

            updatedAtTo.equals(other.updatedAtTo)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.buyAmountFrom,
                   this.buyAmountTo,
                   this.buyCurrency,
                   this.conversionDateFrom,
                   this.conversionDateTo,
                   this.conversionIds,
                   this.createdAtFrom,
                   this.createdAtTo,
                   this.currencyPair,
                   this.onBehalfOf,
                   this.order,
                   this.orderAscDesc,
                   this.page,
                   this.partnerBuyAmountFrom,
                   this.partnerBuyAmountTo,
                   this.partnerSellAmountFrom,
                   this.partnerSellAmountTo,
                   this.perPage,
                   this.scope,
                   this.sellAmountFrom,
                   this.sellAmountTo,
                   this.sellCurrency,
                   this.settlementDateFrom,
                   this.settlementDateTo,
                   this.shortReference,
                   this.status,
                   this.uniqueRequestId,
                   this.updatedAtFrom,
                   this.updatedAtTo
               );
    }

    @Override
    public String toString() {
        return "FindRequest{" +
               "buyAmountFrom=" + buyAmountFrom + ", " +
               "buyAmountTo=" + buyAmountTo + ", " +
               "buyCurrency=" + buyCurrency + ", " +
               "conversionDateFrom=" + conversionDateFrom + ", " +
               "conversionDateTo=" + conversionDateTo + ", " +
               "conversionIds=" + conversionIds + ", " +
               "createdAtFrom=" + createdAtFrom + ", " +
               "createdAtTo=" + createdAtTo + ", " +
               "currencyPair=" + currencyPair + ", " +
               "onBehalfOf=" + onBehalfOf + ", " +
               "order=" + order + ", " +
               "orderAscDesc=" + orderAscDesc + ", " +
               "page=" + page + ", " +
               "partnerBuyAmountFrom=" + partnerBuyAmountFrom + ", " +
               "partnerBuyAmountTo=" + partnerBuyAmountTo + ", " +
               "partnerSellAmountFrom=" + partnerSellAmountFrom + ", " +
               "partnerSellAmountTo=" + partnerSellAmountTo + ", " +
               "perPage=" + perPage + ", " +
               "scope=" + scope + ", " +
               "sellAmountFrom=" + sellAmountFrom + ", " +
               "sellAmountTo=" + sellAmountTo + ", " +
               "sellCurrency=" + sellCurrency + ", " +
               "settlementDateFrom=" + settlementDateFrom + ", " +
               "settlementDateTo=" + settlementDateTo + ", " +
               "shortReference=" + shortReference + ", " +
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
         * Minimum buy amount.
         */
        private Optional<String> buyAmountFrom = Optional.empty();

        /**
         * Maximum buy amount.
         */
        private Optional<String> buyAmountTo = Optional.empty();

        /**
         * The currency purchased- three character ISO code.
         */
        private Optional<String> buyCurrency = Optional.empty();

        /**
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        private Optional<String> conversionDateFrom = Optional.empty();

        /**
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        private Optional<String> conversionDateTo = Optional.empty();

        /**
         * One or more conversion UUIDs to filter out of results.
         */
        private Optional<List<String>> conversionIds = Optional.empty();

        /**
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        private Optional<String> createdAtFrom = Optional.empty();

        /**
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        private Optional<String> createdAtTo = Optional.empty();

        /**
         * Concatenated string of the two currencies traded, e.g. "USDEUR".
         */
        private Optional<String> currencyPair = Optional.empty();

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
        private Optional<ConversionsFindOrderAscDescEnum> orderAscDesc = Optional.empty();

        /**
         * Page number.
         */
        private Optional<Long> page = Optional.empty();

        /**
         * Minimum buy amount (sub-accounts).
         */
        private Optional<String> partnerBuyAmountFrom = Optional.empty();

        /**
         * Maximum buy amount (sub-accounts).
         */
        private Optional<String> partnerBuyAmountTo = Optional.empty();

        /**
         * Minimum sell amount (sub-accounts).
         */
        private Optional<String> partnerSellAmountFrom = Optional.empty();

        /**
         * Maximum sell amount (sub-accounts).
         */
        private Optional<String> partnerSellAmountTo = Optional.empty();

        /**
         * Number of results per page.
         */
        private Optional<Long> perPage = Optional.empty();

        /**
         * "Own" account, "clients" sub-accounts, or "all" accounts.
         */
        private Optional<ConversionsFindScopeEnum> scope = Optional.empty();

        /**
         * Minimum sell amount.
         */
        private Optional<String> sellAmountFrom = Optional.empty();

        /**
         * Maximum sell amount.
         */
        private Optional<String> sellAmountTo = Optional.empty();

        /**
         * The currency sold - three character ISO code.
         */
        private Optional<String> sellCurrency = Optional.empty();

        /**
         * Earliest date when sold currency debited. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        private Optional<String> settlementDateFrom = Optional.empty();

        /**
         * Latest date when sold currency debited. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        private Optional<String> settlementDateTo = Optional.empty();

        /**
         * Short reference code.
         */
        private Optional<String> shortReference = Optional.empty();

        /**
         * Conversion status.
         */
        private Optional<ConversionsFindStatusEnum> status = Optional.empty();

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


        private Builder() {}

        public Builder from(FindRequest other) {
            buyAmountFrom(other.getBuyAmountFrom());
            buyAmountTo(other.getBuyAmountTo());
            buyCurrency(other.getBuyCurrency());
            conversionDateFrom(other.getConversionDateFrom());
            conversionDateTo(other.getConversionDateTo());
            conversionIds(other.getConversionIds());
            createdAtFrom(other.getCreatedAtFrom());
            createdAtTo(other.getCreatedAtTo());
            currencyPair(other.getCurrencyPair());
            onBehalfOf(other.getOnBehalfOf());
            order(other.getOrder());
            orderAscDesc(other.getOrderAscDesc());
            page(other.getPage());
            partnerBuyAmountFrom(other.getPartnerBuyAmountFrom());
            partnerBuyAmountTo(other.getPartnerBuyAmountTo());
            partnerSellAmountFrom(other.getPartnerSellAmountFrom());
            partnerSellAmountTo(other.getPartnerSellAmountTo());
            perPage(other.getPerPage());
            scope(other.getScope());
            sellAmountFrom(other.getSellAmountFrom());
            sellAmountTo(other.getSellAmountTo());
            sellCurrency(other.getSellCurrency());
            settlementDateFrom(other.getSettlementDateFrom());
            settlementDateTo(other.getSettlementDateTo());
            shortReference(other.getShortReference());
            status(other.getStatus());
            uniqueRequestId(other.getUniqueRequestId());
            updatedAtFrom(other.getUpdatedAtFrom());
            updatedAtTo(other.getUpdatedAtTo());
            return this;
        }

        /**
         * Sets value for `buyAmountFrom`
         * Minimum buy amount.
         */
        @JsonSetter("buy_amount_from")
        public Builder buyAmountFrom(Optional<String> buyAmountFrom) {
            this.buyAmountFrom = buyAmountFrom;
            return this;
        }

        /**
         * Sets value for `buyAmountFrom`
         * Minimum buy amount.
         */
        public Builder buyAmountFrom(String buyAmountFrom) {
            return this.buyAmountFrom(Optional.ofNullable(buyAmountFrom));
        }
        /**
         * Sets value for `buyAmountTo`
         * Maximum buy amount.
         */
        @JsonSetter("buy_amount_to")
        public Builder buyAmountTo(Optional<String> buyAmountTo) {
            this.buyAmountTo = buyAmountTo;
            return this;
        }

        /**
         * Sets value for `buyAmountTo`
         * Maximum buy amount.
         */
        public Builder buyAmountTo(String buyAmountTo) {
            return this.buyAmountTo(Optional.ofNullable(buyAmountTo));
        }
        /**
         * Sets value for `buyCurrency`
         * The currency purchased- three character ISO code.
         */
        @JsonSetter("buy_currency")
        public Builder buyCurrency(Optional<String> buyCurrency) {
            this.buyCurrency = buyCurrency;
            return this;
        }

        /**
         * Sets value for `buyCurrency`
         * The currency purchased- three character ISO code.
         */
        public Builder buyCurrency(String buyCurrency) {
            return this.buyCurrency(Optional.ofNullable(buyCurrency));
        }
        /**
         * Sets value for `conversionDateFrom`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        @JsonSetter("conversion_date_from")
        public Builder conversionDateFrom(Optional<String> conversionDateFrom) {
            this.conversionDateFrom = conversionDateFrom;
            return this;
        }

        /**
         * Sets value for `conversionDateFrom`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        public Builder conversionDateFrom(String conversionDateFrom) {
            return this.conversionDateFrom(Optional.ofNullable(conversionDateFrom));
        }
        /**
         * Sets value for `conversionDateTo`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        @JsonSetter("conversion_date_to")
        public Builder conversionDateTo(Optional<String> conversionDateTo) {
            this.conversionDateTo = conversionDateTo;
            return this;
        }

        /**
         * Sets value for `conversionDateTo`
         * Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        public Builder conversionDateTo(String conversionDateTo) {
            return this.conversionDateTo(Optional.ofNullable(conversionDateTo));
        }
        /**
         * Sets value for `conversionIds`
         * One or more conversion UUIDs to filter out of results.
         */
        @JsonSetter("conversion_ids[]")
        public Builder conversionIds(Optional<List<String>> conversionIds) {
            this.conversionIds = conversionIds;
            return this;
        }

        /**
         * Sets value for `conversionIds`
         * One or more conversion UUIDs to filter out of results.
         */
        public Builder conversionIds(List<String> conversionIds) {
            return this.conversionIds(Optional.ofNullable(conversionIds));
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
         * Sets value for `currencyPair`
         * Concatenated string of the two currencies traded, e.g. "USDEUR".
         */
        @JsonSetter("currency_pair")
        public Builder currencyPair(Optional<String> currencyPair) {
            this.currencyPair = currencyPair;
            return this;
        }

        /**
         * Sets value for `currencyPair`
         * Concatenated string of the two currencies traded, e.g. "USDEUR".
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
        public Builder orderAscDesc(Optional<ConversionsFindOrderAscDescEnum> orderAscDesc) {
            this.orderAscDesc = orderAscDesc;
            return this;
        }

        /**
         * Sets value for `orderAscDesc`
         * Sort records in ascending or descending order.
         */
        public Builder orderAscDesc(ConversionsFindOrderAscDescEnum orderAscDesc) {
            return this.orderAscDesc(Optional.ofNullable(orderAscDesc));
        }
        /**
         * Sets value for `page`
         * Page number.
         */
        @JsonSetter("page")
        public Builder page(Optional<Long> page) {
            this.page = page;
            return this;
        }

        /**
         * Sets value for `page`
         * Page number.
         */
        public Builder page(Long page) {
            return this.page(Optional.ofNullable(page));
        }
        /**
         * Sets value for `partnerBuyAmountFrom`
         * Minimum buy amount (sub-accounts).
         */
        @JsonSetter("partner_buy_amount_from")
        public Builder partnerBuyAmountFrom(Optional<String> partnerBuyAmountFrom) {
            this.partnerBuyAmountFrom = partnerBuyAmountFrom;
            return this;
        }

        /**
         * Sets value for `partnerBuyAmountFrom`
         * Minimum buy amount (sub-accounts).
         */
        public Builder partnerBuyAmountFrom(String partnerBuyAmountFrom) {
            return this.partnerBuyAmountFrom(Optional.ofNullable(partnerBuyAmountFrom));
        }
        /**
         * Sets value for `partnerBuyAmountTo`
         * Maximum buy amount (sub-accounts).
         */
        @JsonSetter("partner_buy_amount_to")
        public Builder partnerBuyAmountTo(Optional<String> partnerBuyAmountTo) {
            this.partnerBuyAmountTo = partnerBuyAmountTo;
            return this;
        }

        /**
         * Sets value for `partnerBuyAmountTo`
         * Maximum buy amount (sub-accounts).
         */
        public Builder partnerBuyAmountTo(String partnerBuyAmountTo) {
            return this.partnerBuyAmountTo(Optional.ofNullable(partnerBuyAmountTo));
        }
        /**
         * Sets value for `partnerSellAmountFrom`
         * Minimum sell amount (sub-accounts).
         */
        @JsonSetter("partner_sell_amount_from")
        public Builder partnerSellAmountFrom(Optional<String> partnerSellAmountFrom) {
            this.partnerSellAmountFrom = partnerSellAmountFrom;
            return this;
        }

        /**
         * Sets value for `partnerSellAmountFrom`
         * Minimum sell amount (sub-accounts).
         */
        public Builder partnerSellAmountFrom(String partnerSellAmountFrom) {
            return this.partnerSellAmountFrom(Optional.ofNullable(partnerSellAmountFrom));
        }
        /**
         * Sets value for `partnerSellAmountTo`
         * Maximum sell amount (sub-accounts).
         */
        @JsonSetter("partner_sell_amount_to")
        public Builder partnerSellAmountTo(Optional<String> partnerSellAmountTo) {
            this.partnerSellAmountTo = partnerSellAmountTo;
            return this;
        }

        /**
         * Sets value for `partnerSellAmountTo`
         * Maximum sell amount (sub-accounts).
         */
        public Builder partnerSellAmountTo(String partnerSellAmountTo) {
            return this.partnerSellAmountTo(Optional.ofNullable(partnerSellAmountTo));
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
        public Builder scope(Optional<ConversionsFindScopeEnum> scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Sets value for `scope`
         * "Own" account, "clients" sub-accounts, or "all" accounts.
         */
        public Builder scope(ConversionsFindScopeEnum scope) {
            return this.scope(Optional.ofNullable(scope));
        }
        /**
         * Sets value for `sellAmountFrom`
         * Minimum sell amount.
         */
        @JsonSetter("sell_amount_from")
        public Builder sellAmountFrom(Optional<String> sellAmountFrom) {
            this.sellAmountFrom = sellAmountFrom;
            return this;
        }

        /**
         * Sets value for `sellAmountFrom`
         * Minimum sell amount.
         */
        public Builder sellAmountFrom(String sellAmountFrom) {
            return this.sellAmountFrom(Optional.ofNullable(sellAmountFrom));
        }
        /**
         * Sets value for `sellAmountTo`
         * Maximum sell amount.
         */
        @JsonSetter("sell_amount_to")
        public Builder sellAmountTo(Optional<String> sellAmountTo) {
            this.sellAmountTo = sellAmountTo;
            return this;
        }

        /**
         * Sets value for `sellAmountTo`
         * Maximum sell amount.
         */
        public Builder sellAmountTo(String sellAmountTo) {
            return this.sellAmountTo(Optional.ofNullable(sellAmountTo));
        }
        /**
         * Sets value for `sellCurrency`
         * The currency sold - three character ISO code.
         */
        @JsonSetter("sell_currency")
        public Builder sellCurrency(Optional<String> sellCurrency) {
            this.sellCurrency = sellCurrency;
            return this;
        }

        /**
         * Sets value for `sellCurrency`
         * The currency sold - three character ISO code.
         */
        public Builder sellCurrency(String sellCurrency) {
            return this.sellCurrency(Optional.ofNullable(sellCurrency));
        }
        /**
         * Sets value for `settlementDateFrom`
         * Earliest date when sold currency debited. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        @JsonSetter("settlement_date_from")
        public Builder settlementDateFrom(Optional<String> settlementDateFrom) {
            this.settlementDateFrom = settlementDateFrom;
            return this;
        }

        /**
         * Sets value for `settlementDateFrom`
         * Earliest date when sold currency debited. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        public Builder settlementDateFrom(String settlementDateFrom) {
            return this.settlementDateFrom(Optional.ofNullable(settlementDateFrom));
        }
        /**
         * Sets value for `settlementDateTo`
         * Latest date when sold currency debited. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        @JsonSetter("settlement_date_to")
        public Builder settlementDateTo(Optional<String> settlementDateTo) {
            this.settlementDateTo = settlementDateTo;
            return this;
        }

        /**
         * Sets value for `settlementDateTo`
         * Latest date when sold currency debited. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00".
         */
        public Builder settlementDateTo(String settlementDateTo) {
            return this.settlementDateTo(Optional.ofNullable(settlementDateTo));
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
         * Conversion status.
         */
        @JsonSetter("status")
        public Builder status(Optional<ConversionsFindStatusEnum> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets value for `status`
         * Conversion status.
         */
        public Builder status(ConversionsFindStatusEnum status) {
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



        public FindRequest build() {
            return new FindRequest(this);
        }
    }

}



