//The type FormatadorModeloB must implement the inherited abstract method FormatadorReciboMetodoAbstrato.gerarRecibo(String, double, String, String)
public class FormatadorModeloB extends FormatadorReciboMetodoAbstrato
{
	private String simboloMoeda;

	/**
	 * @return the simboloMoeda
	 */
	public String getSimboloMoeda()
	{
		return simboloMoeda;
	}

	/**
	 * @param simboloMoeda the simboloMoeda to set
	 */
	public void setSimboloMoeda(String simboloMoeda)
	{
		this.simboloMoeda = simboloMoeda;
	}	
}
