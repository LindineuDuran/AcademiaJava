package br.com.lduran.tests;

import java.util.*;

public class TesteWildcardSuper
{
	public static void main(String[] args)
	{
		List<Integer> l1 = new ArrayList<>();
		List<Number> l2 = new ArrayList<>();
		List<Object> l3 = new ArrayList<>();
		List<String> l4 = new ArrayList<>(); // String não é super de Integer

		imprimir(l1);
		imprimir(l2);
		imprimir(l3);
		imprimir(l4); // Esta linha não compila
	}

	private static void imprimir(Collection<? super Integer> colecao)
	{
		for (Object obj : colecao)
		{
			System.out.println(obj);
		}

		colecao.add(new Integer(10)); // Aceita a adição somente do tipo específico
	}
}
