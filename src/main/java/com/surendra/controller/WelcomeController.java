package com.surendra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String getMessage(){
        return "<html><body><h1 style='color:blue'>Welcome to Docker...!!!</h1><br><h3>"+new Date()+"</h3></body></html>";
    }
}
