
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Payment submission.
 */
@JsonDeserialize(builder = PaymentSubmissionInformation.Builder.class)
public final class PaymentSubmissionInformation {
    /**
     * MT103 or PACS008
     */
    private final Optional<String> format;

    /**
     * The Swift message
     */
    private final Optional<String> message;

    /**
     * The status of the submission.
     */
    private final Optional<PaymentSubmissionInformationStatusEnum> status;

    private final Optional<String> submissionRef;


    private PaymentSubmissionInformation(Builder builder) {
        this.format = builder.format;
        this.message = builder.message;
        this.status = builder.status;
        this.submissionRef = builder.submissionRef;
    }

    /**
     * Retrieves value for `format`
     * MT103 or PACS008
     */
    @JsonProperty("format")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getFormat() {
        return format;
    }
    /**
     * Retrieves value for `message`
     * The Swift message
     */
    @JsonProperty("message")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getMessage() {
        return message;
    }
    /**
     * Retrieves value for `status`
     * The status of the submission.
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<PaymentSubmissionInformationStatusEnum> getStatus() {
        return status;
    }
    /**
     * Retrieves value for `submissionRef`
     */
    @JsonProperty("submission_ref")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSubmissionRef() {
        return submissionRef;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof PaymentSubmissionInformation &&
               equalTo((PaymentSubmissionInformation) other);
    }

    private boolean equalTo(PaymentSubmissionInformation other) {
        return
            format.equals(other.format) &&

            message.equals(other.message) &&

            status.equals(other.status) &&

            submissionRef.equals(other.submissionRef)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.format,
                   this.message,
                   this.status,
                   this.submissionRef
               );
    }

    @Override
    public String toString() {
        return "PaymentSubmissionInformation{" +
               "format=" + format + ", " +
               "message=" + message + ", " +
               "status=" + status + ", " +
               "submissionRef=" + submissionRef +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * MT103 or PACS008
         */
        private Optional<String> format = Optional.empty();

        /**
         * The Swift message
         */
        private Optional<String> message = Optional.empty();

        /**
         * The status of the submission.
         */
        private Optional<PaymentSubmissionInformationStatusEnum> status = Optional.empty();

        private Optional<String> submissionRef = Optional.empty();


        private Builder() {}

        public Builder from(PaymentSubmissionInformation other) {
            format(other.getFormat());
            message(other.getMessage());
            status(other.getStatus());
            submissionRef(other.getSubmissionRef());
            return this;
        }

        /**
         * Sets value for `format`
         * MT103 or PACS008
         */
        @JsonSetter("format")
        public Builder format(Optional<String> format) {
            this.format = format;
            return this;
        }

        /**
         * Sets value for `format`
         * MT103 or PACS008
         */
        public Builder format(String format) {
            return this.format(Optional.ofNullable(format));
        }
        /**
         * Sets value for `message`
         * The Swift message
         */
        @JsonSetter("message")
        public Builder message(Optional<String> message) {
            this.message = message;
            return this;
        }

        /**
         * Sets value for `message`
         * The Swift message
         */
        public Builder message(String message) {
            return this.message(Optional.ofNullable(message));
        }
        /**
         * Sets value for `status`
         * The status of the submission.
         */
        @JsonSetter("status")
        public Builder status(Optional<PaymentSubmissionInformationStatusEnum> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets value for `status`
         * The status of the submission.
         */
        public Builder status(PaymentSubmissionInformationStatusEnum status) {
            return this.status(Optional.ofNullable(status));
        }
        /**
         * Sets value for `submissionRef`
         */
        @JsonSetter("submission_ref")
        public Builder submissionRef(Optional<String> submissionRef) {
            this.submissionRef = submissionRef;
            return this;
        }

        /**
         * Sets value for `submissionRef`
         */
        public Builder submissionRef(String submissionRef) {
            return this.submissionRef(Optional.ofNullable(submissionRef));
        }



        public PaymentSubmissionInformation build() {
            return new PaymentSubmissionInformation(this);
        }
    }

}



