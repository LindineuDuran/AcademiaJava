package br.com.lduran.testes;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TesteNavigableMap
{
	public static void main(String[] args)
	{
		int[] chaves =
		{ 1, 5, 7, 4, 9, 6, 10, 8, 2, 3 };

		NavigableMap elementos = new TreeMap();

		for (Integer chave : chaves)
		{
			elementos.put(chave, "elemento" + chave);
		}

		Integer chaveMenor = (Integer) elementos.lowerKey(6);
		System.out.println("primeira chave menor que 6 => " + chaveMenor);

		NavigableMap subConjunto = elementos.subMap(2, true, 5, true);
		System.out.println("Elementos do sub-conjunto");

		for (Object chave : subConjunto.keySet())
		{
			System.out.println("Chave: " + chave + "\tValor: " + subConjunto.get(chave));
		}
	}
}
