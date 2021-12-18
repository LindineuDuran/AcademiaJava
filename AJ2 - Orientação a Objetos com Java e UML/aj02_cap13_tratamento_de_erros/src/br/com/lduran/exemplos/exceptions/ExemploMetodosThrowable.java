package br.com.lduran.exemplos.exceptions;

public class ExemploMetodosThrowable
{
	public static void main(String[] args)
	{
		int i = 23;
		int j = 0;

		try
		{
			double res = i / j;

			System.out.println(i + " / " + j + " = " + res);
		}
		catch (ArithmeticException e)
		{
			System.out.println("---------- Tratamento do Erro ----------");
			System.out.println("Mensagem de erro para o usuário:");
			System.out.println("Divisão inválida! " + e.getMessage());
			System.out.println("\nSTACK TRACE:");
			e.printStackTrace();
			System.out.println("----------------------------------------");
		}
	}
}
