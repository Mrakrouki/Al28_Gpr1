package entity;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * 
 */
@Entity
@DiscriminatorValue("CLIENTP")
public class ClientPhysique extends PersonnePhysique {

    /**
     * Default constructor
     */
    public ClientPhysique() {
    }

    /**
     * 
     */
    @OneToMany(mappedBy="pers")
    private List<Commande> commandesClient;

	public List<Commande> getCommandesClient() {
		return commandesClient;
	}

	public void setCommandesClient(List<Commande> commandesClient) {
		this.commandesClient = commandesClient;
	}

    
}