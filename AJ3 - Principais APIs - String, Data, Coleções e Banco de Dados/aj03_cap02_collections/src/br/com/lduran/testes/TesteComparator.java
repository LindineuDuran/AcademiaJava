package br.com.lduran.testes;

import java.util.*;

import br.com.lduran.beans.Cliente;
import br.com.lduran.util.ComparadorClientesId;
import br.com.lduran.util.ComparadorClientesQtdPedidos;

public class TesteComparator
{
	public static void main(String[] args)
	{
		Cliente cl1 = new Cliente(1, "Cliente 01", 205);
		Cliente cl2 = new Cliente(2, "Globalcode", 43);
		Cliente cl3 = new Cliente(3, "Cliente 02", 89);
		Cliente cl4 = new Cliente(1, "Cliente 03", 20);

		ComparadorClientesQtdPedidos compQtd = new ComparadorClientesQtdPedidos();

		Set ts1 = new TreeSet(compQtd);
		ts1.add(cl1);
		ts1.add(cl2);
		ts1.add(cl3);
		ts1.add(cl4);

		Iterator it1 = ts1.iterator();
		System.out.println("\nUtilizando ComparadorClientesQtdPedidos");
		while (it1.hasNext())
		{
			System.out.println(it1.next());
		}

		ComparadorClientesId compId = new ComparadorClientesId();

		Set ts2 = new TreeSet(compId);
		ts2.addAll(ts1);

		Iterator it2 = ts2.iterator();
		System.out.println("\nUtilizando ComparadorClientesId");
		while (it2.hasNext())
		{
			System.out.println(it2.next());
		}
	}
}
