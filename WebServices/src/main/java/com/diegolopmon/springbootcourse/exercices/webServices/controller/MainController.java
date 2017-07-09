package com.diegolopmon.springbootcourse.exercices.webServices.controller;

import com.diegolopmon.springbootcourse.exercices.webServices.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MainController {

    private HelloWorldService helloWorldService;

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

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

    @RequestMapping("/helloservice")
    public String helloService(
            Model model) {
        String message = helloWorldService.toString();
        model.addAttribute("message", message);
        return "helloService";
    }
}
