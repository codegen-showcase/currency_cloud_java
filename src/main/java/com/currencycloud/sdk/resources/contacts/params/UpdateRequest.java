
package com.currencycloud.sdk.resources.contacts.params;

import java.util.Objects;
import java.util.Optional;

import com.currencycloud.sdk.model.ContactsUpdateStatusEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * UpdateRequest
 */
@JsonDeserialize(builder = UpdateRequest.Builder.class)
public final class UpdateRequest {
    /**
     * Contact UUID
     */
    private final String id;

    /**
     * Contact's date of birth. ISO 8601 format YYYY-MM-DD. Required if account type is individual.
     */
    private final Optional<String> dateOfBirth;

    /**
     * The contact's email address. A request to update a contact's email address does not immediately update the value. Instead, an email change request flow is initiated, sending notifications to both the old and new email addresses. The value will be updated when the change is confirmed via a link sent to the new email address.
     */
    private final Optional<String> emailAddress;

    /**
     * The contact's first name.
     */
    private final Optional<String> firstName;

    /**
     * The contact's last name.
     */
    private final Optional<String> lastName;

    /**
     * Locale code ("en", "en-US", "fr-FR").
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
    private final Optional<ContactsUpdateStatusEnum> status;

    /**
     * Timezone ("Europe/London", "America/New_York").
     */
    private final Optional<String> timezone;

    /**
     * User-generated reference code.
     */
    private final Optional<String> yourReference;


    private UpdateRequest(Builder builder) {
        this.id = builder.id;
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
     * Retrieves value for `id`
     * Contact UUID
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }
    /**
     * Retrieves value for `dateOfBirth`
     * Contact's date of birth. ISO 8601 format YYYY-MM-DD. Required if account type is individual.
     */
    @JsonProperty("date_of_birth")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getDateOfBirth() {
        return dateOfBirth;
    }
    /**
     * Retrieves value for `emailAddress`
     * The contact's email address. A request to update a contact's email address does not immediately update the value. Instead, an email change request flow is initiated, sending notifications to both the old and new email addresses. The value will be updated when the change is confirmed via a link sent to the new email address.
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
     * Locale code ("en", "en-US", "fr-FR").
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
    public Optional<ContactsUpdateStatusEnum> getStatus() {
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

        return other instanceof UpdateRequest && equalTo((UpdateRequest) other);
    }

    private boolean equalTo(UpdateRequest other) {
        return
            id.equals(other.id) &&

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
                   this.id,
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
        return "UpdateRequest{" +
               "id=" + id + ", " +
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
         * Contact UUID
         */
        private String id = null;

        /**
         * Contact's date of birth. ISO 8601 format YYYY-MM-DD. Required if account type is individual.
         */
        private Optional<String> dateOfBirth = Optional.empty();

        /**
         * The contact's email address. A request to update a contact's email address does not immediately update the value. Instead, an email change request flow is initiated, sending notifications to both the old and new email addresses. The value will be updated when the change is confirmed via a link sent to the new email address.
         */
        private Optional<String> emailAddress = Optional.empty();

        /**
         * The contact's first name.
         */
        private Optional<String> firstName = Optional.empty();

        /**
         * The contact's last name.
         */
        private Optional<String> lastName = Optional.empty();

        /**
         * Locale code ("en", "en-US", "fr-FR").
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
        private Optional<ContactsUpdateStatusEnum> status = Optional.empty();

        /**
         * Timezone ("Europe/London", "America/New_York").
         */
        private Optional<String> timezone = Optional.empty();

        /**
         * User-generated reference code.
         */
        private Optional<String> yourReference = Optional.empty();


        private Builder() {}

        public Builder from(UpdateRequest other) {
            id(other.getId());
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
         * Sets value for `id`
         * Contact UUID
         */
        @JsonSetter("id")
        public Builder id(String id) {
            if (id == null) {
                throw new IllegalArgumentException("id cannot be null");
            }

            this.id = id;
            return this;
        }
        /**
         * Sets value for `dateOfBirth`
         * Contact's date of birth. ISO 8601 format YYYY-MM-DD. Required if account type is individual.
         */
        @JsonSetter("date_of_birth")
        public Builder dateOfBirth(Optional<String> dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        /**
         * Sets value for `dateOfBirth`
         * Contact's date of birth. ISO 8601 format YYYY-MM-DD. Required if account type is individual.
         */
        public Builder dateOfBirth(String dateOfBirth) {
            return this.dateOfBirth(Optional.ofNullable(dateOfBirth));
        }
        /**
         * Sets value for `emailAddress`
         * The contact's email address. A request to update a contact's email address does not immediately update the value. Instead, an email change request flow is initiated, sending notifications to both the old and new email addresses. The value will be updated when the change is confirmed via a link sent to the new email address.
         */
        @JsonSetter("email_address")
        public Builder emailAddress(Optional<String> emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * Sets value for `emailAddress`
         * The contact's email address. A request to update a contact's email address does not immediately update the value. Instead, an email change request flow is initiated, sending notifications to both the old and new email addresses. The value will be updated when the change is confirmed via a link sent to the new email address.
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
        public Builder status(Optional<ContactsUpdateStatusEnum> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets value for `status`
         * Contact status - "enabled" allows the contact to conduct activity on the sub-account, "not_enabled" disables the contact.
         */
        public Builder status(ContactsUpdateStatusEnum status) {
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



        public UpdateRequest build() {
            if (id == null) {
                throw new IllegalStateException("id is required");
            }

            return new UpdateRequest(this);
        }
    }

}



