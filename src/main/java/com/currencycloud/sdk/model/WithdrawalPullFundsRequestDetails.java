
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
 * Details of a Withdrawal Pull Request.
 */
@JsonDeserialize(builder = WithdrawalPullFundsRequestDetails.Builder.class)
public final class WithdrawalPullFundsRequestDetails {
    /**
     * The amount to be pulled from the withdrawal account.
     */
    private final String amount;

    /**
     * Date the pull funds request record was created.
     */
    private final String createdAt;

    /**
     * The ID for the Pull Request.
     */
    private final String id;

    /**
     * The reference provided at the time the request was made.
     */
    private final String reference;

    /**
     * The ID of the withdrawal account to pull funds from.
     */
    private final String withdrawalAccountId;

    private final Map<String, Object> additionalProperties;


    private WithdrawalPullFundsRequestDetails(Builder builder) {
        this.amount = builder.amount;
        this.createdAt = builder.createdAt;
        this.id = builder.id;
        this.reference = builder.reference;
        this.withdrawalAccountId = builder.withdrawalAccountId;
        this.additionalProperties = builder.additionalProperties;
    }

    /**
     * Retrieves value for `amount`
     * The amount to be pulled from the withdrawal account.
     */
    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }
    /**
     * Retrieves value for `createdAt`
     * Date the pull funds request record was created.
     */
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }
    /**
     * Retrieves value for `id`
     * The ID for the Pull Request.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }
    /**
     * Retrieves value for `reference`
     * The reference provided at the time the request was made.
     */
    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }
    /**
     * Retrieves value for `withdrawalAccountId`
     * The ID of the withdrawal account to pull funds from.
     */
    @JsonProperty("withdrawal_account_id")
    public String getWithdrawalAccountId() {
        return withdrawalAccountId;
    }
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof WithdrawalPullFundsRequestDetails &&
               equalTo((WithdrawalPullFundsRequestDetails) other);
    }

    private boolean equalTo(WithdrawalPullFundsRequestDetails other) {
        return
            amount.equals(other.amount) &&

            createdAt.equals(other.createdAt) &&

            id.equals(other.id) &&

            reference.equals(other.reference) &&

            withdrawalAccountId.equals(other.withdrawalAccountId)
            &&
            additionalProperties.equals(other.additionalProperties)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.amount,
                   this.createdAt,
                   this.id,
                   this.reference,
                   this.withdrawalAccountId
                   ,
                   this.additionalProperties
               );
    }

    @Override
    public String toString() {
        return "WithdrawalPullFundsRequestDetails{" +
               "amount=" + amount + ", " +
               "createdAt=" + createdAt + ", " +
               "id=" + id + ", " +
               "reference=" + reference + ", " +
               "withdrawalAccountId=" + withdrawalAccountId +
               ", additionalProperties=" + additionalProperties +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The amount to be pulled from the withdrawal account.
         */
        private String amount = null;

        /**
         * Date the pull funds request record was created.
         */
        private String createdAt = null;

        /**
         * The ID for the Pull Request.
         */
        private String id = null;

        /**
         * The reference provided at the time the request was made.
         */
        private String reference = null;

        /**
         * The ID of the withdrawal account to pull funds from.
         */
        private String withdrawalAccountId = null;

        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(WithdrawalPullFundsRequestDetails other) {
            amount(other.getAmount());
            createdAt(other.getCreatedAt());
            id(other.getId());
            reference(other.getReference());
            withdrawalAccountId(other.getWithdrawalAccountId());
            additionalProperties(other.getAdditionalProperties());
            return this;
        }

        /**
         * Sets value for `amount`
         * The amount to be pulled from the withdrawal account.
         */
        @JsonSetter("amount")
        public Builder amount(String amount) {
            if (amount == null) {
                throw new IllegalArgumentException("amount cannot be null");
            }

            this.amount = amount;
            return this;
        }
        /**
         * Sets value for `createdAt`
         * Date the pull funds request record was created.
         */
        @JsonSetter("created_at")
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
                throw new IllegalArgumentException("createdAt cannot be null");
            }

            this.createdAt = createdAt;
            return this;
        }
        /**
         * Sets value for `id`
         * The ID for the Pull Request.
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
         * Sets value for `reference`
         * The reference provided at the time the request was made.
         */
        @JsonSetter("reference")
        public Builder reference(String reference) {
            if (reference == null) {
                throw new IllegalArgumentException("reference cannot be null");
            }

            this.reference = reference;
            return this;
        }
        /**
         * Sets value for `withdrawalAccountId`
         * The ID of the withdrawal account to pull funds from.
         */
        @JsonSetter("withdrawal_account_id")
        public Builder withdrawalAccountId(String withdrawalAccountId) {
            if (withdrawalAccountId == null) {
                throw new IllegalArgumentException("withdrawalAccountId cannot be null");
            }

            this.withdrawalAccountId = withdrawalAccountId;
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



        public WithdrawalPullFundsRequestDetails build() {
            if (amount == null) {
                throw new IllegalStateException("amount is required");
            }

            if (createdAt == null) {
                throw new IllegalStateException("createdAt is required");
            }

            if (id == null) {
                throw new IllegalStateException("id is required");
            }

            if (reference == null) {
                throw new IllegalStateException("reference is required");
            }

            if (withdrawalAccountId == null) {
                throw new IllegalStateException("withdrawalAccountId is required");
            }

            return new WithdrawalPullFundsRequestDetails(this);
        }
    }

}



