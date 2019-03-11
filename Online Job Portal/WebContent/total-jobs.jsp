<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="company.Company_Bean" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="admin.AdminModels" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Total Jobs</title>
</head>
<body>
<h1>list of all jobs</h1>
<c:forEach var="item" items="${sessionScope.alljobs}">
<c:out value="${item.jobname}"/>
<c:out value="${item.jobdesc}"/>
</c:forEach>
</body>
</html>