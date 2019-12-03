package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HiddenServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out=response.getWriter();
		String code=request.getParameter("code");
		String name=request.getParameter("nm");
		System.out.println("code: "+code);
		System.out.println("Name : "+name);
		out.println("changes done");
	}

}
