package br.com.season.methodreferences;

import java.util.function.BiFunction;

public class MethodReferenceToAnStaticMethod {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> produto = Multiplicacao::multiplica;
		int prod = produto.apply(8, 10);
		System.out.println("O produto do número é: " + prod);
	}
}

class Multiplicacao {

	public static int multiplica(int a, int b) {
		return a * b;
	}
}
