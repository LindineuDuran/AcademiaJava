/*
 * @author Globalcode
 *
 * TesteRecuperacao.java
 *
 */

package br.com.globalcode.teste;

import java.io.*;

import br.com.globalcode.model.Cliente;

public class TesteRecuperacao
{

	public static void main(String[] args)
	{

		String cpf = "11232404-6";
		String nomeArquivo = "Cliente" + cpf + ".ser";

		try (FileInputStream leitor = new FileInputStream(nomeArquivo);)
		{

			Cliente clienteRecuperado = null;

			/*
			 * Inserir o codigo de leitura a partir deste ponto
			 *
			 */
			ObjectInputStream leitorObjetos = new ObjectInputStream(leitor);
			clienteRecuperado = (Cliente) leitorObjetos.readObject();

			System.out.println("cliente recuperado: " + clienteRecuperado);

		}
		catch (IOException e)
		{
			System.out.println("Erro na operacao de I/O");
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("A classe dos clientes nao foi localizada");
			e.printStackTrace();
		}
	}

}
