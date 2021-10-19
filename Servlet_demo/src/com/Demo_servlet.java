package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Demo_servlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public Demo_servlet(){
		System.out.println("In default constructor of servlet");
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		HttpSession ses=request.getSession();
		PrintWriter out=response.getWriter();
		ServletContext ctx = getServletContext();
		int i=(int)ctx.getAttribute("activeuser");
		out.println("<html><body>");
		out.println("<h1>Welcome</h1>");
		out.println("Active count---> "+i);
		out.println("</body></html>");
		
		
		/*String method=request.getMethod();
		String username=request.getParameter("fname");
		String passwd=request.getParameter("pass");
		
		
		Cookie c=new Cookie("uname",username );
		c.setMaxAge(3600);
		response.addCookie(c);
		
		if(username.equals("kiran") && passwd.equals("300797"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("third");
			rd.forward(request, response);
		}
	
		else
		{
			out.println("Enter valid username and password");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
		*/
		
	}

	
}
