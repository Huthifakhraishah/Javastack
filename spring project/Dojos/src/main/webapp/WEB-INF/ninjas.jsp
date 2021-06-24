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
<h1>New Ninja</h1>
<form:form action="/ninjas" method="post"  modelAttribute="ninja" >
FirstName : <input type="text" name="firstName"/>
LastName : <input type="text" name="lastName"/>
	<select name="dojo">
		<c:forEach items="${dojos}" var="dojos">
		<option value="${dojos.id}">${dojos.name}</option>
		</c:forEach>
	</select>
Age : <input type="text" name="age"/>
<input type="submit">
</form:form>
</body>
</html>