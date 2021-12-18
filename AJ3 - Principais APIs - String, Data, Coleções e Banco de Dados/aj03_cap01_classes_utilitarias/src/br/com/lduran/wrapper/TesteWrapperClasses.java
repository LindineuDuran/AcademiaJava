package br.com.lduran.wrapper;

public class TesteWrapperClasses
{
	public static void main(String[] args)
	{
		// Exemplo de utiliza��o da classe Boolean
		System.out.println("\nExemplo de utiliza��o da classe Boolean:");
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("true");
		System.out.println("b1 = " + b1.booleanValue());
		System.out.println("b2 = " + b2.booleanValue());

		// Exemplo de utiliza��o da classe Integer
		System.out.println("\nExemplo de utiliza��o da classe Integer:");
		Integer i1 = new Integer(12);
		Integer i2 = new Integer("12");
		System.out.println("i1 = " + i1.intValue());
		System.out.println("i2 = " + i2.intValue());
		String binaryString = Integer.toBinaryString(23);
		System.out.println("23 (em n�mero bin�rio) " + binaryString);
		int i3 = Integer.parseInt("123456");

		// Exemplo de utiliza��o da classe Double
		System.out.println("\nExemplo de utiliza��o da classe Double:");
		Double d1 = new Double(45.9);
		Double d2 = new Double(45.5);
		System.out.println("d1 = " + d1.doubleValue());
		System.out.println("d2 = " + d2.doubleValue());

		// Utilizando o m�todo intValue para transformar um double em um int
		System.out.println("23 (em n�mero bin�rio) " + d1.intValue());

		// Exemplo de utiliza��o da classe Character
		System.out.println("\nExemplo de utiliza��o da classe Character:");
		Character c1 = new Character('1');
		System.out.println("c1 = " + c1.charValue());

		Character c2 = '1';
		boolean isDigit = Character.isDigit(c2);
		System.out.println(c2 + "� digito? " + isDigit);

		Character c3 = 'a';
		boolean isLetterOrDigit = Character.isLetterOrDigit(c3);
		System.out.println(c3 + " � digito ou letra? " + isLetterOrDigit);
	}
}
