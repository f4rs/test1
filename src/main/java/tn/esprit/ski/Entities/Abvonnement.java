package tn.esprit.ski.Entities;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

@Entity
@Data
public class Abvonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long numAbon;
    @Temporal(TemporalType.DATE)
    public Date dateDebut;
    @Temporal(TemporalType.DATE)
    public Date dateFin;
    public float prixAbon;
    @Enumerated(EnumType.STRING)
    public TypeAbonnement typeAbon;

}
