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
	static void method() //um m�todo n�o est�tico n�o pode ser sobrescrito por um m�todo est�tico
	{
		System.out.println("Insidec bar method!!!");
	}
	
	public static void main(String[] args)
	{
		Bar b = new Bar();
	}
}
