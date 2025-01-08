package com.example.first;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Firstcontroller {

    @RequestMapping("/hellos")
    public String hello(){
        return "hello world";
    }
    
}
