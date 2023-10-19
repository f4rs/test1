package tn.esprit.ski.Service;

import tn.esprit.ski.Entities.Inscription;
import tn.esprit.ski.Entities.Piste;

import java.util.List;

public interface IInscriptionService {
    List<Inscription> retrieveAllInscriptions();
    Inscription addOrUpdateInscription(Inscription inscription);
    void removeInscription(Inscription inscription);
    Inscription retrieveInscription(Long numInscription);
    Inscription addRegistrationAndAssignToSkierAndCourse(Inscription inscription,Long numSkieur, Long numCours);
}
