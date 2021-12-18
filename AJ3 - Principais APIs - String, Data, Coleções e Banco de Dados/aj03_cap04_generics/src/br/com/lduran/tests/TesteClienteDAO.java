package br.com.lduran.tests;

import java.util.Collection;

import br.com.lduran.bean.Cliente;
import br.com.lduran.generics.ClienteDAO;
import br.com.lduran.generics.IDataAccessObject;

public class TesteClienteDAO
{
	public static void main(String[] args)
	{
		IDataAccessObject<Cliente, Integer> clienteDAO = new ClienteDAO();
		Collection<Cliente> listagem = clienteDAO.readAll();

		for (Cliente clie : listagem)
		{
			System.out.println(clie);
		}
	}
}
