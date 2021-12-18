package br.com.lduran.testes;

import java.util.ArrayList;
import java.util.List;

import br.com.lduran.beans.Pessoa;

public class TesteArrayList
{
	public static void main(String[] args)
	{
		// Instancia objetos da classe Pessoa
		Pessoa p1 = new Pessoa("Marcio Oliveira", 1192030021L, "04/10/1970");
		Pessoa p2 = new Pessoa("Armando Silva", 321654987L, "11/12/1987");
		Pessoa p3 = new Pessoa("Marcio Oliveira", 1192030021L, "04/10/1970");

		// Adiciona as pessoas no ArrayList pessoas
		List pessoas = new ArrayList();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);

		imprimeElementos(pessoas);

		// Remove elemento do índice 1
		System.out.println("\n===removendo o elemento (1)");
		Pessoa pessoaRemovida = (Pessoa) pessoas.remove(1);
		System.out.println("  Pessoa removida \n\t " + pessoaRemovida);

		imprimeElementos(pessoas);
	}

	private static void imprimeElementos(List pessoas)
	{
		System.out.println("\n===Número de pessoas: " + pessoas.size());

		// imprimindo os elementos do array
		for (int i = 0; i < pessoas.size(); i++)
		{
			System.out.println("  (" + i + ") ==>" + pessoas.get(i));
		}
	}
}
