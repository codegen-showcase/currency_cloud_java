
package com.currencycloud.sdk.resources.contacts.params;

import java.util.Objects;
import java.util.Optional;

import com.currencycloud.sdk.model.ContactsCreateBodyStatusEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * CreateRequest
 */
@JsonDeserialize(builder = CreateRequest.Builder.class)
public final class CreateRequest {
    /**
     * Account UUID
     */
    private final String accountId;

    /**
     * The contact's date of birth. ISO 8601 format YYYY-MM-DD. <b>Required if account type is individual</b>.
     */
    private final Optional<String> dateOfBirth;

    /**
     * The contact's email address.
     */
    private final String emailAddress;

    /**
     * The contact's first name.
     */
    private final String firstName;

    /**
     * The contact's last name.
     */
    private final String lastName;

    /**
     * Locale code ("en", "en-US", "fr-FR").
     */
    private final Optional<String> locale;

    /**
     * The contact's Currencycloud login ID, allows the contact to login and conduct activity on the sub-account.
     */
    private final Optional<String> loginId;

    /**
     * The contact's mobile phone number.
     */
    private final Optional<String> mobilePhoneNumber;

    /**
     * The contact's phone number.
     */
    private final String phoneNumber;

    /**
     * Contact status - "enabled" allows the contact to conduct activity on the sub-account, "not_enabled" disables the contact.
     */
    private final Optional<ContactsCreateBodyStatusEnum> status;

    /**
     * Timezone ("Europe/London", "America/New_York").
     */
    private final Optional<String> timezone;

    /**
     * User-generated reference code.
     */
    private final Optional<String> yourReference;


    private CreateRequest(Builder builder) {
        this.accountId = builder.accountId;
        this.dateOfBirth = builder.dateOfBirth;
        this.emailAddress = builder.emailAddress;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.locale = builder.locale;
        this.loginId = builder.loginId;
        this.mobilePhoneNumber = builder.mobilePhoneNumber;
        this.phoneNumber = builder.phoneNumber;
        this.status = builder.status;
        this.timezone = builder.timezone;
        this.yourReference = builder.yourReference;
    }

    /**
     * Retrieves value for `accountId`
     * Account UUID
     */
    @JsonProperty("account_id")
    public String getAccountId() {
        return accountId;
    }
    /**
     * Retrieves value for `dateOfBirth`
     * The contact's date of birth. ISO 8601 format YYYY-MM-DD. <b>Required if account type is individual</b>.
     */
    @JsonProperty("date_of_birth")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getDateOfBirth() {
        return dateOfBirth;
    }
    /**
     * Retrieves value for `emailAddress`
     * The contact's email address.
     */
    @JsonProperty("email_address")
    public String getEmailAddress() {
        return emailAddress;
    }
    /**
     * Retrieves value for `firstName`
     * The contact's first name.
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }
    /**
     * Retrieves value for `lastName`
     * The contact's last name.
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }
    /**
     * Retrieves value for `locale`
     * Locale code ("en", "en-US", "fr-FR").
     */
    @JsonProperty("locale")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getLocale() {
        return locale;
    }
    /**
     * Retrieves value for `loginId`
     * The contact's Currencycloud login ID, allows the contact to login and conduct activity on the sub-account.
     */
    @JsonProperty("login_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getLoginId() {
        return loginId;
    }
    /**
     * Retrieves value for `mobilePhoneNumber`
     * The contact's mobile phone number.
     */
    @JsonProperty("mobile_phone_number")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }
    /**
     * Retrieves value for `phoneNumber`
     * The contact's phone number.
     */
    @JsonProperty("phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }
    /**
     * Retrieves value for `status`
     * Contact status - "enabled" allows the contact to conduct activity on the sub-account, "not_enabled" disables the contact.
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ContactsCreateBodyStatusEnum> getStatus() {
        return status;
    }
    /**
     * Retrieves value for `timezone`
     * Timezone ("Europe/London", "America/New_York").
     */
    @JsonProperty("timezone")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getTimezone() {
        return timezone;
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

        return other instanceof CreateRequest && equalTo((CreateRequest) other);
    }

    private boolean equalTo(CreateRequest other) {
        return
            accountId.equals(other.accountId) &&

            dateOfBirth.equals(other.dateOfBirth) &&

            emailAddress.equals(other.emailAddress) &&

            firstName.equals(other.firstName) &&

            lastName.equals(other.lastName) &&

            locale.equals(other.locale) &&

            loginId.equals(other.loginId) &&

            mobilePhoneNumber.equals(other.mobilePhoneNumber) &&

            phoneNumber.equals(other.phoneNumber) &&

            status.equals(other.status) &&

            timezone.equals(other.timezone) &&

            yourReference.equals(other.yourReference)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountId,
                   this.dateOfBirth,
                   this.emailAddress,
                   this.firstName,
                   this.lastName,
                   this.locale,
                   this.loginId,
                   this.mobilePhoneNumber,
                   this.phoneNumber,
                   this.status,
                   this.timezone,
                   this.yourReference
               );
    }

    @Override
    public String toString() {
        return "CreateRequest{" +
               "accountId=" + accountId + ", " +
               "dateOfBirth=" + dateOfBirth + ", " +
               "emailAddress=" + emailAddress + ", " +
               "firstName=" + firstName + ", " +
               "lastName=" + lastName + ", " +
               "locale=" + locale + ", " +
               "loginId=" + loginId + ", " +
               "mobilePhoneNumber=" + mobilePhoneNumber + ", " +
               "phoneNumber=" + phoneNumber + ", " +
               "status=" + status + ", " +
               "timezone=" + timezone + ", " +
               "yourReference=" + yourReference +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Account UUID
         */
        private String accountId = null;

        /**
         * The contact's date of birth. ISO 8601 format YYYY-MM-DD. <b>Required if account type is individual</b>.
         */
        private Optional<String> dateOfBirth = Optional.empty();

        /**
         * The contact's email address.
         */
        private String emailAddress = null;

        /**
         * The contact's first name.
         */
        private String firstName = null;

        /**
         * The contact's last name.
         */
        private String lastName = null;

        /**
         * Locale code ("en", "en-US", "fr-FR").
         */
        private Optional<String> locale = Optional.empty();

        /**
         * The contact's Currencycloud login ID, allows the contact to login and conduct activity on the sub-account.
         */
        private Optional<String> loginId = Optional.empty();

        /**
         * The contact's mobile phone number.
         */
        private Optional<String> mobilePhoneNumber = Optional.empty();

        /**
         * The contact's phone number.
         */
        private String phoneNumber = null;

        /**
         * Contact status - "enabled" allows the contact to conduct activity on the sub-account, "not_enabled" disables the contact.
         */
        private Optional<ContactsCreateBodyStatusEnum> status = Optional.empty();

        /**
         * Timezone ("Europe/London", "America/New_York").
         */
        private Optional<String> timezone = Optional.empty();

        /**
         * User-generated reference code.
         */
        private Optional<String> yourReference = Optional.empty();


        private Builder() {}

        public Builder from(CreateRequest other) {
            accountId(other.getAccountId());
            dateOfBirth(other.getDateOfBirth());
            emailAddress(other.getEmailAddress());
            firstName(other.getFirstName());
            lastName(other.getLastName());
            locale(other.getLocale());
            loginId(other.getLoginId());
            mobilePhoneNumber(other.getMobilePhoneNumber());
            phoneNumber(other.getPhoneNumber());
            status(other.getStatus());
            timezone(other.getTimezone());
            yourReference(other.getYourReference());
            return this;
        }

        /**
         * Sets value for `accountId`
         * Account UUID
         */
        @JsonSetter("account_id")
        public Builder accountId(String accountId) {
            if (accountId == null) {
                throw new IllegalArgumentException("accountId cannot be null");
            }

            this.accountId = accountId;
            return this;
        }
        /**
         * Sets value for `dateOfBirth`
         * The contact's date of birth. ISO 8601 format YYYY-MM-DD. <b>Required if account type is individual</b>.
         */
        @JsonSetter("date_of_birth")
        public Builder dateOfBirth(Optional<String> dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        /**
         * Sets value for `dateOfBirth`
         * The contact's date of birth. ISO 8601 format YYYY-MM-DD. <b>Required if account type is individual</b>.
         */
        public Builder dateOfBirth(String dateOfBirth) {
            return this.dateOfBirth(Optional.ofNullable(dateOfBirth));
        }
        /**
         * Sets value for `emailAddress`
         * The contact's email address.
         */
        @JsonSetter("email_address")
        public Builder emailAddress(String emailAddress) {
            if (emailAddress == null) {
                throw new IllegalArgumentException("emailAddress cannot be null");
            }

            this.emailAddress = emailAddress;
            return this;
        }
        /**
         * Sets value for `firstName`
         * The contact's first name.
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
         * The contact's last name.
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
         * Sets value for `locale`
         * Locale code ("en", "en-US", "fr-FR").
         */
        @JsonSetter("locale")
        public Builder locale(Optional<String> locale) {
            this.locale = locale;
            return this;
        }

        /**
         * Sets value for `locale`
         * Locale code ("en", "en-US", "fr-FR").
         */
        public Builder locale(String locale) {
            return this.locale(Optional.ofNullable(locale));
        }
        /**
         * Sets value for `loginId`
         * The contact's Currencycloud login ID, allows the contact to login and conduct activity on the sub-account.
         */
        @JsonSetter("login_id")
        public Builder loginId(Optional<String> loginId) {
            this.loginId = loginId;
            return this;
        }

        /**
         * Sets value for `loginId`
         * The contact's Currencycloud login ID, allows the contact to login and conduct activity on the sub-account.
         */
        public Builder loginId(String loginId) {
            return this.loginId(Optional.ofNullable(loginId));
        }
        /**
         * Sets value for `mobilePhoneNumber`
         * The contact's mobile phone number.
         */
        @JsonSetter("mobile_phone_number")
        public Builder mobilePhoneNumber(Optional<String> mobilePhoneNumber) {
            this.mobilePhoneNumber = mobilePhoneNumber;
            return this;
        }

        /**
         * Sets value for `mobilePhoneNumber`
         * The contact's mobile phone number.
         */
        public Builder mobilePhoneNumber(String mobilePhoneNumber) {
            return this.mobilePhoneNumber(Optional.ofNullable(mobilePhoneNumber));
        }
        /**
         * Sets value for `phoneNumber`
         * The contact's phone number.
         */
        @JsonSetter("phone_number")
        public Builder phoneNumber(String phoneNumber) {
            if (phoneNumber == null) {
                throw new IllegalArgumentException("phoneNumber cannot be null");
            }

            this.phoneNumber = phoneNumber;
            return this;
        }
        /**
         * Sets value for `status`
         * Contact status - "enabled" allows the contact to conduct activity on the sub-account, "not_enabled" disables the contact.
         */
        @JsonSetter("status")
        public Builder status(Optional<ContactsCreateBodyStatusEnum> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets value for `status`
         * Contact status - "enabled" allows the contact to conduct activity on the sub-account, "not_enabled" disables the contact.
         */
        public Builder status(ContactsCreateBodyStatusEnum status) {
            return this.status(Optional.ofNullable(status));
        }
        /**
         * Sets value for `timezone`
         * Timezone ("Europe/London", "America/New_York").
         */
        @JsonSetter("timezone")
        public Builder timezone(Optional<String> timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * Sets value for `timezone`
         * Timezone ("Europe/London", "America/New_York").
         */
        public Builder timezone(String timezone) {
            return this.timezone(Optional.ofNullable(timezone));
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



        public CreateRequest build() {
            if (accountId == null) {
                throw new IllegalStateException("accountId is required");
            }

            if (emailAddress == null) {
                throw new IllegalStateException("emailAddress is required");
            }

            if (firstName == null) {
                throw new IllegalStateException("firstName is required");
            }

            if (lastName == null) {
                throw new IllegalStateException("lastName is required");
            }

            if (phoneNumber == null) {
                throw new IllegalStateException("phoneNumber is required");
            }

            return new CreateRequest(this);
        }
    }

}



