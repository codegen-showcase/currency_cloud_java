
package com.currencycloud.sdk.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Bank Details
 */
@JsonDeserialize(builder = BankDetails.Builder.class)
public final class BankDetails {
    /**
     * Account number
     */
    private final Optional<String> accountNumber;

    /**
     * Bank address
     */
    private final Optional<String> bankAddress;

    /**
     * Bank branch
     */
    private final Optional<String> bankBranch;

    /**
     * City of the bank.
     */
    private final Optional<String> bankCity;

    /**
     * Full country name.
     */
    private final Optional<String> bankCountry;

    /**
     * Two-letter ISO country code.
     */
    private final Optional<String> bankCountryIso;

    /**
     * Bank name
     */
    private final Optional<String> bankName;

    /**
     * The bank's post code or the zip code for USA banks.
     */
    private final Optional<String> bankPostCode;

    /**
     * State the bank is situated in. Available in all countries using states.
     */
    private final Optional<String> bankState;

    /**
     * BIC/Swift code.
     */
    private final Optional<String> bicSwift;

    /**
     * Three-letter ISO currency code.
     */
    private final Optional<String> currency;

    /**
     * The type of identifier used to identify the account (e.g. IBAN).
     */
    private final String identifierType;

    /**
     * The value of the identifier of the account in the format of the identifier_type (e.g. IBAN code).
     */
    private final String identifierValue;

    private final Map<String, Object> additionalProperties;


    private BankDetails(Builder builder) {
        this.accountNumber = builder.accountNumber;
        this.bankAddress = builder.bankAddress;
        this.bankBranch = builder.bankBranch;
        this.bankCity = builder.bankCity;
        this.bankCountry = builder.bankCountry;
        this.bankCountryIso = builder.bankCountryIso;
        this.bankName = builder.bankName;
        this.bankPostCode = builder.bankPostCode;
        this.bankState = builder.bankState;
        this.bicSwift = builder.bicSwift;
        this.currency = builder.currency;
        this.identifierType = builder.identifierType;
        this.identifierValue = builder.identifierValue;
        this.additionalProperties = builder.additionalProperties;
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
     * Retrieves value for `bankAddress`
     * Bank address
     */
    @JsonProperty("bank_address")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBankAddress() {
        return bankAddress;
    }
    /**
     * Retrieves value for `bankBranch`
     * Bank branch
     */
    @JsonProperty("bank_branch")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBankBranch() {
        return bankBranch;
    }
    /**
     * Retrieves value for `bankCity`
     * City of the bank.
     */
    @JsonProperty("bank_city")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBankCity() {
        return bankCity;
    }
    /**
     * Retrieves value for `bankCountry`
     * Full country name.
     */
    @JsonProperty("bank_country")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBankCountry() {
        return bankCountry;
    }
    /**
     * Retrieves value for `bankCountryIso`
     * Two-letter ISO country code.
     */
    @JsonProperty("bank_country_ISO")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBankCountryIso() {
        return bankCountryIso;
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
     * Retrieves value for `bankPostCode`
     * The bank's post code or the zip code for USA banks.
     */
    @JsonProperty("bank_post_code")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBankPostCode() {
        return bankPostCode;
    }
    /**
     * Retrieves value for `bankState`
     * State the bank is situated in. Available in all countries using states.
     */
    @JsonProperty("bank_state")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBankState() {
        return bankState;
    }
    /**
     * Retrieves value for `bicSwift`
     * BIC/Swift code.
     */
    @JsonProperty("bic_swift")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBicSwift() {
        return bicSwift;
    }
    /**
     * Retrieves value for `currency`
     * Three-letter ISO currency code.
     */
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `identifierType`
     * The type of identifier used to identify the account (e.g. IBAN).
     */
    @JsonProperty("identifier_type")
    public String getIdentifierType() {
        return identifierType;
    }
    /**
     * Retrieves value for `identifierValue`
     * The value of the identifier of the account in the format of the identifier_type (e.g. IBAN code).
     */
    @JsonProperty("identifier_value")
    public String getIdentifierValue() {
        return identifierValue;
    }
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof BankDetails && equalTo((BankDetails) other);
    }

    private boolean equalTo(BankDetails other) {
        return
            accountNumber.equals(other.accountNumber) &&

            bankAddress.equals(other.bankAddress) &&

            bankBranch.equals(other.bankBranch) &&

            bankCity.equals(other.bankCity) &&

            bankCountry.equals(other.bankCountry) &&

            bankCountryIso.equals(other.bankCountryIso) &&

            bankName.equals(other.bankName) &&

            bankPostCode.equals(other.bankPostCode) &&

            bankState.equals(other.bankState) &&

            bicSwift.equals(other.bicSwift) &&

            currency.equals(other.currency) &&

            identifierType.equals(other.identifierType) &&

            identifierValue.equals(other.identifierValue)
            &&
            additionalProperties.equals(other.additionalProperties)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountNumber,
                   this.bankAddress,
                   this.bankBranch,
                   this.bankCity,
                   this.bankCountry,
                   this.bankCountryIso,
                   this.bankName,
                   this.bankPostCode,
                   this.bankState,
                   this.bicSwift,
                   this.currency,
                   this.identifierType,
                   this.identifierValue
                   ,
                   this.additionalProperties
               );
    }

    @Override
    public String toString() {
        return "BankDetails{" +
               "accountNumber=" + accountNumber + ", " +
               "bankAddress=" + bankAddress + ", " +
               "bankBranch=" + bankBranch + ", " +
               "bankCity=" + bankCity + ", " +
               "bankCountry=" + bankCountry + ", " +
               "bankCountryIso=" + bankCountryIso + ", " +
               "bankName=" + bankName + ", " +
               "bankPostCode=" + bankPostCode + ", " +
               "bankState=" + bankState + ", " +
               "bicSwift=" + bicSwift + ", " +
               "currency=" + currency + ", " +
               "identifierType=" + identifierType + ", " +
               "identifierValue=" + identifierValue +
               ", additionalProperties=" + additionalProperties +
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
         * Bank address
         */
        private Optional<String> bankAddress = Optional.empty();

        /**
         * Bank branch
         */
        private Optional<String> bankBranch = Optional.empty();

        /**
         * City of the bank.
         */
        private Optional<String> bankCity = Optional.empty();

        /**
         * Full country name.
         */
        private Optional<String> bankCountry = Optional.empty();

        /**
         * Two-letter ISO country code.
         */
        private Optional<String> bankCountryIso = Optional.empty();

        /**
         * Bank name
         */
        private Optional<String> bankName = Optional.empty();

        /**
         * The bank's post code or the zip code for USA banks.
         */
        private Optional<String> bankPostCode = Optional.empty();

        /**
         * State the bank is situated in. Available in all countries using states.
         */
        private Optional<String> bankState = Optional.empty();

        /**
         * BIC/Swift code.
         */
        private Optional<String> bicSwift = Optional.empty();

        /**
         * Three-letter ISO currency code.
         */
        private Optional<String> currency = Optional.empty();

        /**
         * The type of identifier used to identify the account (e.g. IBAN).
         */
        private String identifierType = null;

        /**
         * The value of the identifier of the account in the format of the identifier_type (e.g. IBAN code).
         */
        private String identifierValue = null;

        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(BankDetails other) {
            accountNumber(other.getAccountNumber());
            bankAddress(other.getBankAddress());
            bankBranch(other.getBankBranch());
            bankCity(other.getBankCity());
            bankCountry(other.getBankCountry());
            bankCountryIso(other.getBankCountryIso());
            bankName(other.getBankName());
            bankPostCode(other.getBankPostCode());
            bankState(other.getBankState());
            bicSwift(other.getBicSwift());
            currency(other.getCurrency());
            identifierType(other.getIdentifierType());
            identifierValue(other.getIdentifierValue());
            additionalProperties(other.getAdditionalProperties());
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
         * Sets value for `bankAddress`
         * Bank address
         */
        @JsonSetter("bank_address")
        public Builder bankAddress(Optional<String> bankAddress) {
            this.bankAddress = bankAddress;
            return this;
        }

        /**
         * Sets value for `bankAddress`
         * Bank address
         */
        public Builder bankAddress(String bankAddress) {
            return this.bankAddress(Optional.ofNullable(bankAddress));
        }
        /**
         * Sets value for `bankBranch`
         * Bank branch
         */
        @JsonSetter("bank_branch")
        public Builder bankBranch(Optional<String> bankBranch) {
            this.bankBranch = bankBranch;
            return this;
        }

        /**
         * Sets value for `bankBranch`
         * Bank branch
         */
        public Builder bankBranch(String bankBranch) {
            return this.bankBranch(Optional.ofNullable(bankBranch));
        }
        /**
         * Sets value for `bankCity`
         * City of the bank.
         */
        @JsonSetter("bank_city")
        public Builder bankCity(Optional<String> bankCity) {
            this.bankCity = bankCity;
            return this;
        }

        /**
         * Sets value for `bankCity`
         * City of the bank.
         */
        public Builder bankCity(String bankCity) {
            return this.bankCity(Optional.ofNullable(bankCity));
        }
        /**
         * Sets value for `bankCountry`
         * Full country name.
         */
        @JsonSetter("bank_country")
        public Builder bankCountry(Optional<String> bankCountry) {
            this.bankCountry = bankCountry;
            return this;
        }

        /**
         * Sets value for `bankCountry`
         * Full country name.
         */
        public Builder bankCountry(String bankCountry) {
            return this.bankCountry(Optional.ofNullable(bankCountry));
        }
        /**
         * Sets value for `bankCountryIso`
         * Two-letter ISO country code.
         */
        @JsonSetter("bank_country_ISO")
        public Builder bankCountryIso(Optional<String> bankCountryIso) {
            this.bankCountryIso = bankCountryIso;
            return this;
        }

        /**
         * Sets value for `bankCountryIso`
         * Two-letter ISO country code.
         */
        public Builder bankCountryIso(String bankCountryIso) {
            return this.bankCountryIso(Optional.ofNullable(bankCountryIso));
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
         * Sets value for `bankPostCode`
         * The bank's post code or the zip code for USA banks.
         */
        @JsonSetter("bank_post_code")
        public Builder bankPostCode(Optional<String> bankPostCode) {
            this.bankPostCode = bankPostCode;
            return this;
        }

        /**
         * Sets value for `bankPostCode`
         * The bank's post code or the zip code for USA banks.
         */
        public Builder bankPostCode(String bankPostCode) {
            return this.bankPostCode(Optional.ofNullable(bankPostCode));
        }
        /**
         * Sets value for `bankState`
         * State the bank is situated in. Available in all countries using states.
         */
        @JsonSetter("bank_state")
        public Builder bankState(Optional<String> bankState) {
            this.bankState = bankState;
            return this;
        }

        /**
         * Sets value for `bankState`
         * State the bank is situated in. Available in all countries using states.
         */
        public Builder bankState(String bankState) {
            return this.bankState(Optional.ofNullable(bankState));
        }
        /**
         * Sets value for `bicSwift`
         * BIC/Swift code.
         */
        @JsonSetter("bic_swift")
        public Builder bicSwift(Optional<String> bicSwift) {
            this.bicSwift = bicSwift;
            return this;
        }

        /**
         * Sets value for `bicSwift`
         * BIC/Swift code.
         */
        public Builder bicSwift(String bicSwift) {
            return this.bicSwift(Optional.ofNullable(bicSwift));
        }
        /**
         * Sets value for `currency`
         * Three-letter ISO currency code.
         */
        @JsonSetter("currency")
        public Builder currency(Optional<String> currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Sets value for `currency`
         * Three-letter ISO currency code.
         */
        public Builder currency(String currency) {
            return this.currency(Optional.ofNullable(currency));
        }
        /**
         * Sets value for `identifierType`
         * The type of identifier used to identify the account (e.g. IBAN).
         */
        @JsonSetter("identifier_type")
        public Builder identifierType(String identifierType) {
            if (identifierType == null) {
                throw new IllegalArgumentException("identifierType cannot be null");
            }

            this.identifierType = identifierType;
            return this;
        }
        /**
         * Sets value for `identifierValue`
         * The value of the identifier of the account in the format of the identifier_type (e.g. IBAN code).
         */
        @JsonSetter("identifier_value")
        public Builder identifierValue(String identifierValue) {
            if (identifierValue == null) {
                throw new IllegalArgumentException("identifierValue cannot be null");
            }

            this.identifierValue = identifierValue;
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



        public BankDetails build() {
            if (identifierType == null) {
                throw new IllegalStateException("identifierType is required");
            }

            if (identifierValue == null) {
                throw new IllegalStateException("identifierValue is required");
            }

            return new BankDetails(this);
        }
    }

}



