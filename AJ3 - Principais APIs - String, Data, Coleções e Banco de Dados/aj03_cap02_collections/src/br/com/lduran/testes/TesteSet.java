package br.com.lduran.testes;

import java.util.*;

public class TesteSet
{
	public static void main(String[] args)
	{
		Set nomes = new HashSet();
		nomes.add("João");
		nomes.add("Maria");
		nomes.add("Ana Paula");
		nomes.add("Amanda");
		nomes.add("João");

		Iterator iterator = nomes.iterator();

		int i = 0;
		System.out.println("Lista dos Nomes: \n");
		while (iterator.hasNext())
		{
			String nome = (String) iterator.next();
			System.out.println("Nome [" + i++ + "] " + nome);
		}
	}
}
