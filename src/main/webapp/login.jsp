<%--
  Created by IntelliJ IDEA.
  User: Edgar Garces
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
    <link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="container">
<h1 class="text-center mt-5">Login de usuario</h1>

<div class="row justify-content-center">
    <div class="col-md-6">
        <form action="/cookies_matu/login.html" method="post" class="p-4 border rounded shadow">
            <div class="mb-3">
                <label for="username" class="form-label">Nombre de usuario:</label>
                <input type="text" name="username" id="username" class="form-control" required>
            </div>

            <div class="mb-3">
                <label for="pass" class="form-label">Password:</label>
                <input type="password" name="password" id="pass" class="form-control" required>
            </div>

            <div class="d-grid">
                <input type="submit" value="Enviar" class="btn btn-primary">
            </div>
        </form>

        <div class="text-center mt-3">
            <a href="/cookies_matu/index.html" class="btn btn-link">Volver al inicio</a>
        </div>
    </div>
</div>
</body>
</html>
