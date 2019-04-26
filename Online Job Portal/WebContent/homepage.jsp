<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Job Seeker</title>
<style>
	.container1{
		background-color:#bff29d;
		margin:0px;
		margin-right:0%;
		padding:140px;
		border-radius:30px;
	}
	
	.container1 h1{
	font-family:comic sans;
	font-size:50px;
	}
	.container1 h5,.container2 h5{ font-size:20px;}
	.container1 a ,.container2 a{
	display: inline-block;
	transition: .3s;
	font-weight:bold;
	text-decoration:none;
	font-size:40px;
	margin-left:75%;
	}
	.container1 a:hover, .container2 a:hover {
	-webkit-transform: scale(1.2);
	transform: scale(1.2);
	}
	.container2{
		background-color:#bff2ed;
		margin-top	:200px;
		margin:0px;
		margin-left:0%;
		padding:140px;
		border-radius:30px;
		align:right;
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

<div class="container1">
	<h1><strong>Hire Skilled People</strong></h1>
	<h5><i>Your searchs for skilled employees</i></h5>
	<h5><i>ends here.</i></h5>
	<a href="register-company.jsp">Hire People</a>
</div>
<h1></h1>
<h1></h1>
<div class="container2">
	<h1><strong>Apply for Companies</strong></h1>
	<h5><i>Do what you Love, Love what you do.</i></h5>
	<a href="register-employee.jsp">Apply Now</a>
</div>

</body>
</body>
</html>