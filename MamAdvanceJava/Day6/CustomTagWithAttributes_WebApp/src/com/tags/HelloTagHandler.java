package com.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloTagHandler extends TagSupport {
	private String firstName, lastName;
	public int doStartTag()throws JspException{
		return EVAL_BODY_INCLUDE;
	}
	public int doEndTag()throws JspException{
		JspWriter out = pageContext.getOut();
		try {
			out.println("<h2>Hello " + lastName + ", " + firstName + "</h2>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
