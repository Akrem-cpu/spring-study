package com.akrem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Annotate the class with the @controller Stereotype annotation
public class HomeController {
    @RequestMapping("/home")// user the @requestMapping annotation to associate with and HTTP request path
    public String home(){
        return "home.html"; // Return the HTML document name that contains the details we want the browser to display
    }
    @RequestMapping("/welcome")
    public String home2(){
        return "wlecome.html";
    }



}
