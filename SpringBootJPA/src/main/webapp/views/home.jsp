<%@ page language="java"  isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot-WebApp</title>
</head>
<body>
<h2>Spring Boot</h2>
<form action="addStudent">
Enter Student ID:: <input type="text" name="sid" value=""><br><br>
Enter Student Name:: <input type="text" name="name" value=""><br><br>
<input type="submit">
</form>
<hr>
<h5>fetch by ID</h5>
<form action="getStudent">
Enter Student ID:: <input type="text" name="sid" value=""><br><br>
<input type="submit">
</form>
<hr>
<h5>fetch by Name</h5>
<form action="getStudentbyName">
Enter Student Name:: <input type="text" name="sname" value=""><br><br>
<input type="submit">
</form>
</body>
</html>