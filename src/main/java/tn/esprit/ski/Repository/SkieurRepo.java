package tn.esprit.ski.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.ski.Entities.Skieur;

@Repository
public interface SkieurRepo extends CrudRepository<Skieur,Long> {
}
