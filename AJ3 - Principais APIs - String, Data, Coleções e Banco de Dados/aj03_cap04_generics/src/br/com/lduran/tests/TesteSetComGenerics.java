package br.com.lduran.tests;

import java.util.Set;
import java.util.TreeSet;

import br.com.lduran.bean.Pessoa;
import br.com.lduran.generics.ComparadorPessoaPorDataNascimento;

public class TesteSetComGenerics
{
	public static void main(String[] args)
	{
		Set<Pessoa> pessoas1 = new TreeSet<>();

		pessoas1.add(new Pessoa("Maria", "6.123.455", "10/10/2001"));
		pessoas1.add(new Pessoa("Marcos", "8.467.482", "10/12/2001"));

		for (Pessoa p : pessoas1)
		{
			System.out.println(p);
		}

		/**
		 * Resultado de pessoas1
		 *
		 * Pessoa [nome=Marcos, rg=8.467.482, dataNascimento=10/12/2001] Pessoa
		 * [nome=Maria, rg=6.123.455, dataNascimento=10/10/2001]
		 *
		 */
		Set<Pessoa> pessoas2 = new TreeSet<>(new ComparadorPessoaPorDataNascimento());

		pessoas2.add(new Pessoa("Maria", "6.123.455", "10/10/2001"));
		pessoas2.add(new Pessoa("Marcos", "8.467.482", "10/12/2001"));

		for (Pessoa p : pessoas2)
		{
			System.out.println(p);
		}

		/**
		 * Resultado de pessoas2
		 *
		 * Pessoa [nome=Maria, rg=6.123.455, dataNascimento=10/10/2001] Pessoa
		 * [nome=Marcos, rg=8.467.482, dataNascimento=10/12/2001]
		 *
		 */
	}
}
