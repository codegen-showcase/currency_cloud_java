
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * AccountsFindBody
 */
@JsonDeserialize(builder = AccountsFindBody.Builder.class)
public final class AccountsFindBody {
    /**
     * Account name.
     */
    private final Optional<String> accountName;

    /**
     * Has the bank account been verified?
     */
    private final Optional<AccountsFindBodyBankAccountVerifiedEnum> bankAccountVerified;

    /**
     * The value of this field is used for white labeling the Currencycloud user interface.
     */
    private final Optional<String> brand;

    /**
     * City.
     */
    private final Optional<String> city;

    /**
     * Two-letter country code.
     */
    private final Optional<String> country;

    /**
     * Any field name to change the sort order.
     */
    private final Optional<String> order;

    /**
     * Sort records in ascending or descending order.
     */
    private final Optional<AccountsFindBodyOrderAscDescEnum> orderAscDesc;

    /**
     * Page number.
     */
    private final Optional<Long> page;

    /**
     * Number of results per page.
     */
    private final Optional<Long> perPage;

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
     * Account status.
     */
    private final Optional<AccountsFindBodyStatusEnum> status;

    /**
     * First line of address.
     */
    private final Optional<String> street;

    /**
     * User-generated reference code.
     */
    private final Optional<String> yourReference;


    private AccountsFindBody(Builder builder) {
        this.accountName = builder.accountName;
        this.bankAccountVerified = builder.bankAccountVerified;
        this.brand = builder.brand;
        this.city = builder.city;
        this.country = builder.country;
        this.order = builder.order;
        this.orderAscDesc = builder.orderAscDesc;
        this.page = builder.page;
        this.perPage = builder.perPage;
        this.postalCode = builder.postalCode;
        this.spreadTable = builder.spreadTable;
        this.stateOrProvince = builder.stateOrProvince;
        this.status = builder.status;
        this.street = builder.street;
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
     * Retrieves value for `bankAccountVerified`
     * Has the bank account been verified?
     */
    @JsonProperty("bank_account_verified")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<AccountsFindBodyBankAccountVerifiedEnum> getBankAccountVerified() {
        return bankAccountVerified;
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
     * City.
     */
    @JsonProperty("city")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCity() {
        return city;
    }
    /**
     * Retrieves value for `country`
     * Two-letter country code.
     */
    @JsonProperty("country")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCountry() {
        return country;
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
    public Optional<AccountsFindBodyOrderAscDescEnum> getOrderAscDesc() {
        return orderAscDesc;
    }
    /**
     * Retrieves value for `page`
     * Page number.
     */
    @JsonProperty("page")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Long> getPage() {
        return page;
    }
    /**
     * Retrieves value for `perPage`
     * Number of results per page.
     */
    @JsonProperty("per_page")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Long> getPerPage() {
        return perPage;
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
     * Account status.
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<AccountsFindBodyStatusEnum> getStatus() {
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

        return other instanceof AccountsFindBody && equalTo((AccountsFindBody) other);
    }

    private boolean equalTo(AccountsFindBody other) {
        return
            accountName.equals(other.accountName) &&

            bankAccountVerified.equals(other.bankAccountVerified) &&

            brand.equals(other.brand) &&

            city.equals(other.city) &&

            country.equals(other.country) &&

            order.equals(other.order) &&

            orderAscDesc.equals(other.orderAscDesc) &&

            page.equals(other.page) &&

            perPage.equals(other.perPage) &&

            postalCode.equals(other.postalCode) &&

            spreadTable.equals(other.spreadTable) &&

            stateOrProvince.equals(other.stateOrProvince) &&

            status.equals(other.status) &&

            street.equals(other.street) &&

            yourReference.equals(other.yourReference)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountName,
                   this.bankAccountVerified,
                   this.brand,
                   this.city,
                   this.country,
                   this.order,
                   this.orderAscDesc,
                   this.page,
                   this.perPage,
                   this.postalCode,
                   this.spreadTable,
                   this.stateOrProvince,
                   this.status,
                   this.street,
                   this.yourReference
               );
    }

    @Override
    public String toString() {
        return "AccountsFindBody{" +
               "accountName=" + accountName + ", " +
               "bankAccountVerified=" + bankAccountVerified + ", " +
               "brand=" + brand + ", " +
               "city=" + city + ", " +
               "country=" + country + ", " +
               "order=" + order + ", " +
               "orderAscDesc=" + orderAscDesc + ", " +
               "page=" + page + ", " +
               "perPage=" + perPage + ", " +
               "postalCode=" + postalCode + ", " +
               "spreadTable=" + spreadTable + ", " +
               "stateOrProvince=" + stateOrProvince + ", " +
               "status=" + status + ", " +
               "street=" + street + ", " +
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
         * Has the bank account been verified?
         */
        private Optional<AccountsFindBodyBankAccountVerifiedEnum> bankAccountVerified = Optional.empty();

        /**
         * The value of this field is used for white labeling the Currencycloud user interface.
         */
        private Optional<String> brand = Optional.empty();

        /**
         * City.
         */
        private Optional<String> city = Optional.empty();

        /**
         * Two-letter country code.
         */
        private Optional<String> country = Optional.empty();

        /**
         * Any field name to change the sort order.
         */
        private Optional<String> order = Optional.empty();

        /**
         * Sort records in ascending or descending order.
         */
        private Optional<AccountsFindBodyOrderAscDescEnum> orderAscDesc = Optional.empty();

        /**
         * Page number.
         */
        private Optional<Long> page = Optional.empty();

        /**
         * Number of results per page.
         */
        private Optional<Long> perPage = Optional.empty();

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
         * Account status.
         */
        private Optional<AccountsFindBodyStatusEnum> status = Optional.empty();

        /**
         * First line of address.
         */
        private Optional<String> street = Optional.empty();

        /**
         * User-generated reference code.
         */
        private Optional<String> yourReference = Optional.empty();


        private Builder() {}

        public Builder from(AccountsFindBody other) {
            accountName(other.getAccountName());
            bankAccountVerified(other.getBankAccountVerified());
            brand(other.getBrand());
            city(other.getCity());
            country(other.getCountry());
            order(other.getOrder());
            orderAscDesc(other.getOrderAscDesc());
            page(other.getPage());
            perPage(other.getPerPage());
            postalCode(other.getPostalCode());
            spreadTable(other.getSpreadTable());
            stateOrProvince(other.getStateOrProvince());
            status(other.getStatus());
            street(other.getStreet());
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
         * Sets value for `bankAccountVerified`
         * Has the bank account been verified?
         */
        @JsonSetter("bank_account_verified")
        public Builder bankAccountVerified(Optional<AccountsFindBodyBankAccountVerifiedEnum>
                                           bankAccountVerified) {
            this.bankAccountVerified = bankAccountVerified;
            return this;
        }

        /**
         * Sets value for `bankAccountVerified`
         * Has the bank account been verified?
         */
        public Builder bankAccountVerified(AccountsFindBodyBankAccountVerifiedEnum bankAccountVerified) {
            return this.bankAccountVerified(Optional.ofNullable(bankAccountVerified));
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
         * City.
         */
        @JsonSetter("city")
        public Builder city(Optional<String> city) {
            this.city = city;
            return this;
        }

        /**
         * Sets value for `city`
         * City.
         */
        public Builder city(String city) {
            return this.city(Optional.ofNullable(city));
        }
        /**
         * Sets value for `country`
         * Two-letter country code.
         */
        @JsonSetter("country")
        public Builder country(Optional<String> country) {
            this.country = country;
            return this;
        }

        /**
         * Sets value for `country`
         * Two-letter country code.
         */
        public Builder country(String country) {
            return this.country(Optional.ofNullable(country));
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
        public Builder orderAscDesc(Optional<AccountsFindBodyOrderAscDescEnum> orderAscDesc) {
            this.orderAscDesc = orderAscDesc;
            return this;
        }

        /**
         * Sets value for `orderAscDesc`
         * Sort records in ascending or descending order.
         */
        public Builder orderAscDesc(AccountsFindBodyOrderAscDescEnum orderAscDesc) {
            return this.orderAscDesc(Optional.ofNullable(orderAscDesc));
        }
        /**
         * Sets value for `page`
         * Page number.
         */
        @JsonSetter("page")
        public Builder page(Optional<Long> page) {
            this.page = page;
            return this;
        }

        /**
         * Sets value for `page`
         * Page number.
         */
        public Builder page(Long page) {
            return this.page(Optional.ofNullable(page));
        }
        /**
         * Sets value for `perPage`
         * Number of results per page.
         */
        @JsonSetter("per_page")
        public Builder perPage(Optional<Long> perPage) {
            this.perPage = perPage;
            return this;
        }

        /**
         * Sets value for `perPage`
         * Number of results per page.
         */
        public Builder perPage(Long perPage) {
            return this.perPage(Optional.ofNullable(perPage));
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
         * Account status.
         */
        @JsonSetter("status")
        public Builder status(Optional<AccountsFindBodyStatusEnum> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets value for `status`
         * Account status.
         */
        public Builder status(AccountsFindBodyStatusEnum status) {
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



        public AccountsFindBody build() {
            return new AccountsFindBody(this);
        }
    }

}



