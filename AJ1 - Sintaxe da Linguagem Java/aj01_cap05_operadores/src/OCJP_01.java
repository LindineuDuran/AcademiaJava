public class OCJP_01
{
	public static void main(String[] args)
	{
		boolean c = false;
		String str = (c = !c) ? (c = !c) ? "Hello" : "hello" : (c = !c) ? "wolrd" : "World";
		System.out.println(str);
	}
}
