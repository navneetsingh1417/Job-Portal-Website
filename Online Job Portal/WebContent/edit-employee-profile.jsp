<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="edit-profile" method="post" enctype="multipart/form-data">
Profile Photo<input type="file" name="profile_photo" ><br>
<!-- Full Name<input type="text" name="fullname"><br>
Phone No.<input type="text" name="phone"><br> -->
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
</body>
</html>