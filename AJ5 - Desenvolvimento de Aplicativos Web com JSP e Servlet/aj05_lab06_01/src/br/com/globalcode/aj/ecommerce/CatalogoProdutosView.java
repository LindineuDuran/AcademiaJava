package br.com.globalcode.aj.ecommerce;

import br.com.globalcode.beans.Produto;
import br.com.globalcode.util.ComparadorProdutos;
import java.io.*;
import java.util.Collections;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;

public class CatalogoProdutosView extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
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

        String nomeDaLoja = "XPTO Magazine";

        ServletContext ctx = this.getServletContext();
        nomeDaLoja = ctx.getInitParameter("nome-da-loja");

        out.println("<H3>Catalogo de produtos " + nomeDaLoja + "</H3>");
        // Inicio da tabela de produtos
        out.println("<TABLE width = '700' border='0'>");
        //Linha de titulo
        out.println("<TR width = '%100' class='tituloCampo'>");
        out.println("<TD width = '%20'>Imagem</TD>");
        out.println("<TD width = '%10' >Nome</TD>");
        out.println("<TD width = '%10' >Codigo</TD>");
        out.println("<TD width = '%10'  >Descri&ccedil;&atilde;o</TD>");
        out.println("<TD width = '%10' >Pre&ccedil;o</TD>");
        out.println("<TD width = '%20' colspan = '2'>Comprar</TD>");
        out.println("</TR>");

        List<Produto> produtos = null;
        produtos = (List<Produto>) request.getAttribute("catalogo");

        byte criterioOrdenacao = ComparadorProdutos.CRITERIO_ID;
        // -------------------------------------------------------------------
        // Insira a partir daqui o c??digo pedido no laboratorio:
        // -------------------------------------------------------------------
        ServletConfig config = this.getServletConfig();
        String strCriterio = config.getInitParameter("criterio-ordenacao");
        try {
            criterioOrdenacao = Byte.parseByte(strCriterio);
        } catch (NumberFormatException nfe) {
            System.out.println("Criterio de ordenacao invalido " + strCriterio);
            System.out.println("Utilizando o valor default");
        }

        ComparadorProdutos comparador = new ComparadorProdutos(criterioOrdenacao);
        Collections.sort(produtos,comparador);

        for (Produto prod : produtos) {
            out.println("<TR width = '%100'>");
            out.println("<TD width = '%20'> <IMG SRC = 'imagem/" + prod.getImage() + "'/></TD>");
            out.println("<TD width = '%10'  class='gridCampo'>" + prod.getNome() + "</TD>");
            out.println("<TD width = '%10' class='gridCampo'>" + prod.getCodigo() + "</TD>");
            out.println("<TD width = '%10'  class='gridCampo'>" + prod.getDescricao() + "</TD>");
            out.println("<TD width = '%10' class='gridCampo'>" + prod.getPreco() + "</TD>");
            out.println("<TD width = '%20' colspan = '2'><A HREF= 'adicionarProdutoCarrinho?idProduto=" + prod.getId() + "' ><IMG SRC = 'imagem/carrinho.gif'/></A></TD>");
            out.println("</TR>");
        }
        // final da tabela de produtos
        out.println("</TABLE>");
        out.println("</body>");
        out.println("</html>");
    }
}
