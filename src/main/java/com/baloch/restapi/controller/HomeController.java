package com.baloch.restapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {


    @RequestMapping("/")
    public String Index(){
        return "Hello World from Spring Boot!";
    }

}
