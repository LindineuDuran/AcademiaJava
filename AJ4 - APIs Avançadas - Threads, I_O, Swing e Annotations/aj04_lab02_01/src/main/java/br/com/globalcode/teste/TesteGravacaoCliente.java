/**
 * @author Globalcode
 * TesteGravacaoCliente.java
 */

package br.com.globalcode.teste;

import java.io.*;

import br.com.globalcode.model.Cliente;

public class TesteGravacaoCliente
{

	public static void main(String[] args)
	{

		Cliente cliente1 = new Cliente("Joao da Silva", "11-8558-7447", "11232404-6", 1);
		String nomeArquivo1 = "Cliente" + cliente1.getCpf() + ".ser";

		try (FileOutputStream gravador = new FileOutputStream(nomeArquivo1))
		{

			/*
			 * preencha o codigo de escrita de objeto a partir deste ponto
			 *
			 */
			ObjectOutputStream gravadorObjetos = new ObjectOutputStream(gravador);
			gravadorObjetos.writeObject(cliente1);
			gravadorObjetos.flush();

			System.out.println("Cliente gravado com sucesso!!");
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
