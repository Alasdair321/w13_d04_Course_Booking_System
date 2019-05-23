package com.codeclan.CourseBookingSystem.controllers;

import com.codeclan.CourseBookingSystem.models.Course;
import com.codeclan.CourseBookingSystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.CourseBookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")

public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/{id}/courses")
    public List<Course> findCoursesByCustomerId(@PathVariable Long id){
        return bookingRepository.findCoursesByCustomerId(id);
    }

}
