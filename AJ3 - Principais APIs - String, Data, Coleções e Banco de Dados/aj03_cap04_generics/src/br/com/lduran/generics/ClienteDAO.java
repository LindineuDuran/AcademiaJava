package br.com.lduran.generics;

import java.util.Collection;

import br.com.lduran.bean.Cliente;

public class ClienteDAO implements IDataAccessObject<Cliente, Integer>
{

	@Override
	public void save(Cliente e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Cliente e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<Cliente> readAll()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Cliente> readyByPK(Integer key)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
