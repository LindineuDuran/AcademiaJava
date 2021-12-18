/*
 * ValidaPedido.java
 */
package br.com.globalcode.aj.ecommerce;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import br.com.globalcode.aj.business.ValidadorPedido;

public class ValidaPedido extends HttpServlet
{

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

		ValidadorPedido validador = new ValidadorPedido();
		validador.validarPedido(request);
		List<String> listaDeProblemas = (List<String>) request.getAttribute("problemas");

		String destino = null;

		// ------------------------------------------------------------------------
		// Adicione aqui o código pedido no laboratorio
		// ------------------------------------------------------------------------
		if (listaDeProblemas.size() == 0)
		{
			destino = "/jsp/PedidoView.jsp";
		}
		else
		{
			destino = "/jsp/ListaProblemasPedido.jsp";
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(destino);
		dispatcher.forward(request, response);

	}

}
