
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * The sender information
 */
@JsonDeserialize(builder = SenderInformation.Builder.class)
public final class SenderInformation {
    /**
     * The sender account number
     */
    private final Optional<String> senderAccountNumber;

    /**
     * The unstructured sender address
     */
    private final Optional<String> senderAddress;

    /**
     * The sender bic
     */
    private final Optional<String> senderBic;

    /**
     * The two letter sender country
     */
    private final Optional<String> senderCountry;

    /**
     * The sender iban
     */
    private final Optional<String> senderIban;

    /**
     * The sender id
     */
    private final Optional<String> senderId;

    /**
     * The sender name
     */
    private final Optional<String> senderName;

    /**
     * The sender routing code
     */
    private final Optional<String> senderRoutingCode;


    private SenderInformation(Builder builder) {
        this.senderAccountNumber = builder.senderAccountNumber;
        this.senderAddress = builder.senderAddress;
        this.senderBic = builder.senderBic;
        this.senderCountry = builder.senderCountry;
        this.senderIban = builder.senderIban;
        this.senderId = builder.senderId;
        this.senderName = builder.senderName;
        this.senderRoutingCode = builder.senderRoutingCode;
    }

    /**
     * Retrieves value for `senderAccountNumber`
     * The sender account number
     */
    @JsonProperty("sender_account_number")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSenderAccountNumber() {
        return senderAccountNumber;
    }
    /**
     * Retrieves value for `senderAddress`
     * The unstructured sender address
     */
    @JsonProperty("sender_address")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSenderAddress() {
        return senderAddress;
    }
    /**
     * Retrieves value for `senderBic`
     * The sender bic
     */
    @JsonProperty("sender_bic")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSenderBic() {
        return senderBic;
    }
    /**
     * Retrieves value for `senderCountry`
     * The two letter sender country
     */
    @JsonProperty("sender_country")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSenderCountry() {
        return senderCountry;
    }
    /**
     * Retrieves value for `senderIban`
     * The sender iban
     */
    @JsonProperty("sender_iban")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSenderIban() {
        return senderIban;
    }
    /**
     * Retrieves value for `senderId`
     * The sender id
     */
    @JsonProperty("sender_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSenderId() {
        return senderId;
    }
    /**
     * Retrieves value for `senderName`
     * The sender name
     */
    @JsonProperty("sender_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSenderName() {
        return senderName;
    }
    /**
     * Retrieves value for `senderRoutingCode`
     * The sender routing code
     */
    @JsonProperty("sender_routing_code")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSenderRoutingCode() {
        return senderRoutingCode;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof SenderInformation && equalTo((SenderInformation) other);
    }

    private boolean equalTo(SenderInformation other) {
        return
            senderAccountNumber.equals(other.senderAccountNumber) &&

            senderAddress.equals(other.senderAddress) &&

            senderBic.equals(other.senderBic) &&

            senderCountry.equals(other.senderCountry) &&

            senderIban.equals(other.senderIban) &&

            senderId.equals(other.senderId) &&

            senderName.equals(other.senderName) &&

            senderRoutingCode.equals(other.senderRoutingCode)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.senderAccountNumber,
                   this.senderAddress,
                   this.senderBic,
                   this.senderCountry,
                   this.senderIban,
                   this.senderId,
                   this.senderName,
                   this.senderRoutingCode
               );
    }

    @Override
    public String toString() {
        return "SenderInformation{" +
               "senderAccountNumber=" + senderAccountNumber + ", " +
               "senderAddress=" + senderAddress + ", " +
               "senderBic=" + senderBic + ", " +
               "senderCountry=" + senderCountry + ", " +
               "senderIban=" + senderIban + ", " +
               "senderId=" + senderId + ", " +
               "senderName=" + senderName + ", " +
               "senderRoutingCode=" + senderRoutingCode +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The sender account number
         */
        private Optional<String> senderAccountNumber = Optional.empty();

        /**
         * The unstructured sender address
         */
        private Optional<String> senderAddress = Optional.empty();

        /**
         * The sender bic
         */
        private Optional<String> senderBic = Optional.empty();

        /**
         * The two letter sender country
         */
        private Optional<String> senderCountry = Optional.empty();

        /**
         * The sender iban
         */
        private Optional<String> senderIban = Optional.empty();

        /**
         * The sender id
         */
        private Optional<String> senderId = Optional.empty();

        /**
         * The sender name
         */
        private Optional<String> senderName = Optional.empty();

        /**
         * The sender routing code
         */
        private Optional<String> senderRoutingCode = Optional.empty();


        private Builder() {}

        public Builder from(SenderInformation other) {
            senderAccountNumber(other.getSenderAccountNumber());
            senderAddress(other.getSenderAddress());
            senderBic(other.getSenderBic());
            senderCountry(other.getSenderCountry());
            senderIban(other.getSenderIban());
            senderId(other.getSenderId());
            senderName(other.getSenderName());
            senderRoutingCode(other.getSenderRoutingCode());
            return this;
        }

        /**
         * Sets value for `senderAccountNumber`
         * The sender account number
         */
        @JsonSetter("sender_account_number")
        public Builder senderAccountNumber(Optional<String> senderAccountNumber) {
            this.senderAccountNumber = senderAccountNumber;
            return this;
        }

        /**
         * Sets value for `senderAccountNumber`
         * The sender account number
         */
        public Builder senderAccountNumber(String senderAccountNumber) {
            return this.senderAccountNumber(Optional.ofNullable(senderAccountNumber));
        }
        /**
         * Sets value for `senderAddress`
         * The unstructured sender address
         */
        @JsonSetter("sender_address")
        public Builder senderAddress(Optional<String> senderAddress) {
            this.senderAddress = senderAddress;
            return this;
        }

        /**
         * Sets value for `senderAddress`
         * The unstructured sender address
         */
        public Builder senderAddress(String senderAddress) {
            return this.senderAddress(Optional.ofNullable(senderAddress));
        }
        /**
         * Sets value for `senderBic`
         * The sender bic
         */
        @JsonSetter("sender_bic")
        public Builder senderBic(Optional<String> senderBic) {
            this.senderBic = senderBic;
            return this;
        }

        /**
         * Sets value for `senderBic`
         * The sender bic
         */
        public Builder senderBic(String senderBic) {
            return this.senderBic(Optional.ofNullable(senderBic));
        }
        /**
         * Sets value for `senderCountry`
         * The two letter sender country
         */
        @JsonSetter("sender_country")
        public Builder senderCountry(Optional<String> senderCountry) {
            this.senderCountry = senderCountry;
            return this;
        }

        /**
         * Sets value for `senderCountry`
         * The two letter sender country
         */
        public Builder senderCountry(String senderCountry) {
            return this.senderCountry(Optional.ofNullable(senderCountry));
        }
        /**
         * Sets value for `senderIban`
         * The sender iban
         */
        @JsonSetter("sender_iban")
        public Builder senderIban(Optional<String> senderIban) {
            this.senderIban = senderIban;
            return this;
        }

        /**
         * Sets value for `senderIban`
         * The sender iban
         */
        public Builder senderIban(String senderIban) {
            return this.senderIban(Optional.ofNullable(senderIban));
        }
        /**
         * Sets value for `senderId`
         * The sender id
         */
        @JsonSetter("sender_id")
        public Builder senderId(Optional<String> senderId) {
            this.senderId = senderId;
            return this;
        }

        /**
         * Sets value for `senderId`
         * The sender id
         */
        public Builder senderId(String senderId) {
            return this.senderId(Optional.ofNullable(senderId));
        }
        /**
         * Sets value for `senderName`
         * The sender name
         */
        @JsonSetter("sender_name")
        public Builder senderName(Optional<String> senderName) {
            this.senderName = senderName;
            return this;
        }

        /**
         * Sets value for `senderName`
         * The sender name
         */
        public Builder senderName(String senderName) {
            return this.senderName(Optional.ofNullable(senderName));
        }
        /**
         * Sets value for `senderRoutingCode`
         * The sender routing code
         */
        @JsonSetter("sender_routing_code")
        public Builder senderRoutingCode(Optional<String> senderRoutingCode) {
            this.senderRoutingCode = senderRoutingCode;
            return this;
        }

        /**
         * Sets value for `senderRoutingCode`
         * The sender routing code
         */
        public Builder senderRoutingCode(String senderRoutingCode) {
            return this.senderRoutingCode(Optional.ofNullable(senderRoutingCode));
        }



        public SenderInformation build() {
            return new SenderInformation(this);
        }
    }

}



