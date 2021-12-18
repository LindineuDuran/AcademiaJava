
public class TesteOperadoresAritmeticos
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int a = 12345, b = 222222;
		int meuInt;
		long meuLong;
		long meuLongComCast;
		int mod;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		meuInt = a + b;
		System.out.println("a + b (como inteiro) = " + meuInt);
		
		meuInt = b - a;
		System.out.println("b - a (como inteiro) = " + meuInt);
		
		meuInt = a * b;
		System.out.println("a * b (como inteiro) = " + meuInt);
		
		//a*b é promovido a int antes de ser atribuído a meuLong
		meuLong = a * b;
		System.out.println("a * b (armazenados em um long) = " + meuLong);
		
		//Como a variável a é explicitamente convertida para um long,
		//o resultado do produto torna-se um long
		meuLongComCast = (long) a * b;
		System.out.println("a * b (como long) = " +meuLongComCast);
		
		meuLongComCast = (long) a / b;
		System.out.println("a / b (como long) = " + meuLongComCast);
		
		//operador mod => resto da divisão de 12 por 4
		mod = 12 % 4;
		System.out.println("12 % 4 = " + mod);
		
		//operador mod => resto da divisão de 15 por2
		mod = 15 % 2;
		System.out.println("15 % 2 = " + mod);
	}

}
