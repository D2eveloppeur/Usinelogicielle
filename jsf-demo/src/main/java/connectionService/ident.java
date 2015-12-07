package connectionService;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;






@javax.persistence.Entity
@Table(name="users")
public class ident {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
	private    int idusers ;
	private   String nom ;
	
	private   String pass  ;

	/**
	 * 
	 */
	public ident() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
