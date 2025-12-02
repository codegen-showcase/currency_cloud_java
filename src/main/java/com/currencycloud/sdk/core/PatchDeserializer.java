package com.currencycloud.sdk.core;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;

/**
 * Custom deserializer for Patch fields. This handles the deserialization
 * properly but should only be used when needed.
 */
public final class PatchDeserializer extends JsonDeserializer<Patch<?>> {

    @Override
    public Patch<?> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        Object value = p.readValueAs(Object.class);
        return Patch.of(value);
    }
}
