<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

</style>
</head>
<body>
<h1>Search Jobs Here</h1>
<div>
		<div class="inline">
			<p>Select your Preference</p><select name="jsearch" form="jsearch">
  			<option value="state">State</option>
  			<option value="jobtitle">Job Title</option>
			</select>
		</div>
		<div class="inline">
			<form id="jsearch" action="SearchFilter">
				<input type="text" name="choice">
				<input type="submit" value="Search">
			</form>
		</div>
</div>
</body>
</html>