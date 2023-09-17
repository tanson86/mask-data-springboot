package com.example.datamasking.datamasking;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

//This class invoked when we define @MaskData on any filed.
//Name of this class we need to provide on @MaskData annotation in @JsonSerialize() ex. like @JsonSerialize(using = ProtectDataSerializer.class) this.
public class ProtectDataSerializer extends JsonSerializer {

    @Override
    public void serialize(Object value, JsonGenerator gen, SerializerProvider serializerProvider) throws IOException {
        String pii = value.toString().replaceAll("\\w(?=\\w{4})", "x");
        gen.writeString(pii);
    }
}
