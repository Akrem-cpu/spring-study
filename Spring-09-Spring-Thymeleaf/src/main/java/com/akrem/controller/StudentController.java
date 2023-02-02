package com.akrem.controller;

import com.akrem.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {
     // @RequestMapping(value = "register",method = RequestMethod.GET)
      @GetMapping("/register")
      public String register(Model model ){
          model.addAttribute("students", DataGenerator.createStudent());



          return "/student/register-student";
      }
    @RequestMapping("/info")
    public String info(Model model, @RequestParam(required = false) Integer id,@RequestParam(required = false) String name){
        model.addAttribute("students", DataGenerator.createStudent());
        System.out.println(id);
        System.out.println(name);


        return "/student/info";
    }




}
