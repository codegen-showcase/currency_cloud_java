
package com.currencycloud.sdk.model;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * AccountsPaymentChargesSettingsListResponse
 */
@JsonDeserialize(builder = AccountsPaymentChargesSettingsListResponse.Builder.class)
public final class AccountsPaymentChargesSettingsListResponse {
    private final Optional<List<AccountPaymentChargesSetting>> paymentChargesSettings;


    private AccountsPaymentChargesSettingsListResponse(Builder builder) {
        this.paymentChargesSettings = builder.paymentChargesSettings;
    }

    /**
     * Retrieves value for `paymentChargesSettings`
     */
    @JsonProperty("payment_charges_settings")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<AccountPaymentChargesSetting>> getPaymentChargesSettings() {
        return paymentChargesSettings;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof AccountsPaymentChargesSettingsListResponse &&
               equalTo((AccountsPaymentChargesSettingsListResponse) other);
    }

    private boolean equalTo(AccountsPaymentChargesSettingsListResponse other) {
        return
            paymentChargesSettings.equals(other.paymentChargesSettings)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.paymentChargesSettings
               );
    }

    @Override
    public String toString() {
        return "AccountsPaymentChargesSettingsListResponse{" +
               "paymentChargesSettings=" + paymentChargesSettings +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<List<AccountPaymentChargesSetting>> paymentChargesSettings = Optional.empty();


        private Builder() {}

        public Builder from(AccountsPaymentChargesSettingsListResponse other) {
            paymentChargesSettings(other.getPaymentChargesSettings());
            return this;
        }

        /**
         * Sets value for `paymentChargesSettings`
         */
        @JsonSetter("payment_charges_settings")
        public Builder paymentChargesSettings(Optional<List<AccountPaymentChargesSetting>>
                                              paymentChargesSettings) {
            this.paymentChargesSettings = paymentChargesSettings;
            return this;
        }

        /**
         * Sets value for `paymentChargesSettings`
         */
        public Builder paymentChargesSettings(List<AccountPaymentChargesSetting> paymentChargesSettings) {
            return this.paymentChargesSettings(Optional.ofNullable(paymentChargesSettings));
        }



        public AccountsPaymentChargesSettingsListResponse build() {
            return new AccountsPaymentChargesSettingsListResponse(this);
        }
    }

}



