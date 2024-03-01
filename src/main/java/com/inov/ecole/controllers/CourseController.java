package com.inov.ecole.controllers;

import com.inov.ecole.models.Course;
import com.inov.ecole.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping
    public ResponseEntity<Course> creatCourse(@RequestBody Course course){
        return new ResponseEntity<>(
                courseService.createCourse(course),
                HttpStatus.CREATED
        );
    }
}
