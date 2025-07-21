package com.databaselearning.database.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass{

    @GetMapping("/name")
    public String getData(){
        return "hello my name is kanika";
    }

    @PostMapping("/greet")
    public String greetUser(@RequestBody String name) {
        String val = "Hello," + name + "!";
        return val.toString();
    }

}
