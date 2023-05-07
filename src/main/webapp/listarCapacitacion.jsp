<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
		      <th>Día</th>
		      <th>Hora</th>
		      <th>Lugar</th>
		      <th>Duración</th>
		      <th>Cantidad Asistentes</th>
		    </tr>
		  </thead>		
		  <tbody>
		    <tr>
		      <td>1111111-1</td>
		      <td>01/01/2023</td>
		      <td>13:20</td>
		      <td>Valparaíso</td>
		      <td>12 hrs</td>
		      <td>10</td>
		    </tr>
		    <tr>
		      <td>2222222-2</td>
		      <td>14/02/2023</td>
		      <td>11:20</td>
		      <td>Santiago</td>
		      <td>10</td>
		      <td>5</td>
		    </tr>
		    <tr>
		      <td>8888888-5</td>
		      <td>22/03/2023</td>
		      <td>17:35</td>
		      <td>Pucón</td>
		      <td>55</td>
		      <td>10</td>
		    </tr>
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