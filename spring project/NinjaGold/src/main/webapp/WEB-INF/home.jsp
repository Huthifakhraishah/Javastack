<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript" src="js/app.js"></script>
        <style>
            *{
                text-align: center;
                
            }
            .active{
                width: 90%;
                height: auto;
                border: 1px solid black;
                margin-left:3cm ;
            }
            main{
                display: flex;
            }
            section{
                flex: 1;
                border: 1px solid black;
            }
            label{
                width: 5cm;
                height: 1cm;
                border: 1px solid black;
            }
        </style>
</head>
<body>
    <header>
        Your Gold : <label><c:out value="${far}"/><label>
        
    </header>

     <form action="/farm" method="POST">
         <main>
        <section>
          
                <h2>Farm</h2>
                <p>(earns 10-20 gold)</p>
                <input name="farm" type="submit"value="Find Gold!">
        </section>
        <section>
                <h2>Cave</h2>
                <p>(earns 5-10 gold)</p>
                <input name="cave" type="submit"  value="Find Gold!">
        </section>
        <section>
                <h2>House</h2>
                <p>(earns 2-5 gold)</p>
                <input name="house" type="submit" value="Find Gold!">
        </section>
        <section>
                <h2>Casion!</h2>
                <p>(earns 0-50 gold)</p>
                <input type="submit" name="casino" value="Find Gold!">
       
        </section>
           </main><br>
      </form>
 
    <footer>
        <h2>Activities:</h2>
        <div class="active">
        the farm won <c:out value="${farm}"/><br>
        the cave won <c:out value="${cave}"/><br>
        the casino won or lost<c:out value="${casino}"/><br>
        the house won <c:out value="${house}"/><br>
        </div>
    </footer>
</body>
</html>