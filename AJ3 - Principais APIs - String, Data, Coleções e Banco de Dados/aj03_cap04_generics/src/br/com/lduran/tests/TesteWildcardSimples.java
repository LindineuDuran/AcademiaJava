package br.com.lduran.tests;

import java.util.*;

public class TesteWildcardSimples
{
	public static void main(String[] args)
	{
		List<String> lista = new ArrayList<>();
		lista.add("Maria");
		lista.add("Carlos");

		imprimir(lista);
	}

	private static void imprimir(Collection<?> colecao)
	{
		for (Object obj : colecao)
		{
			System.out.println(obj);
		}
	}
}
