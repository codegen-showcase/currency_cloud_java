package com.currencycloud.sdk.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

/**
 * Custom serializer for Patch fields. - If wasSet() is false: skip the field
 * entirely (don't serialize) - If wasSet() is true but value is empty:
 * serialize as null - If wasSet() is true and value is present: serialize the
 * value
 */
public final class PatchSerializer extends JsonSerializer<Patch<?>> {

    @Override
    public void serialize(Patch<?> Patch, JsonGenerator gen,
                          SerializerProvider serializers) throws IOException {
        if (Patch.wasSet()) {
            if (Patch.getValue().isPresent()) {
                gen.writeObject(Patch.getValue().get());
            } else {
                gen.writeNull();
            }
        }

        // If not set, we don't write anything (field is omitted)
    }

    @Override
    public boolean isEmpty(SerializerProvider provider, Patch<?> value) {
        return !value.wasSet();
    }
}
