package tn.esprit.ski.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.ski.Entities.Moniteur;

@Repository
public interface MoniteurRepo extends CrudRepository<Moniteur,Long> {
}
