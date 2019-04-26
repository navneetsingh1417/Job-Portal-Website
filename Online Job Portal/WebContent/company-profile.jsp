<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<title>Job Seeker</title>
<style type="text/css">
.container1 {
 		background-color:#bff29d;
		margin:0px;
		padding:140px;
		border-radius:30px;
}
.container1 h1{
	margin-left:30%;
	font-family:comic sans;
	font-size:40px;
	}
	.container1 a{
	margin-left :30%;
	display: inline-block;
	transition: .3s;
	font-weight:bold;
	text-decoration:none;
	font-size:50px;
	}
	.container1 a:hover {
	-webkit-transform: scale(1.2);
	transform: scale(1.2);
	}
</style>
<meta charset="ISO-8859-1">
<title>Job Seeker</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="homepage.jsp">Job Seeker</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="homepage.jsp">Home</a></li>
      <li><a href="#">About</a></li>
      <li><a href="#">Contact us</a></li>
      <li><a href="SearchJobs">Search Jobs</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="register-company.jsp"><span class="glyphicon glyphicon-user"></span> Register as a Company</a></li>
      <li><a href="register-employee.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up as an Employee</a></li>
      <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    </ul>
  </div>
</nav>

<!-- <h1>Welcome  ${sessionScope.company_name}</h1>  -->
<div class="container1">
<h1>Post a new Job today !</h1>
<a href="JobPost.jsp">Post a Job</a>
<a href="TotalParticularJobs">Total Job Posted</a>
</div>
</body>
</html>