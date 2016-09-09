package entity;

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
@Table(name = "activite")
public class Activite {

    /**
     * Default constructor
     */
    public Activite() {
    }
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idActivite;

    /**
     * 
     */
    private String libelle;

    /**
     * 
     */
    private Integer nbrePlaces;

    /**
     * 
     */
    private Integer duree;

    /**
     * 
     */
    private Integer prix;

    /**
     * 
     */
    private Integer reduction;

    /**
     * 
     */
    private String adresse;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private String plageHoraire;

    @ManyToOne
    @JoinColumn(name="idZone")
    private Zone zone;
    
    @ManyToOne
    @JoinColumn(name="idPersonneMorale")
    private PersonneMorale persM;
    
    @ManyToOne
    @JoinColumn(name="idPersonnePhysique")
    private PersonnePhysique persP;

    
	/**
     * 
     */
    @OneToMany(mappedBy="activite")
    private List<Reservation> reservationsActivite;

    @OneToMany(mappedBy="activite")
    private List<Images> imagesActivite;

    /**
     * 
     */
    @OneToMany(mappedBy="activite")
    private List<DisponibiliteParticuliere> disponibilitesActivite;



	public String getLibelle() {
		return libelle;
	}



	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public Zone getZone() {
		return zone;
	}



	public void setZone(Zone zone) {
		this.zone = zone;
	}



	public Integer getNbrePlaces() {
		return nbrePlaces;
	}



	public void setNbrePlaces(Integer nbrePlaces) {
		this.nbrePlaces = nbrePlaces;
	}



	public Integer getDuree() {
		return duree;
	}



	public void setDuree(Integer duree) {
		this.duree = duree;
	}



	public Integer getPrix() {
		return prix;
	}



	public void setPrix(Integer prix) {
		this.prix = prix;
	}



	public Integer getReduction() {
		return reduction;
	}



	public void setReduction(Integer reduction) {
		this.reduction = reduction;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getPlageHoraire() {
		return plageHoraire;
	}



	public void setPlageHoraire(String plageHoraire) {
		this.plageHoraire = plageHoraire;
	}



	public List<Reservation> getReservationsActivite() {
		return reservationsActivite;
	}



	public void setReservationsActivite(List<Reservation> reservationsActivite) {
		this.reservationsActivite = reservationsActivite;
	}
	
	



	public List<Images> getImagesActivite() {
		return imagesActivite;
	}



	public void setImagesActivite(List<Images> imagesActivite) {
		this.imagesActivite = imagesActivite;
	}



	public List<DisponibiliteParticuliere> getDisponibilitesActivite() {
		return disponibilitesActivite;
	}



	public void setDisponibilitesActivite(List<DisponibiliteParticuliere> disponibilitesActivite) {
		this.disponibilitesActivite = disponibilitesActivite;
	}



	public Integer getId() {
		return idActivite;
	}



	public void setId(Integer id) {
		this.idActivite = id;
	}

	public PersonneMorale getPersM() {
		return persM;
	}



	public void setPersM(PersonneMorale persM) {
		this.persM = persM;
	}



	public PersonnePhysique getPersP() {
		return persP;
	}



	public void setPersP(PersonnePhysique persP) {
		this.persP = persP;
	}
    
    
}