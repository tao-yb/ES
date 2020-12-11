package com.tyb1222.es.client;

import java.util.List;

public interface ElasticsearchOperations {

    <T> T queryForObject(String id);

    <T> List<T> queryForList(String id);

    <T> List<T> findAll(Class<T> clazz);

    <T> T match(Class<T> clazz);

}
