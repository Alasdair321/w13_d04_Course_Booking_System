package com.codeclan.CourseBookingSystem.repositories.CustomerRepository;

import com.codeclan.CourseBookingSystem.models.Customer;
import com.codeclan.CourseBookingSystem.projections.EmbedBookingsInCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedBookingsInCustomer.class)
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
}
