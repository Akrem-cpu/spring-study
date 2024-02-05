package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // @Controller + @ResponseBody
@RequestMapping("/courses/api/v1")
public class CourseController {
    @Autowired
    CourseService courseService;


    @GetMapping
    public List<CourseDTO> getAllCourse(){
        List<CourseDTO> list = courseService.getCourses();
        return list;
    }
    @GetMapping("{id}")
    public CourseDTO getCourseById(@PathVariable("id") Long id){
        return courseService.getCourseById(id);
    }

    @GetMapping("/category/{name}")
    public List<CourseDTO> getCourseByCategory(@PathVariable("name") String category){

        return  courseService.getCoursesByCategory(category);
    }
    @PostMapping
    public CourseDTO createCourse(@RequestBody CourseDTO courseDTO){
        return courseService.createCourse(courseDTO);
    }

    @PutMapping("{id}")
    public void updateCourse(@PathVariable("id")Long id,@RequestBody CourseDTO courseDTO){
           courseService.updateCourse(id,courseDTO);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id")Long id){
        courseService.deleteCourseById(id);
    }
    @DeleteMapping()
    public void deleteALl(){
        courseService.deleteCourses();
    }

}
