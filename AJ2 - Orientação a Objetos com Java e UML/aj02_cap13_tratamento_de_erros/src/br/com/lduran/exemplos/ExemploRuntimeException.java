package br.com.lduran.exemplos;

public class ExemploRuntimeException
{
	public static void main(String[] args)
	{
		int i = 23;
		int j = 0;

		double res = i / j;

		System.out.println(i + " / " + j + " = " + res);
	}
}
