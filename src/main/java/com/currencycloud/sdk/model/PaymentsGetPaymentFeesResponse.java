
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
 * PaymentsGetPaymentFeesResponse
 */
@JsonDeserialize(builder = PaymentsGetPaymentFeesResponse.Builder.class)
public final class PaymentsGetPaymentFeesResponse {
    /**
     * Pagination.
     */
    private final Optional<Pagination> pagination;

    private final Optional<List<PaymentFee>> paymentFees;


    private PaymentsGetPaymentFeesResponse(Builder builder) {
        this.pagination = builder.pagination;
        this.paymentFees = builder.paymentFees;
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
     * Retrieves value for `paymentFees`
     */
    @JsonProperty("payment_fees")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<PaymentFee>> getPaymentFees() {
        return paymentFees;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof PaymentsGetPaymentFeesResponse &&
               equalTo((PaymentsGetPaymentFeesResponse) other);
    }

    private boolean equalTo(PaymentsGetPaymentFeesResponse other) {
        return
            pagination.equals(other.pagination) &&

            paymentFees.equals(other.paymentFees)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.pagination,
                   this.paymentFees
               );
    }

    @Override
    public String toString() {
        return "PaymentsGetPaymentFeesResponse{" +
               "pagination=" + pagination + ", " +
               "paymentFees=" + paymentFees +
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

        private Optional<List<PaymentFee>> paymentFees = Optional.empty();


        private Builder() {}

        public Builder from(PaymentsGetPaymentFeesResponse other) {
            pagination(other.getPagination());
            paymentFees(other.getPaymentFees());
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
         * Sets value for `paymentFees`
         */
        @JsonSetter("payment_fees")
        public Builder paymentFees(Optional<List<PaymentFee>> paymentFees) {
            this.paymentFees = paymentFees;
            return this;
        }

        /**
         * Sets value for `paymentFees`
         */
        public Builder paymentFees(List<PaymentFee> paymentFees) {
            return this.paymentFees(Optional.ofNullable(paymentFees));
        }



        public PaymentsGetPaymentFeesResponse build() {
            return new PaymentsGetPaymentFeesResponse(this);
        }
    }

}



