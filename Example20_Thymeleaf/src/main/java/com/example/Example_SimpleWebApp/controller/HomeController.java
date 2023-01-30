package com.example.Example_SimpleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = {"", "/", "home"})
    public String displayHelloBobzero(Model model){
        model.addAttribute("username", "Bobzero");
        return "home.html";
    }
}
