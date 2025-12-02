
package com.currencycloud.sdk.resources.conversions.params;

import java.util.Objects;
import java.util.Optional;

import com.currencycloud.sdk.model.ConversionsProfitAndLossOrderAscDescEnum;
import com.currencycloud.sdk.model.ConversionsProfitAndLossScopeEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * ProfitAndLossRequest
 */
@JsonDeserialize(builder = ProfitAndLossRequest.Builder.class)
public final class ProfitAndLossRequest {
    /**
     * UUID of the Account that the Conversion belongs to.
     */
    private final Optional<String> accountId;

    /**
     * Allows you to return profit and losses based on a minimum profit or loss amount.
     */
    private final Optional<String> amountFrom;

    /**
     * Allows you to return profit and losses based on a maximum profit or loss amount.
     */
    private final Optional<String> amountTo;

    /**
     * UUID of the Contact that performed the action.
     */
    private final Optional<String> contactId;

    /**
     * UUID of the conversion.
     */
    private final Optional<String> conversionId;

    /**
     * The currency of the profit and loss. ISO 4217 standard.
     */
    private final Optional<String> currency;

    /**
     * Allows you to return profit and losses that will be made from on or after a defined date/time. ISO 8601 standard.
     */
    private final Optional<String> eventDateTimeFrom;

    /**
     * Allows you to return profit and losses that will be made from on or before a defined date/time. ISO 8601 standard.
     */
    private final Optional<String> eventDateTimeTo;

    /**
     * Event type, in this case 'self_service_cancellation'.
     */
    private final Optional<String> eventType;

    /**
     * The field to order entries by.
     */
    private final Optional<String> order;

    /**
     * Whether the order is ascending (asc) or descending (desc).
     */
    private final Optional<ConversionsProfitAndLossOrderAscDescEnum> orderAscDesc;

    /**
     * Returns a specific page within the results of a search.
     */
    private final Optional<String> page;

    /**
     * Maximum number of entries to return per page of results.
     */
    private final Optional<String> perPage;

    /**
     * Scope allows contacts to search all profit and losses at all account levels. Defaults to own.<br> 'own' - search profit and losses on the main account <br> 'clients' - search profit and losses of account sub-accounts <br> 'all' - search profit and losses of main account and sub-accounts.
     */
    private final Optional<ConversionsProfitAndLossScopeEnum> scope;


    private ProfitAndLossRequest(Builder builder) {
        this.accountId = builder.accountId;
        this.amountFrom = builder.amountFrom;
        this.amountTo = builder.amountTo;
        this.contactId = builder.contactId;
        this.conversionId = builder.conversionId;
        this.currency = builder.currency;
        this.eventDateTimeFrom = builder.eventDateTimeFrom;
        this.eventDateTimeTo = builder.eventDateTimeTo;
        this.eventType = builder.eventType;
        this.order = builder.order;
        this.orderAscDesc = builder.orderAscDesc;
        this.page = builder.page;
        this.perPage = builder.perPage;
        this.scope = builder.scope;
    }

    /**
     * Retrieves value for `accountId`
     * UUID of the Account that the Conversion belongs to.
     */
    @JsonProperty("account_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAccountId() {
        return accountId;
    }
    /**
     * Retrieves value for `amountFrom`
     * Allows you to return profit and losses based on a minimum profit or loss amount.
     */
    @JsonProperty("amount_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAmountFrom() {
        return amountFrom;
    }
    /**
     * Retrieves value for `amountTo`
     * Allows you to return profit and losses based on a maximum profit or loss amount.
     */
    @JsonProperty("amount_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAmountTo() {
        return amountTo;
    }
    /**
     * Retrieves value for `contactId`
     * UUID of the Contact that performed the action.
     */
    @JsonProperty("contact_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getContactId() {
        return contactId;
    }
    /**
     * Retrieves value for `conversionId`
     * UUID of the conversion.
     */
    @JsonProperty("conversion_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getConversionId() {
        return conversionId;
    }
    /**
     * Retrieves value for `currency`
     * The currency of the profit and loss. ISO 4217 standard.
     */
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `eventDateTimeFrom`
     * Allows you to return profit and losses that will be made from on or after a defined date/time. ISO 8601 standard.
     */
    @JsonProperty("event_date_time_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getEventDateTimeFrom() {
        return eventDateTimeFrom;
    }
    /**
     * Retrieves value for `eventDateTimeTo`
     * Allows you to return profit and losses that will be made from on or before a defined date/time. ISO 8601 standard.
     */
    @JsonProperty("event_date_time_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getEventDateTimeTo() {
        return eventDateTimeTo;
    }
    /**
     * Retrieves value for `eventType`
     * Event type, in this case 'self_service_cancellation'.
     */
    @JsonProperty("event_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getEventType() {
        return eventType;
    }
    /**
     * Retrieves value for `order`
     * The field to order entries by.
     */
    @JsonProperty("order")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getOrder() {
        return order;
    }
    /**
     * Retrieves value for `orderAscDesc`
     * Whether the order is ascending (asc) or descending (desc).
     */
    @JsonProperty("order_asc_desc")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ConversionsProfitAndLossOrderAscDescEnum> getOrderAscDesc() {
        return orderAscDesc;
    }
    /**
     * Retrieves value for `page`
     * Returns a specific page within the results of a search.
     */
    @JsonProperty("page")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPage() {
        return page;
    }
    /**
     * Retrieves value for `perPage`
     * Maximum number of entries to return per page of results.
     */
    @JsonProperty("per_page")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPerPage() {
        return perPage;
    }
    /**
     * Retrieves value for `scope`
     * Scope allows contacts to search all profit and losses at all account levels. Defaults to own.<br> 'own' - search profit and losses on the main account <br> 'clients' - search profit and losses of account sub-accounts <br> 'all' - search profit and losses of main account and sub-accounts.
     */
    @JsonProperty("scope")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ConversionsProfitAndLossScopeEnum> getScope() {
        return scope;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof ProfitAndLossRequest && equalTo((ProfitAndLossRequest) other);
    }

    private boolean equalTo(ProfitAndLossRequest other) {
        return
            accountId.equals(other.accountId) &&

            amountFrom.equals(other.amountFrom) &&

            amountTo.equals(other.amountTo) &&

            contactId.equals(other.contactId) &&

            conversionId.equals(other.conversionId) &&

            currency.equals(other.currency) &&

            eventDateTimeFrom.equals(other.eventDateTimeFrom) &&

            eventDateTimeTo.equals(other.eventDateTimeTo) &&

            eventType.equals(other.eventType) &&

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
                   this.accountId,
                   this.amountFrom,
                   this.amountTo,
                   this.contactId,
                   this.conversionId,
                   this.currency,
                   this.eventDateTimeFrom,
                   this.eventDateTimeTo,
                   this.eventType,
                   this.order,
                   this.orderAscDesc,
                   this.page,
                   this.perPage,
                   this.scope
               );
    }

    @Override
    public String toString() {
        return "ProfitAndLossRequest{" +
               "accountId=" + accountId + ", " +
               "amountFrom=" + amountFrom + ", " +
               "amountTo=" + amountTo + ", " +
               "contactId=" + contactId + ", " +
               "conversionId=" + conversionId + ", " +
               "currency=" + currency + ", " +
               "eventDateTimeFrom=" + eventDateTimeFrom + ", " +
               "eventDateTimeTo=" + eventDateTimeTo + ", " +
               "eventType=" + eventType + ", " +
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
         * UUID of the Account that the Conversion belongs to.
         */
        private Optional<String> accountId = Optional.empty();

        /**
         * Allows you to return profit and losses based on a minimum profit or loss amount.
         */
        private Optional<String> amountFrom = Optional.empty();

        /**
         * Allows you to return profit and losses based on a maximum profit or loss amount.
         */
        private Optional<String> amountTo = Optional.empty();

        /**
         * UUID of the Contact that performed the action.
         */
        private Optional<String> contactId = Optional.empty();

        /**
         * UUID of the conversion.
         */
        private Optional<String> conversionId = Optional.empty();

        /**
         * The currency of the profit and loss. ISO 4217 standard.
         */
        private Optional<String> currency = Optional.empty();

        /**
         * Allows you to return profit and losses that will be made from on or after a defined date/time. ISO 8601 standard.
         */
        private Optional<String> eventDateTimeFrom = Optional.empty();

        /**
         * Allows you to return profit and losses that will be made from on or before a defined date/time. ISO 8601 standard.
         */
        private Optional<String> eventDateTimeTo = Optional.empty();

        /**
         * Event type, in this case 'self_service_cancellation'.
         */
        private Optional<String> eventType = Optional.empty();

        /**
         * The field to order entries by.
         */
        private Optional<String> order = Optional.empty();

        /**
         * Whether the order is ascending (asc) or descending (desc).
         */
        private Optional<ConversionsProfitAndLossOrderAscDescEnum> orderAscDesc = Optional.empty();

        /**
         * Returns a specific page within the results of a search.
         */
        private Optional<String> page = Optional.empty();

        /**
         * Maximum number of entries to return per page of results.
         */
        private Optional<String> perPage = Optional.empty();

        /**
         * Scope allows contacts to search all profit and losses at all account levels. Defaults to own.<br> 'own' - search profit and losses on the main account <br> 'clients' - search profit and losses of account sub-accounts <br> 'all' - search profit and losses of main account and sub-accounts.
         */
        private Optional<ConversionsProfitAndLossScopeEnum> scope = Optional.empty();


        private Builder() {}

        public Builder from(ProfitAndLossRequest other) {
            accountId(other.getAccountId());
            amountFrom(other.getAmountFrom());
            amountTo(other.getAmountTo());
            contactId(other.getContactId());
            conversionId(other.getConversionId());
            currency(other.getCurrency());
            eventDateTimeFrom(other.getEventDateTimeFrom());
            eventDateTimeTo(other.getEventDateTimeTo());
            eventType(other.getEventType());
            order(other.getOrder());
            orderAscDesc(other.getOrderAscDesc());
            page(other.getPage());
            perPage(other.getPerPage());
            scope(other.getScope());
            return this;
        }

        /**
         * Sets value for `accountId`
         * UUID of the Account that the Conversion belongs to.
         */
        @JsonSetter("account_id")
        public Builder accountId(Optional<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Sets value for `accountId`
         * UUID of the Account that the Conversion belongs to.
         */
        public Builder accountId(String accountId) {
            return this.accountId(Optional.ofNullable(accountId));
        }
        /**
         * Sets value for `amountFrom`
         * Allows you to return profit and losses based on a minimum profit or loss amount.
         */
        @JsonSetter("amount_from")
        public Builder amountFrom(Optional<String> amountFrom) {
            this.amountFrom = amountFrom;
            return this;
        }

        /**
         * Sets value for `amountFrom`
         * Allows you to return profit and losses based on a minimum profit or loss amount.
         */
        public Builder amountFrom(String amountFrom) {
            return this.amountFrom(Optional.ofNullable(amountFrom));
        }
        /**
         * Sets value for `amountTo`
         * Allows you to return profit and losses based on a maximum profit or loss amount.
         */
        @JsonSetter("amount_to")
        public Builder amountTo(Optional<String> amountTo) {
            this.amountTo = amountTo;
            return this;
        }

        /**
         * Sets value for `amountTo`
         * Allows you to return profit and losses based on a maximum profit or loss amount.
         */
        public Builder amountTo(String amountTo) {
            return this.amountTo(Optional.ofNullable(amountTo));
        }
        /**
         * Sets value for `contactId`
         * UUID of the Contact that performed the action.
         */
        @JsonSetter("contact_id")
        public Builder contactId(Optional<String> contactId) {
            this.contactId = contactId;
            return this;
        }

        /**
         * Sets value for `contactId`
         * UUID of the Contact that performed the action.
         */
        public Builder contactId(String contactId) {
            return this.contactId(Optional.ofNullable(contactId));
        }
        /**
         * Sets value for `conversionId`
         * UUID of the conversion.
         */
        @JsonSetter("conversion_id")
        public Builder conversionId(Optional<String> conversionId) {
            this.conversionId = conversionId;
            return this;
        }

        /**
         * Sets value for `conversionId`
         * UUID of the conversion.
         */
        public Builder conversionId(String conversionId) {
            return this.conversionId(Optional.ofNullable(conversionId));
        }
        /**
         * Sets value for `currency`
         * The currency of the profit and loss. ISO 4217 standard.
         */
        @JsonSetter("currency")
        public Builder currency(Optional<String> currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Sets value for `currency`
         * The currency of the profit and loss. ISO 4217 standard.
         */
        public Builder currency(String currency) {
            return this.currency(Optional.ofNullable(currency));
        }
        /**
         * Sets value for `eventDateTimeFrom`
         * Allows you to return profit and losses that will be made from on or after a defined date/time. ISO 8601 standard.
         */
        @JsonSetter("event_date_time_from")
        public Builder eventDateTimeFrom(Optional<String> eventDateTimeFrom) {
            this.eventDateTimeFrom = eventDateTimeFrom;
            return this;
        }

        /**
         * Sets value for `eventDateTimeFrom`
         * Allows you to return profit and losses that will be made from on or after a defined date/time. ISO 8601 standard.
         */
        public Builder eventDateTimeFrom(String eventDateTimeFrom) {
            return this.eventDateTimeFrom(Optional.ofNullable(eventDateTimeFrom));
        }
        /**
         * Sets value for `eventDateTimeTo`
         * Allows you to return profit and losses that will be made from on or before a defined date/time. ISO 8601 standard.
         */
        @JsonSetter("event_date_time_to")
        public Builder eventDateTimeTo(Optional<String> eventDateTimeTo) {
            this.eventDateTimeTo = eventDateTimeTo;
            return this;
        }

        /**
         * Sets value for `eventDateTimeTo`
         * Allows you to return profit and losses that will be made from on or before a defined date/time. ISO 8601 standard.
         */
        public Builder eventDateTimeTo(String eventDateTimeTo) {
            return this.eventDateTimeTo(Optional.ofNullable(eventDateTimeTo));
        }
        /**
         * Sets value for `eventType`
         * Event type, in this case 'self_service_cancellation'.
         */
        @JsonSetter("event_type")
        public Builder eventType(Optional<String> eventType) {
            this.eventType = eventType;
            return this;
        }

        /**
         * Sets value for `eventType`
         * Event type, in this case 'self_service_cancellation'.
         */
        public Builder eventType(String eventType) {
            return this.eventType(Optional.ofNullable(eventType));
        }
        /**
         * Sets value for `order`
         * The field to order entries by.
         */
        @JsonSetter("order")
        public Builder order(Optional<String> order) {
            this.order = order;
            return this;
        }

        /**
         * Sets value for `order`
         * The field to order entries by.
         */
        public Builder order(String order) {
            return this.order(Optional.ofNullable(order));
        }
        /**
         * Sets value for `orderAscDesc`
         * Whether the order is ascending (asc) or descending (desc).
         */
        @JsonSetter("order_asc_desc")
        public Builder orderAscDesc(Optional<ConversionsProfitAndLossOrderAscDescEnum> orderAscDesc) {
            this.orderAscDesc = orderAscDesc;
            return this;
        }

        /**
         * Sets value for `orderAscDesc`
         * Whether the order is ascending (asc) or descending (desc).
         */
        public Builder orderAscDesc(ConversionsProfitAndLossOrderAscDescEnum orderAscDesc) {
            return this.orderAscDesc(Optional.ofNullable(orderAscDesc));
        }
        /**
         * Sets value for `page`
         * Returns a specific page within the results of a search.
         */
        @JsonSetter("page")
        public Builder page(Optional<String> page) {
            this.page = page;
            return this;
        }

        /**
         * Sets value for `page`
         * Returns a specific page within the results of a search.
         */
        public Builder page(String page) {
            return this.page(Optional.ofNullable(page));
        }
        /**
         * Sets value for `perPage`
         * Maximum number of entries to return per page of results.
         */
        @JsonSetter("per_page")
        public Builder perPage(Optional<String> perPage) {
            this.perPage = perPage;
            return this;
        }

        /**
         * Sets value for `perPage`
         * Maximum number of entries to return per page of results.
         */
        public Builder perPage(String perPage) {
            return this.perPage(Optional.ofNullable(perPage));
        }
        /**
         * Sets value for `scope`
         * Scope allows contacts to search all profit and losses at all account levels. Defaults to own.<br> 'own' - search profit and losses on the main account <br> 'clients' - search profit and losses of account sub-accounts <br> 'all' - search profit and losses of main account and sub-accounts.
         */
        @JsonSetter("scope")
        public Builder scope(Optional<ConversionsProfitAndLossScopeEnum> scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Sets value for `scope`
         * Scope allows contacts to search all profit and losses at all account levels. Defaults to own.<br> 'own' - search profit and losses on the main account <br> 'clients' - search profit and losses of account sub-accounts <br> 'all' - search profit and losses of main account and sub-accounts.
         */
        public Builder scope(ConversionsProfitAndLossScopeEnum scope) {
            return this.scope(Optional.ofNullable(scope));
        }



        public ProfitAndLossRequest build() {
            return new ProfitAndLossRequest(this);
        }
    }

}



