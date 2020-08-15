package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Controle.UsuarioControle;

/**
 * Servlet implementation class VerificarLogin
 */
@WebServlet("/VerificarLogin")
public class VerificarLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerificarLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UsuarioControle control = new UsuarioControle();
		String user = request.getParameter("user");
		String senha = request.getParameter("senha");
		System.out.println(user);
		System.out.println(senha);
	
		if(control.selecionarNS(user, senha) != null){
				request.getSession().setAttribute("usuario",user);
				response.sendRedirect("index.jsp");
			
		}else {
				response.sendRedirect("VerificarLogin");
			}
		
	}
	
	}



