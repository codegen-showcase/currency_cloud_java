
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * PayerRequirementsRequiredFieldsItem
 */
@JsonDeserialize(builder = PayerRequirementsRequiredFieldsItem.Builder.class)
public final class PayerRequirementsRequiredFieldsItem {
    private final Optional<String> name;

    private final Optional<String> validationRule;


    private PayerRequirementsRequiredFieldsItem(Builder builder) {
        this.name = builder.name;
        this.validationRule = builder.validationRule;
    }

    /**
     * Retrieves value for `name`
     */
    @JsonProperty("name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getName() {
        return name;
    }
    /**
     * Retrieves value for `validationRule`
     */
    @JsonProperty("validation_rule")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getValidationRule() {
        return validationRule;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof PayerRequirementsRequiredFieldsItem &&
               equalTo((PayerRequirementsRequiredFieldsItem) other);
    }

    private boolean equalTo(PayerRequirementsRequiredFieldsItem other) {
        return
            name.equals(other.name) &&

            validationRule.equals(other.validationRule)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.name,
                   this.validationRule
               );
    }

    @Override
    public String toString() {
        return "PayerRequirementsRequiredFieldsItem{" +
               "name=" + name + ", " +
               "validationRule=" + validationRule +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> name = Optional.empty();

        private Optional<String> validationRule = Optional.empty();


        private Builder() {}

        public Builder from(PayerRequirementsRequiredFieldsItem other) {
            name(other.getName());
            validationRule(other.getValidationRule());
            return this;
        }

        /**
         * Sets value for `name`
         */
        @JsonSetter("name")
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        /**
         * Sets value for `name`
         */
        public Builder name(String name) {
            return this.name(Optional.ofNullable(name));
        }
        /**
         * Sets value for `validationRule`
         */
        @JsonSetter("validation_rule")
        public Builder validationRule(Optional<String> validationRule) {
            this.validationRule = validationRule;
            return this;
        }

        /**
         * Sets value for `validationRule`
         */
        public Builder validationRule(String validationRule) {
            return this.validationRule(Optional.ofNullable(validationRule));
        }



        public PayerRequirementsRequiredFieldsItem build() {
            return new PayerRequirementsRequiredFieldsItem(this);
        }
    }

}



