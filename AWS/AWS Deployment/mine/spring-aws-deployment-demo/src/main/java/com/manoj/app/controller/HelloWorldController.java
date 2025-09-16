package com.manoj.app.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/app")
public class HelloWorldController {
    @GetMapping("/")
    public String getHomePage(){
        return "Welcome Page";
    }

    @GetMapping("/hello")
    public String getHelloWorldPage(){
        return "This is your second page";
    }
}
