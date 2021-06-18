<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
       <form action="/result" method="POST">
        <table>
            <tbody>
                <tr>
                    <td>Your name :</td>
                    <td><input type="text" name="name" required></td>
                </tr>
                <tr>
                    <td>Dojo location :</td>
                    <td><select name="dojoloc" id="" required>
                        <option value="Tulkarm">Tulkarm</option>
                        <option value="Nablus">Nablus</option>
                        <option value="Jenin">Jenin</option>
                        <option value="Ramallah">Ramallah</option>
                    </select></td>
                </tr>
                <tr>
                    <td>Favourte Location :</td>
                    <td><select name="favlang" id="" required>
                        <option value="Python">Python</option>
                        <option value="Java">Java</option>
                        <option value="Javascript">Javascript</option>
                    </select></td>
                </tr>
                <tr>
                    <td>Comment(optinal) :</td>
                    <td></td>
                </tr>
            </tbody>
        </table>
        <textarea name="comment" id="" cols="30" rows="10"></textarea>
        <input type="submit">
    </form>
    </main>
</body>
</html>