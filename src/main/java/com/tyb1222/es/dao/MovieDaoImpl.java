package com.tyb1222.es.dao;

import com.tyb1222.es.annotation.IndexSource;
import com.tyb1222.es.model.Movie;
import com.tyb1222.es.model.MovieQuery;
import com.tyb1222.es.respository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@IndexSource(indexName = "movie")
public class MovieDaoImpl extends ElasticsearchRepository<Movie, MovieQuery, String> implements MovieDao  {

    @Override
    public <S extends Movie> S save(S s) {
        return null;
    }

    @Override
    public <S extends Movie> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Movie> findById(String id) {
        return super.findById(id);
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<Movie> findAll() {
        return null;
    }

    @Override
    public Iterable<Movie> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Movie movie) {

    }

    @Override
    public void deleteAll(Iterable<? extends Movie> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
