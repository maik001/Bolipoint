
function calculo(inp){
	
	var n1 = parseInt(document.getElementById("n1").value);
	var n2 = parseInt(document.getElementById("n2").value);
	var n3 = parseInt(document.getElementById("n3").value);
	var n4 = parseInt(document.getElementById("n4").value);
	var n5 = parseInt(document.getElementById("n5").value);
	var n6 = parseInt(document.getElementById("n6").value);
	var n7 = parseInt(document.getElementById("n7").value);
	var n8 = parseInt(document.getElementById("n8").value);
	var n9 = parseInt(document.getElementById("n9").value);
	var n10 = parseInt(document.getElementById("n10").value);
	var n10a = parseInt(document.getElementById("n10a").value);
	var n10b = parseInt(document.getElementById("n10b").value);
	
	if(n1 == 10){
		n1 = n1 + n2 + n3;
		document.getElementById("resultado").innerHTML = n1;
	}else{
		
		document.getElementById("resultado").innerHTML = n1;
		
	}

	if(n2 == 10 ){
		n2 = n1 + n2 +n3 + n4;
		document.getElementById("resultado1").innerHTML = n2;
	}else{
		n2 = n1 + n2;
		document.getElementById("resultado1").innerHTML = n2;
	}
	
	if(n3 == 10){
		n3 = n2 + n3 + n4 + n5;
		document.getElementById("resultado2").innerHTML = n3;
	}else{
		n3 = n2 + n3;
		document.getElementById("resultado2").innerHTML = n3;
	}
	
	if(n4 == 10){
		n4 = n3 + n4 + n5 + n6;
		document.getElementById("resultado3").innerHTML = n4;
	}else{
		n4 = n3 + n4;
		document.getElementById("resultado3").innerHTML = n4;
	}
	
	if(n5 == 10){
		n5 = n4 + n5 + n6 + n7;
		document.getElementById("resultado4").innerHTML = n5;
	}else{
		n5 = n4 + n5;
		document.getElementById("resultado4").innerHTML = n5;
	}
	
	if(n6 == 10){
		n6 = n5 + n6 + n7 + n8;
		document.getElementById("resultado5").innerHTML = n6;
	}else{
		n6 = n5 + n6;
		document.getElementById("resultado5").innerHTML = n6;
	}
	
	if(n7 == 10){
		n7 = n6 + n7 + n8 + n9;
		document.getElementById("resultado6").innerHTML = n7;
	}else{
		n7 = n6 + n7;
		document.getElementById("resultado6").innerHTML = n7;
	}
	
	if(n8 == 10){
		n8 = n7 + n8 + n9 + n10;
		document.getElementById("resultado7").innerHTML = n8;
	}else{
		n8 = n7 + n8;
		document.getElementById("resultado7").innerHTML = n8;
	}
	
	if(n9 == 10){
		n9 = n8 + n9 + n10 + n10a;
		document.getElementById("resultado8").innerHTML = n9;
	}else{
		n9 = n8 + n9;
		document.getElementById("resultado8").innerHTML = n9;
	}
	
	if(n10 == 10 ){
		n10 = n9+n10+n10a+n10b;
		document.getElementById("resultado9").innerHTML = n10;
	}else{
		n10 = n9 + n10;
		document.getElementById("resultado9").innerHTML = n10;
	}
	
	if(n10a == 10){
		n10a = n10 + n10a + n10b;
		document.getElementById("resultado10").innerHTML = n10a;
	}else{
		n10a = n10 + n10a;
		document.getElementById("resultado10").innerHTML = n10a;
	}
	
	if(n10b == 10){
		n10b = n10a + n10b;
		document.getElementById("resultado11").innerHTML = n10b;
		inp.value = n10b;
	
	}else{
		n10b = n10a + n10b;
		document.getElementById("resultado11").innerHTML = n10b;
		inp.value = n10b;
	}

	
}





