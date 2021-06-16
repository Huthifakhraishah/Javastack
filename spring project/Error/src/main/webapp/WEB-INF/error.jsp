<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
        <style>
            *{
                margin: 0 auto ;
                color: red;
                width: 500px;
                text-align: center;

            }

        </style>
</head>
<body>
<p><c:out value="${error}"/></p>
<p>You must train harder!</p>
<p>What is the code?</p>
<form action="/code" method="POST">
    <input type="text" name="enter" >
    <input type="submit" >
</form>
</body>
</html>