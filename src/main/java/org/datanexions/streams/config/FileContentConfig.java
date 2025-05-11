package org.datanexions.streams.config;

import java.util.List;

public class FileContentConfig {
    private String filePrefix;
    private String extension;
    private String separator;
    private Boolean hasHeaderLine;
    private List<ColumnConfig> columns;

    public String getFilePrefix() {return filePrefix;}
    public void setFilePrefix(String filePrefix) {this.filePrefix = filePrefix;}
    public String getExtension() {return extension;}
    public void setExtension(String extension) {this.extension = extension;}
    public String getSeparator() {return separator;}
    public void setSeparator(String separator) {this.separator = separator;}
    public Boolean getHasHeaderLine() {return hasHeaderLine;}
    public void setHasHeaderLine(Boolean hasHeaderLine) {this.hasHeaderLine = hasHeaderLine;}
    public List<ColumnConfig>  getColumns() {return columns;}
    public void setColumns(List<ColumnConfig>  columns) {this.columns = columns;}
}
