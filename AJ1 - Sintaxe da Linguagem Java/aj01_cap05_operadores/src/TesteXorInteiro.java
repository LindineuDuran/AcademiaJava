
public class TesteXorInteiro
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int i = 4;
		int j = 5;
		
		System.out.println("i = " + i + " = " + Integer.toBinaryString(i));
		System.out.println("j = " + j + " = " + Integer.toBinaryString(j));
		System.out.println("i ^ j = " + Integer.toBinaryString(i ^ j) + " = " + (i ^ j));
	}

}
