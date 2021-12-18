package br.com.season.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class IteratingAList {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<String>();

		nomes.add("Daniel");
		nomes.add("José");
		nomes.add("João");
		nomes.add("Maria");
		nomes.add("Antônio");

		nomes.forEach((teste) -> System.out.println(teste));
	}
}
