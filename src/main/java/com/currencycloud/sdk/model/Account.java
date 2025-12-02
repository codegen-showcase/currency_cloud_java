
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Account.
 */
@JsonDeserialize(builder = Account.Builder.class)
public final class Account {
    /**
     * Account name
     */
    private final Optional<String> accountName;

    /**
     * True for clients using Currencycloud’s regulatory coverage, false otherwise.
     */
    private final Optional<Boolean> agentOrReliance;

    /**
     * Is trading via the Currencycloud API enabled?
     */
    private final Optional<Boolean> apiTrading;

    /**
     * Has the bank account been verified?
     */
    private final Optional<AccountBankAccountVerifiedEnum> bankAccountVerified;

    /**
     * The value of this field is used for white labeling the Currencycloud user interface.
     */
    private final Optional<String> brand;

    /**
     * City
     */
    private final Optional<String> city;

    /**
     * Two-letter ISO country code.
     */
    private final Optional<String> country;

    /**
     * The date/time the account was created.
     */
    private final Optional<String> createdAt;

    /**
     * Account ID
     */
    private final Optional<String> id;

    /**
     * The legal document that verifies the identity of the account owner, e.g. passport.
     */
    private final Optional<AccountIdentificationTypeEnum> identificationType;

    /**
     * The unique reference code for the identification document, e.g. passport number.
     */
    private final Optional<String> identificationValue;

    /**
     * The type of entity - individual or company.
     */
    private final Optional<String> legalEntityType;

    /**
     * Is trading via Currencycloud Direct enabled?
     */
    private final Optional<Boolean> onlineTrading;

    /**
     * Is trading via phone enabled?
     */
    private final Optional<Boolean> phoneTrading;

    /**
     * Postal code
     */
    private final Optional<String> postalCode;

    /**
     * Is the account enabled for third party funds?
     */
    private final Optional<Boolean> processThirdPartyFunds;

    /**
     * The settlement type - bulk or net.
     */
    private final Optional<AccountSettlementTypeEnum> settlementType;

    /**
     * The account's reference number.
     */
    private final Optional<String> shortReference;

    /**
     * The name of the spread table assigned to the account.
     */
    private final Optional<String> spreadTable;

    /**
     * State or province two-letter ISO 3166 code. Only applicable to some countries.
     */
    private final Optional<String> stateOrProvince;

    /**
     * Account status
     */
    private final Optional<AccountStatusEnum> status;

    /**
     * First line of address.
     */
    private final Optional<String> street;

    /**
     * Have the terms and conditions been accepted?
     */
    private final Optional<Boolean> termsAndConditionsAccepted;

    /**
     * The date/time the account was last updated.
     */
    private final Optional<String> updatedAt;

    /**
     * User-generated reference code.
     */
    private final Optional<String> yourReference;


    private Account(Builder builder) {
        this.accountName = builder.accountName;
        this.agentOrReliance = builder.agentOrReliance;
        this.apiTrading = builder.apiTrading;
        this.bankAccountVerified = builder.bankAccountVerified;
        this.brand = builder.brand;
        this.city = builder.city;
        this.country = builder.country;
        this.createdAt = builder.createdAt;
        this.id = builder.id;
        this.identificationType = builder.identificationType;
        this.identificationValue = builder.identificationValue;
        this.legalEntityType = builder.legalEntityType;
        this.onlineTrading = builder.onlineTrading;
        this.phoneTrading = builder.phoneTrading;
        this.postalCode = builder.postalCode;
        this.processThirdPartyFunds = builder.processThirdPartyFunds;
        this.settlementType = builder.settlementType;
        this.shortReference = builder.shortReference;
        this.spreadTable = builder.spreadTable;
        this.stateOrProvince = builder.stateOrProvince;
        this.status = builder.status;
        this.street = builder.street;
        this.termsAndConditionsAccepted = builder.termsAndConditionsAccepted;
        this.updatedAt = builder.updatedAt;
        this.yourReference = builder.yourReference;
    }

    /**
     * Retrieves value for `accountName`
     * Account name
     */
    @JsonProperty("account_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAccountName() {
        return accountName;
    }
    /**
     * Retrieves value for `agentOrReliance`
     * True for clients using Currencycloud’s regulatory coverage, false otherwise.
     */
    @JsonProperty("agent_or_reliance")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getAgentOrReliance() {
        return agentOrReliance;
    }
    /**
     * Retrieves value for `apiTrading`
     * Is trading via the Currencycloud API enabled?
     */
    @JsonProperty("api_trading")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getApiTrading() {
        return apiTrading;
    }
    /**
     * Retrieves value for `bankAccountVerified`
     * Has the bank account been verified?
     */
    @JsonProperty("bank_account_verified")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<AccountBankAccountVerifiedEnum> getBankAccountVerified() {
        return bankAccountVerified;
    }
    /**
     * Retrieves value for `brand`
     * The value of this field is used for white labeling the Currencycloud user interface.
     */
    @JsonProperty("brand")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBrand() {
        return brand;
    }
    /**
     * Retrieves value for `city`
     * City
     */
    @JsonProperty("city")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCity() {
        return city;
    }
    /**
     * Retrieves value for `country`
     * Two-letter ISO country code.
     */
    @JsonProperty("country")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCountry() {
        return country;
    }
    /**
     * Retrieves value for `createdAt`
     * The date/time the account was created.
     */
    @JsonProperty("created_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAt() {
        return createdAt;
    }
    /**
     * Retrieves value for `id`
     * Account ID
     */
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getId() {
        return id;
    }
    /**
     * Retrieves value for `identificationType`
     * The legal document that verifies the identity of the account owner, e.g. passport.
     */
    @JsonProperty("identification_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<AccountIdentificationTypeEnum> getIdentificationType() {
        return identificationType;
    }
    /**
     * Retrieves value for `identificationValue`
     * The unique reference code for the identification document, e.g. passport number.
     */
    @JsonProperty("identification_value")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getIdentificationValue() {
        return identificationValue;
    }
    /**
     * Retrieves value for `legalEntityType`
     * The type of entity - individual or company.
     */
    @JsonProperty("legal_entity_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getLegalEntityType() {
        return legalEntityType;
    }
    /**
     * Retrieves value for `onlineTrading`
     * Is trading via Currencycloud Direct enabled?
     */
    @JsonProperty("online_trading")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getOnlineTrading() {
        return onlineTrading;
    }
    /**
     * Retrieves value for `phoneTrading`
     * Is trading via phone enabled?
     */
    @JsonProperty("phone_trading")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getPhoneTrading() {
        return phoneTrading;
    }
    /**
     * Retrieves value for `postalCode`
     * Postal code
     */
    @JsonProperty("postal_code")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPostalCode() {
        return postalCode;
    }
    /**
     * Retrieves value for `processThirdPartyFunds`
     * Is the account enabled for third party funds?
     */
    @JsonProperty("process_third_party_funds")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getProcessThirdPartyFunds() {
        return processThirdPartyFunds;
    }
    /**
     * Retrieves value for `settlementType`
     * The settlement type - bulk or net.
     */
    @JsonProperty("settlement_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<AccountSettlementTypeEnum> getSettlementType() {
        return settlementType;
    }
    /**
     * Retrieves value for `shortReference`
     * The account's reference number.
     */
    @JsonProperty("short_reference")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getShortReference() {
        return shortReference;
    }
    /**
     * Retrieves value for `spreadTable`
     * The name of the spread table assigned to the account.
     */
    @JsonProperty("spread_table")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSpreadTable() {
        return spreadTable;
    }
    /**
     * Retrieves value for `stateOrProvince`
     * State or province two-letter ISO 3166 code. Only applicable to some countries.
     */
    @JsonProperty("state_or_province")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getStateOrProvince() {
        return stateOrProvince;
    }
    /**
     * Retrieves value for `status`
     * Account status
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<AccountStatusEnum> getStatus() {
        return status;
    }
    /**
     * Retrieves value for `street`
     * First line of address.
     */
    @JsonProperty("street")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getStreet() {
        return street;
    }
    /**
     * Retrieves value for `termsAndConditionsAccepted`
     * Have the terms and conditions been accepted?
     */
    @JsonProperty("terms_and_conditions_accepted")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getTermsAndConditionsAccepted() {
        return termsAndConditionsAccepted;
    }
    /**
     * Retrieves value for `updatedAt`
     * The date/time the account was last updated.
     */
    @JsonProperty("updated_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAt() {
        return updatedAt;
    }
    /**
     * Retrieves value for `yourReference`
     * User-generated reference code.
     */
    @JsonProperty("your_reference")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getYourReference() {
        return yourReference;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof Account && equalTo((Account) other);
    }

    private boolean equalTo(Account other) {
        return
            accountName.equals(other.accountName) &&

            agentOrReliance.equals(other.agentOrReliance) &&

            apiTrading.equals(other.apiTrading) &&

            bankAccountVerified.equals(other.bankAccountVerified) &&

            brand.equals(other.brand) &&

            city.equals(other.city) &&

            country.equals(other.country) &&

            createdAt.equals(other.createdAt) &&

            id.equals(other.id) &&

            identificationType.equals(other.identificationType) &&

            identificationValue.equals(other.identificationValue) &&

            legalEntityType.equals(other.legalEntityType) &&

            onlineTrading.equals(other.onlineTrading) &&

            phoneTrading.equals(other.phoneTrading) &&

            postalCode.equals(other.postalCode) &&

            processThirdPartyFunds.equals(other.processThirdPartyFunds) &&

            settlementType.equals(other.settlementType) &&

            shortReference.equals(other.shortReference) &&

            spreadTable.equals(other.spreadTable) &&

            stateOrProvince.equals(other.stateOrProvince) &&

            status.equals(other.status) &&

            street.equals(other.street) &&

            termsAndConditionsAccepted.equals(other.termsAndConditionsAccepted) &&

            updatedAt.equals(other.updatedAt) &&

            yourReference.equals(other.yourReference)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountName,
                   this.agentOrReliance,
                   this.apiTrading,
                   this.bankAccountVerified,
                   this.brand,
                   this.city,
                   this.country,
                   this.createdAt,
                   this.id,
                   this.identificationType,
                   this.identificationValue,
                   this.legalEntityType,
                   this.onlineTrading,
                   this.phoneTrading,
                   this.postalCode,
                   this.processThirdPartyFunds,
                   this.settlementType,
                   this.shortReference,
                   this.spreadTable,
                   this.stateOrProvince,
                   this.status,
                   this.street,
                   this.termsAndConditionsAccepted,
                   this.updatedAt,
                   this.yourReference
               );
    }

    @Override
    public String toString() {
        return "Account{" +
               "accountName=" + accountName + ", " +
               "agentOrReliance=" + agentOrReliance + ", " +
               "apiTrading=" + apiTrading + ", " +
               "bankAccountVerified=" + bankAccountVerified + ", " +
               "brand=" + brand + ", " +
               "city=" + city + ", " +
               "country=" + country + ", " +
               "createdAt=" + createdAt + ", " +
               "id=" + id + ", " +
               "identificationType=" + identificationType + ", " +
               "identificationValue=" + identificationValue + ", " +
               "legalEntityType=" + legalEntityType + ", " +
               "onlineTrading=" + onlineTrading + ", " +
               "phoneTrading=" + phoneTrading + ", " +
               "postalCode=" + postalCode + ", " +
               "processThirdPartyFunds=" + processThirdPartyFunds + ", " +
               "settlementType=" + settlementType + ", " +
               "shortReference=" + shortReference + ", " +
               "spreadTable=" + spreadTable + ", " +
               "stateOrProvince=" + stateOrProvince + ", " +
               "status=" + status + ", " +
               "street=" + street + ", " +
               "termsAndConditionsAccepted=" + termsAndConditionsAccepted + ", " +
               "updatedAt=" + updatedAt + ", " +
               "yourReference=" + yourReference +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Account name
         */
        private Optional<String> accountName = Optional.empty();

        /**
         * True for clients using Currencycloud’s regulatory coverage, false otherwise.
         */
        private Optional<Boolean> agentOrReliance = Optional.empty();

        /**
         * Is trading via the Currencycloud API enabled?
         */
        private Optional<Boolean> apiTrading = Optional.empty();

        /**
         * Has the bank account been verified?
         */
        private Optional<AccountBankAccountVerifiedEnum> bankAccountVerified = Optional.empty();

        /**
         * The value of this field is used for white labeling the Currencycloud user interface.
         */
        private Optional<String> brand = Optional.empty();

        /**
         * City
         */
        private Optional<String> city = Optional.empty();

        /**
         * Two-letter ISO country code.
         */
        private Optional<String> country = Optional.empty();

        /**
         * The date/time the account was created.
         */
        private Optional<String> createdAt = Optional.empty();

        /**
         * Account ID
         */
        private Optional<String> id = Optional.empty();

        /**
         * The legal document that verifies the identity of the account owner, e.g. passport.
         */
        private Optional<AccountIdentificationTypeEnum> identificationType = Optional.empty();

        /**
         * The unique reference code for the identification document, e.g. passport number.
         */
        private Optional<String> identificationValue = Optional.empty();

        /**
         * The type of entity - individual or company.
         */
        private Optional<String> legalEntityType = Optional.empty();

        /**
         * Is trading via Currencycloud Direct enabled?
         */
        private Optional<Boolean> onlineTrading = Optional.empty();

        /**
         * Is trading via phone enabled?
         */
        private Optional<Boolean> phoneTrading = Optional.empty();

        /**
         * Postal code
         */
        private Optional<String> postalCode = Optional.empty();

        /**
         * Is the account enabled for third party funds?
         */
        private Optional<Boolean> processThirdPartyFunds = Optional.empty();

        /**
         * The settlement type - bulk or net.
         */
        private Optional<AccountSettlementTypeEnum> settlementType = Optional.empty();

        /**
         * The account's reference number.
         */
        private Optional<String> shortReference = Optional.empty();

        /**
         * The name of the spread table assigned to the account.
         */
        private Optional<String> spreadTable = Optional.empty();

        /**
         * State or province two-letter ISO 3166 code. Only applicable to some countries.
         */
        private Optional<String> stateOrProvince = Optional.empty();

        /**
         * Account status
         */
        private Optional<AccountStatusEnum> status = Optional.empty();

        /**
         * First line of address.
         */
        private Optional<String> street = Optional.empty();

        /**
         * Have the terms and conditions been accepted?
         */
        private Optional<Boolean> termsAndConditionsAccepted = Optional.empty();

        /**
         * The date/time the account was last updated.
         */
        private Optional<String> updatedAt = Optional.empty();

        /**
         * User-generated reference code.
         */
        private Optional<String> yourReference = Optional.empty();


        private Builder() {}

        public Builder from(Account other) {
            accountName(other.getAccountName());
            agentOrReliance(other.getAgentOrReliance());
            apiTrading(other.getApiTrading());
            bankAccountVerified(other.getBankAccountVerified());
            brand(other.getBrand());
            city(other.getCity());
            country(other.getCountry());
            createdAt(other.getCreatedAt());
            id(other.getId());
            identificationType(other.getIdentificationType());
            identificationValue(other.getIdentificationValue());
            legalEntityType(other.getLegalEntityType());
            onlineTrading(other.getOnlineTrading());
            phoneTrading(other.getPhoneTrading());
            postalCode(other.getPostalCode());
            processThirdPartyFunds(other.getProcessThirdPartyFunds());
            settlementType(other.getSettlementType());
            shortReference(other.getShortReference());
            spreadTable(other.getSpreadTable());
            stateOrProvince(other.getStateOrProvince());
            status(other.getStatus());
            street(other.getStreet());
            termsAndConditionsAccepted(other.getTermsAndConditionsAccepted());
            updatedAt(other.getUpdatedAt());
            yourReference(other.getYourReference());
            return this;
        }

        /**
         * Sets value for `accountName`
         * Account name
         */
        @JsonSetter("account_name")
        public Builder accountName(Optional<String> accountName) {
            this.accountName = accountName;
            return this;
        }

        /**
         * Sets value for `accountName`
         * Account name
         */
        public Builder accountName(String accountName) {
            return this.accountName(Optional.ofNullable(accountName));
        }
        /**
         * Sets value for `agentOrReliance`
         * True for clients using Currencycloud’s regulatory coverage, false otherwise.
         */
        @JsonSetter("agent_or_reliance")
        public Builder agentOrReliance(Optional<Boolean> agentOrReliance) {
            this.agentOrReliance = agentOrReliance;
            return this;
        }

        /**
         * Sets value for `agentOrReliance`
         * True for clients using Currencycloud’s regulatory coverage, false otherwise.
         */
        public Builder agentOrReliance(Boolean agentOrReliance) {
            return this.agentOrReliance(Optional.ofNullable(agentOrReliance));
        }
        /**
         * Sets value for `apiTrading`
         * Is trading via the Currencycloud API enabled?
         */
        @JsonSetter("api_trading")
        public Builder apiTrading(Optional<Boolean> apiTrading) {
            this.apiTrading = apiTrading;
            return this;
        }

        /**
         * Sets value for `apiTrading`
         * Is trading via the Currencycloud API enabled?
         */
        public Builder apiTrading(Boolean apiTrading) {
            return this.apiTrading(Optional.ofNullable(apiTrading));
        }
        /**
         * Sets value for `bankAccountVerified`
         * Has the bank account been verified?
         */
        @JsonSetter("bank_account_verified")
        public Builder bankAccountVerified(Optional<AccountBankAccountVerifiedEnum> bankAccountVerified) {
            this.bankAccountVerified = bankAccountVerified;
            return this;
        }

        /**
         * Sets value for `bankAccountVerified`
         * Has the bank account been verified?
         */
        public Builder bankAccountVerified(AccountBankAccountVerifiedEnum bankAccountVerified) {
            return this.bankAccountVerified(Optional.ofNullable(bankAccountVerified));
        }
        /**
         * Sets value for `brand`
         * The value of this field is used for white labeling the Currencycloud user interface.
         */
        @JsonSetter("brand")
        public Builder brand(Optional<String> brand) {
            this.brand = brand;
            return this;
        }

        /**
         * Sets value for `brand`
         * The value of this field is used for white labeling the Currencycloud user interface.
         */
        public Builder brand(String brand) {
            return this.brand(Optional.ofNullable(brand));
        }
        /**
         * Sets value for `city`
         * City
         */
        @JsonSetter("city")
        public Builder city(Optional<String> city) {
            this.city = city;
            return this;
        }

        /**
         * Sets value for `city`
         * City
         */
        public Builder city(String city) {
            return this.city(Optional.ofNullable(city));
        }
        /**
         * Sets value for `country`
         * Two-letter ISO country code.
         */
        @JsonSetter("country")
        public Builder country(Optional<String> country) {
            this.country = country;
            return this;
        }

        /**
         * Sets value for `country`
         * Two-letter ISO country code.
         */
        public Builder country(String country) {
            return this.country(Optional.ofNullable(country));
        }
        /**
         * Sets value for `createdAt`
         * The date/time the account was created.
         */
        @JsonSetter("created_at")
        public Builder createdAt(Optional<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Sets value for `createdAt`
         * The date/time the account was created.
         */
        public Builder createdAt(String createdAt) {
            return this.createdAt(Optional.ofNullable(createdAt));
        }
        /**
         * Sets value for `id`
         * Account ID
         */
        @JsonSetter("id")
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        /**
         * Sets value for `id`
         * Account ID
         */
        public Builder id(String id) {
            return this.id(Optional.ofNullable(id));
        }
        /**
         * Sets value for `identificationType`
         * The legal document that verifies the identity of the account owner, e.g. passport.
         */
        @JsonSetter("identification_type")
        public Builder identificationType(Optional<AccountIdentificationTypeEnum> identificationType) {
            this.identificationType = identificationType;
            return this;
        }

        /**
         * Sets value for `identificationType`
         * The legal document that verifies the identity of the account owner, e.g. passport.
         */
        public Builder identificationType(AccountIdentificationTypeEnum identificationType) {
            return this.identificationType(Optional.ofNullable(identificationType));
        }
        /**
         * Sets value for `identificationValue`
         * The unique reference code for the identification document, e.g. passport number.
         */
        @JsonSetter("identification_value")
        public Builder identificationValue(Optional<String> identificationValue) {
            this.identificationValue = identificationValue;
            return this;
        }

        /**
         * Sets value for `identificationValue`
         * The unique reference code for the identification document, e.g. passport number.
         */
        public Builder identificationValue(String identificationValue) {
            return this.identificationValue(Optional.ofNullable(identificationValue));
        }
        /**
         * Sets value for `legalEntityType`
         * The type of entity - individual or company.
         */
        @JsonSetter("legal_entity_type")
        public Builder legalEntityType(Optional<String> legalEntityType) {
            this.legalEntityType = legalEntityType;
            return this;
        }

        /**
         * Sets value for `legalEntityType`
         * The type of entity - individual or company.
         */
        public Builder legalEntityType(String legalEntityType) {
            return this.legalEntityType(Optional.ofNullable(legalEntityType));
        }
        /**
         * Sets value for `onlineTrading`
         * Is trading via Currencycloud Direct enabled?
         */
        @JsonSetter("online_trading")
        public Builder onlineTrading(Optional<Boolean> onlineTrading) {
            this.onlineTrading = onlineTrading;
            return this;
        }

        /**
         * Sets value for `onlineTrading`
         * Is trading via Currencycloud Direct enabled?
         */
        public Builder onlineTrading(Boolean onlineTrading) {
            return this.onlineTrading(Optional.ofNullable(onlineTrading));
        }
        /**
         * Sets value for `phoneTrading`
         * Is trading via phone enabled?
         */
        @JsonSetter("phone_trading")
        public Builder phoneTrading(Optional<Boolean> phoneTrading) {
            this.phoneTrading = phoneTrading;
            return this;
        }

        /**
         * Sets value for `phoneTrading`
         * Is trading via phone enabled?
         */
        public Builder phoneTrading(Boolean phoneTrading) {
            return this.phoneTrading(Optional.ofNullable(phoneTrading));
        }
        /**
         * Sets value for `postalCode`
         * Postal code
         */
        @JsonSetter("postal_code")
        public Builder postalCode(Optional<String> postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        /**
         * Sets value for `postalCode`
         * Postal code
         */
        public Builder postalCode(String postalCode) {
            return this.postalCode(Optional.ofNullable(postalCode));
        }
        /**
         * Sets value for `processThirdPartyFunds`
         * Is the account enabled for third party funds?
         */
        @JsonSetter("process_third_party_funds")
        public Builder processThirdPartyFunds(Optional<Boolean> processThirdPartyFunds) {
            this.processThirdPartyFunds = processThirdPartyFunds;
            return this;
        }

        /**
         * Sets value for `processThirdPartyFunds`
         * Is the account enabled for third party funds?
         */
        public Builder processThirdPartyFunds(Boolean processThirdPartyFunds) {
            return this.processThirdPartyFunds(Optional.ofNullable(processThirdPartyFunds));
        }
        /**
         * Sets value for `settlementType`
         * The settlement type - bulk or net.
         */
        @JsonSetter("settlement_type")
        public Builder settlementType(Optional<AccountSettlementTypeEnum> settlementType) {
            this.settlementType = settlementType;
            return this;
        }

        /**
         * Sets value for `settlementType`
         * The settlement type - bulk or net.
         */
        public Builder settlementType(AccountSettlementTypeEnum settlementType) {
            return this.settlementType(Optional.ofNullable(settlementType));
        }
        /**
         * Sets value for `shortReference`
         * The account's reference number.
         */
        @JsonSetter("short_reference")
        public Builder shortReference(Optional<String> shortReference) {
            this.shortReference = shortReference;
            return this;
        }

        /**
         * Sets value for `shortReference`
         * The account's reference number.
         */
        public Builder shortReference(String shortReference) {
            return this.shortReference(Optional.ofNullable(shortReference));
        }
        /**
         * Sets value for `spreadTable`
         * The name of the spread table assigned to the account.
         */
        @JsonSetter("spread_table")
        public Builder spreadTable(Optional<String> spreadTable) {
            this.spreadTable = spreadTable;
            return this;
        }

        /**
         * Sets value for `spreadTable`
         * The name of the spread table assigned to the account.
         */
        public Builder spreadTable(String spreadTable) {
            return this.spreadTable(Optional.ofNullable(spreadTable));
        }
        /**
         * Sets value for `stateOrProvince`
         * State or province two-letter ISO 3166 code. Only applicable to some countries.
         */
        @JsonSetter("state_or_province")
        public Builder stateOrProvince(Optional<String> stateOrProvince) {
            this.stateOrProvince = stateOrProvince;
            return this;
        }

        /**
         * Sets value for `stateOrProvince`
         * State or province two-letter ISO 3166 code. Only applicable to some countries.
         */
        public Builder stateOrProvince(String stateOrProvince) {
            return this.stateOrProvince(Optional.ofNullable(stateOrProvince));
        }
        /**
         * Sets value for `status`
         * Account status
         */
        @JsonSetter("status")
        public Builder status(Optional<AccountStatusEnum> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets value for `status`
         * Account status
         */
        public Builder status(AccountStatusEnum status) {
            return this.status(Optional.ofNullable(status));
        }
        /**
         * Sets value for `street`
         * First line of address.
         */
        @JsonSetter("street")
        public Builder street(Optional<String> street) {
            this.street = street;
            return this;
        }

        /**
         * Sets value for `street`
         * First line of address.
         */
        public Builder street(String street) {
            return this.street(Optional.ofNullable(street));
        }
        /**
         * Sets value for `termsAndConditionsAccepted`
         * Have the terms and conditions been accepted?
         */
        @JsonSetter("terms_and_conditions_accepted")
        public Builder termsAndConditionsAccepted(Optional<Boolean> termsAndConditionsAccepted) {
            this.termsAndConditionsAccepted = termsAndConditionsAccepted;
            return this;
        }

        /**
         * Sets value for `termsAndConditionsAccepted`
         * Have the terms and conditions been accepted?
         */
        public Builder termsAndConditionsAccepted(Boolean termsAndConditionsAccepted) {
            return this.termsAndConditionsAccepted(Optional.ofNullable(termsAndConditionsAccepted));
        }
        /**
         * Sets value for `updatedAt`
         * The date/time the account was last updated.
         */
        @JsonSetter("updated_at")
        public Builder updatedAt(Optional<String> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Sets value for `updatedAt`
         * The date/time the account was last updated.
         */
        public Builder updatedAt(String updatedAt) {
            return this.updatedAt(Optional.ofNullable(updatedAt));
        }
        /**
         * Sets value for `yourReference`
         * User-generated reference code.
         */
        @JsonSetter("your_reference")
        public Builder yourReference(Optional<String> yourReference) {
            this.yourReference = yourReference;
            return this;
        }

        /**
         * Sets value for `yourReference`
         * User-generated reference code.
         */
        public Builder yourReference(String yourReference) {
            return this.yourReference(Optional.ofNullable(yourReference));
        }



        public Account build() {
            return new Account(this);
        }
    }

}



