public class SobrecargaImposs�vel
{
	public int multiplica(int a, int b)
	{
		return a*b;
	}
	
	public long multiplica(int c, int d)
	{
		return c*d;
	}
	
	public void usaMultiplicacao()
	{
		multiplica(100, 350);
	}
}
