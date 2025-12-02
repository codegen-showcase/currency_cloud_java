
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Available currencies
 */
@JsonDeserialize(builder = AvailableCurrencies.Builder.class)
public final class AvailableCurrencies {
    /**
     * Can the currency be bought?
     */
    private final Optional<Boolean> canBuy;

    /**
     * Can the currency be sold?
     */
    private final Optional<Boolean> canSell;

    /**
     * Three-letter ISO currency code.
     */
    private final Optional<String> code;

    /**
     * The number of decimal places used by the currency.
     */
    private final Optional<Long> decimalPlaces;

    /**
     * The name of the currency.
     */
    private final Optional<String> name;

    /**
     * Can the currency be traded online?
     */
    private final Optional<Boolean> onlineTrading;


    private AvailableCurrencies(Builder builder) {
        this.canBuy = builder.canBuy;
        this.canSell = builder.canSell;
        this.code = builder.code;
        this.decimalPlaces = builder.decimalPlaces;
        this.name = builder.name;
        this.onlineTrading = builder.onlineTrading;
    }

    /**
     * Retrieves value for `canBuy`
     * Can the currency be bought?
     */
    @JsonProperty("can_buy")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getCanBuy() {
        return canBuy;
    }
    /**
     * Retrieves value for `canSell`
     * Can the currency be sold?
     */
    @JsonProperty("can_sell")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getCanSell() {
        return canSell;
    }
    /**
     * Retrieves value for `code`
     * Three-letter ISO currency code.
     */
    @JsonProperty("code")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCode() {
        return code;
    }
    /**
     * Retrieves value for `decimalPlaces`
     * The number of decimal places used by the currency.
     */
    @JsonProperty("decimal_places")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Long> getDecimalPlaces() {
        return decimalPlaces;
    }
    /**
     * Retrieves value for `name`
     * The name of the currency.
     */
    @JsonProperty("name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getName() {
        return name;
    }
    /**
     * Retrieves value for `onlineTrading`
     * Can the currency be traded online?
     */
    @JsonProperty("online_trading")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getOnlineTrading() {
        return onlineTrading;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof AvailableCurrencies && equalTo((AvailableCurrencies) other);
    }

    private boolean equalTo(AvailableCurrencies other) {
        return
            canBuy.equals(other.canBuy) &&

            canSell.equals(other.canSell) &&

            code.equals(other.code) &&

            decimalPlaces.equals(other.decimalPlaces) &&

            name.equals(other.name) &&

            onlineTrading.equals(other.onlineTrading)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.canBuy,
                   this.canSell,
                   this.code,
                   this.decimalPlaces,
                   this.name,
                   this.onlineTrading
               );
    }

    @Override
    public String toString() {
        return "AvailableCurrencies{" +
               "canBuy=" + canBuy + ", " +
               "canSell=" + canSell + ", " +
               "code=" + code + ", " +
               "decimalPlaces=" + decimalPlaces + ", " +
               "name=" + name + ", " +
               "onlineTrading=" + onlineTrading +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Can the currency be bought?
         */
        private Optional<Boolean> canBuy = Optional.empty();

        /**
         * Can the currency be sold?
         */
        private Optional<Boolean> canSell = Optional.empty();

        /**
         * Three-letter ISO currency code.
         */
        private Optional<String> code = Optional.empty();

        /**
         * The number of decimal places used by the currency.
         */
        private Optional<Long> decimalPlaces = Optional.empty();

        /**
         * The name of the currency.
         */
        private Optional<String> name = Optional.empty();

        /**
         * Can the currency be traded online?
         */
        private Optional<Boolean> onlineTrading = Optional.empty();


        private Builder() {}

        public Builder from(AvailableCurrencies other) {
            canBuy(other.getCanBuy());
            canSell(other.getCanSell());
            code(other.getCode());
            decimalPlaces(other.getDecimalPlaces());
            name(other.getName());
            onlineTrading(other.getOnlineTrading());
            return this;
        }

        /**
         * Sets value for `canBuy`
         * Can the currency be bought?
         */
        @JsonSetter("can_buy")
        public Builder canBuy(Optional<Boolean> canBuy) {
            this.canBuy = canBuy;
            return this;
        }

        /**
         * Sets value for `canBuy`
         * Can the currency be bought?
         */
        public Builder canBuy(Boolean canBuy) {
            return this.canBuy(Optional.ofNullable(canBuy));
        }
        /**
         * Sets value for `canSell`
         * Can the currency be sold?
         */
        @JsonSetter("can_sell")
        public Builder canSell(Optional<Boolean> canSell) {
            this.canSell = canSell;
            return this;
        }

        /**
         * Sets value for `canSell`
         * Can the currency be sold?
         */
        public Builder canSell(Boolean canSell) {
            return this.canSell(Optional.ofNullable(canSell));
        }
        /**
         * Sets value for `code`
         * Three-letter ISO currency code.
         */
        @JsonSetter("code")
        public Builder code(Optional<String> code) {
            this.code = code;
            return this;
        }

        /**
         * Sets value for `code`
         * Three-letter ISO currency code.
         */
        public Builder code(String code) {
            return this.code(Optional.ofNullable(code));
        }
        /**
         * Sets value for `decimalPlaces`
         * The number of decimal places used by the currency.
         */
        @JsonSetter("decimal_places")
        public Builder decimalPlaces(Optional<Long> decimalPlaces) {
            this.decimalPlaces = decimalPlaces;
            return this;
        }

        /**
         * Sets value for `decimalPlaces`
         * The number of decimal places used by the currency.
         */
        public Builder decimalPlaces(Long decimalPlaces) {
            return this.decimalPlaces(Optional.ofNullable(decimalPlaces));
        }
        /**
         * Sets value for `name`
         * The name of the currency.
         */
        @JsonSetter("name")
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        /**
         * Sets value for `name`
         * The name of the currency.
         */
        public Builder name(String name) {
            return this.name(Optional.ofNullable(name));
        }
        /**
         * Sets value for `onlineTrading`
         * Can the currency be traded online?
         */
        @JsonSetter("online_trading")
        public Builder onlineTrading(Optional<Boolean> onlineTrading) {
            this.onlineTrading = onlineTrading;
            return this;
        }

        /**
         * Sets value for `onlineTrading`
         * Can the currency be traded online?
         */
        public Builder onlineTrading(Boolean onlineTrading) {
            return this.onlineTrading(Optional.ofNullable(onlineTrading));
        }



        public AvailableCurrencies build() {
            return new AvailableCurrencies(this);
        }
    }

}



