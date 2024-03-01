package com.inov.ecole.implems;

import com.inov.ecole.models.Course;
import com.inov.ecole.repositories.CourseRepo;
import com.inov.ecole.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseImplem implements CourseService {
    @Autowired
    CourseRepo courseRepo;

    @Override
    public Course createCourse(Course course) {
        return courseRepo.save(course);
    }
}
