package br.com.lduran.aj04.exemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import br.com.lduran.aj04.util.Teclado;

public class ExemploLeituraLinhasScanner
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Digite o nome do arquivo: ");
			String nomeArquivo = Teclado.le();

			File arquivo = new File(nomeArquivo);
			Scanner sc = new Scanner(arquivo);
			sc.useDelimiter(System.getProperty("line.separator"));
			while (sc.hasNext())
			{
				System.out.println(sc.next());
			}

			sc.close();
		}
		catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
	}
}
