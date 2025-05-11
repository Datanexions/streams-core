package org.datanexions.streams.config;

import java.util.List;
import java.util.Map;

public class ConnectionConfig {
    private String connectionName;
    private String connectorClass;
    private String connector;
    private String connectionType;
    private String noSqlDatabase; //mongodb, cassandra
    private String connectionLocation; //localhost, minio
    private String folderPath; //if files, databaseFiles
    private String databaseName; //if mongodb
    private String datacenter; //if cassandra
    private String keyspace; //if cassandra
    private List<String> contactPoints; //if cassandra
    private String url; //if database
    private String username; //if database
    private String password; //if database
    private AuthenticationConfig authentication;
    private String token; // if restAPI, field to store access token

    public String getToken() {return token;}
    public void setToken(String token) {this.token = token;}// if restAPI

    //if files or databaseFiles in minio
    private String endpoint;
    private Integer port; // also if cassandra
    private Boolean useSSL;
    private String bucketName;
    private String scopeName; //if couchbase

    private Map<String, String> additionalProperties;

    public String getConnectionName() {return connectionName;}
    public void setConnectionName(String connectionName) {this.connectionName = connectionName;}
    public String getConnectorClass() {return connectorClass;}
    public void setConnectorClass(String connectorClass) {this.connectorClass = connectorClass;}
    public String getConnector() {return connector;}
    public void setConnector(String connector) {this.connector = connector;}
    public String getConnectionType() { return connectionType; }
    public void setConnectionType(String connectionType) {this.connectionType = connectionType;}
    public String getNoSqlDatabase() { return noSqlDatabase; }
    public void setNoSqlDatabase(String noSqlDatabase) {this.noSqlDatabase = noSqlDatabase;}
    public String getConnectionLocation() { return connectionLocation; }
    public void setConnectionLocation(String connectionLocation) {this.connectionLocation = connectionLocation;}
    public String getFolderPath() { return folderPath; }
    public void setFolderPath(String folderPath) {this.folderPath = folderPath;}
    public String getUrl() {return url;}
    public void setUrl(String url) {this.url = url;}
    public String getDatabaseName() {return databaseName;}
    public void setDatabaseName(String databaseName) {this.databaseName = databaseName;}
    public List<String> getContactPoints() {return contactPoints;}
    public void setContactPoints(List<String> contactPoints) {this.contactPoints = contactPoints;}
    public String getDatacenter() {return datacenter;}
    public void setDatacenter(String datacenter) {this.datacenter = datacenter;}
    public String getKeyspace() {return keyspace;}
    public void setKeyspace(String keyspace) {this.keyspace = keyspace;}
    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}

    public String getEndpoint() {return endpoint;}
    public void setEndpoint(String endpoint) {this.endpoint = endpoint;}
    public Integer getPort() {return port;}
    public void setPort(Integer port) {this.port = port;}
    public Boolean getUseSSL() {return useSSL;}
    public void setUseSSL(Boolean useSSL) {this.useSSL = useSSL;}
    public String getBucketName() {return bucketName;}
    public void setBucketName(String bucketName) {this.bucketName = bucketName;}
    public String getScopeName() {return scopeName;}
    public void setScopeName(String scopeName) {this.scopeName = scopeName;}
    public AuthenticationConfig getAuthentication() {return authentication;}
    public void setAuthentication(AuthenticationConfig authentication) {this.authentication = authentication;}

    public Map<String, String> getAdditionalProperties() {return additionalProperties;}
    public void setAdditionalProperties(Map<String, String> additionalProperties) {this.additionalProperties = additionalProperties;}
}
