package br.com.lduran.testes;

import java.util.*;

public class TesteComparable
{
	public static void main(String[] args)
	{
		Set nomes = new TreeSet();
		nomes.add("Jo?o");
		nomes.add("Maria");
		nomes.add("Ana Paula");
		nomes.add("Amanda");
		nomes.add("Jo?o");

		Iterator iterator = nomes.iterator();

		int i = 0;
		System.out.println("Lista em ordem alfab?tica dos Nomes: \n");
		while (iterator.hasNext())
		{
			String nome = (String) iterator.next();
			System.out.println("Nome [" + i++ + "] " + nome);
		}
	}
}
