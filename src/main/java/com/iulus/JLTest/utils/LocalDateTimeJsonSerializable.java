package com.iulus.JLTest.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.iulus.JLTest.common.constants.DatePatternConst;

import java.io.IOException;
import java.time.LocalDateTime;

public class LocalDateTimeJsonSerializable extends JsonSerializer<LocalDateTime> {
    public LocalDateTimeJsonSerializable() {
    }

    public void serialize(LocalDateTime value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString(DatePatternConst.DATE_TIME_FORMATTER.format(value));
    }
}