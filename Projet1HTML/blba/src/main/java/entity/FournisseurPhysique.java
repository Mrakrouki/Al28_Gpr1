package entity;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("FOURNISSEURP")
public class FournisseurPhysique extends PersonnePhysique{

	public FournisseurPhysique() {
    }

    /**
     * 
     */
	@OneToMany(mappedBy="persP")
    private List<Activite> activitesFournisseur;

	public List<Activite> getActivitesFournisseur() {
		return activitesFournisseur;
	}

	public void setActivitesFournisseur(List<Activite> activitesFournisseur) {
		this.activitesFournisseur = activitesFournisseur;
	}

    
}
	
