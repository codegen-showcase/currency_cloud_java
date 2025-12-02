
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * ConversionSplitDetails
 */
@JsonDeserialize(builder = ConversionSplitDetails.Builder.class)
public final class ConversionSplitDetails {
    /**
     * The amount of the buy_currency being bought.
     */
    private final Optional<String> buyAmount;

    /**
     * Three character ISO code for currency bought.
     */
    private final Optional<String> buyCurrency;

    /**
     * The date the conversion will be made.
     */
    private final Optional<String> conversionDate;

    /**
     * Conversion ID
     */
    private final Optional<String> id;

    /**
     * The amount of the sell_currency being sold.
     */
    private final Optional<String> sellAmount;

    /**
     * Three character ISO code for currency sold.
     */
    private final Optional<String> sellCurrency;

    /**
     * The date and time by which funds need to be available to settle the trade.
     */
    private final Optional<String> settlementDate;

    /**
     * A human readable unique trade indentifier, in the format YYYYMMDD-XXXXXX.
     */
    private final Optional<String> shortReference;

    /**
     * Status of the related trade.
     */
    private final Optional<ConversionSplitDetailsStatusEnum> status;


    private ConversionSplitDetails(Builder builder) {
        this.buyAmount = builder.buyAmount;
        this.buyCurrency = builder.buyCurrency;
        this.conversionDate = builder.conversionDate;
        this.id = builder.id;
        this.sellAmount = builder.sellAmount;
        this.sellCurrency = builder.sellCurrency;
        this.settlementDate = builder.settlementDate;
        this.shortReference = builder.shortReference;
        this.status = builder.status;
    }

    /**
     * Retrieves value for `buyAmount`
     * The amount of the buy_currency being bought.
     */
    @JsonProperty("buy_amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBuyAmount() {
        return buyAmount;
    }
    /**
     * Retrieves value for `buyCurrency`
     * Three character ISO code for currency bought.
     */
    @JsonProperty("buy_currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBuyCurrency() {
        return buyCurrency;
    }
    /**
     * Retrieves value for `conversionDate`
     * The date the conversion will be made.
     */
    @JsonProperty("conversion_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getConversionDate() {
        return conversionDate;
    }
    /**
     * Retrieves value for `id`
     * Conversion ID
     */
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getId() {
        return id;
    }
    /**
     * Retrieves value for `sellAmount`
     * The amount of the sell_currency being sold.
     */
    @JsonProperty("sell_amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSellAmount() {
        return sellAmount;
    }
    /**
     * Retrieves value for `sellCurrency`
     * Three character ISO code for currency sold.
     */
    @JsonProperty("sell_currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSellCurrency() {
        return sellCurrency;
    }
    /**
     * Retrieves value for `settlementDate`
     * The date and time by which funds need to be available to settle the trade.
     */
    @JsonProperty("settlement_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSettlementDate() {
        return settlementDate;
    }
    /**
     * Retrieves value for `shortReference`
     * A human readable unique trade indentifier, in the format YYYYMMDD-XXXXXX.
     */
    @JsonProperty("short_reference")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getShortReference() {
        return shortReference;
    }
    /**
     * Retrieves value for `status`
     * Status of the related trade.
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ConversionSplitDetailsStatusEnum> getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof ConversionSplitDetails && equalTo((ConversionSplitDetails) other);
    }

    private boolean equalTo(ConversionSplitDetails other) {
        return
            buyAmount.equals(other.buyAmount) &&

            buyCurrency.equals(other.buyCurrency) &&

            conversionDate.equals(other.conversionDate) &&

            id.equals(other.id) &&

            sellAmount.equals(other.sellAmount) &&

            sellCurrency.equals(other.sellCurrency) &&

            settlementDate.equals(other.settlementDate) &&

            shortReference.equals(other.shortReference) &&

            status.equals(other.status)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.buyAmount,
                   this.buyCurrency,
                   this.conversionDate,
                   this.id,
                   this.sellAmount,
                   this.sellCurrency,
                   this.settlementDate,
                   this.shortReference,
                   this.status
               );
    }

    @Override
    public String toString() {
        return "ConversionSplitDetails{" +
               "buyAmount=" + buyAmount + ", " +
               "buyCurrency=" + buyCurrency + ", " +
               "conversionDate=" + conversionDate + ", " +
               "id=" + id + ", " +
               "sellAmount=" + sellAmount + ", " +
               "sellCurrency=" + sellCurrency + ", " +
               "settlementDate=" + settlementDate + ", " +
               "shortReference=" + shortReference + ", " +
               "status=" + status +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The amount of the buy_currency being bought.
         */
        private Optional<String> buyAmount = Optional.empty();

        /**
         * Three character ISO code for currency bought.
         */
        private Optional<String> buyCurrency = Optional.empty();

        /**
         * The date the conversion will be made.
         */
        private Optional<String> conversionDate = Optional.empty();

        /**
         * Conversion ID
         */
        private Optional<String> id = Optional.empty();

        /**
         * The amount of the sell_currency being sold.
         */
        private Optional<String> sellAmount = Optional.empty();

        /**
         * Three character ISO code for currency sold.
         */
        private Optional<String> sellCurrency = Optional.empty();

        /**
         * The date and time by which funds need to be available to settle the trade.
         */
        private Optional<String> settlementDate = Optional.empty();

        /**
         * A human readable unique trade indentifier, in the format YYYYMMDD-XXXXXX.
         */
        private Optional<String> shortReference = Optional.empty();

        /**
         * Status of the related trade.
         */
        private Optional<ConversionSplitDetailsStatusEnum> status = Optional.empty();


        private Builder() {}

        public Builder from(ConversionSplitDetails other) {
            buyAmount(other.getBuyAmount());
            buyCurrency(other.getBuyCurrency());
            conversionDate(other.getConversionDate());
            id(other.getId());
            sellAmount(other.getSellAmount());
            sellCurrency(other.getSellCurrency());
            settlementDate(other.getSettlementDate());
            shortReference(other.getShortReference());
            status(other.getStatus());
            return this;
        }

        /**
         * Sets value for `buyAmount`
         * The amount of the buy_currency being bought.
         */
        @JsonSetter("buy_amount")
        public Builder buyAmount(Optional<String> buyAmount) {
            this.buyAmount = buyAmount;
            return this;
        }

        /**
         * Sets value for `buyAmount`
         * The amount of the buy_currency being bought.
         */
        public Builder buyAmount(String buyAmount) {
            return this.buyAmount(Optional.ofNullable(buyAmount));
        }
        /**
         * Sets value for `buyCurrency`
         * Three character ISO code for currency bought.
         */
        @JsonSetter("buy_currency")
        public Builder buyCurrency(Optional<String> buyCurrency) {
            this.buyCurrency = buyCurrency;
            return this;
        }

        /**
         * Sets value for `buyCurrency`
         * Three character ISO code for currency bought.
         */
        public Builder buyCurrency(String buyCurrency) {
            return this.buyCurrency(Optional.ofNullable(buyCurrency));
        }
        /**
         * Sets value for `conversionDate`
         * The date the conversion will be made.
         */
        @JsonSetter("conversion_date")
        public Builder conversionDate(Optional<String> conversionDate) {
            this.conversionDate = conversionDate;
            return this;
        }

        /**
         * Sets value for `conversionDate`
         * The date the conversion will be made.
         */
        public Builder conversionDate(String conversionDate) {
            return this.conversionDate(Optional.ofNullable(conversionDate));
        }
        /**
         * Sets value for `id`
         * Conversion ID
         */
        @JsonSetter("id")
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        /**
         * Sets value for `id`
         * Conversion ID
         */
        public Builder id(String id) {
            return this.id(Optional.ofNullable(id));
        }
        /**
         * Sets value for `sellAmount`
         * The amount of the sell_currency being sold.
         */
        @JsonSetter("sell_amount")
        public Builder sellAmount(Optional<String> sellAmount) {
            this.sellAmount = sellAmount;
            return this;
        }

        /**
         * Sets value for `sellAmount`
         * The amount of the sell_currency being sold.
         */
        public Builder sellAmount(String sellAmount) {
            return this.sellAmount(Optional.ofNullable(sellAmount));
        }
        /**
         * Sets value for `sellCurrency`
         * Three character ISO code for currency sold.
         */
        @JsonSetter("sell_currency")
        public Builder sellCurrency(Optional<String> sellCurrency) {
            this.sellCurrency = sellCurrency;
            return this;
        }

        /**
         * Sets value for `sellCurrency`
         * Three character ISO code for currency sold.
         */
        public Builder sellCurrency(String sellCurrency) {
            return this.sellCurrency(Optional.ofNullable(sellCurrency));
        }
        /**
         * Sets value for `settlementDate`
         * The date and time by which funds need to be available to settle the trade.
         */
        @JsonSetter("settlement_date")
        public Builder settlementDate(Optional<String> settlementDate) {
            this.settlementDate = settlementDate;
            return this;
        }

        /**
         * Sets value for `settlementDate`
         * The date and time by which funds need to be available to settle the trade.
         */
        public Builder settlementDate(String settlementDate) {
            return this.settlementDate(Optional.ofNullable(settlementDate));
        }
        /**
         * Sets value for `shortReference`
         * A human readable unique trade indentifier, in the format YYYYMMDD-XXXXXX.
         */
        @JsonSetter("short_reference")
        public Builder shortReference(Optional<String> shortReference) {
            this.shortReference = shortReference;
            return this;
        }

        /**
         * Sets value for `shortReference`
         * A human readable unique trade indentifier, in the format YYYYMMDD-XXXXXX.
         */
        public Builder shortReference(String shortReference) {
            return this.shortReference(Optional.ofNullable(shortReference));
        }
        /**
         * Sets value for `status`
         * Status of the related trade.
         */
        @JsonSetter("status")
        public Builder status(Optional<ConversionSplitDetailsStatusEnum> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets value for `status`
         * Status of the related trade.
         */
        public Builder status(ConversionSplitDetailsStatusEnum status) {
            return this.status(Optional.ofNullable(status));
        }



        public ConversionSplitDetails build() {
            return new ConversionSplitDetails(this);
        }
    }

}



