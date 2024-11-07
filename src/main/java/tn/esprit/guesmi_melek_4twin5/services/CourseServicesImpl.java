package tn.esprit.guesmi_melek_4twin5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.guesmi_melek_4twin5.entities.Course;
import tn.esprit.guesmi_melek_4twin5.entities.Skier;
import tn.esprit.guesmi_melek_4twin5.repositories.ICourseRepository;
import tn.esprit.guesmi_melek_4twin5.repositories.ISkierRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CourseServicesImpl implements IcourseServices {
    private final ICourseRepository courseRepository;

    @Override
    public Course AddCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course retrieveCourse(Long numCourse) {
        return courseRepository.findById(numCourse).orElse(null);
    }

    @Override
    public List<Course> retrieveAllCourse() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public void removeCourse(Long numCourse) {
        courseRepository.deleteById(numCourse);
    }
}
