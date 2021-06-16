<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
        <title></title>
        <link rel="stylesheet" type="text/css" href="css/home.css">
        <script type="text/javascript" src="js/app.js"></script>
</head>
<body>
   <p>You have visitted this localhost:8080 <strong><c:out value="${count}"/></strong> times </p>
   <a href="/">Test another visit</a>
</body>
</html>