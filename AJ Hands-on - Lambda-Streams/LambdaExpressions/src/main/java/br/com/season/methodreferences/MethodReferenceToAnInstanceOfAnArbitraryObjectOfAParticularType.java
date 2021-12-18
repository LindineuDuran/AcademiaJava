package br.com.season.methodreferences;

import java.util.Arrays;

public class MethodReferenceToAnInstanceOfAnArbitraryObjectOfAParticularType {

	public static void main(String[] args) {
		String[] stringArray = { "Ana", "Eliane", "Juliana", "Elisa", "Renata", "Andrea" };

		Arrays.sort(stringArray, String::compareToIgnoreCase);

		for (String nome : stringArray) {
			System.out.println(nome);
		}
	}
}
