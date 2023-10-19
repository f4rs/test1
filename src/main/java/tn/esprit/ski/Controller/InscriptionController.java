package tn.esprit.ski.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.ski.Entities.Inscription;
import tn.esprit.ski.Entities.Piste;
import tn.esprit.ski.Service.InscriptionServiceImpl;
import tn.esprit.ski.Service.PisteServiceImpl;

@RestController
public class InscriptionController {
    @Autowired
    private InscriptionServiceImpl inscriptionService;
    @PostMapping("/Inscriptions")
    public Inscription AddOrUpdateInscription(@RequestBody Inscription inscription){
        return inscriptionService.addOrUpdateInscription(inscription);
    }

}
