package com.inov.ecole.repositories;

import com.inov.ecole.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {
    Course save (Course course);
}
