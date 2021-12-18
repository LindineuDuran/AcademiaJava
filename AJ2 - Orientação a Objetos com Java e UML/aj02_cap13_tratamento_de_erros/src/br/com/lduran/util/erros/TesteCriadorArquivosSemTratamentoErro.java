package br.com.lduran.util.erros;

import br.com.lduran.util.CriadorArquivos;

public class TesteCriadorArquivosSemTratamentoErro
{
	public static void main(String[] args)
	{
		CriadorArquivos ca = new CriadorArquivos();
		ca.criarArquivos("teste.txt"); // Unhandled exception type IOException.
										// Add throws declaration or surround with try/catch
	}
}
