<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <jsp:useBean id="c" class="com.training.beans.Customer"></jsp:useBean>
    <%-- <jsp:setProperty property="cid" name="c" value='<%=Integer.parseInt(request.getParameter("cid")) %>'/>
    <jsp:setProperty property="cname" name="c" value='<%=request.getParameter("cname") %>'/>
    <jsp:setProperty property="mobile" name="c" value='<%=request.getParameter("mobile") %>'/> --%>
    <jsp:setProperty property="*" name="c"/> 
    Id: <jsp:getProperty property="cid" name="c"/>
    Name : <jsp:getProperty property="cname" name="c"/>
    Mobile : <jsp:getProperty property="mobile" name="c"/>
    
</body>
</html>