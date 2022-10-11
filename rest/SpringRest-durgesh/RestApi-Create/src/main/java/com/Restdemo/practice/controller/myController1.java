package com.Restdemo.practice.controller;

import com.Restdemo.practice.service.movieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController1 {
    @Autowired
    private movieService movieServices;

    @GetMapping("/movie")
    public String show(){
        return "this is book my show";
    }
}
