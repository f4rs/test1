package tn.esprit.ski.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ski.Entities.Abvonnement;
import tn.esprit.ski.Entities.Piste;
import tn.esprit.ski.Entities.TypeAbonnement;
import tn.esprit.ski.Service.AbonnementServiceImpl;
import tn.esprit.ski.Service.PisteServiceImpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

@RestController
public class AbonnementController {
    @Autowired
    private AbonnementServiceImpl abonnementService;
    @PostMapping("/Abvonnements")
    public Abvonnement AddOrUpdateAbvonnement(@RequestBody Abvonnement abvonnement){
        return abonnementService.addOrUpdateAbvonnement(abvonnement);
    }
    @PostMapping("/Abonnements/Bytype")
    public Set<Abvonnement> getSubscriptionByType(TypeAbonnement type){
        return abonnementService.getSubscriptionByType(type);
    }
/*    @PostMapping("/Abonnements/ByDate/{startDate} {endDate}")
    public List<Abvonnement> retrieveSubscriptionsByDates(@PathVariable("startDate")  String startDate,@PathVariable("endDate") String endDate){
        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate start = dateTimeFormat.parse(startDate, LocalDate::from);
        LocalDate end = dateTimeFormat.parse(endDate, LocalDate::from);
        return  abonnementService.retrieveSubscriptionsByDates(start,end);
    }*/

}
