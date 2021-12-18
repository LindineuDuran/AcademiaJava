package br.com.globalcode.exemplos;

import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class ExemploFiltros
{

	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		String nomeDiretorio = sc.nextLine();// args[0];
		String extensao = sc.nextLine();// args[1];
		Path diretorio = Paths.get(nomeDiretorio);
		if (Files.isDirectory(diretorio))
		{
			// Gera uma lista de arquivos com a extensão desejada
			try (DirectoryStream<Path> arquivos = Files.newDirectoryStream(diretorio, "*." + extensao))
			{
				System.out.println("Lista de arquivos com a extensao :" + extensao);
				for (Path arquivo : arquivos)
				{
					System.out.println(arquivo.getFileName());
				}
			} // try-with-resources
		}
		else
		{
			System.out.println("Nao é um diretorio");
		}
	}
}