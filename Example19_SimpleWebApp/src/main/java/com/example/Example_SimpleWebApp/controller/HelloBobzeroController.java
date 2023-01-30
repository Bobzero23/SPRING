package com.example.Example_SimpleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloBobzeroController {

    @RequestMapping(value = {"", "/", "helloBobzero"})
    public String displayHelloBobzero(){
        return "helloBobzero.html";
    }
}
