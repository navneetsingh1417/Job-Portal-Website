<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Job Seeker</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
h1{
	text-align:center;
	font-family:Calibri;
	font-size:40px;
	background-color:#ffbfb2;
	margin-left:20%;
	margin-right:20%;
	padding-top:40px;
	padding-bottom:40px;
	border-radius:20px;
}
p{
background-color:#a7e5d8;
padding:20px;
border-radius:20px;
font-size:20px;
font-family:Calibri;
}
</style>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="homepage.jsp">Job Seeker</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="homepage.jsp">Home</a></li>
      <li><a href="About.jsp">About</a></li>
      <li><a href="#">Contact us</a></li>
      <li><a href="SearchJobs">Search Jobs</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="register-company.jsp"><span class="glyphicon glyphicon-user"></span> Register as a Company</a></li>
      <li><a href="register-employee.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up as an Employee</a></li>
      <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
<h1><strong>About the website</strong></h1>
<p><i>Online Job Portal is a web application built in Java. It provides the Candidate ability to register to this application and search for Jobs, manage their accounts. Each Candidate will have an account with their own home page.

	On the other hand, Organizations those who are willing to publish the Jobs for their Company and the Candidate can apply for the Job. And the Organization can select any individual based on their Profile. Registered Organizations can add or remove Jobs and these Jobs can be seen by various Candidates and they can contact the concern person for the job.

Main aim of this web application is to make an User-Friendly Platform where applicants can search jobs easily and is accessible to everyone who are interested.

	The Purpose of this website is to provide Job Portal to Job Seekers and where Organizations can select best Employees available.
 </i></p>
</body>
</html>