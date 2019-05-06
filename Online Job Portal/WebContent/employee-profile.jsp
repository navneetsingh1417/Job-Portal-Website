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
   .button a{
	display: inline-block;
	transition: .3s;
	font-weight:bold;
	text-decoration:none;
	font-size:40px;
	margin-left:75%;
	}
	.button a:hover {
	-webkit-transform: scale(1.2);
	transform: scale(1.2);
	}
  </style>
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
      <li><a href="edit-employee-profile.jsp"><span class="glyphicon glyphicon-user"></span> Edit Profile</a></li>
      <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    </ul>
  </div>
</nav>
<h1>Welcome user Please keep your profile up to date</h1>
<div class="button">
<a href="Search.jsp">Apply for Job</a>
</div>
</body>
</html> 