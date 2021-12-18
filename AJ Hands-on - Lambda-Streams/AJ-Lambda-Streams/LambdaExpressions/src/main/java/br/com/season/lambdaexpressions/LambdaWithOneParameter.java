package br.com.season.lambdaexpressions;

public class LambdaWithOneParameter {

	public static void main(String[] args) {
		interfaceFuncional2 resultado = (num) -> num + 5;
		System.out.println(resultado.somaNumero(3));
	}
}

@FunctionalInterface
interface interfaceFuncional2 {

	// Metodo que recebe um parametro
	public int somaNumero(int numero);
}
