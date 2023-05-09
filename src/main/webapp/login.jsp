<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
   	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <form class="frm" method="post" action="login">
        <h2 class="form-signin-heading">Iniciar sesión</h2>
        <label for="inputUsuario" class="sr-only">Usuario</label>
        <input type="text" id="inputUsuario" name="usuario" class="form-control" placeholder="Usuario" required autofocus>
        <label for="inputPassword" class="sr-only">Contraseña</label>
        <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Contraseña" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Iniciar sesión</button>
        <a href="contacto" class="text-decoration-none">Olvido de contraseña</a>
    </form>
</div>

<%--
<div class="container">
    <h2 class="text-center my-5">Login de Usuario</h2>
    <form action="contacto" name="frm" method="post">
        
		<table class="table">
		  <tbody>
		    <tr>
		      <td>Usuario:</td>
		      <td><input type="text" name="usuario" class="form-control" size="4"></td>
		    </tr>
		    <tr>
		      <td>Contraseña:</td>
		      <td><input type="text" name="pass" class="form-control"></td>
		    </tr>
		  </tbody>
		</table>  
		  
		
        <div class="form-group row my-3">
            <div class="col-sm-12 text-left">
                <button type="submit" class="btn btn-primary">Login</button>
                <button type="reset" class="btn btn-primary">Limpiar</button>
            </div>
        </div>
    </form>
    
    
</div>
 --%>
</body>
</html>