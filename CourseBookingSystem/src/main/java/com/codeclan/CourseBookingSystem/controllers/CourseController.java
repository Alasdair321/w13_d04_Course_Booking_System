package com.codeclan.CourseBookingSystem.controllers;


import com.codeclan.CourseBookingSystem.models.Booking;
import com.codeclan.CourseBookingSystem.models.Course;
import com.codeclan.CourseBookingSystem.models.Customer;
import com.codeclan.CourseBookingSystem.repositories.BookingRepository.BookingRepository;
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

    @Autowired
    BookingRepository bookingRepository;


    @GetMapping(value = "/rating/{starRating}")
    public List<Course> findCoursesByStarRating(@PathVariable int starRating) {
        return courseRepository.findCoursesByStarRating(starRating);
    }

    @GetMapping(value = "/{id}/customers")
    public List<Customer> findCustomersByCourseId(@PathVariable Long id){
        return bookingRepository.findCustomersByCourseId(id);
    }

    @GetMapping(value = "/{id}/customers/town/{town}")
    public List<Customer> findCustomersByTown(@PathVariable Long id, @PathVariable String town){
        return bookingRepository.findCustomersByTown(id, town);
    }

    @GetMapping(value = "/{id}/customers/town/{town}/over/{age}")
    public List<Customer> findCustomersByTownOverAge(@PathVariable Long id, @PathVariable String town, @PathVariable int age){
        return bookingRepository.findCustomersByTownOverAge(id, town, age);
    }

}
