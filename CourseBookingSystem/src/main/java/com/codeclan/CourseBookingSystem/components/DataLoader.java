package com.codeclan.CourseBookingSystem.components;

import com.codeclan.CourseBookingSystem.models.Booking;
import com.codeclan.CourseBookingSystem.models.Course;
import com.codeclan.CourseBookingSystem.models.Customer;
import com.codeclan.CourseBookingSystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.CourseBookingSystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.CourseBookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }


    @Override
    public void run(ApplicationArguments args)  {
        Course spring = new Course("Spring Intro", "Edinburgh", 5);
        courseRepository.save(spring);

        Course java = new Course("Java Intro", "Edinburgh", 4);
        courseRepository.save(java);

        Course agile = new Course("Agile Intro", "Glasgow", 3);
        courseRepository.save(agile);



        Customer becky = new Customer("Becky", "Edinburgh", 30);
        customerRepository.save(becky);

        Booking booking1 = new Booking("23/05/2019", agile, becky);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("23/06/2019", java, becky);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("23/07/2019", spring, becky);
        bookingRepository.save(booking3);



        Customer alasdair = new Customer("Alasdair", "Dunfermline", 29);
        customerRepository.save(alasdair);

        Booking booking4 = new Booking("23/05/2019", agile, alasdair);
        bookingRepository.save(booking1);

        Booking booking5 = new Booking("23/06/2019", java, alasdair);
        bookingRepository.save(booking1);

        Booking booking6 = new Booking("23/07/2019", spring, alasdair);
        bookingRepository.save(booking1);



    }
}
