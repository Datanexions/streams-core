package org.datanexions.streams.config;

import java.util.List;

public class CollectionConfig {
    private String collection;
    private List<FieldConfig> fields;

    public String getCollection() {return collection;}
    public void setCollection(String collection) {this.collection = collection;}
    public List<FieldConfig> getFields() {return fields;}
    public void setFields(List<FieldConfig> fields) {this.fields = fields;}
}
