<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculadora</title>
</head>
<body>
	<form action="MostraCalculadoraServlet" method="get">
		<h3>Somador de numeros</h3>
		<input type="text" placeholder="Nome" name="n1"></input>
		<input type="text" placeholder="Sobrenome" name="n2"></input>
		<button type="submit">Enviar</button>
	</form>
</body>
</html>