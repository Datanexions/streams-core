package org.datanexions.streams.config;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonConfigLoader {

    public static ConnectionConfig loadConnectionConfig(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File(filePath), ConnectionConfig.class);
    }

    public static DataConfig loadDataConfig(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File(filePath), DataConfig.class);
    }
}