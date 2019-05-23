package com.codeclan.CourseBookingSystem.projections;

import com.codeclan.CourseBookingSystem.models.Booking;
import com.codeclan.CourseBookingSystem.models.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "EmbedBookingsInCustomer", types = Customer.class)

public interface EmbedBookingsInCustomer  {
    String getName();
    String getTown();
    int getAge();
    List<Booking> getBookings();
}
