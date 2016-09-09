package entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name="commande")
public class Commande {

    /**
     * Default constructor
     */
    public Commande() {
    }

    /**
     * 
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idCommande;
   
    private Date dateCommande;


    @ManyToOne
    @JoinColumn(name="idPersonnePhysique")
    private PersonnePhysique pers;
    

	/**
     * 
     */
    @OneToMany(mappedBy="commande")
    private List<Reservation> reservationsCommande;


	public Integer getId() {
		return idCommande;
	}


	public void setId(Integer id) {
		this.idCommande = id;
	}


	public Date getDateCommande() {
		return dateCommande;
	}


	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}


	public List<Reservation> getReservationsCommande() {
		return reservationsCommande;
	}


	public void setReservationsCommande(List<Reservation> reservationsCommande) {
		this.reservationsCommande = reservationsCommande;
	}

	public PersonnePhysique getPers() {
		return pers;
	}


	public void setPers(PersonnePhysique pers) {
		this.pers = pers;
	}
    
    
}