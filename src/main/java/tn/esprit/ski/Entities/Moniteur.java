package tn.esprit.ski.Entities;

import lombok.Data;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Data
public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long numMoniteur;
    public String nomM;
    public  String prenomM;
    @Temporal(TemporalType.DATE)
    public Date dateRecru;
    @OneToMany
    public List<Cours> cours;
}
