package entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 */

@Entity
@Table(name="reservation")
public class Reservation {

    /**
     * Default constructor
     */
    public Reservation() {
    }

    /**
     * 
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idReservation;
    
    
    private Date dateReserve;

    /**
     * 
     */
    private Integer nbrePlaces;

    @ManyToOne
    @JoinColumn(name="idActivite")
    private Activite activite;
    
    @ManyToOne
    @JoinColumn(name="idCommande")
    private Commande commande;
    
	public Integer getId() {
		return idReservation;
	}

	public void setId(Integer id) {
		this.idReservation = id;
	}

	
	public Activite getActivite() {
		return activite;
	}

	public void setActivite(Activite activite) {
		this.activite = activite;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Date getDateReserve() {
		return dateReserve;
	}

	public void setDateReserve(Date dateReserve) {
		this.dateReserve = dateReserve;
	}

	public Integer getNbrePlaces() {
		return nbrePlaces;
	}

	public void setNbrePlaces(Integer nbrePlaces) {
		this.nbrePlaces = nbrePlaces;
	}




}