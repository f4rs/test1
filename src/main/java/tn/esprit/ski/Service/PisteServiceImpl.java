package tn.esprit.ski.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ski.Entities.Piste;
import tn.esprit.ski.Entities.Skieur;
import tn.esprit.ski.Repository.PisteRepo;
import tn.esprit.ski.Repository.SkieurRepo;

import java.util.List;
@Service
public class PisteServiceImpl implements IPisteService{
    @Autowired
    private PisteRepo pisteRepo;
    @Autowired
    private SkieurRepo skieurRepo;
    @Override
    public List<Piste> retrieveAllPistes() {
        return (List<Piste>) pisteRepo.findAll();
    }

    @Override
    public Piste addOrUpdatePiste(Piste piste) {
        return pisteRepo.save(piste);
    }

    @Override
    public void removePiste(Piste piste) {
            pisteRepo.delete(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepo.findById(numPiste).get();
    }

    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        Piste piste= pisteRepo.findById(numPiste).get();
        Skieur skieur =skieurRepo.findById(numSkieur).get();
        piste.skieurs.add(skieur);
        return skieur;
    }
}
