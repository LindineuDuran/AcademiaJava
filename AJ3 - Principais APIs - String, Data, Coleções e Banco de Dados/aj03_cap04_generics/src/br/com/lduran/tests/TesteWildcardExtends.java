package br.com.lduran.tests;

import java.io.Serializable;
import java.util.*;

import br.com.lduran.bean.Cliente;
import br.com.lduran.bean.ClienteSerialize;

public class TesteWildcardExtends
{
	public static void main(String[] args)
	{
		List<String> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		List<Cliente> l3 = new ArrayList<>();
		List<ClienteSerialize> l4 = new ArrayList<>();

		imprimir(l1);
		imprimir(l2);
		imprimir(l3); // Cliente não implementa Serializable
		imprimir(l4);
	}

	private static void imprimir(Collection<? extends Serializable> colecao)
	{
		for (Serializable obj : colecao)
		{
			System.out.println(obj);
		}
	}
}
