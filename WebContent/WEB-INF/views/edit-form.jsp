<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Update Form</h1>
<br><br>
<form:form action="update" method="POST" modelAttribute="student">
	Id <form:input type="text" path="id" value="${student.id}" readonly="true"/><br>
	Name <form:input type="text" path="name" value="${student.name}" placeholder="Enter Name" /><br><br>
	<input type="submit" value="Update">
</form:form>
</body>
</html>