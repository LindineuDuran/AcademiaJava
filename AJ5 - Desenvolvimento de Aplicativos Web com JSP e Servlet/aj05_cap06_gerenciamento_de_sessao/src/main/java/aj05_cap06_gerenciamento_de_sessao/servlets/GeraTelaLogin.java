package aj05_cap06_gerenciamento_de_sessao.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class GeraTelaLogin
 */
@WebServlet("/geraTelaLogin")
public class GeraTelaLogin extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GeraTelaLogin()
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

		String msg = (String) request.getAttribute("msg");

		// Enviando os dados para o cliente
		out.println("<html>");
		out.println("	<head><title>Login</title></head>");
		out.println("	<body>");
		out.println("		<form method='post' action='" + request.getContextPath() + "/validaLogin'>");
		out.println("			<table width='30%'>");
		if (msg != null && !msg.equals(""))
		{
			out.println("				<tr><td colspan='2'>");
			out.println(msg);
			out.println("				</td></tr>");
		}
		out.println("				<tr>");
		out.println("					<td>Usu&aacute;rio</td>");
		out.println("					<td><input type='text' name='username' size='10'></td>");
		out.println("				</tr>");
		out.println("				<tr>");
		out.println("					<td>Senha</td>");
		out.println("					<td><input type='text' name='password' size='10'></td>");
		out.println("				</tr>");
		out.println("				<tr>");
		out.println("					<td colspan='2'><button type='submit'>Entrar</button></td>");
		out.println("				</tr>");
		out.println("			</table>");
		out.println("		</form>");
		out.println("	</body>");
		out.println("</html>");
		out.close();
	}
}
