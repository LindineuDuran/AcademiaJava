package OCJP;

public class FinalArray
{
	public static void main(String[] args)
	{
		final int[] primeNumbers = {1,2,3,5};
		primeNumbers[3] = 7;
		
		for (int i = 0; i < primeNumbers.length; i++)
		{
			System.out.println(primeNumbers[i]+", ");
		}
	}
}
