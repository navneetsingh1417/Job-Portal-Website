<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
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
input[type=radio], select {
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
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
<h1>Please Submit your Details !</h1>
<div class="regform">
  <form action="edit-profile" method="post">
    <label for="fullname">Full Name</label>
    <input type="text" id="fullname" name="fullname" placeholder="FullName"><br>
    
    <label for="phone">Phone No.</label>
    <input type="text" id="phone" name="phone" placeholder="Phone No."><br>
    
    <label for="email">Email</label>
    <input type="text" id="email" name="email" placeholder="Email">
    
    <label for="gender">Gender</label>
    <input type="radio" id="gender" name="gender" value="male">Male
    <input type="radio" id="gender" name="gender" value="female">Female
    <input type="radio" id="gender" name="gender" value="other">Other
    <br><br><br>
    


    <label for="dob">Date of Birth</label>
    <input type="text" id="dob" name="dob" placeholder="15-08-1947"><br>
    
    <label for="high_qualif">Highest Qualification</label>
    <input type="text" id="high_qualif" name="high_qualif" placeholder="Highest Qualification"><br>
    
    <label for="marks_12">Marks 12th</label>
    <input type="text" id="marks_12" name="marks_12" placeholder="Marks in 12th"><br>
    
    <label for="marsk_10">Marks in 10th</label>
    <input type="text" id="marks_10" name="marks_10" placeholder="Marks in 10th"><br>
    
    <label for="field_of_interest">Field Of Interest</label>
    <input type="text" id="field_of_interest" name="field_of_interest" placeholder="Java, API and Cloud"><br>
    
    <input type="submit" value="Submit"><br>
  </form>
</div>
<!-- 
<form action="edit-profile" method="post">
<!-- Profile Photo<input type="file" name="profile_photo" ><br>
 Full Name<input type="text" name="fullname"><br>
Phone No.<input type="text" name="phone"><br>
Email<input type="email" name="email"><br>
Gender<input type="radio" name="gender" value="male" checked> Male
<input type="radio" name="gender" value="female"> Female
<input type="radio" name="gender" value="other"> Other  <br>
Date of Birth<input type="text" name="dob"><br>
Highest Qualification<input type="text" name="high_qualif"><br>
Marks in 12th<input type="text" name="marks_12"><br>
Marks in 10th<input type="text" name="marks_10"><br>
Field Of Interest<input type="text" name="field_of_interest"><br>
<input type="submit" value="Save"><br>
</form>
-->
</body>
</html>