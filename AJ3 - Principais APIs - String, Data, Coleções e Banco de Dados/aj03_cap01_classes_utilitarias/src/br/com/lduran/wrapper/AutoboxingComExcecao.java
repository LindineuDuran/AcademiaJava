package br.com.lduran.wrapper;

public class AutoboxingComExcecao
{
	static Integer x;

	static void geraExcecao(int z)
	{
		int z2 = 5;
		System.out.println(z2 - z);
	}

	public static void main(String[] args)
	{
		geraExcecao(x);
	}
}
