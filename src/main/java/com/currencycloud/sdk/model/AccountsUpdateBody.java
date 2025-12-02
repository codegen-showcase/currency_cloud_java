
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * AccountsUpdateBody
 */
@JsonDeserialize(builder = AccountsUpdateBody.Builder.class)
public final class AccountsUpdateBody {
    /**
     * Account name.
     */
    private final Optional<String> accountName;

    /**
     * Whether trading via the Currencycloud API is to be enabled on the account.
     */
    private final Optional<Boolean> apiTrading;

    /**
     * The value of this field is used for white labeling the Currencycloud user interface.
     */
    private final Optional<String> brand;

    /**
     * City name
     */
    private final Optional<String> city;

    /**
     * Two-letter ISO country code.
     */
    private final Optional<String> country;

    /**
     * A legal document that verifies the identity of the account owner.
     */
    private final Optional<AccountsUpdateBodyIdentificationTypeEnum> identificationType;

    /**
     * A unique reference code for the identification document, such as a passport number.
     */
    private final Optional<String> identificationValue;

    /**
     * Legal entity.
     */
    private final Optional<AccountsUpdateBodyLegalEntityTypeEnum> legalEntityType;

    /**
     * Enable online trading on the account.
     */
    private final Optional<Boolean> onlineTrading;

    /**
     * Enable phone trading on the account.
     */
    private final Optional<Boolean> phoneTrading;

    /**
     * Postal code.
     */
    private final Optional<String> postalCode;

    /**
     * The name of the spread table assigned to the account.
     */
    private final Optional<String> spreadTable;

    /**
     * State or province two-letter ISO 3166 code. Only applicable to some countries.
     */
    private final Optional<String> stateOrProvince;

    /**
     * Status of the account.
     */
    private final Optional<AccountsUpdateBodyStatusEnum> status;

    /**
     * First line of address.
     */
    private final Optional<String> street;

    /**
     * Acceptance of the terms and conditions.
     */
    private final Optional<Boolean> termsAndConditionsAccepted;

    /**
     * User-generated reference code.
     */
    private final Optional<String> yourReference;


    private AccountsUpdateBody(Builder builder) {
        this.accountName = builder.accountName;
        this.apiTrading = builder.apiTrading;
        this.brand = builder.brand;
        this.city = builder.city;
        this.country = builder.country;
        this.identificationType = builder.identificationType;
        this.identificationValue = builder.identificationValue;
        this.legalEntityType = builder.legalEntityType;
        this.onlineTrading = builder.onlineTrading;
        this.phoneTrading = builder.phoneTrading;
        this.postalCode = builder.postalCode;
        this.spreadTable = builder.spreadTable;
        this.stateOrProvince = builder.stateOrProvince;
        this.status = builder.status;
        this.street = builder.street;
        this.termsAndConditionsAccepted = builder.termsAndConditionsAccepted;
        this.yourReference = builder.yourReference;
    }

    /**
     * Retrieves value for `accountName`
     * Account name.
     */
    @JsonProperty("account_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAccountName() {
        return accountName;
    }
    /**
     * Retrieves value for `apiTrading`
     * Whether trading via the Currencycloud API is to be enabled on the account.
     */
    @JsonProperty("api_trading")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getApiTrading() {
        return apiTrading;
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
     * City name
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
     * Retrieves value for `identificationType`
     * A legal document that verifies the identity of the account owner.
     */
    @JsonProperty("identification_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<AccountsUpdateBodyIdentificationTypeEnum> getIdentificationType() {
        return identificationType;
    }
    /**
     * Retrieves value for `identificationValue`
     * A unique reference code for the identification document, such as a passport number.
     */
    @JsonProperty("identification_value")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getIdentificationValue() {
        return identificationValue;
    }
    /**
     * Retrieves value for `legalEntityType`
     * Legal entity.
     */
    @JsonProperty("legal_entity_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<AccountsUpdateBodyLegalEntityTypeEnum> getLegalEntityType() {
        return legalEntityType;
    }
    /**
     * Retrieves value for `onlineTrading`
     * Enable online trading on the account.
     */
    @JsonProperty("online_trading")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getOnlineTrading() {
        return onlineTrading;
    }
    /**
     * Retrieves value for `phoneTrading`
     * Enable phone trading on the account.
     */
    @JsonProperty("phone_trading")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getPhoneTrading() {
        return phoneTrading;
    }
    /**
     * Retrieves value for `postalCode`
     * Postal code.
     */
    @JsonProperty("postal_code")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPostalCode() {
        return postalCode;
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
     * Status of the account.
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<AccountsUpdateBodyStatusEnum> getStatus() {
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
     * Acceptance of the terms and conditions.
     */
    @JsonProperty("terms_and_conditions_accepted")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getTermsAndConditionsAccepted() {
        return termsAndConditionsAccepted;
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

        return other instanceof AccountsUpdateBody && equalTo((AccountsUpdateBody) other);
    }

    private boolean equalTo(AccountsUpdateBody other) {
        return
            accountName.equals(other.accountName) &&

            apiTrading.equals(other.apiTrading) &&

            brand.equals(other.brand) &&

            city.equals(other.city) &&

            country.equals(other.country) &&

            identificationType.equals(other.identificationType) &&

            identificationValue.equals(other.identificationValue) &&

            legalEntityType.equals(other.legalEntityType) &&

            onlineTrading.equals(other.onlineTrading) &&

            phoneTrading.equals(other.phoneTrading) &&

            postalCode.equals(other.postalCode) &&

            spreadTable.equals(other.spreadTable) &&

            stateOrProvince.equals(other.stateOrProvince) &&

            status.equals(other.status) &&

            street.equals(other.street) &&

            termsAndConditionsAccepted.equals(other.termsAndConditionsAccepted) &&

            yourReference.equals(other.yourReference)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountName,
                   this.apiTrading,
                   this.brand,
                   this.city,
                   this.country,
                   this.identificationType,
                   this.identificationValue,
                   this.legalEntityType,
                   this.onlineTrading,
                   this.phoneTrading,
                   this.postalCode,
                   this.spreadTable,
                   this.stateOrProvince,
                   this.status,
                   this.street,
                   this.termsAndConditionsAccepted,
                   this.yourReference
               );
    }

    @Override
    public String toString() {
        return "AccountsUpdateBody{" +
               "accountName=" + accountName + ", " +
               "apiTrading=" + apiTrading + ", " +
               "brand=" + brand + ", " +
               "city=" + city + ", " +
               "country=" + country + ", " +
               "identificationType=" + identificationType + ", " +
               "identificationValue=" + identificationValue + ", " +
               "legalEntityType=" + legalEntityType + ", " +
               "onlineTrading=" + onlineTrading + ", " +
               "phoneTrading=" + phoneTrading + ", " +
               "postalCode=" + postalCode + ", " +
               "spreadTable=" + spreadTable + ", " +
               "stateOrProvince=" + stateOrProvince + ", " +
               "status=" + status + ", " +
               "street=" + street + ", " +
               "termsAndConditionsAccepted=" + termsAndConditionsAccepted + ", " +
               "yourReference=" + yourReference +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Account name.
         */
        private Optional<String> accountName = Optional.empty();

        /**
         * Whether trading via the Currencycloud API is to be enabled on the account.
         */
        private Optional<Boolean> apiTrading = Optional.empty();

        /**
         * The value of this field is used for white labeling the Currencycloud user interface.
         */
        private Optional<String> brand = Optional.empty();

        /**
         * City name
         */
        private Optional<String> city = Optional.empty();

        /**
         * Two-letter ISO country code.
         */
        private Optional<String> country = Optional.empty();

        /**
         * A legal document that verifies the identity of the account owner.
         */
        private Optional<AccountsUpdateBodyIdentificationTypeEnum> identificationType = Optional.empty();

        /**
         * A unique reference code for the identification document, such as a passport number.
         */
        private Optional<String> identificationValue = Optional.empty();

        /**
         * Legal entity.
         */
        private Optional<AccountsUpdateBodyLegalEntityTypeEnum> legalEntityType = Optional.empty();

        /**
         * Enable online trading on the account.
         */
        private Optional<Boolean> onlineTrading = Optional.empty();

        /**
         * Enable phone trading on the account.
         */
        private Optional<Boolean> phoneTrading = Optional.empty();

        /**
         * Postal code.
         */
        private Optional<String> postalCode = Optional.empty();

        /**
         * The name of the spread table assigned to the account.
         */
        private Optional<String> spreadTable = Optional.empty();

        /**
         * State or province two-letter ISO 3166 code. Only applicable to some countries.
         */
        private Optional<String> stateOrProvince = Optional.empty();

        /**
         * Status of the account.
         */
        private Optional<AccountsUpdateBodyStatusEnum> status = Optional.empty();

        /**
         * First line of address.
         */
        private Optional<String> street = Optional.empty();

        /**
         * Acceptance of the terms and conditions.
         */
        private Optional<Boolean> termsAndConditionsAccepted = Optional.empty();

        /**
         * User-generated reference code.
         */
        private Optional<String> yourReference = Optional.empty();


        private Builder() {}

        public Builder from(AccountsUpdateBody other) {
            accountName(other.getAccountName());
            apiTrading(other.getApiTrading());
            brand(other.getBrand());
            city(other.getCity());
            country(other.getCountry());
            identificationType(other.getIdentificationType());
            identificationValue(other.getIdentificationValue());
            legalEntityType(other.getLegalEntityType());
            onlineTrading(other.getOnlineTrading());
            phoneTrading(other.getPhoneTrading());
            postalCode(other.getPostalCode());
            spreadTable(other.getSpreadTable());
            stateOrProvince(other.getStateOrProvince());
            status(other.getStatus());
            street(other.getStreet());
            termsAndConditionsAccepted(other.getTermsAndConditionsAccepted());
            yourReference(other.getYourReference());
            return this;
        }

        /**
         * Sets value for `accountName`
         * Account name.
         */
        @JsonSetter("account_name")
        public Builder accountName(Optional<String> accountName) {
            this.accountName = accountName;
            return this;
        }

        /**
         * Sets value for `accountName`
         * Account name.
         */
        public Builder accountName(String accountName) {
            return this.accountName(Optional.ofNullable(accountName));
        }
        /**
         * Sets value for `apiTrading`
         * Whether trading via the Currencycloud API is to be enabled on the account.
         */
        @JsonSetter("api_trading")
        public Builder apiTrading(Optional<Boolean> apiTrading) {
            this.apiTrading = apiTrading;
            return this;
        }

        /**
         * Sets value for `apiTrading`
         * Whether trading via the Currencycloud API is to be enabled on the account.
         */
        public Builder apiTrading(Boolean apiTrading) {
            return this.apiTrading(Optional.ofNullable(apiTrading));
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
         * City name
         */
        @JsonSetter("city")
        public Builder city(Optional<String> city) {
            this.city = city;
            return this;
        }

        /**
         * Sets value for `city`
         * City name
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
         * Sets value for `identificationType`
         * A legal document that verifies the identity of the account owner.
         */
        @JsonSetter("identification_type")
        public Builder identificationType(Optional<AccountsUpdateBodyIdentificationTypeEnum>
                                          identificationType) {
            this.identificationType = identificationType;
            return this;
        }

        /**
         * Sets value for `identificationType`
         * A legal document that verifies the identity of the account owner.
         */
        public Builder identificationType(AccountsUpdateBodyIdentificationTypeEnum identificationType) {
            return this.identificationType(Optional.ofNullable(identificationType));
        }
        /**
         * Sets value for `identificationValue`
         * A unique reference code for the identification document, such as a passport number.
         */
        @JsonSetter("identification_value")
        public Builder identificationValue(Optional<String> identificationValue) {
            this.identificationValue = identificationValue;
            return this;
        }

        /**
         * Sets value for `identificationValue`
         * A unique reference code for the identification document, such as a passport number.
         */
        public Builder identificationValue(String identificationValue) {
            return this.identificationValue(Optional.ofNullable(identificationValue));
        }
        /**
         * Sets value for `legalEntityType`
         * Legal entity.
         */
        @JsonSetter("legal_entity_type")
        public Builder legalEntityType(Optional<AccountsUpdateBodyLegalEntityTypeEnum> legalEntityType) {
            this.legalEntityType = legalEntityType;
            return this;
        }

        /**
         * Sets value for `legalEntityType`
         * Legal entity.
         */
        public Builder legalEntityType(AccountsUpdateBodyLegalEntityTypeEnum legalEntityType) {
            return this.legalEntityType(Optional.ofNullable(legalEntityType));
        }
        /**
         * Sets value for `onlineTrading`
         * Enable online trading on the account.
         */
        @JsonSetter("online_trading")
        public Builder onlineTrading(Optional<Boolean> onlineTrading) {
            this.onlineTrading = onlineTrading;
            return this;
        }

        /**
         * Sets value for `onlineTrading`
         * Enable online trading on the account.
         */
        public Builder onlineTrading(Boolean onlineTrading) {
            return this.onlineTrading(Optional.ofNullable(onlineTrading));
        }
        /**
         * Sets value for `phoneTrading`
         * Enable phone trading on the account.
         */
        @JsonSetter("phone_trading")
        public Builder phoneTrading(Optional<Boolean> phoneTrading) {
            this.phoneTrading = phoneTrading;
            return this;
        }

        /**
         * Sets value for `phoneTrading`
         * Enable phone trading on the account.
         */
        public Builder phoneTrading(Boolean phoneTrading) {
            return this.phoneTrading(Optional.ofNullable(phoneTrading));
        }
        /**
         * Sets value for `postalCode`
         * Postal code.
         */
        @JsonSetter("postal_code")
        public Builder postalCode(Optional<String> postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        /**
         * Sets value for `postalCode`
         * Postal code.
         */
        public Builder postalCode(String postalCode) {
            return this.postalCode(Optional.ofNullable(postalCode));
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
         * Status of the account.
         */
        @JsonSetter("status")
        public Builder status(Optional<AccountsUpdateBodyStatusEnum> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets value for `status`
         * Status of the account.
         */
        public Builder status(AccountsUpdateBodyStatusEnum status) {
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
         * Acceptance of the terms and conditions.
         */
        @JsonSetter("terms_and_conditions_accepted")
        public Builder termsAndConditionsAccepted(Optional<Boolean> termsAndConditionsAccepted) {
            this.termsAndConditionsAccepted = termsAndConditionsAccepted;
            return this;
        }

        /**
         * Sets value for `termsAndConditionsAccepted`
         * Acceptance of the terms and conditions.
         */
        public Builder termsAndConditionsAccepted(Boolean termsAndConditionsAccepted) {
            return this.termsAndConditionsAccepted(Optional.ofNullable(termsAndConditionsAccepted));
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



        public AccountsUpdateBody build() {
            return new AccountsUpdateBody(this);
        }
    }

}



