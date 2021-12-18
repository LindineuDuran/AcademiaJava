package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 * Servlet implementation class LerDados
 */
public class LerDados extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LerDados()
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
		// Definindo qual tipo de conteúdo
		response.setContentType("text/html");

		// Obtem o canal de comunicação com o cliente, neste caso o browser
		PrintWriter out = response.getWriter();

		// Leitura dos parâmetros enviados através do formulário:

		// <p>Nome: <input type = "text" name = "textNome" /></p>
		String nome = request.getParameter("textNome");

		// <p>Email: <input type = "text" name = "textEmail" /></p>
		String email = request.getParameter("textEmail");

		// Enviando os dados para o cliente
		out.println("<html>");
		out.println("   <head><title>Teste Formulário</title></head>");
		out.println("   <body>");
		out.println("      <h2>Obrigado, seu cadastro foi realizado com sucesso!</h2>");
		out.println("      Nome:   " + nome + "<BR>");
		out.println("      E-mail: " + email);
		out.println("   </body>");
		out.println("</html>");
		out.close();
	}
}
