package com.codeclan.CourseBookingSystem.repositories.BookingRepository;

import com.codeclan.CourseBookingSystem.models.Course;
import com.codeclan.CourseBookingSystem.models.Customer;

import java.util.List;

public interface BookingRepositoryCustom {
    List<Customer> findCustomersByCourseId(Long id);
    List<Course> findCoursesByCustomerId(Long id);

}
