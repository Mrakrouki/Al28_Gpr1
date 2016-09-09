package entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name="zone")
public class Zone {

    /**
     * Default constructor
     */
    public Zone() {
    }

    /**
     * 
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idZone;
    private String libelle;

    /**
     * 
     */
    private String coordonnes;

    /**
     * 
     */
   @OneToMany(mappedBy="zone")
    private List<Activite> activitesZone;

	public Integer getId() {
		return idZone;
	}

	public void setId(Integer id) {
		this.idZone = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getCoordonnes() {
		return coordonnes;
	}

	public void setCoordonnes(String coordonnes) {
		this.coordonnes = coordonnes;
	}

	public List<Activite> getActivitesZone() {
		return activitesZone;
	}

	public void setActivitesZone(List<Activite> activitesZone) {
		this.activitesZone = activitesZone;
	}

    
}