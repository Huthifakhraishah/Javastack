<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/css/main.css" />
<title>Languages App</title>
</head>
<body>
	<div class="container">
		<h1>Edit Language</h1>
		<form:form action="/languages/${id}/edit" method="PUT" modelAttribute="language">
			<input type="text" name="name">
			<input type="text" name="creator">
			<input type="text" name="version">
		    <input type="submit" value="Submit"/>
		</form:form>
	</div>
</body>
</html>