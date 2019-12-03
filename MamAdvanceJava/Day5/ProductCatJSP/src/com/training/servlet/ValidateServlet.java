package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.service.LoginService;
import com.training.service.LoginServiceImpl;

public class ValidateServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String upass=request.getParameter("upass");
		LoginService ls=new LoginServiceImpl();
		boolean ans=ls.validate(uname,upass);
		if(ans)
		{
			
			RequestDispatcher rv=request.getRequestDispatcher("category");
			
			HttpSession sess=request.getSession();
			if(sess.isNew())
			{
			sess.setAttribute("uname",uname);
			}
			System.out.println("in ans");
			rv.forward(request, response);
		}
		else
		{
			PrintWriter write=response.getWriter();
			write.println("<h1>please re-enter credentials...<h1>");
			RequestDispatcher rv=request.getRequestDispatcher("Login.html");
			rv.include(request, response);
		}
		
	}
	

}
