package com.codeclan.CourseBookingSystem.repositories.CourseRepository;

import com.codeclan.CourseBookingSystem.models.Course;
import com.codeclan.CourseBookingSystem.projections.EmbedBookingsInCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedBookingsInCourse.class)

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    //todo : get all courses with a given rating

    List<Course> findCoursesByStarRating(int starRating);


    //todo : get all courses for a given course



}
