package br.com.lduran.aj04.testes;

import java.io.IOException;

import br.com.lduran.aj04.util.FileManager;

public class TestePath
{
	public static void main(String[] args)
	{
		String nomeArquivo = args[0];

		try
		{
			FileManager.printProperties(nomeArquivo);
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
