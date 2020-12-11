package com.tyb1222.es.respository;

import com.tyb1222.es.client.ElasticsearchOperations;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.Optional;

public class ElasticsearchRepository<T,Q,TID extends Serializable> implements CrudRepository<T,TID> {

    private ElasticsearchOperations elasticsearchOperations;


    @Override
    public <S extends T> S save(S s) {
        return null;
    }

    @Override
    public <S extends T> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<T> findById(TID tid) {
        return elasticsearchOperations.queryForObject((String) tid);
    }

    @Override
    public boolean existsById(TID tid) {
        return false;
    }

    @Override
    public Iterable<T> findAll() {
        return null;
    }

    @Override
    public Iterable<T> findAllById(Iterable<TID> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(TID tid) {

    }

    @Override
    public void delete(T t) {

    }

    @Override
    public void deleteAll(Iterable<? extends T> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
