package com.akrem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    @RequestMapping("/welcome")
    public String homePage(Model model){
        model.addAttribute("sentence","name is crazy learning, this is the start, thank you ALLAH(Alhmudilalah)");
        model.addAttribute("course","MVC for life");


        return "/student/welcome";
    }



}
