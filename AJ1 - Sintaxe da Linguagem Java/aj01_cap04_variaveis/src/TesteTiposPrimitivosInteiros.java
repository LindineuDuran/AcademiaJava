
public class TesteTiposPrimitivosInteiros
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int i = 10;
		System.out.println("int i = 10 => i = " + i);
		
		long l1 = 2566L;
		System.out.println("long l1 = 2566L => l1 = " + l1);
		
		long l2 = 2236565656l;
		System.out.println("long l2 = 2236565656l => l2 = " + l2);
		
		//este valor cabe em 1 byte
		byte b1 = (byte) 123;
		System.out.println("byte b1 = (byte) 123 => b1 = " + b1);
		
		//este valor não cabe em 1 byte
		byte b2 = (byte) 123568545;
		System.out.println("byte b2 = (byte) 123568545 => b2 = " + b2);
		
		//este valor cabe em 1 short
		short s1 = (short) 12565;
		System.out.println("short s1 = (short) 12565 => s1 = " + s1);
		
		//este valor não cabe em 1 short
		short s2 = (short) 1231321;
		System.out.println("short s2 = (short) 1231321 => s2 = " +s2);
	}

}
