package com.example.bys.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(String username) {
        System.out.println("hello" + username);
        return "hello"+username;

    }
}
