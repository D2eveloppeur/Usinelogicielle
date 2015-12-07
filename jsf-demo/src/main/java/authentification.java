
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.servlet.http.HttpSession;

import connectionService.connectionserviceImplement;

@ManagedBean(name="bean" ,eager=true)
@SessionScoped
public class authentification   implements   Serializable{

	private   String   name  ; 
	private   String   pass  ;
	private   connectionserviceImplement  connectionservice ;
	private     boolean     idlogged   ;

	public connectionserviceImplement getConnectionservice() {
		return connectionservice;
	}

	public void setConnectionservice(connectionserviceImplement connectionservice) {
		this.connectionservice = connectionservice;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	
	
	
 public  String   action ()
 {
	if(connectionservice.singing(this.name, this.pass))
	{    
		System.out.println(connectionservice.singing(this.name, this.pass));
		return "/forum.xhml?faces-redirect = true" ;
	}
else {
	 
	  return "/logout.xhml?faces-redirect = true";
    }
	 
 }

/**
 * 
 */
public authentification() {
	this.connectionservice  = new connectionserviceImplement() ;
}

}



