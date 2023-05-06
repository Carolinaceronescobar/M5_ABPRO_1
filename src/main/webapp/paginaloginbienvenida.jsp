<!DOCTYPE html>
<html>
<head>
	<title>Bienvenido</title>
	<script type="text/javascript">
		// Verificar si el usuario tiene una sesión activa
		function verificarSesion() {
			if (sessionStorage.getItem("usuario") == null) {
				window.location.href = "login.html";
			}
			else {
				document.getElementById("nombreUsuario").innerHTML = sessionStorage.getItem("usuario");
			}
		}
	</script>
</head>
<body onload="verificarSesion();">
	<h1>Bienvenido <span id="nombreUsuario"></span></h1>
	<p>Esta es una página de bienvenida para el usuario <span id="nombreUsuario"></span>. Aquí se puede agregar información específica del usuario.</p>
	<a href="logout">Cerrar sesión</a>
</body>
</html>
