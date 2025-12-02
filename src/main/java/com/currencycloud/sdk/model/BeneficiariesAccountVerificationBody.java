
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * BeneficiariesAccountVerificationBody
 */
@JsonDeserialize(builder = BeneficiariesAccountVerificationBody.Builder.class)
public final class BeneficiariesAccountVerificationBody {
    /**
     * Bank account number.
     */
    private final String accountNumber;

    /**
     * Two-letter code for the country in which the beneficiary's bank account is held.
     */
    private final String bankCountry;

    /**
     * Required if "beneficiary_entity_type" is "company".
     */
    private final Optional<String> beneficiaryCompanyName;

    /**
     * Legal entity - 'individual' or 'company'. If 'individual' then "beneficiary_first_name" and "beneficiary_last_name" are required. If 'company' then "beneficiary_company_name" is required.
     */
    private final BeneficiariesAccountVerificationBodyBeneficiaryEntityTypeEnum beneficiaryEntityType;

    /**
     * Required if "beneficiary_entity_type" is "individual".
     */
    private final Optional<String> beneficiaryFirstName;

    /**
     * Required if "beneficiary_entity_type" is "individual".
     */
    private final Optional<String> beneficiaryLastName;

    /**
     * BIC/Swift code
     */
    private final Optional<String> bicSwift;

    /**
     * Currency in which money will be sent to the beneficiary's bank account. Three-digit currency code.
     */
    private final Optional<String> currency;

    /**
     * IBAN code
     */
    private final Optional<String> iban;

    /**
     * Currencycloud supports two types of payments: "priority", made using the Swift network and "regular", made using the local bank network.
     */
    private final Optional<BeneficiariesAccountVerificationBodyPaymentTypeEnum> paymentType;

    /**
     * Local payment routing system. Defaults to 'sort_code'.
     */
    private final Optional<String> routingCodeType1;

    /**
     * Second local payment routing system. If supplied, routing_code_value_2 should also be supplied. Necessary for when more than one routing code is required.
     */
    private final Optional<String> routingCodeType2;

    /**
     * Routing system value i.e. the account's sort code.
     */
    private final String routingCodeValue1;

    /**
     * Routing code for routing_code_type_2. If supplied, routing_code_type_2 should also be supplied.
     */
    private final Optional<String> routingCodeValue2;

    /**
     * For customer accounts that are not uniquely addressable by a sort code and account number, but instead rely on their PSP to credit their account via SRD – i.e. using the reference field in the payment with a further unique identifier.
     */
    private final Optional<String> secondaryReferenceData;


    private BeneficiariesAccountVerificationBody(Builder builder) {
        this.accountNumber = builder.accountNumber;
        this.bankCountry = builder.bankCountry;
        this.beneficiaryCompanyName = builder.beneficiaryCompanyName;
        this.beneficiaryEntityType = builder.beneficiaryEntityType;
        this.beneficiaryFirstName = builder.beneficiaryFirstName;
        this.beneficiaryLastName = builder.beneficiaryLastName;
        this.bicSwift = builder.bicSwift;
        this.currency = builder.currency;
        this.iban = builder.iban;
        this.paymentType = builder.paymentType;
        this.routingCodeType1 = builder.routingCodeType1;
        this.routingCodeType2 = builder.routingCodeType2;
        this.routingCodeValue1 = builder.routingCodeValue1;
        this.routingCodeValue2 = builder.routingCodeValue2;
        this.secondaryReferenceData = builder.secondaryReferenceData;
    }

    /**
     * Retrieves value for `accountNumber`
     * Bank account number.
     */
    @JsonProperty("account_number")
    public String getAccountNumber() {
        return accountNumber;
    }
    /**
     * Retrieves value for `bankCountry`
     * Two-letter code for the country in which the beneficiary's bank account is held.
     */
    @JsonProperty("bank_country")
    public String getBankCountry() {
        return bankCountry;
    }
    /**
     * Retrieves value for `beneficiaryCompanyName`
     * Required if "beneficiary_entity_type" is "company".
     */
    @JsonProperty("beneficiary_company_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryCompanyName() {
        return beneficiaryCompanyName;
    }
    /**
     * Retrieves value for `beneficiaryEntityType`
     * Legal entity - 'individual' or 'company'. If 'individual' then "beneficiary_first_name" and "beneficiary_last_name" are required. If 'company' then "beneficiary_company_name" is required.
     */
    @JsonProperty("beneficiary_entity_type")
    public BeneficiariesAccountVerificationBodyBeneficiaryEntityTypeEnum getBeneficiaryEntityType() {
        return beneficiaryEntityType;
    }
    /**
     * Retrieves value for `beneficiaryFirstName`
     * Required if "beneficiary_entity_type" is "individual".
     */
    @JsonProperty("beneficiary_first_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryFirstName() {
        return beneficiaryFirstName;
    }
    /**
     * Retrieves value for `beneficiaryLastName`
     * Required if "beneficiary_entity_type" is "individual".
     */
    @JsonProperty("beneficiary_last_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryLastName() {
        return beneficiaryLastName;
    }
    /**
     * Retrieves value for `bicSwift`
     * BIC/Swift code
     */
    @JsonProperty("bic_swift")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBicSwift() {
        return bicSwift;
    }
    /**
     * Retrieves value for `currency`
     * Currency in which money will be sent to the beneficiary's bank account. Three-digit currency code.
     */
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `iban`
     * IBAN code
     */
    @JsonProperty("iban")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getIban() {
        return iban;
    }
    /**
     * Retrieves value for `paymentType`
     * Currencycloud supports two types of payments: "priority", made using the Swift network and "regular", made using the local bank network.
     */
    @JsonProperty("payment_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<BeneficiariesAccountVerificationBodyPaymentTypeEnum> getPaymentType() {
        return paymentType;
    }
    /**
     * Retrieves value for `routingCodeType1`
     * Local payment routing system. Defaults to 'sort_code'.
     */
    @JsonProperty("routing_code_type_1")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getRoutingCodeType1() {
        return routingCodeType1;
    }
    /**
     * Retrieves value for `routingCodeType2`
     * Second local payment routing system. If supplied, routing_code_value_2 should also be supplied. Necessary for when more than one routing code is required.
     */
    @JsonProperty("routing_code_type_2")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getRoutingCodeType2() {
        return routingCodeType2;
    }
    /**
     * Retrieves value for `routingCodeValue1`
     * Routing system value i.e. the account's sort code.
     */
    @JsonProperty("routing_code_value_1")
    public String getRoutingCodeValue1() {
        return routingCodeValue1;
    }
    /**
     * Retrieves value for `routingCodeValue2`
     * Routing code for routing_code_type_2. If supplied, routing_code_type_2 should also be supplied.
     */
    @JsonProperty("routing_code_value_2")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getRoutingCodeValue2() {
        return routingCodeValue2;
    }
    /**
     * Retrieves value for `secondaryReferenceData`
     * For customer accounts that are not uniquely addressable by a sort code and account number, but instead rely on their PSP to credit their account via SRD – i.e. using the reference field in the payment with a further unique identifier.
     */
    @JsonProperty("secondary_reference_data")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSecondaryReferenceData() {
        return secondaryReferenceData;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof BeneficiariesAccountVerificationBody &&
               equalTo((BeneficiariesAccountVerificationBody) other);
    }

    private boolean equalTo(BeneficiariesAccountVerificationBody other) {
        return
            accountNumber.equals(other.accountNumber) &&

            bankCountry.equals(other.bankCountry) &&

            beneficiaryCompanyName.equals(other.beneficiaryCompanyName) &&

            beneficiaryEntityType.equals(other.beneficiaryEntityType) &&

            beneficiaryFirstName.equals(other.beneficiaryFirstName) &&

            beneficiaryLastName.equals(other.beneficiaryLastName) &&

            bicSwift.equals(other.bicSwift) &&

            currency.equals(other.currency) &&

            iban.equals(other.iban) &&

            paymentType.equals(other.paymentType) &&

            routingCodeType1.equals(other.routingCodeType1) &&

            routingCodeType2.equals(other.routingCodeType2) &&

            routingCodeValue1.equals(other.routingCodeValue1) &&

            routingCodeValue2.equals(other.routingCodeValue2) &&

            secondaryReferenceData.equals(other.secondaryReferenceData)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountNumber,
                   this.bankCountry,
                   this.beneficiaryCompanyName,
                   this.beneficiaryEntityType,
                   this.beneficiaryFirstName,
                   this.beneficiaryLastName,
                   this.bicSwift,
                   this.currency,
                   this.iban,
                   this.paymentType,
                   this.routingCodeType1,
                   this.routingCodeType2,
                   this.routingCodeValue1,
                   this.routingCodeValue2,
                   this.secondaryReferenceData
               );
    }

    @Override
    public String toString() {
        return "BeneficiariesAccountVerificationBody{" +
               "accountNumber=" + accountNumber + ", " +
               "bankCountry=" + bankCountry + ", " +
               "beneficiaryCompanyName=" + beneficiaryCompanyName + ", " +
               "beneficiaryEntityType=" + beneficiaryEntityType + ", " +
               "beneficiaryFirstName=" + beneficiaryFirstName + ", " +
               "beneficiaryLastName=" + beneficiaryLastName + ", " +
               "bicSwift=" + bicSwift + ", " +
               "currency=" + currency + ", " +
               "iban=" + iban + ", " +
               "paymentType=" + paymentType + ", " +
               "routingCodeType1=" + routingCodeType1 + ", " +
               "routingCodeType2=" + routingCodeType2 + ", " +
               "routingCodeValue1=" + routingCodeValue1 + ", " +
               "routingCodeValue2=" + routingCodeValue2 + ", " +
               "secondaryReferenceData=" + secondaryReferenceData +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Bank account number.
         */
        private String accountNumber = null;

        /**
         * Two-letter code for the country in which the beneficiary's bank account is held.
         */
        private String bankCountry = null;

        /**
         * Required if "beneficiary_entity_type" is "company".
         */
        private Optional<String> beneficiaryCompanyName = Optional.empty();

        /**
         * Legal entity - 'individual' or 'company'. If 'individual' then "beneficiary_first_name" and "beneficiary_last_name" are required. If 'company' then "beneficiary_company_name" is required.
         */
        private BeneficiariesAccountVerificationBodyBeneficiaryEntityTypeEnum beneficiaryEntityType = null;

        /**
         * Required if "beneficiary_entity_type" is "individual".
         */
        private Optional<String> beneficiaryFirstName = Optional.empty();

        /**
         * Required if "beneficiary_entity_type" is "individual".
         */
        private Optional<String> beneficiaryLastName = Optional.empty();

        /**
         * BIC/Swift code
         */
        private Optional<String> bicSwift = Optional.empty();

        /**
         * Currency in which money will be sent to the beneficiary's bank account. Three-digit currency code.
         */
        private Optional<String> currency = Optional.empty();

        /**
         * IBAN code
         */
        private Optional<String> iban = Optional.empty();

        /**
         * Currencycloud supports two types of payments: "priority", made using the Swift network and "regular", made using the local bank network.
         */
        private Optional<BeneficiariesAccountVerificationBodyPaymentTypeEnum> paymentType =
            Optional.empty();

        /**
         * Local payment routing system. Defaults to 'sort_code'.
         */
        private Optional<String> routingCodeType1 = Optional.empty();

        /**
         * Second local payment routing system. If supplied, routing_code_value_2 should also be supplied. Necessary for when more than one routing code is required.
         */
        private Optional<String> routingCodeType2 = Optional.empty();

        /**
         * Routing system value i.e. the account's sort code.
         */
        private String routingCodeValue1 = null;

        /**
         * Routing code for routing_code_type_2. If supplied, routing_code_type_2 should also be supplied.
         */
        private Optional<String> routingCodeValue2 = Optional.empty();

        /**
         * For customer accounts that are not uniquely addressable by a sort code and account number, but instead rely on their PSP to credit their account via SRD – i.e. using the reference field in the payment with a further unique identifier.
         */
        private Optional<String> secondaryReferenceData = Optional.empty();


        private Builder() {}

        public Builder from(BeneficiariesAccountVerificationBody other) {
            accountNumber(other.getAccountNumber());
            bankCountry(other.getBankCountry());
            beneficiaryCompanyName(other.getBeneficiaryCompanyName());
            beneficiaryEntityType(other.getBeneficiaryEntityType());
            beneficiaryFirstName(other.getBeneficiaryFirstName());
            beneficiaryLastName(other.getBeneficiaryLastName());
            bicSwift(other.getBicSwift());
            currency(other.getCurrency());
            iban(other.getIban());
            paymentType(other.getPaymentType());
            routingCodeType1(other.getRoutingCodeType1());
            routingCodeType2(other.getRoutingCodeType2());
            routingCodeValue1(other.getRoutingCodeValue1());
            routingCodeValue2(other.getRoutingCodeValue2());
            secondaryReferenceData(other.getSecondaryReferenceData());
            return this;
        }

        /**
         * Sets value for `accountNumber`
         * Bank account number.
         */
        @JsonSetter("account_number")
        public Builder accountNumber(String accountNumber) {
            if (accountNumber == null) {
                throw new IllegalArgumentException("accountNumber cannot be null");
            }

            this.accountNumber = accountNumber;
            return this;
        }
        /**
         * Sets value for `bankCountry`
         * Two-letter code for the country in which the beneficiary's bank account is held.
         */
        @JsonSetter("bank_country")
        public Builder bankCountry(String bankCountry) {
            if (bankCountry == null) {
                throw new IllegalArgumentException("bankCountry cannot be null");
            }

            this.bankCountry = bankCountry;
            return this;
        }
        /**
         * Sets value for `beneficiaryCompanyName`
         * Required if "beneficiary_entity_type" is "company".
         */
        @JsonSetter("beneficiary_company_name")
        public Builder beneficiaryCompanyName(Optional<String> beneficiaryCompanyName) {
            this.beneficiaryCompanyName = beneficiaryCompanyName;
            return this;
        }

        /**
         * Sets value for `beneficiaryCompanyName`
         * Required if "beneficiary_entity_type" is "company".
         */
        public Builder beneficiaryCompanyName(String beneficiaryCompanyName) {
            return this.beneficiaryCompanyName(Optional.ofNullable(beneficiaryCompanyName));
        }
        /**
         * Sets value for `beneficiaryEntityType`
         * Legal entity - 'individual' or 'company'. If 'individual' then "beneficiary_first_name" and "beneficiary_last_name" are required. If 'company' then "beneficiary_company_name" is required.
         */
        @JsonSetter("beneficiary_entity_type")
        public Builder beneficiaryEntityType(BeneficiariesAccountVerificationBodyBeneficiaryEntityTypeEnum
                                             beneficiaryEntityType) {
            if (beneficiaryEntityType == null) {
                throw new IllegalArgumentException("beneficiaryEntityType cannot be null");
            }

            this.beneficiaryEntityType = beneficiaryEntityType;
            return this;
        }
        /**
         * Sets value for `beneficiaryFirstName`
         * Required if "beneficiary_entity_type" is "individual".
         */
        @JsonSetter("beneficiary_first_name")
        public Builder beneficiaryFirstName(Optional<String> beneficiaryFirstName) {
            this.beneficiaryFirstName = beneficiaryFirstName;
            return this;
        }

        /**
         * Sets value for `beneficiaryFirstName`
         * Required if "beneficiary_entity_type" is "individual".
         */
        public Builder beneficiaryFirstName(String beneficiaryFirstName) {
            return this.beneficiaryFirstName(Optional.ofNullable(beneficiaryFirstName));
        }
        /**
         * Sets value for `beneficiaryLastName`
         * Required if "beneficiary_entity_type" is "individual".
         */
        @JsonSetter("beneficiary_last_name")
        public Builder beneficiaryLastName(Optional<String> beneficiaryLastName) {
            this.beneficiaryLastName = beneficiaryLastName;
            return this;
        }

        /**
         * Sets value for `beneficiaryLastName`
         * Required if "beneficiary_entity_type" is "individual".
         */
        public Builder beneficiaryLastName(String beneficiaryLastName) {
            return this.beneficiaryLastName(Optional.ofNullable(beneficiaryLastName));
        }
        /**
         * Sets value for `bicSwift`
         * BIC/Swift code
         */
        @JsonSetter("bic_swift")
        public Builder bicSwift(Optional<String> bicSwift) {
            this.bicSwift = bicSwift;
            return this;
        }

        /**
         * Sets value for `bicSwift`
         * BIC/Swift code
         */
        public Builder bicSwift(String bicSwift) {
            return this.bicSwift(Optional.ofNullable(bicSwift));
        }
        /**
         * Sets value for `currency`
         * Currency in which money will be sent to the beneficiary's bank account. Three-digit currency code.
         */
        @JsonSetter("currency")
        public Builder currency(Optional<String> currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Sets value for `currency`
         * Currency in which money will be sent to the beneficiary's bank account. Three-digit currency code.
         */
        public Builder currency(String currency) {
            return this.currency(Optional.ofNullable(currency));
        }
        /**
         * Sets value for `iban`
         * IBAN code
         */
        @JsonSetter("iban")
        public Builder iban(Optional<String> iban) {
            this.iban = iban;
            return this;
        }

        /**
         * Sets value for `iban`
         * IBAN code
         */
        public Builder iban(String iban) {
            return this.iban(Optional.ofNullable(iban));
        }
        /**
         * Sets value for `paymentType`
         * Currencycloud supports two types of payments: "priority", made using the Swift network and "regular", made using the local bank network.
         */
        @JsonSetter("payment_type")
        public Builder paymentType(Optional<BeneficiariesAccountVerificationBodyPaymentTypeEnum>
                                   paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Sets value for `paymentType`
         * Currencycloud supports two types of payments: "priority", made using the Swift network and "regular", made using the local bank network.
         */
        public Builder paymentType(BeneficiariesAccountVerificationBodyPaymentTypeEnum paymentType) {
            return this.paymentType(Optional.ofNullable(paymentType));
        }
        /**
         * Sets value for `routingCodeType1`
         * Local payment routing system. Defaults to 'sort_code'.
         */
        @JsonSetter("routing_code_type_1")
        public Builder routingCodeType1(Optional<String> routingCodeType1) {
            this.routingCodeType1 = routingCodeType1;
            return this;
        }

        /**
         * Sets value for `routingCodeType1`
         * Local payment routing system. Defaults to 'sort_code'.
         */
        public Builder routingCodeType1(String routingCodeType1) {
            return this.routingCodeType1(Optional.ofNullable(routingCodeType1));
        }
        /**
         * Sets value for `routingCodeType2`
         * Second local payment routing system. If supplied, routing_code_value_2 should also be supplied. Necessary for when more than one routing code is required.
         */
        @JsonSetter("routing_code_type_2")
        public Builder routingCodeType2(Optional<String> routingCodeType2) {
            this.routingCodeType2 = routingCodeType2;
            return this;
        }

        /**
         * Sets value for `routingCodeType2`
         * Second local payment routing system. If supplied, routing_code_value_2 should also be supplied. Necessary for when more than one routing code is required.
         */
        public Builder routingCodeType2(String routingCodeType2) {
            return this.routingCodeType2(Optional.ofNullable(routingCodeType2));
        }
        /**
         * Sets value for `routingCodeValue1`
         * Routing system value i.e. the account's sort code.
         */
        @JsonSetter("routing_code_value_1")
        public Builder routingCodeValue1(String routingCodeValue1) {
            if (routingCodeValue1 == null) {
                throw new IllegalArgumentException("routingCodeValue1 cannot be null");
            }

            this.routingCodeValue1 = routingCodeValue1;
            return this;
        }
        /**
         * Sets value for `routingCodeValue2`
         * Routing code for routing_code_type_2. If supplied, routing_code_type_2 should also be supplied.
         */
        @JsonSetter("routing_code_value_2")
        public Builder routingCodeValue2(Optional<String> routingCodeValue2) {
            this.routingCodeValue2 = routingCodeValue2;
            return this;
        }

        /**
         * Sets value for `routingCodeValue2`
         * Routing code for routing_code_type_2. If supplied, routing_code_type_2 should also be supplied.
         */
        public Builder routingCodeValue2(String routingCodeValue2) {
            return this.routingCodeValue2(Optional.ofNullable(routingCodeValue2));
        }
        /**
         * Sets value for `secondaryReferenceData`
         * For customer accounts that are not uniquely addressable by a sort code and account number, but instead rely on their PSP to credit their account via SRD – i.e. using the reference field in the payment with a further unique identifier.
         */
        @JsonSetter("secondary_reference_data")
        public Builder secondaryReferenceData(Optional<String> secondaryReferenceData) {
            this.secondaryReferenceData = secondaryReferenceData;
            return this;
        }

        /**
         * Sets value for `secondaryReferenceData`
         * For customer accounts that are not uniquely addressable by a sort code and account number, but instead rely on their PSP to credit their account via SRD – i.e. using the reference field in the payment with a further unique identifier.
         */
        public Builder secondaryReferenceData(String secondaryReferenceData) {
            return this.secondaryReferenceData(Optional.ofNullable(secondaryReferenceData));
        }



        public BeneficiariesAccountVerificationBody build() {
            if (accountNumber == null) {
                throw new IllegalStateException("accountNumber is required");
            }

            if (bankCountry == null) {
                throw new IllegalStateException("bankCountry is required");
            }

            if (beneficiaryEntityType == null) {
                throw new IllegalStateException("beneficiaryEntityType is required");
            }

            if (routingCodeValue1 == null) {
                throw new IllegalStateException("routingCodeValue1 is required");
            }

            return new BeneficiariesAccountVerificationBody(this);
        }
    }

}



