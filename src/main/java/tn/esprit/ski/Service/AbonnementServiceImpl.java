package tn.esprit.ski.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ski.Entities.Abvonnement;
import tn.esprit.ski.Entities.Piste;
import tn.esprit.ski.Entities.TypeAbonnement;
import tn.esprit.ski.Repository.AbonnementRepo;
import tn.esprit.ski.Repository.PisteRepo;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
public class AbonnementServiceImpl implements IAbonnementService{
    @Autowired
    private AbonnementRepo abonnementRepo;
    @Override
    public List<Abvonnement> retrieveAllAbvonnements() {
        return (List<Abvonnement>) abonnementRepo.findAll();
    }

    @Override
    public Abvonnement addOrUpdateAbvonnement(Abvonnement abvonnement) {
        return abonnementRepo.save(abvonnement);
    }

    @Override
    public void removeAbvonnement(Abvonnement abvonnement) {
        abonnementRepo.delete(abvonnement);
    }

    @Override
    public Abvonnement retrieveAbvonnement(Long numAbvonnement) {
        return abonnementRepo.findById(numAbvonnement).get();
    }

    @Override
    public Set<Abvonnement> getSubscriptionByType(TypeAbonnement type) {

        return abonnementRepo.findAbvonnementsByTypeAbonOrderByDateDebut(type);
    }

    @Override
    public List<Abvonnement> retrieveSubscriptionsByDates(Date startDate, Date endDate) {
        return abonnementRepo.findAbvonnementsByDateDebutBetween(startDate,endDate);
    }
}
