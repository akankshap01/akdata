<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<c:forEach var="p" items="${plist}">
<tr>
<td><%=p.getId() %></td>
<td><%=p.getName() %></td>
<td><%=p.getQty() %></td>
<td><%=p.getExpDate() %></td>
<td><a href="delete?pid=<%=p.getPid()%>">delete</a>/
<a href="edit?pid=<%=p.getPid()%>">delete</a>
</td>
</tr>

</c:forEach>
</table>
<a href="addProduct">Add Product</a>
</body>
</html>