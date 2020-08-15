
//criar novo jogador
		$("#adicionar").click(function(e){
			e.preventDefault();
			var table = document.getElementById("tabelaJogador");
			var row = table.insertRow(2);
			row.insertCell(0).append("Nome do jogador");
			row.insertCell(1).innerHTML = `<input type='text' name='jogadorNome' />`;
	});