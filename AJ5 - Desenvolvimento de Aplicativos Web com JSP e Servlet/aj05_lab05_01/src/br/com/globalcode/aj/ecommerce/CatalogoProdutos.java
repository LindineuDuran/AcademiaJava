/*
 * CatalogoProdutos.java
 *
 */
package br.com.globalcode.aj.ecommerce;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import br.com.globalcode.aj.dao.ProdutoDAO;
import br.com.globalcode.aj.dao.ProdutoDB;
import br.com.globalcode.util.GlobalcodeException;

public class CatalogoProdutos extends HttpServlet
{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

		ProdutoDAO produtosDB = new ProdutoDB();
		List listaProdutos = null;
		try
		{
			listaProdutos = produtosDB.getCatalogoProdutos();

			// -------------------------------------------------------------------
			// Insira a partir daqui o codigo pedido no laboratorio:
			// -------------------------------------------------------------------
			request.setAttribute("produtos", listaProdutos);
			RequestDispatcher rd = request.getRequestDispatcher("/catalogoProdutosView");
			rd.forward(request, response);
		}
		catch (GlobalcodeException e)
		{
			throw new ServletException(e);
		}
	}
}
