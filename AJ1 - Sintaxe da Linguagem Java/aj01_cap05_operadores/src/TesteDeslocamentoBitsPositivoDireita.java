public class TesteDeslocamentoBitsPositivoDireita
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("REGRA - a cada deslocamento: (número)/2");

		int numero = 16;
		System.out.print(Integer.toBinaryString(numero));
		System.out.println(" = " + numero);

		int resultado = numero >>> 1;
		System.out.print(Integer.toBinaryString(resultado));
		System.out.println(" = " + resultado);

		resultado = resultado >>> 1;
		System.out.print(Integer.toBinaryString(resultado));
		System.out.println(" = " + resultado);

		resultado = resultado >>> 1;
		System.out.print(Integer.toBinaryString(resultado));
		System.out.println(" = " + resultado);

		resultado = resultado >>> 1;
		System.out.print(Integer.toBinaryString(resultado));
		System.out.println(" = " + resultado);

		resultado = resultado >>> 1;
		System.out.print(Integer.toBinaryString(resultado));
		System.out.println(" = " + resultado);
	}

}
