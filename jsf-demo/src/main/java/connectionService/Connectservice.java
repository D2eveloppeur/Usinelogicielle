package connectionService;

public interface Connectservice {

	
	boolean   userExist (String username ,String  password);
	
	void singup(String   username  , String password );
	
	void  singing(String   username  , String password ) ;
	
	
}
