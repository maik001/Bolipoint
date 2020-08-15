//Esconder div

	crp = $(function(){
			$(".CrPart").click(function(e){
				e.preventDefault();
				el = $(this).data('element');
				$(el).toggle();
				
			});
	});

	crc = $(function(){
		$(".CrCamp").click(function(e){
			e.preventDefault();
			el = $(this).data('element');
			$(el).toggle();
			
		});
	});
	
	function mudar(){
		document.getElementById("mud").value="finalizar";
	}
		

	