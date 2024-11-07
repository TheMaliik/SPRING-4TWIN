package tn.esprit.guesmi_melek_4twin5.services;

import tn.esprit.guesmi_melek_4twin5.entities.Instructor;

import java.util.List;

public interface IinstructorServices {

    Instructor AddInstructor(Instructor instructor);
    Instructor updateInstructor(Instructor instructor);

    Instructor retrieveInstructor(Long numInstructor);

    List<Instructor> retrieveAllInstructor();

    void removeInstructor(Long numInstructor);

}
