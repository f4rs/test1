package tn.esprit.ski.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.ski.Entities.Cours;
import tn.esprit.ski.Entities.Piste;
import tn.esprit.ski.Service.CoursServiceImpl;
import tn.esprit.ski.Service.PisteServiceImpl;

@RestController
public class CoursController {
    @Autowired
    private CoursServiceImpl coursService;
    @PostMapping("/Courss")
    public Cours AddOrUpdateCours(@RequestBody Cours cours){
        return coursService.addOrUpdateCours(cours);
    }

}
