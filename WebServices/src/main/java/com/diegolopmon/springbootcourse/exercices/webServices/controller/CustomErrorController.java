package com.diegolopmon.springbootcourse.exercices.webServices.controller;


import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CustomErrorController implements ErrorController {

    private static final String ERROR_PATH = "/error";
    private CustomErrorController errorAttributes;

    @RequestMapping("/404")
    public String pageNotFound(Model model){
        return "404";
    }


    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
