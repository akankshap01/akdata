<%@ page language="java" import="com.training.beans.*,java.text.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
   Product p=(Product)request.getAttribute("p");
   SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
   String dt=sdf.format(p.getExpDate());
   
%>
<form action="/rest-demo/updateproduct">
    Id : <input type="text" name="id" value="${p.id}" readonly>
    Name :<input type="text" name="nm" value="${p.name}">
    Quantity : <input type="text" name="qty" value="${p.qty}">
    Expiry Date :<input type="text" name="dt" value="${dt}" >
    <input type="submit" name="btn" value="Edit Product" >
</form>

</body>
</html>