package tn.esprit.guesmi_melek_4twin5.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.guesmi_melek_4twin5.entities.Skier;
import tn.esprit.guesmi_melek_4twin5.entities.TypeSubscription;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface ISkierRepository extends CrudRepository<Skier , Long> {
Skier findByFirstNameAndLastName(String fname , String lname);

    Skier findByBirthDate(LocalDate birthDate );

    List<Skier> findBySubscription(TypeSubscription typeSubscription);

}
