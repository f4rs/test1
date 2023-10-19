package tn.esprit.ski.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.ski.Entities.Abvonnement;
import tn.esprit.ski.Entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Repository
public interface AbonnementRepo extends CrudRepository<Abvonnement,Long> {
    Set<Abvonnement> findAbvonnementsByTypeAbonOrderByDateDebut(TypeAbonnement typeAbonnement);
    List<Abvonnement> findAbvonnementsByDateDebutBetween(Date debut, Date fin);
}
