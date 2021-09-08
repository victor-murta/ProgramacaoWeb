<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ola</title>
</head>
<body>
	<form action="PaginaAgendaServlet" method="get">
		<h3>Insira seu nome</h3>
		<input type="text" placeholder="Nome" name="nome"></input>
		<h3>Insira seu sobrenome</h3>
		<input type="text" placeholder="Sobrenome" name="snome"></input>
		<button type="submit">Enviar</button>
	</form>
</body>
</html>