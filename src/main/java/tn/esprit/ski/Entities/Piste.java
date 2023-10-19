package tn.esprit.ski.Entities;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long numPiste;
    public String nomPiste;
    public Couleur couleur;
    public int largeur;
    public int pente;
    @ManyToMany
    public List<Skieur> skieurs;
}
