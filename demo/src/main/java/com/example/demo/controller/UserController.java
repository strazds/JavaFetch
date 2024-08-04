package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @GetMapping("/user")
    @ResponseBody
    public String handleRequest(@RequestParam String param) {
        // Process the parameter and return a response
        return "Received parameter: " + param;
    }
}