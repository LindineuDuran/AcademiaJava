public class Mobilia implements Transportavel
{
	private String tipo;
	private String fabricante;
	private String material;
	private double altura, largura, profundidade;
	private double peso;

	/**
	 * @param tipo
	 * @param fabricante
	 * @param material
	 * @param altura
	 * @param largura
	 * @param profundidade
	 * @param peso
	 */
	public Mobilia(String tipo, String fabricante, String material,
			double altura, double largura, double profundidade, double peso)
	{
		super();
		this.tipo = tipo;
		this.fabricante = fabricante;
		this.material = material;
		this.altura = altura;
		this.largura = largura;
		this.profundidade = profundidade;
		this.peso = peso;
	}

	/**
	 * @return the peso
	 */
	public double getPeso()
	{
		return this.peso;
	}

	/**
	 * @param peso
	 *            the peso to set
	 */
	public void setPeso(double peso)
	{
		this.peso = peso;
	}

	@Override
	public double getVolume()
	{
		double vol = this.altura * this.largura * this.profundidade;
		return vol;
	}

	@Override
	public int getEmpilhamentoMaximo()
	{
		// TODO Auto-generated method stub
		return 2;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo()
	{
		return tipo;
	}

	/**
	 * @param tipo
	 *            the tipo to set
	 */
	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	/**
	 * @return the fabricante
	 */
	public String getFabricante()
	{
		return fabricante;
	}

	/**
	 * @param fabricante
	 *            the fabricante to set
	 */
	public void setFabricante(String fabricante)
	{
		this.fabricante = fabricante;
	}

	/**
	 * @return the material
	 */
	public String getMaterial()
	{
		return material;
	}

	/**
	 * @param material
	 *            the material to set
	 */
	public void setMaterial(String material)
	{
		this.material = material;
	}

	/**
	 * @return the altura
	 */
	public double getAltura()
	{
		return altura;
	}

	/**
	 * @param altura
	 *            the altura to set
	 */
	public void setAltura(double altura)
	{
		this.altura = altura;
	}

	/**
	 * @return the largura
	 */
	public double getLargura()
	{
		return largura;
	}

	/**
	 * @param largura
	 *            the largura to set
	 */
	public void setLargura(double largura)
	{
		this.largura = largura;
	}

	/**
	 * @return the profundidade
	 */
	public double getProfundidade()
	{
		return profundidade;
	}

	/**
	 * @param profundidade
	 *            the profundidade to set
	 */
	public void setProfundidade(double profundidade)
	{
		this.profundidade = profundidade;
	}
}
