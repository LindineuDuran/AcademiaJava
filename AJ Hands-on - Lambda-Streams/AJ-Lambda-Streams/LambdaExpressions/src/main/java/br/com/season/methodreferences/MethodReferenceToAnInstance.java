package br.com.season.methodreferences;

public class MethodReferenceToAnInstance {

	public void meuMetodo() {
		System.out.println("Metodo da Instância do Objeto");
	}

	public static void main(String[] args) {
		MethodReferenceToAnInstance objeto = new MethodReferenceToAnInstance();

		// method reference usando um objeto da classe
		MinhaInterface ref = objeto::meuMetodo;

		// chamando o método da interface funcional
		ref.exibir();
	}
}

@FunctionalInterface
interface MinhaInterface {

	void exibir();
}
