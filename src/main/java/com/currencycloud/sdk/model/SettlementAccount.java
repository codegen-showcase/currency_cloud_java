
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
 * Settlement accounts.
 */
@JsonDeserialize(builder = SettlementAccount.Builder.class)
public final class SettlementAccount {
    /**
     * Account number
     */
    private final Optional<String> accountNumber;

    /**
     * The bank account holder's name.
     */
    private final Optional<String> bankAccountHolderName;

    /**
     * The bank's address.
     */
    private final Optional<List<String>> bankAddress;

    /**
     * Two-letter ISO country code for the bank's country.
     */
    private final Optional<String> bankCountry;

    /**
     * The name of the bank.
     */
    private final Optional<String> bankName;

    /**
     * The beneficiary's address.
     */
    private final Optional<List<String>> beneficiaryAddress;

    /**
     * Beneficiary's country.
     */
    private final Optional<String> beneficiaryCountry;

    /**
     * BIC / Swift code
     */
    private final Optional<String> bicSwift;

    /**
     * Payment currency
     */
    private final Optional<String> currency;

    /**
     * IBAN number
     */
    private final Optional<String> iban;

    /**
     * Routing system for regular (local) payments.
     */
    private final Optional<SettlementAccountRoutingCodeType1Enum> routingCodeType1;

    /**
     * Local payment routing system.
     */
    private final Optional<SettlementAccountRoutingCodeType2Enum> routingCodeType2;

    /**
     * Value for routing system 'routing_code_type_1'.
     */
    private final Optional<String> routingCodeValue1;

    /**
     * Value for routing system 'routing_code_type_2'.
     */
    private final Optional<String> routingCodeValue2;


    private SettlementAccount(Builder builder) {
        this.accountNumber = builder.accountNumber;
        this.bankAccountHolderName = builder.bankAccountHolderName;
        this.bankAddress = builder.bankAddress;
        this.bankCountry = builder.bankCountry;
        this.bankName = builder.bankName;
        this.beneficiaryAddress = builder.beneficiaryAddress;
        this.beneficiaryCountry = builder.beneficiaryCountry;
        this.bicSwift = builder.bicSwift;
        this.currency = builder.currency;
        this.iban = builder.iban;
        this.routingCodeType1 = builder.routingCodeType1;
        this.routingCodeType2 = builder.routingCodeType2;
        this.routingCodeValue1 = builder.routingCodeValue1;
        this.routingCodeValue2 = builder.routingCodeValue2;
    }

    /**
     * Retrieves value for `accountNumber`
     * Account number
     */
    @JsonProperty("account_number")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAccountNumber() {
        return accountNumber;
    }
    /**
     * Retrieves value for `bankAccountHolderName`
     * The bank account holder's name.
     */
    @JsonProperty("bank_account_holder_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBankAccountHolderName() {
        return bankAccountHolderName;
    }
    /**
     * Retrieves value for `bankAddress`
     * The bank's address.
     */
    @JsonProperty("bank_address")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<String>> getBankAddress() {
        return bankAddress;
    }
    /**
     * Retrieves value for `bankCountry`
     * Two-letter ISO country code for the bank's country.
     */
    @JsonProperty("bank_country")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBankCountry() {
        return bankCountry;
    }
    /**
     * Retrieves value for `bankName`
     * The name of the bank.
     */
    @JsonProperty("bank_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBankName() {
        return bankName;
    }
    /**
     * Retrieves value for `beneficiaryAddress`
     * The beneficiary's address.
     */
    @JsonProperty("beneficiary_address")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<String>> getBeneficiaryAddress() {
        return beneficiaryAddress;
    }
    /**
     * Retrieves value for `beneficiaryCountry`
     * Beneficiary's country.
     */
    @JsonProperty("beneficiary_country")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryCountry() {
        return beneficiaryCountry;
    }
    /**
     * Retrieves value for `bicSwift`
     * BIC / Swift code
     */
    @JsonProperty("bic_swift")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBicSwift() {
        return bicSwift;
    }
    /**
     * Retrieves value for `currency`
     * Payment currency
     */
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `iban`
     * IBAN number
     */
    @JsonProperty("iban")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getIban() {
        return iban;
    }
    /**
     * Retrieves value for `routingCodeType1`
     * Routing system for regular (local) payments.
     */
    @JsonProperty("routing_code_type_1")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<SettlementAccountRoutingCodeType1Enum> getRoutingCodeType1() {
        return routingCodeType1;
    }
    /**
     * Retrieves value for `routingCodeType2`
     * Local payment routing system.
     */
    @JsonProperty("routing_code_type_2")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<SettlementAccountRoutingCodeType2Enum> getRoutingCodeType2() {
        return routingCodeType2;
    }
    /**
     * Retrieves value for `routingCodeValue1`
     * Value for routing system 'routing_code_type_1'.
     */
    @JsonProperty("routing_code_value_1")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getRoutingCodeValue1() {
        return routingCodeValue1;
    }
    /**
     * Retrieves value for `routingCodeValue2`
     * Value for routing system 'routing_code_type_2'.
     */
    @JsonProperty("routing_code_value_2")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getRoutingCodeValue2() {
        return routingCodeValue2;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof SettlementAccount && equalTo((SettlementAccount) other);
    }

    private boolean equalTo(SettlementAccount other) {
        return
            accountNumber.equals(other.accountNumber) &&

            bankAccountHolderName.equals(other.bankAccountHolderName) &&

            bankAddress.equals(other.bankAddress) &&

            bankCountry.equals(other.bankCountry) &&

            bankName.equals(other.bankName) &&

            beneficiaryAddress.equals(other.beneficiaryAddress) &&

            beneficiaryCountry.equals(other.beneficiaryCountry) &&

            bicSwift.equals(other.bicSwift) &&

            currency.equals(other.currency) &&

            iban.equals(other.iban) &&

            routingCodeType1.equals(other.routingCodeType1) &&

            routingCodeType2.equals(other.routingCodeType2) &&

            routingCodeValue1.equals(other.routingCodeValue1) &&

            routingCodeValue2.equals(other.routingCodeValue2)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountNumber,
                   this.bankAccountHolderName,
                   this.bankAddress,
                   this.bankCountry,
                   this.bankName,
                   this.beneficiaryAddress,
                   this.beneficiaryCountry,
                   this.bicSwift,
                   this.currency,
                   this.iban,
                   this.routingCodeType1,
                   this.routingCodeType2,
                   this.routingCodeValue1,
                   this.routingCodeValue2
               );
    }

    @Override
    public String toString() {
        return "SettlementAccount{" +
               "accountNumber=" + accountNumber + ", " +
               "bankAccountHolderName=" + bankAccountHolderName + ", " +
               "bankAddress=" + bankAddress + ", " +
               "bankCountry=" + bankCountry + ", " +
               "bankName=" + bankName + ", " +
               "beneficiaryAddress=" + beneficiaryAddress + ", " +
               "beneficiaryCountry=" + beneficiaryCountry + ", " +
               "bicSwift=" + bicSwift + ", " +
               "currency=" + currency + ", " +
               "iban=" + iban + ", " +
               "routingCodeType1=" + routingCodeType1 + ", " +
               "routingCodeType2=" + routingCodeType2 + ", " +
               "routingCodeValue1=" + routingCodeValue1 + ", " +
               "routingCodeValue2=" + routingCodeValue2 +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Account number
         */
        private Optional<String> accountNumber = Optional.empty();

        /**
         * The bank account holder's name.
         */
        private Optional<String> bankAccountHolderName = Optional.empty();

        /**
         * The bank's address.
         */
        private Optional<List<String>> bankAddress = Optional.empty();

        /**
         * Two-letter ISO country code for the bank's country.
         */
        private Optional<String> bankCountry = Optional.empty();

        /**
         * The name of the bank.
         */
        private Optional<String> bankName = Optional.empty();

        /**
         * The beneficiary's address.
         */
        private Optional<List<String>> beneficiaryAddress = Optional.empty();

        /**
         * Beneficiary's country.
         */
        private Optional<String> beneficiaryCountry = Optional.empty();

        /**
         * BIC / Swift code
         */
        private Optional<String> bicSwift = Optional.empty();

        /**
         * Payment currency
         */
        private Optional<String> currency = Optional.empty();

        /**
         * IBAN number
         */
        private Optional<String> iban = Optional.empty();

        /**
         * Routing system for regular (local) payments.
         */
        private Optional<SettlementAccountRoutingCodeType1Enum> routingCodeType1 = Optional.empty();

        /**
         * Local payment routing system.
         */
        private Optional<SettlementAccountRoutingCodeType2Enum> routingCodeType2 = Optional.empty();

        /**
         * Value for routing system 'routing_code_type_1'.
         */
        private Optional<String> routingCodeValue1 = Optional.empty();

        /**
         * Value for routing system 'routing_code_type_2'.
         */
        private Optional<String> routingCodeValue2 = Optional.empty();


        private Builder() {}

        public Builder from(SettlementAccount other) {
            accountNumber(other.getAccountNumber());
            bankAccountHolderName(other.getBankAccountHolderName());
            bankAddress(other.getBankAddress());
            bankCountry(other.getBankCountry());
            bankName(other.getBankName());
            beneficiaryAddress(other.getBeneficiaryAddress());
            beneficiaryCountry(other.getBeneficiaryCountry());
            bicSwift(other.getBicSwift());
            currency(other.getCurrency());
            iban(other.getIban());
            routingCodeType1(other.getRoutingCodeType1());
            routingCodeType2(other.getRoutingCodeType2());
            routingCodeValue1(other.getRoutingCodeValue1());
            routingCodeValue2(other.getRoutingCodeValue2());
            return this;
        }

        /**
         * Sets value for `accountNumber`
         * Account number
         */
        @JsonSetter("account_number")
        public Builder accountNumber(Optional<String> accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        /**
         * Sets value for `accountNumber`
         * Account number
         */
        public Builder accountNumber(String accountNumber) {
            return this.accountNumber(Optional.ofNullable(accountNumber));
        }
        /**
         * Sets value for `bankAccountHolderName`
         * The bank account holder's name.
         */
        @JsonSetter("bank_account_holder_name")
        public Builder bankAccountHolderName(Optional<String> bankAccountHolderName) {
            this.bankAccountHolderName = bankAccountHolderName;
            return this;
        }

        /**
         * Sets value for `bankAccountHolderName`
         * The bank account holder's name.
         */
        public Builder bankAccountHolderName(String bankAccountHolderName) {
            return this.bankAccountHolderName(Optional.ofNullable(bankAccountHolderName));
        }
        /**
         * Sets value for `bankAddress`
         * The bank's address.
         */
        @JsonSetter("bank_address")
        public Builder bankAddress(Optional<List<String>> bankAddress) {
            this.bankAddress = bankAddress;
            return this;
        }

        /**
         * Sets value for `bankAddress`
         * The bank's address.
         */
        public Builder bankAddress(List<String> bankAddress) {
            return this.bankAddress(Optional.ofNullable(bankAddress));
        }
        /**
         * Sets value for `bankCountry`
         * Two-letter ISO country code for the bank's country.
         */
        @JsonSetter("bank_country")
        public Builder bankCountry(Optional<String> bankCountry) {
            this.bankCountry = bankCountry;
            return this;
        }

        /**
         * Sets value for `bankCountry`
         * Two-letter ISO country code for the bank's country.
         */
        public Builder bankCountry(String bankCountry) {
            return this.bankCountry(Optional.ofNullable(bankCountry));
        }
        /**
         * Sets value for `bankName`
         * The name of the bank.
         */
        @JsonSetter("bank_name")
        public Builder bankName(Optional<String> bankName) {
            this.bankName = bankName;
            return this;
        }

        /**
         * Sets value for `bankName`
         * The name of the bank.
         */
        public Builder bankName(String bankName) {
            return this.bankName(Optional.ofNullable(bankName));
        }
        /**
         * Sets value for `beneficiaryAddress`
         * The beneficiary's address.
         */
        @JsonSetter("beneficiary_address")
        public Builder beneficiaryAddress(Optional<List<String>> beneficiaryAddress) {
            this.beneficiaryAddress = beneficiaryAddress;
            return this;
        }

        /**
         * Sets value for `beneficiaryAddress`
         * The beneficiary's address.
         */
        public Builder beneficiaryAddress(List<String> beneficiaryAddress) {
            return this.beneficiaryAddress(Optional.ofNullable(beneficiaryAddress));
        }
        /**
         * Sets value for `beneficiaryCountry`
         * Beneficiary's country.
         */
        @JsonSetter("beneficiary_country")
        public Builder beneficiaryCountry(Optional<String> beneficiaryCountry) {
            this.beneficiaryCountry = beneficiaryCountry;
            return this;
        }

        /**
         * Sets value for `beneficiaryCountry`
         * Beneficiary's country.
         */
        public Builder beneficiaryCountry(String beneficiaryCountry) {
            return this.beneficiaryCountry(Optional.ofNullable(beneficiaryCountry));
        }
        /**
         * Sets value for `bicSwift`
         * BIC / Swift code
         */
        @JsonSetter("bic_swift")
        public Builder bicSwift(Optional<String> bicSwift) {
            this.bicSwift = bicSwift;
            return this;
        }

        /**
         * Sets value for `bicSwift`
         * BIC / Swift code
         */
        public Builder bicSwift(String bicSwift) {
            return this.bicSwift(Optional.ofNullable(bicSwift));
        }
        /**
         * Sets value for `currency`
         * Payment currency
         */
        @JsonSetter("currency")
        public Builder currency(Optional<String> currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Sets value for `currency`
         * Payment currency
         */
        public Builder currency(String currency) {
            return this.currency(Optional.ofNullable(currency));
        }
        /**
         * Sets value for `iban`
         * IBAN number
         */
        @JsonSetter("iban")
        public Builder iban(Optional<String> iban) {
            this.iban = iban;
            return this;
        }

        /**
         * Sets value for `iban`
         * IBAN number
         */
        public Builder iban(String iban) {
            return this.iban(Optional.ofNullable(iban));
        }
        /**
         * Sets value for `routingCodeType1`
         * Routing system for regular (local) payments.
         */
        @JsonSetter("routing_code_type_1")
        public Builder routingCodeType1(Optional<SettlementAccountRoutingCodeType1Enum> routingCodeType1) {
            this.routingCodeType1 = routingCodeType1;
            return this;
        }

        /**
         * Sets value for `routingCodeType1`
         * Routing system for regular (local) payments.
         */
        public Builder routingCodeType1(SettlementAccountRoutingCodeType1Enum routingCodeType1) {
            return this.routingCodeType1(Optional.ofNullable(routingCodeType1));
        }
        /**
         * Sets value for `routingCodeType2`
         * Local payment routing system.
         */
        @JsonSetter("routing_code_type_2")
        public Builder routingCodeType2(Optional<SettlementAccountRoutingCodeType2Enum> routingCodeType2) {
            this.routingCodeType2 = routingCodeType2;
            return this;
        }

        /**
         * Sets value for `routingCodeType2`
         * Local payment routing system.
         */
        public Builder routingCodeType2(SettlementAccountRoutingCodeType2Enum routingCodeType2) {
            return this.routingCodeType2(Optional.ofNullable(routingCodeType2));
        }
        /**
         * Sets value for `routingCodeValue1`
         * Value for routing system 'routing_code_type_1'.
         */
        @JsonSetter("routing_code_value_1")
        public Builder routingCodeValue1(Optional<String> routingCodeValue1) {
            this.routingCodeValue1 = routingCodeValue1;
            return this;
        }

        /**
         * Sets value for `routingCodeValue1`
         * Value for routing system 'routing_code_type_1'.
         */
        public Builder routingCodeValue1(String routingCodeValue1) {
            return this.routingCodeValue1(Optional.ofNullable(routingCodeValue1));
        }
        /**
         * Sets value for `routingCodeValue2`
         * Value for routing system 'routing_code_type_2'.
         */
        @JsonSetter("routing_code_value_2")
        public Builder routingCodeValue2(Optional<String> routingCodeValue2) {
            this.routingCodeValue2 = routingCodeValue2;
            return this;
        }

        /**
         * Sets value for `routingCodeValue2`
         * Value for routing system 'routing_code_type_2'.
         */
        public Builder routingCodeValue2(String routingCodeValue2) {
            return this.routingCodeValue2(Optional.ofNullable(routingCodeValue2));
        }



        public SettlementAccount build() {
            return new SettlementAccount(this);
        }
    }

}



