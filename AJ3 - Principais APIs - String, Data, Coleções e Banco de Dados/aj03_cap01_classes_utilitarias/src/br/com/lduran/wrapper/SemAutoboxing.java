package br.com.lduran.wrapper;

public class SemAutoboxing
{
	public static void main(String[] args)
	{
		int i = 10;
		Integer objectI = new Integer(i);

		if (objectI.intValue() == 10)
		{
			System.out.println("Valor do objeto igual a 10");
		}
	}
}
