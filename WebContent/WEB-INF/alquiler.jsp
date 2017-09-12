<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<title>AlquilerVehiculos</title>

<!-- core CSS -->
<link href="./css/bootstrap.min.css" rel="stylesheet">
<link href="./css/font-awesome.min.css" rel="stylesheet">
<link href="./css/animate.min.css" rel="stylesheet">
<link href="./css/prettyPhoto.css" rel="stylesheet">
<link href="./css/main.css" rel="stylesheet">
<link href="./css/responsive.css" rel="stylesheet">
<!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
<link rel="shortcut icon" href="images/ico/favicon.ico">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="images/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="images/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="images/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="images/ico/apple-touch-icon-57-precomposed.png">
</head>
<!--/head-->

<body class="homepage">

	<header id="header"> <nav class="navbar navbar-inverse"
		role="banner">
	<div class="col-sm-6 navbar-nav">
		<li>
			<div class="navbar-header">
				<a class="navbar-brand"><img src="images/logo.png" alt="logo"></a>
			</div>
		</li>
	</div>
	<!--/.container-->
	<div class="col-sm-6">
		<a class="btn btn-primary navbar-right" href="iniciarSesion.html">Salir</a>
	</div>
	</nav><!--/nav--> </header>
	<!--/header-->

	<header id="headermenu"> <nav class="navbar navbar-inverse"
		role="banner">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
		</div>
		<!-- variable que ayuda a cargar coches por categoria -->
		<c:set var="idcategoria" value="${0}" />
		<div class="collapse navbar-collapse navbar-right">
			<ul class="nav navbar-nav">
				<li class="active"><a href="vehiculosCategoria.html?idcat=0">Inicio</a></li>

				<c:choose>

					<c:when test="${user.administrador==1 }">
						<li class="active"><a href="addvehiculo.html">Añadir
								Vehiculo</a></li>
						<li class="active"><a href="addcategoria.html">Añadir
								Categoria</a></li>
					</c:when>

					<c:otherwise>
						<li class="active"><a href="misAlquileres.html">Mis
								Alquileres</a></li>

						<c:forEach var="categoria" items="${misCategorias }">
							<li><a
								href="vehiculosCategoria.html?idcat=${categoria.id_categoria}">${categoria.descripcion}</a>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</ul>
		</div>
	</div>
	<!--/.container--> </nav><!--/nav--> </header>
	<!--/headermenu-->

	<section id="partner" class="service-item">
	<div class="container">
		<div class="center">
			<h2>Alquilado</h2>
			<p class="lead">
				Tu alquiler se ha realizado correctamente.
			</p>
			<a class="btn btn-primary" href="misAlquileres.html">Mis Alquileres</a>
		</div>

	</section>
	<!--/#services-->

	<section id="conatcat-info">
	<div class="container">
		<div class="row">
			<div class="col-sm-8">
				<div class="media contact-info wow fadeInDown"
					data-wow-duration="1000ms" data-wow-delay="600ms">
					<div class="pull-left">
						<i class="fa fa-phone"></i>
					</div>
					<div class="media-body">
						<h2>¿Tiene alguna duda?</h2>
						<p>Llama al servicio de asistencia. Estaremos encantados en resolver sus dudas </br> Teléfono: 4852554854</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--/.container--> </section>
	<!--/#conatcat-info-->

	<footer id="footer" class="midnight-blue">
	<div class="container">
		<div class="row">
			<div class="col-sm-12">
				&copy; 2017 <a target="_blank" href="http://shapebootstrap.net/"
					title="AlquilerVehiculos">AlquilerVehiculos</a>.
				All Rights Reserved.
			</div>
		</div>
	</div>
	</footer>
	<!--/#footer-->

	<script src="./js/jquery.js"></script>
	<script src="./js/bootstrap.min.js"></script>
	<script src="./js/jquery.prettyPhoto.js"></script>
	<script src="./js/jquery.isotope.min.js"></script>
	<script src="./js/main.js"></script>
	<script src="./js/wow.min.js"></script>
</body>
</html>