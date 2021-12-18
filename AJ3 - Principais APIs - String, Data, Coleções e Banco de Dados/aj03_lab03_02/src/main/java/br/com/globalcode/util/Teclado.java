/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
package br.com.globalcode.util;

import java.util.Scanner;

public class Teclado {

	public static String le() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}
