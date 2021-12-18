package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 * Servlet implementation class OlaMundo
 */
public class OlaMundo extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OlaMundo()
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
		out.println("   <head><title>Ol� Mundo</title></head>");
		out.println("   <body>");
		out.println("      <h1>Ol� Mundo Louco!</h1>");
		out.println("   </body>");
		out.println("</html>");
		out.close();
	}
}
