
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
 * FundingAccount.
 */
@JsonDeserialize(builder = FundingAccount.Builder.class)
public final class FundingAccount {
    /**
     * The name of the account used to make a payment.
     */
    private final String accountHolderName;

    /**
     * The account ID the SSI is attached to. If money is paid to the account details, this account will be credited.
     */
    private final String accountId;

    /**
     * The account number to use when adding funds to the account.
     */
    private final String accountNumber;

    /**
     * The type of account number provided (e.g. account number of IBAN).
     */
    private final FundingAccountAccountNumberTypeEnum accountNumberType;

    /**
     * The address of the bank the account is held with.
     */
    private final String bankAddress;

    /**
     * The 2 digit ISO country code where the bank is based.
     */
    private final String bankCountry;

    /**
     * The name of the bank the account is held with.
     */
    private final String bankName;

    /**
     * The date-time the SSI was added to the account.
     */
    private final String createdAt;

    /**
     * The currency that should be sent to these account details.
     */
    private final String currency;

    /**
     * The SSI's unique UUID.
     */
    private final String id;

    /**
     * The type of payment that can be made into the account details provided. Regular - a local scheme such as Faster Payments in the UK. Priority - a priority payment e.g. FEDwire or Swift.
     */
    private final FundingAccountPaymentTypeEnum paymentType;

    /**
     * The particular routing code for this account number.
     */
    private final String routingCode;

    /**
     * The type of routing number.
     */
    private final FundingAccountRoutingCodeTypeEnum routingCodeType;

    /**
     * The date-time the SSI was last updated on the account.
     */
    private final String updatedAt;

    private final Map<String, Object> additionalProperties;


    private FundingAccount(Builder builder) {
        this.accountHolderName = builder.accountHolderName;
        this.accountId = builder.accountId;
        this.accountNumber = builder.accountNumber;
        this.accountNumberType = builder.accountNumberType;
        this.bankAddress = builder.bankAddress;
        this.bankCountry = builder.bankCountry;
        this.bankName = builder.bankName;
        this.createdAt = builder.createdAt;
        this.currency = builder.currency;
        this.id = builder.id;
        this.paymentType = builder.paymentType;
        this.routingCode = builder.routingCode;
        this.routingCodeType = builder.routingCodeType;
        this.updatedAt = builder.updatedAt;
        this.additionalProperties = builder.additionalProperties;
    }

    /**
     * Retrieves value for `accountHolderName`
     * The name of the account used to make a payment.
     */
    @JsonProperty("account_holder_name")
    public String getAccountHolderName() {
        return accountHolderName;
    }
    /**
     * Retrieves value for `accountId`
     * The account ID the SSI is attached to. If money is paid to the account details, this account will be credited.
     */
    @JsonProperty("account_id")
    public String getAccountId() {
        return accountId;
    }
    /**
     * Retrieves value for `accountNumber`
     * The account number to use when adding funds to the account.
     */
    @JsonProperty("account_number")
    public String getAccountNumber() {
        return accountNumber;
    }
    /**
     * Retrieves value for `accountNumberType`
     * The type of account number provided (e.g. account number of IBAN).
     */
    @JsonProperty("account_number_type")
    public FundingAccountAccountNumberTypeEnum getAccountNumberType() {
        return accountNumberType;
    }
    /**
     * Retrieves value for `bankAddress`
     * The address of the bank the account is held with.
     */
    @JsonProperty("bank_address")
    public String getBankAddress() {
        return bankAddress;
    }
    /**
     * Retrieves value for `bankCountry`
     * The 2 digit ISO country code where the bank is based.
     */
    @JsonProperty("bank_country")
    public String getBankCountry() {
        return bankCountry;
    }
    /**
     * Retrieves value for `bankName`
     * The name of the bank the account is held with.
     */
    @JsonProperty("bank_name")
    public String getBankName() {
        return bankName;
    }
    /**
     * Retrieves value for `createdAt`
     * The date-time the SSI was added to the account.
     */
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }
    /**
     * Retrieves value for `currency`
     * The currency that should be sent to these account details.
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `id`
     * The SSI's unique UUID.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }
    /**
     * Retrieves value for `paymentType`
     * The type of payment that can be made into the account details provided. Regular - a local scheme such as Faster Payments in the UK. Priority - a priority payment e.g. FEDwire or Swift.
     */
    @JsonProperty("payment_type")
    public FundingAccountPaymentTypeEnum getPaymentType() {
        return paymentType;
    }
    /**
     * Retrieves value for `routingCode`
     * The particular routing code for this account number.
     */
    @JsonProperty("routing_code")
    public String getRoutingCode() {
        return routingCode;
    }
    /**
     * Retrieves value for `routingCodeType`
     * The type of routing number.
     */
    @JsonProperty("routing_code_type")
    public FundingAccountRoutingCodeTypeEnum getRoutingCodeType() {
        return routingCodeType;
    }
    /**
     * Retrieves value for `updatedAt`
     * The date-time the SSI was last updated on the account.
     */
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof FundingAccount && equalTo((FundingAccount) other);
    }

    private boolean equalTo(FundingAccount other) {
        return
            accountHolderName.equals(other.accountHolderName) &&

            accountId.equals(other.accountId) &&

            accountNumber.equals(other.accountNumber) &&

            accountNumberType.equals(other.accountNumberType) &&

            bankAddress.equals(other.bankAddress) &&

            bankCountry.equals(other.bankCountry) &&

            bankName.equals(other.bankName) &&

            createdAt.equals(other.createdAt) &&

            currency.equals(other.currency) &&

            id.equals(other.id) &&

            paymentType.equals(other.paymentType) &&

            routingCode.equals(other.routingCode) &&

            routingCodeType.equals(other.routingCodeType) &&

            updatedAt.equals(other.updatedAt)
            &&
            additionalProperties.equals(other.additionalProperties)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountHolderName,
                   this.accountId,
                   this.accountNumber,
                   this.accountNumberType,
                   this.bankAddress,
                   this.bankCountry,
                   this.bankName,
                   this.createdAt,
                   this.currency,
                   this.id,
                   this.paymentType,
                   this.routingCode,
                   this.routingCodeType,
                   this.updatedAt
                   ,
                   this.additionalProperties
               );
    }

    @Override
    public String toString() {
        return "FundingAccount{" +
               "accountHolderName=" + accountHolderName + ", " +
               "accountId=" + accountId + ", " +
               "accountNumber=" + accountNumber + ", " +
               "accountNumberType=" + accountNumberType + ", " +
               "bankAddress=" + bankAddress + ", " +
               "bankCountry=" + bankCountry + ", " +
               "bankName=" + bankName + ", " +
               "createdAt=" + createdAt + ", " +
               "currency=" + currency + ", " +
               "id=" + id + ", " +
               "paymentType=" + paymentType + ", " +
               "routingCode=" + routingCode + ", " +
               "routingCodeType=" + routingCodeType + ", " +
               "updatedAt=" + updatedAt +
               ", additionalProperties=" + additionalProperties +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The name of the account used to make a payment.
         */
        private String accountHolderName = null;

        /**
         * The account ID the SSI is attached to. If money is paid to the account details, this account will be credited.
         */
        private String accountId = null;

        /**
         * The account number to use when adding funds to the account.
         */
        private String accountNumber = null;

        /**
         * The type of account number provided (e.g. account number of IBAN).
         */
        private FundingAccountAccountNumberTypeEnum accountNumberType = null;

        /**
         * The address of the bank the account is held with.
         */
        private String bankAddress = null;

        /**
         * The 2 digit ISO country code where the bank is based.
         */
        private String bankCountry = null;

        /**
         * The name of the bank the account is held with.
         */
        private String bankName = null;

        /**
         * The date-time the SSI was added to the account.
         */
        private String createdAt = null;

        /**
         * The currency that should be sent to these account details.
         */
        private String currency = null;

        /**
         * The SSI's unique UUID.
         */
        private String id = null;

        /**
         * The type of payment that can be made into the account details provided. Regular - a local scheme such as Faster Payments in the UK. Priority - a priority payment e.g. FEDwire or Swift.
         */
        private FundingAccountPaymentTypeEnum paymentType = null;

        /**
         * The particular routing code for this account number.
         */
        private String routingCode = null;

        /**
         * The type of routing number.
         */
        private FundingAccountRoutingCodeTypeEnum routingCodeType = null;

        /**
         * The date-time the SSI was last updated on the account.
         */
        private String updatedAt = null;

        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(FundingAccount other) {
            accountHolderName(other.getAccountHolderName());
            accountId(other.getAccountId());
            accountNumber(other.getAccountNumber());
            accountNumberType(other.getAccountNumberType());
            bankAddress(other.getBankAddress());
            bankCountry(other.getBankCountry());
            bankName(other.getBankName());
            createdAt(other.getCreatedAt());
            currency(other.getCurrency());
            id(other.getId());
            paymentType(other.getPaymentType());
            routingCode(other.getRoutingCode());
            routingCodeType(other.getRoutingCodeType());
            updatedAt(other.getUpdatedAt());
            additionalProperties(other.getAdditionalProperties());
            return this;
        }

        /**
         * Sets value for `accountHolderName`
         * The name of the account used to make a payment.
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
         * The account ID the SSI is attached to. If money is paid to the account details, this account will be credited.
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
         * Sets value for `accountNumber`
         * The account number to use when adding funds to the account.
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
         * Sets value for `accountNumberType`
         * The type of account number provided (e.g. account number of IBAN).
         */
        @JsonSetter("account_number_type")
        public Builder accountNumberType(FundingAccountAccountNumberTypeEnum accountNumberType) {
            if (accountNumberType == null) {
                throw new IllegalArgumentException("accountNumberType cannot be null");
            }

            this.accountNumberType = accountNumberType;
            return this;
        }
        /**
         * Sets value for `bankAddress`
         * The address of the bank the account is held with.
         */
        @JsonSetter("bank_address")
        public Builder bankAddress(String bankAddress) {
            if (bankAddress == null) {
                throw new IllegalArgumentException("bankAddress cannot be null");
            }

            this.bankAddress = bankAddress;
            return this;
        }
        /**
         * Sets value for `bankCountry`
         * The 2 digit ISO country code where the bank is based.
         */
        @JsonSetter("bank_country")
        public Builder bankCountry(String bankCountry) {
            if (bankCountry == null) {
                throw new IllegalArgumentException("bankCountry cannot be null");
            }

            this.bankCountry = bankCountry;
            return this;
        }
        /**
         * Sets value for `bankName`
         * The name of the bank the account is held with.
         */
        @JsonSetter("bank_name")
        public Builder bankName(String bankName) {
            if (bankName == null) {
                throw new IllegalArgumentException("bankName cannot be null");
            }

            this.bankName = bankName;
            return this;
        }
        /**
         * Sets value for `createdAt`
         * The date-time the SSI was added to the account.
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
         * Sets value for `currency`
         * The currency that should be sent to these account details.
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
         * The SSI's unique UUID.
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
         * Sets value for `paymentType`
         * The type of payment that can be made into the account details provided. Regular - a local scheme such as Faster Payments in the UK. Priority - a priority payment e.g. FEDwire or Swift.
         */
        @JsonSetter("payment_type")
        public Builder paymentType(FundingAccountPaymentTypeEnum paymentType) {
            if (paymentType == null) {
                throw new IllegalArgumentException("paymentType cannot be null");
            }

            this.paymentType = paymentType;
            return this;
        }
        /**
         * Sets value for `routingCode`
         * The particular routing code for this account number.
         */
        @JsonSetter("routing_code")
        public Builder routingCode(String routingCode) {
            if (routingCode == null) {
                throw new IllegalArgumentException("routingCode cannot be null");
            }

            this.routingCode = routingCode;
            return this;
        }
        /**
         * Sets value for `routingCodeType`
         * The type of routing number.
         */
        @JsonSetter("routing_code_type")
        public Builder routingCodeType(FundingAccountRoutingCodeTypeEnum routingCodeType) {
            if (routingCodeType == null) {
                throw new IllegalArgumentException("routingCodeType cannot be null");
            }

            this.routingCodeType = routingCodeType;
            return this;
        }
        /**
         * Sets value for `updatedAt`
         * The date-time the SSI was last updated on the account.
         */
        @JsonSetter("updated_at")
        public Builder updatedAt(String updatedAt) {
            if (updatedAt == null) {
                throw new IllegalArgumentException("updatedAt cannot be null");
            }

            this.updatedAt = updatedAt;
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



        public FundingAccount build() {
            if (accountHolderName == null) {
                throw new IllegalStateException("accountHolderName is required");
            }

            if (accountId == null) {
                throw new IllegalStateException("accountId is required");
            }

            if (accountNumber == null) {
                throw new IllegalStateException("accountNumber is required");
            }

            if (accountNumberType == null) {
                throw new IllegalStateException("accountNumberType is required");
            }

            if (bankAddress == null) {
                throw new IllegalStateException("bankAddress is required");
            }

            if (bankCountry == null) {
                throw new IllegalStateException("bankCountry is required");
            }

            if (bankName == null) {
                throw new IllegalStateException("bankName is required");
            }

            if (createdAt == null) {
                throw new IllegalStateException("createdAt is required");
            }

            if (currency == null) {
                throw new IllegalStateException("currency is required");
            }

            if (id == null) {
                throw new IllegalStateException("id is required");
            }

            if (paymentType == null) {
                throw new IllegalStateException("paymentType is required");
            }

            if (routingCode == null) {
                throw new IllegalStateException("routingCode is required");
            }

            if (routingCodeType == null) {
                throw new IllegalStateException("routingCodeType is required");
            }

            if (updatedAt == null) {
                throw new IllegalStateException("updatedAt is required");
            }

            return new FundingAccount(this);
        }
    }

}



