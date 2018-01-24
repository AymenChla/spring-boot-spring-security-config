package entities;

import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("ROLE_GERANT")
public class Gerant extends User{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String nom;
    private String prenom;
    private String cin;
    private Date dateNaissance;
    private String sexe;
    private String tel;
    private String adresse;
    
    @ManyToOne
    @JoinColumn(name="ID_HOTEL")
    private Hotel hotel;

    public Gerant() {
    }

    public Gerant(String nom, String prenom, String cin, Date date_naissance, String sexe, String tel, String adresse, String email, String mdp) {
        super(email, mdp);
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.dateNaissance = date_naissance;
        this.sexe = sexe;
        this.tel = tel;
        this.adresse = adresse;
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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date date_naissance) {
        this.dateNaissance = date_naissance;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    
}
