package com.tyb1222.es.client;


import java.util.List;

public class ElasticsearchTemplate implements ElasticsearchOperations {

    private RestHighLevelClientFactoryBean restHighLevelClientFactoryBean;


    @Override
    public <T> T queryForObject(String id) {
        return null;
    }

    @Override
    public <T> List<T> queryForList(String id) {
        return null;
    }

    @Override
    public <T> List<T> findAll(Class<T> clazz) {
        return null;
    }

    @Override
    public <T> T match(Class<T> clazz) {
        return null;
    }
}
