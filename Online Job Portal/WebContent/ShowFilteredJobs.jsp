<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page import="company.Company_Bean" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="admin.SearchJobs" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
   
    <ul class="nav navbar-nav">
     
      <li><a href="#">About</a></li>
      <li><a href="#">Contact us</a></li>
      <li><a href="SearchJobs">Search Jobs</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    </ul>
  </div>
</nav>

<h1>Search Jobs here !</h1>
<table class="table table-bordered">
<tr><th>Job Name</th><th>Company Name</th><th>Salary</th><th>Click Here</th></tr>
<c:forEach var="item" items="${sessionScope.allfjobs}">
<tr><td><c:out value="${item.jobname}"></c:out></td><td><c:out value="${item.company_name}"></c:out></td><td><c:out value="${item.salary}"></c:out></td><td><a href="ApplyJob?a=${item.company_name }">Apply</a></td></tr>
</c:forEach>
</table>
</body>
</html>