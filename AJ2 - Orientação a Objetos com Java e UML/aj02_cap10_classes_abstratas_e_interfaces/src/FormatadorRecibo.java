public abstract class FormatadorRecibo
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
	 * @param nomeEmpresa the nomeEmpresa to set
	 */
	public void setNomeEmpresa(String nomeEmpresa)
	{
		this.nomeEmpresa = nomeEmpresa;
	}
	
	public String gerarRecibo(String nomeCliente, double valor, String data, String motivo)
	{
		return "método em construção...";
	}
}
