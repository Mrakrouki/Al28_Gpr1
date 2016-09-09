package entity;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_personne")
public abstract class PersonnePhysique {

    /**
     * 
     */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idPersonnePhysique;
	
    private String nom;

    /**
     * 
     */
    private String prenom;

    /**
     * 
     */
    private String adresse;

    /**
     * 
     */
    private String dateNaissance;

    /**
     * 
     */
    private String adresseMail;

    /**
     * 
     */
    private String hashCode;

    /**
     * 
     */
    private String identifiant;

    @Column(insertable = false, updatable = false)
    private String type_personne;

	public Integer getId() {
		return idPersonnePhysique;
	}

	public void setId(Integer id) {
		this.idPersonnePhysique = id;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	public String getHashCode() {
		return hashCode;
	}

	public void setHashCode(String hashCode) {
		this.hashCode = hashCode;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getType_personne() {
		return type_personne;
	}

	public void setType_personne(String type_personne) {
		this.type_personne = type_personne;
	}
    
    
}