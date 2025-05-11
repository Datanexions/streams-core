package org.datanexions.streams.config;

import com.fasterxml.jackson.databind.JsonNode;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;
import java.util.Map;

public class DataConfigUtil {

    public static Map<String, String> convertToMap(ConnectionConfig config) {
        Map<String, String> map = new LinkedHashMap<>();

        // === Primary connection details ===
        if (config.getConnectionName() != null) map.put("connectionName", config.getConnectionName());
        if (config.getConnectorClass() != null) map.put("connectorClass", config.getConnectorClass());
        if (config.getConnector() != null) map.put("connector", config.getConnector());
        if (config.getConnectionType() != null) map.put("connectionType", config.getConnectionType());
        if (config.getNoSqlDatabase() != null) map.put("noSqlDatabase", config.getNoSqlDatabase());
        if (config.getConnectionLocation() != null) map.put("connectionLocation", config.getConnectionLocation());

        // === File/Folder related ===
        if (config.getFolderPath() != null) map.put("folderPath", config.getFolderPath());

        // === MongoDB specific ===
        if (config.getDatabaseName() != null) map.put("databaseName", config.getDatabaseName());

        // === Cassandra specific ===
        if (config.getDatacenter() != null) map.put("datacenter", config.getDatacenter());
        if (config.getKeyspace() != null) map.put("keyspace", config.getKeyspace());
        if (config.getContactPoints() != null && !config.getContactPoints().isEmpty()) {
            map.put("contactPoints", String.join(",", config.getContactPoints()));
        }

        // === SQL or REST API ===
        if (config.getUrl() != null) map.put("url", config.getUrl());
        if (config.getUsername() != null) map.put("username", config.getUsername());
        if (config.getPassword() != null) map.put("password", config.getPassword());

        // === REST API Token ===
        if (config.getToken() != null) map.put("token", config.getToken());

        // === MinIO or Couchbase ===
        if (config.getEndpoint() != null) map.put("endpoint", config.getEndpoint());
        if (config.getPort() != null) map.put("port", String.valueOf(config.getPort()));
        if (config.getUseSSL() != null) map.put("useSSL", String.valueOf(config.getUseSSL()));
        if (config.getBucketName() != null) map.put("bucketName", config.getBucketName());

        // === Couchbase specific ===
        if (config.getScopeName() != null) map.put("scopeName", config.getScopeName());

        // === Authentication block (OAuth2) ===
        if (config.getAuthentication() != null) {
            AuthenticationConfig auth = config.getAuthentication();
            if (auth.getType() != null) map.put("authentication.type", auth.getType());
            if (auth.getTokenUrl() != null) map.put("authentication.tokenUrl", auth.getTokenUrl());
            if (auth.getClientId() != null) map.put("authentication.clientId", auth.getClientId());
            if (auth.getClientSecret() != null) map.put("authentication.clientSecret", auth.getClientSecret());
        }

        // === Additional properties ===
        if (config.getAdditionalProperties() != null) {
            for (Map.Entry<String, String> entry : config.getAdditionalProperties().entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                if (map.containsKey(key)) {
                    // Log a warning if an additional property is overwriting an existing key
                    LoggerFactory.getLogger("ConnectionConfig")
                            .warn("⚠️ Overriding standard connection property '{}' with value from additionalProperties.", key);
                }

                map.put(key, value);
            }
        }

        return map;
    }

    private static void flattenJson(String prefix, JsonNode node, Map<String, String> map) {
        if (node.isObject()) {
            node.fields().forEachRemaining(entry -> {
                String newPrefix = prefix.isEmpty() ? entry.getKey() : prefix + "." + entry.getKey();
                flattenJson(newPrefix, entry.getValue(), map);
            });
        } else if (node.isValueNode()) {
            map.put(prefix, node.asText());
        }
    }
}