
public class OCJP_01
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int y4 = 0;
		while(y4++ < 5)
		{
			switch (y4 % 2)
			{
				default:
					System.out.println("default ");
					break;
					
				case 1:
					System.out.println("1 ");
					break;
			}
		}
	}

}
