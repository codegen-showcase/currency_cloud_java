
package com.currencycloud.sdk.resources.rates.params;

import java.util.Objects;

import com.currencycloud.sdk.model.RatesFindBankDetailsBodyIdentifierTypeEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * FindBankDetailsRequest
 */
@JsonDeserialize(builder = FindBankDetailsRequest.Builder.class)
public final class FindBankDetailsRequest {
    /**
     * The type of code used to identify the account (e.g. IBAN).
     */
    private final RatesFindBankDetailsBodyIdentifierTypeEnum identifierType;

    /**
     * The value of the account identifier specified in identifier_type (e.g. the IBAN code).
     */
    private final String identifierValue;


    private FindBankDetailsRequest(Builder builder) {
        this.identifierType = builder.identifierType;
        this.identifierValue = builder.identifierValue;
    }

    /**
     * Retrieves value for `identifierType`
     * The type of code used to identify the account (e.g. IBAN).
     */
    @JsonProperty("identifier_type")
    public RatesFindBankDetailsBodyIdentifierTypeEnum getIdentifierType() {
        return identifierType;
    }
    /**
     * Retrieves value for `identifierValue`
     * The value of the account identifier specified in identifier_type (e.g. the IBAN code).
     */
    @JsonProperty("identifier_value")
    public String getIdentifierValue() {
        return identifierValue;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof FindBankDetailsRequest && equalTo((FindBankDetailsRequest) other);
    }

    private boolean equalTo(FindBankDetailsRequest other) {
        return
            identifierType.equals(other.identifierType) &&

            identifierValue.equals(other.identifierValue)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.identifierType,
                   this.identifierValue
               );
    }

    @Override
    public String toString() {
        return "FindBankDetailsRequest{" +
               "identifierType=" + identifierType + ", " +
               "identifierValue=" + identifierValue +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The type of code used to identify the account (e.g. IBAN).
         */
        private RatesFindBankDetailsBodyIdentifierTypeEnum identifierType = null;

        /**
         * The value of the account identifier specified in identifier_type (e.g. the IBAN code).
         */
        private String identifierValue = null;


        private Builder() {}

        public Builder from(FindBankDetailsRequest other) {
            identifierType(other.getIdentifierType());
            identifierValue(other.getIdentifierValue());
            return this;
        }

        /**
         * Sets value for `identifierType`
         * The type of code used to identify the account (e.g. IBAN).
         */
        @JsonSetter("identifier_type")
        public Builder identifierType(RatesFindBankDetailsBodyIdentifierTypeEnum identifierType) {
            if (identifierType == null) {
                throw new IllegalArgumentException("identifierType cannot be null");
            }

            this.identifierType = identifierType;
            return this;
        }
        /**
         * Sets value for `identifierValue`
         * The value of the account identifier specified in identifier_type (e.g. the IBAN code).
         */
        @JsonSetter("identifier_value")
        public Builder identifierValue(String identifierValue) {
            if (identifierValue == null) {
                throw new IllegalArgumentException("identifierValue cannot be null");
            }

            this.identifierValue = identifierValue;
            return this;
        }



        public FindBankDetailsRequest build() {
            if (identifierType == null) {
                throw new IllegalStateException("identifierType is required");
            }

            if (identifierValue == null) {
                throw new IllegalStateException("identifierValue is required");
            }

            return new FindBankDetailsRequest(this);
        }
    }

}



