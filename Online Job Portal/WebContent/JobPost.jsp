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

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
h1{
text-align:center;}
</style>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Job Seeker</title>
</head>
<body>
<h1>Enter Following Details</h1>
<div >
  <form action="job-post" method="post">
    <label for="compname">Company Name</label>
    <input type="text" id="compname" name="compname" placeholder="Company Name...">

    <label for="jobname">Job Name</label>
    <input type="text" id="jobname" name="jobname" placeholder="Job Name..">
    
    <label for="jobdesc">Job Description</label>
    <input type="text" id="jobdesc" name="jobdesc" placeholder="Job Description...">

    <label for="eligibility">Eligibility</label>
    <input type="text" id="eligibility" name="eligibility" placeholder="Eligibility..">
    
      <label for="salary">Salary</label>
    <input type="text" id="salary" name="salary" placeholder="Salary...">

    <label for="jcity">Job City</label>
    <input type="text" id="jcity" name="jcity" placeholder="Job City..">
    
    <label for="jstate">Job State</label>
    <input type="text" id="jstate" name="jstate" placeholder="Job State...">

    <label for="jcountry">Job Country</label>
    <input type="text" id="jcountry" name="jcountry" placeholder="Job Country..">

     <label for="experience">Experience</label>
    <input type="text" id="jexperince" name="experience" placeholder="in years">
  
    <input type="submit" value="Submit">
  </form>
</div>
<!-- 
<form action="job-post" method="post">
<table>
<tr><td>Company Name <input type="text" name="compname"></td></tr>
<tr><td>Post Name <input type="text" name="jobname"></td></tr>
<tr><td>Job Description <input type="text" style="height:30px;" name="jobdesc"></td></tr>
<tr><td>Eligibilty <input type="text" name="eligibility"></td></tr>
<tr><td>Salary Range<input type="text" name="salary"></td></tr>
<tr><td>Job City <input type="text" name="jcity"></td></tr>
<tr><td>Job State <input type="text" name="jstate"></td></tr>
<tr><td>Job Country <input type="text" name="jcountry"></td></tr>
<tr><td>Experience <input type="text" name="experience"></td></tr>
</table>
<input type="submit" style="align:center;"value="Post Job"><br> -->


</form>
</body>
</html>