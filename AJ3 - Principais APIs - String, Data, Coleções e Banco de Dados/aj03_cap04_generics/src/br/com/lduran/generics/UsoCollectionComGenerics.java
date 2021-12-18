package br.com.lduran.generics;

import java.util.ArrayList;

public class UsoCollectionComGenerics
{
	public static void main(String[] args)
	{
		/**
		 * Declaramos a Collection com o modificador <>. Nele colocamos o tipo
		 * espec�fico dos objetos no ArrayList
		 */
		ArrayList<String> colecao = new ArrayList<>();
		String s = new String("Teste");

		// O m�todo add(Object) espera por um Objeto
		colecao.add(s);

		// A recupera��o do objeto n�o requer mais downcasting
		String str = colecao.get(0);

		System.out.println(str);
	}
}
