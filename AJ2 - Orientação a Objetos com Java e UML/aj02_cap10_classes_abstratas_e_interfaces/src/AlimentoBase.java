public abstract class AlimentoBase
{
	private String nome;
	private int temperatura;
	private double volumeCm3;
	private int pesoGramas;
	
	/**
	 * @param nome
	 * @param temperatura
	 * @param volumeCm3
	 * @param pesoGramas
	 */
	public AlimentoBase(String nome, int temperatura, double volumeCm3, int pesoGramas)
	{
		super();
		this.nome = nome;
		this.temperatura = temperatura;
		this.volumeCm3 = volumeCm3;
		this.pesoGramas = pesoGramas;
	}

	/**
	 * @return the nome
	 */
	public String getNome()
	{
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	/**
	 * @return the temperatura
	 */
	public int getTemperatura()
	{
		return temperatura;
	}

	/**
	 * @param temperatura the temperatura to set
	 */
	public void setTemperatura(int temperatura)
	{
		this.temperatura = temperatura;
	}

	/**
	 * @return the volumeCm3
	 */
	public double getVolumeCm3()
	{
		return volumeCm3;
	}

	/**
	 * @param volumeCm3 the volumeCm3 to set
	 */
	public void setVolumeCm3(double volumeCm3)
	{
		this.volumeCm3 = volumeCm3;
	}

	/**
	 * @return the pesoGramas
	 */
	public int getPesoGramas()
	{
		return pesoGramas;
	}

	/**
	 * @param pesoGramas the pesoGramas to set
	 */
	public void setPesoGramas(int pesoGramas)
	{
		this.pesoGramas = pesoGramas;
	}	
}
