package tn.esprit.guesmi_melek_4twin5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.guesmi_melek_4twin5.entities.Registration;
import tn.esprit.guesmi_melek_4twin5.entities.*;
import tn.esprit.guesmi_melek_4twin5.repositories.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class SkierServicesImpl implements IskierServices {
    private final ISkierRepository skierRepository;
    private final IPisteRepository pisteRepository;
    private final ISubscriptionRepository subscriptionRepository;
    private final ICourseRepository courseRepository;
    private final IRegistrationRepository registrationRepository;
    public Skier addSkier(Skier skier){
        return skierRepository.save(skier);
    }



    @Override
    public Skier updateSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public Skier retrieveSkier(Long numSkier) {
        return skierRepository.findById(numSkier).orElse(null);
    }

    @Override
    public List<Skier> retrieveAll() {
        return (List<Skier>) skierRepository.findAll();
    }

    @Override
    public void removeSkier(Long numSkier) {
    skierRepository.deleteById(numSkier);
    }

    @Override
    public void assignSkierToPiste(Long numSkier, Long numPiste) {

        Skier skier = skierRepository.findById(numSkier)
                .orElse(null);
        Piste piste = pisteRepository.findById(numPiste)
                .orElse(null);

        piste.getSkiers().add(skier);
        pisteRepository.save(piste);
    }

    @Override
    public Skier getByFirstAndLastName(String firstName, String lastName) {
        return skierRepository.findByFirstNameAndLastName(firstName,lastName);
    }


    @Override
    public Skier findByBirthDate(LocalDate birthDate) {
        return skierRepository.findByBirthDate(birthDate);
    }




}
