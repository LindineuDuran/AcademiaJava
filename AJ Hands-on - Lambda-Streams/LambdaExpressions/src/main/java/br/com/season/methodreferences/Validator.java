package br.com.season.methodreferences;

import br.com.season.interfacesfuncionais.Pessoa;

public class Validator {
	public static boolean maiorDeIdade(Pessoa p) {
		return p.getIdade() >= 18;
	}

	public boolean menorDeIdade(Pessoa p) {
		return p.getIdade() < 18;
	}
}
