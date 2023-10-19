package tn.esprit.ski.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.ski.Entities.Piste;

@Repository
public interface PisteRepo extends CrudRepository<Piste,Long> {
}
