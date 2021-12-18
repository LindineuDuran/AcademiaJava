
public class TesteAnd
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int i = 0;
		int j = 4;
		
		boolean a = i != 0 && j++ > 2;
		System.out.println("Resultado com && = " + a);
		System.out.println("&& > i:" + i + " j:" + j);
		
		boolean b = i != 0 & j++ > 2;
		System.out.println("Resultado com & = " + b);
		System.out.println("& > i:" + i + " j:" + j);		
	}

}
