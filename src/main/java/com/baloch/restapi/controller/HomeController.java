package com.baloch.restapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {


    @RequestMapping("/")
    public String Index(){
        return "Hello World from Spring Boot!";
    }

    @RequestMapping("/public/hello")
    public String Hello(){
        return "Hello World from Spring Boot Public URL!";
    }

}
