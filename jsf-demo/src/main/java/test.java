import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="test"  ,eager=true)
@RequestScoped
public class test   implements   Serializable {

	private  String name  ;
	
public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

public  String move() 
{

return  "succes"  ;
}

}

