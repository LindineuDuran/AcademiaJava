package br.com.lduran.generics;

import java.util.ArrayList;

public class UsoCollectionComGenerics
{
	public static void main(String[] args)
	{
		/**
		 * Declaramos a Collection com o modificador <>. Nele colocamos o tipo
		 * específico dos objetos no ArrayList
		 */
		ArrayList<String> colecao = new ArrayList<>();
		String s = new String("Teste");

		// O método add(Object) espera por um Objeto
		colecao.add(s);

		// A recuperação do objeto não requer mais downcasting
		String str = colecao.get(0);

		System.out.println(str);
	}
}
