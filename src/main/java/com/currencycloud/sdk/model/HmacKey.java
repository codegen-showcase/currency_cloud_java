
package com.currencycloud.sdk.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * HMAC Key.
 */
@JsonDeserialize(builder = HmacKey.Builder.class)
public final class HmacKey {
    /**
     * The generated HMAC Key.
     */
    private final String hmacKey;

    private final Map<String, Object> additionalProperties;


    private HmacKey(Builder builder) {
        this.hmacKey = builder.hmacKey;
        this.additionalProperties = builder.additionalProperties;
    }

    /**
     * Retrieves value for `hmacKey`
     * The generated HMAC Key.
     */
    @JsonProperty("hmac_key")
    public String getHmacKey() {
        return hmacKey;
    }
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof HmacKey && equalTo((HmacKey) other);
    }

    private boolean equalTo(HmacKey other) {
        return
            hmacKey.equals(other.hmacKey)
            &&
            additionalProperties.equals(other.additionalProperties)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.hmacKey
                   ,
                   this.additionalProperties
               );
    }

    @Override
    public String toString() {
        return "HmacKey{" +
               "hmacKey=" + hmacKey +
               ", additionalProperties=" + additionalProperties +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The generated HMAC Key.
         */
        private String hmacKey = null;

        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(HmacKey other) {
            hmacKey(other.getHmacKey());
            additionalProperties(other.getAdditionalProperties());
            return this;
        }

        /**
         * Sets value for `hmacKey`
         * The generated HMAC Key.
         */
        @JsonSetter("hmac_key")
        public Builder hmacKey(String hmacKey) {
            if (hmacKey == null) {
                throw new IllegalArgumentException("hmacKey cannot be null");
            }

            this.hmacKey = hmacKey;
            return this;
        }

        @JsonAnySetter
        public Builder additionalProperty(String key, Object value) {
            this.additionalProperties.put(key, value);
            return this;
        }

        public Builder additionalProperties(Map<String, Object> additionalProperties) {
            this.additionalProperties.putAll(additionalProperties);
            return this;
        }



        public HmacKey build() {
            if (hmacKey == null) {
                throw new IllegalStateException("hmacKey is required");
            }

            return new HmacKey(this);
        }
    }

}



