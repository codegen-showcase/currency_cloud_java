
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
 * BeneficiariesUpdateBody
 */
@JsonDeserialize(builder = BeneficiariesUpdateBody.Builder.class)
public final class BeneficiariesUpdateBody {
    /**
     * Bank account number.
     */
    private final Optional<String> accountNumber;

    /**
     * Bank account holder's name.
     */
    private final Optional<String> bankAccountHolderName;

    /**
     * Bank account type.
     */
    private final Optional<BeneficiariesUpdateBodyBankAccountTypeEnum> bankAccountType;

    /**
     * First line of address.
     */
    private final Optional<String> bankAddress;

    /**
     * Country in which the beneficiary's bank account is held. Two-letter ISO country code.
     */
    private final Optional<String> bankCountry;

    /**
     * Bank name
     */
    private final Optional<String> bankName;

    /**
     * First line of address.
     */
    private final Optional<String> beneficiaryAddress;

    /**
     * City name, should not consist of only numbers.
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
     * If "beneficiary_entity_type" is "company", date of registration.<br> If "beneficiary_entity_type" is "individual", date of birth. The date of birth for the individual should not exceed 125 years and cannot be a date in the future.<br> ISO 8601 format YYYY-MM-DD.
     */
    private final Optional<String> beneficiaryDateOfBirth;

    /**
     * Legal entity
     */
    private final Optional<BeneficiariesUpdateBodyBeneficiaryEntityTypeEnum> beneficiaryEntityType;

    /**
     * Beneficiary external reference.
     */
    private final Optional<String> beneficiaryExternalReference;

    /**
     * Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers.
     */
    private final Optional<String> beneficiaryFirstName;

    /**
     * A legal document that verifies the identity of the beneficiary. Required documentation will vary depending on the country in which the beneficiary's bank account is held.
     */
    private final Optional<BeneficiariesUpdateBodyBeneficiaryIdentificationTypeEnum>
    beneficiaryIdentificationType;

    /**
     * A unique reference code for the identification document, such as a passport number.
     */
    private final Optional<String> beneficiaryIdentificationValue;

    /**
     * Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers or company signifiers.
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
     * Beneficiary nature of business.
     */
    private final Optional<String> businessNature;

    /**
     * Beneficiary company website.
     */
    private final Optional<String> companyWebsite;

    /**
     * Currency in which money is held in the beneficiary's bank account. Three-letter ISO currency code.
     */
    private final Optional<String> currency;

    /**
     * Payments are made automatically to default beneficiaries when a beneficiary is not specified.
     */
    private final Optional<Boolean> defaultBeneficiary;

    /**
     * Beneficiary's email address.
     */
    private final Optional<String> email;

    /**
     * IBAN code
     */
    private final Optional<String> iban;

    /**
     * A nickname for the beneficiary.
     */
    private final Optional<String> name;

    /**
     * Contact UUID.
     */
    private final Optional<String> onBehalfOf;

    /**
     * Currencycloud supports two types of payment - "priority" (Swift) made using the Swift network, and "regular" (local) made using the local bank network.
     */
    private final Optional<List<BeneficiariesUpdateBodyPaymentTypesItemEnum>> paymentTypes;

    /**
     * Local payment routing system.
     */
    private final Optional<BeneficiariesUpdateBodyRoutingCodeType1Enum> routingCodeType1;

    /**
     * Local payment routing system.
     */
    private final Optional<BeneficiariesUpdateBodyRoutingCodeType2Enum> routingCodeType2;

    /**
     * Routing code for "routing_code_type_1".
     */
    private final Optional<String> routingCodeValue1;

    /**
     * Routing code for "routing_code_type_2".
     */
    private final Optional<String> routingCodeValue2;


    private BeneficiariesUpdateBody(Builder builder) {
        this.accountNumber = builder.accountNumber;
        this.bankAccountHolderName = builder.bankAccountHolderName;
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
        this.beneficiaryExternalReference = builder.beneficiaryExternalReference;
        this.beneficiaryFirstName = builder.beneficiaryFirstName;
        this.beneficiaryIdentificationType = builder.beneficiaryIdentificationType;
        this.beneficiaryIdentificationValue = builder.beneficiaryIdentificationValue;
        this.beneficiaryLastName = builder.beneficiaryLastName;
        this.beneficiaryPostcode = builder.beneficiaryPostcode;
        this.beneficiaryStateOrProvince = builder.beneficiaryStateOrProvince;
        this.bicSwift = builder.bicSwift;
        this.businessNature = builder.businessNature;
        this.companyWebsite = builder.companyWebsite;
        this.currency = builder.currency;
        this.defaultBeneficiary = builder.defaultBeneficiary;
        this.email = builder.email;
        this.iban = builder.iban;
        this.name = builder.name;
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
     * Retrieves value for `bankAccountHolderName`
     * Bank account holder's name.
     */
    @JsonProperty("bank_account_holder_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBankAccountHolderName() {
        return bankAccountHolderName;
    }
    /**
     * Retrieves value for `bankAccountType`
     * Bank account type.
     */
    @JsonProperty("bank_account_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<BeneficiariesUpdateBodyBankAccountTypeEnum> getBankAccountType() {
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
     * Country in which the beneficiary's bank account is held. Two-letter ISO country code.
     */
    @JsonProperty("bank_country")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBankCountry() {
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
     * City name, should not consist of only numbers.
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
     * If "beneficiary_entity_type" is "company", date of registration.<br> If "beneficiary_entity_type" is "individual", date of birth. The date of birth for the individual should not exceed 125 years and cannot be a date in the future.<br> ISO 8601 format YYYY-MM-DD.
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
    public Optional<BeneficiariesUpdateBodyBeneficiaryEntityTypeEnum> getBeneficiaryEntityType() {
        return beneficiaryEntityType;
    }
    /**
     * Retrieves value for `beneficiaryExternalReference`
     * Beneficiary external reference.
     */
    @JsonProperty("beneficiary_external_reference")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryExternalReference() {
        return beneficiaryExternalReference;
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
    public Optional<BeneficiariesUpdateBodyBeneficiaryIdentificationTypeEnum>
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
     * Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers or company signifiers.
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
     * Retrieves value for `businessNature`
     * Beneficiary nature of business.
     */
    @JsonProperty("business_nature")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBusinessNature() {
        return businessNature;
    }
    /**
     * Retrieves value for `companyWebsite`
     * Beneficiary company website.
     */
    @JsonProperty("company_website")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCompanyWebsite() {
        return companyWebsite;
    }
    /**
     * Retrieves value for `currency`
     * Currency in which money is held in the beneficiary's bank account. Three-letter ISO currency code.
     */
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `defaultBeneficiary`
     * Payments are made automatically to default beneficiaries when a beneficiary is not specified.
     */
    @JsonProperty("default_beneficiary")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getDefaultBeneficiary() {
        return defaultBeneficiary;
    }
    /**
     * Retrieves value for `email`
     * Beneficiary's email address.
     */
    @JsonProperty("email")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getEmail() {
        return email;
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
     * Retrieves value for `name`
     * A nickname for the beneficiary.
     */
    @JsonProperty("name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getName() {
        return name;
    }
    /**
     * Retrieves value for `onBehalfOf`
     * Contact UUID.
     */
    @JsonProperty("on_behalf_of")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getOnBehalfOf() {
        return onBehalfOf;
    }
    /**
     * Retrieves value for `paymentTypes`
     * Currencycloud supports two types of payment - "priority" (Swift) made using the Swift network, and "regular" (local) made using the local bank network.
     */
    @JsonProperty("payment_types[]")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<BeneficiariesUpdateBodyPaymentTypesItemEnum>> getPaymentTypes() {
        return paymentTypes;
    }
    /**
     * Retrieves value for `routingCodeType1`
     * Local payment routing system.
     */
    @JsonProperty("routing_code_type_1")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<BeneficiariesUpdateBodyRoutingCodeType1Enum> getRoutingCodeType1() {
        return routingCodeType1;
    }
    /**
     * Retrieves value for `routingCodeType2`
     * Local payment routing system.
     */
    @JsonProperty("routing_code_type_2")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<BeneficiariesUpdateBodyRoutingCodeType2Enum> getRoutingCodeType2() {
        return routingCodeType2;
    }
    /**
     * Retrieves value for `routingCodeValue1`
     * Routing code for "routing_code_type_1".
     */
    @JsonProperty("routing_code_value_1")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getRoutingCodeValue1() {
        return routingCodeValue1;
    }
    /**
     * Retrieves value for `routingCodeValue2`
     * Routing code for "routing_code_type_2".
     */
    @JsonProperty("routing_code_value_2")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getRoutingCodeValue2() {
        return routingCodeValue2;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof BeneficiariesUpdateBody && equalTo((BeneficiariesUpdateBody) other);
    }

    private boolean equalTo(BeneficiariesUpdateBody other) {
        return
            accountNumber.equals(other.accountNumber) &&

            bankAccountHolderName.equals(other.bankAccountHolderName) &&

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

            beneficiaryExternalReference.equals(other.beneficiaryExternalReference) &&

            beneficiaryFirstName.equals(other.beneficiaryFirstName) &&

            beneficiaryIdentificationType.equals(other.beneficiaryIdentificationType) &&

            beneficiaryIdentificationValue.equals(other.beneficiaryIdentificationValue) &&

            beneficiaryLastName.equals(other.beneficiaryLastName) &&

            beneficiaryPostcode.equals(other.beneficiaryPostcode) &&

            beneficiaryStateOrProvince.equals(other.beneficiaryStateOrProvince) &&

            bicSwift.equals(other.bicSwift) &&

            businessNature.equals(other.businessNature) &&

            companyWebsite.equals(other.companyWebsite) &&

            currency.equals(other.currency) &&

            defaultBeneficiary.equals(other.defaultBeneficiary) &&

            email.equals(other.email) &&

            iban.equals(other.iban) &&

            name.equals(other.name) &&

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
                   this.bankAccountHolderName,
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
                   this.beneficiaryExternalReference,
                   this.beneficiaryFirstName,
                   this.beneficiaryIdentificationType,
                   this.beneficiaryIdentificationValue,
                   this.beneficiaryLastName,
                   this.beneficiaryPostcode,
                   this.beneficiaryStateOrProvince,
                   this.bicSwift,
                   this.businessNature,
                   this.companyWebsite,
                   this.currency,
                   this.defaultBeneficiary,
                   this.email,
                   this.iban,
                   this.name,
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
        return "BeneficiariesUpdateBody{" +
               "accountNumber=" + accountNumber + ", " +
               "bankAccountHolderName=" + bankAccountHolderName + ", " +
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
               "beneficiaryExternalReference=" + beneficiaryExternalReference + ", " +
               "beneficiaryFirstName=" + beneficiaryFirstName + ", " +
               "beneficiaryIdentificationType=" + beneficiaryIdentificationType + ", " +
               "beneficiaryIdentificationValue=" + beneficiaryIdentificationValue + ", " +
               "beneficiaryLastName=" + beneficiaryLastName + ", " +
               "beneficiaryPostcode=" + beneficiaryPostcode + ", " +
               "beneficiaryStateOrProvince=" + beneficiaryStateOrProvince + ", " +
               "bicSwift=" + bicSwift + ", " +
               "businessNature=" + businessNature + ", " +
               "companyWebsite=" + companyWebsite + ", " +
               "currency=" + currency + ", " +
               "defaultBeneficiary=" + defaultBeneficiary + ", " +
               "email=" + email + ", " +
               "iban=" + iban + ", " +
               "name=" + name + ", " +
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
         * Bank account holder's name.
         */
        private Optional<String> bankAccountHolderName = Optional.empty();

        /**
         * Bank account type.
         */
        private Optional<BeneficiariesUpdateBodyBankAccountTypeEnum> bankAccountType = Optional.empty();

        /**
         * First line of address.
         */
        private Optional<String> bankAddress = Optional.empty();

        /**
         * Country in which the beneficiary's bank account is held. Two-letter ISO country code.
         */
        private Optional<String> bankCountry = Optional.empty();

        /**
         * Bank name
         */
        private Optional<String> bankName = Optional.empty();

        /**
         * First line of address.
         */
        private Optional<String> beneficiaryAddress = Optional.empty();

        /**
         * City name, should not consist of only numbers.
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
         * If "beneficiary_entity_type" is "company", date of registration.<br> If "beneficiary_entity_type" is "individual", date of birth. The date of birth for the individual should not exceed 125 years and cannot be a date in the future.<br> ISO 8601 format YYYY-MM-DD.
         */
        private Optional<String> beneficiaryDateOfBirth = Optional.empty();

        /**
         * Legal entity
         */
        private Optional<BeneficiariesUpdateBodyBeneficiaryEntityTypeEnum> beneficiaryEntityType =
            Optional.empty();

        /**
         * Beneficiary external reference.
         */
        private Optional<String> beneficiaryExternalReference = Optional.empty();

        /**
         * Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers.
         */
        private Optional<String> beneficiaryFirstName = Optional.empty();

        /**
         * A legal document that verifies the identity of the beneficiary. Required documentation will vary depending on the country in which the beneficiary's bank account is held.
         */
        private Optional<BeneficiariesUpdateBodyBeneficiaryIdentificationTypeEnum>
        beneficiaryIdentificationType = Optional.empty();

        /**
         * A unique reference code for the identification document, such as a passport number.
         */
        private Optional<String> beneficiaryIdentificationValue = Optional.empty();

        /**
         * Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers or company signifiers.
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
         * Beneficiary nature of business.
         */
        private Optional<String> businessNature = Optional.empty();

        /**
         * Beneficiary company website.
         */
        private Optional<String> companyWebsite = Optional.empty();

        /**
         * Currency in which money is held in the beneficiary's bank account. Three-letter ISO currency code.
         */
        private Optional<String> currency = Optional.empty();

        /**
         * Payments are made automatically to default beneficiaries when a beneficiary is not specified.
         */
        private Optional<Boolean> defaultBeneficiary = Optional.empty();

        /**
         * Beneficiary's email address.
         */
        private Optional<String> email = Optional.empty();

        /**
         * IBAN code
         */
        private Optional<String> iban = Optional.empty();

        /**
         * A nickname for the beneficiary.
         */
        private Optional<String> name = Optional.empty();

        /**
         * Contact UUID.
         */
        private Optional<String> onBehalfOf = Optional.empty();

        /**
         * Currencycloud supports two types of payment - "priority" (Swift) made using the Swift network, and "regular" (local) made using the local bank network.
         */
        private Optional<List<BeneficiariesUpdateBodyPaymentTypesItemEnum>> paymentTypes = Optional.empty();

        /**
         * Local payment routing system.
         */
        private Optional<BeneficiariesUpdateBodyRoutingCodeType1Enum> routingCodeType1 = Optional.empty();

        /**
         * Local payment routing system.
         */
        private Optional<BeneficiariesUpdateBodyRoutingCodeType2Enum> routingCodeType2 = Optional.empty();

        /**
         * Routing code for "routing_code_type_1".
         */
        private Optional<String> routingCodeValue1 = Optional.empty();

        /**
         * Routing code for "routing_code_type_2".
         */
        private Optional<String> routingCodeValue2 = Optional.empty();


        private Builder() {}

        public Builder from(BeneficiariesUpdateBody other) {
            accountNumber(other.getAccountNumber());
            bankAccountHolderName(other.getBankAccountHolderName());
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
            beneficiaryExternalReference(other.getBeneficiaryExternalReference());
            beneficiaryFirstName(other.getBeneficiaryFirstName());
            beneficiaryIdentificationType(other.getBeneficiaryIdentificationType());
            beneficiaryIdentificationValue(other.getBeneficiaryIdentificationValue());
            beneficiaryLastName(other.getBeneficiaryLastName());
            beneficiaryPostcode(other.getBeneficiaryPostcode());
            beneficiaryStateOrProvince(other.getBeneficiaryStateOrProvince());
            bicSwift(other.getBicSwift());
            businessNature(other.getBusinessNature());
            companyWebsite(other.getCompanyWebsite());
            currency(other.getCurrency());
            defaultBeneficiary(other.getDefaultBeneficiary());
            email(other.getEmail());
            iban(other.getIban());
            name(other.getName());
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
         * Sets value for `bankAccountHolderName`
         * Bank account holder's name.
         */
        @JsonSetter("bank_account_holder_name")
        public Builder bankAccountHolderName(Optional<String> bankAccountHolderName) {
            this.bankAccountHolderName = bankAccountHolderName;
            return this;
        }

        /**
         * Sets value for `bankAccountHolderName`
         * Bank account holder's name.
         */
        public Builder bankAccountHolderName(String bankAccountHolderName) {
            return this.bankAccountHolderName(Optional.ofNullable(bankAccountHolderName));
        }
        /**
         * Sets value for `bankAccountType`
         * Bank account type.
         */
        @JsonSetter("bank_account_type")
        public Builder bankAccountType(Optional<BeneficiariesUpdateBodyBankAccountTypeEnum>
                                       bankAccountType) {
            this.bankAccountType = bankAccountType;
            return this;
        }

        /**
         * Sets value for `bankAccountType`
         * Bank account type.
         */
        public Builder bankAccountType(BeneficiariesUpdateBodyBankAccountTypeEnum bankAccountType) {
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
         * Country in which the beneficiary's bank account is held. Two-letter ISO country code.
         */
        @JsonSetter("bank_country")
        public Builder bankCountry(Optional<String> bankCountry) {
            this.bankCountry = bankCountry;
            return this;
        }

        /**
         * Sets value for `bankCountry`
         * Country in which the beneficiary's bank account is held. Two-letter ISO country code.
         */
        public Builder bankCountry(String bankCountry) {
            return this.bankCountry(Optional.ofNullable(bankCountry));
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
         * City name, should not consist of only numbers.
         */
        @JsonSetter("beneficiary_city")
        public Builder beneficiaryCity(Optional<String> beneficiaryCity) {
            this.beneficiaryCity = beneficiaryCity;
            return this;
        }

        /**
         * Sets value for `beneficiaryCity`
         * City name, should not consist of only numbers.
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
         * If "beneficiary_entity_type" is "company", date of registration.<br> If "beneficiary_entity_type" is "individual", date of birth. The date of birth for the individual should not exceed 125 years and cannot be a date in the future.<br> ISO 8601 format YYYY-MM-DD.
         */
        @JsonSetter("beneficiary_date_of_birth")
        public Builder beneficiaryDateOfBirth(Optional<String> beneficiaryDateOfBirth) {
            this.beneficiaryDateOfBirth = beneficiaryDateOfBirth;
            return this;
        }

        /**
         * Sets value for `beneficiaryDateOfBirth`
         * If "beneficiary_entity_type" is "company", date of registration.<br> If "beneficiary_entity_type" is "individual", date of birth. The date of birth for the individual should not exceed 125 years and cannot be a date in the future.<br> ISO 8601 format YYYY-MM-DD.
         */
        public Builder beneficiaryDateOfBirth(String beneficiaryDateOfBirth) {
            return this.beneficiaryDateOfBirth(Optional.ofNullable(beneficiaryDateOfBirth));
        }
        /**
         * Sets value for `beneficiaryEntityType`
         * Legal entity
         */
        @JsonSetter("beneficiary_entity_type")
        public Builder beneficiaryEntityType(Optional<BeneficiariesUpdateBodyBeneficiaryEntityTypeEnum>
                                             beneficiaryEntityType) {
            this.beneficiaryEntityType = beneficiaryEntityType;
            return this;
        }

        /**
         * Sets value for `beneficiaryEntityType`
         * Legal entity
         */
        public Builder beneficiaryEntityType(BeneficiariesUpdateBodyBeneficiaryEntityTypeEnum
                                             beneficiaryEntityType) {
            return this.beneficiaryEntityType(Optional.ofNullable(beneficiaryEntityType));
        }
        /**
         * Sets value for `beneficiaryExternalReference`
         * Beneficiary external reference.
         */
        @JsonSetter("beneficiary_external_reference")
        public Builder beneficiaryExternalReference(Optional<String> beneficiaryExternalReference) {
            this.beneficiaryExternalReference = beneficiaryExternalReference;
            return this;
        }

        /**
         * Sets value for `beneficiaryExternalReference`
         * Beneficiary external reference.
         */
        public Builder beneficiaryExternalReference(String beneficiaryExternalReference) {
            return this.beneficiaryExternalReference(Optional.ofNullable(beneficiaryExternalReference));
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
            Optional<BeneficiariesUpdateBodyBeneficiaryIdentificationTypeEnum> beneficiaryIdentificationType) {
            this.beneficiaryIdentificationType = beneficiaryIdentificationType;
            return this;
        }

        /**
         * Sets value for `beneficiaryIdentificationType`
         * A legal document that verifies the identity of the beneficiary. Required documentation will vary depending on the country in which the beneficiary's bank account is held.
         */
        public Builder beneficiaryIdentificationType(
            BeneficiariesUpdateBodyBeneficiaryIdentificationTypeEnum beneficiaryIdentificationType) {
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
         * Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers or company signifiers.
         */
        @JsonSetter("beneficiary_last_name")
        public Builder beneficiaryLastName(Optional<String> beneficiaryLastName) {
            this.beneficiaryLastName = beneficiaryLastName;
            return this;
        }

        /**
         * Sets value for `beneficiaryLastName`
         * Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers or company signifiers.
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
         * Sets value for `businessNature`
         * Beneficiary nature of business.
         */
        @JsonSetter("business_nature")
        public Builder businessNature(Optional<String> businessNature) {
            this.businessNature = businessNature;
            return this;
        }

        /**
         * Sets value for `businessNature`
         * Beneficiary nature of business.
         */
        public Builder businessNature(String businessNature) {
            return this.businessNature(Optional.ofNullable(businessNature));
        }
        /**
         * Sets value for `companyWebsite`
         * Beneficiary company website.
         */
        @JsonSetter("company_website")
        public Builder companyWebsite(Optional<String> companyWebsite) {
            this.companyWebsite = companyWebsite;
            return this;
        }

        /**
         * Sets value for `companyWebsite`
         * Beneficiary company website.
         */
        public Builder companyWebsite(String companyWebsite) {
            return this.companyWebsite(Optional.ofNullable(companyWebsite));
        }
        /**
         * Sets value for `currency`
         * Currency in which money is held in the beneficiary's bank account. Three-letter ISO currency code.
         */
        @JsonSetter("currency")
        public Builder currency(Optional<String> currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Sets value for `currency`
         * Currency in which money is held in the beneficiary's bank account. Three-letter ISO currency code.
         */
        public Builder currency(String currency) {
            return this.currency(Optional.ofNullable(currency));
        }
        /**
         * Sets value for `defaultBeneficiary`
         * Payments are made automatically to default beneficiaries when a beneficiary is not specified.
         */
        @JsonSetter("default_beneficiary")
        public Builder defaultBeneficiary(Optional<Boolean> defaultBeneficiary) {
            this.defaultBeneficiary = defaultBeneficiary;
            return this;
        }

        /**
         * Sets value for `defaultBeneficiary`
         * Payments are made automatically to default beneficiaries when a beneficiary is not specified.
         */
        public Builder defaultBeneficiary(Boolean defaultBeneficiary) {
            return this.defaultBeneficiary(Optional.ofNullable(defaultBeneficiary));
        }
        /**
         * Sets value for `email`
         * Beneficiary's email address.
         */
        @JsonSetter("email")
        public Builder email(Optional<String> email) {
            this.email = email;
            return this;
        }

        /**
         * Sets value for `email`
         * Beneficiary's email address.
         */
        public Builder email(String email) {
            return this.email(Optional.ofNullable(email));
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
         * Sets value for `name`
         * A nickname for the beneficiary.
         */
        @JsonSetter("name")
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        /**
         * Sets value for `name`
         * A nickname for the beneficiary.
         */
        public Builder name(String name) {
            return this.name(Optional.ofNullable(name));
        }
        /**
         * Sets value for `onBehalfOf`
         * Contact UUID.
         */
        @JsonSetter("on_behalf_of")
        public Builder onBehalfOf(Optional<String> onBehalfOf) {
            this.onBehalfOf = onBehalfOf;
            return this;
        }

        /**
         * Sets value for `onBehalfOf`
         * Contact UUID.
         */
        public Builder onBehalfOf(String onBehalfOf) {
            return this.onBehalfOf(Optional.ofNullable(onBehalfOf));
        }
        /**
         * Sets value for `paymentTypes`
         * Currencycloud supports two types of payment - "priority" (Swift) made using the Swift network, and "regular" (local) made using the local bank network.
         */
        @JsonSetter("payment_types[]")
        public Builder paymentTypes(Optional<List<BeneficiariesUpdateBodyPaymentTypesItemEnum>>
                                    paymentTypes) {
            this.paymentTypes = paymentTypes;
            return this;
        }

        /**
         * Sets value for `paymentTypes`
         * Currencycloud supports two types of payment - "priority" (Swift) made using the Swift network, and "regular" (local) made using the local bank network.
         */
        public Builder paymentTypes(List<BeneficiariesUpdateBodyPaymentTypesItemEnum> paymentTypes) {
            return this.paymentTypes(Optional.ofNullable(paymentTypes));
        }
        /**
         * Sets value for `routingCodeType1`
         * Local payment routing system.
         */
        @JsonSetter("routing_code_type_1")
        public Builder routingCodeType1(Optional<BeneficiariesUpdateBodyRoutingCodeType1Enum>
                                        routingCodeType1) {
            this.routingCodeType1 = routingCodeType1;
            return this;
        }

        /**
         * Sets value for `routingCodeType1`
         * Local payment routing system.
         */
        public Builder routingCodeType1(BeneficiariesUpdateBodyRoutingCodeType1Enum routingCodeType1) {
            return this.routingCodeType1(Optional.ofNullable(routingCodeType1));
        }
        /**
         * Sets value for `routingCodeType2`
         * Local payment routing system.
         */
        @JsonSetter("routing_code_type_2")
        public Builder routingCodeType2(Optional<BeneficiariesUpdateBodyRoutingCodeType2Enum>
                                        routingCodeType2) {
            this.routingCodeType2 = routingCodeType2;
            return this;
        }

        /**
         * Sets value for `routingCodeType2`
         * Local payment routing system.
         */
        public Builder routingCodeType2(BeneficiariesUpdateBodyRoutingCodeType2Enum routingCodeType2) {
            return this.routingCodeType2(Optional.ofNullable(routingCodeType2));
        }
        /**
         * Sets value for `routingCodeValue1`
         * Routing code for "routing_code_type_1".
         */
        @JsonSetter("routing_code_value_1")
        public Builder routingCodeValue1(Optional<String> routingCodeValue1) {
            this.routingCodeValue1 = routingCodeValue1;
            return this;
        }

        /**
         * Sets value for `routingCodeValue1`
         * Routing code for "routing_code_type_1".
         */
        public Builder routingCodeValue1(String routingCodeValue1) {
            return this.routingCodeValue1(Optional.ofNullable(routingCodeValue1));
        }
        /**
         * Sets value for `routingCodeValue2`
         * Routing code for "routing_code_type_2".
         */
        @JsonSetter("routing_code_value_2")
        public Builder routingCodeValue2(Optional<String> routingCodeValue2) {
            this.routingCodeValue2 = routingCodeValue2;
            return this;
        }

        /**
         * Sets value for `routingCodeValue2`
         * Routing code for "routing_code_type_2".
         */
        public Builder routingCodeValue2(String routingCodeValue2) {
            return this.routingCodeValue2(Optional.ofNullable(routingCodeValue2));
        }



        public BeneficiariesUpdateBody build() {
            return new BeneficiariesUpdateBody(this);
        }
    }

}



