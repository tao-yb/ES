package com.tyb1222.es.controller;

import com.tyb1222.es.model.Movie;
import com.tyb1222.es.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/movie")
    public Movie query(){
        final String id = "M7pOSXYBcYfKFADc71zS";
        return testService.find(id);
    }
}
