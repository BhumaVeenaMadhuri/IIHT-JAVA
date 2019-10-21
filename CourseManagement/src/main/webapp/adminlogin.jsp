<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
<form:form action="adminLogin" method="post" modelAttribute="login">
<table>
	<tr>
 	<td>User Name</td><td><form:input path="userName" type="text"/></td>
 	</tr>
 	<tr>
 	<td>Password</td><td><form:input path="password" type="text"/></td>
 	</tr>
 	
 	<tr>
 	<td><input type="submit" value="Login"></td>
    </tr>
    </table>
   
    </form:form>
    ${message }

</body>
</html>