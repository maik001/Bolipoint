<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="Frags/header.jsp" ><c:param name="titulo" value="CreateMatch"></c:param></c:import>					
<link rel="stylesheet" type="text/css" href="css/main.css"/>
			<div><h3>Seja bem vindo. avaliador:</h3></div>
			
			<div>
				<button class='CrPart' data-element='#crPart'>Criar partida rápida</button>
				
			</div>
			<div class='container' id='crPart' style='display:none;'>
				<form method='post' action='adicionarPartida'>
					<h4>Criação de partida</h4>
					<div class='form-group'>
						<label>Nome da partida</label>
						<input type='text' id='partName' name='nomePartida' placeholder='Digite aqui o nome da partida' required/>
						
						<label>Tipo de partida</label>
						<select name="tipo">
							<option value='Amistoso'>Amistoso</option>
							<option value='Treino'>Treino</option>
							<option value='Oficial'>Oficial</option>
						</select>
						<div class='form-group'>
							<label>Data da partida</label>
							<input type='date' name='data' id='data'/>
						</div>
						<div class='form-group'>
							<label></label>
						</div>
						<div class='form-group'>
							<input type='submit' value='Inscrever jogadores'/>	
						</div>
					</div>
				
				</form>
			</div>
				
<c:import url="Frags/footer.jsp"></c:import>