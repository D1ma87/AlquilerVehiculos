<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
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
 
</head>
<body>
<section class="service-item" id="services">
	<div class="container">
            <div class="center">
                <h1>AlquilerVehiculos</h1>
                <p class="lead">Registrese en la mayor plataforma de alquiler rápido de vehiculos.</br> Con solo unos clicks tendrá acceso a coches, motos..</p>
            </div>
			<form:form method="post" action="iniciarSesion.html" commandName="datosUsuario" class="center">
				<h2>Iniciar sesión:</h2>
					<div class="center">
							<h3>DNI:</h3>
							<form:input path="dni" />
							<h3>Contraseña:</h3>
							<form:input path="password" type="password" />
					</div>
					<div class="center">
						<input class="btn btn-primary" type="submit" value="Enviar" />
					</div>
			</form:form>
			
			<div class="center">
				<a class="btn btn-primary" href="registrar.html">Registrar</a>
			</div>
	</div>
	
</section>

	<footer id="footer" class="midnight-blue">
        <div class="container">
            <div class="row">
                <div class="col-sm-12">
                    &copy; 2013 <a target="_blank" href="http://shapebootstrap.net/" title="Free Twitter Bootstrap WordPress Themes and HTML templates">ShapeBootstrap</a>. All Rights Reserved.
                </div>
            </div>
        </div>
    </footer><!--/#footer-->

   <script src="./js/jquery.js"></script>
    <script src="./js/bootstrap.min.js"></script>
	<script src="./js/jquery.prettyPhoto.js"></script>
    <script src="./js/jquery.isotope.min.js"></script>
    <script src="./js/main.js"></script>
    <script src="./js/wow.min.js"></script>
</body>
</body>
</html>