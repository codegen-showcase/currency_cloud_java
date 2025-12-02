
package com.currencycloud.sdk.model;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * PaymentsFindResponse
 */
@JsonDeserialize(builder = PaymentsFindResponse.Builder.class)
public final class PaymentsFindResponse {
    /**
     * Pagination.
     */
    private final Optional<Pagination> pagination;

    private final Optional<List<Payment>> payments;


    private PaymentsFindResponse(Builder builder) {
        this.pagination = builder.pagination;
        this.payments = builder.payments;
    }

    /**
     * Retrieves value for `pagination`
     * Pagination.
     */
    @JsonProperty("pagination")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Pagination> getPagination() {
        return pagination;
    }
    /**
     * Retrieves value for `payments`
     */
    @JsonProperty("payments")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<Payment>> getPayments() {
        return payments;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof PaymentsFindResponse && equalTo((PaymentsFindResponse) other);
    }

    private boolean equalTo(PaymentsFindResponse other) {
        return
            pagination.equals(other.pagination) &&

            payments.equals(other.payments)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.pagination,
                   this.payments
               );
    }

    @Override
    public String toString() {
        return "PaymentsFindResponse{" +
               "pagination=" + pagination + ", " +
               "payments=" + payments +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Pagination.
         */
        private Optional<Pagination> pagination = Optional.empty();

        private Optional<List<Payment>> payments = Optional.empty();


        private Builder() {}

        public Builder from(PaymentsFindResponse other) {
            pagination(other.getPagination());
            payments(other.getPayments());
            return this;
        }

        /**
         * Sets value for `pagination`
         * Pagination.
         */
        @JsonSetter("pagination")
        public Builder pagination(Optional<Pagination> pagination) {
            this.pagination = pagination;
            return this;
        }

        /**
         * Sets value for `pagination`
         * Pagination.
         */
        public Builder pagination(Pagination pagination) {
            return this.pagination(Optional.ofNullable(pagination));
        }
        /**
         * Sets value for `payments`
         */
        @JsonSetter("payments")
        public Builder payments(Optional<List<Payment>> payments) {
            this.payments = payments;
            return this;
        }

        /**
         * Sets value for `payments`
         */
        public Builder payments(List<Payment> payments) {
            return this.payments(Optional.ofNullable(payments));
        }



        public PaymentsFindResponse build() {
            return new PaymentsFindResponse(this);
        }
    }

}



