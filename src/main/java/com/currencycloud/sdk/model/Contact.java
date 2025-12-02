
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Contact.
 */
@JsonDeserialize(builder = Contact.Builder.class)
public final class Contact {
    /**
     * The contact's account ID.
     */
    private final Optional<String> accountId;

    /**
     * The account name.
     */
    private final Optional<String> accountName;

    /**
     * The date the contact record was created.
     */
    private final Optional<String> createdAt;

    /**
     * The contact's date of birth.
     */
    private final Optional<String> dateOfBirth;

    /**
     * The contact's email address.
     */
    private final Optional<String> emailAddress;

    /**
     * The contact's first name.
     */
    private final Optional<String> firstName;

    /**
     * The contact's ID.
     */
    private final Optional<String> id;

    /**
     * The contact's last name.
     */
    private final Optional<String> lastName;

    /**
     * The contact's locale.
     */
    private final Optional<String> locale;

    /**
     * The contact's Currencycloud login ID.
     */
    private final Optional<String> loginId;

    /**
     * The contact's mobile phone number.
     */
    private final Optional<String> mobilePhoneNumber;

    /**
     * The contact's phone number.
     */
    private final Optional<String> phoneNumber;

    /**
     * Contact status - "enabled" allows the contact to conduct activity on the sub-account, "not_enabled" disables the contact.
     */
    private final Optional<String> status;

    /**
     * The contact's timezone.
     */
    private final Optional<String> timezone;

    /**
     * The date the contact record was last updated.
     */
    private final Optional<String> updatedAt;

    /**
     * The user-generated reference code given to the contact.
     */
    private final Optional<String> yourReference;


    private Contact(Builder builder) {
        this.accountId = builder.accountId;
        this.accountName = builder.accountName;
        this.createdAt = builder.createdAt;
        this.dateOfBirth = builder.dateOfBirth;
        this.emailAddress = builder.emailAddress;
        this.firstName = builder.firstName;
        this.id = builder.id;
        this.lastName = builder.lastName;
        this.locale = builder.locale;
        this.loginId = builder.loginId;
        this.mobilePhoneNumber = builder.mobilePhoneNumber;
        this.phoneNumber = builder.phoneNumber;
        this.status = builder.status;
        this.timezone = builder.timezone;
        this.updatedAt = builder.updatedAt;
        this.yourReference = builder.yourReference;
    }

    /**
     * Retrieves value for `accountId`
     * The contact's account ID.
     */
    @JsonProperty("account_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAccountId() {
        return accountId;
    }
    /**
     * Retrieves value for `accountName`
     * The account name.
     */
    @JsonProperty("account_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAccountName() {
        return accountName;
    }
    /**
     * Retrieves value for `createdAt`
     * The date the contact record was created.
     */
    @JsonProperty("created_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAt() {
        return createdAt;
    }
    /**
     * Retrieves value for `dateOfBirth`
     * The contact's date of birth.
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
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getEmailAddress() {
        return emailAddress;
    }
    /**
     * Retrieves value for `firstName`
     * The contact's first name.
     */
    @JsonProperty("first_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getFirstName() {
        return firstName;
    }
    /**
     * Retrieves value for `id`
     * The contact's ID.
     */
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getId() {
        return id;
    }
    /**
     * Retrieves value for `lastName`
     * The contact's last name.
     */
    @JsonProperty("last_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getLastName() {
        return lastName;
    }
    /**
     * Retrieves value for `locale`
     * The contact's locale.
     */
    @JsonProperty("locale")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getLocale() {
        return locale;
    }
    /**
     * Retrieves value for `loginId`
     * The contact's Currencycloud login ID.
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
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPhoneNumber() {
        return phoneNumber;
    }
    /**
     * Retrieves value for `status`
     * Contact status - "enabled" allows the contact to conduct activity on the sub-account, "not_enabled" disables the contact.
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getStatus() {
        return status;
    }
    /**
     * Retrieves value for `timezone`
     * The contact's timezone.
     */
    @JsonProperty("timezone")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getTimezone() {
        return timezone;
    }
    /**
     * Retrieves value for `updatedAt`
     * The date the contact record was last updated.
     */
    @JsonProperty("updated_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAt() {
        return updatedAt;
    }
    /**
     * Retrieves value for `yourReference`
     * The user-generated reference code given to the contact.
     */
    @JsonProperty("your_reference")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getYourReference() {
        return yourReference;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof Contact && equalTo((Contact) other);
    }

    private boolean equalTo(Contact other) {
        return
            accountId.equals(other.accountId) &&

            accountName.equals(other.accountName) &&

            createdAt.equals(other.createdAt) &&

            dateOfBirth.equals(other.dateOfBirth) &&

            emailAddress.equals(other.emailAddress) &&

            firstName.equals(other.firstName) &&

            id.equals(other.id) &&

            lastName.equals(other.lastName) &&

            locale.equals(other.locale) &&

            loginId.equals(other.loginId) &&

            mobilePhoneNumber.equals(other.mobilePhoneNumber) &&

            phoneNumber.equals(other.phoneNumber) &&

            status.equals(other.status) &&

            timezone.equals(other.timezone) &&

            updatedAt.equals(other.updatedAt) &&

            yourReference.equals(other.yourReference)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountId,
                   this.accountName,
                   this.createdAt,
                   this.dateOfBirth,
                   this.emailAddress,
                   this.firstName,
                   this.id,
                   this.lastName,
                   this.locale,
                   this.loginId,
                   this.mobilePhoneNumber,
                   this.phoneNumber,
                   this.status,
                   this.timezone,
                   this.updatedAt,
                   this.yourReference
               );
    }

    @Override
    public String toString() {
        return "Contact{" +
               "accountId=" + accountId + ", " +
               "accountName=" + accountName + ", " +
               "createdAt=" + createdAt + ", " +
               "dateOfBirth=" + dateOfBirth + ", " +
               "emailAddress=" + emailAddress + ", " +
               "firstName=" + firstName + ", " +
               "id=" + id + ", " +
               "lastName=" + lastName + ", " +
               "locale=" + locale + ", " +
               "loginId=" + loginId + ", " +
               "mobilePhoneNumber=" + mobilePhoneNumber + ", " +
               "phoneNumber=" + phoneNumber + ", " +
               "status=" + status + ", " +
               "timezone=" + timezone + ", " +
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
         * The contact's account ID.
         */
        private Optional<String> accountId = Optional.empty();

        /**
         * The account name.
         */
        private Optional<String> accountName = Optional.empty();

        /**
         * The date the contact record was created.
         */
        private Optional<String> createdAt = Optional.empty();

        /**
         * The contact's date of birth.
         */
        private Optional<String> dateOfBirth = Optional.empty();

        /**
         * The contact's email address.
         */
        private Optional<String> emailAddress = Optional.empty();

        /**
         * The contact's first name.
         */
        private Optional<String> firstName = Optional.empty();

        /**
         * The contact's ID.
         */
        private Optional<String> id = Optional.empty();

        /**
         * The contact's last name.
         */
        private Optional<String> lastName = Optional.empty();

        /**
         * The contact's locale.
         */
        private Optional<String> locale = Optional.empty();

        /**
         * The contact's Currencycloud login ID.
         */
        private Optional<String> loginId = Optional.empty();

        /**
         * The contact's mobile phone number.
         */
        private Optional<String> mobilePhoneNumber = Optional.empty();

        /**
         * The contact's phone number.
         */
        private Optional<String> phoneNumber = Optional.empty();

        /**
         * Contact status - "enabled" allows the contact to conduct activity on the sub-account, "not_enabled" disables the contact.
         */
        private Optional<String> status = Optional.empty();

        /**
         * The contact's timezone.
         */
        private Optional<String> timezone = Optional.empty();

        /**
         * The date the contact record was last updated.
         */
        private Optional<String> updatedAt = Optional.empty();

        /**
         * The user-generated reference code given to the contact.
         */
        private Optional<String> yourReference = Optional.empty();


        private Builder() {}

        public Builder from(Contact other) {
            accountId(other.getAccountId());
            accountName(other.getAccountName());
            createdAt(other.getCreatedAt());
            dateOfBirth(other.getDateOfBirth());
            emailAddress(other.getEmailAddress());
            firstName(other.getFirstName());
            id(other.getId());
            lastName(other.getLastName());
            locale(other.getLocale());
            loginId(other.getLoginId());
            mobilePhoneNumber(other.getMobilePhoneNumber());
            phoneNumber(other.getPhoneNumber());
            status(other.getStatus());
            timezone(other.getTimezone());
            updatedAt(other.getUpdatedAt());
            yourReference(other.getYourReference());
            return this;
        }

        /**
         * Sets value for `accountId`
         * The contact's account ID.
         */
        @JsonSetter("account_id")
        public Builder accountId(Optional<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Sets value for `accountId`
         * The contact's account ID.
         */
        public Builder accountId(String accountId) {
            return this.accountId(Optional.ofNullable(accountId));
        }
        /**
         * Sets value for `accountName`
         * The account name.
         */
        @JsonSetter("account_name")
        public Builder accountName(Optional<String> accountName) {
            this.accountName = accountName;
            return this;
        }

        /**
         * Sets value for `accountName`
         * The account name.
         */
        public Builder accountName(String accountName) {
            return this.accountName(Optional.ofNullable(accountName));
        }
        /**
         * Sets value for `createdAt`
         * The date the contact record was created.
         */
        @JsonSetter("created_at")
        public Builder createdAt(Optional<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Sets value for `createdAt`
         * The date the contact record was created.
         */
        public Builder createdAt(String createdAt) {
            return this.createdAt(Optional.ofNullable(createdAt));
        }
        /**
         * Sets value for `dateOfBirth`
         * The contact's date of birth.
         */
        @JsonSetter("date_of_birth")
        public Builder dateOfBirth(Optional<String> dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        /**
         * Sets value for `dateOfBirth`
         * The contact's date of birth.
         */
        public Builder dateOfBirth(String dateOfBirth) {
            return this.dateOfBirth(Optional.ofNullable(dateOfBirth));
        }
        /**
         * Sets value for `emailAddress`
         * The contact's email address.
         */
        @JsonSetter("email_address")
        public Builder emailAddress(Optional<String> emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * Sets value for `emailAddress`
         * The contact's email address.
         */
        public Builder emailAddress(String emailAddress) {
            return this.emailAddress(Optional.ofNullable(emailAddress));
        }
        /**
         * Sets value for `firstName`
         * The contact's first name.
         */
        @JsonSetter("first_name")
        public Builder firstName(Optional<String> firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * Sets value for `firstName`
         * The contact's first name.
         */
        public Builder firstName(String firstName) {
            return this.firstName(Optional.ofNullable(firstName));
        }
        /**
         * Sets value for `id`
         * The contact's ID.
         */
        @JsonSetter("id")
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        /**
         * Sets value for `id`
         * The contact's ID.
         */
        public Builder id(String id) {
            return this.id(Optional.ofNullable(id));
        }
        /**
         * Sets value for `lastName`
         * The contact's last name.
         */
        @JsonSetter("last_name")
        public Builder lastName(Optional<String> lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Sets value for `lastName`
         * The contact's last name.
         */
        public Builder lastName(String lastName) {
            return this.lastName(Optional.ofNullable(lastName));
        }
        /**
         * Sets value for `locale`
         * The contact's locale.
         */
        @JsonSetter("locale")
        public Builder locale(Optional<String> locale) {
            this.locale = locale;
            return this;
        }

        /**
         * Sets value for `locale`
         * The contact's locale.
         */
        public Builder locale(String locale) {
            return this.locale(Optional.ofNullable(locale));
        }
        /**
         * Sets value for `loginId`
         * The contact's Currencycloud login ID.
         */
        @JsonSetter("login_id")
        public Builder loginId(Optional<String> loginId) {
            this.loginId = loginId;
            return this;
        }

        /**
         * Sets value for `loginId`
         * The contact's Currencycloud login ID.
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
        public Builder phoneNumber(Optional<String> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * Sets value for `phoneNumber`
         * The contact's phone number.
         */
        public Builder phoneNumber(String phoneNumber) {
            return this.phoneNumber(Optional.ofNullable(phoneNumber));
        }
        /**
         * Sets value for `status`
         * Contact status - "enabled" allows the contact to conduct activity on the sub-account, "not_enabled" disables the contact.
         */
        @JsonSetter("status")
        public Builder status(Optional<String> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets value for `status`
         * Contact status - "enabled" allows the contact to conduct activity on the sub-account, "not_enabled" disables the contact.
         */
        public Builder status(String status) {
            return this.status(Optional.ofNullable(status));
        }
        /**
         * Sets value for `timezone`
         * The contact's timezone.
         */
        @JsonSetter("timezone")
        public Builder timezone(Optional<String> timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * Sets value for `timezone`
         * The contact's timezone.
         */
        public Builder timezone(String timezone) {
            return this.timezone(Optional.ofNullable(timezone));
        }
        /**
         * Sets value for `updatedAt`
         * The date the contact record was last updated.
         */
        @JsonSetter("updated_at")
        public Builder updatedAt(Optional<String> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Sets value for `updatedAt`
         * The date the contact record was last updated.
         */
        public Builder updatedAt(String updatedAt) {
            return this.updatedAt(Optional.ofNullable(updatedAt));
        }
        /**
         * Sets value for `yourReference`
         * The user-generated reference code given to the contact.
         */
        @JsonSetter("your_reference")
        public Builder yourReference(Optional<String> yourReference) {
            this.yourReference = yourReference;
            return this;
        }

        /**
         * Sets value for `yourReference`
         * The user-generated reference code given to the contact.
         */
        public Builder yourReference(String yourReference) {
            return this.yourReference(Optional.ofNullable(yourReference));
        }



        public Contact build() {
            return new Contact(this);
        }
    }

}



