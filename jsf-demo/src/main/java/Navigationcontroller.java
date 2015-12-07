import javax.faces.bean.ManagedProperty;


public class Navigationcontroller  {

	
	@ManagedProperty( value="#{param.pageid}")
	private  String   pageid   ;
	
	public  String   showPage  () 
	{
		
		if(pageid  ==   null )
		{
			return "index"  ;
		}
		if (pageid.equals("1"))
			return   "login"  ;
		        
	 else if (pageid.equals("2")) 
	          {
		     return   "logout" ;
		      }
	      else 
	      {
	    	 return  "index"  ;
	      }
	
	}
	
	
	
	} 


