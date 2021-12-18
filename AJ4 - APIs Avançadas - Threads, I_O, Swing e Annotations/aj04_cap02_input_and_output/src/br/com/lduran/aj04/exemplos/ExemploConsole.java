package br.com.lduran.aj04.exemplos;

import java.io.Console;

public class ExemploConsole
{

	public static void main(String[] args)
	{
		// Obtendo a referência para o console
		Console console = System.console();

		// Lendo dados via teclado
		System.out.println("Digite seu nome");
		String nome = console.readLine();

		// Escrevendo uma mensagem e lendo dados ao mesmo tempo
		String endereco = console.readLine("%s, digite seu endereço: %n", nome);

		// Lendo uma senha a partir do teclado
		char[] senha = console.readPassword("Digite sua senha%n");

		// Imprimindo os valores lidos
		console.printf("Bem-vindo %s, residente em %s %n", nome, endereco);
		console.printf("Sua senha é: %s %n", new String(senha));
	}

}
