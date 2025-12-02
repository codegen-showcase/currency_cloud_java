
package com.currencycloud.sdk.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Bank Details.
 */
@JsonDeserialize(builder = TopUpMarginBalance.Builder.class)
public final class TopUpMarginBalance {
    /**
     * Account identifier
     */
    private final String accountId;

    /**
     * Currency code for currency transferred.
     */
    private final String currency;

    /**
     * Amount of transfer.
     */
    private final String transferredAmount;

    private final Map<String, Object> additionalProperties;


    private TopUpMarginBalance(Builder builder) {
        this.accountId = builder.accountId;
        this.currency = builder.currency;
        this.transferredAmount = builder.transferredAmount;
        this.additionalProperties = builder.additionalProperties;
    }

    /**
     * Retrieves value for `accountId`
     * Account identifier
     */
    @JsonProperty("account_id")
    public String getAccountId() {
        return accountId;
    }
    /**
     * Retrieves value for `currency`
     * Currency code for currency transferred.
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `transferredAmount`
     * Amount of transfer.
     */
    @JsonProperty("transferred_amount")
    public String getTransferredAmount() {
        return transferredAmount;
    }
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof TopUpMarginBalance && equalTo((TopUpMarginBalance) other);
    }

    private boolean equalTo(TopUpMarginBalance other) {
        return
            accountId.equals(other.accountId) &&

            currency.equals(other.currency) &&

            transferredAmount.equals(other.transferredAmount)
            &&
            additionalProperties.equals(other.additionalProperties)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountId,
                   this.currency,
                   this.transferredAmount
                   ,
                   this.additionalProperties
               );
    }

    @Override
    public String toString() {
        return "TopUpMarginBalance{" +
               "accountId=" + accountId + ", " +
               "currency=" + currency + ", " +
               "transferredAmount=" + transferredAmount +
               ", additionalProperties=" + additionalProperties +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Account identifier
         */
        private String accountId = null;

        /**
         * Currency code for currency transferred.
         */
        private String currency = null;

        /**
         * Amount of transfer.
         */
        private String transferredAmount = null;

        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(TopUpMarginBalance other) {
            accountId(other.getAccountId());
            currency(other.getCurrency());
            transferredAmount(other.getTransferredAmount());
            additionalProperties(other.getAdditionalProperties());
            return this;
        }

        /**
         * Sets value for `accountId`
         * Account identifier
         */
        @JsonSetter("account_id")
        public Builder accountId(String accountId) {
            if (accountId == null) {
                throw new IllegalArgumentException("accountId cannot be null");
            }

            this.accountId = accountId;
            return this;
        }
        /**
         * Sets value for `currency`
         * Currency code for currency transferred.
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
         * Sets value for `transferredAmount`
         * Amount of transfer.
         */
        @JsonSetter("transferred_amount")
        public Builder transferredAmount(String transferredAmount) {
            if (transferredAmount == null) {
                throw new IllegalArgumentException("transferredAmount cannot be null");
            }

            this.transferredAmount = transferredAmount;
            return this;
        }

        @JsonAnySetter
        public Builder additionalProperty(String key, Object value) {
            this.additionalProperties.put(key, value);
            return this;
        }

        public Builder additionalProperties(Map<String, Object> additionalProperties) {
            this.additionalProperties.putAll(additionalProperties);
            return this;
        }



        public TopUpMarginBalance build() {
            if (accountId == null) {
                throw new IllegalStateException("accountId is required");
            }

            if (currency == null) {
                throw new IllegalStateException("currency is required");
            }

            if (transferredAmount == null) {
                throw new IllegalStateException("transferredAmount is required");
            }

            return new TopUpMarginBalance(this);
        }
    }

}



