package tn.esprit.guesmi_melek_4twin5.services;

import tn.esprit.guesmi_melek_4twin5.entities.Color;
import tn.esprit.guesmi_melek_4twin5.entities.Piste;
import tn.esprit.guesmi_melek_4twin5.entities.Skier;

import java.util.List;

public interface IpisteServices {

    Piste AddPiste(Piste piste);
    Piste updatePiste(Piste piste);

    Piste retrievePiste(Long numPiste);

    List<Piste> retrieveAllPiste();

    void removePiste(Long numPiste);



    List<Piste> getPisteByColor(Color color);
    Skier assignSkierToPiste(String fname, String lname, Color color);

}
