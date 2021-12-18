package aj05_cap05_recursos_avancados.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 * Servlet implementation class TesteServletConfig
 */
public class TesteServletConfig extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TesteServletConfig()
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
		// Definindo qual tipo de conteúdo
		response.setContentType("text/html");

		// Lendo variáveis armazenadas no web.xml
		ServletConfig config = getServletConfig();
		String localizacao = config.getInitParameter("default_locale");
		String versao = config.getInitParameter("version");

		// Obtem o canal de comunicação com o cliente, neste caso o browser
		PrintWriter out = response.getWriter();

		// Enviando os dados para o cliente
		out.println("<html>");
		out.println("   <head><title>Teste Formulário</title></head>");
		out.println("   <body>");
		out.println("      Versão do sistema " + versao + "<br />");
		out.println("      Localização default " + localizacao + "<br />");
		out.println("      <h3><a href=\"index.jsp\">voltar");
		out.println("   </body>");
		out.println("</html>");
		out.close();
	}
}
