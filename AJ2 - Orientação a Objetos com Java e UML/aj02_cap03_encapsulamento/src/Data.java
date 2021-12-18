

/**
 * Class Data
 */
public class Data
{
	// Fields
	private int dia;
	private int mes;
	private int ano;
	
	public int getDia()
	{
		return dia;
	}

	public void setDia(int dia)
	{
		this.dia = dia;
	}

	public int getMes()
	{
		return mes;
	}

	public void setMes(int mes)
	{
		this.mes = mes;
	}

	public int getAno()
	{
		return ano;
	}

	public void setAno(int ano)
	{
		this.ano = ano;
	}

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
