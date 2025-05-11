package org.datanexions.streams.config;

import java.util.List;

public class EndpointConfig {
    private String endpoint;
    private String url;
    private List<FieldConfig> fields;

    public String getEndpoint() {return endpoint;}
    public void setEndpoint(String endpoint) {this.endpoint = endpoint;}
    public String getUrl() {return url;}
    public void setUrl(String url) {this.url = url;}
    public List<FieldConfig> getFields() {return fields;}
    public void setFields(List<FieldConfig> fields) {this.fields = fields;}
}
