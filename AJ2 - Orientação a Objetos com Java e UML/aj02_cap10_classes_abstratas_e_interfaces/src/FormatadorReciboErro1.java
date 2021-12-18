public class FormatadorReciboErro1 //Sem o modificador absctract na declaração da classe
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
	
	//The abstract method gerarRecibo in type FormatadorReciboErro1 can only be defined by an abstract class
	public abstract String gerarRecibo(String nomeCliente, double valor, String data, String motivo);
}
