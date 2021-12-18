package br.com.lduran.teste;

import br.com.lduran.exemplos.exceptions.NumeroInvalidoException;
import br.com.lduran.model.Endereco;

public class TesteEnderecoRelancandoErro
{
	public static void main(String[] args) throws NumeroInvalidoException
	{
		Endereco end = new Endereco("Av. Jabaquara", 0);
	}
}
