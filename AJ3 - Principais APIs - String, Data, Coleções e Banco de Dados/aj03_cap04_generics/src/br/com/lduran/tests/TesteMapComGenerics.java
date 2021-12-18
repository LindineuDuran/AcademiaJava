package br.com.lduran.tests;

import java.util.HashMap;
import java.util.Map;

import br.com.lduran.bean.Pessoa;

public class TesteMapComGenerics
{
	public static void main(String[] args)
	{
		Map<String, Pessoa> mapPessoas = new HashMap<>();

		String rg1 = "6.123.455";
		mapPessoas.put(rg1, new Pessoa("Maria", rg1, "10/10/2001"));

		String rg2 = "8.467.482";
		mapPessoas.put(rg2, new Pessoa("Marcos", rg2, "10/12/2001"));

		for (String chave : mapPessoas.keySet())
		{
			Pessoa p = mapPessoas.get(chave);
			System.out.println(p.getNome());
		}
	}
}
