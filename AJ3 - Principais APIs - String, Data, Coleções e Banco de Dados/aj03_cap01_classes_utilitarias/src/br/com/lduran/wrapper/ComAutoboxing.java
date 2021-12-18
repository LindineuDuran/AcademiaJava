package br.com.lduran.wrapper;

public class ComAutoboxing
{
	public static void main(String[] args)
	{
		int i = 10;
		Integer objectI = i;

		if (objectI == 10)
		{
			System.out.println("Objeto igual a 10");
		}
	}
}
