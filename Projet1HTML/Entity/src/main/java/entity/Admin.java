package entity;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * 
 */
@Entity
@DiscriminatorValue("ADMIN")
public class Admin extends PersonnePhysique {

    /**
     * Default constructor
     */
    public Admin() {
    }

}