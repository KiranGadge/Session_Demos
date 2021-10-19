package com;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/students")
public class Jdbcservlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user="kiran";
		
		ArrayList<String> al= new ArrayList<>();
		al.add("Tejas");
		al.add("Ayush");
		al.add("vaishali");
		
		req.setAttribute("friendlist", al);
		req.setAttribute("user", user);
		
		RequestDispatcher rd = req.getRequestDispatcher("view.jsp");
		rd.forward(req, resp);
	}
}
