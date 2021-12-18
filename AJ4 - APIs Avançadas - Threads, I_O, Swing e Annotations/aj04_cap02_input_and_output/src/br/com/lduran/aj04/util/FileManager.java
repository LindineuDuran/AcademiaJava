package br.com.lduran.aj04.util;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.FileTime;

public class FileManager
{
	public static void printProperties(String fileName) throws IOException
	{
		Path p = Paths.get(fileName);
		System.out.println("=====================================================================");

		if (Files.exists(p))
		{
			FileManager.printCommonProperties(p);

			if (Files.isDirectory(p))
			{
				FileManager.printDirectoryProperties(p);
			}
			else if (Files.isRegularFile(p))
			{
				FileManager.printFileProperties(p);
			}

			System.out.println("=====================================================================");
		}
		else
		{
			System.out.println("O arquivo " + fileName + " não existe!");
		}
	}

	private static void printCommonProperties(Path p)
	{
		System.out.println("PATH ----------------- " + p.toAbsolutePath());
		String permissoes = "PERMISSÕES ----------- ";
		permissoes += Files.isReadable(p) ? "Leitura " : "";
		permissoes += Files.isWritable(p) ? " Escrita " : "";
		System.out.println(permissoes);
	}

	private static void printDirectoryProperties(Path p) throws IOException
	{
		System.out.println("Conteúdo deste diretório");

		for (Path path : Files.newDirectoryStream(p))
		{
			System.out.println(path.getFileName());
		}
	}

	private static void printFileProperties(Path p) throws IOException
	{
		FileTime data = Files.getLastModifiedTime(p);
		System.out.println("Última modificação -- " + data);

		long tamanho = Files.size(p);
		System.out.println("Tamanho ------------ " + tamanho + " bytes");
	}
}
