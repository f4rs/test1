package tn.esprit.ski.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.ski.Entities.Moniteur;
import tn.esprit.ski.Entities.Piste;
import tn.esprit.ski.Service.MoniteurServiceImpl;
import tn.esprit.ski.Service.PisteServiceImpl;

@RestController
public class MoniturController {
    @Autowired
    private MoniteurServiceImpl moniteurService;
    @PostMapping("/Moniteurs")
    public Moniteur AddOrUpdateMoniteur(@RequestBody Moniteur moniteur){
        return moniteurService.addOrUpdateMoniteur(moniteur);
    }
    @PostMapping("/Moniteurs/addAssign")
    public Moniteur addInstructorAndAssignToCourse(@RequestBody Moniteur moniteur, Long numCourse){
        return moniteurService.addInstructorAndAssignToCourse(moniteur,numCourse);
    }

}
