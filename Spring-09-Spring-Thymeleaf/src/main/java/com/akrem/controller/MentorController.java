package com.akrem.controller;

import com.akrem.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping ("/register")
    public String showForm(Model model){
         model.addAttribute("mentor",new Mentor());
         List<String> batchList = Arrays.asList("JD1","JD2","JD3","JD4","JD5","JD20");
         model.addAttribute("batchList",batchList);

        return "mentor/mentor-register";
    }
    @PostMapping ("/confirm")
    public String showForm2( @ModelAttribute("mentor") Mentor mentor, Model model){

        System.out.println(mentor);
        // check there token
        // check if 3 then if mq send to funding


       // return "mentor/confirmation";
        return "redirect:/mentor/register";
    }


}
