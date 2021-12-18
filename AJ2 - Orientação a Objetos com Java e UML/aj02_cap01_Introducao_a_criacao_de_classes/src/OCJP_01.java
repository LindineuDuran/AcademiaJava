public class OCJP_01
{
	int i1 = 25;
	int i2;
	char c = 1;
	boolean b;
	
	public static void main(String[] args)
	{
		OCJP_01 ocjp_01 = new OCJP_01();
		ocjp_01.method();
	}
	
	void method()
	{
		boolean b;
		System.out.println(i2);
		System.out.println(b); //The local variable b may not have been initialized
	}
}
