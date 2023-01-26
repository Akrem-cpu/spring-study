package com.akrem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {
    @RequestMapping("/info") // localhost:8080/car/info?make=Honda&year=2022
    public String carInfo(@RequestParam String make ,@RequestParam Integer year, Model model){
        model.addAttribute("make",make);
        model.addAttribute("year",year);

        System.out.println(make);
        System.out.println(year);
        return "/car/car-info";
    }
    @RequestMapping("/info2") // localhost:8080/car/info?make=Honda&year=2022
    public String carInfo2(@RequestParam(value = "make",required = false, defaultValue = "Tesla") String make , Model model){
        model.addAttribute("make",make);


        System.out.println(make);
        return "/car/car-info";
    }
    @RequestMapping("/info/{make}/{year}")
    public String getCarInfo(@PathVariable String make,@PathVariable Integer year, Model model){
        model.addAttribute("make",make);
        model.addAttribute("year",year);


        return "/car/car-info";
    }


}