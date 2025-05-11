package org.datanexions.streams.config;

import java.util.List;

public class SheetContentConfig {
    private String sheet;
    private Boolean hasHeaderLine;
    private List<ColumnConfig> columns;

    public String getSheet() {return sheet;}
    public void setSheet(String sheet) {this.sheet = sheet;}
    public Boolean getHasHeaderLine() {return hasHeaderLine;}
    public void setHasHeaderLine(Boolean hasHeaderLine) {this.hasHeaderLine = hasHeaderLine;}
    public List<ColumnConfig>  getColumns() {return columns;}
    public void setColumns(List<ColumnConfig>  columns) {this.columns = columns;}
}
