<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br en">
<head>
				<meta charset="utf-8">
				<title>${param.titulo}</title>
				<link rel='stylesheet' type='text/css' href='css/bootstrap.css' />
				<link rel='stylesheet' type='text/css' href='css/geral.css' />
</head>
<body>

	<nav class='navbar navbar-expand-lg navbar-dark' style='background-color:#000;'>
				<a class='navbar-brand' href='index.jsp'><img class='img-fluid' src='imagens/LogoBoliOf.svg'  style='width:60px;height:60px;'/></a>
					<button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#a' aria-expanded='true' aria-controls='a' aria-label='Alterna'>
						<span class='navbar-toggler-icon'></span>
					</button>
				
				<div class='nav collapse navbar-collapse' id='a'>
					<ul class='navbar-nav mr-auto'>
						<li class='nav-item'>
							<a class='nav-link' href='index.jsp' style='color:#fff;'>Home</a>
						</li>
						
							<li class='nav-item'>
							<a class='nav-link' href='${pageContext.request.contextPath}/HomeControlle?pagina=cadastro' style="color:#fff;">Cadastro</a>
						</li>
						<li class='nav-item'>
							<a class='nav-link' href='${pageContext.request.contextPath}/HomeControlle?pagina=login' style="color:#fff;">Login</a>
						</li>
				<c:set var="usuario" scope="session" value="${usuario}"></c:set>
				<c:choose>
					<c:when test="${usuario != null}">
						<li class="nav-item">
							<a class="nav-link" href="${pageContext.request.contextPath}/HomeControlle?pagina=criarPartida" style="color:#fff;">Criar partida</a>
						</li>
						
						<li class='nav-item'>
							<a class='nav-link' href='${pageContext.request.contextPath}/HomeControlle?pagina=placares' style='color:#fff;'>Placares</a>
						</li>
						<li class='nav-item' style="color:#fff;">
						<%
						String usuario = (String) session.getAttribute("usuario");
						%>
						<c:out value="${usuario}"></c:out>
						</li>
						<li class='nav-item'>
						<a href="Sair"><button>Sair</button></a>
						</li>/
					
					</c:when>
				</c:choose>
					</ul>
				</div>
			</nav>