public class GalaoDeCombustivel implements Inflamavel
{
	private String nomeCombustivel;
	private double densidade; // em g/cm3
	private int temperaturaDeTransporte;
	
	/**
	 * @param nomeCombustivel
	 * @param densidade
	 * @param temperaturaDeTransporte
	 */
	public GalaoDeCombustivel(String nomeCombustivel, double densidade, int temperaturaDeTransporte)
	{
		super();
		this.nomeCombustivel = nomeCombustivel;
		this.densidade = densidade;
		this.temperaturaDeTransporte = temperaturaDeTransporte;
	}

	/**
	 * @return the nomeCombustivel
	 */
	public String getNomeCombustivel()
	{
		return nomeCombustivel;
	}

	/**
	 * @param nomeCombustivel the nomeCombustivel to set
	 */
	public void setNomeCombustivel(String nomeCombustivel)
	{
		this.nomeCombustivel = nomeCombustivel;
	}

	/**
	 * @return the densidade
	 */
	public double getDensidade()
	{
		return densidade;
	}

	/**
	 * @param densidade the densidade to set
	 */
	public void setDensidade(double densidade)
	{
		this.densidade = densidade;
	}

	/**
	 * @return the temperaturaDeTransporte
	 */
	public int getTemperaturaDeTransporte()
	{
		return temperaturaDeTransporte;
	}

	/**
	 * @param temperaturaDeTransporte the temperaturaDeTransporte to set
	 */
	public void setTemperaturaDeTransporte(int temperaturaDeTransporte)
	{
		this.temperaturaDeTransporte = temperaturaDeTransporte;
	}

	@Override
	public double getVolume()
	{
		return 3785; //1 galão = 3.785L
	}

	@Override
	public double getPeso()
	{
		double pesoGramas = getVolume() * densidade;
		return pesoGramas / 1000;
	}

	@Override
	public int getEmpilhamentoMaximo()
	{
		return 3;
	}

	@Override
	public int getTemperaturaMaxima()
	{
		return (int) (temperaturaDeTransporte * 1.4d);
	}
}
