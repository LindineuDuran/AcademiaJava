public class CalculadoraRetornoIncorreto
{
	int soma(int i, int j)
	{
		float f = i + j;
		return f; //Type mismatch: cannot convert from float to int
	}
}
