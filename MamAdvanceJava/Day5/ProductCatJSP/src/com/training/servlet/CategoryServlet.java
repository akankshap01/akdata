package com.training.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.beans.Category;
import com.training.service.CategoryService;
import com.training.service.CategoryServiceImpl;

public class CategoryServlet extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		CategoryService cs= new CategoryServiceImpl();
		List<Category> clist= cs.getAllCategory();
		request.setAttribute("clist", clist);
		RequestDispatcher rd=request.getRequestDispatcher("Category.jsp");
		rd.forward(request, response);
	}

}
