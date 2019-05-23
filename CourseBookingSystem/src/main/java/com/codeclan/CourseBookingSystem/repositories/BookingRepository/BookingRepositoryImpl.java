package com.codeclan.CourseBookingSystem.repositories.BookingRepository;

import com.codeclan.CourseBookingSystem.models.Booking;
import com.codeclan.CourseBookingSystem.models.Course;
import com.codeclan.CourseBookingSystem.models.Customer;
import com.codeclan.CourseBookingSystem.repositories.UpperCaser;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class BookingRepositoryImpl extends UpperCaser implements BookingRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> findCustomersByCourseId(Long id) {
        List<Customer> results = null;

        Session session = entityManager.unwrap(Session.class);

        try{
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "booking");
            cr.createAlias("booking.course", "course");
            cr.add(Restrictions.eq("course.id", id));
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return results;
    }

    @Transactional
    public List<Course> findCoursesByCustomerId(Long id) {
        List<Course> results = null;

        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Course.class);
            cr.createAlias("bookings","booking");
            cr.createAlias("booking.customer", "customer");
            cr.add(Restrictions.eq("customer.id", id));
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }



        return results;
    }

    @Transactional
    public List<Customer> findCustomersByTown(Long id, String town) {
        town = upperCaser(town);
        List<Customer> results = null;

        Session session = entityManager.unwrap(Session.class);

        try{
            Criteria cr = session.createCriteria(Customer.class);
            cr.add(Restrictions.eq("town", town));

            cr.createAlias("bookings","booking");
            cr.createAlias("booking.course","course");

            cr.add(Restrictions.eq("course.id", id));
            results = cr.list();
        }
        catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return results;
    }
}
