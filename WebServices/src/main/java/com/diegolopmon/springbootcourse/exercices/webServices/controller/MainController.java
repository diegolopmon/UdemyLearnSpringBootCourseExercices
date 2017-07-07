package com.diegolopmon.springbootcourse.exercices.webServices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping("/controller1")
    public String controller1(
            @RequestParam(value = "parameter", required = false, defaultValue = "No param") String parameter,
            Model model) {
        model.addAttribute("parameter", parameter);
        return "controller1";
    }

    @RequestMapping("/controller2")
    public String controller2(
            @RequestParam(value = "parameter", required = false, defaultValue = "No param") String parameter,
            Model model) {
        model.addAttribute("parameter", parameter);
        return "controller2";
    }
}
