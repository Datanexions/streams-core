package org.datanexions.streams.config;

import java.util.List;

public class SchemaConfig {
    private String schema;
    private List<TableConfig> tables;

    public String getSchema() {return schema;}
    public void setSchema(String schema) {this.schema = schema;}
    public List<TableConfig>  getTables() {return tables;}
    public void setTables(List<TableConfig>  tables) {this.tables = tables;}
}