
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * AccountsCreateBody
 */
@JsonDeserialize(builder = AccountsCreateBody.Builder.class)
public final class AccountsCreateBody {
    /**
     * Account name.
     */
    private final String accountName;

    /**
     * Allow the account to make trades via the Currencycloud API.
     */
    private final Optional<Boolean> apiTrading;

    /**
     * The value of this field is used for white labeling the Currencycloud user interface. If nothing is specified then the account will inherit the house account's brand.
     */
    private final Optional<String> brand;

    /**
     * City
     */
    private final String city;

    /**
     * Two-letter ISO country code.
     */
    private final String country;

    /**
     * A legal document that verifies the identity of the account owner. Required for individual sub-accounts on our outsourced KYC model, optional otherwise.
     */
    private final Optional<AccountsCreateBodyIdentificationTypeEnum> identificationType;

    /**
     * Unique reference code for the identification document, such as a passport number. Required if "identification_type" is provided.
     */
    private final Optional<String> identificationValue;

    /**
     * Legal entity.
     */
    private final AccountsCreateBodyLegalEntityTypeEnum legalEntityType;

    /**
     * Allow the account to make trades via Currencycloud Direct.
     */
    private final Optional<Boolean> onlineTrading;

    /**
     * Allow the account to make trades via phone.
     */
    private final Optional<Boolean> phoneTrading;

    /**
     * Postal code. Required for sub-accounts on our outsourced KYC model, also required where country code = "US", "CA" or "MX".
     */
    private final Optional<String> postalCode;

    /**
     * The name of the spread table assigned to the account. This is needed if they intend to apply markup.
     */
    private final Optional<String> spreadTable;

    /**
     * State or province two-letter ISO 3166 code. Only applicable to some countries, required where country code = "US", "CA" or "MX".
     */
    private final Optional<String> stateOrProvince;

    /**
     * Account status.
     */
    private final Optional<AccountsCreateBodyStatusEnum> status;

    /**
     * First line of address.
     */
    private final String street;

    /**
     * Acceptance of the terms and conditions. Required for sub-accounts that are on our Outsourced KYC model, optional otherwise.
     */
    private final Optional<Boolean> termsAndConditionsAccepted;

    /**
     * User-generated reference code.
     */
    private final Optional<String> yourReference;


    private AccountsCreateBody(Builder builder) {
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
    public String getAccountName() {
        return accountName;
    }
    /**
     * Retrieves value for `apiTrading`
     * Allow the account to make trades via the Currencycloud API.
     */
    @JsonProperty("api_trading")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getApiTrading() {
        return apiTrading;
    }
    /**
     * Retrieves value for `brand`
     * The value of this field is used for white labeling the Currencycloud user interface. If nothing is specified then the account will inherit the house account's brand.
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
    public String getCity() {
        return city;
    }
    /**
     * Retrieves value for `country`
     * Two-letter ISO country code.
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }
    /**
     * Retrieves value for `identificationType`
     * A legal document that verifies the identity of the account owner. Required for individual sub-accounts on our outsourced KYC model, optional otherwise.
     */
    @JsonProperty("identification_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<AccountsCreateBodyIdentificationTypeEnum> getIdentificationType() {
        return identificationType;
    }
    /**
     * Retrieves value for `identificationValue`
     * Unique reference code for the identification document, such as a passport number. Required if "identification_type" is provided.
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
    public AccountsCreateBodyLegalEntityTypeEnum getLegalEntityType() {
        return legalEntityType;
    }
    /**
     * Retrieves value for `onlineTrading`
     * Allow the account to make trades via Currencycloud Direct.
     */
    @JsonProperty("online_trading")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getOnlineTrading() {
        return onlineTrading;
    }
    /**
     * Retrieves value for `phoneTrading`
     * Allow the account to make trades via phone.
     */
    @JsonProperty("phone_trading")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getPhoneTrading() {
        return phoneTrading;
    }
    /**
     * Retrieves value for `postalCode`
     * Postal code. Required for sub-accounts on our outsourced KYC model, also required where country code = "US", "CA" or "MX".
     */
    @JsonProperty("postal_code")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPostalCode() {
        return postalCode;
    }
    /**
     * Retrieves value for `spreadTable`
     * The name of the spread table assigned to the account. This is needed if they intend to apply markup.
     */
    @JsonProperty("spread_table")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSpreadTable() {
        return spreadTable;
    }
    /**
     * Retrieves value for `stateOrProvince`
     * State or province two-letter ISO 3166 code. Only applicable to some countries, required where country code = "US", "CA" or "MX".
     */
    @JsonProperty("state_or_province")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getStateOrProvince() {
        return stateOrProvince;
    }
    /**
     * Retrieves value for `status`
     * Account status.
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<AccountsCreateBodyStatusEnum> getStatus() {
        return status;
    }
    /**
     * Retrieves value for `street`
     * First line of address.
     */
    @JsonProperty("street")
    public String getStreet() {
        return street;
    }
    /**
     * Retrieves value for `termsAndConditionsAccepted`
     * Acceptance of the terms and conditions. Required for sub-accounts that are on our Outsourced KYC model, optional otherwise.
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

        return other instanceof AccountsCreateBody && equalTo((AccountsCreateBody) other);
    }

    private boolean equalTo(AccountsCreateBody other) {
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
        return "AccountsCreateBody{" +
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
        private String accountName = null;

        /**
         * Allow the account to make trades via the Currencycloud API.
         */
        private Optional<Boolean> apiTrading = Optional.empty();

        /**
         * The value of this field is used for white labeling the Currencycloud user interface. If nothing is specified then the account will inherit the house account's brand.
         */
        private Optional<String> brand = Optional.empty();

        /**
         * City
         */
        private String city = null;

        /**
         * Two-letter ISO country code.
         */
        private String country = null;

        /**
         * A legal document that verifies the identity of the account owner. Required for individual sub-accounts on our outsourced KYC model, optional otherwise.
         */
        private Optional<AccountsCreateBodyIdentificationTypeEnum> identificationType = Optional.empty();

        /**
         * Unique reference code for the identification document, such as a passport number. Required if "identification_type" is provided.
         */
        private Optional<String> identificationValue = Optional.empty();

        /**
         * Legal entity.
         */
        private AccountsCreateBodyLegalEntityTypeEnum legalEntityType = null;

        /**
         * Allow the account to make trades via Currencycloud Direct.
         */
        private Optional<Boolean> onlineTrading = Optional.empty();

        /**
         * Allow the account to make trades via phone.
         */
        private Optional<Boolean> phoneTrading = Optional.empty();

        /**
         * Postal code. Required for sub-accounts on our outsourced KYC model, also required where country code = "US", "CA" or "MX".
         */
        private Optional<String> postalCode = Optional.empty();

        /**
         * The name of the spread table assigned to the account. This is needed if they intend to apply markup.
         */
        private Optional<String> spreadTable = Optional.empty();

        /**
         * State or province two-letter ISO 3166 code. Only applicable to some countries, required where country code = "US", "CA" or "MX".
         */
        private Optional<String> stateOrProvince = Optional.empty();

        /**
         * Account status.
         */
        private Optional<AccountsCreateBodyStatusEnum> status = Optional.empty();

        /**
         * First line of address.
         */
        private String street = null;

        /**
         * Acceptance of the terms and conditions. Required for sub-accounts that are on our Outsourced KYC model, optional otherwise.
         */
        private Optional<Boolean> termsAndConditionsAccepted = Optional.empty();

        /**
         * User-generated reference code.
         */
        private Optional<String> yourReference = Optional.empty();


        private Builder() {}

        public Builder from(AccountsCreateBody other) {
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
        public Builder accountName(String accountName) {
            if (accountName == null) {
                throw new IllegalArgumentException("accountName cannot be null");
            }

            this.accountName = accountName;
            return this;
        }
        /**
         * Sets value for `apiTrading`
         * Allow the account to make trades via the Currencycloud API.
         */
        @JsonSetter("api_trading")
        public Builder apiTrading(Optional<Boolean> apiTrading) {
            this.apiTrading = apiTrading;
            return this;
        }

        /**
         * Sets value for `apiTrading`
         * Allow the account to make trades via the Currencycloud API.
         */
        public Builder apiTrading(Boolean apiTrading) {
            return this.apiTrading(Optional.ofNullable(apiTrading));
        }
        /**
         * Sets value for `brand`
         * The value of this field is used for white labeling the Currencycloud user interface. If nothing is specified then the account will inherit the house account's brand.
         */
        @JsonSetter("brand")
        public Builder brand(Optional<String> brand) {
            this.brand = brand;
            return this;
        }

        /**
         * Sets value for `brand`
         * The value of this field is used for white labeling the Currencycloud user interface. If nothing is specified then the account will inherit the house account's brand.
         */
        public Builder brand(String brand) {
            return this.brand(Optional.ofNullable(brand));
        }
        /**
         * Sets value for `city`
         * City
         */
        @JsonSetter("city")
        public Builder city(String city) {
            if (city == null) {
                throw new IllegalArgumentException("city cannot be null");
            }

            this.city = city;
            return this;
        }
        /**
         * Sets value for `country`
         * Two-letter ISO country code.
         */
        @JsonSetter("country")
        public Builder country(String country) {
            if (country == null) {
                throw new IllegalArgumentException("country cannot be null");
            }

            this.country = country;
            return this;
        }
        /**
         * Sets value for `identificationType`
         * A legal document that verifies the identity of the account owner. Required for individual sub-accounts on our outsourced KYC model, optional otherwise.
         */
        @JsonSetter("identification_type")
        public Builder identificationType(Optional<AccountsCreateBodyIdentificationTypeEnum>
                                          identificationType) {
            this.identificationType = identificationType;
            return this;
        }

        /**
         * Sets value for `identificationType`
         * A legal document that verifies the identity of the account owner. Required for individual sub-accounts on our outsourced KYC model, optional otherwise.
         */
        public Builder identificationType(AccountsCreateBodyIdentificationTypeEnum identificationType) {
            return this.identificationType(Optional.ofNullable(identificationType));
        }
        /**
         * Sets value for `identificationValue`
         * Unique reference code for the identification document, such as a passport number. Required if "identification_type" is provided.
         */
        @JsonSetter("identification_value")
        public Builder identificationValue(Optional<String> identificationValue) {
            this.identificationValue = identificationValue;
            return this;
        }

        /**
         * Sets value for `identificationValue`
         * Unique reference code for the identification document, such as a passport number. Required if "identification_type" is provided.
         */
        public Builder identificationValue(String identificationValue) {
            return this.identificationValue(Optional.ofNullable(identificationValue));
        }
        /**
         * Sets value for `legalEntityType`
         * Legal entity.
         */
        @JsonSetter("legal_entity_type")
        public Builder legalEntityType(AccountsCreateBodyLegalEntityTypeEnum legalEntityType) {
            if (legalEntityType == null) {
                throw new IllegalArgumentException("legalEntityType cannot be null");
            }

            this.legalEntityType = legalEntityType;
            return this;
        }
        /**
         * Sets value for `onlineTrading`
         * Allow the account to make trades via Currencycloud Direct.
         */
        @JsonSetter("online_trading")
        public Builder onlineTrading(Optional<Boolean> onlineTrading) {
            this.onlineTrading = onlineTrading;
            return this;
        }

        /**
         * Sets value for `onlineTrading`
         * Allow the account to make trades via Currencycloud Direct.
         */
        public Builder onlineTrading(Boolean onlineTrading) {
            return this.onlineTrading(Optional.ofNullable(onlineTrading));
        }
        /**
         * Sets value for `phoneTrading`
         * Allow the account to make trades via phone.
         */
        @JsonSetter("phone_trading")
        public Builder phoneTrading(Optional<Boolean> phoneTrading) {
            this.phoneTrading = phoneTrading;
            return this;
        }

        /**
         * Sets value for `phoneTrading`
         * Allow the account to make trades via phone.
         */
        public Builder phoneTrading(Boolean phoneTrading) {
            return this.phoneTrading(Optional.ofNullable(phoneTrading));
        }
        /**
         * Sets value for `postalCode`
         * Postal code. Required for sub-accounts on our outsourced KYC model, also required where country code = "US", "CA" or "MX".
         */
        @JsonSetter("postal_code")
        public Builder postalCode(Optional<String> postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        /**
         * Sets value for `postalCode`
         * Postal code. Required for sub-accounts on our outsourced KYC model, also required where country code = "US", "CA" or "MX".
         */
        public Builder postalCode(String postalCode) {
            return this.postalCode(Optional.ofNullable(postalCode));
        }
        /**
         * Sets value for `spreadTable`
         * The name of the spread table assigned to the account. This is needed if they intend to apply markup.
         */
        @JsonSetter("spread_table")
        public Builder spreadTable(Optional<String> spreadTable) {
            this.spreadTable = spreadTable;
            return this;
        }

        /**
         * Sets value for `spreadTable`
         * The name of the spread table assigned to the account. This is needed if they intend to apply markup.
         */
        public Builder spreadTable(String spreadTable) {
            return this.spreadTable(Optional.ofNullable(spreadTable));
        }
        /**
         * Sets value for `stateOrProvince`
         * State or province two-letter ISO 3166 code. Only applicable to some countries, required where country code = "US", "CA" or "MX".
         */
        @JsonSetter("state_or_province")
        public Builder stateOrProvince(Optional<String> stateOrProvince) {
            this.stateOrProvince = stateOrProvince;
            return this;
        }

        /**
         * Sets value for `stateOrProvince`
         * State or province two-letter ISO 3166 code. Only applicable to some countries, required where country code = "US", "CA" or "MX".
         */
        public Builder stateOrProvince(String stateOrProvince) {
            return this.stateOrProvince(Optional.ofNullable(stateOrProvince));
        }
        /**
         * Sets value for `status`
         * Account status.
         */
        @JsonSetter("status")
        public Builder status(Optional<AccountsCreateBodyStatusEnum> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets value for `status`
         * Account status.
         */
        public Builder status(AccountsCreateBodyStatusEnum status) {
            return this.status(Optional.ofNullable(status));
        }
        /**
         * Sets value for `street`
         * First line of address.
         */
        @JsonSetter("street")
        public Builder street(String street) {
            if (street == null) {
                throw new IllegalArgumentException("street cannot be null");
            }

            this.street = street;
            return this;
        }
        /**
         * Sets value for `termsAndConditionsAccepted`
         * Acceptance of the terms and conditions. Required for sub-accounts that are on our Outsourced KYC model, optional otherwise.
         */
        @JsonSetter("terms_and_conditions_accepted")
        public Builder termsAndConditionsAccepted(Optional<Boolean> termsAndConditionsAccepted) {
            this.termsAndConditionsAccepted = termsAndConditionsAccepted;
            return this;
        }

        /**
         * Sets value for `termsAndConditionsAccepted`
         * Acceptance of the terms and conditions. Required for sub-accounts that are on our Outsourced KYC model, optional otherwise.
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



        public AccountsCreateBody build() {
            if (accountName == null) {
                throw new IllegalStateException("accountName is required");
            }

            if (city == null) {
                throw new IllegalStateException("city is required");
            }

            if (country == null) {
                throw new IllegalStateException("country is required");
            }

            if (legalEntityType == null) {
                throw new IllegalStateException("legalEntityType is required");
            }

            if (street == null) {
                throw new IllegalStateException("street is required");
            }

            return new AccountsCreateBody(this);
        }
    }

}



