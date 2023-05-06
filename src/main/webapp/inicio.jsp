<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
  <link rel="stylesheet" type="text/css" href="styles.css">
<title>Insert title here</title>
</head>
<body >
	<header>
		<%@ include file="/WEB-INF/includes/navbar.jsp" %>
	</header>
	<main>
		<!-- el main contiene 3 secciones,  primera sction: el titulo de la seccion (h1), un boton y un estilo hero -->
		<section class="hero">
			<!-- el estilo hero tiene como fondo una imagen que contiene el nombre el nombre del proyecto -->
			<div class="hero-text">
				<h1>Cachureando</h1>
				<p><i> Pedidos en linea, no pierdas más tu tiempo</i></p>
				<button><a href="contacto.jsp">Solicita ahora</a></button>
			</div>
		</section>
		<!-- en esta seccion esta la galeria de imagenes que se implementa con la ayuda de un carrusel
		definido por boostrap-->
		<div class="container">
			<div class="carousel">
				<div class="carousel__face"><span>Camisa</span></div>
				<div class="carousel__face"><span>Geologo</span></div>
				<div class="carousel__face"><span>Polera</span></div>
				<div class="carousel__face"><span>Parka</span></div>
			</div>
		</div>
		<!-- en esta seccion esta quienes somos, esta seccion contiene un article y un div. aca se muetra el
		texto de quienes somos  y un aside que contendria info secundaria en este caso años de la empresa
	certificaciones, etc -->
		<section id="quienes-somos" class="container">
			<article class="content">
				<div class="principal">
					<h2>QUIENES SOMOS</h2>
					<p>
						Cachureando es una empresa textil de ropa ignifuga, que trabaja con productos de ultima
						generación,
						prendas autenticas, de calidad y confeccion 100% nacional, con el objetivo de proteger del arco
						y
						fuego repentino en sus EPP.
					</p>
				</div>
				<aside>La empresa cuenta con 10 años en Chile además de lograr la protección y seguridad por medio de
					prendas al fuego repentino y arco electrico. Nos encontramos validados por ISPCH en Chile y UL a
					nivel
					internacional, contando con todas las certificaciones correspondientes al EPP para dar cumplimiento
					a la
					seguridad de su prenda.
				</aside>
			</article>
		</section>
		<!-- en esta seccion esta solicita tu epp con su parrafo correspondiente y botton para acceder contacto html.
		 -->
		<section id="hamster" class="container">
			<article class="content">
				<div class="principal">
					<h2>Solicita tu EPP</h2>
					<p>
						No olvides contar con los mejores EPP de seguridad para tus labores, puedes escoger EPP
						diseñados y
						confeccionados especialmente para Arco eléctrico o EPP especialmente diseñados para Fuego
						Repentino.
					</p>
				</div>
				<aside><a href="contacto.jsp"><button>SOLICITA TU EPP</button></button></a>
				</aside>
			</article>
		</section>
	</main>

<%@ include file="/WEB-INF/includes/footer.jsp" %>
</body>
</html>