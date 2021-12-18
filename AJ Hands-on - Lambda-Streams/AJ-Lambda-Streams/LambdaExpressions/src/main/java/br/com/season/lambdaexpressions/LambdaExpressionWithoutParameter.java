package br.com.season.lambdaexpressions;

public class LambdaExpressionWithoutParameter {

	public static void main(String[] args) {

		interfaceFuncional mensagem = () -> {
			return "Olá Turma!";
		};

		System.out.println(mensagem.olaMundo());
	}
}

@FunctionalInterface
interface interfaceFuncional {

	// metodo sem parametros
	public String olaMundo();
}
