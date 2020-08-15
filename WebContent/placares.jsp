<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="Frags/header.jsp"><c:param name="titulo" value="placares"></c:param></c:import>	

<c:set var="listarResultados" value="${requestScope['selecRes']}"></c:set>
<c:forEach items="${listarResultados}" var="res">
	<form action="HomeControlle?id=${res.id}" method="post">
		<input type="hidden" name="form" value="deleteFinal"/>
		<table class="table">
					<tr>
						<th>Partida</th>
						<th>Nome do jogador</th>
						<th>data</th>
						<th>pontos</th>
					</tr>
					<tr>
						
						<td>${res.partidaFinal}</td>
						<td>${res.jogadorNome}</td>
						<td>${res.data}</td>
						<td>${res.pontos}</td>
						<td><a href="${pageContext.request.contextPath}/HomeControlle?pagina=editarFinal&id=${res.id}">Editar</a></td>
						<td><button type="submit">Deletar</button><td>

					</tr>
		</table>
	</form>
	</c:forEach>	
<c:import url="Frags/footer.jsp"></c:import>