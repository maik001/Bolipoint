<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="Frags/header.jsp"><c:param name="titulo" value="EditarResultado"></c:param></c:import>
<c:set var="finedit" value="${requestScope['finalres']}"></c:set>
	<form action="HomeControlle?id=${finedit.id}" method="post">
		<input type="hidden" name="form" value="editF"/>
		<table class="table">
					<tr>

						<th>Partida</th>
						<th>Nome do jogador</th>
						<th>pontos</th>
					</tr>
					<tr>
						
						<td><input type="text" name="partida" value="${finedit.partidaFinal}"></td>
						<td><input type="text" name="JogadorNome" value="${finedit.jogadorNome}"/></td>
						<td><input type="number" name="pontos" value="${finedit.pontos}"/></td>
						
						

					</tr>
		</table>
		<button type="submit">Enviar</button>
	</form>
<c:import url="Frags/footer.jsp"></c:import>