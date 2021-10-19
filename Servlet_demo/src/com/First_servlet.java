package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class First_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public First_servlet()
	{
		System.out.println("In default constructor of servlet");
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		PrintWriter out = response.getWriter();
		String method = request.getMethod();
		String uname = request.getParameter("fname");
		System.out.println("Method:- "+method);
		
		out.println("Welcome!!! Have a great day.");
		
		out.println("<html><body bgcolor='blue'>");
		out.println("<h1>Hii "+uname+"</h1>");
		out.println("</body></html>");
		
	}
}
