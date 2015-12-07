package connectionService;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;


@Repository
public class connectionserviceImplement  {
    @Autowired
	private   SessionFactory  sessionfactory  ;
    private  ApplicationContext   context ;
    private    Session             session ;
    private  Transaction            tx ;
	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}

	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

  
	
	public boolean userExist(String username, String password) {
		// TODO Auto-generated method stub
//	ApplicationContext  app  = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	//SessionFactory    f =   app.getBean(SessionFactory.class,"sessionfactory ") ;
		session   = getSessionfactory().openSession() ;
		tx =  session.beginTransaction();
	String req =  "from  ident "+" where nom = :nom and  pass= :pass " ;
	Query  query = session.createQuery(req);
	query.setParameter("nom", username);
	query.setParameter("pass",password );
	
	  List<ident>   list = (List<ident>)query.list()  ;
		

		if(list.size() == 0)
			return false ;
		else  
		    return  true ;
	}

	public void singup(String username, String password) {
		// TODO Auto-generated method stub
		
	     session = getSessionfactory().openSession() ;
         tx = session.beginTransaction() ;
         ident   user = new ident()  ;
         user.setNom(username);
         user.setPass(password);
         session.save(user);
         tx.commit();
         session.close();
        
	}

	public boolean singing(String username, String password) {
		// TODO Auto-generated method stub
	
		 if (this.userExist(username, password))
			 return true ;
		 else 
		   return false ;
	}
	
	/** 
	 * 
	 */
	public connectionserviceImplement() {
	
		ApplicationContext      app   =   new  ClassPathXmlApplicationContext("ApplicationContext.xml") ;
		this.sessionfactory = (SessionFactory)app.getBean("sessionfactory");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          

	System.out.println("Le  monde informtique");
	
	  connectionserviceImplement   con = new connectionserviceImplement()  ;
	   System.out.println(con.userExist("adel", "diaw"));
}
}
