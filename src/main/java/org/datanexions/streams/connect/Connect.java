package org.datanexions.streams.connect;

import org.datanexions.streams.config.*;

import java.util.Map;

public interface Connect<T> {
    void initialize(Map<String, String> config) throws Exception;
    void connect() throws Exception;
    void disconnect() throws Exception;
    T fetchData() throws Exception;
    T fetchData(CollectionConfig collectionConfig) throws Exception;
    T fetchData(TableConfig tableConfig) throws Exception;
    T fetchData(DataConfig dataConfig) throws Exception;
    String getConnectorName();
}