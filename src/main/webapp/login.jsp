<%--
  Created by IntelliJ IDEA.
  User: Eduardo Mendoza
  Date: 16/5/2025
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<h1>Login de usuario</h1>
<div>
    <form action="/cookies_matu/login.html" method="post">
        <div>
            <label for="username">Nombre de usuarios:</label>
            <div>
                <input type="text" name="username" id="username">
            </div>
        </div>

        <div>
            <label for="pass">Password:</label>
            <div>
                <input type="password" name="password" id="pass">
            </div>
        </div>
        <div>
            <input type="submit" value="Enviar">
        </div>
    </form>
    <a href="/cookies_matu/index.html">Volver al inicio</a>
</div>
</body>
</html>