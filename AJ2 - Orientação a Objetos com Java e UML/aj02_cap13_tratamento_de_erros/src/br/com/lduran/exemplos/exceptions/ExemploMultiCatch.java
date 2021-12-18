package br.com.lduran.exemplos.exceptions;

public class ExemploMultiCatch
{
	public static void main(String[] args)
	{
		try
		{
			String num1 = args[0];
			String num2 = args[1];

			int i = Integer.parseInt(num1);
			int j = Integer.parseInt(num2);

			double res = i / j;

			System.out.println(i + " / " + j + " = " + res);
		}
		catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("---------- Tratamento do Erro ----------");
			System.out.println("Ocorreu o seguinte erro: " + e.getClass().getName());
			System.out.println("Com a seguinte mensagem: " + e.getMessage());
			System.out.println("\nSTACK TRACE:");
			e.printStackTrace();
			System.out.println("----------------------------------------");
		}
		finally
		{
			System.out.println("Passou pelo finally");
		}
	}
}
