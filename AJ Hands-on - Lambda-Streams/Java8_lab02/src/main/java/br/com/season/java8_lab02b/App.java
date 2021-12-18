package br.com.season.java8_lab02b;

import java.util.Arrays;
import java.util.List;

public class App
{

	public static void main(String[] args)
	{
		List<String> al = Arrays.asList("aa", "aaa", "b", "cc", "ccc", "ddd", "a");

		// INSERT CODE HERE System.out.println(count);
		int count = (int) al.stream().filter(item -> item.startsWith("a")).count();
		System.out.println(count);
	}
}
