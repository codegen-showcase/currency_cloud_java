
package com.currencycloud.sdk.resources.contacts.params;

import java.util.Objects;
import java.util.Optional;

import com.currencycloud.sdk.model.ContactsFindBodyOrderAscDescEnum;
import com.currencycloud.sdk.model.ContactsFindBodyStatusEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * FindRequest
 */
@JsonDeserialize(builder = FindRequest.Builder.class)
public final class FindRequest {
    /**
     * Sub-Account UUID
     */
    private final Optional<String> accountId;

    /**
     * Account name
     */
    private final Optional<String> accountName;

    /**
     * The contact's email address.
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
     * Any field name to change the sort order.
     */
    private final Optional<String> order;

    /**
     * Sort records in ascending or descending order.
     */
    private final Optional<ContactsFindBodyOrderAscDescEnum> orderAscDesc;

    /**
     * Page number
     */
    private final Optional<String> page;

    /**
     * Number of results per page.
     */
    private final Optional<String> perPage;

    /**
     * The contact's phone number.
     */
    private final Optional<String> phoneNumber;

    /**
     * Contact status - "enabled" allows the contact to conduct activity on the sub-account, "not_enabled" disables the contact.
     */
    private final Optional<ContactsFindBodyStatusEnum> status;

    /**
     * Timezone ("Europe/London", "America/New_York").
     */
    private final Optional<String> timezone;

    /**
     * User-generated reference code.
     */
    private final Optional<String> yourReference;


    private FindRequest(Builder builder) {
        this.accountId = builder.accountId;
        this.accountName = builder.accountName;
        this.emailAddress = builder.emailAddress;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.locale = builder.locale;
        this.loginId = builder.loginId;
        this.order = builder.order;
        this.orderAscDesc = builder.orderAscDesc;
        this.page = builder.page;
        this.perPage = builder.perPage;
        this.phoneNumber = builder.phoneNumber;
        this.status = builder.status;
        this.timezone = builder.timezone;
        this.yourReference = builder.yourReference;
    }

    /**
     * Retrieves value for `accountId`
     * Sub-Account UUID
     */
    @JsonProperty("account_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAccountId() {
        return accountId;
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
     * Retrieves value for `order`
     * Any field name to change the sort order.
     */
    @JsonProperty("order")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getOrder() {
        return order;
    }
    /**
     * Retrieves value for `orderAscDesc`
     * Sort records in ascending or descending order.
     */
    @JsonProperty("order_asc_desc")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ContactsFindBodyOrderAscDescEnum> getOrderAscDesc() {
        return orderAscDesc;
    }
    /**
     * Retrieves value for `page`
     * Page number
     */
    @JsonProperty("page")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPage() {
        return page;
    }
    /**
     * Retrieves value for `perPage`
     * Number of results per page.
     */
    @JsonProperty("per_page")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPerPage() {
        return perPage;
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
    public Optional<ContactsFindBodyStatusEnum> getStatus() {
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

        return other instanceof FindRequest && equalTo((FindRequest) other);
    }

    private boolean equalTo(FindRequest other) {
        return
            accountId.equals(other.accountId) &&

            accountName.equals(other.accountName) &&

            emailAddress.equals(other.emailAddress) &&

            firstName.equals(other.firstName) &&

            lastName.equals(other.lastName) &&

            locale.equals(other.locale) &&

            loginId.equals(other.loginId) &&

            order.equals(other.order) &&

            orderAscDesc.equals(other.orderAscDesc) &&

            page.equals(other.page) &&

            perPage.equals(other.perPage) &&

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
                   this.accountName,
                   this.emailAddress,
                   this.firstName,
                   this.lastName,
                   this.locale,
                   this.loginId,
                   this.order,
                   this.orderAscDesc,
                   this.page,
                   this.perPage,
                   this.phoneNumber,
                   this.status,
                   this.timezone,
                   this.yourReference
               );
    }

    @Override
    public String toString() {
        return "FindRequest{" +
               "accountId=" + accountId + ", " +
               "accountName=" + accountName + ", " +
               "emailAddress=" + emailAddress + ", " +
               "firstName=" + firstName + ", " +
               "lastName=" + lastName + ", " +
               "locale=" + locale + ", " +
               "loginId=" + loginId + ", " +
               "order=" + order + ", " +
               "orderAscDesc=" + orderAscDesc + ", " +
               "page=" + page + ", " +
               "perPage=" + perPage + ", " +
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
         * Sub-Account UUID
         */
        private Optional<String> accountId = Optional.empty();

        /**
         * Account name
         */
        private Optional<String> accountName = Optional.empty();

        /**
         * The contact's email address.
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
         * Any field name to change the sort order.
         */
        private Optional<String> order = Optional.empty();

        /**
         * Sort records in ascending or descending order.
         */
        private Optional<ContactsFindBodyOrderAscDescEnum> orderAscDesc = Optional.empty();

        /**
         * Page number
         */
        private Optional<String> page = Optional.empty();

        /**
         * Number of results per page.
         */
        private Optional<String> perPage = Optional.empty();

        /**
         * The contact's phone number.
         */
        private Optional<String> phoneNumber = Optional.empty();

        /**
         * Contact status - "enabled" allows the contact to conduct activity on the sub-account, "not_enabled" disables the contact.
         */
        private Optional<ContactsFindBodyStatusEnum> status = Optional.empty();

        /**
         * Timezone ("Europe/London", "America/New_York").
         */
        private Optional<String> timezone = Optional.empty();

        /**
         * User-generated reference code.
         */
        private Optional<String> yourReference = Optional.empty();


        private Builder() {}

        public Builder from(FindRequest other) {
            accountId(other.getAccountId());
            accountName(other.getAccountName());
            emailAddress(other.getEmailAddress());
            firstName(other.getFirstName());
            lastName(other.getLastName());
            locale(other.getLocale());
            loginId(other.getLoginId());
            order(other.getOrder());
            orderAscDesc(other.getOrderAscDesc());
            page(other.getPage());
            perPage(other.getPerPage());
            phoneNumber(other.getPhoneNumber());
            status(other.getStatus());
            timezone(other.getTimezone());
            yourReference(other.getYourReference());
            return this;
        }

        /**
         * Sets value for `accountId`
         * Sub-Account UUID
         */
        @JsonSetter("account_id")
        public Builder accountId(Optional<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Sets value for `accountId`
         * Sub-Account UUID
         */
        public Builder accountId(String accountId) {
            return this.accountId(Optional.ofNullable(accountId));
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
         * Sets value for `order`
         * Any field name to change the sort order.
         */
        @JsonSetter("order")
        public Builder order(Optional<String> order) {
            this.order = order;
            return this;
        }

        /**
         * Sets value for `order`
         * Any field name to change the sort order.
         */
        public Builder order(String order) {
            return this.order(Optional.ofNullable(order));
        }
        /**
         * Sets value for `orderAscDesc`
         * Sort records in ascending or descending order.
         */
        @JsonSetter("order_asc_desc")
        public Builder orderAscDesc(Optional<ContactsFindBodyOrderAscDescEnum> orderAscDesc) {
            this.orderAscDesc = orderAscDesc;
            return this;
        }

        /**
         * Sets value for `orderAscDesc`
         * Sort records in ascending or descending order.
         */
        public Builder orderAscDesc(ContactsFindBodyOrderAscDescEnum orderAscDesc) {
            return this.orderAscDesc(Optional.ofNullable(orderAscDesc));
        }
        /**
         * Sets value for `page`
         * Page number
         */
        @JsonSetter("page")
        public Builder page(Optional<String> page) {
            this.page = page;
            return this;
        }

        /**
         * Sets value for `page`
         * Page number
         */
        public Builder page(String page) {
            return this.page(Optional.ofNullable(page));
        }
        /**
         * Sets value for `perPage`
         * Number of results per page.
         */
        @JsonSetter("per_page")
        public Builder perPage(Optional<String> perPage) {
            this.perPage = perPage;
            return this;
        }

        /**
         * Sets value for `perPage`
         * Number of results per page.
         */
        public Builder perPage(String perPage) {
            return this.perPage(Optional.ofNullable(perPage));
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
        public Builder status(Optional<ContactsFindBodyStatusEnum> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets value for `status`
         * Contact status - "enabled" allows the contact to conduct activity on the sub-account, "not_enabled" disables the contact.
         */
        public Builder status(ContactsFindBodyStatusEnum status) {
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



        public FindRequest build() {
            return new FindRequest(this);
        }
    }

}



