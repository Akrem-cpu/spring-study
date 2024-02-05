package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses/api/v2")
public class CourseController_ResponseEntity {
    @Autowired
    private CourseService courseService;

  @GetMapping
    public ResponseEntity<List<CourseDTO>> getAllCourses(){
      return ResponseEntity.
              status(HttpStatus.ACCEPTED)
              .header("Vesrsion","ApiV2")
              .header("Operation","Get List")
              .body(courseService.getCourses());

  }

    @GetMapping("{id}")
    public ResponseEntity<CourseDTO> getAllCourses(@PathVariable("id") Long id){
        return ResponseEntity.
                status(HttpStatus.ACCEPTED)
                .header("Vesrsion","ApiV2")
                .header("Operation","Get course")
                .body(courseService.getCourseById(id));

    }
    @PostMapping()
    public ResponseEntity<CourseDTO> getAllCourses(@RequestBody CourseDTO courseDTO){
        return ResponseEntity.
                status(HttpStatus.CREATED)
                .header("Operation","Creat course")
                .body(courseService.createCourse(courseDTO));


    }


}
