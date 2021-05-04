package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class check2 {

    @GetMapping(value = "/")
    public String Print(){

        return "hekoo";

    }


}
