package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddCookieServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String op=request.getParameter("btn");
		PrintWriter out=response.getWriter();
		switch(op) {
		case "Add Cookie":
			String nm=request.getParameter("nm");
			String val=request.getParameter("val");
			Cookie c=new Cookie(nm,val);
			response.addCookie(c);
			out.println("Cookie Added");
			break;
		case "Show Cookie":
			Cookie[] carr=request.getCookies();
			for(Cookie c1:carr) {
				out.println(c1.getName()+"----->"+c1.getValue());
			}
			
			break;
		case "Delete Cookie":
			 nm=request.getParameter("nm");
			 carr=request.getCookies();
			for(Cookie c1:carr) {
				if(c1.getName().equals(nm)) {
			    c1.setMaxAge(0);
			    out.println(c1.getName()+"----->"+c1.getValue());
			    response.addCookie(c1);
			    break;
				}
			}
			break;
		}
		RequestDispatcher rd=request.getRequestDispatcher("addcookie.html");
		rd.include(request, response);
		
	}

}
