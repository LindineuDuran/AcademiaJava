package aj05_cap06_gerenciamento_de_sessao.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import aj05_cap06_gerenciamento_de_sessao.models.Cliente;

/**
 * Servlet implementation class ValidaLogin
 */
@WebServlet("/validaLogin")
public class ValidaLogin extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ValidaLogin()
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
		String usuario = request.getParameter("username");
		String senha = request.getParameter("password");

		String msg = "";
		String urlDestino = "/geraTelaLogin";

		if (usuario == null || usuario.equals(""))
		{
			msg = "Por favor, digite o usuário.";
		}
		else if (senha == null || senha.equals(""))
		{
			msg = "Por favor, digite a senha.";
		}
		else
		{
			if (usuario.equals("gc") && usuario.equals("gc"))
			{
				Cliente cliente = new Cliente("Globalcode", usuario, senha, "rua Bernardino de Campos, 327", "(11) 3171-1987", true);
				request.getSession().setAttribute("usuario", cliente);
				msg = "Usuário autenticado.";
				urlDestino = "/iniciaAplicacao";
			}
			else
			{
				msg = "Usuário e senha inválidos!";
			}
		}

		request.setAttribute("msg", msg);
		RequestDispatcher dispatcher = request.getRequestDispatcher(urlDestino);
		dispatcher.forward(request, response);
	}
}
