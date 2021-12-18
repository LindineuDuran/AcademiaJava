public class Endereco
{
	private String rua;
	private int numero;
	
	/**
	 * @param rua
	 * @param numero
	 */
	public Endereco(String rua, int numero)
	{
		this.rua = rua;
		this.numero = numero;
	}

	/**
	 * @return the rua
	 */
	public String getRua()
	{
		return rua;
	}

	/**
	 * @param rua the rua to set
	 */
	public void setRua(String rua)
	{
		this.rua = rua;
	}

	/**
	 * @return the numero
	 */
	public int getNumero()
	{
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero)
	{
		this.numero = numero;
	}
}
