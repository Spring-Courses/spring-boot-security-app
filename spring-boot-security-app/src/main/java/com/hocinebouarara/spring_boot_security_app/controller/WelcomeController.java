package com.hocinebouarara.spring_boot_security_app.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping("/welcome")
    public String sayWelcome(){
        return "Welcome to Spring Application without security";
    }
}
