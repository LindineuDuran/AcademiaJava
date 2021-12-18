package br.com.lduran.teste;

import java.io.IOException;

import br.com.lduran.util.CriadorArquivos;

public class TesteCriadorArquivosComTratamentoExce��es
{
	public static void main(String[] args)
	{
		try
		{
			CriadorArquivos ca = new CriadorArquivos();
			ca.criarArquivos("teste.txt");
		}
		catch (IOException e)
		{
			System.out.println("---------- Tratamento do Erro ----------");
			System.out.println("N�o foi poss�vel criar o arquivo! " + e.getMessage());
			System.out.println("----------------------------------------");
		}

	}
}
