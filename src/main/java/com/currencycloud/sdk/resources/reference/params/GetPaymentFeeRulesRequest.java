
package com.currencycloud.sdk.resources.reference.params;

import java.util.Objects;
import java.util.Optional;

import com.currencycloud.sdk.model.ReferenceGetPaymentFeeRulesChargeTypeEnum;
import com.currencycloud.sdk.model.ReferenceGetPaymentFeeRulesPaymentTypeEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * GetPaymentFeeRulesRequest
 */
@JsonDeserialize(builder = GetPaymentFeeRulesRequest.Builder.class)
public final class GetPaymentFeeRulesRequest {
    /**
     * Account UUID
     */
    private final Optional<String> accountId;

    /**
     * Payment charge value. Limits the search results to payments of the specified <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430820-Selecting-payment-charges-for-SWIFT-payments-FAQ">charge type</a> - 'ours' or 'shared'.
     */
    private final Optional<ReferenceGetPaymentFeeRulesChargeTypeEnum> chargeType;

    /**
     * Payment type value. Limits the search results to payments of the specified payment type - 'priority'(Swift) or 'regular'(local).
     */
    private final Optional<ReferenceGetPaymentFeeRulesPaymentTypeEnum> paymentType;


    private GetPaymentFeeRulesRequest(Builder builder) {
        this.accountId = builder.accountId;
        this.chargeType = builder.chargeType;
        this.paymentType = builder.paymentType;
    }

    /**
     * Retrieves value for `accountId`
     * Account UUID
     */
    @JsonProperty("account_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAccountId() {
        return accountId;
    }
    /**
     * Retrieves value for `chargeType`
     * Payment charge value. Limits the search results to payments of the specified <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430820-Selecting-payment-charges-for-SWIFT-payments-FAQ">charge type</a> - 'ours' or 'shared'.
     */
    @JsonProperty("charge_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ReferenceGetPaymentFeeRulesChargeTypeEnum> getChargeType() {
        return chargeType;
    }
    /**
     * Retrieves value for `paymentType`
     * Payment type value. Limits the search results to payments of the specified payment type - 'priority'(Swift) or 'regular'(local).
     */
    @JsonProperty("payment_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ReferenceGetPaymentFeeRulesPaymentTypeEnum> getPaymentType() {
        return paymentType;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof GetPaymentFeeRulesRequest && equalTo((GetPaymentFeeRulesRequest) other);
    }

    private boolean equalTo(GetPaymentFeeRulesRequest other) {
        return
            accountId.equals(other.accountId) &&

            chargeType.equals(other.chargeType) &&

            paymentType.equals(other.paymentType)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountId,
                   this.chargeType,
                   this.paymentType
               );
    }

    @Override
    public String toString() {
        return "GetPaymentFeeRulesRequest{" +
               "accountId=" + accountId + ", " +
               "chargeType=" + chargeType + ", " +
               "paymentType=" + paymentType +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Account UUID
         */
        private Optional<String> accountId = Optional.empty();

        /**
         * Payment charge value. Limits the search results to payments of the specified <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430820-Selecting-payment-charges-for-SWIFT-payments-FAQ">charge type</a> - 'ours' or 'shared'.
         */
        private Optional<ReferenceGetPaymentFeeRulesChargeTypeEnum> chargeType = Optional.empty();

        /**
         * Payment type value. Limits the search results to payments of the specified payment type - 'priority'(Swift) or 'regular'(local).
         */
        private Optional<ReferenceGetPaymentFeeRulesPaymentTypeEnum> paymentType = Optional.empty();


        private Builder() {}

        public Builder from(GetPaymentFeeRulesRequest other) {
            accountId(other.getAccountId());
            chargeType(other.getChargeType());
            paymentType(other.getPaymentType());
            return this;
        }

        /**
         * Sets value for `accountId`
         * Account UUID
         */
        @JsonSetter("account_id")
        public Builder accountId(Optional<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Sets value for `accountId`
         * Account UUID
         */
        public Builder accountId(String accountId) {
            return this.accountId(Optional.ofNullable(accountId));
        }
        /**
         * Sets value for `chargeType`
         * Payment charge value. Limits the search results to payments of the specified <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430820-Selecting-payment-charges-for-SWIFT-payments-FAQ">charge type</a> - 'ours' or 'shared'.
         */
        @JsonSetter("charge_type")
        public Builder chargeType(Optional<ReferenceGetPaymentFeeRulesChargeTypeEnum> chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * Sets value for `chargeType`
         * Payment charge value. Limits the search results to payments of the specified <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430820-Selecting-payment-charges-for-SWIFT-payments-FAQ">charge type</a> - 'ours' or 'shared'.
         */
        public Builder chargeType(ReferenceGetPaymentFeeRulesChargeTypeEnum chargeType) {
            return this.chargeType(Optional.ofNullable(chargeType));
        }
        /**
         * Sets value for `paymentType`
         * Payment type value. Limits the search results to payments of the specified payment type - 'priority'(Swift) or 'regular'(local).
         */
        @JsonSetter("payment_type")
        public Builder paymentType(Optional<ReferenceGetPaymentFeeRulesPaymentTypeEnum> paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Sets value for `paymentType`
         * Payment type value. Limits the search results to payments of the specified payment type - 'priority'(Swift) or 'regular'(local).
         */
        public Builder paymentType(ReferenceGetPaymentFeeRulesPaymentTypeEnum paymentType) {
            return this.paymentType(Optional.ofNullable(paymentType));
        }



        public GetPaymentFeeRulesRequest build() {
            return new GetPaymentFeeRulesRequest(this);
        }
    }

}



