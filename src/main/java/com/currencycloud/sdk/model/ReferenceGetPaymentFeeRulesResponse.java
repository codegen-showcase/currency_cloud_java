
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
 * ReferenceGetPaymentFeeRulesResponse
 */
@JsonDeserialize(builder = ReferenceGetPaymentFeeRulesResponse.Builder.class)
public final class ReferenceGetPaymentFeeRulesResponse {
    private final Optional<List<PaymentFeeRule>> paymentFeeRules;


    private ReferenceGetPaymentFeeRulesResponse(Builder builder) {
        this.paymentFeeRules = builder.paymentFeeRules;
    }

    /**
     * Retrieves value for `paymentFeeRules`
     */
    @JsonProperty("payment_fee_rules")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<PaymentFeeRule>> getPaymentFeeRules() {
        return paymentFeeRules;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof ReferenceGetPaymentFeeRulesResponse &&
               equalTo((ReferenceGetPaymentFeeRulesResponse) other);
    }

    private boolean equalTo(ReferenceGetPaymentFeeRulesResponse other) {
        return
            paymentFeeRules.equals(other.paymentFeeRules)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.paymentFeeRules
               );
    }

    @Override
    public String toString() {
        return "ReferenceGetPaymentFeeRulesResponse{" +
               "paymentFeeRules=" + paymentFeeRules +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<List<PaymentFeeRule>> paymentFeeRules = Optional.empty();


        private Builder() {}

        public Builder from(ReferenceGetPaymentFeeRulesResponse other) {
            paymentFeeRules(other.getPaymentFeeRules());
            return this;
        }

        /**
         * Sets value for `paymentFeeRules`
         */
        @JsonSetter("payment_fee_rules")
        public Builder paymentFeeRules(Optional<List<PaymentFeeRule>> paymentFeeRules) {
            this.paymentFeeRules = paymentFeeRules;
            return this;
        }

        /**
         * Sets value for `paymentFeeRules`
         */
        public Builder paymentFeeRules(List<PaymentFeeRule> paymentFeeRules) {
            return this.paymentFeeRules(Optional.ofNullable(paymentFeeRules));
        }



        public ReferenceGetPaymentFeeRulesResponse build() {
            return new ReferenceGetPaymentFeeRulesResponse(this);
        }
    }

}



