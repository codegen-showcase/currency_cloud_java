
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
 * Payment fee.
 */
@JsonDeserialize(builder = PaymentFee.Builder.class)
public final class PaymentFee {
    /**
     * The fee currency.
     */
    private final String currency;

    /**
     * ID of the payment fee.
     */
    private final String id;

    /**
     * Name of the payment fee.
     */
    private final String name;

    /**
     * The ID of the owner account.
     */
    private final String ownerAccountId;

    /**
     * The fee priority our amount.
     */
    private final String priorityOursAmount;

    /**
     * The fee priority shared amount.
     */
    private final String prioritySharedAmount;

    /**
     * The fee regular amount.
     */
    private final String regularAmount;

    private final Map<String, Object> additionalProperties;


    private PaymentFee(Builder builder) {
        this.currency = builder.currency;
        this.id = builder.id;
        this.name = builder.name;
        this.ownerAccountId = builder.ownerAccountId;
        this.priorityOursAmount = builder.priorityOursAmount;
        this.prioritySharedAmount = builder.prioritySharedAmount;
        this.regularAmount = builder.regularAmount;
        this.additionalProperties = builder.additionalProperties;
    }

    /**
     * Retrieves value for `currency`
     * The fee currency.
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `id`
     * ID of the payment fee.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }
    /**
     * Retrieves value for `name`
     * Name of the payment fee.
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    /**
     * Retrieves value for `ownerAccountId`
     * The ID of the owner account.
     */
    @JsonProperty("owner_account_id")
    public String getOwnerAccountId() {
        return ownerAccountId;
    }
    /**
     * Retrieves value for `priorityOursAmount`
     * The fee priority our amount.
     */
    @JsonProperty("priority_ours_amount")
    public String getPriorityOursAmount() {
        return priorityOursAmount;
    }
    /**
     * Retrieves value for `prioritySharedAmount`
     * The fee priority shared amount.
     */
    @JsonProperty("priority_shared_amount")
    public String getPrioritySharedAmount() {
        return prioritySharedAmount;
    }
    /**
     * Retrieves value for `regularAmount`
     * The fee regular amount.
     */
    @JsonProperty("regular_amount")
    public String getRegularAmount() {
        return regularAmount;
    }
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof PaymentFee && equalTo((PaymentFee) other);
    }

    private boolean equalTo(PaymentFee other) {
        return
            currency.equals(other.currency) &&

            id.equals(other.id) &&

            name.equals(other.name) &&

            ownerAccountId.equals(other.ownerAccountId) &&

            priorityOursAmount.equals(other.priorityOursAmount) &&

            prioritySharedAmount.equals(other.prioritySharedAmount) &&

            regularAmount.equals(other.regularAmount)
            &&
            additionalProperties.equals(other.additionalProperties)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.currency,
                   this.id,
                   this.name,
                   this.ownerAccountId,
                   this.priorityOursAmount,
                   this.prioritySharedAmount,
                   this.regularAmount
                   ,
                   this.additionalProperties
               );
    }

    @Override
    public String toString() {
        return "PaymentFee{" +
               "currency=" + currency + ", " +
               "id=" + id + ", " +
               "name=" + name + ", " +
               "ownerAccountId=" + ownerAccountId + ", " +
               "priorityOursAmount=" + priorityOursAmount + ", " +
               "prioritySharedAmount=" + prioritySharedAmount + ", " +
               "regularAmount=" + regularAmount +
               ", additionalProperties=" + additionalProperties +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The fee currency.
         */
        private String currency = null;

        /**
         * ID of the payment fee.
         */
        private String id = null;

        /**
         * Name of the payment fee.
         */
        private String name = null;

        /**
         * The ID of the owner account.
         */
        private String ownerAccountId = null;

        /**
         * The fee priority our amount.
         */
        private String priorityOursAmount = null;

        /**
         * The fee priority shared amount.
         */
        private String prioritySharedAmount = null;

        /**
         * The fee regular amount.
         */
        private String regularAmount = null;

        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(PaymentFee other) {
            currency(other.getCurrency());
            id(other.getId());
            name(other.getName());
            ownerAccountId(other.getOwnerAccountId());
            priorityOursAmount(other.getPriorityOursAmount());
            prioritySharedAmount(other.getPrioritySharedAmount());
            regularAmount(other.getRegularAmount());
            additionalProperties(other.getAdditionalProperties());
            return this;
        }

        /**
         * Sets value for `currency`
         * The fee currency.
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
        /**
         * Sets value for `name`
         * Name of the payment fee.
         */
        @JsonSetter("name")
        public Builder name(String name) {
            if (name == null) {
                throw new IllegalArgumentException("name cannot be null");
            }

            this.name = name;
            return this;
        }
        /**
         * Sets value for `ownerAccountId`
         * The ID of the owner account.
         */
        @JsonSetter("owner_account_id")
        public Builder ownerAccountId(String ownerAccountId) {
            if (ownerAccountId == null) {
                throw new IllegalArgumentException("ownerAccountId cannot be null");
            }

            this.ownerAccountId = ownerAccountId;
            return this;
        }
        /**
         * Sets value for `priorityOursAmount`
         * The fee priority our amount.
         */
        @JsonSetter("priority_ours_amount")
        public Builder priorityOursAmount(String priorityOursAmount) {
            if (priorityOursAmount == null) {
                throw new IllegalArgumentException("priorityOursAmount cannot be null");
            }

            this.priorityOursAmount = priorityOursAmount;
            return this;
        }
        /**
         * Sets value for `prioritySharedAmount`
         * The fee priority shared amount.
         */
        @JsonSetter("priority_shared_amount")
        public Builder prioritySharedAmount(String prioritySharedAmount) {
            if (prioritySharedAmount == null) {
                throw new IllegalArgumentException("prioritySharedAmount cannot be null");
            }

            this.prioritySharedAmount = prioritySharedAmount;
            return this;
        }
        /**
         * Sets value for `regularAmount`
         * The fee regular amount.
         */
        @JsonSetter("regular_amount")
        public Builder regularAmount(String regularAmount) {
            if (regularAmount == null) {
                throw new IllegalArgumentException("regularAmount cannot be null");
            }

            this.regularAmount = regularAmount;
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



        public PaymentFee build() {
            if (currency == null) {
                throw new IllegalStateException("currency is required");
            }

            if (id == null) {
                throw new IllegalStateException("id is required");
            }

            if (name == null) {
                throw new IllegalStateException("name is required");
            }

            if (ownerAccountId == null) {
                throw new IllegalStateException("ownerAccountId is required");
            }

            if (priorityOursAmount == null) {
                throw new IllegalStateException("priorityOursAmount is required");
            }

            if (prioritySharedAmount == null) {
                throw new IllegalStateException("prioritySharedAmount is required");
            }

            if (regularAmount == null) {
                throw new IllegalStateException("regularAmount is required");
            }

            return new PaymentFee(this);
        }
    }

}



