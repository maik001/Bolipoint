package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controle.UsuarioControle;
import Modelo.Usuario;

/**
 * Servlet implementation class Inserir
 */
@WebServlet("/Inserir")
public class Inserir extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inserir() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario user = new Usuario();
		user.setUser(request.getParameter("user"));
		user.setEmail(request.getParameter("email"));
		user.setSenha(request.getParameter("senha"));
		if(new UsuarioControle().create(user)) {
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("404.jsp").forward(request,response);
		}
	
	}

}
