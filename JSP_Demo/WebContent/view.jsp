<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="p" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String user=(String)request.getAttribute("user");
out.println("user from scriptlet "+user);
%>
<br/>
<%="User from expression-->" +request.getAttribute("user") %>
<br/>
<%="EL->Expression language" %>
${user}

${friendlist}
<h3>FriendList</h3>
<ol>
<p:forEach items="${friendlist}" var="ob">
<li>${ob} </li>
</p:forEach>
</ol>
</body>
</html>