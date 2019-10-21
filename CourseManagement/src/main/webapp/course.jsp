<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="courses" modelAtribute="subjects" method="post">
<table align="center">
<tr>
<td>Course Id</td><td><form:input path="courseId" type="text"/><td>
</tr>
<tr>
<td>Course Name</td><td><form:input path="courseName" type="text"/><td>
</tr>
<tr>
<td>Course Duration(In Days)</td><td><form:input path="" type="text"/><td>
</tr>
<tr>
<td>Fee</td><td><form:input path="fee" type="text"/><td>
</tr>
</table>
</form:form>
${message }
</body>
</html>