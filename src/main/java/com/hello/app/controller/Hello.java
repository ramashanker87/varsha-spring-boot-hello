package com.hello.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello From App";
    }
    @GetMapping("/greet")
    public String sayGreet(){
        return "Greeting From App";
    }
}
