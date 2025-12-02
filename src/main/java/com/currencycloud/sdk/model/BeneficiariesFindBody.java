
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * BeneficiariesFindBody
 */
@JsonDeserialize(builder = BeneficiariesFindBody.Builder.class)
public final class BeneficiariesFindBody {
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
    private final Optional<BeneficiariesFindBodyBankAccountTypeEnum> bankAccountType;

    /**
     * Bank name
     */
    private final Optional<String> bankName;

    /**
     * City
     */
    private final Optional<String> beneficiaryCity;

    /**
     * Required if "beneficiary_entity_type" is "company".
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
     * Beneficiary's legal entity type - individual or company.
     */
    private final Optional<BeneficiariesFindBodyBeneficiaryEntityTypeEnum> beneficiaryEntityType;

    /**
     * Beneficiary external reference.
     */
    private final Optional<String> beneficiaryExternalReference;

    /**
     * Required if "beneficiary_entity_type" is "individual".
     */
    private final Optional<String> beneficiaryFirstName;

    /**
     * Required if "beneficiary_entity_type" is "individual".
     */
    private final Optional<String> beneficiaryLastName;

    /**
     * Post code
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
     * Currency in which money is held in the beneficiary's bank account. Three-letter currency code.
     */
    private final Optional<String> currency;

    /**
     * Payments are made automatically to default beneficiaries when a beneficiary is not specified.
     */
    private final Optional<Boolean> defaultBeneficiary;

    /**
     * IBAN code
     */
    private final Optional<String> iban;

    /**
     * Beneficiary's name.
     */
    private final Optional<String> name;

    /**
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    private final Optional<String> onBehalfOf;

    /**
     * Any field name to change the sort order.
     */
    private final Optional<String> order;

    /**
     * Sort records in ascending or descending order.
     */
    private final Optional<BeneficiariesFindBodyOrderAscDescEnum> orderAscDesc;

    /**
     * Page number
     */
    private final Optional<Long> page;

    /**
     * Number of results per page.
     */
    private final Optional<Long> perPage;

    /**
     * Local payment routing system. If supplied, a value for routing_code_value[0] must also be supplied.
     */
    private final Optional<BeneficiariesFindBodyRoutingCodeType0Enum> routingCodeType0;

    /**
     * The value for any routing system specified in routing_code_type[0]. If supplied, a value for routing_code_type[0] must also be supplied.
     */
    private final Optional<String> routingCodeValue0;

    /**
     * Search "own" account, "clients" sub-accounts, or "all" accounts.
     */
    private final Optional<BeneficiariesFindBodyScopeEnum> scope;


    private BeneficiariesFindBody(Builder builder) {
        this.accountNumber = builder.accountNumber;
        this.bankAccountHolderName = builder.bankAccountHolderName;
        this.bankAccountType = builder.bankAccountType;
        this.bankName = builder.bankName;
        this.beneficiaryCity = builder.beneficiaryCity;
        this.beneficiaryCompanyName = builder.beneficiaryCompanyName;
        this.beneficiaryCountry = builder.beneficiaryCountry;
        this.beneficiaryDateOfBirth = builder.beneficiaryDateOfBirth;
        this.beneficiaryEntityType = builder.beneficiaryEntityType;
        this.beneficiaryExternalReference = builder.beneficiaryExternalReference;
        this.beneficiaryFirstName = builder.beneficiaryFirstName;
        this.beneficiaryLastName = builder.beneficiaryLastName;
        this.beneficiaryPostcode = builder.beneficiaryPostcode;
        this.beneficiaryStateOrProvince = builder.beneficiaryStateOrProvince;
        this.bicSwift = builder.bicSwift;
        this.currency = builder.currency;
        this.defaultBeneficiary = builder.defaultBeneficiary;
        this.iban = builder.iban;
        this.name = builder.name;
        this.onBehalfOf = builder.onBehalfOf;
        this.order = builder.order;
        this.orderAscDesc = builder.orderAscDesc;
        this.page = builder.page;
        this.perPage = builder.perPage;
        this.routingCodeType0 = builder.routingCodeType0;
        this.routingCodeValue0 = builder.routingCodeValue0;
        this.scope = builder.scope;
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
    public Optional<BeneficiariesFindBodyBankAccountTypeEnum> getBankAccountType() {
        return bankAccountType;
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
     * Required if "beneficiary_entity_type" is "company".
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
     * Beneficiary's legal entity type - individual or company.
     */
    @JsonProperty("beneficiary_entity_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<BeneficiariesFindBodyBeneficiaryEntityTypeEnum> getBeneficiaryEntityType() {
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
     * Required if "beneficiary_entity_type" is "individual".
     */
    @JsonProperty("beneficiary_first_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryFirstName() {
        return beneficiaryFirstName;
    }
    /**
     * Retrieves value for `beneficiaryLastName`
     * Required if "beneficiary_entity_type" is "individual".
     */
    @JsonProperty("beneficiary_last_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryLastName() {
        return beneficiaryLastName;
    }
    /**
     * Retrieves value for `beneficiaryPostcode`
     * Post code
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
     * Currency in which money is held in the beneficiary's bank account. Three-letter currency code.
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
     * Beneficiary's name.
     */
    @JsonProperty("name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getName() {
        return name;
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
     * Retrieves value for `order`
     * Any field name to change the sort order.
     */
    @JsonProperty("order")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getOrder() {
        return order;
    }
    /**
     * Retrieves value for `orderAscDesc`
     * Sort records in ascending or descending order.
     */
    @JsonProperty("order_asc_desc")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<BeneficiariesFindBodyOrderAscDescEnum> getOrderAscDesc() {
        return orderAscDesc;
    }
    /**
     * Retrieves value for `page`
     * Page number
     */
    @JsonProperty("page")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Long> getPage() {
        return page;
    }
    /**
     * Retrieves value for `perPage`
     * Number of results per page.
     */
    @JsonProperty("per_page")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Long> getPerPage() {
        return perPage;
    }
    /**
     * Retrieves value for `routingCodeType0`
     * Local payment routing system. If supplied, a value for routing_code_value[0] must also be supplied.
     */
    @JsonProperty("routing_code_type[0]")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<BeneficiariesFindBodyRoutingCodeType0Enum> getRoutingCodeType0() {
        return routingCodeType0;
    }
    /**
     * Retrieves value for `routingCodeValue0`
     * The value for any routing system specified in routing_code_type[0]. If supplied, a value for routing_code_type[0] must also be supplied.
     */
    @JsonProperty("routing_code_value[0]")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getRoutingCodeValue0() {
        return routingCodeValue0;
    }
    /**
     * Retrieves value for `scope`
     * Search "own" account, "clients" sub-accounts, or "all" accounts.
     */
    @JsonProperty("scope")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<BeneficiariesFindBodyScopeEnum> getScope() {
        return scope;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof BeneficiariesFindBody && equalTo((BeneficiariesFindBody) other);
    }

    private boolean equalTo(BeneficiariesFindBody other) {
        return
            accountNumber.equals(other.accountNumber) &&

            bankAccountHolderName.equals(other.bankAccountHolderName) &&

            bankAccountType.equals(other.bankAccountType) &&

            bankName.equals(other.bankName) &&

            beneficiaryCity.equals(other.beneficiaryCity) &&

            beneficiaryCompanyName.equals(other.beneficiaryCompanyName) &&

            beneficiaryCountry.equals(other.beneficiaryCountry) &&

            beneficiaryDateOfBirth.equals(other.beneficiaryDateOfBirth) &&

            beneficiaryEntityType.equals(other.beneficiaryEntityType) &&

            beneficiaryExternalReference.equals(other.beneficiaryExternalReference) &&

            beneficiaryFirstName.equals(other.beneficiaryFirstName) &&

            beneficiaryLastName.equals(other.beneficiaryLastName) &&

            beneficiaryPostcode.equals(other.beneficiaryPostcode) &&

            beneficiaryStateOrProvince.equals(other.beneficiaryStateOrProvince) &&

            bicSwift.equals(other.bicSwift) &&

            currency.equals(other.currency) &&

            defaultBeneficiary.equals(other.defaultBeneficiary) &&

            iban.equals(other.iban) &&

            name.equals(other.name) &&

            onBehalfOf.equals(other.onBehalfOf) &&

            order.equals(other.order) &&

            orderAscDesc.equals(other.orderAscDesc) &&

            page.equals(other.page) &&

            perPage.equals(other.perPage) &&

            routingCodeType0.equals(other.routingCodeType0) &&

            routingCodeValue0.equals(other.routingCodeValue0) &&

            scope.equals(other.scope)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountNumber,
                   this.bankAccountHolderName,
                   this.bankAccountType,
                   this.bankName,
                   this.beneficiaryCity,
                   this.beneficiaryCompanyName,
                   this.beneficiaryCountry,
                   this.beneficiaryDateOfBirth,
                   this.beneficiaryEntityType,
                   this.beneficiaryExternalReference,
                   this.beneficiaryFirstName,
                   this.beneficiaryLastName,
                   this.beneficiaryPostcode,
                   this.beneficiaryStateOrProvince,
                   this.bicSwift,
                   this.currency,
                   this.defaultBeneficiary,
                   this.iban,
                   this.name,
                   this.onBehalfOf,
                   this.order,
                   this.orderAscDesc,
                   this.page,
                   this.perPage,
                   this.routingCodeType0,
                   this.routingCodeValue0,
                   this.scope
               );
    }

    @Override
    public String toString() {
        return "BeneficiariesFindBody{" +
               "accountNumber=" + accountNumber + ", " +
               "bankAccountHolderName=" + bankAccountHolderName + ", " +
               "bankAccountType=" + bankAccountType + ", " +
               "bankName=" + bankName + ", " +
               "beneficiaryCity=" + beneficiaryCity + ", " +
               "beneficiaryCompanyName=" + beneficiaryCompanyName + ", " +
               "beneficiaryCountry=" + beneficiaryCountry + ", " +
               "beneficiaryDateOfBirth=" + beneficiaryDateOfBirth + ", " +
               "beneficiaryEntityType=" + beneficiaryEntityType + ", " +
               "beneficiaryExternalReference=" + beneficiaryExternalReference + ", " +
               "beneficiaryFirstName=" + beneficiaryFirstName + ", " +
               "beneficiaryLastName=" + beneficiaryLastName + ", " +
               "beneficiaryPostcode=" + beneficiaryPostcode + ", " +
               "beneficiaryStateOrProvince=" + beneficiaryStateOrProvince + ", " +
               "bicSwift=" + bicSwift + ", " +
               "currency=" + currency + ", " +
               "defaultBeneficiary=" + defaultBeneficiary + ", " +
               "iban=" + iban + ", " +
               "name=" + name + ", " +
               "onBehalfOf=" + onBehalfOf + ", " +
               "order=" + order + ", " +
               "orderAscDesc=" + orderAscDesc + ", " +
               "page=" + page + ", " +
               "perPage=" + perPage + ", " +
               "routingCodeType0=" + routingCodeType0 + ", " +
               "routingCodeValue0=" + routingCodeValue0 + ", " +
               "scope=" + scope +
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
        private Optional<BeneficiariesFindBodyBankAccountTypeEnum> bankAccountType = Optional.empty();

        /**
         * Bank name
         */
        private Optional<String> bankName = Optional.empty();

        /**
         * City
         */
        private Optional<String> beneficiaryCity = Optional.empty();

        /**
         * Required if "beneficiary_entity_type" is "company".
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
         * Beneficiary's legal entity type - individual or company.
         */
        private Optional<BeneficiariesFindBodyBeneficiaryEntityTypeEnum> beneficiaryEntityType =
            Optional.empty();

        /**
         * Beneficiary external reference.
         */
        private Optional<String> beneficiaryExternalReference = Optional.empty();

        /**
         * Required if "beneficiary_entity_type" is "individual".
         */
        private Optional<String> beneficiaryFirstName = Optional.empty();

        /**
         * Required if "beneficiary_entity_type" is "individual".
         */
        private Optional<String> beneficiaryLastName = Optional.empty();

        /**
         * Post code
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
         * Currency in which money is held in the beneficiary's bank account. Three-letter currency code.
         */
        private Optional<String> currency = Optional.empty();

        /**
         * Payments are made automatically to default beneficiaries when a beneficiary is not specified.
         */
        private Optional<Boolean> defaultBeneficiary = Optional.empty();

        /**
         * IBAN code
         */
        private Optional<String> iban = Optional.empty();

        /**
         * Beneficiary's name.
         */
        private Optional<String> name = Optional.empty();

        /**
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        private Optional<String> onBehalfOf = Optional.empty();

        /**
         * Any field name to change the sort order.
         */
        private Optional<String> order = Optional.empty();

        /**
         * Sort records in ascending or descending order.
         */
        private Optional<BeneficiariesFindBodyOrderAscDescEnum> orderAscDesc = Optional.empty();

        /**
         * Page number
         */
        private Optional<Long> page = Optional.empty();

        /**
         * Number of results per page.
         */
        private Optional<Long> perPage = Optional.empty();

        /**
         * Local payment routing system. If supplied, a value for routing_code_value[0] must also be supplied.
         */
        private Optional<BeneficiariesFindBodyRoutingCodeType0Enum> routingCodeType0 = Optional.empty();

        /**
         * The value for any routing system specified in routing_code_type[0]. If supplied, a value for routing_code_type[0] must also be supplied.
         */
        private Optional<String> routingCodeValue0 = Optional.empty();

        /**
         * Search "own" account, "clients" sub-accounts, or "all" accounts.
         */
        private Optional<BeneficiariesFindBodyScopeEnum> scope = Optional.empty();


        private Builder() {}

        public Builder from(BeneficiariesFindBody other) {
            accountNumber(other.getAccountNumber());
            bankAccountHolderName(other.getBankAccountHolderName());
            bankAccountType(other.getBankAccountType());
            bankName(other.getBankName());
            beneficiaryCity(other.getBeneficiaryCity());
            beneficiaryCompanyName(other.getBeneficiaryCompanyName());
            beneficiaryCountry(other.getBeneficiaryCountry());
            beneficiaryDateOfBirth(other.getBeneficiaryDateOfBirth());
            beneficiaryEntityType(other.getBeneficiaryEntityType());
            beneficiaryExternalReference(other.getBeneficiaryExternalReference());
            beneficiaryFirstName(other.getBeneficiaryFirstName());
            beneficiaryLastName(other.getBeneficiaryLastName());
            beneficiaryPostcode(other.getBeneficiaryPostcode());
            beneficiaryStateOrProvince(other.getBeneficiaryStateOrProvince());
            bicSwift(other.getBicSwift());
            currency(other.getCurrency());
            defaultBeneficiary(other.getDefaultBeneficiary());
            iban(other.getIban());
            name(other.getName());
            onBehalfOf(other.getOnBehalfOf());
            order(other.getOrder());
            orderAscDesc(other.getOrderAscDesc());
            page(other.getPage());
            perPage(other.getPerPage());
            routingCodeType0(other.getRoutingCodeType0());
            routingCodeValue0(other.getRoutingCodeValue0());
            scope(other.getScope());
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
        public Builder bankAccountType(Optional<BeneficiariesFindBodyBankAccountTypeEnum> bankAccountType) {
            this.bankAccountType = bankAccountType;
            return this;
        }

        /**
         * Sets value for `bankAccountType`
         * Bank account type.
         */
        public Builder bankAccountType(BeneficiariesFindBodyBankAccountTypeEnum bankAccountType) {
            return this.bankAccountType(Optional.ofNullable(bankAccountType));
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
         * Required if "beneficiary_entity_type" is "company".
         */
        @JsonSetter("beneficiary_company_name")
        public Builder beneficiaryCompanyName(Optional<String> beneficiaryCompanyName) {
            this.beneficiaryCompanyName = beneficiaryCompanyName;
            return this;
        }

        /**
         * Sets value for `beneficiaryCompanyName`
         * Required if "beneficiary_entity_type" is "company".
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
         * Beneficiary's legal entity type - individual or company.
         */
        @JsonSetter("beneficiary_entity_type")
        public Builder beneficiaryEntityType(Optional<BeneficiariesFindBodyBeneficiaryEntityTypeEnum>
                                             beneficiaryEntityType) {
            this.beneficiaryEntityType = beneficiaryEntityType;
            return this;
        }

        /**
         * Sets value for `beneficiaryEntityType`
         * Beneficiary's legal entity type - individual or company.
         */
        public Builder beneficiaryEntityType(BeneficiariesFindBodyBeneficiaryEntityTypeEnum
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
         * Required if "beneficiary_entity_type" is "individual".
         */
        @JsonSetter("beneficiary_first_name")
        public Builder beneficiaryFirstName(Optional<String> beneficiaryFirstName) {
            this.beneficiaryFirstName = beneficiaryFirstName;
            return this;
        }

        /**
         * Sets value for `beneficiaryFirstName`
         * Required if "beneficiary_entity_type" is "individual".
         */
        public Builder beneficiaryFirstName(String beneficiaryFirstName) {
            return this.beneficiaryFirstName(Optional.ofNullable(beneficiaryFirstName));
        }
        /**
         * Sets value for `beneficiaryLastName`
         * Required if "beneficiary_entity_type" is "individual".
         */
        @JsonSetter("beneficiary_last_name")
        public Builder beneficiaryLastName(Optional<String> beneficiaryLastName) {
            this.beneficiaryLastName = beneficiaryLastName;
            return this;
        }

        /**
         * Sets value for `beneficiaryLastName`
         * Required if "beneficiary_entity_type" is "individual".
         */
        public Builder beneficiaryLastName(String beneficiaryLastName) {
            return this.beneficiaryLastName(Optional.ofNullable(beneficiaryLastName));
        }
        /**
         * Sets value for `beneficiaryPostcode`
         * Post code
         */
        @JsonSetter("beneficiary_postcode")
        public Builder beneficiaryPostcode(Optional<String> beneficiaryPostcode) {
            this.beneficiaryPostcode = beneficiaryPostcode;
            return this;
        }

        /**
         * Sets value for `beneficiaryPostcode`
         * Post code
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
         * Currency in which money is held in the beneficiary's bank account. Three-letter currency code.
         */
        @JsonSetter("currency")
        public Builder currency(Optional<String> currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Sets value for `currency`
         * Currency in which money is held in the beneficiary's bank account. Three-letter currency code.
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
         * Beneficiary's name.
         */
        @JsonSetter("name")
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        /**
         * Sets value for `name`
         * Beneficiary's name.
         */
        public Builder name(String name) {
            return this.name(Optional.ofNullable(name));
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
         * Sets value for `order`
         * Any field name to change the sort order.
         */
        @JsonSetter("order")
        public Builder order(Optional<String> order) {
            this.order = order;
            return this;
        }

        /**
         * Sets value for `order`
         * Any field name to change the sort order.
         */
        public Builder order(String order) {
            return this.order(Optional.ofNullable(order));
        }
        /**
         * Sets value for `orderAscDesc`
         * Sort records in ascending or descending order.
         */
        @JsonSetter("order_asc_desc")
        public Builder orderAscDesc(Optional<BeneficiariesFindBodyOrderAscDescEnum> orderAscDesc) {
            this.orderAscDesc = orderAscDesc;
            return this;
        }

        /**
         * Sets value for `orderAscDesc`
         * Sort records in ascending or descending order.
         */
        public Builder orderAscDesc(BeneficiariesFindBodyOrderAscDescEnum orderAscDesc) {
            return this.orderAscDesc(Optional.ofNullable(orderAscDesc));
        }
        /**
         * Sets value for `page`
         * Page number
         */
        @JsonSetter("page")
        public Builder page(Optional<Long> page) {
            this.page = page;
            return this;
        }

        /**
         * Sets value for `page`
         * Page number
         */
        public Builder page(Long page) {
            return this.page(Optional.ofNullable(page));
        }
        /**
         * Sets value for `perPage`
         * Number of results per page.
         */
        @JsonSetter("per_page")
        public Builder perPage(Optional<Long> perPage) {
            this.perPage = perPage;
            return this;
        }

        /**
         * Sets value for `perPage`
         * Number of results per page.
         */
        public Builder perPage(Long perPage) {
            return this.perPage(Optional.ofNullable(perPage));
        }
        /**
         * Sets value for `routingCodeType0`
         * Local payment routing system. If supplied, a value for routing_code_value[0] must also be supplied.
         */
        @JsonSetter("routing_code_type[0]")
        public Builder routingCodeType0(Optional<BeneficiariesFindBodyRoutingCodeType0Enum>
                                        routingCodeType0) {
            this.routingCodeType0 = routingCodeType0;
            return this;
        }

        /**
         * Sets value for `routingCodeType0`
         * Local payment routing system. If supplied, a value for routing_code_value[0] must also be supplied.
         */
        public Builder routingCodeType0(BeneficiariesFindBodyRoutingCodeType0Enum routingCodeType0) {
            return this.routingCodeType0(Optional.ofNullable(routingCodeType0));
        }
        /**
         * Sets value for `routingCodeValue0`
         * The value for any routing system specified in routing_code_type[0]. If supplied, a value for routing_code_type[0] must also be supplied.
         */
        @JsonSetter("routing_code_value[0]")
        public Builder routingCodeValue0(Optional<String> routingCodeValue0) {
            this.routingCodeValue0 = routingCodeValue0;
            return this;
        }

        /**
         * Sets value for `routingCodeValue0`
         * The value for any routing system specified in routing_code_type[0]. If supplied, a value for routing_code_type[0] must also be supplied.
         */
        public Builder routingCodeValue0(String routingCodeValue0) {
            return this.routingCodeValue0(Optional.ofNullable(routingCodeValue0));
        }
        /**
         * Sets value for `scope`
         * Search "own" account, "clients" sub-accounts, or "all" accounts.
         */
        @JsonSetter("scope")
        public Builder scope(Optional<BeneficiariesFindBodyScopeEnum> scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Sets value for `scope`
         * Search "own" account, "clients" sub-accounts, or "all" accounts.
         */
        public Builder scope(BeneficiariesFindBodyScopeEnum scope) {
            return this.scope(Optional.ofNullable(scope));
        }



        public BeneficiariesFindBody build() {
            return new BeneficiariesFindBody(this);
        }
    }

}



