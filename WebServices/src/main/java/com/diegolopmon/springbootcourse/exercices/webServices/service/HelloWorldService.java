package com.diegolopmon.springbootcourse.exercices.webServices.service;

import com.diegolopmon.springbootcourse.exercices.webServices.configuration.HelloConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    HelloConfiguration helloConfiguration;

    @Autowired
    public void setHelloConfiguration(HelloConfiguration helloConfiguration){
        this.helloConfiguration = helloConfiguration;
    }


    @Override
    public String toString() {
        return "Hello " + helloConfiguration.getName()+"!!!!!!!";
    }
}
