<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Map"%>
<%
Map<String, String> errores = (Map<String, String>)request.getAttribute("errores");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formulario de usuarios</title>
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

     <link rel="stylesheet" type="text/css" href="styles.css">

</head>
<body>
    <header>
<%@ include file="/WEB-INF/includes/navbar.jsp" %>



    </header>
  <form action="validacion.js" method="POST" id="contacto-frm" name="contacto_frm">
    <fieldset>
      <h1>COTIZA AQUÍ!</h1>
      <br><h4>Ingresa tus datos en este formulario para poder contactarte,
       <br> ¿Que te gustaría hacer?</br>
       <br> Envíanos lo que necesitas y nos pondremos en contacto</h4></br>
      <div id="contenedor">
        <label>Nombre:</label>
        <input type="text" name="nombre_text" id="nombre" class="cambio" required>
        <br></br>

        <label>Edad:</label>
        <input type="text" name="edad_txt" id="edad" class="cambio" required>
        <br></br>

        <label>Correo:</label>
        <input type="email" name="email_txt" id="email" class="cambio" required>
        <br></br>

        <label>Sexo:</label>
        <input type="radio" name="sexo_rdo" id="M" value="M">
        <label>Masculino:</label>
        <input type="radio" name="sexo_rdo" id="F" value="F">
        <label>Femenino:</label>
        <br></br>

        <label>Asunto:</label>
        <input type="text" name="asunto_txt" id="asunto" class="cambio">
        <br></br>

        <label>Comentarios:</label>
        <br>
        <textarea name="comentarios" id="comentarios" cols="50" rows="5" class="cambio"></textarea>
        <br></br>

        <input type="button" name="enviar" id="enviar" class="cambio" value="Enviar">
        <input type="button" name="limpiar" id="limpiar" value="Limpiar" class="cambio">


      </div>
    </fieldset>
  </form>
<%@ include file="/WEB-INF/includes/footer.jsp" %>

  </body>
</html>