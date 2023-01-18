package com.akrem.controller;

import com.akrem.model.Gender;
import com.akrem.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class EmployeeController {

    @RequestMapping("/employeeList")
    public String employeeList(Model model){
        List<Mentor> mentor = Arrays.asList(new Mentor("Alex","GUTMA",29,Gender.MALE),new Mentor("Davie","frank",10,Gender.MALE)
        ,new Mentor("Alexia","bob",25,Gender.FEMALE));
        model.addAttribute("mentors" , mentor);



        return "employee/employee-list";
    }


}
