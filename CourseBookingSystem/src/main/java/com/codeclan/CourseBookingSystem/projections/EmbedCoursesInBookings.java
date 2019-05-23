package com.codeclan.CourseBookingSystem.projections;

import com.codeclan.CourseBookingSystem.models.Booking;
import com.codeclan.CourseBookingSystem.models.Course;
import com.codeclan.CourseBookingSystem.models.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "EmbedCoursesInBookings", types = Booking.class)
public interface EmbedCoursesInBookings {
    String getDate();
    Course getCourse();
    Customer getCustomer();
}
