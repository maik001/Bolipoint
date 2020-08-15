$(document).ready(function(){
	$('#error').hide();
	$('#formsub').submit(function(){
		let senha = $('#senha').val();
		let consenha = $('#consenha').val();
		
				if(senha == consenha){
					location.href='VerificarLogin';
				}else{
					$('#error').show();
					return false;
				}
		
		});
		
	
	});
