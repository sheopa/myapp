package com.app.helm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAppController {


    @GetMapping("/hello")
    public String getGreeting(){
        return "Hello Team, I am Live Now !!!!";
    }
}
