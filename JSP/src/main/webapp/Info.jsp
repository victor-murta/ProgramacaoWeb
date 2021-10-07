
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dados</title>
</head>
<body>
	<h1>Dados JSP</h1>
	<h3> Dia de acesso: <%= Contador.getData() %></h3>
	<h3> Id da sessao: <%= session.getId() %></h3>
	<% Contador.novoAcesso(); %>
	<h3>Acessos totais: <% Contador.getContador(); %> </h3>
</body>
</html>