package tn.esprit.guesmi_melek_4twin5.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.guesmi_melek_4twin5.entities.Registration;


public interface IRegistrationRepository extends CrudRepository<Registration, Long> {
}