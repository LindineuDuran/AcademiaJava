package br.com.lduran.util;

import java.io.File;
import java.io.IOException;

public class CriadorArquivos
{
	public void criarArquivos(String name) throws IOException
	{
		/**
		 * Criação de um objeto da classe File representando o arquivo com o nome name
		 */
		File f = new File(name);

		// Tentativa de criar um arquivo em disco
		f.createNewFile();
	}
}
