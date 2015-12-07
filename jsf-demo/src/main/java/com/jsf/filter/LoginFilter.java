package com.jsf.filter;
import java.io.IOException;




import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsf.bean.authentification;


public class LoginFilter   implements   Filter {

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		
		HttpServletRequest   req =  (HttpServletRequest)   arg0  ;
		HttpServletResponse  rep = (HttpServletResponse)    arg1  ;
		authentification   session = (authentification) req.getSession().getAttribute("bean")  ;
		String  url   =  req.getRequestURI() ;
		/*
		System.out.println(req.getServletContext().getContextPath());
       if( session ==   null    ||  !session.isIdlogged()  )
		{
    	   if(url.indexOf("forum.xhtml")>=0  ||  url.indexOf("logout.xhtml") >=0)
    	   		{
			rep.sendRedirect(req.getServletContext().getContextPath()+ "/login.xhtml");
    	   		}
            else  
            	{
            	chain.doFilter(arg0, arg1);
            	}
		}
      else   
    	{
	       if(url.indexOf("register.xhtml")>=0  ||  url.indexOf("login.xhtml") >=0)
	         	{  
	    	  rep.sendRedirect(req.getServletContext().getContextPath()+ "/forum.xhtml");
	         	} 
	   
	       else if (url.indexOf("logout.xhtml") >=0 )
	          	{
	    	  
	    	  req.getServletContext().removeAttribute("bean");
	    	  rep.sendRedirect(req.getServletContext().getContextPath()+ "/login.xhtml");
	          	}
	      		else
	      		{	
	    	  chain.doFilter(arg0, arg1);
	            }
	           
    	}
	*/
	}
     
		
	

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
