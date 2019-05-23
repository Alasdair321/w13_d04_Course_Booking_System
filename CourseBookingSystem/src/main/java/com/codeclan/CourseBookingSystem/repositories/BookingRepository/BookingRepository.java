package com.codeclan.CourseBookingSystem.repositories.BookingRepository;

import com.codeclan.CourseBookingSystem.models.Booking;
import com.codeclan.CourseBookingSystem.models.Course;
import com.codeclan.CourseBookingSystem.models.Customer;
import com.codeclan.CourseBookingSystem.projections.EmbedCoursesInBookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(excerptProjection = EmbedCoursesInBookings.class)
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
    List<Customer> findCustomersByCourseId(Long id);

    List<Course> findCoursesByCustomerId(Long id);

    List<Booking> findBookingsByDate(String date);

    List<Customer> findCustomersByTown(Long id, String town);

    List<Customer> findCustomersByTownOverAge(Long id, String town, int age);
}
