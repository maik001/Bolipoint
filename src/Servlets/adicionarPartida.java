package Servlets;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controle.UsuarioControle;
import Modelo.Partida;

/**
 * Servlet implementation class adicionarPartida
 */
@WebServlet("/adicionarPartida")
public class adicionarPartida extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adicionarPartida() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			Partida part = new Partida();
			String data = request.getParameter("data");
			DateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new java.sql.Date(((java.util.Date)formater.parse(data)).getTime());
			part.setData(date);
			part.setPartidaNome(request.getParameter("nomePartida"));
			part.setTipo(request.getParameter("tipo"));
			if(new UsuarioControle().createPartida(part)) {
				ArrayList <Partida> listarPartida  = new UsuarioControle().selecionarPartida();
				request.setAttribute("selecPart",listarPartida);
				response.sendRedirect("HomeControlle?pagina=insj");

			}else {
				request.getRequestDispatcher("404.jsp").forward(request,response);
			}
		
		} catch(Exception e) {
			System.out.println("Erro geral ao adicionar partida:"+e.getMessage());
		
		}
		
	}

}
