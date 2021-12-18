package br.com.season.lambdaexpressions;

import java.util.*;

import br.com.season.lambdaexpressions.model.Funcionario;

/**
 * Hello world!
 *
 */
public class ComparatorWithLambda {
	public static void main(String[] args) {
		// Sort tradicional
		Comparator<Funcionario> porNome = new Comparator<Funcionario>() {
			@Override
			public int compare(Funcionario func1, Funcionario func2) {
				return func1.getNome().compareTo(func2.getNome());
			}
		};

		// Sort com lambda
		Comparator<Funcionario> porNomeLambda = (Funcionario f1, Funcionario f2) -> f1.getNome()
				.compareTo(f2.getNome());

		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(new Funcionario(23, "Daniel", 2000.0));
		funcionarios.add(new Funcionario(203, "Rafael", 1000.0));
		funcionarios.add(new Funcionario(47, "André", 900.0));
		funcionarios.add(new Funcionario(56, "Marcelo", 1500.0));

		System.out.println("Lista inicial.");
		funcionarios.forEach(System.out::println);

		// Sort tradicional
		Collections.sort(funcionarios, porNome);
		System.out.println("\nSort Tradicional por nome");
		funcionarios.forEach(System.out::println);

		// Sort tradicional
		Collections.sort(funcionarios, porNomeLambda);
		System.out.println("\nSort Lambda por nome");
		funcionarios.forEach(System.out::println);

		Comparator<Funcionario> porIdLambda = (Funcionario f1, Funcionario f2) -> f1.getId() - f2.getId();
		funcionarios.sort(porIdLambda);

		System.out.println("\nSort Lambda por id");
		funcionarios.forEach(System.out::println);

	}
}
