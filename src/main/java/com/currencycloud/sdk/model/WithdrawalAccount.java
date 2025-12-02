
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
 * Withdrawal account
 */
@JsonDeserialize(builder = WithdrawalAccount.Builder.class)
public final class WithdrawalAccount {
    /**
     * The DOB of the withdrawal account holder.
     */
    private final String accountHolderDob;

    /**
     * The name of the withdrawal account holder.
     */
    private final String accountHolderName;

    /**
     * The UUID of the CurrencyCloud account the withdrawal account is linked to.
     */
    private final String accountId;

    /**
     * The name of the withdrawal account.
     */
    private final String accountName;

    /**
     * The account number of the withdrawal account.
     */
    private final String accountNumber;

    /**
     * The currency of the withdrawal account.
     */
    private final String currency;

    /**
     * The UUID of the withdrawal account.
     */
    private final String id;

    /**
     * The routing code of the withdrawal account.
     */
    private final String routingCode;

    private final Map<String, Object> additionalProperties;


    private WithdrawalAccount(Builder builder) {
        this.accountHolderDob = builder.accountHolderDob;
        this.accountHolderName = builder.accountHolderName;
        this.accountId = builder.accountId;
        this.accountName = builder.accountName;
        this.accountNumber = builder.accountNumber;
        this.currency = builder.currency;
        this.id = builder.id;
        this.routingCode = builder.routingCode;
        this.additionalProperties = builder.additionalProperties;
    }

    /**
     * Retrieves value for `accountHolderDob`
     * The DOB of the withdrawal account holder.
     */
    @JsonProperty("account_holder_dob")
    public String getAccountHolderDob() {
        return accountHolderDob;
    }
    /**
     * Retrieves value for `accountHolderName`
     * The name of the withdrawal account holder.
     */
    @JsonProperty("account_holder_name")
    public String getAccountHolderName() {
        return accountHolderName;
    }
    /**
     * Retrieves value for `accountId`
     * The UUID of the CurrencyCloud account the withdrawal account is linked to.
     */
    @JsonProperty("account_id")
    public String getAccountId() {
        return accountId;
    }
    /**
     * Retrieves value for `accountName`
     * The name of the withdrawal account.
     */
    @JsonProperty("account_name")
    public String getAccountName() {
        return accountName;
    }
    /**
     * Retrieves value for `accountNumber`
     * The account number of the withdrawal account.
     */
    @JsonProperty("account_number")
    public String getAccountNumber() {
        return accountNumber;
    }
    /**
     * Retrieves value for `currency`
     * The currency of the withdrawal account.
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `id`
     * The UUID of the withdrawal account.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }
    /**
     * Retrieves value for `routingCode`
     * The routing code of the withdrawal account.
     */
    @JsonProperty("routing_code")
    public String getRoutingCode() {
        return routingCode;
    }
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof WithdrawalAccount && equalTo((WithdrawalAccount) other);
    }

    private boolean equalTo(WithdrawalAccount other) {
        return
            accountHolderDob.equals(other.accountHolderDob) &&

            accountHolderName.equals(other.accountHolderName) &&

            accountId.equals(other.accountId) &&

            accountName.equals(other.accountName) &&

            accountNumber.equals(other.accountNumber) &&

            currency.equals(other.currency) &&

            id.equals(other.id) &&

            routingCode.equals(other.routingCode)
            &&
            additionalProperties.equals(other.additionalProperties)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountHolderDob,
                   this.accountHolderName,
                   this.accountId,
                   this.accountName,
                   this.accountNumber,
                   this.currency,
                   this.id,
                   this.routingCode
                   ,
                   this.additionalProperties
               );
    }

    @Override
    public String toString() {
        return "WithdrawalAccount{" +
               "accountHolderDob=" + accountHolderDob + ", " +
               "accountHolderName=" + accountHolderName + ", " +
               "accountId=" + accountId + ", " +
               "accountName=" + accountName + ", " +
               "accountNumber=" + accountNumber + ", " +
               "currency=" + currency + ", " +
               "id=" + id + ", " +
               "routingCode=" + routingCode +
               ", additionalProperties=" + additionalProperties +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The DOB of the withdrawal account holder.
         */
        private String accountHolderDob = null;

        /**
         * The name of the withdrawal account holder.
         */
        private String accountHolderName = null;

        /**
         * The UUID of the CurrencyCloud account the withdrawal account is linked to.
         */
        private String accountId = null;

        /**
         * The name of the withdrawal account.
         */
        private String accountName = null;

        /**
         * The account number of the withdrawal account.
         */
        private String accountNumber = null;

        /**
         * The currency of the withdrawal account.
         */
        private String currency = null;

        /**
         * The UUID of the withdrawal account.
         */
        private String id = null;

        /**
         * The routing code of the withdrawal account.
         */
        private String routingCode = null;

        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(WithdrawalAccount other) {
            accountHolderDob(other.getAccountHolderDob());
            accountHolderName(other.getAccountHolderName());
            accountId(other.getAccountId());
            accountName(other.getAccountName());
            accountNumber(other.getAccountNumber());
            currency(other.getCurrency());
            id(other.getId());
            routingCode(other.getRoutingCode());
            additionalProperties(other.getAdditionalProperties());
            return this;
        }

        /**
         * Sets value for `accountHolderDob`
         * The DOB of the withdrawal account holder.
         */
        @JsonSetter("account_holder_dob")
        public Builder accountHolderDob(String accountHolderDob) {
            if (accountHolderDob == null) {
                throw new IllegalArgumentException("accountHolderDob cannot be null");
            }

            this.accountHolderDob = accountHolderDob;
            return this;
        }
        /**
         * Sets value for `accountHolderName`
         * The name of the withdrawal account holder.
         */
        @JsonSetter("account_holder_name")
        public Builder accountHolderName(String accountHolderName) {
            if (accountHolderName == null) {
                throw new IllegalArgumentException("accountHolderName cannot be null");
            }

            this.accountHolderName = accountHolderName;
            return this;
        }
        /**
         * Sets value for `accountId`
         * The UUID of the CurrencyCloud account the withdrawal account is linked to.
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
         * Sets value for `accountName`
         * The name of the withdrawal account.
         */
        @JsonSetter("account_name")
        public Builder accountName(String accountName) {
            if (accountName == null) {
                throw new IllegalArgumentException("accountName cannot be null");
            }

            this.accountName = accountName;
            return this;
        }
        /**
         * Sets value for `accountNumber`
         * The account number of the withdrawal account.
         */
        @JsonSetter("account_number")
        public Builder accountNumber(String accountNumber) {
            if (accountNumber == null) {
                throw new IllegalArgumentException("accountNumber cannot be null");
            }

            this.accountNumber = accountNumber;
            return this;
        }
        /**
         * Sets value for `currency`
         * The currency of the withdrawal account.
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
         * The UUID of the withdrawal account.
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
         * Sets value for `routingCode`
         * The routing code of the withdrawal account.
         */
        @JsonSetter("routing_code")
        public Builder routingCode(String routingCode) {
            if (routingCode == null) {
                throw new IllegalArgumentException("routingCode cannot be null");
            }

            this.routingCode = routingCode;
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



        public WithdrawalAccount build() {
            if (accountHolderDob == null) {
                throw new IllegalStateException("accountHolderDob is required");
            }

            if (accountHolderName == null) {
                throw new IllegalStateException("accountHolderName is required");
            }

            if (accountId == null) {
                throw new IllegalStateException("accountId is required");
            }

            if (accountName == null) {
                throw new IllegalStateException("accountName is required");
            }

            if (accountNumber == null) {
                throw new IllegalStateException("accountNumber is required");
            }

            if (currency == null) {
                throw new IllegalStateException("currency is required");
            }

            if (id == null) {
                throw new IllegalStateException("id is required");
            }

            if (routingCode == null) {
                throw new IllegalStateException("routingCode is required");
            }

            return new WithdrawalAccount(this);
        }
    }

}



