package com.example.restapicalls.controller;

import com.example.restapicalls.entity.HelloModel;
import com.example.restapicalls.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class HelloController {

    @Autowired
    HelloService service;
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String getData(){
        String response = service.returnData();
        return response;
    }

    @GetMapping("/get")
    public String getNewData(){
        String result = service.recieveData();
        return result;
    }
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String hello(@RequestParam(value = "name") String name){
        String response = service.requestMappingData(name);
        return response;
    }
    @GetMapping("/param/{name}")
    public String helloParam(@PathVariable String name){
        String response = service.requestParamData(name);
        return response;
    }

    @PostMapping("/post")
    public String postNewData(@RequestBody HelloModel model){
        String response = service.postData(model);
        return response;
    }

    @PutMapping("/put/{firstName}")
    public String putNewData(@PathVariable String firstName,
                             @RequestParam(value = "lastName") String lastName,
                             @RequestParam(value = "id") int id){
        return "Hello "+firstName+" "+lastName+" with id number"+id;
    }
}
