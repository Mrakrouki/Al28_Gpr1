package entity;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
@Entity
@DiscriminatorValue("FOURNISSEURM")
public class FournisseurMoral extends PersonneMorale{

	 public FournisseurMoral() {
	    }

	    /**
	     * 
	     */
	 
	 	@OneToMany(mappedBy="persM")
	    private List<Activite> activitesFournisseur;

		public List<Activite> getActivitesFournisseur() {
			return activitesFournisseur;
		}

		public void setActivitesFournisseur(List<Activite> activitesFournisseur) {
			this.activitesFournisseur = activitesFournisseur;
		}

	    
	}
