
package entities;

import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="HOTELS")
public class Hotel{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idHotel;
    private String nom;
    private Integer nbEtoiles;
    private String adresse;
    private Integer piscine;
    private boolean restaurant;
    private boolean parking;
    private boolean wifi;
    private String describtion;
    //ArrayList<Blob> images;
    private String numCarteBancaire;
   
    @OneToMany(mappedBy="hotel",fetch=FetchType.LAZY)
    private Collection<Gerant> gerants;
    @OneToMany(mappedBy="hotel",fetch=FetchType.LAZY)
    private Collection<Rating> ratings;
    @OneToMany(mappedBy="hotel",fetch=FetchType.LAZY)
    private Collection<Commentaire> commentaires;
    @OneToMany(mappedBy="hotel",fetch=FetchType.LAZY)
    private Collection<Chambre> chambres;

    public Hotel() {
    }

    public Hotel(String nom, Integer nbEtoiles, String adresse, Integer piscine, boolean restaurant, boolean parking, boolean wifi, String describtion,String numCarteBancaire, String email, String mdp, Date date_ajout) {
        this.nom = nom;
        this.nbEtoiles = nbEtoiles;
        this.adresse = adresse;
        this.piscine = piscine;
        this.restaurant = restaurant;
        this.parking = parking;
        this.wifi = wifi;
        this.describtion = describtion;
       // this.images = images;
        this.numCarteBancaire = numCarteBancaire;
    }

    public Long getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Long idHotel) {
        this.idHotel = idHotel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNbEtoiles() {
        return nbEtoiles;
    }

    public void setNbEtoiles(Integer nbEtoiles) {
        this.nbEtoiles = nbEtoiles;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getPiscine() {
        return piscine;
    }

    public void setPiscine(Integer piscine) {
        this.piscine = piscine;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }
/*
    public ArrayList<Blob> getImages() {
        return images;
    }

    public void setImages(ArrayList<Blob> images) {
        this.images = images;
    }
*/
    public String getNumCarteBancaire() {
        return numCarteBancaire;
    }

    public void setNumCarteBancaire(String numCarteBancaire) {
        this.numCarteBancaire = numCarteBancaire;
    }

    public Collection<Gerant> getGerants() {
        return gerants;
    }

    public void setGerants(Collection<Gerant> gerants) {
        this.gerants = gerants;
    }

    public Collection<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(Collection<Rating> ratings) {
        this.ratings = ratings;
    }

    public Collection<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(Collection<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public Collection<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(Collection<Chambre> chambres) {
        this.chambres = chambres;
    }
    
    
}
