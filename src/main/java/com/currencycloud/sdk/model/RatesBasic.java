
package com.currencycloud.sdk.model;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * RatesBasic
 */
@JsonDeserialize(builder = RatesBasic.Builder.class)
public final class RatesBasic {
    /**
     * Maps currency pairs (eg. "EURUSD", "GBPZAR") to rates. The first number is the bid SPOT rate and the second is the ask SPOT rate. For example, in the EURUSD example response, the first number (1.3803) is the EUR->USD rate and the second number (1.3809) is the USD->EUR rate.
     */
    private final Optional<Map<String, List<String>>> rates;

    /**
     * A list of valid currency pairs that are not currently available.
     */
    private final Optional<Object> unavailable;


    private RatesBasic(Builder builder) {
        this.rates = builder.rates;
        this.unavailable = builder.unavailable;
    }

    /**
     * Retrieves value for `rates`
     * Maps currency pairs (eg. "EURUSD", "GBPZAR") to rates. The first number is the bid SPOT rate and the second is the ask SPOT rate. For example, in the EURUSD example response, the first number (1.3803) is the EUR->USD rate and the second number (1.3809) is the USD->EUR rate.
     */
    @JsonProperty("rates")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Map<String, List<String>>> getRates() {
        return rates;
    }
    /**
     * Retrieves value for `unavailable`
     * A list of valid currency pairs that are not currently available.
     */
    @JsonProperty("unavailable")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Object> getUnavailable() {
        return unavailable;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof RatesBasic && equalTo((RatesBasic) other);
    }

    private boolean equalTo(RatesBasic other) {
        return
            rates.equals(other.rates) &&

            unavailable.equals(other.unavailable)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.rates,
                   this.unavailable
               );
    }

    @Override
    public String toString() {
        return "RatesBasic{" +
               "rates=" + rates + ", " +
               "unavailable=" + unavailable +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Maps currency pairs (eg. "EURUSD", "GBPZAR") to rates. The first number is the bid SPOT rate and the second is the ask SPOT rate. For example, in the EURUSD example response, the first number (1.3803) is the EUR->USD rate and the second number (1.3809) is the USD->EUR rate.
         */
        private Optional<Map<String, List<String>>> rates = Optional.empty();

        /**
         * A list of valid currency pairs that are not currently available.
         */
        private Optional<Object> unavailable = Optional.empty();


        private Builder() {}

        public Builder from(RatesBasic other) {
            rates(other.getRates());
            unavailable(other.getUnavailable());
            return this;
        }

        /**
         * Sets value for `rates`
         * Maps currency pairs (eg. "EURUSD", "GBPZAR") to rates. The first number is the bid SPOT rate and the second is the ask SPOT rate. For example, in the EURUSD example response, the first number (1.3803) is the EUR->USD rate and the second number (1.3809) is the USD->EUR rate.
         */
        @JsonSetter("rates")
        public Builder rates(Optional<Map<String, List<String>>> rates) {
            this.rates = rates;
            return this;
        }

        /**
         * Sets value for `rates`
         * Maps currency pairs (eg. "EURUSD", "GBPZAR") to rates. The first number is the bid SPOT rate and the second is the ask SPOT rate. For example, in the EURUSD example response, the first number (1.3803) is the EUR->USD rate and the second number (1.3809) is the USD->EUR rate.
         */
        public Builder rates(Map<String, List<String>> rates) {
            return this.rates(Optional.ofNullable(rates));
        }
        /**
         * Sets value for `unavailable`
         * A list of valid currency pairs that are not currently available.
         */
        @JsonSetter("unavailable")
        public Builder unavailable(Optional<Object> unavailable) {
            this.unavailable = unavailable;
            return this;
        }

        /**
         * Sets value for `unavailable`
         * A list of valid currency pairs that are not currently available.
         */
        public Builder unavailable(Object unavailable) {
            return this.unavailable(Optional.ofNullable(unavailable));
        }



        public RatesBasic build() {
            return new RatesBasic(this);
        }
    }

}



