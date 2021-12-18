/**
 * Class Data
 */
public class Data
{
	// Fields
	public int dia;
	public int mes;
	public int ano;
	
	boolean isAnoBissexto()
	{
		if (((ano % 4 == 0) && !(ano % 100 == 0)) || (ano % 400 == 0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	void imprime()
	{
		System.out.println(dia + "/" + mes + "/" + ano);
	}
}
