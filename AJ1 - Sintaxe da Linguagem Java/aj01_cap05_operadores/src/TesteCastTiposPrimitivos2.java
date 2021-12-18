public class TesteCastTiposPrimitivos2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		byte b = -127;
		int inteiro = 12;
		char caractere = 'f';
		long numeroLong = 901;
		float numeroFloat = 990.99f;
		double numeroDouble = 90.98;
		
		System.out.println("byte = " + b);
		System.out.println("caractere = " + caractere);
		System.out.println("inteiro = " + inteiro);
		System.out.println("numeroLong = " + numeroLong);
		System.out.println("numeroFloat = " + numeroFloat);
		System.out.println("numeroDouble = " + numeroDouble);
		
		//upcasting - casting implícito (char para int)
		inteiro = caractere;
		System.out.println("caractere 'f' sendo visto como inteiro = " + inteiro);
		
		//byte para int
		inteiro = b;
		System.out.println("byte -127 sendo visto como inteiro = " + inteiro);
		
		//downcasting - casting tem que ser explícito (float para int)
		inteiro = (int) numeroFloat;
		System.out.println("float 990.99f sendo visto como inteiro = " + inteiro);
		
		//downcasting - casting tem que ser explícito (int para byte)
		b = (byte) inteiro;
		System.out.println("inteiro " + inteiro + " sendo visto como byte = " + b);
	}

}
