package br.com.lduran.aj04.util;

import java.util.Scanner;

public class Teclado
{
	public static String le()
	{
		Scanner sc = new Scanner(System.in);
		String textoLido = sc.nextLine();

		return textoLido;
	}
}
