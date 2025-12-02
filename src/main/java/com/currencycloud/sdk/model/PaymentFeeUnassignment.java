
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
 * Payment fee unassignment.
 */
@JsonDeserialize(builder = PaymentFeeUnassignment.Builder.class)
public final class PaymentFeeUnassignment {
    /**
     * ID of the sub-account the rule is assigned to.
     */
    private final String accountId;

    private final Map<String, Object> additionalProperties;


    private PaymentFeeUnassignment(Builder builder) {
        this.accountId = builder.accountId;
        this.additionalProperties = builder.additionalProperties;
    }

    /**
     * Retrieves value for `accountId`
     * ID of the sub-account the rule is assigned to.
     */
    @JsonProperty("account_id")
    public String getAccountId() {
        return accountId;
    }
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof PaymentFeeUnassignment && equalTo((PaymentFeeUnassignment) other);
    }

    private boolean equalTo(PaymentFeeUnassignment other) {
        return
            accountId.equals(other.accountId)
            &&
            additionalProperties.equals(other.additionalProperties)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountId
                   ,
                   this.additionalProperties
               );
    }

    @Override
    public String toString() {
        return "PaymentFeeUnassignment{" +
               "accountId=" + accountId +
               ", additionalProperties=" + additionalProperties +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * ID of the sub-account the rule is assigned to.
         */
        private String accountId = null;

        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(PaymentFeeUnassignment other) {
            accountId(other.getAccountId());
            additionalProperties(other.getAdditionalProperties());
            return this;
        }

        /**
         * Sets value for `accountId`
         * ID of the sub-account the rule is assigned to.
         */
        @JsonSetter("account_id")
        public Builder accountId(String accountId) {
            if (accountId == null) {
                throw new IllegalArgumentException("accountId cannot be null");
            }

            this.accountId = accountId;
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



        public PaymentFeeUnassignment build() {
            if (accountId == null) {
                throw new IllegalStateException("accountId is required");
            }

            return new PaymentFeeUnassignment(this);
        }
    }

}



