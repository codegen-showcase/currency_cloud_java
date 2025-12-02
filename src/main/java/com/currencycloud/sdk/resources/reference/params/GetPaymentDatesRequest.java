
package com.currencycloud.sdk.resources.reference.params;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * GetPaymentDatesRequest
 */
@JsonDeserialize(builder = GetPaymentDatesRequest.Builder.class)
public final class GetPaymentDatesRequest {
    /**
     * Currency in which payment made. Three-letter ISO currency code.
     */
    private final String currency;

    /**
     * Payment start date, defaults to today's date. ISO 8601 format YYYY-MM-DD.
     */
    private final Optional<String> startDate;


    private GetPaymentDatesRequest(Builder builder) {
        this.currency = builder.currency;
        this.startDate = builder.startDate;
    }

    /**
     * Retrieves value for `currency`
     * Currency in which payment made. Three-letter ISO currency code.
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `startDate`
     * Payment start date, defaults to today's date. ISO 8601 format YYYY-MM-DD.
     */
    @JsonProperty("start_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getStartDate() {
        return startDate;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof GetPaymentDatesRequest && equalTo((GetPaymentDatesRequest) other);
    }

    private boolean equalTo(GetPaymentDatesRequest other) {
        return
            currency.equals(other.currency) &&

            startDate.equals(other.startDate)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.currency,
                   this.startDate
               );
    }

    @Override
    public String toString() {
        return "GetPaymentDatesRequest{" +
               "currency=" + currency + ", " +
               "startDate=" + startDate +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Currency in which payment made. Three-letter ISO currency code.
         */
        private String currency = null;

        /**
         * Payment start date, defaults to today's date. ISO 8601 format YYYY-MM-DD.
         */
        private Optional<String> startDate = Optional.empty();


        private Builder() {}

        public Builder from(GetPaymentDatesRequest other) {
            currency(other.getCurrency());
            startDate(other.getStartDate());
            return this;
        }

        /**
         * Sets value for `currency`
         * Currency in which payment made. Three-letter ISO currency code.
         */
        @JsonSetter("currency")
        public Builder currency(String currency) {
            if (currency == null) {
                throw new IllegalArgumentException("currency cannot be null");
            }

            this.currency = currency;
            return this;
        }
        /**
         * Sets value for `startDate`
         * Payment start date, defaults to today's date. ISO 8601 format YYYY-MM-DD.
         */
        @JsonSetter("start_date")
        public Builder startDate(Optional<String> startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * Sets value for `startDate`
         * Payment start date, defaults to today's date. ISO 8601 format YYYY-MM-DD.
         */
        public Builder startDate(String startDate) {
            return this.startDate(Optional.ofNullable(startDate));
        }



        public GetPaymentDatesRequest build() {
            if (currency == null) {
                throw new IllegalStateException("currency is required");
            }

            return new GetPaymentDatesRequest(this);
        }
    }

}



