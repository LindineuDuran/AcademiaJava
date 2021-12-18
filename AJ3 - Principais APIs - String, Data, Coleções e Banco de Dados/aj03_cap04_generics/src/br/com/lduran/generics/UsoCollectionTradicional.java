package br.com.lduran.generics;

import java.util.ArrayList;

public class UsoCollectionTradicional
{
	public static void main(String[] args)
	{
		ArrayList colecao = new ArrayList();
		String s = new String("Teste");

		// O método add(Object) espera por um Objeto
		colecao.add(s);

		// O método get retorna um Objeto, portanto fazemos o downcasting
		String str = (String) colecao.get(0);

		System.out.println(str);
	}
}
