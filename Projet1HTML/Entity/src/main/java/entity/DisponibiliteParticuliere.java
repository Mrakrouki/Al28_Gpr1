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
@Table(name="disponibilite")
public class DisponibiliteParticuliere {

    public Activite getActivite() {
		return activite;
	}

	public void setActivite(Activite activite) {
		this.activite = activite;
	}

	/**
     * Default constructor
     */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idDisponibiliteParticuliere;
	
    public DisponibiliteParticuliere() {
    }

    /**
     * 
     */
    private Date dateDispo;

    /**
     * 
     */
    private Integer nbrePlaces;

   @ManyToOne
   @JoinColumn(name="idActivite")
    private Activite activite;
    
    
	public Integer getId() {
		return idDisponibiliteParticuliere;
	}

	public void setId(Integer id) {
		this.idDisponibiliteParticuliere = id;
	}

	public Date getDateDispo() {
		return dateDispo;
	}

	public void setDateDispo(Date dateDispo) {
		this.dateDispo = dateDispo;
	}

	public Integer getNbrePlaces() {
		return nbrePlaces;
	}

	public void setNbrePlaces(Integer nbrePlaces) {
		this.nbrePlaces = nbrePlaces;
	}

    

}