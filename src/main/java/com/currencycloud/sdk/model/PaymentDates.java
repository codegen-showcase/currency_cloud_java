
package com.currencycloud.sdk.model;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Payment dates.
 */
@JsonDeserialize(builder = PaymentDates.Builder.class)
public final class PaymentDates {
    /**
     * Frist possible payment date.
     */
    private final Optional<String> firstPaymentDate;

    /**
     * Invalid payment dates with reason.
     */
    private final Optional<Map<String, String>> invalidPaymentDates;


    private PaymentDates(Builder builder) {
        this.firstPaymentDate = builder.firstPaymentDate;
        this.invalidPaymentDates = builder.invalidPaymentDates;
    }

    /**
     * Retrieves value for `firstPaymentDate`
     * Frist possible payment date.
     */
    @JsonProperty("first_payment_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getFirstPaymentDate() {
        return firstPaymentDate;
    }
    /**
     * Retrieves value for `invalidPaymentDates`
     * Invalid payment dates with reason.
     */
    @JsonProperty("invalid_payment_dates")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Map<String, String>> getInvalidPaymentDates() {
        return invalidPaymentDates;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof PaymentDates && equalTo((PaymentDates) other);
    }

    private boolean equalTo(PaymentDates other) {
        return
            firstPaymentDate.equals(other.firstPaymentDate) &&

            invalidPaymentDates.equals(other.invalidPaymentDates)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.firstPaymentDate,
                   this.invalidPaymentDates
               );
    }

    @Override
    public String toString() {
        return "PaymentDates{" +
               "firstPaymentDate=" + firstPaymentDate + ", " +
               "invalidPaymentDates=" + invalidPaymentDates +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Frist possible payment date.
         */
        private Optional<String> firstPaymentDate = Optional.empty();

        /**
         * Invalid payment dates with reason.
         */
        private Optional<Map<String, String>> invalidPaymentDates = Optional.empty();


        private Builder() {}

        public Builder from(PaymentDates other) {
            firstPaymentDate(other.getFirstPaymentDate());
            invalidPaymentDates(other.getInvalidPaymentDates());
            return this;
        }

        /**
         * Sets value for `firstPaymentDate`
         * Frist possible payment date.
         */
        @JsonSetter("first_payment_date")
        public Builder firstPaymentDate(Optional<String> firstPaymentDate) {
            this.firstPaymentDate = firstPaymentDate;
            return this;
        }

        /**
         * Sets value for `firstPaymentDate`
         * Frist possible payment date.
         */
        public Builder firstPaymentDate(String firstPaymentDate) {
            return this.firstPaymentDate(Optional.ofNullable(firstPaymentDate));
        }
        /**
         * Sets value for `invalidPaymentDates`
         * Invalid payment dates with reason.
         */
        @JsonSetter("invalid_payment_dates")
        public Builder invalidPaymentDates(Optional<Map<String, String>> invalidPaymentDates) {
            this.invalidPaymentDates = invalidPaymentDates;
            return this;
        }

        /**
         * Sets value for `invalidPaymentDates`
         * Invalid payment dates with reason.
         */
        public Builder invalidPaymentDates(Map<String, String> invalidPaymentDates) {
            return this.invalidPaymentDates(Optional.ofNullable(invalidPaymentDates));
        }



        public PaymentDates build() {
            return new PaymentDates(this);
        }
    }

}



