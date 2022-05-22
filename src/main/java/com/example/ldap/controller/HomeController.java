package com.example.ldap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // defines what happens with a GET on endpoint
    @GetMapping("/")
    public String entry(){
        return "Welcome";
    }
}
