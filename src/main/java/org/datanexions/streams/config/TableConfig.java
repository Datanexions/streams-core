package org.datanexions.streams.config;

import java.util.List;

public class TableConfig {
    private String table;
    private List<ColumnConfig> columns;

    public String getTable() {return table;}
    public void setTable(String table) {this.table = table;}
    public List<ColumnConfig>  getColumns() {return columns;}
    public void setColumns(List<ColumnConfig>  columns) {this.columns = columns;}
}
