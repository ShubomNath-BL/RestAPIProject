package com.example.restapicalls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class HelloController {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String getData(){
        return "Hello & welcome to spring boot";
    }

    @GetMapping("/get")
    public String getNewData(){
        return "Hello to spring boot";
    }
}
