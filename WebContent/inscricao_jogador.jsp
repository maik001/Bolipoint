<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="Frags/header.jsp"><c:param name="titulo" value="insJogador"></c:param></c:import>


<c:set var="listarPartida" value="${requestScope['selecPart'] }"></c:set>
<c:forEach items="${listarPartida}" var="partida">
	<form method="post" action="HomeControlle?idPartida=${partida.idPartida}">
		<input type="hidden" name="form" value="adicionarJogador" />
		<table class='table' border='1' id='tabelaJogador'>
			<tr>
				<td colspan="6" style="text-align:center">
					<label>Inscrição de jogadores</label>
				</td>
			</tr>
			<tr>
				<td>Nome da partida</td>
				<td><c:out value="${partida.partidaNome}"></c:out></td>
				<td>Id da partida</td>
				<td><c:out value="${partida.idPartida}"></c:out></td>
				<td>Data</td>
				<td><c:out value="${partida.data}"></c:out></td>
			</tr>
			<tr>
				<td>Nome do jogador</td>
				<td><input type="text" name="jogadorNome"/></td>
			</tr>
			
		</table>
		
		
		<button type="submit">Inserir</button>	
	</form>
</c:forEach>
<c:import url="Frags/footer.jsp"></c:import>