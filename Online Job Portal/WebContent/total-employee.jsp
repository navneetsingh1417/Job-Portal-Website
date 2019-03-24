<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page import="company.Company_Bean" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="admin.AdminModels" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List of all Companies registered till now</h1>
<table border="1px solid black">
<tr><th>Fullname</th><th>Email</th><th>Phone</th></tr>
<c:forEach var="item" items="${sessionScope.allemployee}">
<tr><td><c:out value="${item.fullname}"/></td><td><c:out value="${item.email}"/></td><td><c:out value="${item.phone}"/></td><td><a href="DeleteEmployee?a=${item.eid}">Delete</a></td></tr>
</c:forEach>
</table>
</body>
</html>