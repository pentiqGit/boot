package com.example.boot.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloController {

    @RequestMapping(value="/")
    private String hello(){
        return "Hello world★";
    }
}
