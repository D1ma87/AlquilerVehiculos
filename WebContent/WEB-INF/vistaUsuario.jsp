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
<title>AlquilerVehiculos </title>

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

	<section id="main-slider" class="no-margin">
	<div class="carousel slide">
		<ol class="carousel-indicators">
			<li data-target="#main-slider" data-slide-to="0" class="active"></li>
			<li data-target="#main-slider" data-slide-to="1"></li>
			<li data-target="#main-slider" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner">

			<div class="item active"
				style="background-image: url(images/slider/bg1.jpg)">
				<div class="container">
					<div class="row slide-margin">
						<div class="col-sm-6">
							<div class="carousel-content">
								<h1 class="animation animated-item-1">Alquila tus vehiculos favoritos de forma rápida y segura</h1>

							</div>
						</div>

						<div class="col-sm-6 hidden-xs animation animated-item-4">
							<div class="slider-img">
								<img src="images/slider/img1.png" class="img-responsive">
							</div>
						</div>

					</div>
				</div>
			</div>
			<!--/.item-->

			<div class="item"
				style="background-image: url(images/slider/bg2.jpg)">
				<div class="container">
					<div class="row slide-margin">
						<div class="col-sm-6">
							<div class="carousel-content">
								<h1 class="animation animated-item-1">Los mejores vehículos al mejor precio</h1>
							</div>
						</div>

						<div class="col-sm-6 hidden-xs animation animated-item-4">
							<div class="slider-img">
								<img src="images/slider/img2.png" class="img-responsive">
							</div>
						</div>

					</div>
				</div>
			</div>
			<!--/.item-->

			<div class="item"
				style="background-image: url(images/slider/bg3.jpg)">
				<div class="container">
					<div class="row slide-margin">
						<div class="col-sm-6"></div>
						<div class="col-sm-6 hidden-xs animation animated-item-4">
							<div class="slider-img">
								<img src="images/slider/img3.png" class="img-responsive">
							</div>
						</div>
					</div>
				</div>
			</div>
			<!--/.item-->
		</div>
		<!--/.carousel-inner-->
	</div>
	<!--/.carousel--> <a class="prev hidden-xs" href="#main-slider"
		data-slide="prev"> <i class="fa fa-chevron-left"></i>
	</a> <a class="next hidden-xs" href="#main-slider" data-slide="next"> <i
		class="fa fa-chevron-right"></i>
	</a> </section>
	<!--/#main-slider-->

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
			<h2>Vehículos disponibles</h2>
			<p class="lead">
				Selecciona la fecha en la que quieres alquilar un vehículo.
			</p>
		</div>
		<!-- variable que recoje el valor de la categoria -->

		<div class="row">

			<div class="row clearfix">

				<c:forEach var="vehiculo" items="${misVehiculos}">
					<div class="col-md-4 col-sm-6 ">
						<form action="alquiler.html" method="post" id="formalquiler">
							<div class=" services-wrap single-profile-top">
								<div class="media">
									<div class="pull-left">
										<img class="media-object fotov" src="${vehiculo.fotos }"
											alt="">
									</div>
									<div class="media-body">
										<h4>${vehiculo.marca}</h4>
										<h5>${vehiculo.modelo}</h5>
										</br>
										<h5 class="text-danger">${vehiculo.precio}€</h5>
									</div>
								</div>
								<!--/.media -->
								<c:choose>
									<c:when test="${vehiculo.disponibilidad==0 }">
										<div class="media-body">
											<h4 class="text-danger">
												No disponible
												<h4>
										</div>
									</c:when>
									<c:otherwise>
										<br>
										<h5>Fecha Inicio</h5>
										<input type="date" class="" name="fecha_inicio"
											id="fecha_inicio">
										</br>
										<h5>Fecha Fin</h5>
										<input type="date" class="" name="fecha_final"
											id="fecha_final">
										</br>
										<input type="hidden" name="dni" id="dni" value="${user.dni }" />
										<input type="hidden" name="id_vehiculo" id="id_vehiculo"
											value="${vehiculo.id_vehiculo }" />
										<input type="submit" class="btn btn-primary" value="Alquilar"
											id="">
									
									</c:otherwise>
								</c:choose>
							</div>
						</form>
					</div>
				</c:forEach>
			</div>
			<!--/.row-->
		</div>
		<!--/.container-->
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

<script>
	$(document)
			.ready(
					function() {
						$("form")
								.submit(
										function() {

											var clikedForm = $(this); // Select Form

											if (clikedForm.find(
													"[name='fechaini']").val() == '') {
												alert('Enter Valid date inicio');
												return false;
											}
											if (clikedForm.find(
													"[name='fechaini']").val() > clikedForm
													.find("[name='fechafin']")
													.val()) {
												alert('Fecha inicio mayor que fecha final');
												return false;
											}
											if (clikedForm.find(
													"[name='fechafin']").val() == '') {
												alert('Enter  valid date final');
												return false;
											}

										});
					});
</script>