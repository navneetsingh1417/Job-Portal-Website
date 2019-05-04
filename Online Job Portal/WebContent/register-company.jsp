<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Register.css">
<link rel="stylesheet" href="style.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
  input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=password], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}
h1{
text-align:center;
}

.regform {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
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
<!-- 
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
      <li><a href="register-employee.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up as an Employee</a></li>
      <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
<h1>Register as a Company</h1>
<div class="regform">
  <form action="register-company" method="post">
    <label for="name">Name</label>
    <input type="text" id="name" name="name" placeholder="Name"><br>
    
     <label for="user_name">Username</label>
    <input type="text" id="user_name" name="user_name" placeholder="username"><br>

    <label for="password">Password</label>
    <input type="password" id="password" name="password" placeholder="Password"><br>
    
    <input type="submit" value="Submit"><br>
  </form>
</div> -->
<!-- 
<form action="register-company" method="post">
Company Name <input type="text" name="name"><br>
Company username<input type="text" name="user_name"><br>
Set a Password<input type="text" name="password"><br>
<input type="submit" value="Register">
</form> -->

		
		<div class="row">
			
			<ul class="main-nav">
				<li><a href="">HOME</a></li>
				<li><a href="">SEARCH</a></li>
				<li><a href="">ABOUT</a></li>
				<li><a href="">CONTACT US</a></li>
				<li><a href="">LOGIN</a></li>
			</ul>

		</div>



<div class="login-page">	
<div class="form">
<form action="register-company" method="post" class="register-form">
	<input type="text" placeholder="Company Name" name="name">
	<input type="text" placeholder="username" name="user_name">
	<input type="password" placeholder="password" name="password">
	<button>Create</button>
	<p class="message">Already Registered? 
		<a href="#">Log in</a></p>
</form>
<form action="company-login" method="post" class="login-form">
	<input type="text" name="user_name" placeholder="Email">
	<input type="password" name="user_password" placeholder="Password">
	<button>Log in</button>
	<p class="message">Not Registered?
		<a href="#">Register</a></p>
</form>
<script 
src='https://code.jquery.com/jquery-3.2.1.min.js'>
	
</script>
<script>
	
$('.message a').click(function(){
	$('form').animate({
		height:"toggle",
		opacity:"toggle"},
		"slow")
});
</script>
</div>
</div>
</body>
</html>