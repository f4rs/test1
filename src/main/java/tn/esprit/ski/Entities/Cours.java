package tn.esprit.ski.Entities;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long numCours;
    public int niveau;
    @Enumerated(EnumType.STRING)
    public TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    public Support support ;
    public float prix;
    public int creneau;
    @OneToMany(mappedBy = "cours")
    public List<Inscription> inscriptions;
}
