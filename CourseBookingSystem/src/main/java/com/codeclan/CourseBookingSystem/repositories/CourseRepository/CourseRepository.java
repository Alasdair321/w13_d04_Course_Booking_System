package com.codeclan.CourseBookingSystem.repositories.CourseRepository;

import com.codeclan.CourseBookingSystem.models.Course;
import com.codeclan.CourseBookingSystem.projections.EmbedBookingsInCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedBookingsInCourse.class)

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    //todo : get all courses with a given rating




    //todo : get all courses for a given course



}
