<%@page import="com.spring.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<table style="align: center">
		<form:form action="submitForm" method="POST" modelAttribute="student">
			<tr>
				<td>ID</td>
				<td><form:input type="text" path="id"
						placeholder="ID"></form:input></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><form:input type="text" path="name"
						placeholder="Full Name"></form:input></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
				<td><input type="reset" value="Reset" /></td>
			</tr>
		</form:form>
	</table>
	<br><br>
	<table style="text-align: center">
			<tr>
				<th><a href="sorting?sortBy=id">ID</a></th>
				<th><a href="sorting?sortBy=name">Name</a></th>
			</tr>
			<c:forEach var="list" items="${list}">
			<tr>
				<td>${list.id}</td>
				<td>${list.name}</td>
				<td><a href="updateForm?id=${list.id}">Edit</a></td>
				<td><a href="delete?id=${list.id}">Delete</a>
			</tr>
			</c:forEach>
	</table>
	
</body>
</html>