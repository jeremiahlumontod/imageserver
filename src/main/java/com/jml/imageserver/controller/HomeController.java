package com.jml.imageserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @GetMapping(value = "/")
    public String index(){
        return "Hello world";
    }

    @GetMapping(value = "/private")
    public String privateArea(){
        return "private";
    }

}

