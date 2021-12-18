public abstract class FormatadorReciboErro2
{
	private String nomeEmpresa;
	
	public void setNomeEmpresa(String nomeEmpresa)
	{
		this.nomeEmpresa = nomeEmpresa;
	}
	
	public String getNomeEmpresa()
	{
		return nomeEmpresa;
	}
	
	//Método Abstrato não especifica um corpo
	public abstract String gerarRecibo(String nomeCliente, double valor, String data, String motivo) {}
}
