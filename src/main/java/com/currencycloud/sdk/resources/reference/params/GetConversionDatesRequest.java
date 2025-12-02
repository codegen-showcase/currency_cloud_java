
package com.currencycloud.sdk.resources.reference.params;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * GetConversionDatesRequest
 */
@JsonDeserialize(builder = GetConversionDatesRequest.Builder.class)
public final class GetConversionDatesRequest {
    /**
     * Concatenated string of the currency codes for the two currencies involved, e.g. "USDEUR".
     */
    private final String conversionPair;

    /**
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    private final Optional<String> onBehalfOf;

    /**
     * Start date of conversion. ISO 8601 format YYYY-MM-DD.
     */
    private final Optional<String> startDate;


    private GetConversionDatesRequest(Builder builder) {
        this.conversionPair = builder.conversionPair;
        this.onBehalfOf = builder.onBehalfOf;
        this.startDate = builder.startDate;
    }

    /**
     * Retrieves value for `conversionPair`
     * Concatenated string of the currency codes for the two currencies involved, e.g. "USDEUR".
     */
    @JsonProperty("conversion_pair")
    public String getConversionPair() {
        return conversionPair;
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
     * Retrieves value for `startDate`
     * Start date of conversion. ISO 8601 format YYYY-MM-DD.
     */
    @JsonProperty("start_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getStartDate() {
        return startDate;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof GetConversionDatesRequest && equalTo((GetConversionDatesRequest) other);
    }

    private boolean equalTo(GetConversionDatesRequest other) {
        return
            conversionPair.equals(other.conversionPair) &&

            onBehalfOf.equals(other.onBehalfOf) &&

            startDate.equals(other.startDate)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.conversionPair,
                   this.onBehalfOf,
                   this.startDate
               );
    }

    @Override
    public String toString() {
        return "GetConversionDatesRequest{" +
               "conversionPair=" + conversionPair + ", " +
               "onBehalfOf=" + onBehalfOf + ", " +
               "startDate=" + startDate +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Concatenated string of the currency codes for the two currencies involved, e.g. "USDEUR".
         */
        private String conversionPair = null;

        /**
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        private Optional<String> onBehalfOf = Optional.empty();

        /**
         * Start date of conversion. ISO 8601 format YYYY-MM-DD.
         */
        private Optional<String> startDate = Optional.empty();


        private Builder() {}

        public Builder from(GetConversionDatesRequest other) {
            conversionPair(other.getConversionPair());
            onBehalfOf(other.getOnBehalfOf());
            startDate(other.getStartDate());
            return this;
        }

        /**
         * Sets value for `conversionPair`
         * Concatenated string of the currency codes for the two currencies involved, e.g. "USDEUR".
         */
        @JsonSetter("conversion_pair")
        public Builder conversionPair(String conversionPair) {
            if (conversionPair == null) {
                throw new IllegalArgumentException("conversionPair cannot be null");
            }

            this.conversionPair = conversionPair;
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
         * Sets value for `startDate`
         * Start date of conversion. ISO 8601 format YYYY-MM-DD.
         */
        @JsonSetter("start_date")
        public Builder startDate(Optional<String> startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * Sets value for `startDate`
         * Start date of conversion. ISO 8601 format YYYY-MM-DD.
         */
        public Builder startDate(String startDate) {
            return this.startDate(Optional.ofNullable(startDate));
        }



        public GetConversionDatesRequest build() {
            if (conversionPair == null) {
                throw new IllegalStateException("conversionPair is required");
            }

            return new GetConversionDatesRequest(this);
        }
    }

}



