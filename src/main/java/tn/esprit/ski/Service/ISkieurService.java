package tn.esprit.ski.Service;

import tn.esprit.ski.Entities.Piste;
import tn.esprit.ski.Entities.Skieur;
import tn.esprit.ski.Entities.TypeAbonnement;

import java.util.List;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();
    Skieur addOrUpdateSkieur(Skieur skieur);
    void removeSkieur(Skieur Skieur);
    Skieur retrieveSkieur(Long numSkieur);
    Skieur addSkierAndAssignToCourse(Skieur skieur , Long numCours);
    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);


}
