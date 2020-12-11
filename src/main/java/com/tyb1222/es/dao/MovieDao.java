package com.tyb1222.es.dao;

import com.tyb1222.es.model.Movie;

import java.util.Optional;

public interface MovieDao {
    Optional<Movie> findById(String tid);
}
