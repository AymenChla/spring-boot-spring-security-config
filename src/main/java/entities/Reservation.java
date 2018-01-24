
package entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="RESERVATIONS")
public class Reservation{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idReservation;
    private Date dateDebutSejour;
    private Date dateFinSejour;
    private Boolean payer;
    @ManyToOne
    @JoinColumn(name="ID_CLIENT")
    private Client client;
    
    @ManyToOne
    @JoinColumn(name="ID_RESIDENT")
    private Resident resident;
    
    @ManyToOne
    @JoinColumn(name="ID_CHAMBRE")
    private Chambre chambre;

    public Reservation() {
    }

    public Reservation(Date date_debut_sejour, Date date_fin_sejour, Boolean payer) {
        this.dateDebutSejour = date_debut_sejour;
        this.dateFinSejour = date_fin_sejour;
        this.payer = payer;
    }

    public Long getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Long code_reservation) {
        this.idReservation = code_reservation;
    }

    public Date getDateDebutSejour() {
        return dateDebutSejour;
    }

    public void setDateDebutSejour(Date date_debut_sejour) {
        this.dateDebutSejour = date_debut_sejour;
    }

    public Date getDateFinSejour() {
        return dateFinSejour;
    }

    public void setDateFinSejour(Date date_fin_sejour) {
        this.dateFinSejour = date_fin_sejour;
    }

    public Boolean getPayer() {
        return payer;
    }

    public void setPayer(Boolean payer) {
        this.payer = payer;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Resident getResident() {
        return resident;
    }

    public void setResident(Resident resident) {
        this.resident = resident;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }
    
    
    
}
