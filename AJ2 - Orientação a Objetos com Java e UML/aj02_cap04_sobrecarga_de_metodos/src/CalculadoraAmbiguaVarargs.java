public class CalculadoraAmbiguaVarargs
{
	public int soma(byte b1, byte b2)
	{
		System.out.println("Soma de byte");
		return b1+b2;
	}
	
	public long soma(long lg1, long lg2)
	{
		System.out.println("Soma de long");
		return lg1+lg2;
	}
	
	public double soma(double d1, double d2)
	{
		System.out.println("Soma de double");
		return d1+d2;
	}
	
	public int soma(int... params)
	{
		System.out.println("Soma com varargs");
		
		int soma = 0;
		for(int i=0; i < params.length; i++)
		{
			soma += params[i];
		}
		
		return soma;
	}
}
