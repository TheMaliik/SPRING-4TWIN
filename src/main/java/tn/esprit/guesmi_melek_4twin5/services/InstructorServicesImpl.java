package tn.esprit.guesmi_melek_4twin5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.guesmi_melek_4twin5.entities.Course;
import tn.esprit.guesmi_melek_4twin5.entities.Instructor;
import tn.esprit.guesmi_melek_4twin5.repositories.ICourseRepository;
import tn.esprit.guesmi_melek_4twin5.repositories.IInstructorRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class InstructorServicesImpl implements IinstructorServices {

    private final IInstructorRepository instructorRepository;
    private final ICourseRepository courseRepository;

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



    public Instructor AddAndAsignToCourses(Instructor ins, List<Long> courseIds) {

      Set<Course> courseSet = new HashSet<>();
     for (Long courseId : courseIds) {
      Course course = courseRepository.findById(courseId).orElse(null);
    if(course !=null){
        courseSet.add(course);
    }
}
        ins.setCourses(courseSet);
        return instructorRepository.save(ins);
    }




    public Instructor addAndAssignCourses(Instructor instructor) {

        Set<Course> assignedCourses = new HashSet<>();
        for (Course course : instructor.getCourses()) {
            Long courseId = course.getNumCourse();
            Course foundCourse = courseRepository.findById(courseId).orElse(null);

            if (foundCourse != null) {
                assignedCourses.add(foundCourse);
            }
        }
        instructor.setCourses(assignedCourses);
        return instructorRepository.save(instructor);
    }






}
