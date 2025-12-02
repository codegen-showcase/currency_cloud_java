
package com.currencycloud.sdk.resources.termsandconditions.params;

import java.util.Objects;

import com.currencycloud.sdk.model.TermsAndConditionsAcceptBodyReferenceTypeEnum;
import com.currencycloud.sdk.model.TermsAndConditionsAcceptBodyTypeEnum;
import com.currencycloud.sdk.model.TermsAndConditionsAcceptBodyVersionEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * AcceptRequest
 */
@JsonDeserialize(builder = AcceptRequest.Builder.class)
public final class AcceptRequest {
    /**
     * The email of the user accepting the Terms of Use. Length must be between 1 and 255 characters. <br> Regex:  /^[\w\.\_\%\-\+]+@([\w-]+\.)+\w{2,}+$/
     */
    private final String email;

    /**
     * The first name of the user accepting the Terms of Use. Must be between 1 and 100 characters in length and not contain < or >.
     */
    private final String firstName;

    /**
     * The last name of the user accepting the Terms of Use. Must be between 1 and 100 characters in length and not contain < or >.
     */
    private final String lastName;

    /**
     * The account / sub-account UUID that the Terms of Use are being accepted for.
     */
    private final String referenceId;

    /**
     * The type of reference accepting the Terms of Use.
     */
    private final TermsAndConditionsAcceptBodyReferenceTypeEnum referenceType;

    /**
     * The type of Terms of Use the user is accepting.
     */
    private final TermsAndConditionsAcceptBodyTypeEnum type;

    /**
     * The version of the Terms of Use the user is accepting.
     */
    private final TermsAndConditionsAcceptBodyVersionEnum version;


    private AcceptRequest(Builder builder) {
        this.email = builder.email;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.referenceId = builder.referenceId;
        this.referenceType = builder.referenceType;
        this.type = builder.type;
        this.version = builder.version;
    }

    /**
     * Retrieves value for `email`
     * The email of the user accepting the Terms of Use. Length must be between 1 and 255 characters. <br> Regex:  /^[\w\.\_\%\-\+]+@([\w-]+\.)+\w{2,}+$/
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }
    /**
     * Retrieves value for `firstName`
     * The first name of the user accepting the Terms of Use. Must be between 1 and 100 characters in length and not contain < or >.
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }
    /**
     * Retrieves value for `lastName`
     * The last name of the user accepting the Terms of Use. Must be between 1 and 100 characters in length and not contain < or >.
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }
    /**
     * Retrieves value for `referenceId`
     * The account / sub-account UUID that the Terms of Use are being accepted for.
     */
    @JsonProperty("reference_id")
    public String getReferenceId() {
        return referenceId;
    }
    /**
     * Retrieves value for `referenceType`
     * The type of reference accepting the Terms of Use.
     */
    @JsonProperty("reference_type")
    public TermsAndConditionsAcceptBodyReferenceTypeEnum getReferenceType() {
        return referenceType;
    }
    /**
     * Retrieves value for `type`
     * The type of Terms of Use the user is accepting.
     */
    @JsonProperty("type")
    public TermsAndConditionsAcceptBodyTypeEnum getType() {
        return type;
    }
    /**
     * Retrieves value for `version`
     * The version of the Terms of Use the user is accepting.
     */
    @JsonProperty("version")
    public TermsAndConditionsAcceptBodyVersionEnum getVersion() {
        return version;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof AcceptRequest && equalTo((AcceptRequest) other);
    }

    private boolean equalTo(AcceptRequest other) {
        return
            email.equals(other.email) &&

            firstName.equals(other.firstName) &&

            lastName.equals(other.lastName) &&

            referenceId.equals(other.referenceId) &&

            referenceType.equals(other.referenceType) &&

            type.equals(other.type) &&

            version.equals(other.version)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.email,
                   this.firstName,
                   this.lastName,
                   this.referenceId,
                   this.referenceType,
                   this.type,
                   this.version
               );
    }

    @Override
    public String toString() {
        return "AcceptRequest{" +
               "email=" + email + ", " +
               "firstName=" + firstName + ", " +
               "lastName=" + lastName + ", " +
               "referenceId=" + referenceId + ", " +
               "referenceType=" + referenceType + ", " +
               "type=" + type + ", " +
               "version=" + version +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The email of the user accepting the Terms of Use. Length must be between 1 and 255 characters. <br> Regex:  /^[\w\.\_\%\-\+]+@([\w-]+\.)+\w{2,}+$/
         */
        private String email = null;

        /**
         * The first name of the user accepting the Terms of Use. Must be between 1 and 100 characters in length and not contain < or >.
         */
        private String firstName = null;

        /**
         * The last name of the user accepting the Terms of Use. Must be between 1 and 100 characters in length and not contain < or >.
         */
        private String lastName = null;

        /**
         * The account / sub-account UUID that the Terms of Use are being accepted for.
         */
        private String referenceId = null;

        /**
         * The type of reference accepting the Terms of Use.
         */
        private TermsAndConditionsAcceptBodyReferenceTypeEnum referenceType = null;

        /**
         * The type of Terms of Use the user is accepting.
         */
        private TermsAndConditionsAcceptBodyTypeEnum type = null;

        /**
         * The version of the Terms of Use the user is accepting.
         */
        private TermsAndConditionsAcceptBodyVersionEnum version = null;


        private Builder() {}

        public Builder from(AcceptRequest other) {
            email(other.getEmail());
            firstName(other.getFirstName());
            lastName(other.getLastName());
            referenceId(other.getReferenceId());
            referenceType(other.getReferenceType());
            type(other.getType());
            version(other.getVersion());
            return this;
        }

        /**
         * Sets value for `email`
         * The email of the user accepting the Terms of Use. Length must be between 1 and 255 characters. <br> Regex:  /^[\w\.\_\%\-\+]+@([\w-]+\.)+\w{2,}+$/
         */
        @JsonSetter("email")
        public Builder email(String email) {
            if (email == null) {
                throw new IllegalArgumentException("email cannot be null");
            }

            this.email = email;
            return this;
        }
        /**
         * Sets value for `firstName`
         * The first name of the user accepting the Terms of Use. Must be between 1 and 100 characters in length and not contain < or >.
         */
        @JsonSetter("first_name")
        public Builder firstName(String firstName) {
            if (firstName == null) {
                throw new IllegalArgumentException("firstName cannot be null");
            }

            this.firstName = firstName;
            return this;
        }
        /**
         * Sets value for `lastName`
         * The last name of the user accepting the Terms of Use. Must be between 1 and 100 characters in length and not contain < or >.
         */
        @JsonSetter("last_name")
        public Builder lastName(String lastName) {
            if (lastName == null) {
                throw new IllegalArgumentException("lastName cannot be null");
            }

            this.lastName = lastName;
            return this;
        }
        /**
         * Sets value for `referenceId`
         * The account / sub-account UUID that the Terms of Use are being accepted for.
         */
        @JsonSetter("reference_id")
        public Builder referenceId(String referenceId) {
            if (referenceId == null) {
                throw new IllegalArgumentException("referenceId cannot be null");
            }

            this.referenceId = referenceId;
            return this;
        }
        /**
         * Sets value for `referenceType`
         * The type of reference accepting the Terms of Use.
         */
        @JsonSetter("reference_type")
        public Builder referenceType(TermsAndConditionsAcceptBodyReferenceTypeEnum referenceType) {
            if (referenceType == null) {
                throw new IllegalArgumentException("referenceType cannot be null");
            }

            this.referenceType = referenceType;
            return this;
        }
        /**
         * Sets value for `type`
         * The type of Terms of Use the user is accepting.
         */
        @JsonSetter("type")
        public Builder type(TermsAndConditionsAcceptBodyTypeEnum type) {
            if (type == null) {
                throw new IllegalArgumentException("type cannot be null");
            }

            this.type = type;
            return this;
        }
        /**
         * Sets value for `version`
         * The version of the Terms of Use the user is accepting.
         */
        @JsonSetter("version")
        public Builder version(TermsAndConditionsAcceptBodyVersionEnum version) {
            if (version == null) {
                throw new IllegalArgumentException("version cannot be null");
            }

            this.version = version;
            return this;
        }



        public AcceptRequest build() {
            if (email == null) {
                throw new IllegalStateException("email is required");
            }

            if (firstName == null) {
                throw new IllegalStateException("firstName is required");
            }

            if (lastName == null) {
                throw new IllegalStateException("lastName is required");
            }

            if (referenceId == null) {
                throw new IllegalStateException("referenceId is required");
            }

            if (referenceType == null) {
                throw new IllegalStateException("referenceType is required");
            }

            if (type == null) {
                throw new IllegalStateException("type is required");
            }

            if (version == null) {
                throw new IllegalStateException("version is required");
            }

            return new AcceptRequest(this);
        }
    }

}



