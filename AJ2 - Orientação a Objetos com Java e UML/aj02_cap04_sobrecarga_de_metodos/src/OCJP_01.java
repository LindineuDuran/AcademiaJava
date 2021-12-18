public class OCJP_01
{
	public static void main(String[] args)
	{
		OCJP_01 ocjp = new OCJP_01();
		short s1 = 123;
		short s2 = 456;
		ocjp.method(s1, s2);
	}
	
	public void method(int... params)
	{
		System.out.println("Inside method with varargs");
	}
	
	public void method( int a, int b)
	{
		System.out.println("Inside method with two int params");
	}
	
	public void method(int a, long b)
	{
		System.out.println("Inside method with int and long params");
	}
	
	public void method(long x, int y)
	{
		System.out.println("Inside method with long and int params");
	}
}
