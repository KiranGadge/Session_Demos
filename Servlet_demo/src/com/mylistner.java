package com;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class mylistner implements HttpSessionListener {
private int activecount=0;
private int totalcount=0;
	
    public void sessionCreated(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	activecount++;
    	totalcount++;
    	HttpSession ses = se.getSession();
    	ServletContext ctx = ses.getServletContext();
    	ctx.setAttribute("activeuser", activecount);
    	ctx.setAttribute("totaluser", totalcount);
    	System.out.println("listener is active");
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	activecount--;
    	HttpSession ses = se.getSession();
    	ServletContext ctx = ses.getServletContext();
    	ctx.setAttribute("activeuser", activecount);
    	
    }
	
}
