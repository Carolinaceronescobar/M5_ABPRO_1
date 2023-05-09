<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Capacitacion"%>
<%
List<Capacitacion> capacitaciones = (List<Capacitacion>)request.getAttribute("capacitaciones");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
   	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<%@ include file="/WEB-INF/includes/navbar.jsp" %>
<div class="container">
    <h2 class="text-center my-5">Listado de capacitaciones</h2>
    <form action="listarCapac" name="frm" method="post">
        
		<table class="table">
		  <thead>
		    <tr>
		      <th>Rut del cliente</th>
		      <th>D&iacute;a</th>
		      <th>Hora</th>
		      <th>Lugar</th>
		      <th>Duraci&oacute;n</th>
		      <th>Cantidad Asistentes</th>
		    </tr>
		  </thead>		
		  <tbody>
		          <% for (Capacitacion listCapacitacion : capacitaciones) {%>
                      <tr>
                          <td><%=listCapacitacion.getRutCliente()%></td>
                          <td><%=listCapacitacion.getDia()%></td>
                          <td><%=listCapacitacion.getHora()%></td>
                          <td><%=listCapacitacion.getLugar()%></td>
                          <td><%=listCapacitacion.getDuracion()%></td>
                          <td><%=listCapacitacion.getCantAsistentes()%></td>
                      </tr>
                  <%}%>

		  </tbody>
		</table>    
			    
        <div class="form-group row my-3">
            <div class="col-sm-12 text-left">
                <button type="button" class="btn btn-primary" onclick="history.back(-1);">Volver</button>
            </div>
        </div>
    </form>
</div>
<%@ include file="/WEB-INF/includes/footer.jsp" %>
</body>
</html>