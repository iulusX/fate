package com.iulus.JLTest.utils;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.base.Strings;
import com.iulus.JLTest.common.constants.DatePatternConst;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Objects;

public class LocalDateTimeJsonDeserializer extends JsonDeserializer<LocalDateTime> {
    public LocalDateTimeJsonDeserializer() {
    }

    public LocalDateTime deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        return !Objects.isNull(p) && !Strings.isNullOrEmpty(p.getText()) ? LocalDateTime.parse(p.getText(), DatePatternConst.DATE_TIME_FORMATTER) : null;
    }
}