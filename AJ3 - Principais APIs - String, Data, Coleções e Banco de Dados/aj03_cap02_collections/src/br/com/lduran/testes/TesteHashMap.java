package br.com.lduran.testes;

import java.util.*;

import br.com.lduran.beans.Pessoa;

public class TesteHashMap
{
	public static void main(String[] args)
	{
		Pessoa p1 = new Pessoa("Marcio Oliveira", 11111L, "04/10/1970");
		Pessoa p2 = new Pessoa("Armando Silva", 22222L, "11/12/1987");
		Pessoa p3 = new Pessoa("Fernanda Santos", 33333L, "09/05/1964");
		Pessoa p4 = new Pessoa("Armando Silva", 22222L, "11/12/1987");

		Map pessoas = new HashMap();
		pessoas.put(p1.getRg(), p1);
		pessoas.put(p2.getRg(), p2);
		pessoas.put(p3.getRg(), p3);
		pessoas.put(p4.getRg(), p4);

		imprimeMap(pessoas);

		removeElemento(pessoas, 22222L);

		imprimeMap(pessoas);
	}

	private static void imprimeMap(Map map)
	{
		System.out.println("\n=========Impressão do Map=========\n");

		Set chaves = map.keySet();
		Iterator it = chaves.iterator();

		// através do Iterator it vamos navegar no Set chaves
		while (it.hasNext())
		{
			// recuperando as chaves armazenadas no Set para então obter o valor associado
			Long chave = (Long) it.next();

			System.out.println("[Chave]: " + chave);
			System.out.println(map.get(chave) + "\n");
		}
	}

	private static void removeElemento(Map map, long chave)
	{
		Pessoa valorRemovido = null;

		// verifica se a chave existe no HashMap
		if (map.containsKey(chave))
		{
			System.out.println("\n=====Removendo Elemento do Map=====\n");

			// lembrar de fazer cast de objetos que vem do HashMap
			valorRemovido = (Pessoa) map.remove(chave);

			System.out.println("Valor Removido: " + valorRemovido);
		}
		else
		{
			System.out.println("Chave não encontrada no HashMap");
		}

	}
}
