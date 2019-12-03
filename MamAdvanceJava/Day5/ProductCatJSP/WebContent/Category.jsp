<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*, com.training.beans.Category"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<Category> clist=(ArrayList<Category>) request.getAttribute("clist");
%>
<form action="product">
<select name="cat">
<%
for(Category c:clist){
%>
<option value="<%=c.getCid() %>">
<%=c.getcName() %>
</option>
<%} %>
</select>
<input type="submit" name="btn" value="Submit">
</form>
</body>
</html>