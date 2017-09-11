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
</head>
<body>
	<section class="service-item" id="services">
	<div class="container">
		<div class="center">
			<h1>Registro</h1>
			<p class="lead">Registrese en la mayor plataforma de alquiler
				rápido de vehiculos</p>
		</div>
		<form:form method="post" action="registro.html"
			commandName="datosUsuario" class="center" name="form" id="form">
			<div class="center">
				<h3>DNI:</h3>
				<form:input path="dni" />
				<h3>Nombre:</h3>
				<form:input path="nombre" />
				<h3>Apellido:</h3>
				<form:input path="apellido" />
				<h3>Email:</h3>
				<form:input path="email" />
				<h3>Contraseña:</h3>
				<form:input path="password" type="password" />
				<h3>Repetir Contraseña:</h3>
				<td><input type="password" id="repass" name="repass" />
			</div>
			<div class="center">
				<input class="btn btn-primary" type="submit" value="Enviar" />
			</div>
			<h3>
				<font color="red">${mensaje}</font>
			</h3>
		</form:form>

		<div class="center">
			<a class="btn btn-primary" href="index.jsp">Cancelar</a>
		</div>
	</div>

	</section>

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
	<script type="text/javascript">
		/*validador dni/nie*/
		function validar_dni_nif_nie(value) {

			var validChars = 'TRWAGMYFPDXBNJZSQVHLCKET';
			var nifRexp = /^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKET]{1}$/i;
			var nieRexp = /^[XYZ]{1}[0-9]{7}[TRWAGMYFPDXBNJZSQVHLCKET]{1}$/i;
			var str = value.toString().toUpperCase();

			if (!nifRexp.test(str) && !nieRexp.test(str))
				return false;

			var nie = str.replace(/^[X]/, '0').replace(/^[Y]/, '1').replace(
					/^[Z]/, '2');

			var letter = str.substr(-1);
			var charIndex = parseInt(nie.substr(0, 8)) % 23;

			if (validChars.charAt(charIndex) === letter)
				return true;

			return false;
		};
		/*validador pass*/
		function validar_pass(pass1, pass2) {
			//condiciones dentro de la función
			if (pass1 != pass2) {
				alert("No coinciden");
				return false;
			}
			if (pass1.length == 0 || pass1 == "") {
				alert("pass1 vacio");
				return false;
			}
			if (pass1.length<6 || pass1.length>10) {
				alert("la longitud tiene que ser mayor de 6 y menor de 10");
				return false;
			}
			if (valor1.length != 0 && valor1 == valor2) {
				alert("pass guardado");
				return true;
			}
		};
		/*validar email*/
		function validar_email(email) {
			if (email.length < 1) {
				alert("La dirección e-mail es obligatoria");
				return false;
			}
			;
			if ($("#email").val().indexOf('@', 0) == -1
					|| $("#email").val().indexOf('.', 0) == -1) {
				alert("La dirección e-mail parece incorrecta");
				return false;
			}
			;
			return true;
		};
		$(document)
				.ready(
						function() {
							$("form")
									.submit(
											function() {
												if (validar_dni_nif_nie($(
														"#dni").val()) == false) {
													alert("NO es válido");
													return false;
												} else if (validar_email($(
														"#email").val()) == false) {
													return false;
												} else if (validar_pass($(
														"#password").val(), $(
														"#repass").val()) == false) {
													return false;

												} else
													return true;
											});
						});
	</script>
</body>
</html>