package com.example.Example_SimpleWebApp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class DashboardController {

    @RequestMapping("/dashboard")
    @PreAuthorize("hasRole('ADMIN')")
    public String displayDashboard(Model model, Authentication authentication) {
        model.addAttribute("username", authentication.getName());
        model.addAttribute("roles", authentication.getAuthorities().toString());
        return "/dashboard.html";
    }
}
