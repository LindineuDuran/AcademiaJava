package br.com.lduran.testes;

public class TesteString
{
	public static void main(String[] args)
	{
		String nome0 = "Globalcode";
		char inicial = nome0.charAt(0);
		System.out.println("Inicial = " + inicial);

		String nome1 = "Global";
		String nome2 = "code";
		String nome3 = nome1.concat(nome2);
		System.out.println("\nNome: " + nome3);

		String nome4 = new String("Globalcode");
		int posicao = nome4.indexOf("code");
		System.out.println("\nPosi��o: " + posicao);

		String nome5 = "GLOBALCODE";
		String minusculas = nome5.toLowerCase();
		System.out.println("\n" + nome5);
		System.out.println(minusculas);

		String nome6 = " Globalcode ";
		String semEspaco = nome6.trim();
		System.out.println("\nString com espa�o -" + nome6);
		System.out.println("String sem espa�o - " + semEspaco);
	}
}
