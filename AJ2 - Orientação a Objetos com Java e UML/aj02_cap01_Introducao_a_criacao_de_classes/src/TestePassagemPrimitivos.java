public class TestePassagemPrimitivos
{
	public static void main(String[] args)
	{
		int num1 = 4;
		int num2 = 2;
		
		CalculadoraMaluca calculadora = new CalculadoraMaluca();
		System.out.println("O valor de num1 antes do m�todo multiplica: " + num1);
		System.out.println("O valor de num2 antes do m�todo multiplica: " + num2);
		
		//o m�todo multiplica atribui zero aos dois par�metros recebidos
		calculadora.multiplicaValores(num1, num2);
		System.out.println("O valor de num1 ap�s o m�todo multiplica: " + num1);
		System.out.println("O valor de num2 ap�s o m�todo multiplica: " + num2);
	}
}
