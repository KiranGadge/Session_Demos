package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cook2")
public class DemoCookie2 extends HttpServlet  {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1>Welcome to DemoCookie 2</h1>");
		Cookie [] arr =request.getCookies();
		for(Cookie c:arr)
		{
			System.out.println(c.getName()+"---->"+c.getValue());
		}
	}

	
}
