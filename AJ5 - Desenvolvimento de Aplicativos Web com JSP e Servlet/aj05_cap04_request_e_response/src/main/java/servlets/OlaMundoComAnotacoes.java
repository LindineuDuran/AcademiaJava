package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class OlaMundoComAnotacoes
 */
@WebServlet("/olamundo_anotacao")
public class OlaMundoComAnotacoes extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OlaMundoComAnotacoes()
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
		// Definindo qual tipo de conte�do
		response.setContentType("text/html");

		// Obtem o canal de comunica��o com o cliente, neste caso o browser
		PrintWriter out = response.getWriter();

		// Enviando os dados para o cliente
		out.println("<html>");
		out.println("   <head><title>Ol� Mundo com Anota��es</title></head>");
		out.println("   <body>");
		out.println("      <h1>Ol� Mundo com Anota��es</h1>");
		out.println("   </body>");
		out.println("</html>");
		out.close();
	}
}
