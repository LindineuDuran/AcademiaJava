package OCJP;

class Foo
{
	void method()
	{
		System.out.println("Inside foo method!!!");
	}
}

public class Bar extends Foo
{
	static void method() //um método não estático não pode ser sobrescrito por um método estático
	{
		System.out.println("Insidec bar method!!!");
	}
	
	public static void main(String[] args)
	{
		Bar b = new Bar();
	}
}
