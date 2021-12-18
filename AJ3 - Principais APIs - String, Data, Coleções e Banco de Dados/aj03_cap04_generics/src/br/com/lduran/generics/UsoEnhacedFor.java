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
		 * Declaramos a vari�vel do for exatamente do mesmo tipo dos elementos da
		 * cole��o, evitando o cast.
		 */
		for (String str : colecao)
		{
			System.out.println(str);
		}
	}
}
