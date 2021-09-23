<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro</title>
</head>
<body>
	<form action="CadastroInstitucionalServlet">
		<h4>Nome: </h4>
		<input type="text" name='nome' placeholder="Nome ...">
		
		<h4>Sobrenome: </h4>
		<input type="text" name='sobrenome' placeholder="Sobrenome ...">
		
		<h4>Endereco residencial: </h4>
		<input type="text" name='endereco' placeholder="Endereco ...">
		
		<h4>Rua: </h4>
		<input type="text" name='rua' placeholder="Rua ...">
		
		<h4>Complemento: </h4>
		<input type="text" name='complemento' placeholder="Complemento ...">
		
		<h4>Cidade: </h4>
		<input type="text" name='cidade' placeholder="Cidade ...">
		
		<h4>Cep: </h4>
		<input type="text" name='cep' placeholder="Cep ...">
		
		<h4>Estado: </h4>
		<input type="text" name='estado' placeholder="Estado ...">
		
		<input type="submit" value='cadastrar'>
	</form>
</body>
</html>