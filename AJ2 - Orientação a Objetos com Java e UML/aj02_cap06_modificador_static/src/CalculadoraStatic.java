public class CalculadoraStatic
{
	public static int soma(int a, int b)
	{
		return a + b;
	}
	
	public static int soma(int a, int b, int c)
	{
		int resultado = soma(a, b) + c;
		
		return resultado;
	}
	
	public static float soma(float a, float b)
	{
		return a + b;
	}
	
	public static long soma(int[] numeros)
	{
		long resultado = 0;
		
		for(int i = 0; i < numeros.length; i++)
		{
			resultado += numeros[i];
		}
		
		return resultado;
	}
}
