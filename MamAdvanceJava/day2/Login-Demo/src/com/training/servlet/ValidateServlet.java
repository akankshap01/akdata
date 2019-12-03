package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.service.LoginService;
import com.training.service.LoginServiceImpl;

public class ValidateServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("uname");
		String password=request.getParameter("upass");
		LoginService ls=new LoginServiceImpl();
		boolean ans=ls.validate(name,password);
		if(ans)
		{
			RequestDispatcher rd = request.getRequestDispatcher("calculation.html");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			out.println("<h3>please re-enter credential..</h3>");
			rd.include(request, response);
		}
	}
}
