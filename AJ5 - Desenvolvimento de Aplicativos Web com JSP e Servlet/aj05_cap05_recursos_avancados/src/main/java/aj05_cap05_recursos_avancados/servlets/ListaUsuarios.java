package aj05_cap05_recursos_avancados.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import aj05_cap05_recursos_avancados.model.Usuario;

/**
 * Servlet implementation class ListaUsuarios
 */
public class ListaUsuarios extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListaUsuarios()
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
		Usuario[] usuarios = (Usuario[]) request.getAttribute("users");

		// Definindo qual tipo de conteúdo
		response.setContentType("text/html");

		// Obtem o canal de comunicação com o cliente, neste caso o browser
		PrintWriter out = response.getWriter();

		// Enviando os dados para o cliente
		out.println("<html>");
		out.println("   <head><title>Teste Formulário</title></head>");
		out.println("   <body>");
		out.println("      <h2>Listagem de usuários</h2>");

		if (usuarios != null)
		{
			for (Usuario user : usuarios)
			{
				out.println("nome: " + user.getNome() + "<br/>");
				out.println("e-mail: " + user.getEmail() + "<br/>");
				out.println("telefone: " + user.getTelefone() + "<br/>");
				out.println("endereço: " + user.getEndereco() + "<br/>");
				out.println("<hr/>");
			}
		}
		else
		{
			out.println("<h3><a href=\"buscaUsuarios\">Clique aqui para listar os usuários</a></h3>");
		}
		out.println("      <h3><a href=\"index.jsp\">voltar");
		out.println("   </body>");
		out.println("</html>");
		out.close();
	}
}
