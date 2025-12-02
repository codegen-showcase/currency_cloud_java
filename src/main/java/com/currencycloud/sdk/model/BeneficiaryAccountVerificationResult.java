
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Beneficiary account verification result.
 */
@JsonDeserialize(builder = BeneficiaryAccountVerificationResult.Builder.class)
public final class BeneficiaryAccountVerificationResult {
    /**
     * The actual name of the account holder.
     */
    private final Optional<String> actualName;

    /**
     * The account verification result - 'full_match', 'close_match' or 'no_match'.
     */
    private final Optional<BeneficiaryAccountVerificationResultAnswerEnum> answer;

    /**
     * Description of the reason.
     */
    private final Optional<String> reason;

    /**
     * Encoded reason.
     */
    private final Optional<String> reasonCode;

    /**
     * Category of reason - 'okay', 'warning' or 'rejected'.
     */
    private final Optional<String> reasonType;


    private BeneficiaryAccountVerificationResult(Builder builder) {
        this.actualName = builder.actualName;
        this.answer = builder.answer;
        this.reason = builder.reason;
        this.reasonCode = builder.reasonCode;
        this.reasonType = builder.reasonType;
    }

    /**
     * Retrieves value for `actualName`
     * The actual name of the account holder.
     */
    @JsonProperty("actual_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getActualName() {
        return actualName;
    }
    /**
     * Retrieves value for `answer`
     * The account verification result - 'full_match', 'close_match' or 'no_match'.
     */
    @JsonProperty("answer")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<BeneficiaryAccountVerificationResultAnswerEnum> getAnswer() {
        return answer;
    }
    /**
     * Retrieves value for `reason`
     * Description of the reason.
     */
    @JsonProperty("reason")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getReason() {
        return reason;
    }
    /**
     * Retrieves value for `reasonCode`
     * Encoded reason.
     */
    @JsonProperty("reason_code")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getReasonCode() {
        return reasonCode;
    }
    /**
     * Retrieves value for `reasonType`
     * Category of reason - 'okay', 'warning' or 'rejected'.
     */
    @JsonProperty("reason_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getReasonType() {
        return reasonType;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof BeneficiaryAccountVerificationResult &&
               equalTo((BeneficiaryAccountVerificationResult) other);
    }

    private boolean equalTo(BeneficiaryAccountVerificationResult other) {
        return
            actualName.equals(other.actualName) &&

            answer.equals(other.answer) &&

            reason.equals(other.reason) &&

            reasonCode.equals(other.reasonCode) &&

            reasonType.equals(other.reasonType)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.actualName,
                   this.answer,
                   this.reason,
                   this.reasonCode,
                   this.reasonType
               );
    }

    @Override
    public String toString() {
        return "BeneficiaryAccountVerificationResult{" +
               "actualName=" + actualName + ", " +
               "answer=" + answer + ", " +
               "reason=" + reason + ", " +
               "reasonCode=" + reasonCode + ", " +
               "reasonType=" + reasonType +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The actual name of the account holder.
         */
        private Optional<String> actualName = Optional.empty();

        /**
         * The account verification result - 'full_match', 'close_match' or 'no_match'.
         */
        private Optional<BeneficiaryAccountVerificationResultAnswerEnum> answer = Optional.empty();

        /**
         * Description of the reason.
         */
        private Optional<String> reason = Optional.empty();

        /**
         * Encoded reason.
         */
        private Optional<String> reasonCode = Optional.empty();

        /**
         * Category of reason - 'okay', 'warning' or 'rejected'.
         */
        private Optional<String> reasonType = Optional.empty();


        private Builder() {}

        public Builder from(BeneficiaryAccountVerificationResult other) {
            actualName(other.getActualName());
            answer(other.getAnswer());
            reason(other.getReason());
            reasonCode(other.getReasonCode());
            reasonType(other.getReasonType());
            return this;
        }

        /**
         * Sets value for `actualName`
         * The actual name of the account holder.
         */
        @JsonSetter("actual_name")
        public Builder actualName(Optional<String> actualName) {
            this.actualName = actualName;
            return this;
        }

        /**
         * Sets value for `actualName`
         * The actual name of the account holder.
         */
        public Builder actualName(String actualName) {
            return this.actualName(Optional.ofNullable(actualName));
        }
        /**
         * Sets value for `answer`
         * The account verification result - 'full_match', 'close_match' or 'no_match'.
         */
        @JsonSetter("answer")
        public Builder answer(Optional<BeneficiaryAccountVerificationResultAnswerEnum> answer) {
            this.answer = answer;
            return this;
        }

        /**
         * Sets value for `answer`
         * The account verification result - 'full_match', 'close_match' or 'no_match'.
         */
        public Builder answer(BeneficiaryAccountVerificationResultAnswerEnum answer) {
            return this.answer(Optional.ofNullable(answer));
        }
        /**
         * Sets value for `reason`
         * Description of the reason.
         */
        @JsonSetter("reason")
        public Builder reason(Optional<String> reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Sets value for `reason`
         * Description of the reason.
         */
        public Builder reason(String reason) {
            return this.reason(Optional.ofNullable(reason));
        }
        /**
         * Sets value for `reasonCode`
         * Encoded reason.
         */
        @JsonSetter("reason_code")
        public Builder reasonCode(Optional<String> reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * Sets value for `reasonCode`
         * Encoded reason.
         */
        public Builder reasonCode(String reasonCode) {
            return this.reasonCode(Optional.ofNullable(reasonCode));
        }
        /**
         * Sets value for `reasonType`
         * Category of reason - 'okay', 'warning' or 'rejected'.
         */
        @JsonSetter("reason_type")
        public Builder reasonType(Optional<String> reasonType) {
            this.reasonType = reasonType;
            return this;
        }

        /**
         * Sets value for `reasonType`
         * Category of reason - 'okay', 'warning' or 'rejected'.
         */
        public Builder reasonType(String reasonType) {
            return this.reasonType(Optional.ofNullable(reasonType));
        }



        public BeneficiaryAccountVerificationResult build() {
            return new BeneficiaryAccountVerificationResult(this);
        }
    }

}



