
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
 * Payment Fee Assignment.
 */
@JsonDeserialize(builder = PaymentFeeAssignment.Builder.class)
public final class PaymentFeeAssignment {
    /**
     * ID of the sub-account the rule is assigned to.
     */
    private final String accountId;

    /**
     * ID of the payment fee.
     */
    private final String id;

    private final Map<String, Object> additionalProperties;


    private PaymentFeeAssignment(Builder builder) {
        this.accountId = builder.accountId;
        this.id = builder.id;
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
    /**
     * Retrieves value for `id`
     * ID of the payment fee.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof PaymentFeeAssignment && equalTo((PaymentFeeAssignment) other);
    }

    private boolean equalTo(PaymentFeeAssignment other) {
        return
            accountId.equals(other.accountId) &&

            id.equals(other.id)
            &&
            additionalProperties.equals(other.additionalProperties)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountId,
                   this.id
                   ,
                   this.additionalProperties
               );
    }

    @Override
    public String toString() {
        return "PaymentFeeAssignment{" +
               "accountId=" + accountId + ", " +
               "id=" + id +
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

        /**
         * ID of the payment fee.
         */
        private String id = null;

        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(PaymentFeeAssignment other) {
            accountId(other.getAccountId());
            id(other.getId());
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
        /**
         * Sets value for `id`
         * ID of the payment fee.
         */
        @JsonSetter("id")
        public Builder id(String id) {
            if (id == null) {
                throw new IllegalArgumentException("id cannot be null");
            }

            this.id = id;
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



        public PaymentFeeAssignment build() {
            if (accountId == null) {
                throw new IllegalStateException("accountId is required");
            }

            if (id == null) {
                throw new IllegalStateException("id is required");
            }

            return new PaymentFeeAssignment(this);
        }
    }

}



