package com.sabzar.spring.rest.springrestdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("greeting")
    public String greeting(){
        log.info("*** User Controller get greating");
        return "Welcome to the DevOPP";
    }

    @GetMapping("greeting/{name}")
    public String greetingWithName(@PathVariable String name){
        log.info("*** User Controller get greating to "+name);
        return "Welcome to the DevOPP "+name;
    }

}
