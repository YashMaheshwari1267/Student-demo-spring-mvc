<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table style="align: center">
		<form:form action="submitForm" method="GET" modelAttribute="student">
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
	
	<table style="border:solid 1px">
			<tr>
				<th>ID</th>
				<th>Name</th>
			</tr>
			<c:forEach var="student" items="${student}">
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>