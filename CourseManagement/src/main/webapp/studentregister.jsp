<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<form:form action="studentRegister" method="post" modelAttribute="register">
<table>
	<tr>
		<td>Student Id</td><td> <form:input path="id" type="text"/></td>
	</tr>
	<tr>
 		<td>Student Name</td><td> <form:input path="name" type="text"/></td>
 	</tr>
 	<tr>
 	<td>Email</td><td>   <form:input path="email" type="text"/></td>
 	</tr>
 	<tr>
 	<td>Mobile</td><td> <form:input path="mobile" type="text"/></td>
 	</tr>
 	<tr>
 	<td>User Name</td><td><form:input path="userName" type="text"/></td>
 	</tr>
 	<tr>
 	<td>Password</td><td><form:input path="password" type="text"/></td>
 	</tr>
 	
 	<tr>
 	<td><input type="submit" value="Register"></td>

</tr></table>
</form:form>

${message }
</body>
</html>