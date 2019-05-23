package com.codeclan.CourseBookingSystem.projections;

import com.codeclan.CourseBookingSystem.models.Booking;
import com.codeclan.CourseBookingSystem.models.Course;
import com.codeclan.CourseBookingSystem.models.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedBookingsInCourse", types = Course.class)
public interface EmbedBookingsInCourse {
     List<Booking> getBookings();
     String getName();
    String getTown();
    int getStarRating();
    Long getId();
}

