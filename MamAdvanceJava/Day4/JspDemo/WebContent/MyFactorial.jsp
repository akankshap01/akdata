<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.html" %>
<%!
    public int factorial(int n){
	int fact=1;
	int i=1;
	while(i<=n){
		fact=fact*i;
		i++;
	}
	return fact;
	
   }
%>
<%
   int n=Integer.parseInt(request.getParameter("n1"));
   int f=factorial(n);
%>

Factorial : <%=f%>


<%@include file="footer.html" %>

</body>
</html>