package br.com.lduran.testes;

import br.com.lduran.beans.Pessoa;

public class TesteHashCode
{
	public static void main(String[] args)
	{
		Pessoa p1 = new Pessoa("Marcio Oliveira", 1192030021L, "04/10/1970");
		Pessoa p2 = new Pessoa("Armando Silva", 321654987L, "11/12/1987");
		Pessoa p3 = new Pessoa("Marcio Oliveira", 1192030021L, "04/10/1970");
		Pessoa p4 = new Pessoa("", 1192030021L, "04/10/1970");

		System.out.println("Código Hash de p1: " + p1.hashCode());
		System.out.println("Código Hash de p2: " + p2.hashCode());
		System.out.println("Código Hash de p3: " + p3.hashCode());
		System.out.println("Código Hash de p4: " + p4.hashCode());

		System.out.println("p1 equals p2: " + p1.equals(p2));
		System.out.println("p2 equals p3: " + p2.equals(p3));
		System.out.println("p3 equals p4: " + p3.equals(p4));
		System.out.println("p4 equals p1: " + p4.equals(p1));
		System.out.println("p3 equals p1: " + p3.equals(p1));
	}
}
