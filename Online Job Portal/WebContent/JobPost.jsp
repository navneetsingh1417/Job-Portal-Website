<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="job-post" method="post">
<table>
<tr><td>Post Name <input type="text" name="jobname"></td></tr>
<tr><td>Job Description <input type="text" style="height:30px;" name="jobdesc"></td></tr>
<tr><td>Eligibilty <input type="text" name="eligibility"></td></tr>
<tr><td>Salary Range<input type="text" name="salary"></td></tr>
<tr><td>Job City <input type="text" name="jcity"></td></tr>
<tr><td>Job State <input type="text" name="jstate"></td></tr>
<tr><td>Job Country <input type="text" name="jcountry"></td></tr>
<tr><td>Experience <input type="text" name="experience"></td></tr>
</table>
<input type="submit" style="align:center;"value="Post Job"><br>


</form>
</body>
</html>