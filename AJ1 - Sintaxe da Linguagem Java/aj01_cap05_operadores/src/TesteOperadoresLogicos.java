
public class TesteOperadoresLogicos
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int x = 9;
		int y = 0;
		
		boolean a = x > y && x > 0;
		System.out.println("x > y e x > 0 = " + a);
		
		boolean b = y == 0 || x == 0;
		System.out.println("Um dos dois é igual a zero = " + b);
	}

}
