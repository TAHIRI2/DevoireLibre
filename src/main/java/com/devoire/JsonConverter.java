package com.devoire;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConverter {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static String toJson(Object obj) throws Exception {
        return objectMapper.writeValueAsString(obj);
    }

    public static <T> T fromJson(String json, Class<T> clazz) throws Exception {
        return objectMapper.readValue(json, clazz);
    }
}
