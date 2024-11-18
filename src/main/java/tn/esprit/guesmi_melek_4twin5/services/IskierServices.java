package tn.esprit.guesmi_melek_4twin5.services;

import tn.esprit.guesmi_melek_4twin5.entities.Skier;
import tn.esprit.guesmi_melek_4twin5.entities.TypeSubscription;

import java.time.LocalDate;
import java.util.List;

public interface IskierServices {

    Skier addSkier(Skier skier);
    Skier updateSkier(Skier skier);

    Skier retrieveSkier(Long numSkier);

    List<Skier> retrieveAll();

    void removeSkier(Long numSkier);

    void assignSkierToPiste(Long numSkier , Long numPiste);
    Skier getByFirstAndLastName(String firstName, String lastName);

    Skier findByBirthDate(LocalDate birthDate );


    List<Skier> retrieveSkiersBySubscriptionType(TypeSubscription subscriptionType);




}
