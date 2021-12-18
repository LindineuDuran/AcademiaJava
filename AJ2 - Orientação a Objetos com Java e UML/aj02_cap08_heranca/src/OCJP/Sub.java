package OCJP;

class Super
{
	public Super()
	{
		System.out.println("Value = " + getValue());
	}
	
	public int getValue()
	{
		return -1;
	}
}

public class Sub extends Super
{
	private int value = 15;
	
	public int getValue()
	{
		return value;
	}
	
	public static void main(String[] args)
	{
		Sub sub = new Sub();
	}
}
