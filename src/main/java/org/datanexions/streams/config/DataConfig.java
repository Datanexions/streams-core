package org.datanexions.streams.config;

import java.util.List;
import java.util.Map;

public class DataConfig {
    private String connectionName;
    private List<FileHeaderColumnConfig> fileHeaderColumns;
    private String separator;
    private String fileprefix;
    private String extension;
    private List<SchemaConfig> schemas;
    private List<FileContentConfig> files;

    private List<SheetContentConfig> sheets;
    private List<ColumnConfig> columns;

    private List<CollectionConfig> collections;
    private List<EndpointConfig> endpoints;
    private ResponseConfig responseStructure;
    private List<String> streams;

    Map<String, String> additionalProperties;

    public String getConnectionName() {return connectionName;}
    public void setConnectionName(String connectionName) {this.connectionName = connectionName;}
    public List<FileHeaderColumnConfig> getFileHeaderColumns() {return fileHeaderColumns;}
    public void setFileHeaderColumns(List<FileHeaderColumnConfig> fileHeaderColumns) {this.fileHeaderColumns = fileHeaderColumns;}
    public String getSeparator() {return separator;}
    public void setSeparator(String separator) {this.separator = separator;}
    public String getFileprefix() {return fileprefix;}
    public void setFileprefix(String fileprefix) {this.fileprefix = fileprefix;}
    public String getExtension() {return extension;}
    public void setExtension(String extension) {this.extension = extension;}
    public List<SchemaConfig> getSchemas() {return schemas;}
    public void setSchemas(List<SchemaConfig> schemas) {this.schemas = schemas;}
    public List<FileContentConfig> getFiles() {return files;}
    public void setFiles(List<FileContentConfig> files) {this.files = files;}
    public List<SheetContentConfig> getSheets() {return sheets;}
    public void setSheets(List<SheetContentConfig> sheets) {this.sheets = sheets;}
    public List<ColumnConfig>  getColumns() {return columns;}
    public void setColumns(List<ColumnConfig>  tables) {this.columns = columns;}

    public List<CollectionConfig> getCollections() {return collections;}
    public void setCollections(List<CollectionConfig> collections) {this.collections = collections;}
    public List<EndpointConfig> getEndpoints() {return endpoints;}
    public void setEndpoints(List<EndpointConfig> endpoints) {this.endpoints = endpoints;}
    public ResponseConfig getResponseStructure() {return responseStructure;}
    public void setResponseStructure(ResponseConfig responseStructure) {this.responseStructure = responseStructure;}
    public List<String> getStreams() {return streams;}
    public void setStreams(List<String> streams) {this.streams = streams;}

    public Map<String, String> getAdditionalProperties() {return additionalProperties;}
    public void setAdditionalProperties(Map<String, String> additionalProperties) {this.additionalProperties = additionalProperties;}

}
