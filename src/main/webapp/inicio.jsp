<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<header>
		<!-- nav. este fue creado para ofrecer ayuda en la navegacion. por tanto tenemos aca los botones de inicia, cotiza y quienes somos -->
		<nav class="navbar">
			<!-- div solo indica una division ene cp -->
			<div><a id="logo" href="index.html">Cachureando</a></div>

			<ul class="navbar-nav" style="display: flex;flex-direction: row;">
				<!-- ul crea una lista y el li se usa para definir cada item de la lista -->
			<a href="inicioServlet">Iniciooo</a> <br/>
            <a href="contactoServlet">Contacto</a> <br/>
            <a href="crearCapacitacionServlet">Crear capacitacion</a>
			</ul>
		</nav>
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

	<footer>
		<!-- aca el footer que contiene la informacion de contactos ,integrantes y fecha.  -->
		<br>Carolina Cerón Escobar | Loreto Galvez | César Mongez | Heinz Beckers <br> Proyecto Cachureando |
		Enero-2023
	</footer>
</body>
</html>