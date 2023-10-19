package tn.esprit.ski.Service;

import tn.esprit.ski.Entities.Cours;
import tn.esprit.ski.Entities.Moniteur;
import tn.esprit.ski.Entities.Piste;

import java.util.List;

public interface ICoursService {
    List<Cours> retrieveAllCourss();
    Cours addOrUpdateCours(Cours cours);
    void removeCours(Cours cours);
    Cours retrieveCours(Long numCours);

}
