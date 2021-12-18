package br.com.lduran.testes;

import java.util.*;

import br.com.lduran.beans.Pessoa;

public class TesteTreeMap
{
	public static void main(String[] args)
	{
		Pessoa p2 = new Pessoa("Armando Silva", 22222L, "11/12/1987");
		Pessoa p1 = new Pessoa("Marcio Oliveira", 11111L, "04/10/1970");
		Pessoa p3 = new Pessoa("Fernanda Santos", 33333L, "09/05/1964");
		Pessoa p4 = new Pessoa("Armando Silva", 22222L, "11/12/1987");

		Map pessoas = new TreeMap();
		pessoas.put(p2.getRg(), p2);
		pessoas.put(p1.getRg(), p1);
		pessoas.put(p3.getRg(), p3);
		pessoas.put(p4.getRg(), p4);

		imprimeMap(pessoas);
	}

	private static void imprimeMap(Map map)
	{
		Set chaves = map.keySet();
		Iterator it = chaves.iterator();

		// através do iterator it vamos navegar no Set chaves
		while (it.hasNext())
		{
			// recuperando as chaves armazenadas no Set para então obter o valor associado
			Long chave = (Long) it.next();

			System.out.println("[Chave]: " + chave);
			System.out.println(map.get(chave) + "\n");

		}
	}
}
