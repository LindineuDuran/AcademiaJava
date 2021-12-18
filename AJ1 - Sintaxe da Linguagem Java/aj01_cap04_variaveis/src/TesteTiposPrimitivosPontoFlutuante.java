
public class TesteTiposPrimitivosPontoFlutuante
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//podemos utilizar o f ou o F para indicar que o número é float
		float f1 = 10F;
		System.out.println("float f1 = 10F => f1 = " + f1);
		
		float f2 = 10.45454f;
		System.out.println("float f2 = 10.45454f => f2 = " + f2);
		
		//por default todo número é inteiro, por isto indicamos o double com o d
		double d1 = 12565484546d;
		System.out.println("double d1 = 12565484546d => d1 = " + d1);
		
		double d2 = 12565484546.0;
		System.out.println("double d2 = 12565484546.0 => d2 = " + d2);
	}

}
