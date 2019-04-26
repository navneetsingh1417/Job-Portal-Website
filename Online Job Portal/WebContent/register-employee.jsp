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
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Job Seeker</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="homepage.jsp">Home</a></li>
      <!-- <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Page 1-1</a></li>
          <li><a href="#">Page 1-2</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li> -->
      <li><a href="#">About</a></li>
      <li><a href="#">Contact us</a></li>
      <li><a href="#">Search Jobs</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="register-company.jsp"><span class="glyphicon glyphicon-user"></span> Register as a Company</a></li>
      <!-- <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up as an Employee</a></li> -->
      <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
<h1>Register as a Employee</h1>
<div class="regform">
  <form action="register-employee" method="post">
    <label for="name">Full Name</label>
    <input type="text" id="name" name="name" placeholder="Full Name"><br>
    
    <label for="email">Email</label>
    <input type="text" id="email" name="email" placeholder="Email"><br>
    
    <label for="phone">Phone</label>
    <input type="text" id="phone" name="phone" placeholder="Phone"><br>

    <label for="password">Password</label>
    <input type="password" id="password" name="password" placeholder="Password"><br>
    
    <input type="submit" value="Submit"><br>
  </form>
</div>
<!-- <form action="register-employee" method="post">
Full Name  <input type="text" name="name"><br>
Email      <input type="email" name="email"><br>
Mobile No. <input type="text" name="phone"><br>
Password   <input type="password" name="password"><br>
<input type="submit" value="Register"><br>
</form> -->

</body>
</html>