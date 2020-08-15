package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controle.UsuarioControle;
import Modelo.Jogador;
/**
 * Servlet implementation class InserirJog
 */
@WebServlet("/InserirJog")
public class InserirJog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserirJog() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Jogador joga = new Jogador();
		joga.setNome(request.getParameter("nome"));

		if(new UsuarioControle().createJogador(joga)) {
			request.getRequestDispatcher("CadasJogs.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("404.jsp").forward(request,response);
		}
	}

}
