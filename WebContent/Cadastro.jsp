<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="Frags/header.jsp"></c:import>
<body style='background-color:#000;'>


			<div class='container-fluid cont'>
					<div>
						<form id='formsub' class='container-fluid form cads' action='HomeControlle' method='post'>
							<input type="hidden" name="form" value="adicionarUsuario"/>
							<img class='img-fluid' src='imagens/CadBoli.svg'/>
							<div class='cad'>
								<div class='form-group col-auto form-row'>
									<input type='text' name='user' placeholder="Insira um nome de usuário" required/>
								</div>
								
								<div class='form-group col-auto form-row'>
									<input type='email' name='email' placeholder="Seu email:email@gmail.com" required/>
								</div>
								
								<div class='form-group col-auto form-row'>
									<input type='password' id='senha' name='senha' placeholder='Insira uma senha' required/>
								</div>
								<div class='form-group col-auto form-row'>
									<input type='password' id='consenha' name='consenha' placeholder='confirme a senha' required/>
								</div>
								<div class='form-group col-auto form-row'>
									<input type='submit' value='Cadastrar' />
									<h3 id='error'>Senhas não são iguais</h3>
								</div>
								
							</div>
						</form>
						</div>
				</div>
<c:import url="Frags/footer.jsp"></c:import>