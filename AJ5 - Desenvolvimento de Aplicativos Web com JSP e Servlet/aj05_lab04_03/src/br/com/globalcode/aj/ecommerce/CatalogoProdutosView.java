package br.com.globalcode.aj.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import br.com.globalcode.aj.dao.ProdutoDAO;
import br.com.globalcode.aj.dao.ProdutoDB;
import br.com.globalcode.beans.Produto;
import br.com.globalcode.util.GlobalcodeException;

public class CatalogoProdutosView extends HttpServlet
{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		// Obtencao do canal de envio de dados para o cliente
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Catalogo Produtos - Academia do Java</title>");
		out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
		out.println("<link href= 'aj.css' rel='stylesheet' type='text/css'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<H3>Catalogo de produtos </H3>");
		// Inicio da tabela de produtos
		out.println("<TABLE width = '700' border='0'>");

		// Linha de titulo
		out.println("<TR width = '%100' class='tituloCampo'>");
		out.println("<TD width = '%20'>Imagem</TD>");
		out.println("<TD width = '%10' >Nome</TD>");
		out.println("<TD width = '%10' >Codigo</TD>");
		out.println("<TD width = '%10'  >Descri&ccedil;&atilde;o</TD>");
		out.println("<TD width = '%10' >Pre&ccedil;o</TD>");
		out.println("<TD width = '%20' colspan = '2'>Comprar</TD>");
		out.println("</TR>");

		// -------------------------------------------------------------------
		// Insira a partir daqui o codigo pedido no laboratorio:
		// -------------------------------------------------------------------
		ProdutoDAO dao = new ProdutoDB();
		try
		{
			List<Produto> lstProd = dao.getCatalogoProdutos();
			for (Produto prod : lstProd)
			{
				out.println("<TR width = '%100'>");
				out.println("<TD width = '%20'><img src='imagem/" + prod.getImage() + "' /></TD>");
				out.println("<TD width = '%10'  class='gridCampo'>" + prod.getCodigo() + "</TD>");
				out.println("<TD width = '%10' class='gridCampo'>tv29philips</TD>");
				out.println("<TD width = '%10'  class='gridCampo'>" + prod.getDescricao() + "</TD>");
				out.println("<TD width = '%10' class='gridCampo'>" + prod.getPreco() + "</TD>");
				out.println("<TD width = '%20' colspan = '2'><A HREF= 'adicionarProdutoCarrinho?idProduto=" + prod.getCodigo() + "' ><IMG SRC = 'imagem/carrinho.gif'/></A></TD>");
				out.println("</TR>");
				// final da tabela de produtos
			}
		}
		catch (GlobalcodeException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("</TABLE>");
		out.println("</body>");
		out.println("</html>");
	}
}