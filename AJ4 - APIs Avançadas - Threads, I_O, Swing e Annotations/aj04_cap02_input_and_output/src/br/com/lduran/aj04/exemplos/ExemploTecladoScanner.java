package br.com.lduran.aj04.exemplos;

import java.io.*;

import br.com.lduran.aj04.util.Teclado;

public class ExemploTecladoScanner
{
	public static void main(String[] args)
	{
		System.out.println("Digite o nome do arquivo:");
		String arquivo = Teclado.le();

		System.out.println("Digite o nome do arquivo:");
		String entrada = Teclado.le();

		// canal de comunicação com o arquivo
		try (BufferedWriter out = new BufferedWriter(new FileWriter(arquivo)))
		{
			// Escreve a string capturada do teclado no arquivo
			out.write(entrada);
			out.flush();

			System.out.println("O valor foi armazenado no arquivo: " + arquivo);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
