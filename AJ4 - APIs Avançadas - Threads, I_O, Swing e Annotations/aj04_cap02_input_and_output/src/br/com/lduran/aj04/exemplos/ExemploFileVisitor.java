package br.com.lduran.aj04.exemplos;

import java.io.IOException;
import java.nio.file.*;

import br.com.lduran.aj04.util.NavegadorArquivos;

public class ExemploFileVisitor
{

	public static void main(String[] args) throws IOException
	{
		Path path = Paths.get(".");
		NavegadorArquivos visitor = new NavegadorArquivos();
		Files.walkFileTree(path, visitor);
	}

}
