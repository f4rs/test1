package tn.esprit.ski.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ski.Entities.Cours;
import tn.esprit.ski.Entities.Inscription;
import tn.esprit.ski.Entities.Piste;
import tn.esprit.ski.Repository.CoursRepo;
import tn.esprit.ski.Repository.InscriptionRepo;
import tn.esprit.ski.Repository.PisteRepo;
import tn.esprit.ski.Repository.SkieurRepo;

import java.util.List;

@Service
public class InscriptionServiceImpl implements IInscriptionService{
    @Autowired
    private InscriptionRepo inscriptionRepo;
    @Autowired
    private SkieurRepo skieurRepo;
    @Autowired
    private CoursRepo coursRepo;
    @Override
    public List<Inscription> retrieveAllInscriptions() {
        return (List<Inscription>) inscriptionRepo.findAll();
    }

    @Override
    public Inscription addOrUpdateInscription(Inscription inscription) {
        return inscriptionRepo.save(inscription);
    }

    @Override
    public void removeInscription(Inscription inscription) {
        inscriptionRepo.delete(inscription);
    }

    @Override
    public Inscription retrieveInscription(Long numInscription) {
        return inscriptionRepo.findById(numInscription).get();
    }

    @Override
    public Inscription addRegistrationAndAssignToSkierAndCourse(Inscription inscription, Long numSkieur, Long numCours) {
        Cours cours=coursRepo.findById(numCours).get();
        //if (cours.typeCours)
        return null;
    }
}
