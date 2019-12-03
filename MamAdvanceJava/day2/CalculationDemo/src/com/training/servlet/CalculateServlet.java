package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		int n1=Integer.parseInt(request.getParameter("n1"));
		int n2=Integer.parseInt(request.getParameter("n2"));
		String op = request.getParameter("btn");
		
		switch(op)
		{
		case "Add":
			out.println("Addition : "+(n1+n2));
			break;
		case "Sub":
			out.println("Subtraction : "+(n1-n2));
			break;
		case "Multiply":
			out.println("Multiplication : "+(n1*n2));
			break;
		}
	}

}
