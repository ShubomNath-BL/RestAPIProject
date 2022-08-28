package com.example.restapicalls.service;

import com.example.restapicalls.entity.HelloModel;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String returnData(){
        String response = "Hello & welcome to spring boot";
        return response;
    }

    public String recieveData(){
        String result = "Hello to spring boot";
        return result;
    }

    public String postData(HelloModel model) {
        String response = "Hello "+model.getFirstName()+" "+model.getLastName();
        return response;
    }

    public String requestMappingData(String name) {
        String response = "Hello "+name;
        return response;
    }

    public String requestParamData(String name) {
        String response = "Hello "+name;
        return response;
    }
}
