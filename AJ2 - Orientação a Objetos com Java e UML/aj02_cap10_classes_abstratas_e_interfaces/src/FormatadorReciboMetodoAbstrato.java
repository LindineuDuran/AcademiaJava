public abstract class FormatadorReciboMetodoAbstrato
{
	private String nomeEmpresa;

	/**
	 * @return the nomeEmpresa
	 */
	public String getNomeEmpresa()
	{
		return nomeEmpresa;
	}

	/**
	 * @param nomeEmpresa
	 *            the nomeEmpresa to set
	 */
	public void setNomeEmpresa(String nomeEmpresa)
	{
		this.nomeEmpresa = nomeEmpresa;
	}

	public abstract String gerarRecibo(String nomeCliente, double valor, String data, String motivo);
}
