package entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CHAMBRES")
public class Chambre{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idChambre;
    private Integer numero;
    private Integer taille;
    private Integer type;
    private Boolean climatisation;
    //private Collection<String> photos;
    private String description;
    @ManyToOne
    @JoinColumn(name="ID_HOTEL")
    private Hotel hotel;
    
    @OneToMany(mappedBy="chambre",fetch=FetchType.LAZY)
    private Collection<Reservation> reservations;
    @OneToMany(mappedBy="chambre",fetch=FetchType.LAZY)
    private Collection<Prix> prix;
    

    public Chambre() {
    }

    public Chambre(Integer numero, Integer taille, Integer type, Boolean climatisation, String description) {
        this.numero = numero;
        this.taille = taille;
        this.type = type;
        this.climatisation = climatisation;
        //this.photos = photos;
        this.description = description;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getTaille() {
        return taille;
    }

    public void setTaille(Integer taille) {
        this.taille = taille;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getClimatisation() {
        return climatisation;
    }

    public void setClimatisation(Boolean climatisation) {
        this.climatisation = climatisation;
    }

    /*public Collection<String> getPhotos() {
        return photos;
    }

    public void setPhotos(Collection<String> photos) {
        this.photos = photos;
    }*/

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Collection<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Collection<Prix> getPrix() {
        return prix;
    }

    public void setPrix(Collection<Prix> prix) {
        this.prix = prix;
    }

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
    
    
}
