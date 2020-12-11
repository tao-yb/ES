package com.tyb1222.es.service;

import com.tyb1222.es.dao.MovieDao;
import com.tyb1222.es.dao.MovieDaoImpl;
import com.tyb1222.es.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private MovieDao movieDao;


    @Override
    public Movie find(String id) {
        return movieDao.findById(id);
    }
}
