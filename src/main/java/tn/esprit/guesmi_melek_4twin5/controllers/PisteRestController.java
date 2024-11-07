package tn.esprit.guesmi_melek_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import tn.esprit.guesmi_melek_4twin5.entities.Color;
import tn.esprit.guesmi_melek_4twin5.entities.Piste;
import tn.esprit.guesmi_melek_4twin5.entities.Skier;
import tn.esprit.guesmi_melek_4twin5.services.IpisteServices;
import tn.esprit.guesmi_melek_4twin5.services.PisteServicesImpl;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("piste")
@RestController
@Service
public class PisteRestController {

    private final IpisteServices pisteServices;
    @PostMapping("/add")
    public Piste savePiste(@RequestBody Piste Piste){
        return pisteServices.AddPiste(Piste);
    }

    @GetMapping("/get/{numPiste}")
    public Piste getPiste(@PathVariable Long numCourse)
    {
        return pisteServices.retrievePiste(numCourse);
    }



    @GetMapping("/getAll")
    public List<Piste> getAllPistes() {
        return pisteServices.retrieveAllPiste();
    }


    @PutMapping("/update")
    public Piste updatePiste(@RequestBody Piste piste) {
        return pisteServices.updatePiste(piste);
    }

    @DeleteMapping("/delete/{numPiste}")
    public void deletePiste(@PathVariable Long numPiste) {
        pisteServices.removePiste(numPiste);
    }



    @PutMapping("/assignSkier/piste/{fname}/{lname}/{color}")
    public Skier assignSkierToPiste (@PathVariable String fname, @PathVariable String lname, @PathVariable Color color){
        return pisteServices.assignSkierToPiste(fname, lname, color);
    }


}
