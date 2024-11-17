package tn.esprit.guesmi_melek_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import tn.esprit.guesmi_melek_4twin5.entities.Skier;
import tn.esprit.guesmi_melek_4twin5.services.IskierServices;
import tn.esprit.guesmi_melek_4twin5.services.SkierServicesImpl;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping("skier")
@RestController

public class SkierRestController {

    private final IskierServices skierServices;
    @PostMapping("/add")
    public Skier saveSkier(@RequestBody Skier skier){
        return skierServices.addSkier(skier);
    }

@GetMapping("/get/{numSkier}")
  public Skier getSkier(@PathVariable Long numSkier)
{
    return skierServices.retrieveSkier(numSkier);
}



    @GetMapping("/getAll")
    public List<Skier> getAllSkiers() {
        return skierServices.retrieveAll();
    }


    @PutMapping("/update")
    public Skier updateSkier(@RequestBody Skier skier) {
        return skierServices.updateSkier(skier);
    }


    @DeleteMapping("/delete/{numSkier}")
    public void deleteSkier(@PathVariable Long numSkier) {
        skierServices.removeSkier(numSkier);
    }


    @PutMapping("/assign/{numSkier}/{numPiste}")
    public void assignSkier(@PathVariable Long numSkier,@PathVariable Long numPiste) {
        skierServices.assignSkierToPiste(numSkier, numPiste);
    }

    @GetMapping("/getBy/{firstName}/{lastName}")
    public Skier getByFLname(@PathVariable String firstName , @PathVariable String lastName){
        return skierServices.getByFirstAndLastName(firstName,lastName);
    }


    @GetMapping("/getBy/{birthDate}")
    public Skier getByBDate(@PathVariable LocalDate birthDate ){
        return skierServices.findByBirthDate(birthDate);
    }





}
