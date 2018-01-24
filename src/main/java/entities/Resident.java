
package entities;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="RESIDENTS")
public class Resident {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idResident;
    private String nom;
    private String prenom;
    private String cin;
    private String tel;
    private String dateNaissance;
    @OneToMany(mappedBy="resident",fetch=FetchType.LAZY)
    private Collection<Reservation> reservations;

    public Resident() {
    }

    public Resident(String nom, String prenom, String cin, String tel, String dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.tel = tel;
        this.dateNaissance = dateNaissance;
    }

    public Long getIdResident() {
        return idResident;
    }

    public void setIdResident(Long idResident) {
        this.idResident = idResident;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Collection<Reservation> reservations) {
        this.reservations = reservations;
    }
    
}
