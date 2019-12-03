package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CounterServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		int cnt=Integer.parseInt(request.getParameter("count"));
		cnt++;
		out.println("<h1>you clicked "+cnt +"Times</h1>");
		out.println("<a href='counter?count="+cnt+"'>click me</a>");
		
	}

}
