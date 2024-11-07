package tn.esprit.guesmi_melek_4twin5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.guesmi_melek_4twin5.entities.Course;
import tn.esprit.guesmi_melek_4twin5.entities.Instructor;
import tn.esprit.guesmi_melek_4twin5.repositories.ICourseRepository;
import tn.esprit.guesmi_melek_4twin5.repositories.IInstructorRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class InstructorServicesImpl implements IinstructorServices {

    private final IInstructorRepository instructorRepository;
    @Override
    public Instructor AddInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor retrieveInstructor(Long numInstructor) {
        return instructorRepository.findById(numInstructor).orElse(null);
    }

    @Override
    public List<Instructor> retrieveAllInstructor() {
        return (List<Instructor>) instructorRepository.findAll();
    }

    @Override
    public void removeInstructor(Long numInstructor) {
        instructorRepository.deleteById(numInstructor);
    }
}
