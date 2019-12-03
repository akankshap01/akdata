package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParamServlet extends HttpServlet {
	private int intRate;
	
	public void init(ServletConfig c) throws ServletException{
		super.init(c);
		System.out.println("In Init param init method");
		intRate=Integer.parseInt(c.getInitParameter("rate"));
		Enumeration e=c.getInitParameterNames();
		while(e.hasMoreElements()) {
			String nm=(String)e.nextElement();
			System.out.println(nm+"---->"+c.getInitParameter(nm));
		}
		
	}
	/*public void init(){
	    ServletConfig c=getServletConfig();
	    intRate=Integer.parseInt(c.getInitParameter("rate"));
		Enumeration e=c.getInitParameterNames();
		while(e.hasMoreElements()) {
			String nm=(String)e.nextElement();
			System.out.println(nm+"---->"+c.getInitParameter(nm));
	}*/
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		int loanAmt=20000;
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<h1>Rate : "+ (loanAmt*intRate)+"</h1>");
		
		
	}

}
