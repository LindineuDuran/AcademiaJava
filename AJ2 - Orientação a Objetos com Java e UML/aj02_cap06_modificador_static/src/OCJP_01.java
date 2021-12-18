public class OCJP_01
{
	int version = 5;
	static String name = "Mach";
	
	public static void method()
	{
		System.out.println(name + version); //Cannot make a static reference to the non-static field version
	}
	
	public static void main(String[] args)
	{
		OCJP_01 ocjp_01 = new OCJP_01();
		ocjp_01.method();
	}
}
