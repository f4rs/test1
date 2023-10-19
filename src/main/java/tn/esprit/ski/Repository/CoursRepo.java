package tn.esprit.ski.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.ski.Entities.Cours;

@Repository
public interface CoursRepo extends CrudRepository<Cours,Long> {
}
