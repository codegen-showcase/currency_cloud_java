
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
 * Conversion dates.
 */
@JsonDeserialize(builder = ConversionDates.Builder.class)
public final class ConversionDates {
    /**
     * The default available date that a trade can be made on, in the format YYYY-MM-DD.
     */
    private final Optional<String> defaultConversionDate;

    /**
     * The first conversion date and cutoff time by when conversions can be created.
     */
    private final Optional<String> firstConversionCutoffDatetime;

    /**
     * The first available date that a trade can be made on, in the format YYYY-MM-DD.
     */
    private final Optional<String> firstConversionDate;

    private final Optional<Map<String, String>> invalidConversionDates;

    /**
     * The next available date that a trade can be made on, in the format YYYY-MM-DD.
     */
    private final Optional<String> nextDayConversionDate;

    private final Optional<List<String>> offlineConversionDates;

    /**
     * Optimal conversion date for maximizing chances of getting a successful rate.
     */
    private final Optional<String> optimizeLiquidityConversionDate;


    private ConversionDates(Builder builder) {
        this.defaultConversionDate = builder.defaultConversionDate;
        this.firstConversionCutoffDatetime = builder.firstConversionCutoffDatetime;
        this.firstConversionDate = builder.firstConversionDate;
        this.invalidConversionDates = builder.invalidConversionDates;
        this.nextDayConversionDate = builder.nextDayConversionDate;
        this.offlineConversionDates = builder.offlineConversionDates;
        this.optimizeLiquidityConversionDate = builder.optimizeLiquidityConversionDate;
    }

    /**
     * Retrieves value for `defaultConversionDate`
     * The default available date that a trade can be made on, in the format YYYY-MM-DD.
     */
    @JsonProperty("default_conversion_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getDefaultConversionDate() {
        return defaultConversionDate;
    }
    /**
     * Retrieves value for `firstConversionCutoffDatetime`
     * The first conversion date and cutoff time by when conversions can be created.
     */
    @JsonProperty("first_conversion_cutoff_datetime")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getFirstConversionCutoffDatetime() {
        return firstConversionCutoffDatetime;
    }
    /**
     * Retrieves value for `firstConversionDate`
     * The first available date that a trade can be made on, in the format YYYY-MM-DD.
     */
    @JsonProperty("first_conversion_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getFirstConversionDate() {
        return firstConversionDate;
    }
    /**
     * Retrieves value for `invalidConversionDates`
     */
    @JsonProperty("invalid_conversion_dates")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Map<String, String>> getInvalidConversionDates() {
        return invalidConversionDates;
    }
    /**
     * Retrieves value for `nextDayConversionDate`
     * The next available date that a trade can be made on, in the format YYYY-MM-DD.
     */
    @JsonProperty("next_day_conversion_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getNextDayConversionDate() {
        return nextDayConversionDate;
    }
    /**
     * Retrieves value for `offlineConversionDates`
     */
    @JsonProperty("offline_conversion_dates")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<String>> getOfflineConversionDates() {
        return offlineConversionDates;
    }
    /**
     * Retrieves value for `optimizeLiquidityConversionDate`
     * Optimal conversion date for maximizing chances of getting a successful rate.
     */
    @JsonProperty("optimize_liquidity_conversion_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getOptimizeLiquidityConversionDate() {
        return optimizeLiquidityConversionDate;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof ConversionDates && equalTo((ConversionDates) other);
    }

    private boolean equalTo(ConversionDates other) {
        return
            defaultConversionDate.equals(other.defaultConversionDate) &&

            firstConversionCutoffDatetime.equals(other.firstConversionCutoffDatetime) &&

            firstConversionDate.equals(other.firstConversionDate) &&

            invalidConversionDates.equals(other.invalidConversionDates) &&

            nextDayConversionDate.equals(other.nextDayConversionDate) &&

            offlineConversionDates.equals(other.offlineConversionDates) &&

            optimizeLiquidityConversionDate.equals(other.optimizeLiquidityConversionDate)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.defaultConversionDate,
                   this.firstConversionCutoffDatetime,
                   this.firstConversionDate,
                   this.invalidConversionDates,
                   this.nextDayConversionDate,
                   this.offlineConversionDates,
                   this.optimizeLiquidityConversionDate
               );
    }

    @Override
    public String toString() {
        return "ConversionDates{" +
               "defaultConversionDate=" + defaultConversionDate + ", " +
               "firstConversionCutoffDatetime=" + firstConversionCutoffDatetime + ", " +
               "firstConversionDate=" + firstConversionDate + ", " +
               "invalidConversionDates=" + invalidConversionDates + ", " +
               "nextDayConversionDate=" + nextDayConversionDate + ", " +
               "offlineConversionDates=" + offlineConversionDates + ", " +
               "optimizeLiquidityConversionDate=" + optimizeLiquidityConversionDate +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The default available date that a trade can be made on, in the format YYYY-MM-DD.
         */
        private Optional<String> defaultConversionDate = Optional.empty();

        /**
         * The first conversion date and cutoff time by when conversions can be created.
         */
        private Optional<String> firstConversionCutoffDatetime = Optional.empty();

        /**
         * The first available date that a trade can be made on, in the format YYYY-MM-DD.
         */
        private Optional<String> firstConversionDate = Optional.empty();

        private Optional<Map<String, String>> invalidConversionDates = Optional.empty();

        /**
         * The next available date that a trade can be made on, in the format YYYY-MM-DD.
         */
        private Optional<String> nextDayConversionDate = Optional.empty();

        private Optional<List<String>> offlineConversionDates = Optional.empty();

        /**
         * Optimal conversion date for maximizing chances of getting a successful rate.
         */
        private Optional<String> optimizeLiquidityConversionDate = Optional.empty();


        private Builder() {}

        public Builder from(ConversionDates other) {
            defaultConversionDate(other.getDefaultConversionDate());
            firstConversionCutoffDatetime(other.getFirstConversionCutoffDatetime());
            firstConversionDate(other.getFirstConversionDate());
            invalidConversionDates(other.getInvalidConversionDates());
            nextDayConversionDate(other.getNextDayConversionDate());
            offlineConversionDates(other.getOfflineConversionDates());
            optimizeLiquidityConversionDate(other.getOptimizeLiquidityConversionDate());
            return this;
        }

        /**
         * Sets value for `defaultConversionDate`
         * The default available date that a trade can be made on, in the format YYYY-MM-DD.
         */
        @JsonSetter("default_conversion_date")
        public Builder defaultConversionDate(Optional<String> defaultConversionDate) {
            this.defaultConversionDate = defaultConversionDate;
            return this;
        }

        /**
         * Sets value for `defaultConversionDate`
         * The default available date that a trade can be made on, in the format YYYY-MM-DD.
         */
        public Builder defaultConversionDate(String defaultConversionDate) {
            return this.defaultConversionDate(Optional.ofNullable(defaultConversionDate));
        }
        /**
         * Sets value for `firstConversionCutoffDatetime`
         * The first conversion date and cutoff time by when conversions can be created.
         */
        @JsonSetter("first_conversion_cutoff_datetime")
        public Builder firstConversionCutoffDatetime(Optional<String> firstConversionCutoffDatetime) {
            this.firstConversionCutoffDatetime = firstConversionCutoffDatetime;
            return this;
        }

        /**
         * Sets value for `firstConversionCutoffDatetime`
         * The first conversion date and cutoff time by when conversions can be created.
         */
        public Builder firstConversionCutoffDatetime(String firstConversionCutoffDatetime) {
            return this.firstConversionCutoffDatetime(Optional.ofNullable(firstConversionCutoffDatetime));
        }
        /**
         * Sets value for `firstConversionDate`
         * The first available date that a trade can be made on, in the format YYYY-MM-DD.
         */
        @JsonSetter("first_conversion_date")
        public Builder firstConversionDate(Optional<String> firstConversionDate) {
            this.firstConversionDate = firstConversionDate;
            return this;
        }

        /**
         * Sets value for `firstConversionDate`
         * The first available date that a trade can be made on, in the format YYYY-MM-DD.
         */
        public Builder firstConversionDate(String firstConversionDate) {
            return this.firstConversionDate(Optional.ofNullable(firstConversionDate));
        }
        /**
         * Sets value for `invalidConversionDates`
         */
        @JsonSetter("invalid_conversion_dates")
        public Builder invalidConversionDates(Optional<Map<String, String>> invalidConversionDates) {
            this.invalidConversionDates = invalidConversionDates;
            return this;
        }

        /**
         * Sets value for `invalidConversionDates`
         */
        public Builder invalidConversionDates(Map<String, String> invalidConversionDates) {
            return this.invalidConversionDates(Optional.ofNullable(invalidConversionDates));
        }
        /**
         * Sets value for `nextDayConversionDate`
         * The next available date that a trade can be made on, in the format YYYY-MM-DD.
         */
        @JsonSetter("next_day_conversion_date")
        public Builder nextDayConversionDate(Optional<String> nextDayConversionDate) {
            this.nextDayConversionDate = nextDayConversionDate;
            return this;
        }

        /**
         * Sets value for `nextDayConversionDate`
         * The next available date that a trade can be made on, in the format YYYY-MM-DD.
         */
        public Builder nextDayConversionDate(String nextDayConversionDate) {
            return this.nextDayConversionDate(Optional.ofNullable(nextDayConversionDate));
        }
        /**
         * Sets value for `offlineConversionDates`
         */
        @JsonSetter("offline_conversion_dates")
        public Builder offlineConversionDates(Optional<List<String>> offlineConversionDates) {
            this.offlineConversionDates = offlineConversionDates;
            return this;
        }

        /**
         * Sets value for `offlineConversionDates`
         */
        public Builder offlineConversionDates(List<String> offlineConversionDates) {
            return this.offlineConversionDates(Optional.ofNullable(offlineConversionDates));
        }
        /**
         * Sets value for `optimizeLiquidityConversionDate`
         * Optimal conversion date for maximizing chances of getting a successful rate.
         */
        @JsonSetter("optimize_liquidity_conversion_date")
        public Builder optimizeLiquidityConversionDate(Optional<String> optimizeLiquidityConversionDate) {
            this.optimizeLiquidityConversionDate = optimizeLiquidityConversionDate;
            return this;
        }

        /**
         * Sets value for `optimizeLiquidityConversionDate`
         * Optimal conversion date for maximizing chances of getting a successful rate.
         */
        public Builder optimizeLiquidityConversionDate(String optimizeLiquidityConversionDate) {
            return this.optimizeLiquidityConversionDate(Optional.ofNullable(optimizeLiquidityConversionDate));
        }



        public ConversionDates build() {
            return new ConversionDates(this);
        }
    }

}



