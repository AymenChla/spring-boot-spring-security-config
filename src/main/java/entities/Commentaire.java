
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
@Table(name="COMMENTAIRES")
public class Commentaire{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idCommentaire;
    private String commentaire;
    private Date dateCommentaire;
    
    @ManyToOne
    @JoinColumn(name="ID_USER")
    private User user;
    @ManyToOne
    @JoinColumn(name="ID_HOTEL")
    private Hotel hotel;

    public Commentaire() {
    }

    public Commentaire(String commentaire, Date date_commentaire) {
        this.commentaire = commentaire;
        this.dateCommentaire = date_commentaire;
    }

    public Long getIdCommentaire() {
        return idCommentaire;
    }

    public void setIdCommentaire(Long id_commentaire) {
        this.idCommentaire = id_commentaire;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDateCommentaire() {
        return dateCommentaire;
    }

    public void setDateCommentaire(Date date_commentaire) {
        this.dateCommentaire = date_commentaire;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    
    
}
