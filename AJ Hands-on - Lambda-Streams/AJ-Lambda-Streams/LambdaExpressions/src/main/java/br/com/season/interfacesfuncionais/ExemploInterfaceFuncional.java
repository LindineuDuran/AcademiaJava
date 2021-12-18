package br.com.season.interfacesfuncionais;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ExemploInterfaceFuncional {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("João", 20);
		Pessoa p2 = new Pessoa("Carlos", 19);
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		for (Pessoa pessoa : pessoas) {
			aprovaPessoa(pessoa, (p) -> p.getIdade() > 18);
		}
	}
	public static void aprovaPessoa(Pessoa pes, Predicate<Pessoa> regra) {
		if(regra.test(pes)) {
			System.out.println(pes.getNome() + " foi aprovado.");
		} else {
			System.out.println(pes.getNome() + " foi vetado.");
		}
	}
}
