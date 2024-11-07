package tn.esprit.guesmi_melek_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import tn.esprit.guesmi_melek_4twin5.entities.Course;
import tn.esprit.guesmi_melek_4twin5.entities.Instructor;
import tn.esprit.guesmi_melek_4twin5.services.CourseServicesImpl;
import tn.esprit.guesmi_melek_4twin5.services.IinstructorServices;
import tn.esprit.guesmi_melek_4twin5.services.InstructorServicesImpl;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("instructor")
@RestController
@Service
public class InstructorRestController {

    private final IinstructorServices instructorServices;
    @PostMapping("/add")
    public Instructor saveInstructor(@RequestBody Instructor instructor){
        return instructorServices.AddInstructor(instructor);
    }

    @GetMapping("/get/{numInstructor}")
    public Instructor getInstructor(@PathVariable Long numInstructor)
    {
        return instructorServices.retrieveInstructor(numInstructor);
    }



    @GetMapping("/getAll")
    public List<Instructor> getAllInstructors() {
        return instructorServices.retrieveAllInstructor();
    }


    @PutMapping("/update")
    public Instructor updateInstructor(@RequestBody Instructor instructor) {
        return instructorServices.updateInstructor(instructor);
    }

    @DeleteMapping("/delete/{numInstructor}")
    public void deleteInstructor(@PathVariable Long numInstructor) {
        instructorServices.removeInstructor(numInstructor);
    }


}
