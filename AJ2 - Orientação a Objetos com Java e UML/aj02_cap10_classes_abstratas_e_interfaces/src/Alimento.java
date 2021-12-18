public class Alimento extends AlimentoBase implements Transportavel, Perecivel
{
	private int empilhamentoMaximo;
	private int diasDeValidade;
	
	/**
	 * @param nome
	 * @param temperatura
	 * @param volumeCm3
	 * @param pesoGramas
	 * @param empilhamentoMaximo
	 * @param diasDeValidade
	 */
	public Alimento(String nome, int temperatura, double volumeCm3, int pesoGramas, int empilhamentoMaximo, int diasDeValidade)
	{
		super(nome, temperatura, volumeCm3, pesoGramas);
		this.empilhamentoMaximo = empilhamentoMaximo;
		this.diasDeValidade = diasDeValidade;
	}

	@Override
	public double getVolume()
	{
		return super.getVolumeCm3();
	}

	@Override
	public double getPeso()
	{
		return (double)super.getPesoGramas()/1000;
	}

	/**
	 * @return the empilhamentoMaximo
	 */
	public int getEmpilhamentoMaximo()
	{
		return empilhamentoMaximo;
	}

	/**
	 * @param empilhamentoMaximo the empilhamentoMaximo to set
	 */
	public void setEmpilhamentoMaximo(int empilhamentoMaximo)
	{
		this.empilhamentoMaximo = empilhamentoMaximo;
	}

	/**
	 * @return the diasDeValidade
	 */
	public int getDiasDeValidade()
	{
		return this.diasDeValidade;
	}

	/**
	 * @param diasDeValidade the diasDeValidade to set
	 */
	public void setDiasDeValidade(int diasDeValidade)
	{
		this.diasDeValidade = diasDeValidade;
	}

	@Override
	public int getTemperaturaDeConservacao()
	{
		return super.getTemperatura();
	}
}
