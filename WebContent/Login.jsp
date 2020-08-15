<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="Frags/header.jsp"></c:import>
<body style='background-color:#000;'>

	
			<div class='container-fluid cont'>
					<div>
						<form id="formsub" class='container-fluid form cads' action='VerificarLogin' method='post'>
							<img class='img-fluid' src='imagens/CadBoli.svg'/>
							<div class='cad'>
								
								
								<div class='form-group col-auto form-row'>
									<input type='text' name='user' placeholder="Seu nome de usuário" required/>
								</div>
								
								<div class='form-group col-auto form-row'>
									<input type='password' id='senha' name='senha' placeholder='Insira sua senha' required/>
								</div>
								<div class='form-group col-auto form-row'>
									<input type='password' name='consenha' id="consenha" placeholder='confirme a senha' required/>
								</div>
								<div class="form-group">
									<h3 id="error" style="color:#00f;">Senha e Confirmação de senhas não estão iguais</h3>
								</div>
								<div class='form-group col-auto form-row'>
									<input type='submit' value='Logar' id='btn-login'/>
								</div>
							</div>
						</form>
						</div>
				</div>
<c:import url="Frags/footer.jsp"></c:import>
<script type="text/javascript" src="js/verify.js"></script>

