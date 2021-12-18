public class Calculadora
{
	public int soma(int a, int b)
	{
		return a+b;		
	}
	
	public int soma(int a, int b, int c)
	{
		int resultado = this.soma(a, b) + c;
		return resultado;
	}
	
	public float soma(float a, float b)
	{
		return a+b;
	}
	
	public long soma(int[] numeros)
	{
		long resultado = 0;
		
		for(int numero: numeros)
		{
			resultado += numero;
		}
		
		return resultado;
	}
}
