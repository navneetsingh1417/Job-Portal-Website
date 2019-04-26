<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Job Seeker</title>
<style>
.container a{
display: inline-block;
	transition: .3s;
	font-weight:bold;
	text-decoration:none;
	font-size:40px;
	margin-left:30%;
}
.container a:hover{
-webkit-transform: scale(1.2);
	transform: scale(1.2);
}
</style>
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
    </ul>
  </div>
</nav>
<!-- <form action="login" method="post">
Email      <input type="email" name="user_email"><br>
Password   <input type="password" name="user_password"><br>
<input type="submit" value="Login"><br>
</form> -->
<div class="container">
<a href="employee-login.jsp">Employee Login</a>
<br>
<br>
<a href="company-login.jsp">Company Login</a>
<br>
<br>
<a href="admin-login.jsp">Admin Login</a>	
</div>
</body>
</html>