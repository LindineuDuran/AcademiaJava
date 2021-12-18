package br.com.lduran.testes;

import br.com.lduran.beans.Pessoa;

public class TesteEquals
{
	public static void main(String[] args)
	{
		Pessoa p1 = new Pessoa("Gabriela", 1112345L, "01/01/1980");
		Pessoa p2 = new Pessoa("Gabriela", 1112345L, "01/01/1980");

		if (p1.equals(p2))
		{
			System.out.println("p1 = p2 utilizando equals");
		}
		else
		{
			System.out.println("p1 é diferente de p2 utilizando comparador equals");
		}
	}
}
