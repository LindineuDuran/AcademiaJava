/*
 * Globalcode - "The Developers Company"
 *
 * Academia do Java
 *
 */
package br.com.globalcode.aj3.teste;

import java.util.*;

import br.com.globalcode.aj3.beans.Cliente;

public class TesteMap
{
	public static void main(String args[])
	{
		Cliente c1 = new Cliente("Cliente1", "1111", "cpf1");
		Cliente c2 = new Cliente("Cliente2", "2222", "cpf2");
		Cliente c3 = new Cliente("Cliente3", "3333", "cpf3");
		Cliente c4 = new Cliente("Cliente3", "3333", "cpf3");

		Map clientes = new HashMap();

		clientes.put(c1.getCpf(), c1);
		clientes.put(c2.getCpf(), c2);
		clientes.put(c3.getCpf(), c3);
		clientes.put(c4.getCpf(), c4);

		// Imprima o nome de todos os clientes que estao no Map
		imprimeMap(clientes);
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
			String chave = (String) it.next();

			System.out.println("[Chave]: " + chave);
			System.out.println(map.get(chave) + "\n");
		}
	}
}