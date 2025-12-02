
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Detailed rate information.
 */
@JsonDeserialize(builder = RateDetailed.Builder.class)
public final class RateDetailed {
    /**
     * The amount of buy currency for a client.
     */
    private final Optional<String> clientBuyAmount;

    /**
     * Three character ISO code for the currency being bought.
     */
    private final Optional<String> clientBuyCurrency;

    /**
     * The rate that will be returned to your customer after all spread has been applied.
     */
    private final Optional<String> clientRate;

    /**
     * The amount of sell currency for a client.
     */
    private final Optional<String> clientSellAmount;

    /**
     * Three character ISO code for the currency being sold.
     */
    private final Optional<String> clientSellCurrency;

    /**
     * The market rate.
     */
    private final Optional<String> coreRate;

    /**
     * Concatenated string of the two currencies traded, e.g. "USDEUR".
     */
    private final Optional<String> currencyPair;

    /**
     * The amount of a deposit required.
     */
    private final Optional<String> depositAmount;

    /**
     * Three-letter ISO currency code for the currency the deposit is shown in.
     */
    private final Optional<String> depositCurrency;

    /**
     * Is a deposit required for the conversion?
     */
    private final Optional<String> depositRequired;

    /**
     * Which currency is fixed -  the buy or sell one.
     */
    private final Optional<RateDetailedFixedSideEnum> fixedSide;

    /**
     * The mid point between buy and sell rates.
     */
    private final Optional<String> midMarketRate;

    /**
     * The market rate + Currencycloud's commission (if applicable).
     */
    private final Optional<String> partnerRate;

    /**
     * The date and time by which funds need to be available to settle the trade, in the format YYYY-MM-DDThh:mm:ssZ
     */
    private final Optional<String> settlementCutOffTime;


    private RateDetailed(Builder builder) {
        this.clientBuyAmount = builder.clientBuyAmount;
        this.clientBuyCurrency = builder.clientBuyCurrency;
        this.clientRate = builder.clientRate;
        this.clientSellAmount = builder.clientSellAmount;
        this.clientSellCurrency = builder.clientSellCurrency;
        this.coreRate = builder.coreRate;
        this.currencyPair = builder.currencyPair;
        this.depositAmount = builder.depositAmount;
        this.depositCurrency = builder.depositCurrency;
        this.depositRequired = builder.depositRequired;
        this.fixedSide = builder.fixedSide;
        this.midMarketRate = builder.midMarketRate;
        this.partnerRate = builder.partnerRate;
        this.settlementCutOffTime = builder.settlementCutOffTime;
    }

    /**
     * Retrieves value for `clientBuyAmount`
     * The amount of buy currency for a client.
     */
    @JsonProperty("client_buy_amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getClientBuyAmount() {
        return clientBuyAmount;
    }
    /**
     * Retrieves value for `clientBuyCurrency`
     * Three character ISO code for the currency being bought.
     */
    @JsonProperty("client_buy_currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getClientBuyCurrency() {
        return clientBuyCurrency;
    }
    /**
     * Retrieves value for `clientRate`
     * The rate that will be returned to your customer after all spread has been applied.
     */
    @JsonProperty("client_rate")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getClientRate() {
        return clientRate;
    }
    /**
     * Retrieves value for `clientSellAmount`
     * The amount of sell currency for a client.
     */
    @JsonProperty("client_sell_amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getClientSellAmount() {
        return clientSellAmount;
    }
    /**
     * Retrieves value for `clientSellCurrency`
     * Three character ISO code for the currency being sold.
     */
    @JsonProperty("client_sell_currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getClientSellCurrency() {
        return clientSellCurrency;
    }
    /**
     * Retrieves value for `coreRate`
     * The market rate.
     */
    @JsonProperty("core_rate")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCoreRate() {
        return coreRate;
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
     * Retrieves value for `depositAmount`
     * The amount of a deposit required.
     */
    @JsonProperty("deposit_amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getDepositAmount() {
        return depositAmount;
    }
    /**
     * Retrieves value for `depositCurrency`
     * Three-letter ISO currency code for the currency the deposit is shown in.
     */
    @JsonProperty("deposit_currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getDepositCurrency() {
        return depositCurrency;
    }
    /**
     * Retrieves value for `depositRequired`
     * Is a deposit required for the conversion?
     */
    @JsonProperty("deposit_required")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getDepositRequired() {
        return depositRequired;
    }
    /**
     * Retrieves value for `fixedSide`
     * Which currency is fixed -  the buy or sell one.
     */
    @JsonProperty("fixed_side")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<RateDetailedFixedSideEnum> getFixedSide() {
        return fixedSide;
    }
    /**
     * Retrieves value for `midMarketRate`
     * The mid point between buy and sell rates.
     */
    @JsonProperty("mid_market_rate")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getMidMarketRate() {
        return midMarketRate;
    }
    /**
     * Retrieves value for `partnerRate`
     * The market rate + Currencycloud's commission (if applicable).
     */
    @JsonProperty("partner_rate")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPartnerRate() {
        return partnerRate;
    }
    /**
     * Retrieves value for `settlementCutOffTime`
     * The date and time by which funds need to be available to settle the trade, in the format YYYY-MM-DDThh:mm:ssZ
     */
    @JsonProperty("settlement_cut_off_time")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSettlementCutOffTime() {
        return settlementCutOffTime;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof RateDetailed && equalTo((RateDetailed) other);
    }

    private boolean equalTo(RateDetailed other) {
        return
            clientBuyAmount.equals(other.clientBuyAmount) &&

            clientBuyCurrency.equals(other.clientBuyCurrency) &&

            clientRate.equals(other.clientRate) &&

            clientSellAmount.equals(other.clientSellAmount) &&

            clientSellCurrency.equals(other.clientSellCurrency) &&

            coreRate.equals(other.coreRate) &&

            currencyPair.equals(other.currencyPair) &&

            depositAmount.equals(other.depositAmount) &&

            depositCurrency.equals(other.depositCurrency) &&

            depositRequired.equals(other.depositRequired) &&

            fixedSide.equals(other.fixedSide) &&

            midMarketRate.equals(other.midMarketRate) &&

            partnerRate.equals(other.partnerRate) &&

            settlementCutOffTime.equals(other.settlementCutOffTime)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.clientBuyAmount,
                   this.clientBuyCurrency,
                   this.clientRate,
                   this.clientSellAmount,
                   this.clientSellCurrency,
                   this.coreRate,
                   this.currencyPair,
                   this.depositAmount,
                   this.depositCurrency,
                   this.depositRequired,
                   this.fixedSide,
                   this.midMarketRate,
                   this.partnerRate,
                   this.settlementCutOffTime
               );
    }

    @Override
    public String toString() {
        return "RateDetailed{" +
               "clientBuyAmount=" + clientBuyAmount + ", " +
               "clientBuyCurrency=" + clientBuyCurrency + ", " +
               "clientRate=" + clientRate + ", " +
               "clientSellAmount=" + clientSellAmount + ", " +
               "clientSellCurrency=" + clientSellCurrency + ", " +
               "coreRate=" + coreRate + ", " +
               "currencyPair=" + currencyPair + ", " +
               "depositAmount=" + depositAmount + ", " +
               "depositCurrency=" + depositCurrency + ", " +
               "depositRequired=" + depositRequired + ", " +
               "fixedSide=" + fixedSide + ", " +
               "midMarketRate=" + midMarketRate + ", " +
               "partnerRate=" + partnerRate + ", " +
               "settlementCutOffTime=" + settlementCutOffTime +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The amount of buy currency for a client.
         */
        private Optional<String> clientBuyAmount = Optional.empty();

        /**
         * Three character ISO code for the currency being bought.
         */
        private Optional<String> clientBuyCurrency = Optional.empty();

        /**
         * The rate that will be returned to your customer after all spread has been applied.
         */
        private Optional<String> clientRate = Optional.empty();

        /**
         * The amount of sell currency for a client.
         */
        private Optional<String> clientSellAmount = Optional.empty();

        /**
         * Three character ISO code for the currency being sold.
         */
        private Optional<String> clientSellCurrency = Optional.empty();

        /**
         * The market rate.
         */
        private Optional<String> coreRate = Optional.empty();

        /**
         * Concatenated string of the two currencies traded, e.g. "USDEUR".
         */
        private Optional<String> currencyPair = Optional.empty();

        /**
         * The amount of a deposit required.
         */
        private Optional<String> depositAmount = Optional.empty();

        /**
         * Three-letter ISO currency code for the currency the deposit is shown in.
         */
        private Optional<String> depositCurrency = Optional.empty();

        /**
         * Is a deposit required for the conversion?
         */
        private Optional<String> depositRequired = Optional.empty();

        /**
         * Which currency is fixed -  the buy or sell one.
         */
        private Optional<RateDetailedFixedSideEnum> fixedSide = Optional.empty();

        /**
         * The mid point between buy and sell rates.
         */
        private Optional<String> midMarketRate = Optional.empty();

        /**
         * The market rate + Currencycloud's commission (if applicable).
         */
        private Optional<String> partnerRate = Optional.empty();

        /**
         * The date and time by which funds need to be available to settle the trade, in the format YYYY-MM-DDThh:mm:ssZ
         */
        private Optional<String> settlementCutOffTime = Optional.empty();


        private Builder() {}

        public Builder from(RateDetailed other) {
            clientBuyAmount(other.getClientBuyAmount());
            clientBuyCurrency(other.getClientBuyCurrency());
            clientRate(other.getClientRate());
            clientSellAmount(other.getClientSellAmount());
            clientSellCurrency(other.getClientSellCurrency());
            coreRate(other.getCoreRate());
            currencyPair(other.getCurrencyPair());
            depositAmount(other.getDepositAmount());
            depositCurrency(other.getDepositCurrency());
            depositRequired(other.getDepositRequired());
            fixedSide(other.getFixedSide());
            midMarketRate(other.getMidMarketRate());
            partnerRate(other.getPartnerRate());
            settlementCutOffTime(other.getSettlementCutOffTime());
            return this;
        }

        /**
         * Sets value for `clientBuyAmount`
         * The amount of buy currency for a client.
         */
        @JsonSetter("client_buy_amount")
        public Builder clientBuyAmount(Optional<String> clientBuyAmount) {
            this.clientBuyAmount = clientBuyAmount;
            return this;
        }

        /**
         * Sets value for `clientBuyAmount`
         * The amount of buy currency for a client.
         */
        public Builder clientBuyAmount(String clientBuyAmount) {
            return this.clientBuyAmount(Optional.ofNullable(clientBuyAmount));
        }
        /**
         * Sets value for `clientBuyCurrency`
         * Three character ISO code for the currency being bought.
         */
        @JsonSetter("client_buy_currency")
        public Builder clientBuyCurrency(Optional<String> clientBuyCurrency) {
            this.clientBuyCurrency = clientBuyCurrency;
            return this;
        }

        /**
         * Sets value for `clientBuyCurrency`
         * Three character ISO code for the currency being bought.
         */
        public Builder clientBuyCurrency(String clientBuyCurrency) {
            return this.clientBuyCurrency(Optional.ofNullable(clientBuyCurrency));
        }
        /**
         * Sets value for `clientRate`
         * The rate that will be returned to your customer after all spread has been applied.
         */
        @JsonSetter("client_rate")
        public Builder clientRate(Optional<String> clientRate) {
            this.clientRate = clientRate;
            return this;
        }

        /**
         * Sets value for `clientRate`
         * The rate that will be returned to your customer after all spread has been applied.
         */
        public Builder clientRate(String clientRate) {
            return this.clientRate(Optional.ofNullable(clientRate));
        }
        /**
         * Sets value for `clientSellAmount`
         * The amount of sell currency for a client.
         */
        @JsonSetter("client_sell_amount")
        public Builder clientSellAmount(Optional<String> clientSellAmount) {
            this.clientSellAmount = clientSellAmount;
            return this;
        }

        /**
         * Sets value for `clientSellAmount`
         * The amount of sell currency for a client.
         */
        public Builder clientSellAmount(String clientSellAmount) {
            return this.clientSellAmount(Optional.ofNullable(clientSellAmount));
        }
        /**
         * Sets value for `clientSellCurrency`
         * Three character ISO code for the currency being sold.
         */
        @JsonSetter("client_sell_currency")
        public Builder clientSellCurrency(Optional<String> clientSellCurrency) {
            this.clientSellCurrency = clientSellCurrency;
            return this;
        }

        /**
         * Sets value for `clientSellCurrency`
         * Three character ISO code for the currency being sold.
         */
        public Builder clientSellCurrency(String clientSellCurrency) {
            return this.clientSellCurrency(Optional.ofNullable(clientSellCurrency));
        }
        /**
         * Sets value for `coreRate`
         * The market rate.
         */
        @JsonSetter("core_rate")
        public Builder coreRate(Optional<String> coreRate) {
            this.coreRate = coreRate;
            return this;
        }

        /**
         * Sets value for `coreRate`
         * The market rate.
         */
        public Builder coreRate(String coreRate) {
            return this.coreRate(Optional.ofNullable(coreRate));
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
         * Sets value for `depositAmount`
         * The amount of a deposit required.
         */
        @JsonSetter("deposit_amount")
        public Builder depositAmount(Optional<String> depositAmount) {
            this.depositAmount = depositAmount;
            return this;
        }

        /**
         * Sets value for `depositAmount`
         * The amount of a deposit required.
         */
        public Builder depositAmount(String depositAmount) {
            return this.depositAmount(Optional.ofNullable(depositAmount));
        }
        /**
         * Sets value for `depositCurrency`
         * Three-letter ISO currency code for the currency the deposit is shown in.
         */
        @JsonSetter("deposit_currency")
        public Builder depositCurrency(Optional<String> depositCurrency) {
            this.depositCurrency = depositCurrency;
            return this;
        }

        /**
         * Sets value for `depositCurrency`
         * Three-letter ISO currency code for the currency the deposit is shown in.
         */
        public Builder depositCurrency(String depositCurrency) {
            return this.depositCurrency(Optional.ofNullable(depositCurrency));
        }
        /**
         * Sets value for `depositRequired`
         * Is a deposit required for the conversion?
         */
        @JsonSetter("deposit_required")
        public Builder depositRequired(Optional<String> depositRequired) {
            this.depositRequired = depositRequired;
            return this;
        }

        /**
         * Sets value for `depositRequired`
         * Is a deposit required for the conversion?
         */
        public Builder depositRequired(String depositRequired) {
            return this.depositRequired(Optional.ofNullable(depositRequired));
        }
        /**
         * Sets value for `fixedSide`
         * Which currency is fixed -  the buy or sell one.
         */
        @JsonSetter("fixed_side")
        public Builder fixedSide(Optional<RateDetailedFixedSideEnum> fixedSide) {
            this.fixedSide = fixedSide;
            return this;
        }

        /**
         * Sets value for `fixedSide`
         * Which currency is fixed -  the buy or sell one.
         */
        public Builder fixedSide(RateDetailedFixedSideEnum fixedSide) {
            return this.fixedSide(Optional.ofNullable(fixedSide));
        }
        /**
         * Sets value for `midMarketRate`
         * The mid point between buy and sell rates.
         */
        @JsonSetter("mid_market_rate")
        public Builder midMarketRate(Optional<String> midMarketRate) {
            this.midMarketRate = midMarketRate;
            return this;
        }

        /**
         * Sets value for `midMarketRate`
         * The mid point between buy and sell rates.
         */
        public Builder midMarketRate(String midMarketRate) {
            return this.midMarketRate(Optional.ofNullable(midMarketRate));
        }
        /**
         * Sets value for `partnerRate`
         * The market rate + Currencycloud's commission (if applicable).
         */
        @JsonSetter("partner_rate")
        public Builder partnerRate(Optional<String> partnerRate) {
            this.partnerRate = partnerRate;
            return this;
        }

        /**
         * Sets value for `partnerRate`
         * The market rate + Currencycloud's commission (if applicable).
         */
        public Builder partnerRate(String partnerRate) {
            return this.partnerRate(Optional.ofNullable(partnerRate));
        }
        /**
         * Sets value for `settlementCutOffTime`
         * The date and time by which funds need to be available to settle the trade, in the format YYYY-MM-DDThh:mm:ssZ
         */
        @JsonSetter("settlement_cut_off_time")
        public Builder settlementCutOffTime(Optional<String> settlementCutOffTime) {
            this.settlementCutOffTime = settlementCutOffTime;
            return this;
        }

        /**
         * Sets value for `settlementCutOffTime`
         * The date and time by which funds need to be available to settle the trade, in the format YYYY-MM-DDThh:mm:ssZ
         */
        public Builder settlementCutOffTime(String settlementCutOffTime) {
            return this.settlementCutOffTime(Optional.ofNullable(settlementCutOffTime));
        }



        public RateDetailed build() {
            return new RateDetailed(this);
        }
    }

}



