package com.codeclan.CourseBookingSystem.repositories.CourseRepository;

import com.codeclan.CourseBookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    //todo : get all courses with a given rating




    //todo : get all courses for a given course



}
