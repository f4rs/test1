package tn.esprit.ski.Service;

import tn.esprit.ski.Entities.Moniteur;
import tn.esprit.ski.Entities.Piste;

import java.util.List;

public interface IMoniteurService {
    List<Moniteur> retrieveAllMoniteurs();
    Moniteur addOrUpdateMoniteur(Moniteur moniteur);
    void removeMoniteur(Moniteur moniteur);
    Moniteur retrieveMoniteur(Long numMoniteur);
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCourse);
}
