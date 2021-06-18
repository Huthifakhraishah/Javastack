
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
            *{
                margin: 0 auto;
            }
            textarea{
                margin: auto 41%;
            }
        </style>
</head>
<body>
    <main>
       <form action="/">
        <table>
            <tbody>
                <tr>
                    <td>Your name :</td>
                    <td><c:out value="${name}"/></td>
                </tr>
                <tr>
                    <td>Dojo location :</td>
                    <td><c:out value="${dojoloc}"/></td>
                </tr>
                <tr>
                    <td>Favourte Location :</td>
                    <td><c:out value="${favlang}"/></td>
                </tr>
                <tr>
                    <td>Comment(optinal) :</td>
                    <td><c:out value="${comment}"/></td>
                </tr>
            </tbody>
        </table>
        <input type="submit" value="goback">
    </form>
    </main>
</body>
</html>