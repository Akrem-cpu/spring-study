package com.akrem.controller;

import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {
    @RequestMapping("/welcome")
    public String homePage(Model model){
        model.addAttribute("sentence","name is crazy learning, this is the start, thank you ALLAH(Alhmudilalah)");
        model.addAttribute("course","MVC for life");
        String lover = " Selma";
        model.addAttribute("name",lover);

        model.addAttribute("number",new Random().nextInt(1000));

        List<Integer> id = Arrays.asList(1,2,3,4,29,10);
        model.addAttribute("id",id);



        return "/student/welcome";
    }



}
