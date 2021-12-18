package br.com.lduran.generics;

import java.util.ArrayList;

public class UsoEnhacedFor
{
	public static void main(String[] args)
	{
		ArrayList<String> colecao = new ArrayList<>();
		colecao.add("String X");
		colecao.add("String Y");
		colecao.add("String Z");

		/**
		 * Declaramos a variável do for exatamente do mesmo tipo dos elementos da
		 * coleção, evitando o cast.
		 */
		for (String str : colecao)
		{
			System.out.println(str);
		}
	}
}
