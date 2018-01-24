
package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="RATINGS")
public class Rating {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idRating;
    private Integer nbEtoiles;
    @ManyToOne
    @JoinColumn(name="ID_HOTEL")
    private Hotel hotel;
    @ManyToOne
    @JoinColumn(name="ID_CLIENT")
    private Client client;

    public Rating() {
    }

    public Rating(Integer nb_etoiles) {
        this.nbEtoiles = nb_etoiles;
    }

    public Long getIdRating() {
        return idRating;
    }

    public void setIdRating(Long id_rating) {
        this.idRating = id_rating;
    }

    public Integer getNbEtoiles() {
        return nbEtoiles;
    }

    public void setNbEtoiles(Integer nb_etoiles) {
        this.nbEtoiles = nb_etoiles;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    
}
