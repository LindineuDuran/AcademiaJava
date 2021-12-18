public class OperadorTernario
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		boolean c = false;
		String str = (c = !c) ? (c = !c) ? "Hello" : "hello" :(c = !c) ? "world" : "World";
		
		System.out.println(str);
	}

}
