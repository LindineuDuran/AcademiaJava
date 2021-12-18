package aj05_cap06_gerenciamento_de_sessao.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import aj05_cap06_gerenciamento_de_sessao.models.Cliente;

/**
 * Servlet implementation class IniciaAplicacao
 */
@WebServlet("/iniciaAplicacao")
public class IniciaAplicacao extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IniciaAplicacao()
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
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request,
	 *      HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// Definindo qual tipo de conteúdo
		response.setContentType("text/html");

		// Obtem o canal de comunicação com o cliente, neste caso o browser
		PrintWriter out = response.getWriter();

		// Leitura do usuário(cliente) que está na session.
		Cliente usuario = (Cliente) request.getSession().getAttribute("usuario");

		// Enviando os dados para o cliente
		out.println("<html>");
		out.println("	<head><title>Bem vindo!in</title></head>");
		out.println("	<body>");
		out.println("      <h3>" + usuario.getNome() + "</h3><br />");
		out.println("      <h4>seja bem vindo &agrave; nossa loja online!</h3><br>");
		out.println("      <a href='efetuaLogout'>Logout</a>");
		out.println("	</body>");
		out.println("</html>");
		out.close();
	}
}
