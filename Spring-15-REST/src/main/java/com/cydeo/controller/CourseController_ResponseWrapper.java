package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.entity.ResponseWrapper;
import com.cydeo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses/api/v3")
public class CourseController_ResponseWrapper {

    private final CourseService courseService;
    @Autowired
    ResponseWrapper responseWrapper;

    public CourseController_ResponseWrapper(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper> getAllCourse(){
        return ResponseEntity.status(HttpStatus.OK)
                .header("Version","APIV3")
                .body(new ResponseWrapper("Successfully Retrieved",courseService.getCourses()));
    }
    @GetMapping("{id}")
    public ResponseEntity<ResponseWrapper> getCourseById(@PathVariable("id") Long id){
        return ResponseEntity.status(HttpStatus.OK)
                .header("Version","APIV3")
                .body(new ResponseWrapper("Course "+id+" Successfully Retrieved",courseService.getCourseById(id)));
    }

}
