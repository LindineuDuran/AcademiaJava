
public class TesteDeslocamentoBitsNegativoDireita
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Sem regras de deslocamento");

		int numero = -17;
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
