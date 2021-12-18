package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 * Servlet implementation class Contador
 */
public class Contador extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Contador()
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
		// Leitura dos parâmetros enviados através do hyperlink:
		String paramInicio = request.getParameter("inicio");
		String paramFim = request.getParameter("fim");
		int inicio = 0;
		int fim = 0;

		try
		{
			inicio = Integer.parseInt(paramInicio);
			fim = Integer.parseInt(paramFim);
		}
		catch (NumberFormatException nfe)
		{
			throw new ServletException(nfe);
		}

		// Definindo qual tipo de conteúdo
		response.setContentType("text/html");

		// Obtem o canal de comunicação com o cliente, neste caso o browser
		PrintWriter out = response.getWriter();

		// Enviando os dados para o cliente
		out.println("<html>");
		out.println("   <head><title>Teste Formulário</title></head>");
		out.println("   <body>");
		out.println("      <h1>Contando de " + inicio + " a " + fim + "</h1>");

		for (int i = inicio; i <= fim; i++)
		{
			out.println(i);
			out.println("<br/>");
		}
		out.println("   </body>");
		out.println("</html>");
		out.close();
	}
}
