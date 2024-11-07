package tn.esprit.guesmi_melek_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import tn.esprit.guesmi_melek_4twin5.entities.Registration;
import tn.esprit.guesmi_melek_4twin5.services.IregistrationServices;
import tn.esprit.guesmi_melek_4twin5.services.RegistrationServicesImpl;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("registration")
@RestController
@Service
public class RegistrationRestController {

    private final IregistrationServices registrationServices;

    @PostMapping("/add")
    public Registration saveRegistration(@RequestBody Registration registration) {
        return registrationServices.AddRegistration(registration);
    }

    @GetMapping("/get/{numRegistration}")
    public Registration getRegistration(@PathVariable Long numRegistration) {
        return registrationServices.retrieveRegistration(numRegistration);
    }

    @GetMapping("/getAll")
    public List<Registration> getAllRegistrations() {
        return registrationServices.retrieveAllRegistration();
    }

    @PutMapping("/update")
    public Registration updateRegistration(@RequestBody Registration registration) {
        return registrationServices.updateRegistration(registration);
    }

    @DeleteMapping("/delete/{numRegistration}")
    public void deleteRegistration(@PathVariable Long numRegistration) {
        registrationServices.removeRegistration(numRegistration);
    }





    @PostMapping("/addR/{numSkier}")
    public Registration addRegistrationAndAssignToSkier(@RequestBody Registration registration, @PathVariable Long numSkier){
        return registrationServices.addRegistrationAndAssignToSkier(registration, numSkier);
    }
    @PostMapping("/addR/course/{numCourse}")
    public Registration assignRegistrationToCourse(@RequestBody Registration registration,@PathVariable Long numCourse){
        return registrationServices.assignRegistrationToCourse(registration, numCourse);
    }




}
