public class TestePassagemPrimitivos
{
	public static void main(String[] args)
	{
		int num1 = 4;
		int num2 = 2;
		
		CalculadoraMaluca calculadora = new CalculadoraMaluca();
		System.out.println("O valor de num1 antes do método multiplica: " + num1);
		System.out.println("O valor de num2 antes do método multiplica: " + num2);
		
		//o método multiplica atribui zero aos dois parâmetros recebidos
		calculadora.multiplicaValores(num1, num2);
		System.out.println("O valor de num1 após o método multiplica: " + num1);
		System.out.println("O valor de num2 após o método multiplica: " + num2);
	}
}
