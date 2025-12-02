
package com.currencycloud.sdk.resources.rates.params;

import java.util.Objects;
import java.util.Optional;

import com.currencycloud.sdk.model.RatesGetDetailedConversionDatePreferenceEnum;
import com.currencycloud.sdk.model.RatesGetDetailedFixedSideEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * GetDetailedRequest
 */
@JsonDeserialize(builder = GetDetailedRequest.Builder.class)
public final class GetDetailedRequest {
    /**
     * Amount of the fixed buy or sell currency.
     */
    private final String amount;

    /**
     * Currency purchased - three-letter ISO code.
     */
    private final String buyCurrency;

    /**
     * Fix the buy or sell currency.
     */
    private final RatesGetDetailedFixedSideEnum fixedSide;

    /**
     * Currency sold - three-letter ISO code.
     */
    private final String sellCurrency;

    /**
     * Date of delivery of purchased currency. ISO 8601 format YYYY-MM-DD. If not specified, deals settle in two working days.
     */
    private final Optional<String> conversionDate;

    /**
     * Available only if conversion_date is not provided. Must be one of the following:<br> 'earliest' for earliest available conversion date. Make sure there is sufficient time to send funds to Currencycloud.<br> 'next_day' for next day available conversion date - T+1.<br> 'default' for conversion - T+1 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, T+2 for all others.<br> 'optimize_liquidity' for maximizing chances of getting a successful rate. Most relevant for exotic pairs. Conversion is T+0 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, and T+1 or T+2 for all others.
     */
    private final Optional<RatesGetDetailedConversionDatePreferenceEnum> conversionDatePreference;

    /**
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    private final Optional<String> onBehalfOf;


    private GetDetailedRequest(Builder builder) {
        this.amount = builder.amount;
        this.buyCurrency = builder.buyCurrency;
        this.fixedSide = builder.fixedSide;
        this.sellCurrency = builder.sellCurrency;
        this.conversionDate = builder.conversionDate;
        this.conversionDatePreference = builder.conversionDatePreference;
        this.onBehalfOf = builder.onBehalfOf;
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
     * Currency purchased - three-letter ISO code.
     */
    @JsonProperty("buy_currency")
    public String getBuyCurrency() {
        return buyCurrency;
    }
    /**
     * Retrieves value for `fixedSide`
     * Fix the buy or sell currency.
     */
    @JsonProperty("fixed_side")
    public RatesGetDetailedFixedSideEnum getFixedSide() {
        return fixedSide;
    }
    /**
     * Retrieves value for `sellCurrency`
     * Currency sold - three-letter ISO code.
     */
    @JsonProperty("sell_currency")
    public String getSellCurrency() {
        return sellCurrency;
    }
    /**
     * Retrieves value for `conversionDate`
     * Date of delivery of purchased currency. ISO 8601 format YYYY-MM-DD. If not specified, deals settle in two working days.
     */
    @JsonProperty("conversion_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getConversionDate() {
        return conversionDate;
    }
    /**
     * Retrieves value for `conversionDatePreference`
     * Available only if conversion_date is not provided. Must be one of the following:<br> 'earliest' for earliest available conversion date. Make sure there is sufficient time to send funds to Currencycloud.<br> 'next_day' for next day available conversion date - T+1.<br> 'default' for conversion - T+1 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, T+2 for all others.<br> 'optimize_liquidity' for maximizing chances of getting a successful rate. Most relevant for exotic pairs. Conversion is T+0 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, and T+1 or T+2 for all others.
     */
    @JsonProperty("conversion_date_preference")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<RatesGetDetailedConversionDatePreferenceEnum> getConversionDatePreference() {
        return conversionDatePreference;
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

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof GetDetailedRequest && equalTo((GetDetailedRequest) other);
    }

    private boolean equalTo(GetDetailedRequest other) {
        return
            amount.equals(other.amount) &&

            buyCurrency.equals(other.buyCurrency) &&

            fixedSide.equals(other.fixedSide) &&

            sellCurrency.equals(other.sellCurrency) &&

            conversionDate.equals(other.conversionDate) &&

            conversionDatePreference.equals(other.conversionDatePreference) &&

            onBehalfOf.equals(other.onBehalfOf)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.amount,
                   this.buyCurrency,
                   this.fixedSide,
                   this.sellCurrency,
                   this.conversionDate,
                   this.conversionDatePreference,
                   this.onBehalfOf
               );
    }

    @Override
    public String toString() {
        return "GetDetailedRequest{" +
               "amount=" + amount + ", " +
               "buyCurrency=" + buyCurrency + ", " +
               "fixedSide=" + fixedSide + ", " +
               "sellCurrency=" + sellCurrency + ", " +
               "conversionDate=" + conversionDate + ", " +
               "conversionDatePreference=" + conversionDatePreference + ", " +
               "onBehalfOf=" + onBehalfOf +
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
         * Currency purchased - three-letter ISO code.
         */
        private String buyCurrency = null;

        /**
         * Fix the buy or sell currency.
         */
        private RatesGetDetailedFixedSideEnum fixedSide = null;

        /**
         * Currency sold - three-letter ISO code.
         */
        private String sellCurrency = null;

        /**
         * Date of delivery of purchased currency. ISO 8601 format YYYY-MM-DD. If not specified, deals settle in two working days.
         */
        private Optional<String> conversionDate = Optional.empty();

        /**
         * Available only if conversion_date is not provided. Must be one of the following:<br> 'earliest' for earliest available conversion date. Make sure there is sufficient time to send funds to Currencycloud.<br> 'next_day' for next day available conversion date - T+1.<br> 'default' for conversion - T+1 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, T+2 for all others.<br> 'optimize_liquidity' for maximizing chances of getting a successful rate. Most relevant for exotic pairs. Conversion is T+0 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, and T+1 or T+2 for all others.
         */
        private Optional<RatesGetDetailedConversionDatePreferenceEnum> conversionDatePreference =
            Optional.empty();

        /**
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        private Optional<String> onBehalfOf = Optional.empty();


        private Builder() {}

        public Builder from(GetDetailedRequest other) {
            amount(other.getAmount());
            buyCurrency(other.getBuyCurrency());
            fixedSide(other.getFixedSide());
            sellCurrency(other.getSellCurrency());
            conversionDate(other.getConversionDate());
            conversionDatePreference(other.getConversionDatePreference());
            onBehalfOf(other.getOnBehalfOf());
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
         * Currency purchased - three-letter ISO code.
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
         * Sets value for `fixedSide`
         * Fix the buy or sell currency.
         */
        @JsonSetter("fixed_side")
        public Builder fixedSide(RatesGetDetailedFixedSideEnum fixedSide) {
            if (fixedSide == null) {
                throw new IllegalArgumentException("fixedSide cannot be null");
            }

            this.fixedSide = fixedSide;
            return this;
        }
        /**
         * Sets value for `sellCurrency`
         * Currency sold - three-letter ISO code.
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
         * Sets value for `conversionDate`
         * Date of delivery of purchased currency. ISO 8601 format YYYY-MM-DD. If not specified, deals settle in two working days.
         */
        @JsonSetter("conversion_date")
        public Builder conversionDate(Optional<String> conversionDate) {
            this.conversionDate = conversionDate;
            return this;
        }

        /**
         * Sets value for `conversionDate`
         * Date of delivery of purchased currency. ISO 8601 format YYYY-MM-DD. If not specified, deals settle in two working days.
         */
        public Builder conversionDate(String conversionDate) {
            return this.conversionDate(Optional.ofNullable(conversionDate));
        }
        /**
         * Sets value for `conversionDatePreference`
         * Available only if conversion_date is not provided. Must be one of the following:<br> 'earliest' for earliest available conversion date. Make sure there is sufficient time to send funds to Currencycloud.<br> 'next_day' for next day available conversion date - T+1.<br> 'default' for conversion - T+1 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, T+2 for all others.<br> 'optimize_liquidity' for maximizing chances of getting a successful rate. Most relevant for exotic pairs. Conversion is T+0 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, and T+1 or T+2 for all others.
         */
        @JsonSetter("conversion_date_preference")
        public Builder conversionDatePreference(Optional<RatesGetDetailedConversionDatePreferenceEnum>
                                                conversionDatePreference) {
            this.conversionDatePreference = conversionDatePreference;
            return this;
        }

        /**
         * Sets value for `conversionDatePreference`
         * Available only if conversion_date is not provided. Must be one of the following:<br> 'earliest' for earliest available conversion date. Make sure there is sufficient time to send funds to Currencycloud.<br> 'next_day' for next day available conversion date - T+1.<br> 'default' for conversion - T+1 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, T+2 for all others.<br> 'optimize_liquidity' for maximizing chances of getting a successful rate. Most relevant for exotic pairs. Conversion is T+0 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, and T+1 or T+2 for all others.
         */
        public Builder conversionDatePreference(RatesGetDetailedConversionDatePreferenceEnum
                                                conversionDatePreference) {
            return this.conversionDatePreference(Optional.ofNullable(conversionDatePreference));
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



        public GetDetailedRequest build() {
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

            return new GetDetailedRequest(this);
        }
    }

}



