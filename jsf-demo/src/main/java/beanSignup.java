import javax.faces.bean.ManagedBean;

import connectionService.connectionserviceImplement;

@ManagedBean(name="signup" ,eager=true)
public class beanSignup {



	private   String   name  ; 
	private   String   pass  ;
	
	private connectionserviceImplement  connectionservice ;
	

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
	/**
	 * 
	 */
	public beanSignup() {
		this.connectionservice  = new connectionserviceImplement() ;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String register()
	{
		connectionservice.singup(name, pass);
		
		return  "/register.xhml?faces-redirect = true";
	}
	
	
	
	
	
	
}
