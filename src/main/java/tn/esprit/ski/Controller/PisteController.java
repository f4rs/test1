package tn.esprit.ski.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.ski.Entities.Piste;
import tn.esprit.ski.Entities.Skieur;
import tn.esprit.ski.Service.PisteServiceImpl;

@RestController
public class PisteController {
    @Autowired
    private PisteServiceImpl pisteService;
    @PostMapping("/Pistes")
    public Piste AddOrUpdatePiste(@RequestBody Piste piste){
        return pisteService.addOrUpdatePiste(piste);
    }
    @GetMapping("/Pistes/assagnSkieur")
    public Skieur assignSkierToPiste( Long numSkieur, Long numPiste){
        return pisteService.assignSkierToPiste(numSkieur,numPiste);
    }

}
