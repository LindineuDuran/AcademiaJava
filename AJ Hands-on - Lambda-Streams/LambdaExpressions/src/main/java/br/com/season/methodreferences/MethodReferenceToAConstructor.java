package br.com.season.methodreferences;

public class MethodReferenceToAConstructor {

	public static void main(String[] args) {

		minhaInterface2 ref = Ola::new;
		ref.exibir("Olá Pessoal");
	}
}

interface minhaInterface2 {
	Ola exibir(String msg);
}

class Ola {

	public Ola(String msg) {
		System.out.println(msg);
	}
}
