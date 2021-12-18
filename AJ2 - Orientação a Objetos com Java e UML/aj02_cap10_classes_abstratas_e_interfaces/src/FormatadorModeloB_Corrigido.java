public class FormatadorModeloB_Corrigido extends FormatadorReciboMetodoAbstrato
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
	
	public String gerarRecibo(String nomeCliente, double valor, String data, String motivo)
	{
		return "Nós da " + super.getNomeEmpresa() + " recebemos de " + nomeCliente + " em " + data + " o valor de R$ " + valor + " referente a " + motivo;
	}
}