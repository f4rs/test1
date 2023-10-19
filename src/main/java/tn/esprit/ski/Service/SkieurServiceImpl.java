package tn.esprit.ski.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ski.Entities.*;
import tn.esprit.ski.Repository.CoursRepo;
import tn.esprit.ski.Repository.PisteRepo;
import tn.esprit.ski.Repository.SkieurRepo;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkieurServiceImpl implements ISkieurService{
    @Autowired
    private SkieurRepo skieurRepo;
    @Autowired
    private CoursRepo coursRepo;
    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return (List<Skieur>) skieurRepo.findAll();
    }

    @Override
    public Skieur addOrUpdateSkieur(Skieur skieur) {
        return skieurRepo.save(skieur);
    }

    @Override
    public void removeSkieur(Skieur skieur) {
        skieurRepo.delete(skieur);
    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return skieurRepo.findById(numSkieur).get();
    }

    @Override
    public Skieur addSkierAndAssignToCourse(Skieur skieur,Long numCours) {
        Abvonnement abvonnement=new Abvonnement();
        Inscription inscription =new Inscription();
        inscription.cours=coursRepo.findById(numCours).get();
        skieur.abvonnement=abvonnement;
        List<Inscription> inscriptionList =skieur.getInscriptions();
        if (inscriptionList==null)
                inscriptionList=new ArrayList<>();
        inscriptionList.add(inscription);
        skieur.inscriptions=inscriptionList;
        skieurRepo.save(skieur);


        return skieur;
    }
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement){
        List<Skieur> skieurList = (List<Skieur>) skieurRepo.findAll();
        List<Skieur> skieurList1=new ArrayList<>();
             for (Skieur skieur : skieurList) {
                 Abvonnement abvonnement= skieur.getAbvonnement();

                 if (abvonnement.typeAbon == typeAbonnement)
                     skieurList1.add(skieur);


             }

         return skieurList1;
    }

}
