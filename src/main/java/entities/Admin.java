
package entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ROLE_ADMIN")
public class Admin extends User implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Admin() {
    }

    public Admin(String email, String mdp) {
        super(email, mdp);
    }
    
    
}
