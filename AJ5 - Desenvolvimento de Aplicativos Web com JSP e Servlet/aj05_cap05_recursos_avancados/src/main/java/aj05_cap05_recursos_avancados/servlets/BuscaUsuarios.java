package aj05_cap05_recursos_avancados.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import aj05_cap05_recursos_avancados.model.Usuario;

/**
 * Servlet implementation class BuscaUsuarios
 */
public class BuscaUsuarios extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BuscaUsuarios()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request,
	 *      HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doAction(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request,
	 *      HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doAction(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request,
	 *      HttpServletResponse response)
	 */
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Usuario[] usuarios = new Usuario[3];

		Usuario u0 = new Usuario("mainUser", "mainUser@globalcode.com.br", "08007045282", "R. Alexandre Dumas, 1268");
		Usuario u1 = new Usuario("gcUser", "gcUser@globalcode.com.br", "--------", "R. Bernardino de Campos, 327");
		Usuario u2 = new Usuario("ajUser", "ajUser@globalcode.com.br", "51832999", "R. Alexandre Dumas, 1268");

		usuarios[0] = u0;
		usuarios[1] = u1;
		usuarios[2] = u2;

		request.setAttribute("users", usuarios);
		RequestDispatcher rd = request.getRequestDispatcher("/listaUsuarios");
		rd.forward(request, response);
	}
}
