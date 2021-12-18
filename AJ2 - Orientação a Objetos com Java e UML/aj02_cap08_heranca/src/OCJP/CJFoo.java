package OCJP;

class Qualquer
{
	int a;
	
	Qualquer(int a)
	{
		this.a = a;
	}
	
	void setA(int a)
	{
		this.a = a;
	}
	
	public String toString()
	{
		return "" + a;
	}
}

public class CJFoo
{
	public static void main(String[] args)
	{
		Qualquer d1 = new Qualquer(1);
		Qualquer d2 = new Qualquer(2);
		amethod(d1, d2);
		System.out.println("d1 is :" + d1 + " / d2 is : " +d2);
	}
	
	static void amethod(Qualquer p1, Qualquer p2)
	{
		p1.setA(100);
		p2 = p1;
	}
}
