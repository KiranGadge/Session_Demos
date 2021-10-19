package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cook1")
public class DemoCookie extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Cookie c = new Cookie("uname","kiran");
	//	c.setMaxAge(60*60);
		PrintWriter out = resp.getWriter();
		out.print("<html><body>");
		out.print("<h1>Hii ....Welcome to Cookie demo</h1>");
	//	resp.addCookie(c);
		Cookie [] arr=req.getCookies();
		for(Cookie c:arr)
		{
			out.println(c.getName()+"-->"+c.getValue());
		}
		out.print("</body></html>");
	}
}
