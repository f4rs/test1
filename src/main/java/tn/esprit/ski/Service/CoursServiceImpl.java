package tn.esprit.ski.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ski.Entities.Cours;
import tn.esprit.ski.Entities.Moniteur;
import tn.esprit.ski.Entities.Piste;
import tn.esprit.ski.Repository.CoursRepo;
import tn.esprit.ski.Repository.MoniteurRepo;
import tn.esprit.ski.Repository.PisteRepo;

import java.util.List;

@Service
public class CoursServiceImpl implements ICoursService{
    @Autowired
    private CoursRepo coursRepo;
    @Autowired
    private MoniteurRepo moniteurRepo;
    @Override
    public List<Cours> retrieveAllCourss() {
        return (List<Cours>) coursRepo.findAll();
    }

    @Override
    public Cours addOrUpdateCours(Cours cours) {
        return coursRepo.save(cours);
    }

    @Override
    public void removeCours(Cours cours) {
        coursRepo.delete(cours);
    }

    @Override
    public Cours retrieveCours(Long numCours) {
        return coursRepo.findById(numCours).get();
    }


}
