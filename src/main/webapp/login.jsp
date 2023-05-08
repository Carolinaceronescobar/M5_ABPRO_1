<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Inicio de sesión</title>
</head>
<body>
    <h1>Inicio de sesión</h1>
    <form action="login" method="post">
        <label for="usuario">Nombre de usuario:</label>
        <input type="text" id="usuario" name="usuario"><br><br>
        <label for="contrasena">Contrasena:</label>
        <input type="password" id="contrasena" name="contrasena"><br><br>
        <input type="submit" value="Iniciar sesión">
    </form>

<%@ include file="/WEB-INF/includes/footer.jsp" %>
</body>
</html>
