package br.com.lduran.testes;

import java.util.PriorityQueue;
import java.util.Queue;

import br.com.lduran.beans.Cliente;
import br.com.lduran.util.ComparadorClientesQtdPedidos;

public class TestePiorityQueue
{
	public static void main(String[] args)
	{
		ComparadorClientesQtdPedidos comp = new ComparadorClientesQtdPedidos();
		Queue clientes = new PriorityQueue(11, comp);

		clientes.add(new Cliente(1, "Cliente 01", 205));
		clientes.add(new Cliente(2, "Globalcode", 43));
		clientes.add(new Cliente(3, "Cliente 02", 89));
		clientes.add(new Cliente(1, "Cliente 03", 20));

		while (!clientes.isEmpty())
		{
			System.out.println("Processando cliente: ");
			System.out.println(clientes.poll());
		}
	}
}
