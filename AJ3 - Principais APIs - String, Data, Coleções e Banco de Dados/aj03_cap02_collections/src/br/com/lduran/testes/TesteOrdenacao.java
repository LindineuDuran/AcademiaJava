package br.com.lduran.testes;

import java.util.*;

import br.com.lduran.beans.Cliente;
import br.com.lduran.util.ComparadorClientesId;

public class TesteOrdenacao
{
	public static void main(String[] args)
	{
		int[] elementos =
		{ 1, 5, 7, 4, 9, 6, 10, 8, 2, 3 };
		Arrays.sort(elementos);

		System.out.println("Array ordenado:");
		System.out.println(Arrays.toString(elementos));

		List clientes = new ArrayList();
		clientes.add(new Cliente(1, "Cliente 01", 205));
		clientes.add(new Cliente(3, "Cliente 02", 89));
		clientes.add(new Cliente(1, "Cliente 03", 20));
		clientes.add(new Cliente(2, "Globalcode", 43));

		ComparadorClientesId compId = new ComparadorClientesId();
		Collections.sort(clientes, compId);

		System.out.println("Lista ordenada:");
		for (int i = 0; i < clientes.size(); i++)
		{
			System.out.println(clientes.get(i));
		}
	}
}
