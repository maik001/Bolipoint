<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="Frags/header.jsp"><c:param name="titulo" value="EditPoints"></c:param></c:import>
		
		<div class="container-fluid">
			<c:set  var="listarJogadores" value="${requestScope['listaJog']}"></c:set>
			<c:forEach items="${listarJogadores}" var="jogador">
			
				
				<form method="post" action="HomeControlle?jogadorNome=${jogador.nome}&partida=${jogador.partidaNome}&data=${jogador.data}">
						<input type="hidden" name="form" value="rodaInsc" id="mud"/>
						<table class="table table-responsive table-sm" border="1">
							<thead class="thead-dark">	
		
								<tr >
									<th scope="col">Nome do Jogador:<c:out value="${jogador.nome}"></c:out></th>
									<th scope="col">Ordem:<c:out value="${jogador.id}"></c:out></th>
									<th scope="col">Partida:<c:out value="${jogador.partidaNome }"></c:out>
									<th scope="col">Data:<c:out value="${jogador.data}"></c:out>
								</tr>
							</thead>
								<tr>
										<td>Frames</td>
										<td>1</td>
										<td>2</td>
										<td>3</td>
										<td>4</td>
										<td>5</td>
										<td>6</td>
										<td>7</td>
										<td>8</td>
										<td>9</td>
										<td>10</td>
										<td>10a</td>
										<td>10b</td>
										

								</tr>
								<tr>
									<td>Pinos Derrubados</td>
									<td class="tdd"><input class="inpN" id="n1" type='number' min="0" max="10" maxlength="2" onfocus="calculo()" onblur="calculo()"></td>
									<td class="tdd"><input class="inpN" id="n2" type='number' min="0" max="10" maxlength="2" onfocus="calculo()" onblur="calculo()"></td>
									<td class="tdd"><input class="inpN" id="n3" type='number' min="0" max="10" maxlength="2" onfocus="calculo()" onblur="calculo()"></td>
									<td class="tdd"><input class="inpN" id="n4" type='number' min="0" max="10" maxlength="2" onfocus="calculo()" onblur="calculo()"></td>
									<td class="tdd"><input class="inpN" id="n5" type='number' min="0" max="10" maxlength="2" onfocus="calculo()" onblur="calculo()"></td>
									<td class="tdd"><input class="inpN" id="n6" type='number' min="0" max="10" maxlength="2" onfocus="calculo()" onblur="calculo()"></td>
									<td class="tdd"><input class="inpN" id="n7" type='number' min="0" max="10" maxlength="2" onfocus="calculo()" onblur="calculo()"></td>
									<td class="tdd"><input class="inpN" id="n8" type='number' min="0" max="10" maxlength="2" onfocus="calculo()" onblur="calculo()"></td>
									<td class="tdd"><input class="inpN" id="n9" type='number' min="0" max="10" maxlength="2" onfocus="calculo()" onblur="calculo()"></td>
									<td class="tdd"><input class="inpN" id="n10" type='number' min="0" max="10" maxlength="2" onfocus="calculo()" onblur="calculo()"></td>
									<td class="tdd"><input class="inpN" id="n10a" type='number' min="0" max="10" maxlength="2" onfocus="calculo()" onblur="calculo()"></td>
									<td class="tdd"><input class="inpN" id="n10b" type='number' min="0" max="10" maxlength="2" onfocus="calculo()" onblur="calculo()"></td>
									
								</tr>
								<tr>
									<td>Pontos</td>
									<td id="resultado"></td>
									<td id="resultado1"></td>
									<td id="resultado2"></td>
									<td id="resultado3"></td>											
									<td id="resultado4"></td>
									<td id="resultado5"></td>
									<td id="resultado6"></td>
									<td id="resultado7"></td>
									<td id="resultado8"></td>
									<td id="resultado9"></td>
									<td id="resultado10"></td>
									<td id="resultado11"></td>
									
									
								</tr>
								<tr>
									
									<td> <label>Result final</label>
										<input type="number" onfocus="calculo(this)"  name="resultado11" >
									</td></tr>
						</table>
						<button type="submit" onclick="document.form.action.value=rodaInsc">Próximo Jogador</button>
						<button type="submit" onclick="mudar()">Finalizar</button>
				</form>
	
			</c:forEach>
		
	</div>
	

<c:import url="Frags/footer.jsp"></c:import>