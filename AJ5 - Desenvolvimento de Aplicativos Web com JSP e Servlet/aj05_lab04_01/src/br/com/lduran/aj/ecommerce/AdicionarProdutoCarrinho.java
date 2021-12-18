package br.com.lduran.aj.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AdicionarProdutoCarrinho extends HttpServlet
{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		// Obtencao do canal de envio de dados para o cliente
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Ecommerce : Academia do Java</title>");
		out.println("<meta http-equiv='Content-Type' content='text/html; charset=utf-8'>");
		out.println("<link href= 'aj.css' rel='stylesheet' type='text/css'></link>");
		out.println("</head>");
		out.println("<body>");
		out.println("<H1>Adicionando produtos no carrinho de compras</H1>");

		// -------------------------------------------------------------------
		// Insira a partir daqui o codigo pedido no laboratorio:
		// -------------------------------------------------------------------
		String idProduto = request.getParameter("idProduto");
		out.println("<H3>Código do Produto: " + idProduto + "</H3>");

		// Devemos imprimir somente o codigo do produto, pois esta e a unica
		// informacao recebida.
		out.println("</body>");
		out.println("</html>");
	}
}