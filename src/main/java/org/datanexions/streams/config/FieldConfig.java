package org.datanexions.streams.config;

import java.util.List;

public class FieldConfig {
    private String field; // Field name
    private String type; // Field type (e.g., string, integer, double, object, array)
    private String description;
    private List<FieldConfig> properties; // For "object" type fields
    private List<FieldConfig>  items; // For "array" type fields
    private boolean required; // Whether the field is mandatory

    public String getField() {return field;}
    public void setField(String field) {this.field = field;}
    public String getType() {return type;}
    public void setType(String type) {this.type = type;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public List<FieldConfig>  getProperties() {return properties;}
    public void setProperties(List<FieldConfig>  properties) {this.properties = properties;}
    public List<FieldConfig>   getItems() {return items;}
    public void setItems(List<FieldConfig>   items) {this.items = items;}
    public boolean isRequired() {return required;}
    public void setRequired(boolean required) {this.required = required;}
}
