package br.com.lduran.testes;

import java.util.*;

import br.com.lduran.beans.Pessoa;

public class TestePessoa
{
	public static void main(String[] args)
	{
		// Criamos várias instâncias da classe Pessoa
		Pessoa p1 = new Pessoa("João Silva", 123, "20/05/1965");
		Pessoa p2 = new Pessoa("Joana Soares", 1, "28/02/1934");
		Pessoa p3 = new Pessoa("Maurício Costa", 1236, "14/07/1977");
		Pessoa p4 = new Pessoa("Carina Salgado", 11111, "01/05/1982");
		Pessoa p5 = new Pessoa("João Silva", 123, "20/05/1965");
		Pessoa p6 = new Pessoa("João Silva", 1234, "20/05/1965");

		Set pessoas = new TreeSet();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		pessoas.add(p5);
		pessoas.add(p6);

		System.out.println("----------------PESSOAS----------------");
		Iterator pessoasIiterator = pessoas.iterator();
		while (pessoasIiterator.hasNext())
		{
			System.out.println(pessoasIiterator.next());
		}
	}
}
