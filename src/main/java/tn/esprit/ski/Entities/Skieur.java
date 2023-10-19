package tn.esprit.ski.Entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
@Data
@Entity
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long numSkieur;
    public String nomS;
    public String prenomS;
    @Temporal(TemporalType.DATE)
    public Date dateNaissance;
    public String voille;
    @OneToMany(mappedBy = "skieur")
    public List<Inscription> inscriptions;
    @ManyToMany(mappedBy = "skieurs")
    public List<Piste> pistes;
    @OneToOne(cascade = CascadeType.ALL)
    public Abvonnement abvonnement;
}
