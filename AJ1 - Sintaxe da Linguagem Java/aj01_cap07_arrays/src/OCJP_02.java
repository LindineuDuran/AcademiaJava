
public class OCJP_02
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int[][] arr = new int[4][];
		
		arr[0] = new int[4];
		arr[1] = new int[3];
		arr[2] = new int[2];
		arr[3] = new int[1];
		
		for(int n = 0; n < 4; n++)
		{
			System.out.println(arr[n].length);
		}
	}

}
