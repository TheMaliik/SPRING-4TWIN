package tn.esprit.guesmi_melek_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import tn.esprit.guesmi_melek_4twin5.entities.Course;
import tn.esprit.guesmi_melek_4twin5.services.CourseServicesImpl;
import tn.esprit.guesmi_melek_4twin5.services.IcourseServices;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("course")
@RestController
@Service
public class CourseRestController {

    private final IcourseServices courseServices;


    @PostMapping("/add")
    public Course saveCourse(@RequestBody Course course){
        return courseServices.AddCourse(course);
    }

    @GetMapping("/get/{numCourse}")
    public Course getCourse(@PathVariable Long numCourse)
    {
        return courseServices.retrieveCourse(numCourse);
    }



    @GetMapping("/getAll")
    public List<Course> getAllCourses() {
        return courseServices.retrieveAllCourse();
    }


    @PutMapping("/update")
    public Course updateCourse(@RequestBody Course course) {
        return courseServices.updateCourse(course);
    }

    @DeleteMapping("/delete/{numCourse}")
    public void deleteCourse(@PathVariable Long numCourse) {
        courseServices.removeCourse(numCourse);
    }


}
