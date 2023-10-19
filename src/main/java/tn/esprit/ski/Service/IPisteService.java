package tn.esprit.ski.Service;

import tn.esprit.ski.Entities.Piste;
import tn.esprit.ski.Entities.Skieur;

import java.util.List;

public interface IPisteService {
    List<Piste> retrieveAllPistes();
    Piste addOrUpdatePiste(Piste piste);
    void removePiste(Piste piste);
    Piste retrievePiste(Long numPiste);
    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
}
