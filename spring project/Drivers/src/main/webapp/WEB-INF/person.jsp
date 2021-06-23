<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>NEW PERSON</h1>
<form:form action="/persons/new" method="post" modelAttribute="person">
First name : <input type="text" name="firstName">
Last name : <input type="text" name="lastName">
<input type="submit">
</form:form>
</body>
</html>