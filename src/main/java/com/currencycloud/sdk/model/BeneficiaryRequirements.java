
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Beneficiary requirements.
 */
@JsonDeserialize(builder = BeneficiaryRequirements.Builder.class)
public final class BeneficiaryRequirements {
    /**
     * An ABA (American Bankers Association) routing number is required.
     */
    private final Optional<String> aba;

    /**
     * An account number is required.
     */
    private final Optional<String> acctNumber;

    /**
     * A bank code is required.
     */
    private final Optional<String> bankCode;

    /**
     * Beneficiary's address
     */
    private final Optional<String> beneficiaryAddress;

    /**
     * Beneficiary's city
     */
    private final Optional<String> beneficiaryCity;

    /**
     * Beneficiary's country
     */
    private final Optional<String> beneficiaryCountry;

    /**
     * Type of entity
     */
    private final Optional<BeneficiaryRequirementsBeneficiaryEntityTypeEnum> beneficiaryEntityType;

    /**
     * Beneficiary's first name
     */
    private final Optional<String> beneficiaryFirstName;

    /**
     * Beneficiary's last name
     */
    private final Optional<String> beneficiaryLastName;

    /**
     * Beneficiary's postcode
     */
    private final Optional<String> beneficiaryPostcode;

    /**
     * Beneficiary's state or province
     */
    private final Optional<String> beneficiaryStateOrProvince;

    /**
     * BIC / Swift code is required.
     */
    private final Optional<String> bicSwift;

    /**
     * A branch code is required.
     */
    private final Optional<String> branchCode;

    /**
     * A BSB (Bank State Branch) number is required.
     */
    private final Optional<String> bsbCode;

    /**
     * A CLABE (Clave Bancaria Estandarizada) code is required.
     */
    private final Optional<String> clabe;

    /**
     * A CNAPS (China National Advanced Payment System) code is required.
     */
    private final Optional<String> cnaps;

    /**
     * An institution number is required.
     */
    private final Optional<String> institutionNo;

    /**
     * The type of payment - 'priority' (Swift) or 'regular' (local).
     */
    private final Optional<BeneficiaryRequirementsPaymentTypeEnum> paymentType;

    /**
     * A sort code is required.
     */
    private final Optional<String> sortCode;


    private BeneficiaryRequirements(Builder builder) {
        this.aba = builder.aba;
        this.acctNumber = builder.acctNumber;
        this.bankCode = builder.bankCode;
        this.beneficiaryAddress = builder.beneficiaryAddress;
        this.beneficiaryCity = builder.beneficiaryCity;
        this.beneficiaryCountry = builder.beneficiaryCountry;
        this.beneficiaryEntityType = builder.beneficiaryEntityType;
        this.beneficiaryFirstName = builder.beneficiaryFirstName;
        this.beneficiaryLastName = builder.beneficiaryLastName;
        this.beneficiaryPostcode = builder.beneficiaryPostcode;
        this.beneficiaryStateOrProvince = builder.beneficiaryStateOrProvince;
        this.bicSwift = builder.bicSwift;
        this.branchCode = builder.branchCode;
        this.bsbCode = builder.bsbCode;
        this.clabe = builder.clabe;
        this.cnaps = builder.cnaps;
        this.institutionNo = builder.institutionNo;
        this.paymentType = builder.paymentType;
        this.sortCode = builder.sortCode;
    }

    /**
     * Retrieves value for `aba`
     * An ABA (American Bankers Association) routing number is required.
     */
    @JsonProperty("aba")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAba() {
        return aba;
    }
    /**
     * Retrieves value for `acctNumber`
     * An account number is required.
     */
    @JsonProperty("acct_number")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAcctNumber() {
        return acctNumber;
    }
    /**
     * Retrieves value for `bankCode`
     * A bank code is required.
     */
    @JsonProperty("bank_code")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBankCode() {
        return bankCode;
    }
    /**
     * Retrieves value for `beneficiaryAddress`
     * Beneficiary's address
     */
    @JsonProperty("beneficiary_address")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryAddress() {
        return beneficiaryAddress;
    }
    /**
     * Retrieves value for `beneficiaryCity`
     * Beneficiary's city
     */
    @JsonProperty("beneficiary_city")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryCity() {
        return beneficiaryCity;
    }
    /**
     * Retrieves value for `beneficiaryCountry`
     * Beneficiary's country
     */
    @JsonProperty("beneficiary_country")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryCountry() {
        return beneficiaryCountry;
    }
    /**
     * Retrieves value for `beneficiaryEntityType`
     * Type of entity
     */
    @JsonProperty("beneficiary_entity_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<BeneficiaryRequirementsBeneficiaryEntityTypeEnum> getBeneficiaryEntityType() {
        return beneficiaryEntityType;
    }
    /**
     * Retrieves value for `beneficiaryFirstName`
     * Beneficiary's first name
     */
    @JsonProperty("beneficiary_first_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryFirstName() {
        return beneficiaryFirstName;
    }
    /**
     * Retrieves value for `beneficiaryLastName`
     * Beneficiary's last name
     */
    @JsonProperty("beneficiary_last_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryLastName() {
        return beneficiaryLastName;
    }
    /**
     * Retrieves value for `beneficiaryPostcode`
     * Beneficiary's postcode
     */
    @JsonProperty("beneficiary_postcode")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryPostcode() {
        return beneficiaryPostcode;
    }
    /**
     * Retrieves value for `beneficiaryStateOrProvince`
     * Beneficiary's state or province
     */
    @JsonProperty("beneficiary_state_or_province")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBeneficiaryStateOrProvince() {
        return beneficiaryStateOrProvince;
    }
    /**
     * Retrieves value for `bicSwift`
     * BIC / Swift code is required.
     */
    @JsonProperty("bic_swift")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBicSwift() {
        return bicSwift;
    }
    /**
     * Retrieves value for `branchCode`
     * A branch code is required.
     */
    @JsonProperty("branch_code")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBranchCode() {
        return branchCode;
    }
    /**
     * Retrieves value for `bsbCode`
     * A BSB (Bank State Branch) number is required.
     */
    @JsonProperty("bsb_code")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBsbCode() {
        return bsbCode;
    }
    /**
     * Retrieves value for `clabe`
     * A CLABE (Clave Bancaria Estandarizada) code is required.
     */
    @JsonProperty("clabe")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getClabe() {
        return clabe;
    }
    /**
     * Retrieves value for `cnaps`
     * A CNAPS (China National Advanced Payment System) code is required.
     */
    @JsonProperty("cnaps")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCnaps() {
        return cnaps;
    }
    /**
     * Retrieves value for `institutionNo`
     * An institution number is required.
     */
    @JsonProperty("institution_no")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getInstitutionNo() {
        return institutionNo;
    }
    /**
     * Retrieves value for `paymentType`
     * The type of payment - 'priority' (Swift) or 'regular' (local).
     */
    @JsonProperty("payment_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<BeneficiaryRequirementsPaymentTypeEnum> getPaymentType() {
        return paymentType;
    }
    /**
     * Retrieves value for `sortCode`
     * A sort code is required.
     */
    @JsonProperty("sort_code")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSortCode() {
        return sortCode;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof BeneficiaryRequirements && equalTo((BeneficiaryRequirements) other);
    }

    private boolean equalTo(BeneficiaryRequirements other) {
        return
            aba.equals(other.aba) &&

            acctNumber.equals(other.acctNumber) &&

            bankCode.equals(other.bankCode) &&

            beneficiaryAddress.equals(other.beneficiaryAddress) &&

            beneficiaryCity.equals(other.beneficiaryCity) &&

            beneficiaryCountry.equals(other.beneficiaryCountry) &&

            beneficiaryEntityType.equals(other.beneficiaryEntityType) &&

            beneficiaryFirstName.equals(other.beneficiaryFirstName) &&

            beneficiaryLastName.equals(other.beneficiaryLastName) &&

            beneficiaryPostcode.equals(other.beneficiaryPostcode) &&

            beneficiaryStateOrProvince.equals(other.beneficiaryStateOrProvince) &&

            bicSwift.equals(other.bicSwift) &&

            branchCode.equals(other.branchCode) &&

            bsbCode.equals(other.bsbCode) &&

            clabe.equals(other.clabe) &&

            cnaps.equals(other.cnaps) &&

            institutionNo.equals(other.institutionNo) &&

            paymentType.equals(other.paymentType) &&

            sortCode.equals(other.sortCode)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.aba,
                   this.acctNumber,
                   this.bankCode,
                   this.beneficiaryAddress,
                   this.beneficiaryCity,
                   this.beneficiaryCountry,
                   this.beneficiaryEntityType,
                   this.beneficiaryFirstName,
                   this.beneficiaryLastName,
                   this.beneficiaryPostcode,
                   this.beneficiaryStateOrProvince,
                   this.bicSwift,
                   this.branchCode,
                   this.bsbCode,
                   this.clabe,
                   this.cnaps,
                   this.institutionNo,
                   this.paymentType,
                   this.sortCode
               );
    }

    @Override
    public String toString() {
        return "BeneficiaryRequirements{" +
               "aba=" + aba + ", " +
               "acctNumber=" + acctNumber + ", " +
               "bankCode=" + bankCode + ", " +
               "beneficiaryAddress=" + beneficiaryAddress + ", " +
               "beneficiaryCity=" + beneficiaryCity + ", " +
               "beneficiaryCountry=" + beneficiaryCountry + ", " +
               "beneficiaryEntityType=" + beneficiaryEntityType + ", " +
               "beneficiaryFirstName=" + beneficiaryFirstName + ", " +
               "beneficiaryLastName=" + beneficiaryLastName + ", " +
               "beneficiaryPostcode=" + beneficiaryPostcode + ", " +
               "beneficiaryStateOrProvince=" + beneficiaryStateOrProvince + ", " +
               "bicSwift=" + bicSwift + ", " +
               "branchCode=" + branchCode + ", " +
               "bsbCode=" + bsbCode + ", " +
               "clabe=" + clabe + ", " +
               "cnaps=" + cnaps + ", " +
               "institutionNo=" + institutionNo + ", " +
               "paymentType=" + paymentType + ", " +
               "sortCode=" + sortCode +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * An ABA (American Bankers Association) routing number is required.
         */
        private Optional<String> aba = Optional.empty();

        /**
         * An account number is required.
         */
        private Optional<String> acctNumber = Optional.empty();

        /**
         * A bank code is required.
         */
        private Optional<String> bankCode = Optional.empty();

        /**
         * Beneficiary's address
         */
        private Optional<String> beneficiaryAddress = Optional.empty();

        /**
         * Beneficiary's city
         */
        private Optional<String> beneficiaryCity = Optional.empty();

        /**
         * Beneficiary's country
         */
        private Optional<String> beneficiaryCountry = Optional.empty();

        /**
         * Type of entity
         */
        private Optional<BeneficiaryRequirementsBeneficiaryEntityTypeEnum> beneficiaryEntityType =
            Optional.empty();

        /**
         * Beneficiary's first name
         */
        private Optional<String> beneficiaryFirstName = Optional.empty();

        /**
         * Beneficiary's last name
         */
        private Optional<String> beneficiaryLastName = Optional.empty();

        /**
         * Beneficiary's postcode
         */
        private Optional<String> beneficiaryPostcode = Optional.empty();

        /**
         * Beneficiary's state or province
         */
        private Optional<String> beneficiaryStateOrProvince = Optional.empty();

        /**
         * BIC / Swift code is required.
         */
        private Optional<String> bicSwift = Optional.empty();

        /**
         * A branch code is required.
         */
        private Optional<String> branchCode = Optional.empty();

        /**
         * A BSB (Bank State Branch) number is required.
         */
        private Optional<String> bsbCode = Optional.empty();

        /**
         * A CLABE (Clave Bancaria Estandarizada) code is required.
         */
        private Optional<String> clabe = Optional.empty();

        /**
         * A CNAPS (China National Advanced Payment System) code is required.
         */
        private Optional<String> cnaps = Optional.empty();

        /**
         * An institution number is required.
         */
        private Optional<String> institutionNo = Optional.empty();

        /**
         * The type of payment - 'priority' (Swift) or 'regular' (local).
         */
        private Optional<BeneficiaryRequirementsPaymentTypeEnum> paymentType = Optional.empty();

        /**
         * A sort code is required.
         */
        private Optional<String> sortCode = Optional.empty();


        private Builder() {}

        public Builder from(BeneficiaryRequirements other) {
            aba(other.getAba());
            acctNumber(other.getAcctNumber());
            bankCode(other.getBankCode());
            beneficiaryAddress(other.getBeneficiaryAddress());
            beneficiaryCity(other.getBeneficiaryCity());
            beneficiaryCountry(other.getBeneficiaryCountry());
            beneficiaryEntityType(other.getBeneficiaryEntityType());
            beneficiaryFirstName(other.getBeneficiaryFirstName());
            beneficiaryLastName(other.getBeneficiaryLastName());
            beneficiaryPostcode(other.getBeneficiaryPostcode());
            beneficiaryStateOrProvince(other.getBeneficiaryStateOrProvince());
            bicSwift(other.getBicSwift());
            branchCode(other.getBranchCode());
            bsbCode(other.getBsbCode());
            clabe(other.getClabe());
            cnaps(other.getCnaps());
            institutionNo(other.getInstitutionNo());
            paymentType(other.getPaymentType());
            sortCode(other.getSortCode());
            return this;
        }

        /**
         * Sets value for `aba`
         * An ABA (American Bankers Association) routing number is required.
         */
        @JsonSetter("aba")
        public Builder aba(Optional<String> aba) {
            this.aba = aba;
            return this;
        }

        /**
         * Sets value for `aba`
         * An ABA (American Bankers Association) routing number is required.
         */
        public Builder aba(String aba) {
            return this.aba(Optional.ofNullable(aba));
        }
        /**
         * Sets value for `acctNumber`
         * An account number is required.
         */
        @JsonSetter("acct_number")
        public Builder acctNumber(Optional<String> acctNumber) {
            this.acctNumber = acctNumber;
            return this;
        }

        /**
         * Sets value for `acctNumber`
         * An account number is required.
         */
        public Builder acctNumber(String acctNumber) {
            return this.acctNumber(Optional.ofNullable(acctNumber));
        }
        /**
         * Sets value for `bankCode`
         * A bank code is required.
         */
        @JsonSetter("bank_code")
        public Builder bankCode(Optional<String> bankCode) {
            this.bankCode = bankCode;
            return this;
        }

        /**
         * Sets value for `bankCode`
         * A bank code is required.
         */
        public Builder bankCode(String bankCode) {
            return this.bankCode(Optional.ofNullable(bankCode));
        }
        /**
         * Sets value for `beneficiaryAddress`
         * Beneficiary's address
         */
        @JsonSetter("beneficiary_address")
        public Builder beneficiaryAddress(Optional<String> beneficiaryAddress) {
            this.beneficiaryAddress = beneficiaryAddress;
            return this;
        }

        /**
         * Sets value for `beneficiaryAddress`
         * Beneficiary's address
         */
        public Builder beneficiaryAddress(String beneficiaryAddress) {
            return this.beneficiaryAddress(Optional.ofNullable(beneficiaryAddress));
        }
        /**
         * Sets value for `beneficiaryCity`
         * Beneficiary's city
         */
        @JsonSetter("beneficiary_city")
        public Builder beneficiaryCity(Optional<String> beneficiaryCity) {
            this.beneficiaryCity = beneficiaryCity;
            return this;
        }

        /**
         * Sets value for `beneficiaryCity`
         * Beneficiary's city
         */
        public Builder beneficiaryCity(String beneficiaryCity) {
            return this.beneficiaryCity(Optional.ofNullable(beneficiaryCity));
        }
        /**
         * Sets value for `beneficiaryCountry`
         * Beneficiary's country
         */
        @JsonSetter("beneficiary_country")
        public Builder beneficiaryCountry(Optional<String> beneficiaryCountry) {
            this.beneficiaryCountry = beneficiaryCountry;
            return this;
        }

        /**
         * Sets value for `beneficiaryCountry`
         * Beneficiary's country
         */
        public Builder beneficiaryCountry(String beneficiaryCountry) {
            return this.beneficiaryCountry(Optional.ofNullable(beneficiaryCountry));
        }
        /**
         * Sets value for `beneficiaryEntityType`
         * Type of entity
         */
        @JsonSetter("beneficiary_entity_type")
        public Builder beneficiaryEntityType(Optional<BeneficiaryRequirementsBeneficiaryEntityTypeEnum>
                                             beneficiaryEntityType) {
            this.beneficiaryEntityType = beneficiaryEntityType;
            return this;
        }

        /**
         * Sets value for `beneficiaryEntityType`
         * Type of entity
         */
        public Builder beneficiaryEntityType(BeneficiaryRequirementsBeneficiaryEntityTypeEnum
                                             beneficiaryEntityType) {
            return this.beneficiaryEntityType(Optional.ofNullable(beneficiaryEntityType));
        }
        /**
         * Sets value for `beneficiaryFirstName`
         * Beneficiary's first name
         */
        @JsonSetter("beneficiary_first_name")
        public Builder beneficiaryFirstName(Optional<String> beneficiaryFirstName) {
            this.beneficiaryFirstName = beneficiaryFirstName;
            return this;
        }

        /**
         * Sets value for `beneficiaryFirstName`
         * Beneficiary's first name
         */
        public Builder beneficiaryFirstName(String beneficiaryFirstName) {
            return this.beneficiaryFirstName(Optional.ofNullable(beneficiaryFirstName));
        }
        /**
         * Sets value for `beneficiaryLastName`
         * Beneficiary's last name
         */
        @JsonSetter("beneficiary_last_name")
        public Builder beneficiaryLastName(Optional<String> beneficiaryLastName) {
            this.beneficiaryLastName = beneficiaryLastName;
            return this;
        }

        /**
         * Sets value for `beneficiaryLastName`
         * Beneficiary's last name
         */
        public Builder beneficiaryLastName(String beneficiaryLastName) {
            return this.beneficiaryLastName(Optional.ofNullable(beneficiaryLastName));
        }
        /**
         * Sets value for `beneficiaryPostcode`
         * Beneficiary's postcode
         */
        @JsonSetter("beneficiary_postcode")
        public Builder beneficiaryPostcode(Optional<String> beneficiaryPostcode) {
            this.beneficiaryPostcode = beneficiaryPostcode;
            return this;
        }

        /**
         * Sets value for `beneficiaryPostcode`
         * Beneficiary's postcode
         */
        public Builder beneficiaryPostcode(String beneficiaryPostcode) {
            return this.beneficiaryPostcode(Optional.ofNullable(beneficiaryPostcode));
        }
        /**
         * Sets value for `beneficiaryStateOrProvince`
         * Beneficiary's state or province
         */
        @JsonSetter("beneficiary_state_or_province")
        public Builder beneficiaryStateOrProvince(Optional<String> beneficiaryStateOrProvince) {
            this.beneficiaryStateOrProvince = beneficiaryStateOrProvince;
            return this;
        }

        /**
         * Sets value for `beneficiaryStateOrProvince`
         * Beneficiary's state or province
         */
        public Builder beneficiaryStateOrProvince(String beneficiaryStateOrProvince) {
            return this.beneficiaryStateOrProvince(Optional.ofNullable(beneficiaryStateOrProvince));
        }
        /**
         * Sets value for `bicSwift`
         * BIC / Swift code is required.
         */
        @JsonSetter("bic_swift")
        public Builder bicSwift(Optional<String> bicSwift) {
            this.bicSwift = bicSwift;
            return this;
        }

        /**
         * Sets value for `bicSwift`
         * BIC / Swift code is required.
         */
        public Builder bicSwift(String bicSwift) {
            return this.bicSwift(Optional.ofNullable(bicSwift));
        }
        /**
         * Sets value for `branchCode`
         * A branch code is required.
         */
        @JsonSetter("branch_code")
        public Builder branchCode(Optional<String> branchCode) {
            this.branchCode = branchCode;
            return this;
        }

        /**
         * Sets value for `branchCode`
         * A branch code is required.
         */
        public Builder branchCode(String branchCode) {
            return this.branchCode(Optional.ofNullable(branchCode));
        }
        /**
         * Sets value for `bsbCode`
         * A BSB (Bank State Branch) number is required.
         */
        @JsonSetter("bsb_code")
        public Builder bsbCode(Optional<String> bsbCode) {
            this.bsbCode = bsbCode;
            return this;
        }

        /**
         * Sets value for `bsbCode`
         * A BSB (Bank State Branch) number is required.
         */
        public Builder bsbCode(String bsbCode) {
            return this.bsbCode(Optional.ofNullable(bsbCode));
        }
        /**
         * Sets value for `clabe`
         * A CLABE (Clave Bancaria Estandarizada) code is required.
         */
        @JsonSetter("clabe")
        public Builder clabe(Optional<String> clabe) {
            this.clabe = clabe;
            return this;
        }

        /**
         * Sets value for `clabe`
         * A CLABE (Clave Bancaria Estandarizada) code is required.
         */
        public Builder clabe(String clabe) {
            return this.clabe(Optional.ofNullable(clabe));
        }
        /**
         * Sets value for `cnaps`
         * A CNAPS (China National Advanced Payment System) code is required.
         */
        @JsonSetter("cnaps")
        public Builder cnaps(Optional<String> cnaps) {
            this.cnaps = cnaps;
            return this;
        }

        /**
         * Sets value for `cnaps`
         * A CNAPS (China National Advanced Payment System) code is required.
         */
        public Builder cnaps(String cnaps) {
            return this.cnaps(Optional.ofNullable(cnaps));
        }
        /**
         * Sets value for `institutionNo`
         * An institution number is required.
         */
        @JsonSetter("institution_no")
        public Builder institutionNo(Optional<String> institutionNo) {
            this.institutionNo = institutionNo;
            return this;
        }

        /**
         * Sets value for `institutionNo`
         * An institution number is required.
         */
        public Builder institutionNo(String institutionNo) {
            return this.institutionNo(Optional.ofNullable(institutionNo));
        }
        /**
         * Sets value for `paymentType`
         * The type of payment - 'priority' (Swift) or 'regular' (local).
         */
        @JsonSetter("payment_type")
        public Builder paymentType(Optional<BeneficiaryRequirementsPaymentTypeEnum> paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Sets value for `paymentType`
         * The type of payment - 'priority' (Swift) or 'regular' (local).
         */
        public Builder paymentType(BeneficiaryRequirementsPaymentTypeEnum paymentType) {
            return this.paymentType(Optional.ofNullable(paymentType));
        }
        /**
         * Sets value for `sortCode`
         * A sort code is required.
         */
        @JsonSetter("sort_code")
        public Builder sortCode(Optional<String> sortCode) {
            this.sortCode = sortCode;
            return this;
        }

        /**
         * Sets value for `sortCode`
         * A sort code is required.
         */
        public Builder sortCode(String sortCode) {
            return this.sortCode(Optional.ofNullable(sortCode));
        }



        public BeneficiaryRequirements build() {
            return new BeneficiaryRequirements(this);
        }
    }

}



