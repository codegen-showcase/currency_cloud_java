
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
 * BeneficiariesValidateBody
 */
@JsonDeserialize(builder = BeneficiariesValidateBody.Builder.class)
public final class BeneficiariesValidateBody {
    /**
     * Bank account number.
     */
    private final Optional<String> accountNumber;

    /**
     * Bank account type.
     */
    private final Optional<BeneficiariesValidateBodyBankAccountTypeEnum> bankAccountType;

    /**
     * First line of address.
     */
    private final Optional<String> bankAddress;

    /**
     * Two-letter code for the country in which the beneficiary's bank account is held.
     */
    private final String bankCountry;

    /**
     * Bank name
     */
    private final Optional<String> bankName;

    /**
     * First line of address.
     */
    private final Optional<String> beneficiaryAddress;

    /**
     * City
     */
    private final Optional<String> beneficiaryCity;

    /**
     * Required if "beneficiary_entity_type" is "company". Company names cannot consist entirely of numbers.
     */
    private final Optional<String> beneficiaryCompanyName;

    /**
     * Two-letter ISO country code. If the beneficiary is a company, this is the country in which the company is registered. If the beneficiary is an individual, this is the country in which the beneficiary is based.
     */
    private final Optional<String> beneficiaryCountry;

    /**
     * If "beneficiary_entity_type" is "company", date of registration. If "beneficiary_entity_type" is "individual", date of birth. ISO 8601 format YYYY-MM-DD.
     */
    private final Optional<String> beneficiaryDateOfBirth;

    /**
     * Legal entity
     */
    private final Optional<BeneficiariesValidateBodyBeneficiaryEntityTypeEnum> beneficiaryEntityType;

    /**
     * Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers.
     */
    private final Optional<String> beneficiaryFirstName;

    /**
     * A legal document that verifies the identity of the beneficiary. Required documentation will vary depending on the country in which the beneficiary's bank account is held.
     */
    private final Optional<BeneficiariesValidateBodyBeneficiaryIdentificationTypeEnum>
    beneficiaryIdentificationType;

    /**
     * A unique reference code for the identification document, such as a passport number.
     */
    private final Optional<String> beneficiaryIdentificationValue;

    /**
     * Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers.
     */
    private final Optional<String> beneficiaryLastName;

    /**
     * Postal code
     */
    private final Optional<String> beneficiaryPostcode;

    /**
     * State or province.
     */
    private final Optional<String> beneficiaryStateOrProvince;

    /**
     * BIC/Swift code
     */
    private final Optional<String> bicSwift;

    /**
     * Currency in which money is held in the beneficiary's bank account. Three-digit currency code.
     */
    private final String currency;

    /**
     * IBAN code
     */
    private final Optional<String> iban;

    /**
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    private final Optional<String> onBehalfOf;

    /**
     * Currencycloud supports two types of payments: "priority", made using the Swift network; and "regular", made using the local bank network.
     */
    private final Optional<List<BeneficiariesValidateBodyPaymentTypesItemEnum>> paymentTypes;

    /**
     * Local payment routing system. If supplied, routing_code_value_1 should also be supplied.
     */
    private final Optional<BeneficiariesValidateBodyRoutingCodeType1Enum> routingCodeType1;

    /**
     * Local payment routing system. If supplied, routing_code_value_2 should also be supplied.
     */
    private final Optional<BeneficiariesValidateBodyRoutingCodeType2Enum> routingCodeType2;

    /**
     * Routing code for routing_code_type_1. If supplied, routing_code_type_1 should also be supplied.
     */
    private final Optional<String> routingCodeValue1;

    /**
     * Routing code for routing_code_type_2. If supplied, routing_code_type_2 should also be supplied.
     */
    private final Optional<String> routingCodeValue2;


    private BeneficiariesValidateBody(Builder builder) {
        this.accountNumber = builder.accountNumber;
        this.bankAccountType = builder.bankAccountType;
        this.bankAddress = builder.bankAddress;
        this.bankCountry = builder.bankCountry;
        this.bankName = builder.bankName;
        this.beneficiaryAddress = builder.beneficiaryAddress;
        this.beneficiaryCity = builder.beneficiaryCity;
        this.beneficiaryCompanyName = builder.beneficiaryCompanyName;
        this.beneficiaryCountry = builder.beneficiaryCountry;
        this.beneficiaryDateOfBirth = builder.beneficiaryDateOfBirth;
        this.beneficiaryEntityType = builder.beneficiaryEntityType;
        this.beneficiaryFirstName = builder.beneficiaryFirstName;
        this.beneficiaryIdentificationType = builder.beneficiaryIdentificationType;
        this.beneficiaryIdentificationValue = builder.beneficiaryIdentificationValue;
        this.beneficiaryLastName = builder.beneficiaryLastName;
        this.beneficiaryPostcode = builder.beneficiaryPostcode;
        this.beneficiaryStateOrProvince = builder.beneficiaryStateOrProvince;
        this.bicSwift = builder.bicSwift;
        this.currency = builder.currency;
        this.iban = builder.iban;
        this.onBehalfOf = builder.onBehalfOf;
        this.paymentTypes = builder.paymentTypes;
        this.routingCodeType1 = builder.routingCodeType1;
        this.routingCodeType2 = builder.routingCodeType2;
        this.routingCodeValue1 = builder.routingCodeValue1;
        this.routingCodeValue2 = builder.routingCodeValue2;
    }

    /**
     * Retrieves value for `accountNumber`
     * Bank account number.
     */
    @JsonProperty("account_number")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAccountNumber() {
        return accountNumber;
    }
    /**
     * Retrieves value for `bankAccountType`
     * Bank account type.
     */
    @JsonProperty("bank_account_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<BeneficiariesValidateBodyBankAccountTypeEnum> getBankAccountType() {
        return bankAccountType;
    }
    /**
     * Retrieves value for `bankAddress`
     * First line of address.
     */
    @JsonProperty("bank_address")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBankAddress() {
        return bankAddress;
    }
    /**
     * Retrieves value for `bankCountry`
     * Two-letter code for the country in which the beneficiary's bank account is held.
     */
    @JsonProperty("bank_country")
    public String getBankCountry() {
        return bankCountry;
    }
    /**
     * Retrieves value for `bankName`
     * Bank name
     */
    @JsonProperty("bank_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBankName() {
        return bankName;
    }
    /**
     * Retrieves value for `beneficiaryAddress`
     * First line of address.
     */
    @JsonProperty("beneficiary_address")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryAddress() {
        return beneficiaryAddress;
    }
    /**
     * Retrieves value for `beneficiaryCity`
     * City
     */
    @JsonProperty("beneficiary_city")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryCity() {
        return beneficiaryCity;
    }
    /**
     * Retrieves value for `beneficiaryCompanyName`
     * Required if "beneficiary_entity_type" is "company". Company names cannot consist entirely of numbers.
     */
    @JsonProperty("beneficiary_company_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryCompanyName() {
        return beneficiaryCompanyName;
    }
    /**
     * Retrieves value for `beneficiaryCountry`
     * Two-letter ISO country code. If the beneficiary is a company, this is the country in which the company is registered. If the beneficiary is an individual, this is the country in which the beneficiary is based.
     */
    @JsonProperty("beneficiary_country")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryCountry() {
        return beneficiaryCountry;
    }
    /**
     * Retrieves value for `beneficiaryDateOfBirth`
     * If "beneficiary_entity_type" is "company", date of registration. If "beneficiary_entity_type" is "individual", date of birth. ISO 8601 format YYYY-MM-DD.
     */
    @JsonProperty("beneficiary_date_of_birth")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryDateOfBirth() {
        return beneficiaryDateOfBirth;
    }
    /**
     * Retrieves value for `beneficiaryEntityType`
     * Legal entity
     */
    @JsonProperty("beneficiary_entity_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<BeneficiariesValidateBodyBeneficiaryEntityTypeEnum> getBeneficiaryEntityType() {
        return beneficiaryEntityType;
    }
    /**
     * Retrieves value for `beneficiaryFirstName`
     * Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers.
     */
    @JsonProperty("beneficiary_first_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryFirstName() {
        return beneficiaryFirstName;
    }
    /**
     * Retrieves value for `beneficiaryIdentificationType`
     * A legal document that verifies the identity of the beneficiary. Required documentation will vary depending on the country in which the beneficiary's bank account is held.
     */
    @JsonProperty("beneficiary_identification_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<BeneficiariesValidateBodyBeneficiaryIdentificationTypeEnum>
    getBeneficiaryIdentificationType() {
        return beneficiaryIdentificationType;
    }
    /**
     * Retrieves value for `beneficiaryIdentificationValue`
     * A unique reference code for the identification document, such as a passport number.
     */
    @JsonProperty("beneficiary_identification_value")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryIdentificationValue() {
        return beneficiaryIdentificationValue;
    }
    /**
     * Retrieves value for `beneficiaryLastName`
     * Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers.
     */
    @JsonProperty("beneficiary_last_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryLastName() {
        return beneficiaryLastName;
    }
    /**
     * Retrieves value for `beneficiaryPostcode`
     * Postal code
     */
    @JsonProperty("beneficiary_postcode")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryPostcode() {
        return beneficiaryPostcode;
    }
    /**
     * Retrieves value for `beneficiaryStateOrProvince`
     * State or province.
     */
    @JsonProperty("beneficiary_state_or_province")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryStateOrProvince() {
        return beneficiaryStateOrProvince;
    }
    /**
     * Retrieves value for `bicSwift`
     * BIC/Swift code
     */
    @JsonProperty("bic_swift")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBicSwift() {
        return bicSwift;
    }
    /**
     * Retrieves value for `currency`
     * Currency in which money is held in the beneficiary's bank account. Three-digit currency code.
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `iban`
     * IBAN code
     */
    @JsonProperty("iban")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getIban() {
        return iban;
    }
    /**
     * Retrieves value for `onBehalfOf`
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    @JsonProperty("on_behalf_of")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getOnBehalfOf() {
        return onBehalfOf;
    }
    /**
     * Retrieves value for `paymentTypes`
     * Currencycloud supports two types of payments: "priority", made using the Swift network; and "regular", made using the local bank network.
     */
    @JsonProperty("payment_types[]")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<BeneficiariesValidateBodyPaymentTypesItemEnum>> getPaymentTypes() {
        return paymentTypes;
    }
    /**
     * Retrieves value for `routingCodeType1`
     * Local payment routing system. If supplied, routing_code_value_1 should also be supplied.
     */
    @JsonProperty("routing_code_type_1")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<BeneficiariesValidateBodyRoutingCodeType1Enum> getRoutingCodeType1() {
        return routingCodeType1;
    }
    /**
     * Retrieves value for `routingCodeType2`
     * Local payment routing system. If supplied, routing_code_value_2 should also be supplied.
     */
    @JsonProperty("routing_code_type_2")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<BeneficiariesValidateBodyRoutingCodeType2Enum> getRoutingCodeType2() {
        return routingCodeType2;
    }
    /**
     * Retrieves value for `routingCodeValue1`
     * Routing code for routing_code_type_1. If supplied, routing_code_type_1 should also be supplied.
     */
    @JsonProperty("routing_code_value_1")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getRoutingCodeValue1() {
        return routingCodeValue1;
    }
    /**
     * Retrieves value for `routingCodeValue2`
     * Routing code for routing_code_type_2. If supplied, routing_code_type_2 should also be supplied.
     */
    @JsonProperty("routing_code_value_2")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getRoutingCodeValue2() {
        return routingCodeValue2;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof BeneficiariesValidateBody && equalTo((BeneficiariesValidateBody) other);
    }

    private boolean equalTo(BeneficiariesValidateBody other) {
        return
            accountNumber.equals(other.accountNumber) &&

            bankAccountType.equals(other.bankAccountType) &&

            bankAddress.equals(other.bankAddress) &&

            bankCountry.equals(other.bankCountry) &&

            bankName.equals(other.bankName) &&

            beneficiaryAddress.equals(other.beneficiaryAddress) &&

            beneficiaryCity.equals(other.beneficiaryCity) &&

            beneficiaryCompanyName.equals(other.beneficiaryCompanyName) &&

            beneficiaryCountry.equals(other.beneficiaryCountry) &&

            beneficiaryDateOfBirth.equals(other.beneficiaryDateOfBirth) &&

            beneficiaryEntityType.equals(other.beneficiaryEntityType) &&

            beneficiaryFirstName.equals(other.beneficiaryFirstName) &&

            beneficiaryIdentificationType.equals(other.beneficiaryIdentificationType) &&

            beneficiaryIdentificationValue.equals(other.beneficiaryIdentificationValue) &&

            beneficiaryLastName.equals(other.beneficiaryLastName) &&

            beneficiaryPostcode.equals(other.beneficiaryPostcode) &&

            beneficiaryStateOrProvince.equals(other.beneficiaryStateOrProvince) &&

            bicSwift.equals(other.bicSwift) &&

            currency.equals(other.currency) &&

            iban.equals(other.iban) &&

            onBehalfOf.equals(other.onBehalfOf) &&

            paymentTypes.equals(other.paymentTypes) &&

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
                   this.bankAccountType,
                   this.bankAddress,
                   this.bankCountry,
                   this.bankName,
                   this.beneficiaryAddress,
                   this.beneficiaryCity,
                   this.beneficiaryCompanyName,
                   this.beneficiaryCountry,
                   this.beneficiaryDateOfBirth,
                   this.beneficiaryEntityType,
                   this.beneficiaryFirstName,
                   this.beneficiaryIdentificationType,
                   this.beneficiaryIdentificationValue,
                   this.beneficiaryLastName,
                   this.beneficiaryPostcode,
                   this.beneficiaryStateOrProvince,
                   this.bicSwift,
                   this.currency,
                   this.iban,
                   this.onBehalfOf,
                   this.paymentTypes,
                   this.routingCodeType1,
                   this.routingCodeType2,
                   this.routingCodeValue1,
                   this.routingCodeValue2
               );
    }

    @Override
    public String toString() {
        return "BeneficiariesValidateBody{" +
               "accountNumber=" + accountNumber + ", " +
               "bankAccountType=" + bankAccountType + ", " +
               "bankAddress=" + bankAddress + ", " +
               "bankCountry=" + bankCountry + ", " +
               "bankName=" + bankName + ", " +
               "beneficiaryAddress=" + beneficiaryAddress + ", " +
               "beneficiaryCity=" + beneficiaryCity + ", " +
               "beneficiaryCompanyName=" + beneficiaryCompanyName + ", " +
               "beneficiaryCountry=" + beneficiaryCountry + ", " +
               "beneficiaryDateOfBirth=" + beneficiaryDateOfBirth + ", " +
               "beneficiaryEntityType=" + beneficiaryEntityType + ", " +
               "beneficiaryFirstName=" + beneficiaryFirstName + ", " +
               "beneficiaryIdentificationType=" + beneficiaryIdentificationType + ", " +
               "beneficiaryIdentificationValue=" + beneficiaryIdentificationValue + ", " +
               "beneficiaryLastName=" + beneficiaryLastName + ", " +
               "beneficiaryPostcode=" + beneficiaryPostcode + ", " +
               "beneficiaryStateOrProvince=" + beneficiaryStateOrProvince + ", " +
               "bicSwift=" + bicSwift + ", " +
               "currency=" + currency + ", " +
               "iban=" + iban + ", " +
               "onBehalfOf=" + onBehalfOf + ", " +
               "paymentTypes=" + paymentTypes + ", " +
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
         * Bank account number.
         */
        private Optional<String> accountNumber = Optional.empty();

        /**
         * Bank account type.
         */
        private Optional<BeneficiariesValidateBodyBankAccountTypeEnum> bankAccountType = Optional.empty();

        /**
         * First line of address.
         */
        private Optional<String> bankAddress = Optional.empty();

        /**
         * Two-letter code for the country in which the beneficiary's bank account is held.
         */
        private String bankCountry = null;

        /**
         * Bank name
         */
        private Optional<String> bankName = Optional.empty();

        /**
         * First line of address.
         */
        private Optional<String> beneficiaryAddress = Optional.empty();

        /**
         * City
         */
        private Optional<String> beneficiaryCity = Optional.empty();

        /**
         * Required if "beneficiary_entity_type" is "company". Company names cannot consist entirely of numbers.
         */
        private Optional<String> beneficiaryCompanyName = Optional.empty();

        /**
         * Two-letter ISO country code. If the beneficiary is a company, this is the country in which the company is registered. If the beneficiary is an individual, this is the country in which the beneficiary is based.
         */
        private Optional<String> beneficiaryCountry = Optional.empty();

        /**
         * If "beneficiary_entity_type" is "company", date of registration. If "beneficiary_entity_type" is "individual", date of birth. ISO 8601 format YYYY-MM-DD.
         */
        private Optional<String> beneficiaryDateOfBirth = Optional.empty();

        /**
         * Legal entity
         */
        private Optional<BeneficiariesValidateBodyBeneficiaryEntityTypeEnum> beneficiaryEntityType =
            Optional.empty();

        /**
         * Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers.
         */
        private Optional<String> beneficiaryFirstName = Optional.empty();

        /**
         * A legal document that verifies the identity of the beneficiary. Required documentation will vary depending on the country in which the beneficiary's bank account is held.
         */
        private Optional<BeneficiariesValidateBodyBeneficiaryIdentificationTypeEnum>
        beneficiaryIdentificationType = Optional.empty();

        /**
         * A unique reference code for the identification document, such as a passport number.
         */
        private Optional<String> beneficiaryIdentificationValue = Optional.empty();

        /**
         * Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers.
         */
        private Optional<String> beneficiaryLastName = Optional.empty();

        /**
         * Postal code
         */
        private Optional<String> beneficiaryPostcode = Optional.empty();

        /**
         * State or province.
         */
        private Optional<String> beneficiaryStateOrProvince = Optional.empty();

        /**
         * BIC/Swift code
         */
        private Optional<String> bicSwift = Optional.empty();

        /**
         * Currency in which money is held in the beneficiary's bank account. Three-digit currency code.
         */
        private String currency = null;

        /**
         * IBAN code
         */
        private Optional<String> iban = Optional.empty();

        /**
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        private Optional<String> onBehalfOf = Optional.empty();

        /**
         * Currencycloud supports two types of payments: "priority", made using the Swift network; and "regular", made using the local bank network.
         */
        private Optional<List<BeneficiariesValidateBodyPaymentTypesItemEnum>> paymentTypes =
            Optional.empty();

        /**
         * Local payment routing system. If supplied, routing_code_value_1 should also be supplied.
         */
        private Optional<BeneficiariesValidateBodyRoutingCodeType1Enum> routingCodeType1 = Optional.empty();

        /**
         * Local payment routing system. If supplied, routing_code_value_2 should also be supplied.
         */
        private Optional<BeneficiariesValidateBodyRoutingCodeType2Enum> routingCodeType2 = Optional.empty();

        /**
         * Routing code for routing_code_type_1. If supplied, routing_code_type_1 should also be supplied.
         */
        private Optional<String> routingCodeValue1 = Optional.empty();

        /**
         * Routing code for routing_code_type_2. If supplied, routing_code_type_2 should also be supplied.
         */
        private Optional<String> routingCodeValue2 = Optional.empty();


        private Builder() {}

        public Builder from(BeneficiariesValidateBody other) {
            accountNumber(other.getAccountNumber());
            bankAccountType(other.getBankAccountType());
            bankAddress(other.getBankAddress());
            bankCountry(other.getBankCountry());
            bankName(other.getBankName());
            beneficiaryAddress(other.getBeneficiaryAddress());
            beneficiaryCity(other.getBeneficiaryCity());
            beneficiaryCompanyName(other.getBeneficiaryCompanyName());
            beneficiaryCountry(other.getBeneficiaryCountry());
            beneficiaryDateOfBirth(other.getBeneficiaryDateOfBirth());
            beneficiaryEntityType(other.getBeneficiaryEntityType());
            beneficiaryFirstName(other.getBeneficiaryFirstName());
            beneficiaryIdentificationType(other.getBeneficiaryIdentificationType());
            beneficiaryIdentificationValue(other.getBeneficiaryIdentificationValue());
            beneficiaryLastName(other.getBeneficiaryLastName());
            beneficiaryPostcode(other.getBeneficiaryPostcode());
            beneficiaryStateOrProvince(other.getBeneficiaryStateOrProvince());
            bicSwift(other.getBicSwift());
            currency(other.getCurrency());
            iban(other.getIban());
            onBehalfOf(other.getOnBehalfOf());
            paymentTypes(other.getPaymentTypes());
            routingCodeType1(other.getRoutingCodeType1());
            routingCodeType2(other.getRoutingCodeType2());
            routingCodeValue1(other.getRoutingCodeValue1());
            routingCodeValue2(other.getRoutingCodeValue2());
            return this;
        }

        /**
         * Sets value for `accountNumber`
         * Bank account number.
         */
        @JsonSetter("account_number")
        public Builder accountNumber(Optional<String> accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        /**
         * Sets value for `accountNumber`
         * Bank account number.
         */
        public Builder accountNumber(String accountNumber) {
            return this.accountNumber(Optional.ofNullable(accountNumber));
        }
        /**
         * Sets value for `bankAccountType`
         * Bank account type.
         */
        @JsonSetter("bank_account_type")
        public Builder bankAccountType(Optional<BeneficiariesValidateBodyBankAccountTypeEnum>
                                       bankAccountType) {
            this.bankAccountType = bankAccountType;
            return this;
        }

        /**
         * Sets value for `bankAccountType`
         * Bank account type.
         */
        public Builder bankAccountType(BeneficiariesValidateBodyBankAccountTypeEnum bankAccountType) {
            return this.bankAccountType(Optional.ofNullable(bankAccountType));
        }
        /**
         * Sets value for `bankAddress`
         * First line of address.
         */
        @JsonSetter("bank_address")
        public Builder bankAddress(Optional<String> bankAddress) {
            this.bankAddress = bankAddress;
            return this;
        }

        /**
         * Sets value for `bankAddress`
         * First line of address.
         */
        public Builder bankAddress(String bankAddress) {
            return this.bankAddress(Optional.ofNullable(bankAddress));
        }
        /**
         * Sets value for `bankCountry`
         * Two-letter code for the country in which the beneficiary's bank account is held.
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
         * Bank name
         */
        @JsonSetter("bank_name")
        public Builder bankName(Optional<String> bankName) {
            this.bankName = bankName;
            return this;
        }

        /**
         * Sets value for `bankName`
         * Bank name
         */
        public Builder bankName(String bankName) {
            return this.bankName(Optional.ofNullable(bankName));
        }
        /**
         * Sets value for `beneficiaryAddress`
         * First line of address.
         */
        @JsonSetter("beneficiary_address")
        public Builder beneficiaryAddress(Optional<String> beneficiaryAddress) {
            this.beneficiaryAddress = beneficiaryAddress;
            return this;
        }

        /**
         * Sets value for `beneficiaryAddress`
         * First line of address.
         */
        public Builder beneficiaryAddress(String beneficiaryAddress) {
            return this.beneficiaryAddress(Optional.ofNullable(beneficiaryAddress));
        }
        /**
         * Sets value for `beneficiaryCity`
         * City
         */
        @JsonSetter("beneficiary_city")
        public Builder beneficiaryCity(Optional<String> beneficiaryCity) {
            this.beneficiaryCity = beneficiaryCity;
            return this;
        }

        /**
         * Sets value for `beneficiaryCity`
         * City
         */
        public Builder beneficiaryCity(String beneficiaryCity) {
            return this.beneficiaryCity(Optional.ofNullable(beneficiaryCity));
        }
        /**
         * Sets value for `beneficiaryCompanyName`
         * Required if "beneficiary_entity_type" is "company". Company names cannot consist entirely of numbers.
         */
        @JsonSetter("beneficiary_company_name")
        public Builder beneficiaryCompanyName(Optional<String> beneficiaryCompanyName) {
            this.beneficiaryCompanyName = beneficiaryCompanyName;
            return this;
        }

        /**
         * Sets value for `beneficiaryCompanyName`
         * Required if "beneficiary_entity_type" is "company". Company names cannot consist entirely of numbers.
         */
        public Builder beneficiaryCompanyName(String beneficiaryCompanyName) {
            return this.beneficiaryCompanyName(Optional.ofNullable(beneficiaryCompanyName));
        }
        /**
         * Sets value for `beneficiaryCountry`
         * Two-letter ISO country code. If the beneficiary is a company, this is the country in which the company is registered. If the beneficiary is an individual, this is the country in which the beneficiary is based.
         */
        @JsonSetter("beneficiary_country")
        public Builder beneficiaryCountry(Optional<String> beneficiaryCountry) {
            this.beneficiaryCountry = beneficiaryCountry;
            return this;
        }

        /**
         * Sets value for `beneficiaryCountry`
         * Two-letter ISO country code. If the beneficiary is a company, this is the country in which the company is registered. If the beneficiary is an individual, this is the country in which the beneficiary is based.
         */
        public Builder beneficiaryCountry(String beneficiaryCountry) {
            return this.beneficiaryCountry(Optional.ofNullable(beneficiaryCountry));
        }
        /**
         * Sets value for `beneficiaryDateOfBirth`
         * If "beneficiary_entity_type" is "company", date of registration. If "beneficiary_entity_type" is "individual", date of birth. ISO 8601 format YYYY-MM-DD.
         */
        @JsonSetter("beneficiary_date_of_birth")
        public Builder beneficiaryDateOfBirth(Optional<String> beneficiaryDateOfBirth) {
            this.beneficiaryDateOfBirth = beneficiaryDateOfBirth;
            return this;
        }

        /**
         * Sets value for `beneficiaryDateOfBirth`
         * If "beneficiary_entity_type" is "company", date of registration. If "beneficiary_entity_type" is "individual", date of birth. ISO 8601 format YYYY-MM-DD.
         */
        public Builder beneficiaryDateOfBirth(String beneficiaryDateOfBirth) {
            return this.beneficiaryDateOfBirth(Optional.ofNullable(beneficiaryDateOfBirth));
        }
        /**
         * Sets value for `beneficiaryEntityType`
         * Legal entity
         */
        @JsonSetter("beneficiary_entity_type")
        public Builder beneficiaryEntityType(Optional<BeneficiariesValidateBodyBeneficiaryEntityTypeEnum>
                                             beneficiaryEntityType) {
            this.beneficiaryEntityType = beneficiaryEntityType;
            return this;
        }

        /**
         * Sets value for `beneficiaryEntityType`
         * Legal entity
         */
        public Builder beneficiaryEntityType(BeneficiariesValidateBodyBeneficiaryEntityTypeEnum
                                             beneficiaryEntityType) {
            return this.beneficiaryEntityType(Optional.ofNullable(beneficiaryEntityType));
        }
        /**
         * Sets value for `beneficiaryFirstName`
         * Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers.
         */
        @JsonSetter("beneficiary_first_name")
        public Builder beneficiaryFirstName(Optional<String> beneficiaryFirstName) {
            this.beneficiaryFirstName = beneficiaryFirstName;
            return this;
        }

        /**
         * Sets value for `beneficiaryFirstName`
         * Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers.
         */
        public Builder beneficiaryFirstName(String beneficiaryFirstName) {
            return this.beneficiaryFirstName(Optional.ofNullable(beneficiaryFirstName));
        }
        /**
         * Sets value for `beneficiaryIdentificationType`
         * A legal document that verifies the identity of the beneficiary. Required documentation will vary depending on the country in which the beneficiary's bank account is held.
         */
        @JsonSetter("beneficiary_identification_type")
        public Builder beneficiaryIdentificationType(
            Optional<BeneficiariesValidateBodyBeneficiaryIdentificationTypeEnum>
            beneficiaryIdentificationType) {
            this.beneficiaryIdentificationType = beneficiaryIdentificationType;
            return this;
        }

        /**
         * Sets value for `beneficiaryIdentificationType`
         * A legal document that verifies the identity of the beneficiary. Required documentation will vary depending on the country in which the beneficiary's bank account is held.
         */
        public Builder beneficiaryIdentificationType(
            BeneficiariesValidateBodyBeneficiaryIdentificationTypeEnum beneficiaryIdentificationType) {
            return this.beneficiaryIdentificationType(Optional.ofNullable(beneficiaryIdentificationType));
        }
        /**
         * Sets value for `beneficiaryIdentificationValue`
         * A unique reference code for the identification document, such as a passport number.
         */
        @JsonSetter("beneficiary_identification_value")
        public Builder beneficiaryIdentificationValue(Optional<String> beneficiaryIdentificationValue) {
            this.beneficiaryIdentificationValue = beneficiaryIdentificationValue;
            return this;
        }

        /**
         * Sets value for `beneficiaryIdentificationValue`
         * A unique reference code for the identification document, such as a passport number.
         */
        public Builder beneficiaryIdentificationValue(String beneficiaryIdentificationValue) {
            return this.beneficiaryIdentificationValue(Optional.ofNullable(beneficiaryIdentificationValue));
        }
        /**
         * Sets value for `beneficiaryLastName`
         * Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers.
         */
        @JsonSetter("beneficiary_last_name")
        public Builder beneficiaryLastName(Optional<String> beneficiaryLastName) {
            this.beneficiaryLastName = beneficiaryLastName;
            return this;
        }

        /**
         * Sets value for `beneficiaryLastName`
         * Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers.
         */
        public Builder beneficiaryLastName(String beneficiaryLastName) {
            return this.beneficiaryLastName(Optional.ofNullable(beneficiaryLastName));
        }
        /**
         * Sets value for `beneficiaryPostcode`
         * Postal code
         */
        @JsonSetter("beneficiary_postcode")
        public Builder beneficiaryPostcode(Optional<String> beneficiaryPostcode) {
            this.beneficiaryPostcode = beneficiaryPostcode;
            return this;
        }

        /**
         * Sets value for `beneficiaryPostcode`
         * Postal code
         */
        public Builder beneficiaryPostcode(String beneficiaryPostcode) {
            return this.beneficiaryPostcode(Optional.ofNullable(beneficiaryPostcode));
        }
        /**
         * Sets value for `beneficiaryStateOrProvince`
         * State or province.
         */
        @JsonSetter("beneficiary_state_or_province")
        public Builder beneficiaryStateOrProvince(Optional<String> beneficiaryStateOrProvince) {
            this.beneficiaryStateOrProvince = beneficiaryStateOrProvince;
            return this;
        }

        /**
         * Sets value for `beneficiaryStateOrProvince`
         * State or province.
         */
        public Builder beneficiaryStateOrProvince(String beneficiaryStateOrProvince) {
            return this.beneficiaryStateOrProvince(Optional.ofNullable(beneficiaryStateOrProvince));
        }
        /**
         * Sets value for `bicSwift`
         * BIC/Swift code
         */
        @JsonSetter("bic_swift")
        public Builder bicSwift(Optional<String> bicSwift) {
            this.bicSwift = bicSwift;
            return this;
        }

        /**
         * Sets value for `bicSwift`
         * BIC/Swift code
         */
        public Builder bicSwift(String bicSwift) {
            return this.bicSwift(Optional.ofNullable(bicSwift));
        }
        /**
         * Sets value for `currency`
         * Currency in which money is held in the beneficiary's bank account. Three-digit currency code.
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
         * Sets value for `iban`
         * IBAN code
         */
        @JsonSetter("iban")
        public Builder iban(Optional<String> iban) {
            this.iban = iban;
            return this;
        }

        /**
         * Sets value for `iban`
         * IBAN code
         */
        public Builder iban(String iban) {
            return this.iban(Optional.ofNullable(iban));
        }
        /**
         * Sets value for `onBehalfOf`
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        @JsonSetter("on_behalf_of")
        public Builder onBehalfOf(Optional<String> onBehalfOf) {
            this.onBehalfOf = onBehalfOf;
            return this;
        }

        /**
         * Sets value for `onBehalfOf`
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        public Builder onBehalfOf(String onBehalfOf) {
            return this.onBehalfOf(Optional.ofNullable(onBehalfOf));
        }
        /**
         * Sets value for `paymentTypes`
         * Currencycloud supports two types of payments: "priority", made using the Swift network; and "regular", made using the local bank network.
         */
        @JsonSetter("payment_types[]")
        public Builder paymentTypes(Optional<List<BeneficiariesValidateBodyPaymentTypesItemEnum>>
                                    paymentTypes) {
            this.paymentTypes = paymentTypes;
            return this;
        }

        /**
         * Sets value for `paymentTypes`
         * Currencycloud supports two types of payments: "priority", made using the Swift network; and "regular", made using the local bank network.
         */
        public Builder paymentTypes(List<BeneficiariesValidateBodyPaymentTypesItemEnum> paymentTypes) {
            return this.paymentTypes(Optional.ofNullable(paymentTypes));
        }
        /**
         * Sets value for `routingCodeType1`
         * Local payment routing system. If supplied, routing_code_value_1 should also be supplied.
         */
        @JsonSetter("routing_code_type_1")
        public Builder routingCodeType1(Optional<BeneficiariesValidateBodyRoutingCodeType1Enum>
                                        routingCodeType1) {
            this.routingCodeType1 = routingCodeType1;
            return this;
        }

        /**
         * Sets value for `routingCodeType1`
         * Local payment routing system. If supplied, routing_code_value_1 should also be supplied.
         */
        public Builder routingCodeType1(BeneficiariesValidateBodyRoutingCodeType1Enum routingCodeType1) {
            return this.routingCodeType1(Optional.ofNullable(routingCodeType1));
        }
        /**
         * Sets value for `routingCodeType2`
         * Local payment routing system. If supplied, routing_code_value_2 should also be supplied.
         */
        @JsonSetter("routing_code_type_2")
        public Builder routingCodeType2(Optional<BeneficiariesValidateBodyRoutingCodeType2Enum>
                                        routingCodeType2) {
            this.routingCodeType2 = routingCodeType2;
            return this;
        }

        /**
         * Sets value for `routingCodeType2`
         * Local payment routing system. If supplied, routing_code_value_2 should also be supplied.
         */
        public Builder routingCodeType2(BeneficiariesValidateBodyRoutingCodeType2Enum routingCodeType2) {
            return this.routingCodeType2(Optional.ofNullable(routingCodeType2));
        }
        /**
         * Sets value for `routingCodeValue1`
         * Routing code for routing_code_type_1. If supplied, routing_code_type_1 should also be supplied.
         */
        @JsonSetter("routing_code_value_1")
        public Builder routingCodeValue1(Optional<String> routingCodeValue1) {
            this.routingCodeValue1 = routingCodeValue1;
            return this;
        }

        /**
         * Sets value for `routingCodeValue1`
         * Routing code for routing_code_type_1. If supplied, routing_code_type_1 should also be supplied.
         */
        public Builder routingCodeValue1(String routingCodeValue1) {
            return this.routingCodeValue1(Optional.ofNullable(routingCodeValue1));
        }
        /**
         * Sets value for `routingCodeValue2`
         * Routing code for routing_code_type_2. If supplied, routing_code_type_2 should also be supplied.
         */
        @JsonSetter("routing_code_value_2")
        public Builder routingCodeValue2(Optional<String> routingCodeValue2) {
            this.routingCodeValue2 = routingCodeValue2;
            return this;
        }

        /**
         * Sets value for `routingCodeValue2`
         * Routing code for routing_code_type_2. If supplied, routing_code_type_2 should also be supplied.
         */
        public Builder routingCodeValue2(String routingCodeValue2) {
            return this.routingCodeValue2(Optional.ofNullable(routingCodeValue2));
        }



        public BeneficiariesValidateBody build() {
            if (bankCountry == null) {
                throw new IllegalStateException("bankCountry is required");
            }

            if (currency == null) {
                throw new IllegalStateException("currency is required");
            }

            return new BeneficiariesValidateBody(this);
        }
    }

}



