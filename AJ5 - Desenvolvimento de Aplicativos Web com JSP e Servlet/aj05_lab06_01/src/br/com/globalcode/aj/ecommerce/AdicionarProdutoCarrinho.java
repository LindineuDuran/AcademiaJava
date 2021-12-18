package br.com.globalcode.aj.ecommerce;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import br.com.globalcode.aj.dao.ProdutoDAO;
import br.com.globalcode.aj.dao.ProdutoDB;
import br.com.globalcode.beans.*;

public class AdicionarProdutoCarrinho extends HttpServlet
{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		Produto produtoSelecionado = getProdutoSelecionado(request);
		adicionarProdutoCarrinho(request, produtoSelecionado);
		RequestDispatcher dispatcher = request.getRequestDispatcher("exibeCarrinhoCompras");
		dispatcher.forward(request, response);
	}

	private Produto getProdutoSelecionado(HttpServletRequest request) throws ServletException
	{
		String strIdProduto = request.getParameter("idProduto");
		Produto prod = null;
		ProdutoDAO dao = new ProdutoDB();

		try
		{
			int id = Integer.parseInt(strIdProduto);
			prod = dao.getProdutoById(id);
			System.out.println("[AdicionarProdutoCarrinho:getProdutoSelecionado] Produto selecionado ");
			System.out.println(prod);
		}
		catch (Exception e)
		{
			throw new ServletException(e);
		}
		return prod;

	}

	private void adicionarProdutoCarrinho(HttpServletRequest request, Produto produtoSelecionado)
	{
		System.out.println(produtoSelecionado);
		// Criando um novo item com o produto selecionado, quantidade igual a
		// 1
		Item item = new Item(produtoSelecionado, 1);

		// -------------------------------------------------------------------
		// Insira a partir daqui o código pedido no laboratorio:
		// -------------------------------------------------------------------
		HttpSession session = request.getSession();
		CarrinhoCompras carrinho = (CarrinhoCompras) session.getAttribute("carrinhoCompras");

		if (carrinho == null)
		{ // se o carrinho de compras ainda não existe ...
			// Criando o objeto carrrinho de compras
			// passando o item como parametro no construtor
			carrinho = new CarrinhoCompras(item);

			// solucao
			session.setAttribute("carrinhoCompras", carrinho);

		}
		else
		{ // se o carrinho de compras ja existe ...
			// Adicionando o item no carrinho atraves do metodo addItem
			carrinho.addItem(item);
		}
	}
}
