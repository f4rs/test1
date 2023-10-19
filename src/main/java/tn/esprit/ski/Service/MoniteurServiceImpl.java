package tn.esprit.ski.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ski.Entities.Cours;
import tn.esprit.ski.Entities.Moniteur;
import tn.esprit.ski.Entities.Piste;
import tn.esprit.ski.Repository.CoursRepo;
import tn.esprit.ski.Repository.MoniteurRepo;
import tn.esprit.ski.Repository.PisteRepo;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoniteurServiceImpl implements IMoniteurService{
    @Autowired
    private MoniteurRepo moniteurRepo;
    @Autowired
    private CoursRepo coursRepo;
    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return (List<Moniteur>) moniteurRepo.findAll();
    }

    @Override
    public Moniteur addOrUpdateMoniteur(Moniteur moniteur) {
        return moniteurRepo.save(moniteur);
    }

    @Override
    public void removeMoniteur(Moniteur moniteur) {
        moniteurRepo.delete(moniteur);
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return moniteurRepo.findById(numMoniteur).get();
    }
    @Override
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCours) {
        Cours cours = coursRepo.findById(numCours).get();
        moniteurRepo.save(moniteur);

        Moniteur moniteur1=moniteurRepo.findById(moniteur.getNumMoniteur()).get();
        List<Cours> coursList=moniteur1.getCours();
        if (coursList==null)
            coursList=new ArrayList<Cours>();

        coursList.add(cours);
        moniteur1.setCours(coursList);
        moniteurRepo.save(moniteur1);
        return moniteur1;
    }
}
