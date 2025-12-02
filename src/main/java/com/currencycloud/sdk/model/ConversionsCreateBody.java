
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * ConversionsCreateBody
 */
@JsonDeserialize(builder = ConversionsCreateBody.Builder.class)
public final class ConversionsCreateBody {
    /**
     * Amount of the fixed buy or sell currency.
     */
    private final String amount;

    /**
     * Three-character ISO code for currency purchased.
     */
    private final String buyCurrency;

    /**
     * Client buy amount.
     */
    private final Optional<String> clientBuyAmount;

    /**
     * Client sell amount.
     */
    private final Optional<String> clientSellAmount;

    /**
     * Earliest delivery date in UTC time zone. Format YYYY-MM-DD.
     */
    private final Optional<String> conversionDate;

    /**
     * Available and required only if conversion_date is not provided.<br> Must be one of the following:<br> - 'earliest' for earliest available conversion date. Make sure there is sufficient time to send funds to Currencycloud.<br> - 'next_day' for next day available conversion date - T+1.<br> - 'default' for conversion - T+1 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, T+2 for all others.<br> - 'optimize_liquidity' for maximizing chances of getting a successful rate. Most relevant for exotic pairs. Conversion is T+0 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, and T+1 or T+2 for all others.
     */
    private final Optional<ConversionsCreateBodyConversionDatePreferenceEnum> conversionDatePreference;

    /**
     * Fix the buy or sell currency.
     */
    private final ConversionsCreateBodyFixedSideEnum fixedSide;

    /**
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    private final Optional<String> onBehalfOf;

    /**
     * User-generated reason for conversion - freeform text.
     */
    private final Optional<String> reason;

    /**
     * Three-character ISO code for currency sold.
     */
    private final String sellCurrency;

    /**
     * Indicates agreement to terms and conditions.
     */
    private final Boolean termAgreement;

    /**
     * User-generated idempotency key. Beneficial for request tracking / management.
     */
    private final Optional<String> uniqueRequestId;


    private ConversionsCreateBody(Builder builder) {
        this.amount = builder.amount;
        this.buyCurrency = builder.buyCurrency;
        this.clientBuyAmount = builder.clientBuyAmount;
        this.clientSellAmount = builder.clientSellAmount;
        this.conversionDate = builder.conversionDate;
        this.conversionDatePreference = builder.conversionDatePreference;
        this.fixedSide = builder.fixedSide;
        this.onBehalfOf = builder.onBehalfOf;
        this.reason = builder.reason;
        this.sellCurrency = builder.sellCurrency;
        this.termAgreement = builder.termAgreement;
        this.uniqueRequestId = builder.uniqueRequestId;
    }

    /**
     * Retrieves value for `amount`
     * Amount of the fixed buy or sell currency.
     */
    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }
    /**
     * Retrieves value for `buyCurrency`
     * Three-character ISO code for currency purchased.
     */
    @JsonProperty("buy_currency")
    public String getBuyCurrency() {
        return buyCurrency;
    }
    /**
     * Retrieves value for `clientBuyAmount`
     * Client buy amount.
     */
    @JsonProperty("client_buy_amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getClientBuyAmount() {
        return clientBuyAmount;
    }
    /**
     * Retrieves value for `clientSellAmount`
     * Client sell amount.
     */
    @JsonProperty("client_sell_amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getClientSellAmount() {
        return clientSellAmount;
    }
    /**
     * Retrieves value for `conversionDate`
     * Earliest delivery date in UTC time zone. Format YYYY-MM-DD.
     */
    @JsonProperty("conversion_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getConversionDate() {
        return conversionDate;
    }
    /**
     * Retrieves value for `conversionDatePreference`
     * Available and required only if conversion_date is not provided.<br> Must be one of the following:<br> - 'earliest' for earliest available conversion date. Make sure there is sufficient time to send funds to Currencycloud.<br> - 'next_day' for next day available conversion date - T+1.<br> - 'default' for conversion - T+1 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, T+2 for all others.<br> - 'optimize_liquidity' for maximizing chances of getting a successful rate. Most relevant for exotic pairs. Conversion is T+0 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, and T+1 or T+2 for all others.
     */
    @JsonProperty("conversion_date_preference")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ConversionsCreateBodyConversionDatePreferenceEnum> getConversionDatePreference() {
        return conversionDatePreference;
    }
    /**
     * Retrieves value for `fixedSide`
     * Fix the buy or sell currency.
     */
    @JsonProperty("fixed_side")
    public ConversionsCreateBodyFixedSideEnum getFixedSide() {
        return fixedSide;
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
     * Retrieves value for `reason`
     * User-generated reason for conversion - freeform text.
     */
    @JsonProperty("reason")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getReason() {
        return reason;
    }
    /**
     * Retrieves value for `sellCurrency`
     * Three-character ISO code for currency sold.
     */
    @JsonProperty("sell_currency")
    public String getSellCurrency() {
        return sellCurrency;
    }
    /**
     * Retrieves value for `termAgreement`
     * Indicates agreement to terms and conditions.
     */
    @JsonProperty("term_agreement")
    public Boolean getTermAgreement() {
        return termAgreement;
    }
    /**
     * Retrieves value for `uniqueRequestId`
     * User-generated idempotency key. Beneficial for request tracking / management.
     */
    @JsonProperty("unique_request_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUniqueRequestId() {
        return uniqueRequestId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof ConversionsCreateBody && equalTo((ConversionsCreateBody) other);
    }

    private boolean equalTo(ConversionsCreateBody other) {
        return
            amount.equals(other.amount) &&

            buyCurrency.equals(other.buyCurrency) &&

            clientBuyAmount.equals(other.clientBuyAmount) &&

            clientSellAmount.equals(other.clientSellAmount) &&

            conversionDate.equals(other.conversionDate) &&

            conversionDatePreference.equals(other.conversionDatePreference) &&

            fixedSide.equals(other.fixedSide) &&

            onBehalfOf.equals(other.onBehalfOf) &&

            reason.equals(other.reason) &&

            sellCurrency.equals(other.sellCurrency) &&

            termAgreement.equals(other.termAgreement) &&

            uniqueRequestId.equals(other.uniqueRequestId)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.amount,
                   this.buyCurrency,
                   this.clientBuyAmount,
                   this.clientSellAmount,
                   this.conversionDate,
                   this.conversionDatePreference,
                   this.fixedSide,
                   this.onBehalfOf,
                   this.reason,
                   this.sellCurrency,
                   this.termAgreement,
                   this.uniqueRequestId
               );
    }

    @Override
    public String toString() {
        return "ConversionsCreateBody{" +
               "amount=" + amount + ", " +
               "buyCurrency=" + buyCurrency + ", " +
               "clientBuyAmount=" + clientBuyAmount + ", " +
               "clientSellAmount=" + clientSellAmount + ", " +
               "conversionDate=" + conversionDate + ", " +
               "conversionDatePreference=" + conversionDatePreference + ", " +
               "fixedSide=" + fixedSide + ", " +
               "onBehalfOf=" + onBehalfOf + ", " +
               "reason=" + reason + ", " +
               "sellCurrency=" + sellCurrency + ", " +
               "termAgreement=" + termAgreement + ", " +
               "uniqueRequestId=" + uniqueRequestId +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Amount of the fixed buy or sell currency.
         */
        private String amount = null;

        /**
         * Three-character ISO code for currency purchased.
         */
        private String buyCurrency = null;

        /**
         * Client buy amount.
         */
        private Optional<String> clientBuyAmount = Optional.empty();

        /**
         * Client sell amount.
         */
        private Optional<String> clientSellAmount = Optional.empty();

        /**
         * Earliest delivery date in UTC time zone. Format YYYY-MM-DD.
         */
        private Optional<String> conversionDate = Optional.empty();

        /**
         * Available and required only if conversion_date is not provided.<br> Must be one of the following:<br> - 'earliest' for earliest available conversion date. Make sure there is sufficient time to send funds to Currencycloud.<br> - 'next_day' for next day available conversion date - T+1.<br> - 'default' for conversion - T+1 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, T+2 for all others.<br> - 'optimize_liquidity' for maximizing chances of getting a successful rate. Most relevant for exotic pairs. Conversion is T+0 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, and T+1 or T+2 for all others.
         */
        private Optional<ConversionsCreateBodyConversionDatePreferenceEnum> conversionDatePreference =
            Optional.empty();

        /**
         * Fix the buy or sell currency.
         */
        private ConversionsCreateBodyFixedSideEnum fixedSide = null;

        /**
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        private Optional<String> onBehalfOf = Optional.empty();

        /**
         * User-generated reason for conversion - freeform text.
         */
        private Optional<String> reason = Optional.empty();

        /**
         * Three-character ISO code for currency sold.
         */
        private String sellCurrency = null;

        /**
         * Indicates agreement to terms and conditions.
         */
        private Boolean termAgreement = null;

        /**
         * User-generated idempotency key. Beneficial for request tracking / management.
         */
        private Optional<String> uniqueRequestId = Optional.empty();


        private Builder() {}

        public Builder from(ConversionsCreateBody other) {
            amount(other.getAmount());
            buyCurrency(other.getBuyCurrency());
            clientBuyAmount(other.getClientBuyAmount());
            clientSellAmount(other.getClientSellAmount());
            conversionDate(other.getConversionDate());
            conversionDatePreference(other.getConversionDatePreference());
            fixedSide(other.getFixedSide());
            onBehalfOf(other.getOnBehalfOf());
            reason(other.getReason());
            sellCurrency(other.getSellCurrency());
            termAgreement(other.getTermAgreement());
            uniqueRequestId(other.getUniqueRequestId());
            return this;
        }

        /**
         * Sets value for `amount`
         * Amount of the fixed buy or sell currency.
         */
        @JsonSetter("amount")
        public Builder amount(String amount) {
            if (amount == null) {
                throw new IllegalArgumentException("amount cannot be null");
            }

            this.amount = amount;
            return this;
        }
        /**
         * Sets value for `buyCurrency`
         * Three-character ISO code for currency purchased.
         */
        @JsonSetter("buy_currency")
        public Builder buyCurrency(String buyCurrency) {
            if (buyCurrency == null) {
                throw new IllegalArgumentException("buyCurrency cannot be null");
            }

            this.buyCurrency = buyCurrency;
            return this;
        }
        /**
         * Sets value for `clientBuyAmount`
         * Client buy amount.
         */
        @JsonSetter("client_buy_amount")
        public Builder clientBuyAmount(Optional<String> clientBuyAmount) {
            this.clientBuyAmount = clientBuyAmount;
            return this;
        }

        /**
         * Sets value for `clientBuyAmount`
         * Client buy amount.
         */
        public Builder clientBuyAmount(String clientBuyAmount) {
            return this.clientBuyAmount(Optional.ofNullable(clientBuyAmount));
        }
        /**
         * Sets value for `clientSellAmount`
         * Client sell amount.
         */
        @JsonSetter("client_sell_amount")
        public Builder clientSellAmount(Optional<String> clientSellAmount) {
            this.clientSellAmount = clientSellAmount;
            return this;
        }

        /**
         * Sets value for `clientSellAmount`
         * Client sell amount.
         */
        public Builder clientSellAmount(String clientSellAmount) {
            return this.clientSellAmount(Optional.ofNullable(clientSellAmount));
        }
        /**
         * Sets value for `conversionDate`
         * Earliest delivery date in UTC time zone. Format YYYY-MM-DD.
         */
        @JsonSetter("conversion_date")
        public Builder conversionDate(Optional<String> conversionDate) {
            this.conversionDate = conversionDate;
            return this;
        }

        /**
         * Sets value for `conversionDate`
         * Earliest delivery date in UTC time zone. Format YYYY-MM-DD.
         */
        public Builder conversionDate(String conversionDate) {
            return this.conversionDate(Optional.ofNullable(conversionDate));
        }
        /**
         * Sets value for `conversionDatePreference`
         * Available and required only if conversion_date is not provided.<br> Must be one of the following:<br> - 'earliest' for earliest available conversion date. Make sure there is sufficient time to send funds to Currencycloud.<br> - 'next_day' for next day available conversion date - T+1.<br> - 'default' for conversion - T+1 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, T+2 for all others.<br> - 'optimize_liquidity' for maximizing chances of getting a successful rate. Most relevant for exotic pairs. Conversion is T+0 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, and T+1 or T+2 for all others.
         */
        @JsonSetter("conversion_date_preference")
        public Builder conversionDatePreference(Optional<ConversionsCreateBodyConversionDatePreferenceEnum>
                                                conversionDatePreference) {
            this.conversionDatePreference = conversionDatePreference;
            return this;
        }

        /**
         * Sets value for `conversionDatePreference`
         * Available and required only if conversion_date is not provided.<br> Must be one of the following:<br> - 'earliest' for earliest available conversion date. Make sure there is sufficient time to send funds to Currencycloud.<br> - 'next_day' for next day available conversion date - T+1.<br> - 'default' for conversion - T+1 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, T+2 for all others.<br> - 'optimize_liquidity' for maximizing chances of getting a successful rate. Most relevant for exotic pairs. Conversion is T+0 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, and T+1 or T+2 for all others.
         */
        public Builder conversionDatePreference(ConversionsCreateBodyConversionDatePreferenceEnum
                                                conversionDatePreference) {
            return this.conversionDatePreference(Optional.ofNullable(conversionDatePreference));
        }
        /**
         * Sets value for `fixedSide`
         * Fix the buy or sell currency.
         */
        @JsonSetter("fixed_side")
        public Builder fixedSide(ConversionsCreateBodyFixedSideEnum fixedSide) {
            if (fixedSide == null) {
                throw new IllegalArgumentException("fixedSide cannot be null");
            }

            this.fixedSide = fixedSide;
            return this;
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
         * Sets value for `reason`
         * User-generated reason for conversion - freeform text.
         */
        @JsonSetter("reason")
        public Builder reason(Optional<String> reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Sets value for `reason`
         * User-generated reason for conversion - freeform text.
         */
        public Builder reason(String reason) {
            return this.reason(Optional.ofNullable(reason));
        }
        /**
         * Sets value for `sellCurrency`
         * Three-character ISO code for currency sold.
         */
        @JsonSetter("sell_currency")
        public Builder sellCurrency(String sellCurrency) {
            if (sellCurrency == null) {
                throw new IllegalArgumentException("sellCurrency cannot be null");
            }

            this.sellCurrency = sellCurrency;
            return this;
        }
        /**
         * Sets value for `termAgreement`
         * Indicates agreement to terms and conditions.
         */
        @JsonSetter("term_agreement")
        public Builder termAgreement(Boolean termAgreement) {
            if (termAgreement == null) {
                throw new IllegalArgumentException("termAgreement cannot be null");
            }

            this.termAgreement = termAgreement;
            return this;
        }
        /**
         * Sets value for `uniqueRequestId`
         * User-generated idempotency key. Beneficial for request tracking / management.
         */
        @JsonSetter("unique_request_id")
        public Builder uniqueRequestId(Optional<String> uniqueRequestId) {
            this.uniqueRequestId = uniqueRequestId;
            return this;
        }

        /**
         * Sets value for `uniqueRequestId`
         * User-generated idempotency key. Beneficial for request tracking / management.
         */
        public Builder uniqueRequestId(String uniqueRequestId) {
            return this.uniqueRequestId(Optional.ofNullable(uniqueRequestId));
        }



        public ConversionsCreateBody build() {
            if (amount == null) {
                throw new IllegalStateException("amount is required");
            }

            if (buyCurrency == null) {
                throw new IllegalStateException("buyCurrency is required");
            }

            if (fixedSide == null) {
                throw new IllegalStateException("fixedSide is required");
            }

            if (sellCurrency == null) {
                throw new IllegalStateException("sellCurrency is required");
            }

            if (termAgreement == null) {
                throw new IllegalStateException("termAgreement is required");
            }

            return new ConversionsCreateBody(this);
        }
    }

}



