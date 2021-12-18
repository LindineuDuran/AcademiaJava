package br.com.lduran.aj04.exemplos;

import java.io.IOException;
import java.nio.file.*;

public class ExemploFiltros
{
	public static void main(String[] args) throws IOException
	{
		String nomeDiretorio = args[0];
		String extensao = args[1];
		Path diretorio = Paths.get(nomeDiretorio);

		if (Files.isDirectory(diretorio))
		{
			// Gera uma lista de arquivos com a extensão desejada
			try (DirectoryStream<Path> arquivos = Files.newDirectoryStream(diretorio, "." + extensao))
			{
				System.out.println("Lista de arquivos com a extensão: " + extensao);
				for (Path arquivo : arquivos)
				{
					System.out.println(arquivo.getFileName());
				}
			}
		}
		else
		{
			System.out.println("Não é um diretório");
		}
	}
}
