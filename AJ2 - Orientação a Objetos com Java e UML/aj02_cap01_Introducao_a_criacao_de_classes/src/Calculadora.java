//Exemplos de Passagens de Parâmetros
public class Calculadora
{
	//a passagem de dois valores do tipo int (ou tipo compatível) é obrigatória
	int soma(int x, int y)
	{
		return x+y;
	}
	
	//a passagem de dois valores do tipo double (ou tipo compatível) é obrigatória
	double multiplicacao(double d1, double d2)
	{
		double resultado = d1*d2;
		return resultado;
	}
	
	//a passagem de dois valores do tipo int (ou tipo compatível) é obrigatória
	boolean maior(int num1, int num2)
	{
		if (num1 > num2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//a passagem de um parâmetro do tipo String é obrigatória
	void print(String texto)
	{
		System.out.println("Texto: " + texto);
	}
}
