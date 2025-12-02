
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
 * Payer
 */
@JsonDeserialize(builder = Payer.Builder.class)
public final class Payer {
    private final Optional<List<String>> address;

    private final Optional<String> city;

    /**
     * The name of the company (if the payer is a company).
     */
    private final Optional<String> companyName;

    /**
     * Two-letter ISO country code.
     */
    private final Optional<String> country;

    private final Optional<String> createdAt;

    private final Optional<String> dateOfBirth;

    /**
     * Payer's first name.
     */
    private final Optional<String> firstName;

    /**
     * Unique UUID for the payer.
     */
    private final Optional<String> id;

    /**
     * The legal document used to verify the identity of the payer (e.g. passport).
     */
    private final Optional<String> identificationType;

    /**
     * A unique reference code for the identification document, such as a passport number.
     */
    private final Optional<String> identificationValue;

    /**
     * Payer's last name.
     */
    private final Optional<String> lastName;

    /**
     * Payer's entity type - company or individual.
     */
    private final Optional<PayerLegalEntityTypeEnum> legalEntityType;

    private final Optional<String> postcode;

    private final Optional<String> stateOrProvince;

    private final Optional<String> updatedAt;


    private Payer(Builder builder) {
        this.address = builder.address;
        this.city = builder.city;
        this.companyName = builder.companyName;
        this.country = builder.country;
        this.createdAt = builder.createdAt;
        this.dateOfBirth = builder.dateOfBirth;
        this.firstName = builder.firstName;
        this.id = builder.id;
        this.identificationType = builder.identificationType;
        this.identificationValue = builder.identificationValue;
        this.lastName = builder.lastName;
        this.legalEntityType = builder.legalEntityType;
        this.postcode = builder.postcode;
        this.stateOrProvince = builder.stateOrProvince;
        this.updatedAt = builder.updatedAt;
    }

    /**
     * Retrieves value for `address`
     */
    @JsonProperty("address")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<String>> getAddress() {
        return address;
    }
    /**
     * Retrieves value for `city`
     */
    @JsonProperty("city")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCity() {
        return city;
    }
    /**
     * Retrieves value for `companyName`
     * The name of the company (if the payer is a company).
     */
    @JsonProperty("company_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCompanyName() {
        return companyName;
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
     */
    @JsonProperty("created_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAt() {
        return createdAt;
    }
    /**
     * Retrieves value for `dateOfBirth`
     */
    @JsonProperty("date_of_birth")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getDateOfBirth() {
        return dateOfBirth;
    }
    /**
     * Retrieves value for `firstName`
     * Payer's first name.
     */
    @JsonProperty("first_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getFirstName() {
        return firstName;
    }
    /**
     * Retrieves value for `id`
     * Unique UUID for the payer.
     */
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getId() {
        return id;
    }
    /**
     * Retrieves value for `identificationType`
     * The legal document used to verify the identity of the payer (e.g. passport).
     */
    @JsonProperty("identification_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getIdentificationType() {
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
     * Retrieves value for `lastName`
     * Payer's last name.
     */
    @JsonProperty("last_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getLastName() {
        return lastName;
    }
    /**
     * Retrieves value for `legalEntityType`
     * Payer's entity type - company or individual.
     */
    @JsonProperty("legal_entity_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<PayerLegalEntityTypeEnum> getLegalEntityType() {
        return legalEntityType;
    }
    /**
     * Retrieves value for `postcode`
     */
    @JsonProperty("postcode")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPostcode() {
        return postcode;
    }
    /**
     * Retrieves value for `stateOrProvince`
     */
    @JsonProperty("state_or_province")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getStateOrProvince() {
        return stateOrProvince;
    }
    /**
     * Retrieves value for `updatedAt`
     */
    @JsonProperty("updated_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof Payer && equalTo((Payer) other);
    }

    private boolean equalTo(Payer other) {
        return
            address.equals(other.address) &&

            city.equals(other.city) &&

            companyName.equals(other.companyName) &&

            country.equals(other.country) &&

            createdAt.equals(other.createdAt) &&

            dateOfBirth.equals(other.dateOfBirth) &&

            firstName.equals(other.firstName) &&

            id.equals(other.id) &&

            identificationType.equals(other.identificationType) &&

            identificationValue.equals(other.identificationValue) &&

            lastName.equals(other.lastName) &&

            legalEntityType.equals(other.legalEntityType) &&

            postcode.equals(other.postcode) &&

            stateOrProvince.equals(other.stateOrProvince) &&

            updatedAt.equals(other.updatedAt)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.address,
                   this.city,
                   this.companyName,
                   this.country,
                   this.createdAt,
                   this.dateOfBirth,
                   this.firstName,
                   this.id,
                   this.identificationType,
                   this.identificationValue,
                   this.lastName,
                   this.legalEntityType,
                   this.postcode,
                   this.stateOrProvince,
                   this.updatedAt
               );
    }

    @Override
    public String toString() {
        return "Payer{" +
               "address=" + address + ", " +
               "city=" + city + ", " +
               "companyName=" + companyName + ", " +
               "country=" + country + ", " +
               "createdAt=" + createdAt + ", " +
               "dateOfBirth=" + dateOfBirth + ", " +
               "firstName=" + firstName + ", " +
               "id=" + id + ", " +
               "identificationType=" + identificationType + ", " +
               "identificationValue=" + identificationValue + ", " +
               "lastName=" + lastName + ", " +
               "legalEntityType=" + legalEntityType + ", " +
               "postcode=" + postcode + ", " +
               "stateOrProvince=" + stateOrProvince + ", " +
               "updatedAt=" + updatedAt +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<List<String>> address = Optional.empty();

        private Optional<String> city = Optional.empty();

        /**
         * The name of the company (if the payer is a company).
         */
        private Optional<String> companyName = Optional.empty();

        /**
         * Two-letter ISO country code.
         */
        private Optional<String> country = Optional.empty();

        private Optional<String> createdAt = Optional.empty();

        private Optional<String> dateOfBirth = Optional.empty();

        /**
         * Payer's first name.
         */
        private Optional<String> firstName = Optional.empty();

        /**
         * Unique UUID for the payer.
         */
        private Optional<String> id = Optional.empty();

        /**
         * The legal document used to verify the identity of the payer (e.g. passport).
         */
        private Optional<String> identificationType = Optional.empty();

        /**
         * A unique reference code for the identification document, such as a passport number.
         */
        private Optional<String> identificationValue = Optional.empty();

        /**
         * Payer's last name.
         */
        private Optional<String> lastName = Optional.empty();

        /**
         * Payer's entity type - company or individual.
         */
        private Optional<PayerLegalEntityTypeEnum> legalEntityType = Optional.empty();

        private Optional<String> postcode = Optional.empty();

        private Optional<String> stateOrProvince = Optional.empty();

        private Optional<String> updatedAt = Optional.empty();


        private Builder() {}

        public Builder from(Payer other) {
            address(other.getAddress());
            city(other.getCity());
            companyName(other.getCompanyName());
            country(other.getCountry());
            createdAt(other.getCreatedAt());
            dateOfBirth(other.getDateOfBirth());
            firstName(other.getFirstName());
            id(other.getId());
            identificationType(other.getIdentificationType());
            identificationValue(other.getIdentificationValue());
            lastName(other.getLastName());
            legalEntityType(other.getLegalEntityType());
            postcode(other.getPostcode());
            stateOrProvince(other.getStateOrProvince());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        /**
         * Sets value for `address`
         */
        @JsonSetter("address")
        public Builder address(Optional<List<String>> address) {
            this.address = address;
            return this;
        }

        /**
         * Sets value for `address`
         */
        public Builder address(List<String> address) {
            return this.address(Optional.ofNullable(address));
        }
        /**
         * Sets value for `city`
         */
        @JsonSetter("city")
        public Builder city(Optional<String> city) {
            this.city = city;
            return this;
        }

        /**
         * Sets value for `city`
         */
        public Builder city(String city) {
            return this.city(Optional.ofNullable(city));
        }
        /**
         * Sets value for `companyName`
         * The name of the company (if the payer is a company).
         */
        @JsonSetter("company_name")
        public Builder companyName(Optional<String> companyName) {
            this.companyName = companyName;
            return this;
        }

        /**
         * Sets value for `companyName`
         * The name of the company (if the payer is a company).
         */
        public Builder companyName(String companyName) {
            return this.companyName(Optional.ofNullable(companyName));
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
         */
        @JsonSetter("created_at")
        public Builder createdAt(Optional<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Sets value for `createdAt`
         */
        public Builder createdAt(String createdAt) {
            return this.createdAt(Optional.ofNullable(createdAt));
        }
        /**
         * Sets value for `dateOfBirth`
         */
        @JsonSetter("date_of_birth")
        public Builder dateOfBirth(Optional<String> dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        /**
         * Sets value for `dateOfBirth`
         */
        public Builder dateOfBirth(String dateOfBirth) {
            return this.dateOfBirth(Optional.ofNullable(dateOfBirth));
        }
        /**
         * Sets value for `firstName`
         * Payer's first name.
         */
        @JsonSetter("first_name")
        public Builder firstName(Optional<String> firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * Sets value for `firstName`
         * Payer's first name.
         */
        public Builder firstName(String firstName) {
            return this.firstName(Optional.ofNullable(firstName));
        }
        /**
         * Sets value for `id`
         * Unique UUID for the payer.
         */
        @JsonSetter("id")
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        /**
         * Sets value for `id`
         * Unique UUID for the payer.
         */
        public Builder id(String id) {
            return this.id(Optional.ofNullable(id));
        }
        /**
         * Sets value for `identificationType`
         * The legal document used to verify the identity of the payer (e.g. passport).
         */
        @JsonSetter("identification_type")
        public Builder identificationType(Optional<String> identificationType) {
            this.identificationType = identificationType;
            return this;
        }

        /**
         * Sets value for `identificationType`
         * The legal document used to verify the identity of the payer (e.g. passport).
         */
        public Builder identificationType(String identificationType) {
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
         * Sets value for `lastName`
         * Payer's last name.
         */
        @JsonSetter("last_name")
        public Builder lastName(Optional<String> lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Sets value for `lastName`
         * Payer's last name.
         */
        public Builder lastName(String lastName) {
            return this.lastName(Optional.ofNullable(lastName));
        }
        /**
         * Sets value for `legalEntityType`
         * Payer's entity type - company or individual.
         */
        @JsonSetter("legal_entity_type")
        public Builder legalEntityType(Optional<PayerLegalEntityTypeEnum> legalEntityType) {
            this.legalEntityType = legalEntityType;
            return this;
        }

        /**
         * Sets value for `legalEntityType`
         * Payer's entity type - company or individual.
         */
        public Builder legalEntityType(PayerLegalEntityTypeEnum legalEntityType) {
            return this.legalEntityType(Optional.ofNullable(legalEntityType));
        }
        /**
         * Sets value for `postcode`
         */
        @JsonSetter("postcode")
        public Builder postcode(Optional<String> postcode) {
            this.postcode = postcode;
            return this;
        }

        /**
         * Sets value for `postcode`
         */
        public Builder postcode(String postcode) {
            return this.postcode(Optional.ofNullable(postcode));
        }
        /**
         * Sets value for `stateOrProvince`
         */
        @JsonSetter("state_or_province")
        public Builder stateOrProvince(Optional<String> stateOrProvince) {
            this.stateOrProvince = stateOrProvince;
            return this;
        }

        /**
         * Sets value for `stateOrProvince`
         */
        public Builder stateOrProvince(String stateOrProvince) {
            return this.stateOrProvince(Optional.ofNullable(stateOrProvince));
        }
        /**
         * Sets value for `updatedAt`
         */
        @JsonSetter("updated_at")
        public Builder updatedAt(Optional<String> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Sets value for `updatedAt`
         */
        public Builder updatedAt(String updatedAt) {
            return this.updatedAt(Optional.ofNullable(updatedAt));
        }



        public Payer build() {
            return new Payer(this);
        }
    }

}



