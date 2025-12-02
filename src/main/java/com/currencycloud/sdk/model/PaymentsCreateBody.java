
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * PaymentsCreateBody
 */
@JsonDeserialize(builder = PaymentsCreateBody.Builder.class)
public final class PaymentsCreateBody {
    /**
     * Amount
     */
    private final String amount;

    /**
     * Beneficiary UUID
     */
    private final String beneficiaryId;

    /**
     * Payment Charges Setting value (only applicable to Swift payments). If this is left empty, the account's default value is used. Do not specify for regular (local) payments.
     */
    private final Optional<PaymentsCreateBodyChargeTypeEnum> chargeType;

    /**
     * Conversion UUID
     */
    private final Optional<String> conversionId;

    /**
     * Currency in which payment is made. Three-letter ISO currency code.
     */
    private final String currency;

    /**
     * Fee amount
     */
    private final Optional<String> feeAmount;

    /**
     * Currency fee is paid in.
     */
    private final Optional<String> feeCurrency;

    /**
     * The date of the invoice related to the payment. Necessary when making business-related INR payments, check our <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430000-Payment-Purpose-Codes">support article</a> to see if this applies to your purpose code. ISO 8601 format YYYY-MM-DD. Mandatory if supplying `invoice_number`.
     */
    private final Optional<String> invoiceDate;

    /**
     * The invoice number related to the payment. Necessary when making business-related INR payments, check our <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430000-Payment-Purpose-Codes">support article</a> to see if this applies to your purpose code. Can be up to 30 characters. Mandatory if supplying `invoice_date`.
     */
    private final Optional<String> invoiceNumber;

    /**
     * A contact UUID for the sub-account you're acting on behalf of. Payer details parameters should not be sent if using on_behalf_of, they will be populated using the details from the sub-account.
     */
    private final Optional<String> onBehalfOf;

    /**
     * First line of address.
     */
    private final Optional<String> payerAddress;

    /**
     * City name, should not consist of only numbers.
     */
    private final Optional<String> payerCity;

    /**
     * Required if "payer_entity_type" is "company".
     */
    private final Optional<String> payerCompanyName;

    /**
     * Two-letter ISO country code.
     */
    private final Optional<String> payerCountry;

    /**
     * If "payer_entity_type" is "company", this is the company registration date. If "payer_entity_type" is "individual", this is date of birth. ISO 8601 format YYYY-MM-DD.
     */
    private final Optional<String> payerDateOfBirth;

    /**
     * Legal entity
     */
    private final Optional<PaymentsCreateBodyPayerEntityTypeEnum> payerEntityType;

    /**
     * Required if "payer_entity_type" is "individual".
     */
    private final Optional<String> payerFirstName;

    /**
     * A legal document that verifies the identity of the payer. Required documentation will vary depending on the nationality or registered address of the payer.
     */
    private final Optional<PaymentsCreateBodyPayerIdentificationTypeEnum> payerIdentificationType;

    /**
     * A unique reference code for the identification document, such as a passport number.
     */
    private final Optional<String> payerIdentificationValue;

    /**
     * Required if "payer_entity_type" is "individual". Cannot contain any numbers or company signifiers.
     */
    private final Optional<String> payerLastName;

    /**
     * Postal code
     */
    private final Optional<String> payerPostcode;

    /**
     * State or province.
     */
    private final Optional<String> payerStateOrProvince;

    /**
     * Instructed date of payment - on this date we will attempt to debit funds on the account and submit the payment to the scheme. If the payment cannot be submitted before the cut-off (i.e. due to lack of funding), we will re-attempt on the next working day. Defaults to the earliest possible date if not passed as parameter. Any valid ISO 8601 format, e.g. "2023-12-31.
     */
    private final Optional<String> paymentDate;

    /**
     * Currencycloud supports two types of payments: "priority", made using the Swift network; and "regular", made using the local bank network.
     */
    private final Optional<PaymentsCreateBodyPaymentTypeEnum> paymentType;

    /**
     * <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430000-Payment-Purpose-Codes">Payment Purpose Code</a> (Mandatory for all local INR and MYR payments, Swift CNY payments, and Swift payments in any currency to banks in Bahrain or the United Arab Emirates).
     */
    private final Optional<String> purposeCode;

    /**
     * User-generated reason for payment - freeform text.
     */
    private final String reason;

    /**
     * User-generated reference code.
     */
    private final String reference;

    /**
     * The name of the ultimate beneficiary if different.
     */
    private final Optional<String> ultimateBeneficiaryName;

    /**
     * User-generated idempotency key.
     */
    private final String uniqueRequestId;


    private PaymentsCreateBody(Builder builder) {
        this.amount = builder.amount;
        this.beneficiaryId = builder.beneficiaryId;
        this.chargeType = builder.chargeType;
        this.conversionId = builder.conversionId;
        this.currency = builder.currency;
        this.feeAmount = builder.feeAmount;
        this.feeCurrency = builder.feeCurrency;
        this.invoiceDate = builder.invoiceDate;
        this.invoiceNumber = builder.invoiceNumber;
        this.onBehalfOf = builder.onBehalfOf;
        this.payerAddress = builder.payerAddress;
        this.payerCity = builder.payerCity;
        this.payerCompanyName = builder.payerCompanyName;
        this.payerCountry = builder.payerCountry;
        this.payerDateOfBirth = builder.payerDateOfBirth;
        this.payerEntityType = builder.payerEntityType;
        this.payerFirstName = builder.payerFirstName;
        this.payerIdentificationType = builder.payerIdentificationType;
        this.payerIdentificationValue = builder.payerIdentificationValue;
        this.payerLastName = builder.payerLastName;
        this.payerPostcode = builder.payerPostcode;
        this.payerStateOrProvince = builder.payerStateOrProvince;
        this.paymentDate = builder.paymentDate;
        this.paymentType = builder.paymentType;
        this.purposeCode = builder.purposeCode;
        this.reason = builder.reason;
        this.reference = builder.reference;
        this.ultimateBeneficiaryName = builder.ultimateBeneficiaryName;
        this.uniqueRequestId = builder.uniqueRequestId;
    }

    /**
     * Retrieves value for `amount`
     * Amount
     */
    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }
    /**
     * Retrieves value for `beneficiaryId`
     * Beneficiary UUID
     */
    @JsonProperty("beneficiary_id")
    public String getBeneficiaryId() {
        return beneficiaryId;
    }
    /**
     * Retrieves value for `chargeType`
     * Payment Charges Setting value (only applicable to Swift payments). If this is left empty, the account's default value is used. Do not specify for regular (local) payments.
     */
    @JsonProperty("charge_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<PaymentsCreateBodyChargeTypeEnum> getChargeType() {
        return chargeType;
    }
    /**
     * Retrieves value for `conversionId`
     * Conversion UUID
     */
    @JsonProperty("conversion_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getConversionId() {
        return conversionId;
    }
    /**
     * Retrieves value for `currency`
     * Currency in which payment is made. Three-letter ISO currency code.
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `feeAmount`
     * Fee amount
     */
    @JsonProperty("fee_amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getFeeAmount() {
        return feeAmount;
    }
    /**
     * Retrieves value for `feeCurrency`
     * Currency fee is paid in.
     */
    @JsonProperty("fee_currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getFeeCurrency() {
        return feeCurrency;
    }
    /**
     * Retrieves value for `invoiceDate`
     * The date of the invoice related to the payment. Necessary when making business-related INR payments, check our <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430000-Payment-Purpose-Codes">support article</a> to see if this applies to your purpose code. ISO 8601 format YYYY-MM-DD. Mandatory if supplying `invoice_number`.
     */
    @JsonProperty("invoice_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getInvoiceDate() {
        return invoiceDate;
    }
    /**
     * Retrieves value for `invoiceNumber`
     * The invoice number related to the payment. Necessary when making business-related INR payments, check our <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430000-Payment-Purpose-Codes">support article</a> to see if this applies to your purpose code. Can be up to 30 characters. Mandatory if supplying `invoice_date`.
     */
    @JsonProperty("invoice_number")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getInvoiceNumber() {
        return invoiceNumber;
    }
    /**
     * Retrieves value for `onBehalfOf`
     * A contact UUID for the sub-account you're acting on behalf of. Payer details parameters should not be sent if using on_behalf_of, they will be populated using the details from the sub-account.
     */
    @JsonProperty("on_behalf_of")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getOnBehalfOf() {
        return onBehalfOf;
    }
    /**
     * Retrieves value for `payerAddress`
     * First line of address.
     */
    @JsonProperty("payer_address")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPayerAddress() {
        return payerAddress;
    }
    /**
     * Retrieves value for `payerCity`
     * City name, should not consist of only numbers.
     */
    @JsonProperty("payer_city")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPayerCity() {
        return payerCity;
    }
    /**
     * Retrieves value for `payerCompanyName`
     * Required if "payer_entity_type" is "company".
     */
    @JsonProperty("payer_company_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPayerCompanyName() {
        return payerCompanyName;
    }
    /**
     * Retrieves value for `payerCountry`
     * Two-letter ISO country code.
     */
    @JsonProperty("payer_country")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPayerCountry() {
        return payerCountry;
    }
    /**
     * Retrieves value for `payerDateOfBirth`
     * If "payer_entity_type" is "company", this is the company registration date. If "payer_entity_type" is "individual", this is date of birth. ISO 8601 format YYYY-MM-DD.
     */
    @JsonProperty("payer_date_of_birth")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPayerDateOfBirth() {
        return payerDateOfBirth;
    }
    /**
     * Retrieves value for `payerEntityType`
     * Legal entity
     */
    @JsonProperty("payer_entity_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<PaymentsCreateBodyPayerEntityTypeEnum> getPayerEntityType() {
        return payerEntityType;
    }
    /**
     * Retrieves value for `payerFirstName`
     * Required if "payer_entity_type" is "individual".
     */
    @JsonProperty("payer_first_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPayerFirstName() {
        return payerFirstName;
    }
    /**
     * Retrieves value for `payerIdentificationType`
     * A legal document that verifies the identity of the payer. Required documentation will vary depending on the nationality or registered address of the payer.
     */
    @JsonProperty("payer_identification_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<PaymentsCreateBodyPayerIdentificationTypeEnum> getPayerIdentificationType() {
        return payerIdentificationType;
    }
    /**
     * Retrieves value for `payerIdentificationValue`
     * A unique reference code for the identification document, such as a passport number.
     */
    @JsonProperty("payer_identification_value")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPayerIdentificationValue() {
        return payerIdentificationValue;
    }
    /**
     * Retrieves value for `payerLastName`
     * Required if "payer_entity_type" is "individual". Cannot contain any numbers or company signifiers.
     */
    @JsonProperty("payer_last_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPayerLastName() {
        return payerLastName;
    }
    /**
     * Retrieves value for `payerPostcode`
     * Postal code
     */
    @JsonProperty("payer_postcode")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPayerPostcode() {
        return payerPostcode;
    }
    /**
     * Retrieves value for `payerStateOrProvince`
     * State or province.
     */
    @JsonProperty("payer_state_or_province")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPayerStateOrProvince() {
        return payerStateOrProvince;
    }
    /**
     * Retrieves value for `paymentDate`
     * Instructed date of payment - on this date we will attempt to debit funds on the account and submit the payment to the scheme. If the payment cannot be submitted before the cut-off (i.e. due to lack of funding), we will re-attempt on the next working day. Defaults to the earliest possible date if not passed as parameter. Any valid ISO 8601 format, e.g. "2023-12-31.
     */
    @JsonProperty("payment_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPaymentDate() {
        return paymentDate;
    }
    /**
     * Retrieves value for `paymentType`
     * Currencycloud supports two types of payments: "priority", made using the Swift network; and "regular", made using the local bank network.
     */
    @JsonProperty("payment_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<PaymentsCreateBodyPaymentTypeEnum> getPaymentType() {
        return paymentType;
    }
    /**
     * Retrieves value for `purposeCode`
     * <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430000-Payment-Purpose-Codes">Payment Purpose Code</a> (Mandatory for all local INR and MYR payments, Swift CNY payments, and Swift payments in any currency to banks in Bahrain or the United Arab Emirates).
     */
    @JsonProperty("purpose_code")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPurposeCode() {
        return purposeCode;
    }
    /**
     * Retrieves value for `reason`
     * User-generated reason for payment - freeform text.
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }
    /**
     * Retrieves value for `reference`
     * User-generated reference code.
     */
    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }
    /**
     * Retrieves value for `ultimateBeneficiaryName`
     * The name of the ultimate beneficiary if different.
     */
    @JsonProperty("ultimate_beneficiary_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUltimateBeneficiaryName() {
        return ultimateBeneficiaryName;
    }
    /**
     * Retrieves value for `uniqueRequestId`
     * User-generated idempotency key.
     */
    @JsonProperty("unique_request_id")
    public String getUniqueRequestId() {
        return uniqueRequestId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof PaymentsCreateBody && equalTo((PaymentsCreateBody) other);
    }

    private boolean equalTo(PaymentsCreateBody other) {
        return
            amount.equals(other.amount) &&

            beneficiaryId.equals(other.beneficiaryId) &&

            chargeType.equals(other.chargeType) &&

            conversionId.equals(other.conversionId) &&

            currency.equals(other.currency) &&

            feeAmount.equals(other.feeAmount) &&

            feeCurrency.equals(other.feeCurrency) &&

            invoiceDate.equals(other.invoiceDate) &&

            invoiceNumber.equals(other.invoiceNumber) &&

            onBehalfOf.equals(other.onBehalfOf) &&

            payerAddress.equals(other.payerAddress) &&

            payerCity.equals(other.payerCity) &&

            payerCompanyName.equals(other.payerCompanyName) &&

            payerCountry.equals(other.payerCountry) &&

            payerDateOfBirth.equals(other.payerDateOfBirth) &&

            payerEntityType.equals(other.payerEntityType) &&

            payerFirstName.equals(other.payerFirstName) &&

            payerIdentificationType.equals(other.payerIdentificationType) &&

            payerIdentificationValue.equals(other.payerIdentificationValue) &&

            payerLastName.equals(other.payerLastName) &&

            payerPostcode.equals(other.payerPostcode) &&

            payerStateOrProvince.equals(other.payerStateOrProvince) &&

            paymentDate.equals(other.paymentDate) &&

            paymentType.equals(other.paymentType) &&

            purposeCode.equals(other.purposeCode) &&

            reason.equals(other.reason) &&

            reference.equals(other.reference) &&

            ultimateBeneficiaryName.equals(other.ultimateBeneficiaryName) &&

            uniqueRequestId.equals(other.uniqueRequestId)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.amount,
                   this.beneficiaryId,
                   this.chargeType,
                   this.conversionId,
                   this.currency,
                   this.feeAmount,
                   this.feeCurrency,
                   this.invoiceDate,
                   this.invoiceNumber,
                   this.onBehalfOf,
                   this.payerAddress,
                   this.payerCity,
                   this.payerCompanyName,
                   this.payerCountry,
                   this.payerDateOfBirth,
                   this.payerEntityType,
                   this.payerFirstName,
                   this.payerIdentificationType,
                   this.payerIdentificationValue,
                   this.payerLastName,
                   this.payerPostcode,
                   this.payerStateOrProvince,
                   this.paymentDate,
                   this.paymentType,
                   this.purposeCode,
                   this.reason,
                   this.reference,
                   this.ultimateBeneficiaryName,
                   this.uniqueRequestId
               );
    }

    @Override
    public String toString() {
        return "PaymentsCreateBody{" +
               "amount=" + amount + ", " +
               "beneficiaryId=" + beneficiaryId + ", " +
               "chargeType=" + chargeType + ", " +
               "conversionId=" + conversionId + ", " +
               "currency=" + currency + ", " +
               "feeAmount=" + feeAmount + ", " +
               "feeCurrency=" + feeCurrency + ", " +
               "invoiceDate=" + invoiceDate + ", " +
               "invoiceNumber=" + invoiceNumber + ", " +
               "onBehalfOf=" + onBehalfOf + ", " +
               "payerAddress=" + payerAddress + ", " +
               "payerCity=" + payerCity + ", " +
               "payerCompanyName=" + payerCompanyName + ", " +
               "payerCountry=" + payerCountry + ", " +
               "payerDateOfBirth=" + payerDateOfBirth + ", " +
               "payerEntityType=" + payerEntityType + ", " +
               "payerFirstName=" + payerFirstName + ", " +
               "payerIdentificationType=" + payerIdentificationType + ", " +
               "payerIdentificationValue=" + payerIdentificationValue + ", " +
               "payerLastName=" + payerLastName + ", " +
               "payerPostcode=" + payerPostcode + ", " +
               "payerStateOrProvince=" + payerStateOrProvince + ", " +
               "paymentDate=" + paymentDate + ", " +
               "paymentType=" + paymentType + ", " +
               "purposeCode=" + purposeCode + ", " +
               "reason=" + reason + ", " +
               "reference=" + reference + ", " +
               "ultimateBeneficiaryName=" + ultimateBeneficiaryName + ", " +
               "uniqueRequestId=" + uniqueRequestId +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Amount
         */
        private String amount = null;

        /**
         * Beneficiary UUID
         */
        private String beneficiaryId = null;

        /**
         * Payment Charges Setting value (only applicable to Swift payments). If this is left empty, the account's default value is used. Do not specify for regular (local) payments.
         */
        private Optional<PaymentsCreateBodyChargeTypeEnum> chargeType = Optional.empty();

        /**
         * Conversion UUID
         */
        private Optional<String> conversionId = Optional.empty();

        /**
         * Currency in which payment is made. Three-letter ISO currency code.
         */
        private String currency = null;

        /**
         * Fee amount
         */
        private Optional<String> feeAmount = Optional.empty();

        /**
         * Currency fee is paid in.
         */
        private Optional<String> feeCurrency = Optional.empty();

        /**
         * The date of the invoice related to the payment. Necessary when making business-related INR payments, check our <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430000-Payment-Purpose-Codes">support article</a> to see if this applies to your purpose code. ISO 8601 format YYYY-MM-DD. Mandatory if supplying `invoice_number`.
         */
        private Optional<String> invoiceDate = Optional.empty();

        /**
         * The invoice number related to the payment. Necessary when making business-related INR payments, check our <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430000-Payment-Purpose-Codes">support article</a> to see if this applies to your purpose code. Can be up to 30 characters. Mandatory if supplying `invoice_date`.
         */
        private Optional<String> invoiceNumber = Optional.empty();

        /**
         * A contact UUID for the sub-account you're acting on behalf of. Payer details parameters should not be sent if using on_behalf_of, they will be populated using the details from the sub-account.
         */
        private Optional<String> onBehalfOf = Optional.empty();

        /**
         * First line of address.
         */
        private Optional<String> payerAddress = Optional.empty();

        /**
         * City name, should not consist of only numbers.
         */
        private Optional<String> payerCity = Optional.empty();

        /**
         * Required if "payer_entity_type" is "company".
         */
        private Optional<String> payerCompanyName = Optional.empty();

        /**
         * Two-letter ISO country code.
         */
        private Optional<String> payerCountry = Optional.empty();

        /**
         * If "payer_entity_type" is "company", this is the company registration date. If "payer_entity_type" is "individual", this is date of birth. ISO 8601 format YYYY-MM-DD.
         */
        private Optional<String> payerDateOfBirth = Optional.empty();

        /**
         * Legal entity
         */
        private Optional<PaymentsCreateBodyPayerEntityTypeEnum> payerEntityType = Optional.empty();

        /**
         * Required if "payer_entity_type" is "individual".
         */
        private Optional<String> payerFirstName = Optional.empty();

        /**
         * A legal document that verifies the identity of the payer. Required documentation will vary depending on the nationality or registered address of the payer.
         */
        private Optional<PaymentsCreateBodyPayerIdentificationTypeEnum> payerIdentificationType =
            Optional.empty();

        /**
         * A unique reference code for the identification document, such as a passport number.
         */
        private Optional<String> payerIdentificationValue = Optional.empty();

        /**
         * Required if "payer_entity_type" is "individual". Cannot contain any numbers or company signifiers.
         */
        private Optional<String> payerLastName = Optional.empty();

        /**
         * Postal code
         */
        private Optional<String> payerPostcode = Optional.empty();

        /**
         * State or province.
         */
        private Optional<String> payerStateOrProvince = Optional.empty();

        /**
         * Instructed date of payment - on this date we will attempt to debit funds on the account and submit the payment to the scheme. If the payment cannot be submitted before the cut-off (i.e. due to lack of funding), we will re-attempt on the next working day. Defaults to the earliest possible date if not passed as parameter. Any valid ISO 8601 format, e.g. "2023-12-31.
         */
        private Optional<String> paymentDate = Optional.empty();

        /**
         * Currencycloud supports two types of payments: "priority", made using the Swift network; and "regular", made using the local bank network.
         */
        private Optional<PaymentsCreateBodyPaymentTypeEnum> paymentType = Optional.empty();

        /**
         * <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430000-Payment-Purpose-Codes">Payment Purpose Code</a> (Mandatory for all local INR and MYR payments, Swift CNY payments, and Swift payments in any currency to banks in Bahrain or the United Arab Emirates).
         */
        private Optional<String> purposeCode = Optional.empty();

        /**
         * User-generated reason for payment - freeform text.
         */
        private String reason = null;

        /**
         * User-generated reference code.
         */
        private String reference = null;

        /**
         * The name of the ultimate beneficiary if different.
         */
        private Optional<String> ultimateBeneficiaryName = Optional.empty();

        /**
         * User-generated idempotency key.
         */
        private String uniqueRequestId = null;


        private Builder() {}

        public Builder from(PaymentsCreateBody other) {
            amount(other.getAmount());
            beneficiaryId(other.getBeneficiaryId());
            chargeType(other.getChargeType());
            conversionId(other.getConversionId());
            currency(other.getCurrency());
            feeAmount(other.getFeeAmount());
            feeCurrency(other.getFeeCurrency());
            invoiceDate(other.getInvoiceDate());
            invoiceNumber(other.getInvoiceNumber());
            onBehalfOf(other.getOnBehalfOf());
            payerAddress(other.getPayerAddress());
            payerCity(other.getPayerCity());
            payerCompanyName(other.getPayerCompanyName());
            payerCountry(other.getPayerCountry());
            payerDateOfBirth(other.getPayerDateOfBirth());
            payerEntityType(other.getPayerEntityType());
            payerFirstName(other.getPayerFirstName());
            payerIdentificationType(other.getPayerIdentificationType());
            payerIdentificationValue(other.getPayerIdentificationValue());
            payerLastName(other.getPayerLastName());
            payerPostcode(other.getPayerPostcode());
            payerStateOrProvince(other.getPayerStateOrProvince());
            paymentDate(other.getPaymentDate());
            paymentType(other.getPaymentType());
            purposeCode(other.getPurposeCode());
            reason(other.getReason());
            reference(other.getReference());
            ultimateBeneficiaryName(other.getUltimateBeneficiaryName());
            uniqueRequestId(other.getUniqueRequestId());
            return this;
        }

        /**
         * Sets value for `amount`
         * Amount
         */
        @JsonSetter("amount")
        public Builder amount(String amount) {
            if (amount == null) {
                throw new IllegalArgumentException("amount cannot be null");
            }

            this.amount = amount;
            return this;
        }
        /**
         * Sets value for `beneficiaryId`
         * Beneficiary UUID
         */
        @JsonSetter("beneficiary_id")
        public Builder beneficiaryId(String beneficiaryId) {
            if (beneficiaryId == null) {
                throw new IllegalArgumentException("beneficiaryId cannot be null");
            }

            this.beneficiaryId = beneficiaryId;
            return this;
        }
        /**
         * Sets value for `chargeType`
         * Payment Charges Setting value (only applicable to Swift payments). If this is left empty, the account's default value is used. Do not specify for regular (local) payments.
         */
        @JsonSetter("charge_type")
        public Builder chargeType(Optional<PaymentsCreateBodyChargeTypeEnum> chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * Sets value for `chargeType`
         * Payment Charges Setting value (only applicable to Swift payments). If this is left empty, the account's default value is used. Do not specify for regular (local) payments.
         */
        public Builder chargeType(PaymentsCreateBodyChargeTypeEnum chargeType) {
            return this.chargeType(Optional.ofNullable(chargeType));
        }
        /**
         * Sets value for `conversionId`
         * Conversion UUID
         */
        @JsonSetter("conversion_id")
        public Builder conversionId(Optional<String> conversionId) {
            this.conversionId = conversionId;
            return this;
        }

        /**
         * Sets value for `conversionId`
         * Conversion UUID
         */
        public Builder conversionId(String conversionId) {
            return this.conversionId(Optional.ofNullable(conversionId));
        }
        /**
         * Sets value for `currency`
         * Currency in which payment is made. Three-letter ISO currency code.
         */
        @JsonSetter("currency")
        public Builder currency(String currency) {
            if (currency == null) {
                throw new IllegalArgumentException("currency cannot be null");
            }

            this.currency = currency;
            return this;
        }
        /**
         * Sets value for `feeAmount`
         * Fee amount
         */
        @JsonSetter("fee_amount")
        public Builder feeAmount(Optional<String> feeAmount) {
            this.feeAmount = feeAmount;
            return this;
        }

        /**
         * Sets value for `feeAmount`
         * Fee amount
         */
        public Builder feeAmount(String feeAmount) {
            return this.feeAmount(Optional.ofNullable(feeAmount));
        }
        /**
         * Sets value for `feeCurrency`
         * Currency fee is paid in.
         */
        @JsonSetter("fee_currency")
        public Builder feeCurrency(Optional<String> feeCurrency) {
            this.feeCurrency = feeCurrency;
            return this;
        }

        /**
         * Sets value for `feeCurrency`
         * Currency fee is paid in.
         */
        public Builder feeCurrency(String feeCurrency) {
            return this.feeCurrency(Optional.ofNullable(feeCurrency));
        }
        /**
         * Sets value for `invoiceDate`
         * The date of the invoice related to the payment. Necessary when making business-related INR payments, check our <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430000-Payment-Purpose-Codes">support article</a> to see if this applies to your purpose code. ISO 8601 format YYYY-MM-DD. Mandatory if supplying `invoice_number`.
         */
        @JsonSetter("invoice_date")
        public Builder invoiceDate(Optional<String> invoiceDate) {
            this.invoiceDate = invoiceDate;
            return this;
        }

        /**
         * Sets value for `invoiceDate`
         * The date of the invoice related to the payment. Necessary when making business-related INR payments, check our <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430000-Payment-Purpose-Codes">support article</a> to see if this applies to your purpose code. ISO 8601 format YYYY-MM-DD. Mandatory if supplying `invoice_number`.
         */
        public Builder invoiceDate(String invoiceDate) {
            return this.invoiceDate(Optional.ofNullable(invoiceDate));
        }
        /**
         * Sets value for `invoiceNumber`
         * The invoice number related to the payment. Necessary when making business-related INR payments, check our <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430000-Payment-Purpose-Codes">support article</a> to see if this applies to your purpose code. Can be up to 30 characters. Mandatory if supplying `invoice_date`.
         */
        @JsonSetter("invoice_number")
        public Builder invoiceNumber(Optional<String> invoiceNumber) {
            this.invoiceNumber = invoiceNumber;
            return this;
        }

        /**
         * Sets value for `invoiceNumber`
         * The invoice number related to the payment. Necessary when making business-related INR payments, check our <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430000-Payment-Purpose-Codes">support article</a> to see if this applies to your purpose code. Can be up to 30 characters. Mandatory if supplying `invoice_date`.
         */
        public Builder invoiceNumber(String invoiceNumber) {
            return this.invoiceNumber(Optional.ofNullable(invoiceNumber));
        }
        /**
         * Sets value for `onBehalfOf`
         * A contact UUID for the sub-account you're acting on behalf of. Payer details parameters should not be sent if using on_behalf_of, they will be populated using the details from the sub-account.
         */
        @JsonSetter("on_behalf_of")
        public Builder onBehalfOf(Optional<String> onBehalfOf) {
            this.onBehalfOf = onBehalfOf;
            return this;
        }

        /**
         * Sets value for `onBehalfOf`
         * A contact UUID for the sub-account you're acting on behalf of. Payer details parameters should not be sent if using on_behalf_of, they will be populated using the details from the sub-account.
         */
        public Builder onBehalfOf(String onBehalfOf) {
            return this.onBehalfOf(Optional.ofNullable(onBehalfOf));
        }
        /**
         * Sets value for `payerAddress`
         * First line of address.
         */
        @JsonSetter("payer_address")
        public Builder payerAddress(Optional<String> payerAddress) {
            this.payerAddress = payerAddress;
            return this;
        }

        /**
         * Sets value for `payerAddress`
         * First line of address.
         */
        public Builder payerAddress(String payerAddress) {
            return this.payerAddress(Optional.ofNullable(payerAddress));
        }
        /**
         * Sets value for `payerCity`
         * City name, should not consist of only numbers.
         */
        @JsonSetter("payer_city")
        public Builder payerCity(Optional<String> payerCity) {
            this.payerCity = payerCity;
            return this;
        }

        /**
         * Sets value for `payerCity`
         * City name, should not consist of only numbers.
         */
        public Builder payerCity(String payerCity) {
            return this.payerCity(Optional.ofNullable(payerCity));
        }
        /**
         * Sets value for `payerCompanyName`
         * Required if "payer_entity_type" is "company".
         */
        @JsonSetter("payer_company_name")
        public Builder payerCompanyName(Optional<String> payerCompanyName) {
            this.payerCompanyName = payerCompanyName;
            return this;
        }

        /**
         * Sets value for `payerCompanyName`
         * Required if "payer_entity_type" is "company".
         */
        public Builder payerCompanyName(String payerCompanyName) {
            return this.payerCompanyName(Optional.ofNullable(payerCompanyName));
        }
        /**
         * Sets value for `payerCountry`
         * Two-letter ISO country code.
         */
        @JsonSetter("payer_country")
        public Builder payerCountry(Optional<String> payerCountry) {
            this.payerCountry = payerCountry;
            return this;
        }

        /**
         * Sets value for `payerCountry`
         * Two-letter ISO country code.
         */
        public Builder payerCountry(String payerCountry) {
            return this.payerCountry(Optional.ofNullable(payerCountry));
        }
        /**
         * Sets value for `payerDateOfBirth`
         * If "payer_entity_type" is "company", this is the company registration date. If "payer_entity_type" is "individual", this is date of birth. ISO 8601 format YYYY-MM-DD.
         */
        @JsonSetter("payer_date_of_birth")
        public Builder payerDateOfBirth(Optional<String> payerDateOfBirth) {
            this.payerDateOfBirth = payerDateOfBirth;
            return this;
        }

        /**
         * Sets value for `payerDateOfBirth`
         * If "payer_entity_type" is "company", this is the company registration date. If "payer_entity_type" is "individual", this is date of birth. ISO 8601 format YYYY-MM-DD.
         */
        public Builder payerDateOfBirth(String payerDateOfBirth) {
            return this.payerDateOfBirth(Optional.ofNullable(payerDateOfBirth));
        }
        /**
         * Sets value for `payerEntityType`
         * Legal entity
         */
        @JsonSetter("payer_entity_type")
        public Builder payerEntityType(Optional<PaymentsCreateBodyPayerEntityTypeEnum> payerEntityType) {
            this.payerEntityType = payerEntityType;
            return this;
        }

        /**
         * Sets value for `payerEntityType`
         * Legal entity
         */
        public Builder payerEntityType(PaymentsCreateBodyPayerEntityTypeEnum payerEntityType) {
            return this.payerEntityType(Optional.ofNullable(payerEntityType));
        }
        /**
         * Sets value for `payerFirstName`
         * Required if "payer_entity_type" is "individual".
         */
        @JsonSetter("payer_first_name")
        public Builder payerFirstName(Optional<String> payerFirstName) {
            this.payerFirstName = payerFirstName;
            return this;
        }

        /**
         * Sets value for `payerFirstName`
         * Required if "payer_entity_type" is "individual".
         */
        public Builder payerFirstName(String payerFirstName) {
            return this.payerFirstName(Optional.ofNullable(payerFirstName));
        }
        /**
         * Sets value for `payerIdentificationType`
         * A legal document that verifies the identity of the payer. Required documentation will vary depending on the nationality or registered address of the payer.
         */
        @JsonSetter("payer_identification_type")
        public Builder payerIdentificationType(Optional<PaymentsCreateBodyPayerIdentificationTypeEnum>
                                               payerIdentificationType) {
            this.payerIdentificationType = payerIdentificationType;
            return this;
        }

        /**
         * Sets value for `payerIdentificationType`
         * A legal document that verifies the identity of the payer. Required documentation will vary depending on the nationality or registered address of the payer.
         */
        public Builder payerIdentificationType(PaymentsCreateBodyPayerIdentificationTypeEnum
                                               payerIdentificationType) {
            return this.payerIdentificationType(Optional.ofNullable(payerIdentificationType));
        }
        /**
         * Sets value for `payerIdentificationValue`
         * A unique reference code for the identification document, such as a passport number.
         */
        @JsonSetter("payer_identification_value")
        public Builder payerIdentificationValue(Optional<String> payerIdentificationValue) {
            this.payerIdentificationValue = payerIdentificationValue;
            return this;
        }

        /**
         * Sets value for `payerIdentificationValue`
         * A unique reference code for the identification document, such as a passport number.
         */
        public Builder payerIdentificationValue(String payerIdentificationValue) {
            return this.payerIdentificationValue(Optional.ofNullable(payerIdentificationValue));
        }
        /**
         * Sets value for `payerLastName`
         * Required if "payer_entity_type" is "individual". Cannot contain any numbers or company signifiers.
         */
        @JsonSetter("payer_last_name")
        public Builder payerLastName(Optional<String> payerLastName) {
            this.payerLastName = payerLastName;
            return this;
        }

        /**
         * Sets value for `payerLastName`
         * Required if "payer_entity_type" is "individual". Cannot contain any numbers or company signifiers.
         */
        public Builder payerLastName(String payerLastName) {
            return this.payerLastName(Optional.ofNullable(payerLastName));
        }
        /**
         * Sets value for `payerPostcode`
         * Postal code
         */
        @JsonSetter("payer_postcode")
        public Builder payerPostcode(Optional<String> payerPostcode) {
            this.payerPostcode = payerPostcode;
            return this;
        }

        /**
         * Sets value for `payerPostcode`
         * Postal code
         */
        public Builder payerPostcode(String payerPostcode) {
            return this.payerPostcode(Optional.ofNullable(payerPostcode));
        }
        /**
         * Sets value for `payerStateOrProvince`
         * State or province.
         */
        @JsonSetter("payer_state_or_province")
        public Builder payerStateOrProvince(Optional<String> payerStateOrProvince) {
            this.payerStateOrProvince = payerStateOrProvince;
            return this;
        }

        /**
         * Sets value for `payerStateOrProvince`
         * State or province.
         */
        public Builder payerStateOrProvince(String payerStateOrProvince) {
            return this.payerStateOrProvince(Optional.ofNullable(payerStateOrProvince));
        }
        /**
         * Sets value for `paymentDate`
         * Instructed date of payment - on this date we will attempt to debit funds on the account and submit the payment to the scheme. If the payment cannot be submitted before the cut-off (i.e. due to lack of funding), we will re-attempt on the next working day. Defaults to the earliest possible date if not passed as parameter. Any valid ISO 8601 format, e.g. "2023-12-31.
         */
        @JsonSetter("payment_date")
        public Builder paymentDate(Optional<String> paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }

        /**
         * Sets value for `paymentDate`
         * Instructed date of payment - on this date we will attempt to debit funds on the account and submit the payment to the scheme. If the payment cannot be submitted before the cut-off (i.e. due to lack of funding), we will re-attempt on the next working day. Defaults to the earliest possible date if not passed as parameter. Any valid ISO 8601 format, e.g. "2023-12-31.
         */
        public Builder paymentDate(String paymentDate) {
            return this.paymentDate(Optional.ofNullable(paymentDate));
        }
        /**
         * Sets value for `paymentType`
         * Currencycloud supports two types of payments: "priority", made using the Swift network; and "regular", made using the local bank network.
         */
        @JsonSetter("payment_type")
        public Builder paymentType(Optional<PaymentsCreateBodyPaymentTypeEnum> paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Sets value for `paymentType`
         * Currencycloud supports two types of payments: "priority", made using the Swift network; and "regular", made using the local bank network.
         */
        public Builder paymentType(PaymentsCreateBodyPaymentTypeEnum paymentType) {
            return this.paymentType(Optional.ofNullable(paymentType));
        }
        /**
         * Sets value for `purposeCode`
         * <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430000-Payment-Purpose-Codes">Payment Purpose Code</a> (Mandatory for all local INR and MYR payments, Swift CNY payments, and Swift payments in any currency to banks in Bahrain or the United Arab Emirates).
         */
        @JsonSetter("purpose_code")
        public Builder purposeCode(Optional<String> purposeCode) {
            this.purposeCode = purposeCode;
            return this;
        }

        /**
         * Sets value for `purposeCode`
         * <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430000-Payment-Purpose-Codes">Payment Purpose Code</a> (Mandatory for all local INR and MYR payments, Swift CNY payments, and Swift payments in any currency to banks in Bahrain or the United Arab Emirates).
         */
        public Builder purposeCode(String purposeCode) {
            return this.purposeCode(Optional.ofNullable(purposeCode));
        }
        /**
         * Sets value for `reason`
         * User-generated reason for payment - freeform text.
         */
        @JsonSetter("reason")
        public Builder reason(String reason) {
            if (reason == null) {
                throw new IllegalArgumentException("reason cannot be null");
            }

            this.reason = reason;
            return this;
        }
        /**
         * Sets value for `reference`
         * User-generated reference code.
         */
        @JsonSetter("reference")
        public Builder reference(String reference) {
            if (reference == null) {
                throw new IllegalArgumentException("reference cannot be null");
            }

            this.reference = reference;
            return this;
        }
        /**
         * Sets value for `ultimateBeneficiaryName`
         * The name of the ultimate beneficiary if different.
         */
        @JsonSetter("ultimate_beneficiary_name")
        public Builder ultimateBeneficiaryName(Optional<String> ultimateBeneficiaryName) {
            this.ultimateBeneficiaryName = ultimateBeneficiaryName;
            return this;
        }

        /**
         * Sets value for `ultimateBeneficiaryName`
         * The name of the ultimate beneficiary if different.
         */
        public Builder ultimateBeneficiaryName(String ultimateBeneficiaryName) {
            return this.ultimateBeneficiaryName(Optional.ofNullable(ultimateBeneficiaryName));
        }
        /**
         * Sets value for `uniqueRequestId`
         * User-generated idempotency key.
         */
        @JsonSetter("unique_request_id")
        public Builder uniqueRequestId(String uniqueRequestId) {
            if (uniqueRequestId == null) {
                throw new IllegalArgumentException("uniqueRequestId cannot be null");
            }

            this.uniqueRequestId = uniqueRequestId;
            return this;
        }



        public PaymentsCreateBody build() {
            if (amount == null) {
                throw new IllegalStateException("amount is required");
            }

            if (beneficiaryId == null) {
                throw new IllegalStateException("beneficiaryId is required");
            }

            if (currency == null) {
                throw new IllegalStateException("currency is required");
            }

            if (reason == null) {
                throw new IllegalStateException("reason is required");
            }

            if (reference == null) {
                throw new IllegalStateException("reference is required");
            }

            if (uniqueRequestId == null) {
                throw new IllegalStateException("uniqueRequestId is required");
            }

            return new PaymentsCreateBody(this);
        }
    }

}



