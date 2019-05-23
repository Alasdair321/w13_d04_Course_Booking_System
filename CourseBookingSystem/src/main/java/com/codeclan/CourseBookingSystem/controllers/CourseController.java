package com.codeclan.CourseBookingSystem.controllers;


import com.codeclan.CourseBookingSystem.models.Course;
import com.codeclan.CourseBookingSystem.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/rating/{starRating}")
    public List<Course> findCoursesByStarRating(@PathVariable int starRating) {
        return courseRepository.findCoursesByStarRating(starRating);
    }

}
