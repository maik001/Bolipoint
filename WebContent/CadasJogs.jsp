<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import='Controle.UsuarioControle'%>
<!DOCTYPE html>
<html>
<head>
			<meta charset="UTF-8">
			<title>BoliPoint</title>
			<link rel='stylesheet' type='text/css' href='css/bootstrap.css' />
			<link rel='stylesheet' type='text/css' href='css/geral.css' />
</head>
<body>
		<nav class='navbar navbar-expand-lg navbar-dark' style='background-color:#000;'>
						<a class='navbar-brand' href='Main.jsp'><img class='img-fluid' src='imagens/LogoBoliOf.svg'  style='width:60px;height:60px;'/></a>
							<button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#a' aria-expanded='true' aria-controls='a' aria-label='Alterna'>
								<span class='navbar-toggler-icon'></span>
							</button>
						
						<div class='nav collapse navbar-collapse' id='a'>
							<ul class='navbar-nav mr-auto'>
								<li class='nav-item'>
									<a class='nav-link' href='index.jsp' style='color:#fff;'>Home</a>
								</li>
								
								<li class='nav-item'>
									<a class='nav-link' href='Sobre.jsp' style='color:#fff;'>Sobre</a>
								</li>
								<li class='nav-item'>
									<a class='nav-link' href='history.jsp' style='color:#fff;'>História</a>
								</li>
								
								<li class='nav-item'>
									<a class='nav-link' href='help.jsp' style='color:#fff;'>Ajuda</a>
								</li>
								
							</ul>
						</div>
					</nav>
				<div class='container-fluid'>
					<p>Faça o cadastro de todos os jogadores.</p>
					<form action='InserirJog' method='post'>
						<div class='form-group form-row'>
							<label>nome do jogador</label>
							<input type='text' name='nome' required>
						</div>
						
						<div class='form-group form-row'>
							<label>Ordem de jogada</label>
							<input type='number' name='ordem' required/>
						</div>
						
						<div class='form-group form-row'>
							<input type='submit' value='enviar'/>
						</div>
					</form>
				</div>

			
				<div class='container-fluid' >
						<form>
							<table class='table'>
								<tr>
								
								 <th>Nome do jogador</th>
									<td> Ricardo ohara</td> 
								<th>Ordem de jogada</th>
									<td>2</td>
								</tr>
								
							</table>
							<table class='table'>
								<tr>
									<th>Frames</th>
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
								</tr>
							</table>
							<table class='table' border='1'>
								<tr>
									<th>Pinos derrubados</th>
									<td><input type='text' name='f1l' class='ip' maxlength="2"/></td>
									<td><input type='text' name='f1r' class='ip' maxlength="2"/></td>
									<td><input type='text' name='f2l' class='ip' maxlength="2"/></td>
									<td><input type='text' name='f2r' class='ip' maxlength="2"/></td>
									<td><input type='text' name='f3l' class='ip' maxlength="2"/></td>
									<td><input type='text' name='f3r' class='ip' maxlength="2"/></td>
									<td><input type='text' name='f4l' class='ip' maxlength="2"/></td>
									<td><input type='text' name='f4r' class='ip' maxlength="2"/></td>
									<td><input type='text' name='f5l' class='ip' maxlength="2"/></td>
									<td><input type='text' name='f5r' class='ip' maxlength="2"/></td>
									<td><input type='text' name='f6l' class='ip' maxlength="2"/></td>
									<td><input type='text' name='f6r' class='ip' maxlength="2"/></td>
									<td><input type='text' name='f7l' class='ip' maxlength="2"/></td>
									<td><input type='text' name='f7r' class='ip' maxlength="2"/></td>
									<td><input type='text' name='f8l' class='ip' maxlength="2"/></td>
									<td><input type='text' name='f8r' class='ip' maxlength="2"/></td>
									<td><input type='text' name='f9l' class='ip' maxlength="2"/></td>
									<td><input type='text' name='f9r' class='ip' maxlength="2"/></td>
									<td><input type='text' name='f10l' class='ip' maxlength="2"/></td>
									<td><input type='text' name='f10r' class='ip' maxlength="2"/></td>
									<td><input type='text' name='f10r2' class='ip' maxlength="2"/></td>
									
								</tr>
							</table>
							
							<table class='table' border='1'>
								<tr>
									<th>Pontos</th>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									
								</tr>
							</table>
						</form>
				</div>
				
	<script src='/javascripts/application.js' type='text/javascript' charset='utf-8' ></script>
		<script type="text/javascript" src='js/jquery.js'></script>
		<script type="text/javascript" src='js/bootstrap.js'></script>
</body>
</html>