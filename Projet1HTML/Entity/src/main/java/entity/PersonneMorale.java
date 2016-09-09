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
public abstract class PersonneMorale {

    /**
     * 
     */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idPersonneMorale;
	
    private String raisonSociale;

    /**
     * 
     */
    private String adresse;
    @Column(insertable = false, updatable = false)
    private String type_personne;

	public Integer getId() {
		return idPersonneMorale;
	}

	public void setId(Integer id) {
		this.idPersonneMorale = id;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getType_personne() {
		return type_personne;
	}

	public void setType_personne(String type_personne) {
		this.type_personne = type_personne;
	}
    
    

}