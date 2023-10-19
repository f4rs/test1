package tn.esprit.ski.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.ski.Entities.Piste;
import tn.esprit.ski.Entities.Skieur;
import tn.esprit.ski.Entities.TypeAbonnement;
import tn.esprit.ski.Service.PisteServiceImpl;
import tn.esprit.ski.Service.SkieurServiceImpl;

import java.util.List;

@RestController
public class SkieurController {
    @Autowired
    private SkieurServiceImpl skieurService;
    @PostMapping("/Skieurs")
    public Skieur AddOrUpdateSkieur(@RequestBody Skieur skieur){
        return skieurService.addOrUpdateSkieur(skieur);
    }
    @PostMapping("/Skieurs/addtocourse")
    public Skieur addSkierAndAssignToCourse(@RequestBody Skieur skieur , Long numCours){
        return skieurService.addSkierAndAssignToCourse(skieur,numCours);
    }
    @PostMapping("/Skieurs/parType")
    public List<Skieur> retrieveSkiersBySubscriptionType(/*@PathVariable*/ TypeAbonnement typeAbonnement){
        return skieurService.retrieveSkiersBySubscriptionType(typeAbonnement);
    }



}
