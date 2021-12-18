package br.com.season.java8_lab02b.solution;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<String> al = Arrays.asList("aa", "aaa", "b", "cc", "ccc", "ddd", "a");

		// INSERT CODE HERE System.out.println(count);
		long count = al.stream().filter((str) -> str.compareTo("c") < 0).count();

		System.out.println(count);
	}
}
