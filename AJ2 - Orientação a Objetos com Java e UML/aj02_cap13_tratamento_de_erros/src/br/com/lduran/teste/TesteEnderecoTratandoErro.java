package br.com.lduran.teste;

import br.com.lduran.model.Endereco;

public class TesteEnderecoTratandoErro
{
	public static void main(String[] args)
	{
		try
		{
			Endereco end = new Endereco("Av. Jabaquara", 0);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
