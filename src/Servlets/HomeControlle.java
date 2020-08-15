package Servlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.*;
import Controle.UsuarioControle;
import java.util.ArrayList;
import java.util.Date;


@WebServlet("/HomeControlle")
public class HomeControlle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HomeControlle() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pagina = request.getParameter("pagina").toString();
			switch(pagina) {
				case "home":
					request.getRequestDispatcher("Home.jsp").forward(request, response);
					break;
				case "editPoints":
					ArrayList <Jogador> listarJogadores = new UsuarioControle().selecionarJogadores();
					request.setAttribute("listaJog", listarJogadores);
					
 					request.getRequestDispatcher("EditarPontuacao.jsp").forward(request, response);
					break;
				
				case "cadastro":
					request.getRequestDispatcher("Cadastro.jsp").forward(request, response);
					break;
				case "login":
					request.getRequestDispatcher("Login.jsp").forward(request, response);
					break;
				case "criarPartida":
					request.getRequestDispatcher("CreateMatch.jsp").forward(request, response);
					break;
				case "insj":
						ArrayList <Partida> listarPartida  = new UsuarioControle().selecionarPartida();
						request.setAttribute("selecPart",listarPartida);
						request.getRequestDispatcher("inscricao_jogador.jsp").forward(request, response);
						break;
				case "placares":
					ArrayList<finalResult> listarResultados = new UsuarioControle().selecionarFinal();
					request.setAttribute("selecRes",listarResultados);
					request.getRequestDispatcher("placares.jsp").forward(request, response);
					break;
				case "editarFinal":
						finalResult finedit = new UsuarioControle().selecionarUm(Integer.parseInt(request.getParameter("id")));
						request.setAttribute("finalres",finedit);
						request.getRequestDispatcher("EditarResFinal.jsp").forward(request, response);
					break;
				default:
					request.getRequestDispatcher("404.jsp").forward(request, response);
					break;
			}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String acoes = request.getParameter("form").toString();
			switch(acoes) {
				case "adicionarUsuario":
					if(request.getParameter("senha").equals(request.getParameter("consenha"))) {
						Usuario user = new Usuario();
						user.setUser(request.getParameter("user"));
						user.setEmail(request.getParameter("email"));
						user.setSenha(request.getParameter("senha"));
						if(new UsuarioControle().create(user)) {
							request.getRequestDispatcher("index.jsp").forward(request, response);
						}else {
							request.getRequestDispatcher("404.jsp").forward(request,response);
						}
					}else {
							request.getRequestDispatcher("404.jsp").forward(request,response);

					}
					break;
				
		
				case "adicionarJogador":
					Jogador player = new Jogador();
					player.setNome(request.getParameter("jogadorNome"));
					player.setPartida(Integer.parseInt(request.getParameter("idPartida")));
					if(new UsuarioControle().createJogador(player)) {
						request.getRequestDispatcher("redirectEditPoints.jsp").forward(request,response);

					}
					break;
				case "editarPartida":
					break;
				case "editarJogador":
					break;
				case "editarUsuario":
					break;
				case "editF":
					
    					finalResult fin = new finalResult();
    					fin.setPartidaFinal(request.getParameter("partida"));
    					fin.setJogadorNome(request.getParameter("JogadorNome"));
						fin.setPontos(Integer.parseInt(request.getParameter("pontos")));
						fin.setId(Integer.parseInt(request.getParameter("id")));
        				if(new UsuarioControle().updateFinalResult(fin)){
        					request.getRequestDispatcher("redirect_final.jsp").forward(request, response);
        				}else{
        					request.getRequestDispatcher("404.jsp").forward(request, response);
        				}
    				

					break;
				case "deleteFinal":
						 if(request.getParameter("id") != null) {
							if(new UsuarioControle().deleteFinal(Integer.parseInt(request.getParameter("id")))) {
									request.getRequestDispatcher("redirect_final.jsp").forward(request, response);
							}
						}
					break;
				case "finalizar":
					try {
						finalResult fr = new finalResult();
						fr.setJogadorNome(request.getParameter("jogadorNome"));
						fr.setPartidaFinal(request.getParameter("partida"));
						fr.setPontos(Integer.parseInt(request.getParameter("resultado11")));
						String dataFin = request.getParameter("data");
						DateFormat formaterFin = new SimpleDateFormat("yyyy-MM-dd");
						Date dateFin = new java.sql.Date(((java.util.Date)formaterFin.parse(dataFin)).getTime());
						fr.setData(dateFin);
						
						if(new UsuarioControle().createFinalResult(fr)){
							request.getRequestDispatcher("redirect_final.jsp").forward(request, response);
						}else {
							request.getRequestDispatcher("404.jsp").forward(request, response);

						}
					}catch(Exception e) {
						System.out.println("Erro geral:"+e.getMessage());
						
					}
					break;
				case "rodaInsc":
					try {
						finalResult fr = new finalResult();
						fr.setJogadorNome(request.getParameter("jogadorNome"));
						fr.setPartidaFinal(request.getParameter("partida"));
						fr.setPontos(Integer.parseInt(request.getParameter("resultado11")));
						String dataa = request.getParameter("data");
						DateFormat forma = new SimpleDateFormat("yyyy-MM-dd");
						Date dat= new java.sql.Date(((java.util.Date)forma.parse(dataa)).getTime());
						fr.setData(dat);
						
						if(new UsuarioControle().createFinalResult(fr)){
							request.getRequestDispatcher("redirect_insc.jsp").forward(request, response);
						}else {
							request.getRequestDispatcher("404.jsp").forward(request, response);

						}
					}catch(Exception e) {
						System.out.println("Erro geral:"+e.getMessage());
						
					}
					break;
				case "VerificarLogin":
					UsuarioControle control = new UsuarioControle();

					String user = request.getParameter("user");
					String senha = request.getParameter("senha");
					
					Boolean test = control.selecionarNS(user, senha);
					if(test == true){
						request.getRequestDispatcher("index.jsp").forward(request, response);
					}else {
						request.getRequestDispatcher("404.jsp").forward(request, response);
					}
					break;
				default:
					request.getRequestDispatcher("404.jsp").forward(request, response);
					break;
			}
	}
	
}
