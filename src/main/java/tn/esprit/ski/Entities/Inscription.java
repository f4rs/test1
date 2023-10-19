package tn.esprit.ski.Entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long numinscription;
    public int numSemaine;
    @ManyToOne()
    public Cours cours;
    @ManyToOne
    public Skieur skieur;


}
