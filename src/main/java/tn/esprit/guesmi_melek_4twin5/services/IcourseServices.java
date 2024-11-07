package tn.esprit.guesmi_melek_4twin5.services;

import tn.esprit.guesmi_melek_4twin5.entities.Course;

import java.util.List;

public interface IcourseServices {

    Course AddCourse(Course course);
    Course updateCourse(Course course);

    Course retrieveCourse(Long numCourse);

    List<Course> retrieveAllCourse();

    void removeCourse(Long numCourse);

}
