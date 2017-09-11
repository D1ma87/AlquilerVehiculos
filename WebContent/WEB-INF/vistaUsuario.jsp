
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
<title>Home | Corlate</title>

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
				<a class="navbar-brand" href="vistaUsuario.html"><img
					src="images/logo.png" alt="logo"></a>
			</div>
		</li>
	</div>
	<!--/.container-->
	<div class="col-sm-6">
		<a class="btn btn-primary navbar-right" href="#">Salir</a>
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
								<h1 class="animation animated-item-1">Lorem ipsum dolor sit
									amet consectetur adipisicing elit</h1>
								<h2 class="animation animated-item-2">Accusantium
									doloremque laudantium totam rem aperiam, eaque ipsa...</h2>
								<a class="btn-slide animation animated-item-3" href="#">Read
									More</a>
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
								<h1 class="animation animated-item-1">Lorem ipsum dolor sit
									amet consectetur adipisicing elit</h1>
								<h2 class="animation animated-item-2">Accusantium
									doloremque laudantium totam rem aperiam, eaque ipsa...</h2>
								<a class="btn-slide animation animated-item-3" href="#">Read
									More</a>
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
						<div class="col-sm-6">
							<div class="carousel-content">
								<h1 class="animation animated-item-1">Lorem ipsum dolor sit
									amet consectetur adipisicing elit</h1>
								<h2 class="animation animated-item-2">Accusantium
									doloremque laudantium totam rem aperiam, eaque ipsa...</h2>
								<a class="btn-slide animation animated-item-3" href="#">Read
									More</a>
							</div>
						</div>
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
		<c:set var = "idcategoria"  value = "${0}"/>
		<div class="collapse navbar-collapse navbar-right">
			<ul class="nav navbar-nav">
				<li class="active"><a href="vistaUsuario.html">Home</a></li>

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
						<c:forEach var="categoria" items="${misCategorias }"><li>
						<form action="vehiculosCategoria.html" method=POST>
						<input type="hidden" id="idcat" name="idcat" value="${categoria.id_categoria }">
						<input type="submit" class="btn btn-primary" value="${categoria.descripcion}"/>
						</form></li>
							
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
			<h2>Our Service</h2>
			<p class="lead">
				Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do
				eiusmod tempor incididunt ut <br> et dolore magna aliqua. Ut
				enim ad minim veniam
			</p>
		</div>
		<!-- variable que recoje el valor de la categoria -->
		
		<div class="row">

			<div class="row clearfix">

			<c:forEach var="vehiculo" items="${misVehiculos}">
			<div class="col-md-4 col-sm-6 ">
					<form action="" value="" id="formalquiler">

						<div class=" services-wrap single-profile-top">
							<div class="media">
								<div class="pull-left">
									<img class="media-object" src="images/man1.jpg" alt="">
								</div>
								<div class="media-body">

									<h4>${vehiculo.marca}</h4>
									<h5>${vehiculo.modelo}</h5>
								</div>
							</div>
							<!--/.media -->
							<br> <label>Fecha Inicio</label> <input type="date" class=""
								name="fechaini" id="fechaini"></br> <label>Fecha Fin</label>
							<input type="date" class="" name="fechafin" id="fechafin"></br>
							<input type="submit" class="btn btn-primary" value="Alquilar"
								id=""></a>
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
						<h2>Have a question or need a custom quote?</h2>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore dolore magna aliqua.
							Ut enim ad minim veniam, quis nostrud exercitation +0123 456 70
							80</p>
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
				&copy; 2013 <a target="_blank" href="http://shapebootstrap.net/"
					title="Free Twitter Bootstrap WordPress Themes and HTML templates">ShapeBootstrap</a>.
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