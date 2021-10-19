package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/third")
public class Servlet2  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		out.print("Welcome on Second page"+req.getParameter("fname"));
		
		ServletContext ctx = getServletContext();
		ServletConfig cfg = getServletConfig();
		String user= cfg.getInitParameter("user");
		String comp = cfg.getInitParameter("company");
		
		out.print("user is:- "+user);
		out.print("Company:- "+comp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	}
	
}
//javax.servlet.
//javax.servlet.http.