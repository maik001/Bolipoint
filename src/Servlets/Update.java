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
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Usuario user = new Usuario();
		user.setUser(request.getParameter("usuario"));
		user.setEmail(request.getParameter("email"));
		user.setSenha(request.getParameter("senha"));
		if(new UsuarioControle().UpdateUsuario(id,user)){
			request.getRequestDispatcher("index.jsp").forward(request,response);
		}else {
			request.getRequestDispatcher("404.jsp").forward(request,response);
		}
	}

}
