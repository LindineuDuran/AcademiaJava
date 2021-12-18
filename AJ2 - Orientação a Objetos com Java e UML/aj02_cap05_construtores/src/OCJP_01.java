public class OCJP_01
{
	{
		System.out.println("Inside instance intializer"); //Primeiro passa por aqui
	}
	
	public OCJP_01(byte b)
	{
		System.out.println("Inside constructor with byte");
	}
	
	public OCJP_01(short s)
	{
		System.out.println("Inside constructor with short");
	}
	
	public OCJP_01(char c)
	{
		System.out.println("Inside constructor with char");
	}
	
	public OCJP_01(int i)
	{
		System.out.println("Inside constructor with int"); //Depois passa por aqui. Por default, valores inteiros são tratados como int
	}
	
	public static void main(String[] args)
	{
		OCJP_01 ocjp_01 = new OCJP_01(2);
	}
}
