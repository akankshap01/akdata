<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*, com.training.beans.Category"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int sum=23;
List<Category> clist=(ArrayList<Category>) request.getAttribute("clist");
%>
<form action="product">
<select name="cat">
<c:forEach var="c" items="${clist}">
  <option value="${c.getCid()}" >${c.getcName()}</option>
</c:forEach>
Sum : <%=sum%> ${sum}
<c:out value="sum"></c:out>
<c:set var="i" val="10"></c:set>
</select>
<input type="submit" name="btn" value="Submit">
</form>
</body>
</html>