<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/myHello" prefix="say" %>
<%@taglib uri="/mysub" prefix="mytag" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String lname = "Khadilkar";
		String fname = "Kishori";
	%>
	<say:hello lastName="<%=lname %>" firstName="<%=fname %>"/>
	<say:add num1="20" num2="30"/>
	<mytag:subtract num1="50" num2="20"></mytag:subtract>
</body>
</html>










