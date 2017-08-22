package com.diegolopmon.springbootcourse.exercices.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Hello Security!!!");
        return "home";
    }

    @RequestMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("message", "Admin portal");
        return "home";
    }
}
