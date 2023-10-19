package tn.esprit.ski.Service;

import tn.esprit.ski.Entities.Abvonnement;
import tn.esprit.ski.Entities.Piste;
import tn.esprit.ski.Entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

public interface IAbonnementService {
    List<Abvonnement> retrieveAllAbvonnements();
    Abvonnement addOrUpdateAbvonnement(Abvonnement abvonnement);
    void removeAbvonnement(Abvonnement abvonnement);
    Abvonnement retrieveAbvonnement(Long numAbvonnement);
    Set<Abvonnement> getSubscriptionByType(TypeAbonnement type);
    List<Abvonnement> retrieveSubscriptionsByDates(Date startDate, Date endDate);
}
