package tn.esprit.ski.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.ski.Entities.Inscription;

@Repository
public interface InscriptionRepo extends CrudRepository<Inscription,Long> {
}
