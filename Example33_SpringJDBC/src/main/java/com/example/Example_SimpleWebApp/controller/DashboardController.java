package com.example.Example_SimpleWebApp.controller;

import com.example.Example_SimpleWebApp.model.Contact;
import com.sun.jdi.connect.ListeningConnector;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.stylesheets.LinkStyle;

@Slf4j
@Controller
public class DashboardController {

    @RequestMapping("/dashboard")
    public String displayDashboard(Model model, Authentication authentication) {
        model.addAttribute("username", authentication.getName());
        model.addAttribute("roles", authentication.getAuthorities().toString());
        return "dashboard.html";
    }

}
