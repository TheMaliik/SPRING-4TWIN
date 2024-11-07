package tn.esprit.guesmi_melek_4twin5.services;

import tn.esprit.guesmi_melek_4twin5.entities.Registration;

import java.util.List;

public interface IregistrationServices {

    Registration AddRegistration(Registration registration);
    Registration updateRegistration(Registration registration);

    Registration retrieveRegistration(Long numRegistration);

    List<Registration> retrieveAllRegistration();

    void removeRegistration(Long numRegistration);


    Registration addRegistrationAndAssignToSkier(Registration registration,Long numSkier);
    Registration assignRegistrationToCourse(Registration registration,Long numCourse);

}
