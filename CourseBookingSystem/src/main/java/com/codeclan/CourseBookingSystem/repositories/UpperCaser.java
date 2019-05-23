package com.codeclan.CourseBookingSystem.repositories;

public class UpperCaser {
    public UpperCaser() {
    }
    public String upperCaser(String phrase) {
        return phrase.substring(0,1).toUpperCase() + phrase.substring(1).toLowerCase();
    }
}
